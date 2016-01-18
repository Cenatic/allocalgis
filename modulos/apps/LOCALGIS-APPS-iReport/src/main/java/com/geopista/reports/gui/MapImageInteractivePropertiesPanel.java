/**
 * MapImageInteractivePropertiesPanel.java
 * � MINETUR, Government of Spain
 * This program is part of LocalGIS
 * This program is free software: you can redistribute it and/or modify it under the terms of the GNU General Public License as published by the Free Software Foundation, either version 2 of the License, or (at your option) any later version.
 * This program is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU General Public License for more details.
 * You should have received a copy of the GNU General Public License along with this program. If not, see <http://www.gnu.org/licenses/>.
 */
/*
 * MapImageInteractivePropertiesPanel.java
 *
 * Created on 3 de enero de 2008, 14:04
 */

package com.geopista.reports.gui;

import it.businesslogic.ireport.JRParameter;

import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.security.SecureRandom;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;

import com.geopista.app.reports.ReportsManager;
import com.geopista.app.reports.maps.MapImageConstants;
import com.geopista.app.reports.maps.MapImageExpressionManager;
import com.geopista.app.reports.maps.MapImageSettings;
import com.geopista.app.reports.maps.vo.SelectedColumnVO;
import com.geopista.app.reports.maps.vo.SelectedLayerVO;
import com.geopista.app.reports.maps.vo.SelectedMapVO;
import com.geopista.reports.parameters.IReportParameterManager;

/**
 * IMPORTANTE: La clase Java ya no esta sincronizada con el fichero .form asociado.
 * @author  jpolo
 */
public class MapImageInteractivePropertiesPanel extends javax.swing.JPanel {
	
	// Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAddMapSelectionId;
    private javax.swing.JButton jButtonAddScale;
	private javax.swing.JComboBox jComboBoxScale;
	private javax.swing.JComboBox jComboBoxScaleType;
    private javax.swing.JComboBox jComboBoxSelectionIdParameter;
	private javax.swing.JLabel jLabelScale;
	private javax.swing.JLabel jLabelSelectionId;
	private javax.swing.JLabel jLabelMapaSeleccionado;
    private javax.swing.JComboBox jComboBoxMapaSeleccionado;
	private javax.swing.JLabel jLabelCapaSeleccionada;
    private javax.swing.JComboBox jComboBoxCapaSeleccionada;
	private javax.swing.JLabel jLabelColumnaSeleccionada;
    private javax.swing.JComboBox jComboBoxColumnaSeleccionada;
    
	private javax.swing.JLabel jLabelCapasImprimir;
    private javax.swing.JList jListBoxCapasImprimir;
    private static SelectedLayerVO capaPrevia;


	// End of variables declaration//GEN-END:variables
	
	private MapImageReportElement mapImageReportElement;
	private MapImageSettings mapImageSettings;
	
    private MapParameterDialog mapParameterDialog = new MapParameterDialog();    
    private MapScaleDialog mapScaleDialog = new MapScaleDialog();    

	private static final Pattern userDefinedScalePattern = Pattern.compile("([0-9])*:([0-9])*");

	private boolean updatingUI = false;

	private MapImagePropertiesPanel mapImagePropertiesPanel;

	/** Creates new form MapImageInteractivePropertiesPanel */
	public MapImageInteractivePropertiesPanel(MapImagePropertiesPanel mapImagePropertiesPanel) {
		mapImageSettings = new MapImageSettings();
		this.mapImagePropertiesPanel = mapImagePropertiesPanel;
		initComponents();
	}

