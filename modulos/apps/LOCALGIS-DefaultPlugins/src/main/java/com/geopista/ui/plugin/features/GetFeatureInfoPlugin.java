/**
 * GetFeatureInfoPlugin.java
 * � MINETUR, Government of Spain
 * This program is part of LocalGIS
 * This program is free software: you can redistribute it and/or modify it under the terms of the GNU General Public License as published by the Free Software Foundation, either version 2 of the License, or (at your option) any later version.
 * This program is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU General Public License for more details.
 * You should have received a copy of the GNU General Public License along with this program. If not, see <http://www.gnu.org/licenses/>.
 */
package com.geopista.ui.plugin.features;

import java.awt.Point;
import java.util.Iterator;
import java.util.List;

import javax.swing.JOptionPane;
import javax.swing.JPopupMenu;

import com.geopista.app.AppContext;
import com.geopista.ui.wms.FeatureInfoRequest;
import com.geopista.util.GeopistaFunctionUtils;
import com.vividsolutions.jts.geom.Envelope;
import com.vividsolutions.jump.workbench.WorkbenchContext;
import com.vividsolutions.jump.workbench.model.WMSLayer;
import com.vividsolutions.jump.workbench.plugin.AbstractPlugIn;
import com.vividsolutions.jump.workbench.plugin.EnableCheckFactory;
import com.vividsolutions.jump.workbench.plugin.MultiEnableCheck;
import com.vividsolutions.jump.workbench.plugin.PlugInContext;
import com.vividsolutions.jump.workbench.ui.GUIUtil;
import com.vividsolutions.jump.workbench.ui.plugin.FeatureInstaller;
import com.vividsolutions.jump.workbench.ui.task.FeatureInfoDialog;
import com.vividsolutions.jump.workbench.ui.task.FormatFeatureInfoDialog;
import com.vividsolutions.wms.BoundingBox;

/**Plugin que muestra la opci�n de men� "Ver informaci�n Entidad Seleccionada", el cual aparece cuando
 * se pulsa con el bot�n derecho sobre un mapa.
 * S�lo estar� disponible si se seleccionado una �nica entidad de una determinada capa del mapa.
 * @author sgrodriguez
 *
 */
public class GetFeatureInfoPlugin extends AbstractPlugIn{
	    private static AppContext aplicacion = (AppContext) AppContext.getApplicationContext();
	    
	    
	    
	    
	    /**M�todo que crea un objeto que sirve para habilitar y deshabilitar la opci�n de men�.
	     */
	    public static MultiEnableCheck createEnableCheck(WorkbenchContext workbenchContext) {
	        EnableCheckFactory checkFactory = new EnableCheckFactory(workbenchContext);

	        return new MultiEnableCheck()
	            .add(checkFactory.createWindowWithSelectionManagerMustBeActiveCheck())
	            .add (checkFactory.createWMSLayersMustHaveBeenRequested());

	    }//fin del m�todo createEnableCheck
	       
	    
	    
	    
	    
	    
	    /**Inicializa el plugin.
	     */
	    public void initialize(PlugInContext context) throws Exception {
	        
	        JPopupMenu popupMenu = context.getWorkbenchGuiComponent().getLayerViewPopupMenu();
	        FeatureInstaller featureInstaller = new FeatureInstaller(context.getWorkbenchContext());
	    	featureInstaller.addPopupMenuItem(popupMenu, this,
	        GeopistaFunctionUtils.i18n_getname(this.getName()), false, null,
	        GetFeatureInfoPlugin.createEnableCheck(context.getWorkbenchContext()));
	        }//fin del m�todo initialize
	    
	    
	   
	    
	    /**Retorna el nombre de la clave en el fichero de properties que se corresponde con el nombre
	     * de la opci�n de men� asciada a este plugin.
	     */
	    public String getName() {
	        return "GetFeatureInfo";
	    } //fin del m�todo getName 
	    
	    
	    
