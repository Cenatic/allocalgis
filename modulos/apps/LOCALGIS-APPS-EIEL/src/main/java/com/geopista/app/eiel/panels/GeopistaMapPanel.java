/**
 * GeopistaMapPanel.java
 * � MINETUR, Government of Spain
 * This program is part of LocalGIS
 * This program is free software: you can redistribute it and/or modify it under the terms of the GNU General Public License as published by the Free Software Foundation, either version 2 of the License, or (at your option) any later version.
 * This program is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU General Public License for more details.
 * You should have received a copy of the GNU General Public License along with this program. If not, see <http://www.gnu.org/licenses/>.
 */
package com.geopista.app.eiel.panels;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;
import java.util.ResourceBundle;

import javax.swing.BorderFactory;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;

import com.geopista.app.AppContext;
import com.geopista.app.eiel.utils.LocalGISEIELUtils;
import com.geopista.editor.GeopistaEditor;
import com.geopista.model.GeopistaListener;
import com.geopista.ui.cursortool.GeopistaMeasureTool;
import com.geopista.ui.cursortool.GeopistaSelectFeaturesTool;
import com.vividsolutions.jump.I18N;
import com.vividsolutions.jump.workbench.model.FeatureEvent;
import com.vividsolutions.jump.workbench.ui.GUIUtil;
import com.vividsolutions.jump.workbench.ui.IAbstractSelection;
import com.vividsolutions.jump.workbench.ui.task.TaskMonitorDialog;
import com.vividsolutions.jump.workbench.ui.zoom.PanToolNew;
import com.vividsolutions.jump.workbench.ui.zoom.ZoomTool;

public class GeopistaMapPanel extends JPanel {

	private static final long serialVersionUID = 1L;

	public GeopistaEditor geopistaEditor=null;  

	public boolean insertarCapasGeopista=true;

	public String textoAscTemp=null;
	
	private ArrayList actionListeners= new ArrayList();
	
	private String fileProperties = "workbench-properties-eiel.xml";
	
	private int idMap = 0;

	public GeopistaMapPanel()
	{
		super(new GridLayout(1,0));

		Locale loc=I18N.getLocaleAsObject(); 
		ResourceBundle bundle = ResourceBundle.getBundle("com.geopista.app.eiel.language.LocalGISEIELi18n",loc,this.getClass().getClassLoader());
		I18N.plugInsResourceBundle.put("LocalGISEIEL",bundle);    

		initialize();        
	}    
	
	public GeopistaMapPanel(String fileProperties, int idMap){
		

		super(new GridLayout(1,0));
		this.fileProperties = fileProperties;
		this.idMap = idMap;

		Locale loc=I18N.getLocaleAsObject(); 
		ResourceBundle bundle = ResourceBundle.getBundle("com.geopista.app.eiel.language.LocalGISEIELi18n",loc,this.getClass().getClassLoader());
		I18N.plugInsResourceBundle.put("LocalGISEIEL",bundle);    

		initialize();      
		
		
	}
	
	public void removeEditor(){
		this.geopistaEditor = null;
	}
	
	public void createEditor(){

			initialize();
		
	}


	public GeopistaEditor getEditor(){

		return geopistaEditor;
	}

	private void initialize() {

			this.setLayout(new GridBagLayout());

			//Para cargar un mapa por ejemplo tematico entra por aqui
			geopistaEditor = new GeopistaEditor(fileProperties);
			geopistaEditor.getToolBar().addCursorTool("Select tool", new GeopistaSelectFeaturesTool());
			geopistaEditor.getToolBar().addCursorTool("Zoom In/Out", new ZoomTool());
			geopistaEditor.getToolBar().addCursorTool("Measure", new GeopistaMeasureTool());
			geopistaEditor.getToolBar().addCursorTool("Pan", new PanToolNew());

			geopistaEditor.setVisible(true);
			geopistaEditor.showLayerName(true);

			this.setBorder(BorderFactory.createTitledBorder
					(null, I18N.get("LocalGISEIEL", "localgiseiel.editor.panel.graphiceditor.title"),
							TitledBorder.LEADING, TitledBorder.TOP, new java.awt.Font(null, java.awt.Font.BOLD, 13)));

			this.add(geopistaEditor, new GridBagConstraints(0, 0, 1, 1, 1, 1, 
					GridBagConstraints.CENTER,GridBagConstraints.BOTH, 
					new Insets (0,10,5,10), 0,0));
			
			
			geopistaEditor.addGeopistaListener(new GeopistaListener() {
	            public void selectionChanged(IAbstractSelection abtractSelection) {
	                fireActionPerformed();
	            }
	            public void featureAdded(FeatureEvent e) {
	            }
	            public void featureRemoved(FeatureEvent e) {
	            }
	            public void featureModified(FeatureEvent e) {
	            }
	            public void featureActioned(IAbstractSelection abtractSelection) {
	                fireActionPerformed();
	            }
	        });

	}	
	
	private void fireActionPerformed() {
        for (Iterator i = actionListeners.iterator(); i.hasNext();) {
            ActionListener l = (ActionListener) i.next();
            l.actionPerformed(new ActionEvent(this, 0, null));
        }
    }
	
	public void addActionListener(ActionListener l) {
        this.actionListeners.add(l);
    }

    public void removeActionListener(ActionListener l) {
        this.actionListeners.remove(l);
    }
    
    public void changeSelection(){
    	fireActionPerformed();
    }
	
	 public void initEditor() {

	    	final TaskMonitorDialog progressDialog = new TaskMonitorDialog(AppContext.getApplicationContext().getMainFrame(), null);
	    	progressDialog.setTitle("TaskMonitorDialog.Wait");
	    	progressDialog.report(I18N.get("LocalGISEIEL","localgiseiel.editorimportador.panel.LoadingEditor"));
	    	progressDialog.addComponentListener(new ComponentAdapter()
	    	{
	    		public void componentShown(ComponentEvent e)
	    		{   
	    			new Thread(new Runnable()
	    			{
	    				public void run()
	    				{
	    					try
	    					{   
	    						progressDialog.report(I18N.get("LocalGISEIEL","localgiseiel.editorimportador.panel.LoadingEditor"));

	    						try {

	    							progressDialog.report(I18N.get("LocalGISEIEL",
	    							"localgiseiel.editorimportador.panel.LoadingEditor"));

	    							if (!LocalGISEIELUtils.showMap(AppContext.getApplicationContext().getMainFrame(), geopistaEditor, idMap, false, null, null))
	    							{
	    								new JOptionPane(I18N.get("LocalGISEIEL",
	    								"localgiseiel.editorimportador.panel.ErrorLoadingMap")+"\n"+I18N.get("LocalGISEIEL",
	    	    								"localgiseiel.editorimportador.panel.ErrorLoadingMap3"),
	    								JOptionPane.ERROR_MESSAGE).createDialog(GeopistaMapPanel.this, "ERROR").show();
	    							}

	    						} catch (Exception e) {

	    							e.printStackTrace();
	    						}

	    					} 
	    					catch (Exception e)
	    					{
	    						e.printStackTrace();
	    					} 
	    					finally
	    					{
	    						progressDialog.setVisible(false);
	    					}
	    				}
	    			}).start();
	    		}
	    	});
	    	GUIUtil.centreOnWindow(progressDialog);
	    	progressDialog.setVisible(true);
	    }
	    
	
}