	/** This method is called from within the constructor to
	 * initialize the form.
	 * WARNING: Do NOT modify this code. The content of this method is
	 * always regenerated by the Form Editor.
	 */
	// <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
	private void initComponents() {
		java.awt.GridBagConstraints gridBagConstraints;

		jLabelSelectionId = new javax.swing.JLabel();
		jComboBoxSelectionIdParameter = new javax.swing.JComboBox();
		jLabelScale = new javax.swing.JLabel();
		jComboBoxScaleType = new javax.swing.JComboBox();
		jComboBoxScale = new javax.swing.JComboBox();
        jButtonAddMapSelectionId = new javax.swing.JButton();
        jButtonAddScale = new javax.swing.JButton();
        jLabelMapaSeleccionado = new javax.swing.JLabel(); 
        jComboBoxMapaSeleccionado = new javax.swing.JComboBox();
        jLabelCapaSeleccionada = new javax.swing.JLabel(); 
        jComboBoxCapaSeleccionada = new javax.swing.JComboBox();
        jLabelColumnaSeleccionada = new javax.swing.JLabel(); 
        jComboBoxColumnaSeleccionada = new javax.swing.JComboBox();
        
        //YR--
        
        jLabelCapasImprimir = new javax.swing.JLabel(); 
        DefaultListModel listModel = new DefaultListModel();  
        jListBoxCapasImprimir = new javax.swing.JList(listModel);
        
        //--
		setLayout(new java.awt.GridBagLayout());

		jLabelSelectionId.setText("Nombre del par�metro identificador");
		gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
		gridBagConstraints.gridwidth = 3;
		gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
		gridBagConstraints.insets = new java.awt.Insets(5, 5, 0, 5);
		add(jLabelSelectionId, gridBagConstraints);

		jComboBoxSelectionIdParameter.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
		jComboBoxSelectionIdParameter.setPreferredSize(new java.awt.Dimension(100, 22));
		jComboBoxSelectionIdParameter.addItemListener(new java.awt.event.ItemListener() {
			public void itemStateChanged(java.awt.event.ItemEvent evt) {
				jComboBoxSelectionIdParameterItemStateChanged(evt);
			}
		});
		gridBagConstraints = new java.awt.GridBagConstraints();
		gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.weightx = 100.0;
        gridBagConstraints.fill = GridBagConstraints.HORIZONTAL;
		gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
		gridBagConstraints.insets = new java.awt.Insets(5, 5, 0, 0);
		add(jComboBoxSelectionIdParameter, gridBagConstraints);

		jButtonAddMapSelectionId.setText("+");
		jButtonAddMapSelectionId.addActionListener(new java.awt.event.ActionListener() {
		    public void actionPerformed(java.awt.event.ActionEvent evt) {
		        jButtonAddMapSelectionIdActionPerformed(evt);
		    }
		});
		gridBagConstraints = new java.awt.GridBagConstraints();
		gridBagConstraints.gridx = 2;
		gridBagConstraints.gridy = 1;
		gridBagConstraints.insets = new java.awt.Insets(5, 5, 0, 5);
		add(jButtonAddMapSelectionId, gridBagConstraints);

        jLabelMapaSeleccionado.setText("Seleccione un mapa");
		gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
		gridBagConstraints.gridwidth = 3;
		gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
		gridBagConstraints.insets = new java.awt.Insets(5, 5, 0, 5);
		add(jLabelMapaSeleccionado, gridBagConstraints);
		
		jComboBoxMapaSeleccionado.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
            	jComboBoxMapaSeleccionadoItemStateChanged(evt);
            }
        });

		gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.weightx = 100.0;
        gridBagConstraints.fill = GridBagConstraints.HORIZONTAL;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 0, 5);
        add(jComboBoxMapaSeleccionado, gridBagConstraints);

        jLabelCapaSeleccionada.setText("Seleccione capa");
		gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
		gridBagConstraints.gridwidth = 3;
		gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
		gridBagConstraints.insets = new java.awt.Insets(5, 5, 0, 5);
		add(jLabelCapaSeleccionada, gridBagConstraints);
		
		jComboBoxCapaSeleccionada.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
            	jComboBoxCapaSeleccionadaItemStateChanged(evt);
            }
        });
		
		gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.weightx = 100.0;
        gridBagConstraints.fill = GridBagConstraints.HORIZONTAL;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 0, 5);
        add(jComboBoxCapaSeleccionada, gridBagConstraints);

        jLabelColumnaSeleccionada.setText("Seleccione atributo identificador de la capa");
		gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 6;
		gridBagConstraints.gridwidth = 3;
		gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
		gridBagConstraints.insets = new java.awt.Insets(5, 5, 0, 5);
		add(jLabelColumnaSeleccionada, gridBagConstraints);

		jComboBoxColumnaSeleccionada.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
            	jComboBoxColumnaSeleccionadaItemStateChanged(evt);
            }
        });

		gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.weightx = 100.0;
        gridBagConstraints.fill = GridBagConstraints.HORIZONTAL;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 0, 5);
        add(jComboBoxColumnaSeleccionada, gridBagConstraints);

        
        //YR:----
        
        jLabelCapasImprimir.setText("Capas a visualizar");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 0, 5);
        jLabelCapasImprimir.setEnabled(false);
        add(jLabelCapasImprimir, gridBagConstraints);

        MouseListener mouseListener = new MouseAdapter() {
            public void mouseClicked(MouseEvent mouseEvent) {
            	 mapImagePropertiesPanel.markUnsavedChanges();
			     readFormData();
             
            }
          };
        jListBoxCapasImprimir.addMouseListener(mouseListener);
        
        /*jListBoxCapasImprimir.addListSelectionListener(new ListSelectionListener() {
			public void valueChanged(ListSelectionEvent e) {
				 mapImagePropertiesPanel.markUnsavedChanges();
			     readFormData();
			}
        });*/
        
        
        jListBoxCapasImprimir.setEnabled(false);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 9;
        gridBagConstraints.weightx = 100.0;        
        gridBagConstraints.fill = GridBagConstraints.HORIZONTAL;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 0, 5);
        
        JScrollPane acrossScrollBar= new JScrollPane();
        
        acrossScrollBar.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        acrossScrollBar.validate(); jListBoxCapasImprimir.validate();
        acrossScrollBar.setPreferredSize(new Dimension(3,60));
        acrossScrollBar.setViewportView(jListBoxCapasImprimir);
        add(acrossScrollBar,gridBagConstraints);
        
        
        //----

        
		jLabelScale.setText("Escala");
		gridBagConstraints = new java.awt.GridBagConstraints();
		gridBagConstraints.gridx = 0;
		gridBagConstraints.gridy = 10;
		gridBagConstraints.gridwidth = 3;
		gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
		gridBagConstraints.insets = new java.awt.Insets(5, 5, 0, 5);
		add(jLabelScale, gridBagConstraints);

		jComboBoxScaleType.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Manual", "Autom�tica", "Predefinida" }));
		jComboBoxScaleType.addItemListener(new java.awt.event.ItemListener() {
			public void itemStateChanged(java.awt.event.ItemEvent evt) {
				jComboBoxScaleTypeItemStateChanged(evt);
			}
		});
		gridBagConstraints = new java.awt.GridBagConstraints();
		gridBagConstraints.gridx = 0;
		gridBagConstraints.gridy = 11;
		gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
		gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 0);
		add(jComboBoxScaleType, gridBagConstraints);
		
		jComboBoxScale.setEditable(false);
		jComboBoxScale.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1:100", "1:200", "1:500", "1:1000" }));
		jComboBoxScale.addItemListener(new java.awt.event.ItemListener() {
			public void itemStateChanged(java.awt.event.ItemEvent evt) {
				jComboBoxScaleItemStateChanged(evt);
			}
		});
		gridBagConstraints = new java.awt.GridBagConstraints();
		gridBagConstraints.gridx = 1;
		gridBagConstraints.gridy = 11;
        gridBagConstraints.weightx = 100.0;
        gridBagConstraints.fill = GridBagConstraints.HORIZONTAL;
		gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 0);
		add(jComboBoxScale, gridBagConstraints);

        jButtonAddScale.setText("+");
		jButtonAddScale.addActionListener(new java.awt.event.ActionListener() {
		    public void actionPerformed(java.awt.event.ActionEvent evt) {
		        jButtonAddScaleActionPerformed(evt);
		    }
		});
		gridBagConstraints = new java.awt.GridBagConstraints();
		gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 11;
		gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
		add(jButtonAddScale, gridBagConstraints);
		
	}// </editor-fold>//GEN-END:initComponents

    private void jComboBoxMapaSeleccionadoItemStateChanged(java.awt.event.ItemEvent evt) {                                                               
        if (updatingUI){
            return;
        }

        SelectedMapVO mapaSeleccionado = (SelectedMapVO) jComboBoxMapaSeleccionado.getSelectedItem();
        if (mapaSeleccionado != null) {
        	//YR--
        	((DefaultListModel)jListBoxCapasImprimir.getModel()).removeAllElements();
        	jListBoxCapasImprimir.setSelectedIndex(-1);	

        	loadAvailableCapas(mapaSeleccionado.getIdMap());
        }

        mapImagePropertiesPanel.markUnsavedChanges();

        readFormData();
    }  
	
    private void jComboBoxCapaSeleccionadaItemStateChanged(java.awt.event.ItemEvent evt) {
        if (updatingUI){
            return;
        }

        //YR--
        
        capaPrevia = (SelectedLayerVO)evt.getItem();
        int[] indicesSeleccionadosPrevio = jListBoxCapasImprimir.getSelectedIndices();
        String layers = mapImageSettings.getLayers();
        
        //--
        
        SelectedLayerVO capaSeleccionada = (SelectedLayerVO) jComboBoxCapaSeleccionada.getSelectedItem();
        if (capaSeleccionada != null) {
        	loadAvailableColumnas(capaSeleccionada.getIdCapa());
        }

        //YR--
        int[] indicesSeleccionados=new int[((DefaultListModel)jListBoxCapasImprimir.getModel()).size()];
    	int contadorIndices=0;
    	for (int i=0; i < ((DefaultListModel)jListBoxCapasImprimir.getModel()).size(); i++) {
        	 SelectedLayerVO capaSeleccionadaImprimir = (SelectedLayerVO)jListBoxCapasImprimir.getModel().getElementAt(i);
        	 if (capaSeleccionadaImprimir.getNombre().equals(capaSeleccionada.getNombre())){
        		 //jListBoxCapasImprimir.setSelectedIndex(i);
        		 indicesSeleccionados[contadorIndices++]=i;
        	 }	     
        	 else if (capaSeleccionadaImprimir.getNombre().equals(capaPrevia.getNombre())){
        		 indicesSeleccionados[contadorIndices++]=-1;
        	 }
        	 else if (layers.contains(capaSeleccionadaImprimir.getNombre())){
        		 indicesSeleccionados[contadorIndices++]=i;
        	 }
        	 else 
        		 indicesSeleccionados[contadorIndices++]=-1;
    	}
    	jListBoxCapasImprimir.removeSelectionInterval(0, ((DefaultListModel)jListBoxCapasImprimir.getModel()).size());
    	jListBoxCapasImprimir.setSelectedIndices(indicesSeleccionados);

        //--
        
        mapImagePropertiesPanel.markUnsavedChanges();

        readFormData();
    }

    private void jComboBoxColumnaSeleccionadaItemStateChanged(java.awt.event.ItemEvent evt) {
        if (updatingUI){
            return;
        }

        mapImagePropertiesPanel.markUnsavedChanges();

        readFormData();
    }

    private void jButtonAddMapSelectionIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAddMapSelectionIdMouseClicked
		mapParameterDialog.setVisible(true);
		refreshItemList();
		
		readFormData();
	}//GEN-LAST:event_jButtonAddMapSelectionIdMouseClicked

	private void jButtonAddScaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAddMapSelectionIdMouseClicked
	    mapScaleDialog.setVisible(true);
	    
        String scale = mapScaleDialog.getScale();
        if (!scale.equals("")) {
            mapScaleDialog.setScale("");
            // obtenemos el indice seleccionado
            int selectedIndexOld = jComboBoxScale.getSelectedIndex();
            // Intentamos seleccionar la escala introducida para evitar incluir escalas repetidas
            jComboBoxScale.setSelectedItem(scale);
            // Si ha cambiado el indice seleccionado no hay que insertar el elemento, en otro caso se inserta
            int selectedIndexNew = jComboBoxScale.getSelectedIndex();
            if (selectedIndexNew == selectedIndexOld) {
                jComboBoxScale.addItem(scale);
                jComboBoxScale.setSelectedItem(scale);
            }
        }
	}
   
	private void jComboBoxSelectionIdParameterItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBoxSelectionIdParameterItemStateChanged
		if (updatingUI){
			return;
		}
		
		mapImagePropertiesPanel.markUnsavedChanges();

		readFormData();
	}//GEN-LAST:event_jComboBoxSelectionIdParameterItemStateChanged

	private void jComboBoxScaleTypeItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBoxScaleTypeItemStateChanged
		String scale = (String) jComboBoxScaleType.getSelectedItem();
		if (scale.equals(MapImageConstants.SCALE_TYPE_INTERACTIVE) ||
				scale.equals(MapImageConstants.SCALE_TYPE_AUTOMATIC)){
            jComboBoxScale.setEnabled(false);
            jButtonAddScale.setEnabled(false);
		}
		else {
			jComboBoxScale.setEnabled(true);
            jButtonAddScale.setEnabled(true);
		}
		
		if (updatingUI){			
			return;
		}
		
		mapImagePropertiesPanel.markUnsavedChanges();

		readFormData();
	}//GEN-LAST:event_jComboBoxScaleTypeItemStateChanged

	private void jComboBoxScaleItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBoxScaleItemStateChanged
		if (updatingUI){
			return;
		}
		
		mapImagePropertiesPanel.markUnsavedChanges();

		readFormData();
	}//GEN-LAST:event_jComboBoxScaleItemStateChanged

	private void refreshItemList(){
		updatingUI = true;

		JRParameter currentSelectedParameter =
			(JRParameter) jComboBoxSelectionIdParameter.getSelectedItem();

		loadAvailableMapIdParameters();

		if (currentSelectedParameter != null){
			jComboBoxSelectionIdParameter.setSelectedItem(currentSelectedParameter);
			if (jComboBoxSelectionIdParameter.getSelectedItem() == null){
				if (jComboBoxSelectionIdParameter.getItemCount() > 0){
					jComboBoxSelectionIdParameter.setSelectedIndex(0);
				}
			}
		}
		else {			
			jComboBoxSelectionIdParameter.setSelectedIndex(0);
		}

		updatingUI = false;
	}

	private void loadAvailableMapIdParameters() {
		Vector availableMapIdParameters = IReportParameterManager.getAvailableMapIdParameters();

		jComboBoxSelectionIdParameter.removeAllItems();

		int numberOfMapIdParameters = availableMapIdParameters.size();
		for (int i = 0; i < numberOfMapIdParameters; i++) {
			JRParameter parameter = (JRParameter) availableMapIdParameters.get(i);
			jComboBoxSelectionIdParameter.addItem(parameter);
		}
	}

	private boolean validateFormData(){
		if (jComboBoxSelectionIdParameter.getSelectedIndex() == -1){
			return false;
		}
		if (jComboBoxScaleType.equals(MapImageConstants.SCALE_TYPE_USER_DEFINED)
				&& !isValidUserDefinedScale((String) jComboBoxScale.getSelectedItem())){
			return false;
		}		
		
		return true;
	}

	private String getScale(){
		String scaleType = (String) jComboBoxScaleType.getSelectedItem();
		String scale = null;

		if (scaleType.equals(MapImageConstants.SCALE_TYPE_AUTOMATIC) ||
				scaleType.equals(MapImageConstants.SCALE_TYPE_INTERACTIVE)) {
			scale = scaleType;
		} else {
			scale = (String) jComboBoxScale.getSelectedItem();
			Matcher scaleMatcher = userDefinedScalePattern.matcher(scale);
			if (!scaleMatcher.matches()) {
				scale = MapImageConstants.SCALE_TYPE_AUTOMATIC;
			}
		}

		return scale;
	}
	
	private boolean isValidUserDefinedScale(String scale){
		if (scale == null){
			return false;
		}
		
		Matcher scaleMatcher = userDefinedScalePattern.matcher(scale);
		if (!scaleMatcher.matches()){
			return false;
		}
		
		return true;
	}
	
	private void readMapImageSettings(){
		String expression = mapImageReportElement.getImageExpression();
		
		if (expression != null && MapImageExpressionManager.isInteractiveMapImageExpression(expression)){
			
			
			mapImageSettings = MapImageExpressionManager.parseExpression(expression);
			
			mapImageSettings.setWidth(mapImageReportElement.getWidth());
			mapImageSettings.setHeight(mapImageReportElement.getHeight());
			
			if (mapImageSettings.getMapSelectionIdName() != null){
				Vector availableMapIdParameters = IReportParameterManager.getAvailableMapIdParameters();
				boolean found = false;
				for (int i = 0; i < availableMapIdParameters.size(); i++){
					JRParameter parameter = (JRParameter) availableMapIdParameters.get(i);
					if (parameter.getName().equals(mapImageSettings.getMapSelectionIdName())){
						found = true;
					}
				}			
				if (!found){
					mapImageSettings.setMapSelectionIdName(
							((JRParameter) availableMapIdParameters.get(0)).getName());
				}
			}
		}
		else {
			mapImageSettings.setScale(MapImageSettings.DEFAULT_SCALE);		
			mapImageSettings.setImageKey(mapImageReportElement.getKey());
			mapImageSettings.setMapSelectionIdName(null);
			mapImageSettings.setMapSelectionIdType(MapImageConstants.MAP_SELECTION_ID_TYPE_PARAMETER);
			mapImageSettings.setMapSelectionType(MapImageConstants.MAP_SELECTION_TYPE_INTERACTIVE);
			
			SecureRandom random = new SecureRandom();
			String id =String.valueOf(random.nextLong());	
			mapImageSettings.setIdUnicoImagen(id);
			mapImageSettings.setWidth(mapImageReportElement.getWidth());
			mapImageSettings.setHeight(mapImageReportElement.getHeight());
		}
		
		return;
	}
	
	private void writeMapImageSettings(){		
		String expression = MapImageExpressionManager.getExpression(mapImageSettings);

		mapImageReportElement.setImageExpression(expression);
		mapImageReportElement.setImageClass(MapImageConstants.MAP_IMAGE_CLASS_NAME);
	}
	
	private void showMapImageSettings (){	
		updatingUI = true;
		
		try{
		
		String scale = mapImageSettings.getScale();
		String mapSelectionIdName = mapImageSettings.getMapSelectionIdName();
		int mapaId = mapImageSettings.getMapId();
		
		loadAvailableMapIdParameters();
		loadAvailableMapaSeleccionado();
		if (mapSelectionIdName == null){
			jComboBoxSelectionIdParameter.setSelectedIndex(-1);
		}
		else {			
			int numberOfParameters = jComboBoxSelectionIdParameter.getItemCount();
			jComboBoxSelectionIdParameter.setSelectedIndex(-1);
			for (int i = 0; i < numberOfParameters; i++){
				JRParameter parameter = (JRParameter) jComboBoxSelectionIdParameter.getItemAt(i);
				if (parameter.getName().equals(mapSelectionIdName)){
					jComboBoxSelectionIdParameter.setSelectedIndex(i);					
					break;
				}
			}			
		}

		if (scale.equals(MapImageConstants.SCALE_TYPE_AUTOMATIC) || scale.equals(MapImageConstants.SCALE_TYPE_INTERACTIVE)) {
			jComboBoxScaleType.setSelectedItem(scale);		
            jComboBoxScale.setEnabled(false);
            jButtonAddScale.setEnabled(false);
		} else {
			jComboBoxScaleType.setSelectedItem(MapImageConstants.SCALE_TYPE_USER_DEFINED);
			jComboBoxScale.setEnabled(true);
            jButtonAddScale.setEnabled(true);
			int currentScaleIndex = jComboBoxScale.getSelectedIndex();
			jComboBoxScale.setSelectedItem(scale);
			if (jComboBoxScale.getSelectedIndex() == -1) {
				jComboBoxScale.addItem(scale);
				jComboBoxScale.setSelectedItem(scale);
			} else if (currentScaleIndex == jComboBoxScale.getSelectedIndex() &&
					!((String) jComboBoxScale.getSelectedItem()).equals(scale)) {
				jComboBoxScale.addItem(scale);
				jComboBoxScale.setSelectedItem(scale);
			}
		}
		
        int numeroDeMapas = jComboBoxMapaSeleccionado.getItemCount();

        for (int i = 0; i < numeroDeMapas; i++){
        	SelectedMapVO mapaSeleccionado = (SelectedMapVO) jComboBoxMapaSeleccionado.getItemAt(i);
            if (mapaSeleccionado.getIdMap() == mapaId) {
            	jComboBoxMapaSeleccionado.setSelectedIndex(i);
            	break;
            }
        }   

        SelectedMapVO mapaSeleccionado = (SelectedMapVO) jComboBoxMapaSeleccionado.getSelectedItem();
        if (mapaSeleccionado != null) {
        	loadAvailableCapas(mapaSeleccionado.getIdMap());
        }

        for (int i = 0; i < jComboBoxCapaSeleccionada.getItemCount(); i++) {
        	SelectedLayerVO capaSeleccionada = (SelectedLayerVO) jComboBoxCapaSeleccionada.getItemAt(i);
            if (capaSeleccionada.getNombre().equals(mapImageSettings.getCapa())) {
            	jComboBoxCapaSeleccionada.setSelectedIndex(i);
            	break;
            }
        }   
		
        SelectedLayerVO capaSeleccionada = (SelectedLayerVO) jComboBoxCapaSeleccionada.getSelectedItem();
        if (capaSeleccionada != null) {
        	loadAvailableColumnas(capaSeleccionada.getIdCapa());
        }

        for (int i = 0; i < jComboBoxColumnaSeleccionada.getItemCount(); i++) {
        	SelectedColumnVO columnaSeleccionada = (SelectedColumnVO) jComboBoxColumnaSeleccionada.getItemAt(i);
            if (columnaSeleccionada.getNombre().equals(mapImageSettings.getColumna())) {
            	jComboBoxColumnaSeleccionada.setSelectedIndex(i);
            	break;
            }
        }   
        
        //YR--

        String layers = mapImageSettings.getLayers();
        
        if (mapSelectionIdName!=null){
        	jListBoxCapasImprimir.setEnabled(true);
        }
      
        if (layers!=null){
        	int[] indicesSeleccionados=new int[((DefaultListModel)jListBoxCapasImprimir.getModel()).size()];
         	int contadorIndices=0;
        	DefaultListModel model=(DefaultListModel)jListBoxCapasImprimir.getModel();
        	for (int i=0;i<model.size();i++){	      
        		SelectedLayerVO elem=(SelectedLayerVO)model.getElementAt(i);
                if (mapImageSettings.getLayers().contains(elem.getNombre())){
                	indicesSeleccionados[contadorIndices++]=i;	                	
                }
                else{
                	indicesSeleccionados[contadorIndices++]=-1;
                }
                
        	}
        	jListBoxCapasImprimir.removeSelectionInterval(0, ((DefaultListModel)jListBoxCapasImprimir.getModel()).size());
        	jListBoxCapasImprimir.setSelectedIndices(indicesSeleccionados);
        }
        else{
        	
        }

	} catch (Exception e) {			
		e.printStackTrace();
	}
        
        //--
        updatingUI = false;
	}
	
	private void loadAvailableMapaSeleccionado() {
        jComboBoxMapaSeleccionado.removeAllItems();

        List mapasSeleccionados = ReportsManager.getInstance().getMapasPrivadosPublicados();
        if (mapasSeleccionados.isEmpty()) {
        	JOptionPane.showMessageDialog(this, "Debe existir al menos un mapa privado publicado", "", JOptionPane.WARNING_MESSAGE);
        }
        else {
        	Iterator it = mapasSeleccionados.iterator();
        	while (it.hasNext()) {
        		SelectedMapVO elem = (SelectedMapVO) it.next();
        		jComboBoxMapaSeleccionado.addItem(elem);
        	}
        }
    }