	   /**M�todo que se ejecuta cuando seleccionamos la opci�n de men� "Ver informaci�n Entidad Seleccionada".
	    */
	    public boolean execute(PlugInContext context)
        throws Exception {
	    	
	    	//Obtener las capas WMS visibles en el mapa
	    	List WMSlayers=context.getWorkbenchContext().getLayerManager().getVisibleLayerables(WMSLayer.class, true);
	    	if(WMSlayers.size()<1){
	    		  JOptionPane.showMessageDialog(aplicacion.getMainFrame(), GeopistaFunctionUtils.i18n_getname("GetFeatureInfo.noCapas"),
	    				  GeopistaFunctionUtils.i18n_getname("GetFeatureInfo.title"),
                          JOptionPane.WARNING_MESSAGE);
	    	}//fin if
	    	else if(WMSlayers.size()>1){
	    		  JOptionPane.showMessageDialog(aplicacion.getMainFrame(), GeopistaFunctionUtils.i18n_getname("GetFeatureInfo.muchasCapas"), 
	    				  GeopistaFunctionUtils.i18n_getname("GetFeatureInfo.title"),
                          JOptionPane.WARNING_MESSAGE);
	    	}//fin if
	    	
	    	else{//hay una �nica capa WMS seleccionada o visible
	    		
	    		
	    		//Realizamos la petici�n con los par�metros necesarios
	    		WMSLayer selectedLayer=(WMSLayer) WMSlayers.get(0);
	    		String format=null;
	    		
	    		//Mostramos el cuadro de di�logo para recoger el formato
	    		List formatosDisponibles= selectedLayer.getService().getCapabilities().getGetFeatureInfoFormats();
	    		if(formatosDisponibles.size()>0){
	    		FormatFeatureInfoDialog formatFeatureInfoDialog=
	    			new	FormatFeatureInfoDialog(aplicacion.getMainFrame(),formatosDisponibles);
	    		GUIUtil.centreOnWindow(formatFeatureInfoDialog);
	    		formatFeatureInfoDialog.setVisible(true);
	    		format=FormatFeatureInfoDialog.getFormat();
	    		}//fin if
	    		
	    		
	    		FeatureInfoRequest request=new FeatureInfoRequest();
	    		request.setService(selectedLayer.getService());
	    		request.setFormat(format);
	    		String layerNames="";
	    		
	    		Iterator it=selectedLayer.getLayerNames().iterator();
	    		while(it.hasNext()){
	    			String layerName=(String) it.next();
	    			layerNames+=layerName;
	    			if(it.hasNext())
	    				layerNames+=",";
	    		}//fin del while
	    		
	    		request.setWMSLayers(layerNames);
	    		
	    		//obtenemos las coordenadas del punto en el que ha pinchado el usuario
	    		           
	            Point p=   context.getLayerViewPanel().getLastClickedPoint();
	    		request.setHeight(context.getWorkbenchContext().getLayerViewPanel().getHeight());
	    		request.setWidth(context.getWorkbenchContext().getLayerViewPanel().getWidth());
	    		String SRS=selectedLayer.getSRS();
	    		BoundingBox bBox=toBoundingBox(SRS, context.getWorkbenchContext().getLayerViewPanel().getViewport()
	    				.getEnvelopeInModelCoordinates());
	    		request.setX(p.getX());
	    		request.setY(p.getY());
	    		request.setBbox(bBox);
	    		
	    		
	    		String respuesta=request.callGetFeatureInfo();
	    		//String getFeatureInfoRequest=request.getFeatureInfoRequest();
	    	
	    		
	    		boolean error=false;
	    		
	    		/**Comprobamos si se ha producido alg�n error en la petici�n
	    		 */  		 
	    		if(respuesta.contains("ServiceExceptionReport")){
	    		    error=true;
	    		    FeatureInfoDialog featureInfoDialog=new FeatureInfoDialog(aplicacion.getMainFrame(),respuesta, format);
	    		    featureInfoDialog.setTitle( GeopistaFunctionUtils.i18n_getname("GetFeatureInfo.error")); 
	    		    GUIUtil.centreOnWindow(featureInfoDialog);
		    		featureInfoDialog.setVisible(true);	
	    		}//fin if (se han producido errores)
	    		
	    		if(!error){
	    		//Creamos el cuadro de di�logo en el que mostraremos los resultados
	    		FeatureInfoDialog featureInfoDialog=new FeatureInfoDialog(
	    				aplicacion.getMainFrame(),respuesta/*getFeatureInfoRequest*/,format);
	    		featureInfoDialog.setTitle(GeopistaFunctionUtils.i18n_getname("ui.MenuNames.LAYER")+": "+selectedLayer.getName());
	    		GUIUtil.centreOnWindow(featureInfoDialog);
	    		featureInfoDialog.setVisible(true);	    		
	    	}//fin del else
	    	}//fin if
	    	return true;
	    	
    }//fin del m�todo execute
	    
	    
	    
	    
	    
	    private BoundingBox toBoundingBox(String srs, Envelope e) {
			return new BoundingBox(srs, e.getMinX(), e.getMinY(), e.getMaxX(), e
					.getMaxY());
		}
	
	
	

}//fin de la clase
