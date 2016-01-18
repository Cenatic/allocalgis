package com.geopista.ui.plugin.routeenginetools.streetnetworkfactory;


import java.sql.Connection;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.ResourceBundle;

import javax.swing.ImageIcon;
import javax.swing.JComboBox;

import org.apache.log4j.Logger;
import org.uva.geotools.graph.build.GraphGenerator;
import org.uva.geotools.graph.structure.Graph;
import org.uva.geotools.graph.structure.basic.BasicNode;
import org.uva.graph.build.UIDgenerator.SequenceUIDGenerator;
import org.uva.route.graph.structure.dynamic.DynamicGraph;
import org.uva.route.graph.structure.impedance.EdgeImpedance;
import org.uva.route.graph.structure.impedance.SimpleImpedance;
import org.uva.route.network.Network;
import org.uva.route.network.basic.BasicNetwork;
import org.uva.routeserver.managers.AllInMemoryExternalSourceGraphMemoryManager;
import org.uva.routeserver.managers.AllInMemoryManager;
import org.uva.routeserver.street.StreetTrafficRegulation;

import com.geopista.app.AppContext;
import com.geopista.feature.GeopistaFeature;
import com.geopista.model.GeopistaLayer;
import com.geopista.ui.plugin.routeenginetools.genredplugin.GenerarRedPlugIn;
import com.geopista.ui.plugin.routeenginetools.networkfactorydialogs.StreetFeaturePropertiesDialog;
import com.geopista.ui.plugin.routeenginetools.networkfactorydialogs.StreetNetworkFactoryDialog;
import com.geopista.ui.plugin.routeenginetools.routeutil.DBRouteEngineReaderWriter;
import com.geopista.ui.plugin.routeenginetools.routeutil.PanelToLoadFromDataStore;
import com.geopista.ui.plugin.routeenginetools.routeutil.VentanaError;
import com.geopista.ui.plugin.routeenginetools.streetnetworkfactory.images.IconLoader;
import com.geopista.ui.plugin.toolboxnetwork.GeopistaNetworkEditingPlugIn;
import com.localgis.route.graph.build.dynamic.LocalGISStreetBasicLineGenerator;
import com.localgis.route.graph.build.dynamic.LocalGISStreetGraphBuilder;
import com.localgis.route.graph.io.LocalGISStreetRouteReaderWriter;
import com.localgis.route.graph.structure.basic.LocalGISStreetDynamicEdge;
import com.localgis.route.manager.LocalGISAllinMemoryManager;
import com.localgis.route.network.NetworkProperty;
import com.localgis.util.GeopistaRouteConnectionFactoryImpl;
import com.localgis.util.RouteConnectionFactory;
import com.vividsolutions.jts.geom.Geometry;
import com.vividsolutions.jts.geom.LineString;
import com.vividsolutions.jts.geom.MultiLineString;
import com.vividsolutions.jump.I18N;
import com.vividsolutions.jump.coordsys.CoordinateSystem;
import com.vividsolutions.jump.feature.Feature;
import com.vividsolutions.jump.task.TaskMonitor;
import com.vividsolutions.jump.workbench.WorkbenchContext;
import com.vividsolutions.jump.workbench.model.Layer;
import com.vividsolutions.jump.workbench.plugin.EnableCheckFactory;
import com.vividsolutions.jump.workbench.plugin.MultiEnableCheck;
import com.vividsolutions.jump.workbench.plugin.PlugInContext;
import com.vividsolutions.jump.workbench.ui.plugin.FeatureInstaller;
import com.vividsolutions.jump.workbench.ui.task.TaskMonitorDialog;
import com.vividsolutions.jump.workbench.ui.toolbox.ToolboxDialog;

public class StreetNetworkFactoryPlugIn extends GenerarRedPlugIn {

	


	private boolean genRedButtonAdded = false;
	private static AppContext aplicacion = (AppContext) AppContext.getApplicationContext();
	private PlugInContext context = null;

	private static Logger LOGGER = Logger.getLogger(StreetNetworkFactoryPlugIn.class);

	public boolean execute(PlugInContext context) throws Exception {
		if(context.getLayerViewPanel() == null)
			return false;
		this.context = context;

		StreetNetworkFactoryDialog dialog = new StreetNetworkFactoryDialog(
				context.getWorkbenchFrame(), "", context);

		basicDialog = dialog;

		super.execute(context);

		return false;

	}