//	private void loadAvailableCapas(int idMapa) {
//        jComboBoxCapaSeleccionada.removeAllItems();
//
//        List capasSeleccionadas = ReportsManager.getInstance().getCapasMapa(idMapa);
//        Iterator it = capasSeleccionadas.iterator();
//        while (it.hasNext()) {
//            SelectedLayerVO elem = (SelectedLayerVO) it.next();
//            jComboBoxCapaSeleccionada.addItem(elem);
//        }
//    }

	private void loadAvailableCapas(int idMapa) {
        jComboBoxCapaSeleccionada.removeAllItems();

        List capasSeleccionadas = ReportsManager.getInstance().getCapasMapa(idMapa);
        Iterator it = capasSeleccionadas.iterator();
        ((DefaultListModel)jListBoxCapasImprimir.getModel()).removeAllElements();
        jListBoxCapasImprimir.setEnabled(true);
        boolean elementos=false;
        
        while (it.hasNext()) {
        	elementos=true;
        	SelectedLayerVO elem = (SelectedLayerVO) it.next();
            jComboBoxCapaSeleccionada.addItem(elem);
            ((DefaultListModel)jListBoxCapasImprimir.getModel()).addElement(elem);                        
        }
        
        if (elementos){
        	SelectedLayerVO lcg_pnoa = new SelectedLayerVO("lcg_pnoa","lcg_pnoa");
        	((DefaultListModel)jListBoxCapasImprimir.getModel()).add(0,lcg_pnoa);    

        	SelectedLayerVO lcg_point_reports = new SelectedLayerVO("lcg_point_reports","lcg_point_reports");
        	((DefaultListModel)jListBoxCapasImprimir.getModel()).add(1,lcg_point_reports);    
        	
        	SelectedLayerVO lcg_line_reports = new SelectedLayerVO("lcg_line_reports","lcg_line_reports");
        	((DefaultListModel)jListBoxCapasImprimir.getModel()).add(1,lcg_line_reports);    
        	
        	SelectedLayerVO lcg_polygon_reports = new SelectedLayerVO("lcg_polygon_reports","lcg_polygon_reports");
        	((DefaultListModel)jListBoxCapasImprimir.getModel()).add(1,lcg_polygon_reports);  
        	
        	SelectedLayerVO capaSeleccionada=(SelectedLayerVO)jComboBoxCapaSeleccionada.getSelectedItem();
        	
        	//Activamos solo la seleccionada y como mucho la del pnoa
        	//El usuario posteriormente podr�a a�adir mas.
        	int[] indicesSeleccionados=new int[((DefaultListModel)jListBoxCapasImprimir.getModel()).size()];
        	int contadorIndices=0;
        	for (int i=0; i < ((DefaultListModel)jListBoxCapasImprimir.getModel()).size(); i++) {
	        	 SelectedLayerVO capaSeleccionadaImprimir = (SelectedLayerVO)jListBoxCapasImprimir.getModel().getElementAt(i);
	        	 if (capaSeleccionadaImprimir.getNombre().equals(capaSeleccionada.getNombre())){
	        		 //jListBoxCapasImprimir.setSelectedIndex(i);
	        		 indicesSeleccionados[contadorIndices++]=i;;
	        	 }	     
	        	 else if (capaSeleccionadaImprimir.getNombre().equals("lcg_pnoa")){
	        		 //jListBoxCapasImprimir.setSelectedIndex(i);
	        		 indicesSeleccionados[contadorIndices++]=i;;
	        	 }
	        	 else 
	        		 indicesSeleccionados[contadorIndices++]=-1;
        	}

        	jListBoxCapasImprimir.removeSelectionInterval(0, ((DefaultListModel)jListBoxCapasImprimir.getModel()).size());
        	jListBoxCapasImprimir.setSelectedIndices(indicesSeleccionados);
        	//jListBoxCapasImprimir.getSelectionModel().setSelectionInterval(0, ((DefaultListModel)jListBoxCapasImprimir.getModel()).size());
        }
        
    }	
	
	private void loadAvailableColumnas(int idCapa) {
        jComboBoxColumnaSeleccionada.removeAllItems();

        List columnasSeleccionadas = ReportsManager.getInstance().getColumnasCapa(idCapa);
        Iterator it = columnasSeleccionadas.iterator();
        while (it.hasNext()) {
            SelectedColumnVO elem = (SelectedColumnVO) it.next();
            jComboBoxColumnaSeleccionada.addItem(elem);
        }
    }

	private void readFormData(){
		String scale = getScale();
		JRParameter mapIdParameter = (JRParameter) jComboBoxSelectionIdParameter.getSelectedItem();
		
		// Solo actualizamos las cosas cuando se haya seleccionado algun idParametro
		if (mapIdParameter != null) {
		    mapImageSettings.setScale(scale);
		    mapImageSettings.setMapSelectionIdName(mapIdParameter.getName());
		}
		
	    SelectedMapVO mapaSeleccionado = (SelectedMapVO)jComboBoxMapaSeleccionado.getSelectedItem();
        if (mapaSeleccionado != null){
            mapImageSettings.setMapId(mapaSeleccionado.getIdMap());
        }
        
	    SelectedLayerVO capaSeleccionada = (SelectedLayerVO)jComboBoxCapaSeleccionada.getSelectedItem();
        if (capaSeleccionada != null){
            mapImageSettings.setCapa(capaSeleccionada.getNombre());
        }

	    SelectedColumnVO columnaSeleccionada = (SelectedColumnVO) jComboBoxColumnaSeleccionada.getSelectedItem();
        if (columnaSeleccionada != null){
        	mapImageSettings.setAtributo(columnaSeleccionada.getAtributo());
            mapImageSettings.setColumna(columnaSeleccionada.getNombre());
            mapImageSettings.setTabla(columnaSeleccionada.getNombreTabla());
        }
        
        
        //YR--
        //Seleccion de capas a pintar.        
        int selected[] = jListBoxCapasImprimir.getSelectedIndices( );

        String capasAImprimir="";
        if (jListBoxCapasImprimir.getSelectedIndex()!=-1){
	        for (int i=0; i < selected.length; i++) {
	        	if (i<jListBoxCapasImprimir.getModel().getSize()){
		        	 SelectedLayerVO capaSeleccionadaImprimir = (SelectedLayerVO)jListBoxCapasImprimir.getModel().getElementAt(selected[i]);
		             if (capaSeleccionadaImprimir != null){
		            	 capasAImprimir+=capaSeleccionadaImprimir.getNombre()+";";
		             }
	        	}
	        }
        }
        if (capasAImprimir.equals(""))
        	mapImageSettings.setLayers(null);
        else{
        	capasAImprimir=capasAImprimir.substring(0,capasAImprimir.length()-1);
        	mapImageSettings.setLayers(capasAImprimir);
        }        
        //--

        if (mapIdParameter!=null && mapaSeleccionado!=null && capaSeleccionada!=null && columnaSeleccionada!=null){
            writeMapImageSettings();
        }
	}

	public void setMapImageReportElement(MapImageReportElement mapImageReportElement) {
		this.mapImageReportElement = mapImageReportElement;
		
		readMapImageSettings();
		writeMapImageSettings();		
		showMapImageSettings();
	}

	public boolean validateFields() {
		Object o = jComboBoxSelectionIdParameter.getSelectedItem();
		if (o != null && o instanceof JRParameter) {
			JRParameter p = (JRParameter) o;
			if (p==null || p.getName()==null || p.getName().trim().equals("")) {
				JOptionPane.showMessageDialog(this, "Debe establecer un nombre para el identificador", "", JOptionPane.ERROR_MESSAGE);
				return false;
			}
		}
		return true;
	}
}
