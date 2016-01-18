package com.geopista.ui.plugin.routeenginetools.trafficregulationplugin;

import java.awt.Graphics2D;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.swing.ImageIcon;

import org.uva.geotools.graph.structure.Edge;
import org.uva.route.graph.structure.dynamic.DynamicGraph;
import org.uva.route.network.Network;
import org.uva.route.network.NetworkManager;
import org.uva.routeserver.managers.SpatialAllInMemoryExternalSourceMemoryManager;
import org.uva.routeserver.street.StreetTrafficRegulation;

import com.geopista.app.AppContext;
import com.geopista.feature.GeopistaFeature;
import com.geopista.ui.plugin.routeenginetools.routeutil.FuncionesAuxiliares;
import com.geopista.ui.plugin.routeenginetools.routeutil.routelabelstyle.RouteArrowLineStyle;
import com.geopista.ui.plugin.routeenginetools.trafficregulationplugin.images.IconLoader;
import com.geopista.ui.plugin.toolboxnetwork.GeopistaNetworkEditingPlugIn;
import com.localgis.route.graph.io.LocalGISNetworkDAO;
import com.localgis.route.graph.structure.basic.LocalGISStreetDynamicEdge;
import com.localgis.util.ConnectionUtilities;
import com.localgis.util.GeopistaRouteConnectionFactoryImpl;
import com.localgis.util.RouteConnectionFactory;
import com.vividsolutions.jts.geom.LineString;
import com.vividsolutions.jump.I18N;
import com.vividsolutions.jump.task.TaskMonitor;
import com.vividsolutions.jump.workbench.model.Category;
import com.vividsolutions.jump.workbench.plugin.PlugInContext;
import com.vividsolutions.jump.workbench.ui.GUIUtil;
import com.vividsolutions.jump.workbench.ui.plugin.FeatureInstaller;
import com.vividsolutions.jump.workbench.ui.task.TaskMonitorDialog;
import com.vividsolutions.jump.workbench.ui.toolbox.ToolboxDialog;

public class TrafficRegulationBidirectionalPlugIn extends TrafficRegulationEditPlugIn{

	private boolean trafficBidirectionalModifierButtonAdded = false;
	private static AppContext aplication = (AppContext) AppContext.getApplicationContext();
	private PlugInContext context = null;


	public boolean execute(PlugInContext context) throws Exception {
		this.context = context;
		return super.execute(context);	

	}



	@Override
	public void initialize(PlugInContext context) throws Exception {
		super.initialize(context);

		GeopistaNetworkEditingPlugIn geopistaNetworkEditingPlugIn = (GeopistaNetworkEditingPlugIn) (context.getWorkbenchContext().getBlackboard().get(GeopistaNetworkEditingPlugIn.KEY));
		geopistaNetworkEditingPlugIn.addAditionalPlugIn(this);

	}

	@Override
	public ImageIcon getIcon() {
		return IconLoader.icon(I18N.get("regulacionTrafico","routeengine.trafficregulation.bidirecticonfile"));
	}

	@Override
	public void addButton(final ToolboxDialog toolbox)
	{
		if (!trafficBidirectionalModifierButtonAdded  )
		{
			//			toolbox.addToolBar();
			TrafficRegulationBidirectionalPlugIn explode = new TrafficRegulationBidirectionalPlugIn();                 
			toolbox.addPlugIn(explode, null, explode.getIcon());
			toolbox.finishAddingComponents();
			toolbox.validate();
			trafficBidirectionalModifierButtonAdded = true;
		}
	}

	public void run(TaskMonitor monitor, PlugInContext context)
	throws Exception {
		
		this.setMonitor(monitor);
		this.getMonitor().report(I18N.get("regulacionTrafico","routeengine.trafficregulation.savingdatainfomessage"));

		// Manejar el trafficRegulation
		this.setTrafficRegualtion(StreetTrafficRegulation.BIDIRECTIONAL);

		saveTrafficRegulationInformation(context, monitor);

	}