	private void generarRedDeCapasSeleccionadas(GraphGenerator linegenerator, HashMap<String, Object> networkProperties) {
		final ArrayList<Object> originalFeatures = new ArrayList<Object>(
				context.getLayerViewPanel().getSelectionManager()
				.getFeaturesWithSelectedItems());
		if (originalFeatures.size() == 0) {
			VentanaError ventanaerror = new VentanaError(context);
			ventanaerror.addText(I18N.get("genred","routeengine.genred.errormessage.nonfeatureselected"));
			ventanaerror.mostrar();
		} else {

			StreetFeaturePropertiesDialog dialogo = null;
			int lastSelectedLayer = -1;
			CoordinateSystem coodSys = null;

			for (Iterator<Object> feat = originalFeatures.iterator(); feat
			.hasNext();) {
				Feature element = (Feature) feat.next();
				try {

					GeopistaLayer actualLayerWithSelectedItems = null;
					GeopistaLayer selectedLayer = null;
					/// buscamos la layer con la feature seleccionada
					Iterator<GeopistaLayer> layerIterator = context.getLayerViewPanel().getSelectionManager().getLayersWithSelectedItems().iterator();
					int idSystemLayer = -1;
					while (layerIterator.hasNext()){
						actualLayerWithSelectedItems = layerIterator.next();
						if (actualLayerWithSelectedItems.getFeatureCollectionWrapper().getFeatures().contains(element)){
							idSystemLayer = actualLayerWithSelectedItems.getId_LayerDataBase();
							selectedLayer = actualLayerWithSelectedItems;

							coodSys =selectedLayer.getLayerManager().getCoordinateSystem();
						}
					}

					if (coodSys != null){
						element.getGeometry().setSRID(coodSys.getEPSGCode());
					}

					if (idSystemLayer != lastSelectedLayer ){
						if (selectedLayer != null ){
							lastSelectedLayer = idSystemLayer;
							dialogo = new StreetFeaturePropertiesDialog(
									selectedLayer,
									"Descripcion B�scica para Capa " + selectedLayer.getName()
									, context);

							dialogo.setVisible(true);
						}
					}

					createStreetEdgeFromSelectedFeatures(element,idSystemLayer, lastSelectedLayer, 
							(LocalGISStreetBasicLineGenerator) linegenerator,  selectedLayer, 
							dialogo,  networkProperties
					);
				} catch (ClassCastException e) {
					e.printStackTrace();
				}
			}
		}
	}

