/**
 * HandleWMSTemplatesPlugin.java
 * � MINETUR, Government of Spain
 * This program is part of LocalGIS
 * This program is free software: you can redistribute it and/or modify it under the terms of the GNU General Public License as published by the Free Software Foundation, either version 2 of the License, or (at your option) any later version.
 * This program is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU General Public License for more details.
 * You should have received a copy of the GNU General Public License along with this program. If not, see <http://www.gnu.org/licenses/>.
 */
package com.vividsolutions.jump.workbench.ui.plugin.wms.templates;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.util.LinkedList;
import java.util.List;

import com.geopista.app.AppContext;
import com.geopista.server.administradorCartografia.AdministradorCartografiaClient;
import com.geopista.util.GeopistaFunctionUtils;
import com.vividsolutions.jump.I18N;
import com.vividsolutions.jump.util.StringUtil;
import com.vividsolutions.jump.workbench.plugin.AbstractPlugIn;
import com.vividsolutions.jump.workbench.plugin.PlugInContext;
import com.vividsolutions.jump.workbench.ui.MenuNames;
import com.vividsolutions.jump.workbench.ui.plugin.FeatureInstaller;

/**
 * Plugin que muestra la opci�n de men� "Gestionar Plantillas WMS...", el cual aparece cuando
 * se pulsa con el bot�n derecho sobre el panel de capas de un mapa en el Editor GIS.
 * @author Silvia Garc�a
 */
public class HandleWMSTemplatesPlugin extends AbstractPlugIn {
	private static AppContext aplicacion = (AppContext) AppContext.getApplicationContext();
	
	/**Inicializa el plugin
	 */
	 public void initialize(PlugInContext context) throws Exception {

		    FeatureInstaller featureInstaller = new FeatureInstaller(context.getWorkbenchContext());

		    featureInstaller.addPopupMenuItem(context.getWorkbenchContext().getIWorkbench()
		                                                        .getGuiComponent()
		                                                        .getCategoryPopupMenu(),
		          this, StringUtil.insertSpaces(I18N.get(this.getName())) + "...", false,
		          null, null);

		   featureInstaller.addLayerViewMenuItem(this,  
		   		new String[]{MenuNames.LAYER,
		  				"ImageCoverage"}, 
							I18N.get(this.getName()));            
		  }//fin del m�todo initialize
	 
	 	 
	 
	 
	    /**Retorna el nombre de la opci�n de men� que nos mostrar� el plugin
	     */
	    public String getName() {
	    	return GeopistaFunctionUtils.i18n_getname("HandleWMSTemplatesPlugin.name");
	    }//fin m�todo getName
	    
	    
	    
	    /**M�todo que se ejecuta cuando seleccionamos la opci�n de men� "Gestionar Plantillas WMS...".
		    */
		    public boolean execute(PlugInContext context)throws Exception {
		            
		    	//Si el usuario a�n no se ha logueado, deberemos pedirle que lo haga, ya que 
		    	//nos disponemos a acceder a la BD.
		    		reportNothingToUndoYet(context);	            
		            if (!aplicacion.isLogged()){
		                aplicacion.setProfile("Geopista");
		                aplicacion.login();
		            }
		            
		            //obtenemos la lista de plantillas almacenadas en la base de datos y mostramos el panel de gesti�n de las mismas
		            String sUrlPrefix = aplicacion.getString("geopista.conexion.servidor");
		            AdministradorCartografiaClient administradorCartografiaClient = new AdministradorCartografiaClient(
		                    sUrlPrefix + "AdministradorCartografiaServlet");
		            List wmsTemplates=administradorCartografiaClient.getWMSTemplateList();
		            HandleTemplatesFrame frame=new HandleTemplatesFrame((LinkedList) wmsTemplates);
		            Toolkit tk = Toolkit.getDefaultToolkit();
		            Dimension screenSize = tk.getScreenSize();
		            int screenHeight = screenSize.height;
		            int screenWidth = screenSize.width;
		            frame.setLocation((screenSize.width/2 -
		                    frame.getWidth()) / 2,
		                    (screenSize.height/2 - frame.getHeight()) / 2);
		            frame.pack();
		            frame.setVisible(true);

		            
		            //todo ha ido correctamente, devolvemos true
		            return true;
		    }//fin m�todo execute
		    
	    
	   

}//fin de la clase