	/**
	 * @param context
	 * @throws IOException
	 */
	private void saveTrafficRegulationInformation(PlugInContext context, TaskMonitor monitor) throws IOException {

		String netName="";
		if(getSelectedLayer().getSystemId().startsWith("Arcos-")){
			String[] a = getSelectedLayer().getSystemId().split("-");
			netName = a[1];
			System.out.println(a.length);
			for (int i=2; i < a.length; i++){
				netName = netName + "-" + a[i];
			}
		} else{
			netName = getSelectedLayer().getSystemId();
		}

		ArrayList<GeopistaFeature> 	listaFeatures = this.getSelectedsArrayListStreetFeature();
		ArrayList<Integer> 			listaEdgeIds = this.getSelectedsArrayListEdgesIds();
		
		for (int i=0; i < listaFeatures.size(); i++){
			
			monitor.report("Modificando direcci�n tramo " + i + " de " + listaEdgeIds.size());
			
			Edge selectedEdge = searchEdgeByIdAndNetworkName(context, netName, listaEdgeIds.get(i));
			
			if (selectedEdge instanceof LocalGISStreetDynamicEdge){
				//Se actualiza el StreetEdge
				((LocalGISStreetDynamicEdge)selectedEdge).setTrafficRegulation(
						getTrafficRegualtion());

				RouteArrowLineStyle line = new RouteArrowLineStyle.BiDirect(
						context.getLayerViewPanel().getViewport(),
						(Graphics2D) context.getLayerViewPanel().getGraphics());
				if (this.getSelectedLayer().getStyle(RouteArrowLineStyle.class) != null){
					getSelectedLayer().removeStyle(getSelectedLayer().getStyle(RouteArrowLineStyle.class));
				}
				getSelectedLayer().addStyle(line);

				

				GeopistaFeature feat = listaFeatures.get(i);
				
				
				if ( feat != null){
					// se actualiza el valor de la feature
					feat.setAttribute(I18N.get("regulacionTrafico","routeengine.trafficregulation.trafficregulationattributename"), getTrafficRegualtion().toString());
//					this.paintBidirectTrafiicRegulation(getTrafficRegualtion());
					
					if (feat.getSchema().hasAttribute("pintadaRegulacionTrafico") && 
							feat.getAttribute("pintadaRegulacionTrafico") != null &&
							feat.getAttribute("pintadaRegulacionTrafico") instanceof Integer){
						try{
							feat.setAttribute("pintadaRegulacionTrafico", 1);
						}catch (Exception e) {
						}
					}
				}
				
				context.getLayerViewPanel().repaint();
			}
			NetworkManager nManager = FuncionesAuxiliares.getNetworkManager(context);
			Network actualNetwork = nManager.getNetwork(netName);
			
			// intentamos inserci�n en la base de datos de la velocidad de la v�a
			Category categoryLayer = context.getLayerManager().getCategory(getSelectedLayer());
			if (!categoryLayer.getName().equals("")){
				if(actualNetwork.getGraph() instanceof DynamicGraph && ((DynamicGraph)actualNetwork.getGraph()).getMemoryManager() instanceof SpatialAllInMemoryExternalSourceMemoryManager){
						RouteConnectionFactory routeConnection = new GeopistaRouteConnectionFactoryImpl();
						LocalGISNetworkDAO lnDAO = new LocalGISNetworkDAO();
						Connection connection = null;
						try{
							connection = routeConnection.getConnection();
							lnDAO.updateStreetData(netName, (LocalGISStreetDynamicEdge)selectedEdge, connection);
						} catch (SQLException e) {
							e.printStackTrace();
						} catch (Exception e) {
							e.printStackTrace();
						}finally{
							ConnectionUtilities.closeConnection(connection);
						}
					}
			}
			
		}
		

		
	}
	

}