	private void createStreetEdgeFromSelectedFeatures(Feature element,int idSystemLayer, int lastSelectedLayer, 
			LocalGISStreetBasicLineGenerator linegenerator, GeopistaLayer selectedLayer, 
			StreetFeaturePropertiesDialog dialogo, HashMap<String, Object> networkProperties
	){
		
		
		CoordinateSystem coordSys =context.getLayerManager().getCoordinateSystem();				
		if (coordSys != null){
			element.getGeometry().setSRID(coordSys.getEPSGCode());
		} else{
			element.getGeometry().setSRID(23030);
		}

		int featureID = -1;
		try{
			if (element instanceof GeopistaFeature){
				featureID = Integer.parseInt(((GeopistaFeature)element).getSystemId());
			} else{
				featureID = element.getID();
			}
		} catch (NumberFormatException e) {
			// TODO: handle exception
			LOGGER.error(e);
			featureID = -1;
		}

		LocalGISStreetDynamicEdge streetEdge;
		try {
			streetEdge = (LocalGISStreetDynamicEdge) ((LocalGISStreetBasicLineGenerator) linegenerator).add(
					element.getGeometry(),
					featureID, 
					idSystemLayer,
					element.getGeometry().getSRID()
			);


			streetEdge.setTrafficRegulation(
					(StreetTrafficRegulation) 
					dialogo.getSentidoCirculacionComboBox().getSelectedItem()
			);
			if (streetEdge != null){
				if (dialogo.wasOKPressed()){

					if (dialogo.getDescriptionComboBox().getSelectedIndex() > 0){
						NetworkProperty networkColumnDescProperties = new NetworkProperty();
						networkColumnDescProperties.setNetworkManagerProperty(
								Integer.toString(selectedLayer.getId_LayerDataBase()), 
								dialogo.getDescriptionComboBox().getSelectedItem().toString()
						);
						networkProperties.put("ColumnDescriptor", networkColumnDescProperties);
					}

					if (dialogo.getTipoCallejeroComboBox().getSelectedIndex() > 0){
						NetworkProperty networkColumnDescProperties = new NetworkProperty();
						networkColumnDescProperties.setNetworkManagerProperty(
								Integer.toString(selectedLayer.getId_LayerDataBase()), 
								dialogo.getTipoCallejeroComboBox().getSelectedItem().toString()
						);
						networkProperties.put("TypeColumnDescriptor", networkColumnDescProperties);
					}

					if (dialogo.getVelocidadViaComboBox().getSelectedItem().equals("50 Km/h")){
						streetEdge.setNominalMaxSpeed(50.0 * 1000.0 / 3600.0);
					} else{
						streetEdge.setNominalMaxSpeed(Double.parseDouble(element.getAttribute(
								(dialogo).getVelocidadViaComboBox().getSelectedItem().toString()).toString()
						));
					}


					if (dialogo.getBidirectionRadioButton().isSelected()){

						streetEdge.setImpedanceAToB(createNewLocalGisSimpleimpedance(element.getGeometry(), 
								dialogo.getImpedanciaAB(),
								element));
						streetEdge.setImpedanceBToA(createNewLocalGisSimpleimpedance(element.getGeometry(), 
								dialogo.getImpedanciaBA(), 
								element));

					} else if (dialogo.getUniqueDirectionAtoBRadioButton().isSelected()){

						streetEdge.setImpedanceAToB(createNewLocalGisSimpleimpedance(element.getGeometry(), 
								dialogo.getImpedanciaAB(),
								element));

					} else if (dialogo.getUniqueDirectionBtoARadioButton().isSelected()){

						streetEdge.setImpedanceBToA(createNewLocalGisSimpleimpedance(element.getGeometry(), 
								dialogo.getImpedanciaBA(), 
								element));

					} 

				} else {
					streetEdge.setImpedanceBidirecccional(element.getGeometry().getLength());
					streetEdge.setNominalMaxSpeed(50.0 * 1000.0 / 3600.0);
				}
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	/**
	 * @param context
	 * @param linegenerator
	 * @param networkProperties
	 */
	private void generarRedDeUnaCapa(PlugInContext context, GraphGenerator linegenerator, HashMap<String, Object> networkProperties) {

		String nombrecapa = null;
		Object object = basicDialog.getLayerComboBox().getSelectedItem();

		if (object != null){
			if (object instanceof GeopistaLayer){
				nombrecapa = ((GeopistaLayer)object).getSystemId();
			}
			else if (object instanceof Layer){
				nombrecapa = ((Layer)object).getName();
			}
			else{
				nombrecapa =  basicDialog.getLayerComboBox().getSelectedItem().toString();
			}
			// el nombre de la capa seleccionada
			// Calculo el grafo de la capa seleccionada


			final ArrayList<Object> originalFeatures = new ArrayList<Object>(
					context.getLayerManager().getLayer(nombrecapa)
					.getFeatureCollectionWrapper().getWrappee()
					.getFeatures());

			CoordinateSystem coodSys = context.getLayerManager().getLayer(nombrecapa).getLayerManager().getCoordinateSystem();

			for (Iterator<Object> feat = originalFeatures.iterator(); feat
			.hasNext();) {

				Feature element = (Feature) feat.next();
				element.getGeometry().setSRID(coodSys.getEPSGCode());

				try {

					this.createNewLocalGisStreetDinamycEdges(
							(LocalGISStreetBasicLineGenerator) linegenerator, 
							((GeopistaLayer)object).getId_LayerDataBase(), 
							element, 
							element.getGeometry());

				} catch (ClassCastException e) {
					e.printStackTrace();
				}

			}

			if (basicDialog.getDescriptionComboBox().getSelectedIndex() > 0){
				NetworkProperty networkColumnDescProperties = new NetworkProperty();
				networkColumnDescProperties.setNetworkManagerProperty(
						Integer.toString(((GeopistaLayer)object).getId_LayerDataBase()), 
						basicDialog.getDescriptionComboBox().getSelectedItem().toString()
				);
				networkProperties.put("ColumnDescriptor", networkColumnDescProperties);
			}

			if (((StreetNetworkFactoryDialog)basicDialog).getTipoCallejeroComboBox().getSelectedIndex() >= 0){
				NetworkProperty networkTypeColumnDescProperties = new NetworkProperty();
				networkTypeColumnDescProperties.setNetworkManagerProperty(
						Integer.toString(((GeopistaLayer)object).getId_LayerDataBase()), 
						((StreetNetworkFactoryDialog)basicDialog).getTipoCallejeroComboBox().getSelectedItem().toString()
				);
				networkProperties.put("TypeColumnDescriptor", networkTypeColumnDescProperties);
			}


		}
	}


	/**
	 * @param lstring
	 * @param linegenerator
	 * @param object
	 * @param element
	 * @param mls
	 * @param i
	 */
	private LocalGISStreetDynamicEdge createNewLocalGisStreetDinamycEdges(
			LocalGISStreetBasicLineGenerator linegenerator, int systemIDLayer,
			Feature element, Geometry mls) {

		int featureID = -1;
		try{
			if (element instanceof GeopistaFeature){
				featureID = Integer.parseInt(((GeopistaFeature)element).getSystemId());
			} else{
				featureID = element.getID();
			}
		} catch (NumberFormatException e) {
			// TODO: handle exception
			LOGGER.error(e);
			featureID = -1;
		}

		LocalGISStreetDynamicEdge edge;
		try {
			edge = (LocalGISStreetDynamicEdge) linegenerator.add(
					mls,
					featureID, 
					systemIDLayer,
					element.getGeometry().getSRID()
			);


			if (edge != null){
				if (((StreetNetworkFactoryDialog)basicDialog).getVelocidadViaComboBox().getSelectedItem().equals("50 Km/h")){
					edge.setNominalMaxSpeed(50.0 * 1000 / 3600);
				} else{
					edge.setNominalMaxSpeed(Double.parseDouble(element.getAttribute(
							((StreetNetworkFactoryDialog)basicDialog).getVelocidadViaComboBox().getSelectedItem().toString()).toString()
					));
				}

				edge.setTrafficRegulation(
						(StreetTrafficRegulation) 
						((StreetNetworkFactoryDialog)basicDialog).getSentidoCirculacionComboBox().getSelectedItem()
				);



				this.setImpedanceToLocalGisDynamicEdge( mls, element, edge);
			}
			return edge;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return new LocalGISStreetDynamicEdge(new BasicNode(), new BasicNode(), new SequenceUIDGenerator());
		}


	}
	
	private void withTaskMonitorDo(TaskMonitorDialog monitor, PlugInContext context) throws Exception {
		// TODO Auto-generated method stub
		run(monitor, context);
	}

	private boolean setImpedanceToLocalGisDynamicEdge(Geometry mls, Feature elementFeature,
			LocalGISStreetDynamicEdge lgDynamicEdge){

		if (basicDialog.getBidirectionRadioButton().isSelected()){

			lgDynamicEdge.setImpedanceAToB(createNewLocalGisSimpleimpedance(mls, 
					basicDialog.getImpedanciaAB(),
					elementFeature));
			lgDynamicEdge.setImpedanceBToA(createNewLocalGisSimpleimpedance(mls, 
					basicDialog.getImpedanciaBA(), 
					elementFeature));

		} else if (basicDialog.getUniqueDirectionAtoBRadioButton().isSelected()){

			lgDynamicEdge.setImpedanceAToB(createNewLocalGisSimpleimpedance(mls, 
					basicDialog.getImpedanciaAB(),
					elementFeature));

		} else if (basicDialog.getUniqueDirectionBtoARadioButton().isSelected()){

			lgDynamicEdge.setImpedanceBToA(createNewLocalGisSimpleimpedance(mls, 
					basicDialog.getImpedanciaBA(), 
					elementFeature));

		} else{
			return false;
		}

		return true;
	}


	/**
	 * @param mls
	 * @param e
	 * @param element 
	 */
	private EdgeImpedance createNewLocalGisSimpleimpedance(Geometry mls,
			JComboBox impedanceComboBox, Feature elementFeature) {

		double cost = 0;

		if (impedanceComboBox.getSelectedIndex() >= 0){
			if (impedanceComboBox.getSelectedItem().equals("Longitud")){
				if (mls instanceof LineString){
					cost = mls.getLength();
				} 
				else if (mls instanceof MultiLineString){
					for (int i = 0; i < mls.getNumGeometries(); i++) {
						cost = cost + mls.getGeometryN(i).getLength();
					}
				}
			} else {
				if (elementFeature != null){
					cost = 	Double.parseDouble(
							(String)elementFeature.getAttribute(
									(String) impedanceComboBox.getSelectedItem()
							)
					);
				}
			}
		}

		return new SimpleImpedance(cost);
	}

	/**
	 * @param context
	 * @param nombrered
	 * @param linegenerator
	 * @param networkProperties 
	 */
	//	private void networksLayerGeneratorFromGraph(PlugInContext context,
	//			String nombrered, Graph graph, HashMap<String, Object> networkProperties) {
	//	
	//
	//		// guardo la red y su grafo
	//		NetworkManager networkMgr = FuncionesAuxiliares
	//		.getNetworkManager(context);
	//
	//		if (networkMgr.getNetwork(nombrered) == null) {
	//
	//			Layer zona = creaCapaParticiones(networkMgr, nombrered, graph,
	//					context, networkProperties);
	//			LabelStyle labelStyle = new LabelStyle();
	//			labelStyle.setAttribute("nombreSubred");
	//			labelStyle.setColor(Color.black);
	//			labelStyle.setScaling(false);
	//			labelStyle.setEnabled(true);
	//			zona.addStyle(labelStyle);
	//
	//		} else {
	//			VentanaError ventanaerror = new VentanaError(context);
	//			ventanaerror.addText(I18N.get("genred","routeengine.genred.errormessage.usedname"));
	//			ventanaerror.addText(I18N.get("genred","routeengine.genred.errormessage.overwritename"));
	//			ventanaerror.mostrar();
	//			if (ventanaerror.OK()) {
	//				Layer zona = creaCapaParticiones(networkMgr, nombrered,
	//						graph, context, networkProperties);
	//				LabelStyle labelStyle = new LabelStyle();
	//				labelStyle.setAttribute("nombreSubred");
	//				labelStyle.setColor(Color.black);
	//				labelStyle.setScaling(false);
	//				labelStyle.setEnabled(true);
	//				zona.addStyle(labelStyle);
	//
	//			}
	//
	//		}
	//	}

	private ArrayList<Feature> getOriginalFeatures (String nombreCapa){
		ArrayList<Feature> result = null;

		if (nombreCapa == null || nombreCapa.equals("")){
			result = (ArrayList<Feature>) context.getLayerViewPanel().getSelectionManager()
			.getFeaturesWithSelectedItems();
		}else{
			result = (ArrayList<Feature>) context.getLayerManager().getLayer(nombreCapa).getFeatureCollectionWrapper()
			.getWrappee().getFeatures();
		}

		return result;

	}

	public void initialize(PlugInContext context) throws Exception {

		Locale loc=I18N.getLocaleAsObject();    
		ResourceBundle bundle = ResourceBundle.getBundle("com.geopista.ui.plugin.routeenginetools.genredplugin.language.RouteEngine_GenRedi18n",loc,this.getClass().getClassLoader());
		I18N.plugInsResourceBundle.put("genred",bundle);

		GeopistaNetworkEditingPlugIn geopistaNetworkEditingPlugIn = (GeopistaNetworkEditingPlugIn) (context.getWorkbenchContext().getBlackboard().get(GeopistaNetworkEditingPlugIn.KEY));
		geopistaNetworkEditingPlugIn.addAditionalPlugIn(this);
	}

	public static MultiEnableCheck createEnableCheck(
			WorkbenchContext workbenchContext) {
		EnableCheckFactory checkFactory = new EnableCheckFactory(
				workbenchContext);
		return new MultiEnableCheck()
		.add(
				checkFactory
				.createWindowWithLayerManagerMustBeActiveCheck())
				.add(
						checkFactory
						.createWindowWithAssociatedTaskFrameMustBeActiveCheck())
						.add(checkFactory.createTaskWindowMustBeActiveCheck()).add(
								checkFactory.createAtLeastNLayersMustExistCheck(1));
	}


	//	public FeatureCollection convexHull(FeatureCollection hullFC, Graph g,
	//			PlugInContext context, int i, List<Geometry> hullList,
	//			String nombrered) {
	//		FeatureCollection nodesFeatureCol = AddNewLayerPlugIn
	//		.createBlankFeatureCollection();
	//		GeometryFactory fact = new GeometryFactory();
	//		for (Iterator<Node> iter_nodes = (Iterator<Node>) g.getNodes()
	//				.iterator(); iter_nodes.hasNext();) {
	//			Node node = (Node) iter_nodes.next();
	//			//			Coordinate coord = ((MiOptXYNode) node).getCoordinate();
	//			Coordinate coord = ((DynamicGeographicNode) node).getCoordinate();
	//			Point geom_nodes = fact.createPoint(coord);
	//			Feature featurenodes = new BasicFeature(nodesFeatureCol
	//					.getFeatureSchema());
	//			featurenodes.setGeometry(geom_nodes);
	//			nodesFeatureCol.add(featurenodes);
	//
	//		}
	//		int size = nodesFeatureCol.size();
	//		if (size == 0) {
	//			VentanaError error = new VentanaError(context);
	//			error.addText(I18N.get("genred","routeengine.genred.errormessage.emptynodes"));
	//			error.mostrar();
	//		} else {
	//			int count = 0;
	//			Geometry[] geoms = new Geometry[size];
	//
	//			for (Iterator<Object> iternodesCol = nodesFeatureCol.iterator(); iternodesCol
	//			.hasNext();) {
	//				Feature f = (Feature) iternodesCol.next();
	//				Geometry geom = f.getGeometry();
	//				if (geom == null)
	//					continue;
	//				if (fact == null)
	//					fact = geom.getFactory();
	//
	//				geoms[count++] = geom;
	//			}
	//			GeometryCollection gc = fact.createGeometryCollection(geoms);
	//			Geometry hull = gc.convexHull();
	//
	//			hullList.add(hull);
	//			Feature particion = new BasicFeature(hullFC.getFeatureSchema());
	//			particion.setGeometry(hull);
	//
	//			particion.setAttribute("ID_particion", new Integer(i));
	//			particion.setAttribute("nombreSubred", "Sub" + nombrered + i);
	//			hullFC.add(particion);
	//
	//		}// fin else
	//		return hullFC;
	//	}

	//	public Layer creaCapaParticiones(NetworkManager networkMgr,
	//			String nombrered, Graph graph, PlugInContext context, HashMap<String, Object> networkProperties) {
	//		/* TODO 
	//		 * hacer cambios de basicInternetWorker a null cuando obtienes FuncionesAuxiliares.getNetworManager()
	//		 */
	//		if (((BasicNetworkManager)networkMgr).getInterNetworker() == null ){
	//			BasicInterNetworker binNet = new BasicInterNetworker();
	//			binNet.setNetworkManager(networkMgr);
	//			networkMgr.setInterNetworker(binNet);
	//		}
	//
	//		Network parent = networkMgr.putNetwork(nombrered, graph);
	//
	//
	//		for (int i = 0; i < networkProperties.keySet().size(); i++){
	//			String key = (String) networkProperties.keySet().toArray()[i];
	//			NetworkProperty value = (NetworkProperty) networkProperties.get(key);
	//			parent.getProperties().put(key, value);
	//		}
	//
	//
	//
	//		// Cargo las propiedades de la red.
	//
	//		// Consigo saber el numero de redes existentes
	//
	//		GraphPartitioner part = new GraphPartitioner(graph);
	//		// obtengo las particiones del grafo
	//		part.partition();
	//		// hace la partici�n
	//
	//		Collection<Object> partitions = part.getPartitions();
	//		// meto las partisans en una lista
	//		int num_subredes = partitions.size();
	//		// numero de particiones (lo mismo que numero de subredes)
	//
	//		// obtengo los grafos independientes
	//		Graph[] gr = new Graph[num_subredes];
	//
	//		int i = 0;
	//
	//		List<Geometry> hullList = new ArrayList<Geometry>();
	//		FeatureCollection hullFC = FeatureDatasetFactory.createFromGeometry(hullList);
	//
	//		hullFC.getFeatureSchema().addAttribute("ID_particion",
	//				AttributeType.INTEGER);
	//		hullFC.getFeatureSchema().addAttribute("nombreSubred",
	//				AttributeType.STRING);
	//
	//		// obtengo los edges y nodes del grafo y los meto en una colecci�n
	//		for (Iterator<Object> partitionIter = ((Collection<Object>) partitions)
	//				.iterator(); partitionIter.hasNext();) {
	//
	//			gr[i] = (Graph) partitionIter.next();
	//
	//			String subNetworkName = I18N.get("genred","routeengine.genred.subnetworklayername")+ nombrered + i;
	//
	//			BasicNetwork subNet = new BasicNetwork(subNetworkName);
	//			subNet.setGraph(gr[i]);
	//
	//
	//			((BasicNetworkManager)networkMgr).putSubNetwork(parent, 
	//					subNetworkName, gr[i]);
	//			// Consigo la capa nodos y aristas.
	//
	//			// a�ado
	//
	//
	//			hullFC = convexHull(hullFC, gr[i], context, i, hullList, nombrered);
	//
	//			i++; // incrementa el indice para guardar las particiones
	//
	//		}// fin partitionIter
	//		Layer zona = context.addLayer(
	//				I18N.get("genred","routeengine.genred.categorylayername"),
	//				I18N.get("genred","routeengine.genred.partitionlayername")
	//				+ nombrered,
	//				hullFC);
	//		return zona;
	//	}


	public ImageIcon getIcon() {
		return IconLoader.icon(I18N.get("genred","routeengine.genred.iconfile"));
	}

	public void addButton(final ToolboxDialog toolbox)
	{
		if (!genRedButtonAdded  )
		{
//			toolbox.addToolBar();
			StreetNetworkFactoryPlugIn explode = new StreetNetworkFactoryPlugIn();                 
			toolbox.addPlugIn(explode, null, explode.getIcon());
			toolbox.finishAddingComponents();
			toolbox.validate();
			genRedButtonAdded = true;
		}
	}


	public void run(TaskMonitor monitor, PlugInContext context)
	throws Exception {

		String nombrered = basicDialog.getNombreRedTextField().getText();

		GraphGenerator linegenerator = null;
		LocalGISStreetGraphBuilder builder = new LocalGISStreetGraphBuilder();
        SequenceUIDGenerator ids = new SequenceUIDGenerator();
        ids.setSeq(AppContext.getIdEntidad()*100000);
		builder.setUidGenerator(ids);
		linegenerator = new LocalGISStreetBasicLineGenerator(builder);
		Network subnet = new BasicNetwork(nombrered);
		Graph graph = null;
		LineString lstring = null;
		HashMap<String, Object> networkProperties = new HashMap<String, Object>();

		// si se seleccionan un conjunto de features
		if ( basicDialog.getFeatureRadioButton().isSelected() == true) {
			// Creo el grafo de la red seleccionada
			generarRedDeCapasSeleccionadas(linegenerator, networkProperties);
		}
		// si se eligen todas las features de la capa
		else if (basicDialog.getLayerRadioButton().isSelected() == true) {
			generarRedDeUnaCapa(context, linegenerator, networkProperties);
		}

		RouteConnectionFactory routeConnection = new GeopistaRouteConnectionFactoryImpl();
		LocalGISStreetRouteReaderWriter	db = new LocalGISStreetRouteReaderWriter(routeConnection); 
		db.setNetworkName(nombrered);
		
//		AllInMemoryManager memmgr = new AllInMemoryManager();
		//		memmgr.setGraph(linegenerator.getGraph());
		DynamicGraph dynamicGraph = new DynamicGraph(new LocalGISAllinMemoryManager(db));
		dynamicGraph.getMemoryManager().appendGraph(linegenerator.getGraph());

		networksLayerGeneratorFromGraph(context, nombrered, dynamicGraph, networkProperties);
		
		basicDialog.dispose();
	}


}