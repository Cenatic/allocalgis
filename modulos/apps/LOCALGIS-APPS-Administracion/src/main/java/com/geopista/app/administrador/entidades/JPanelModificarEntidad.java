/**
 * JPanelModificarEntidad.java
 * � MINETUR, Government of Spain
 * This program is part of LocalGIS
 * This program is free software: you can redistribute it and/or modify it under the terms of the GNU General Public License as published by the Free Software Foundation, either version 2 of the License, or (at your option) any later version.
 * This program is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU General Public License for more details.
 * You should have received a copy of the GNU General Public License along with this program. If not, see <http://www.gnu.org/licenses/>.
 */
/**
 * 
 */
package com.geopista.app.administrador.entidades;

import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Hashtable;
import java.util.ResourceBundle;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import javax.swing.border.TitledBorder;

import com.geopista.app.administrador.init.Constantes;
import com.geopista.app.utilidades.TextField;
import com.geopista.protocol.administrador.Entidad;
import com.geopista.protocol.administrador.ListaEntidades;
import com.geopista.protocol.administrador.OperacionesAdministrador;


/**
 * @author seilagamo
 *
 */
public class JPanelModificarEntidad extends JPanel {
	private static org.apache.log4j.Logger logger = org.apache.log4j.Logger.getLogger(JPanelModificarEntidad.class);
	private JLabel entidadJLabel;
    private JLabel nombreEntidadJLabel;
    private JLabel sridEntidadJLabel;
    private TextField sridEntidadJText;
    private JLabel avisoJLabel;
    private TextField avisoJText;
    private JLabel periodicidadJLabel;
    private TextField periodicidadJText;
    private JLabel intentosJLabel;
    private TextField intentosJText;
    private JLabel entidadExtJLabel;
    private TextField entidadExtJText;
    private JComboBox jComboBoxEntidades;
    private TextField nombreEntidadJText;
    private JCheckBox backupJCheckBox;
    
    private JButton modificarEntidadListaJButton;
//    private JButton cancelarModificarEntidadJButton;
    
    private ListaEntidades listaEntidades;
    
    public JPanelModificarEntidad(ResourceBundle messages, JFrame framePadre, boolean modoEdicion){
        initialize();
        changeScreenLang(messages);
        editable(false);        
    }
    
    
    private void initialize(){
        this.setPreferredSize(new Dimension(238, 270));
        this.setMaximumSize(new Dimension(238, 270));
        this.setLayout(new GridBagLayout());
        entidadJLabel = new JLabel();
        this.add(entidadJLabel, new GridBagConstraints(0, 0, 1, 1, 0.0,
                    0.0, GridBagConstraints.CENTER, GridBagConstraints.HORIZONTAL, new Insets(0, 5,
                            5, 5), 0, 0) );
        this.add(getJComboBoxEntidad(), new GridBagConstraints(1, 0, 1, 1, 0.0,
                0.0, GridBagConstraints.CENTER, GridBagConstraints.HORIZONTAL, new Insets(0, 5,
                        5, 5), 0, 0) );
        
        nombreEntidadJLabel = new JLabel();
        this.add(nombreEntidadJLabel, new GridBagConstraints(0, 1, 1, 1, 0.0,
                0.0, GridBagConstraints.CENTER, GridBagConstraints.HORIZONTAL, new Insets(0, 5,
                        5, 5), 0, 0) );
        nombreEntidadJText = new TextField(15);              
        this.add(nombreEntidadJText, new GridBagConstraints(1, 1, 1, 1, 0.0,
                0.0, GridBagConstraints.CENTER, GridBagConstraints.HORIZONTAL, new Insets(0, 5,
                        5, 5), 0, 0) );
        sridEntidadJLabel = new JLabel();
        this.add(sridEntidadJLabel, new GridBagConstraints(0, 2, 1, 1, 0.0,
                0.0, GridBagConstraints.CENTER, GridBagConstraints.HORIZONTAL, new Insets(0, 5,
                        5, 5), 0, 0) );
        sridEntidadJText = new TextField(5, true);
        
        this.add(sridEntidadJText, new GridBagConstraints(1, 2, 1, 1, 0.0,
                0.0, GridBagConstraints.CENTER, GridBagConstraints.HORIZONTAL, new Insets(0, 5,
                        5, 5), 0, 0) );
        
        avisoJLabel = new JLabel();
        avisoJText = new TextField(3, true);

        this.add(avisoJLabel, new GridBagConstraints(0, 3, 1, 1, 0.0,
                    0.0, GridBagConstraints.CENTER, GridBagConstraints.HORIZONTAL, new Insets(0, 5,
                            5, 5), 0, 0) );
        this.add(avisoJText, new GridBagConstraints(1, 3, 1, 1, 0.0,
                0.0, GridBagConstraints.CENTER, GridBagConstraints.HORIZONTAL, new Insets(0, 5,
                        5, 5), 0, 0) );
        
        periodicidadJLabel = new JLabel();
        periodicidadJText = new TextField(3, true);

        this.add(periodicidadJLabel, new GridBagConstraints(0, 4, 1, 1, 0.0,
                    0.0, GridBagConstraints.CENTER, GridBagConstraints.HORIZONTAL, new Insets(0, 5,
                            5, 5), 0, 0) );
        this.add(periodicidadJText, new GridBagConstraints(1, 4, 1, 1, 0.0,
                0.0, GridBagConstraints.CENTER, GridBagConstraints.HORIZONTAL, new Insets(0, 5,
                        5, 5), 0, 0) );
        
        intentosJLabel = new JLabel();
        intentosJText = new TextField(2, true);

        this.add(intentosJLabel, new GridBagConstraints(0, 5, 1, 1, 0.0,
                    0.0, GridBagConstraints.CENTER, GridBagConstraints.HORIZONTAL, new Insets(0, 5,
                            5, 5), 0, 0) );
        this.add(intentosJText, new GridBagConstraints(1, 5, 1, 1, 0.0,
                0.0, GridBagConstraints.CENTER, GridBagConstraints.HORIZONTAL, new Insets(0, 5,
                        5, 5), 0, 0) );
        

        entidadExtJLabel = new JLabel();
        entidadExtJText = new TextField(30, true);
        
        this.add(entidadExtJLabel, new GridBagConstraints(0, 6, 1, 1, 0.0,
                0.0, GridBagConstraints.CENTER, GridBagConstraints.HORIZONTAL, new Insets(0, 5,
                        5, 5), 0, 0) );
        this.add(entidadExtJText, new GridBagConstraints(1, 6, 1, 1, 0.0,
            0.0, GridBagConstraints.CENTER, GridBagConstraints.HORIZONTAL, new Insets(0, 5,
                    5, 5), 0, 0) );
        
        backupJCheckBox = new JCheckBox();
        this.add(backupJCheckBox, 
        		new GridBagConstraints(1, 7, 1, 1, 0.0,
                0.0, GridBagConstraints.FIRST_LINE_START, GridBagConstraints.NONE, new Insets(0, 5,
                        5, 5), 0, 0) );
        
        modificarEntidadListaJButton = new JButton();
        this.add(modificarEntidadListaJButton, 
        		new GridBagConstraints(0, 8, 2, 1, 0.0,
                0.0, GridBagConstraints.FIRST_LINE_START, GridBagConstraints.NONE, new Insets(5, 5,
                        5, 5), 0, 0) );
        
        
//        this.add(getCancelarModificarEntidadJButton(), new GridBagConstraints(1, 2, 1, 1, 0.0,
//                0.0, GridBagConstraints.LAST_LINE_START, GridBagConstraints.NONE, new Insets(5, 5,
//                        5, 5), 0, 0) );
    }
    
    public void changeScreenLang(ResourceBundle messages) {
    	try {
    		this.setBorder(new TitledBorder(messages.getString("JPanelModificarEntidad.modificarEntidadPanel")));
    		entidadJLabel.setText(messages.getString("JPanelModificarEntidad.entidadJLabel"));
    		nombreEntidadJLabel.setText(messages.getString("JPanelModificarEntidad.nombreEntidadJLabel"));
    		sridEntidadJLabel.setText(messages.getString("JPanelModificarEntidad.sridEntidadJLabel"));
    		avisoJLabel.setText(messages.getString("JPanelNuevaEntidad.avisoJLabel"));
    		periodicidadJLabel.setText(messages.getString("JPanelNuevaEntidad.periodicidadJLabel"));
    		intentosJLabel.setText(messages.getString("JPanelNuevaEntidad.intentosJLabel"));
    		entidadExtJLabel.setText(messages.getString("JPanelNuevaEntidad.entidadExtJLabel"));  
    		modificarEntidadListaJButton.setText(messages.getString("JPanelModificarEntidad.modificarEntidadListaJButton"));
    		modificarEntidadListaJButton.setToolTipText(messages.getString("JPanelModificarEntidad.modificarEntidadListaJButton"));
    		backupJCheckBox.setText(messages.getString("JPanelModificarEntidad.backupJCheckBox"));
    		backupJCheckBox.setToolTipText(messages.getString("JPanelModificarEntidad.backupJCheckBox"));
    	}catch (Exception ex){
    		logger.error("Error al poner los textos de la aplicacion",ex);
    	}
        
//        cancelarModificarEntidadJButton.setText(messages.getString("JPanelModificarEntidad.cancelarModificarEntidadJButton"));
//        cancelarModificarEntidadJButton.setToolTipText(messages.getString("JPanelModificarEntidad.cancelarModificarEntidadJButton"));
    }
    
    private JComboBox getJComboBoxEntidad() {
        if (jComboBoxEntidades == null) {
            jComboBoxEntidades = new JComboBox();
            jComboBoxEntidades.setPreferredSize(new Dimension(120, 20));
            jComboBoxEntidades.setMaximumSize(new Dimension(120, 20));
            jComboBoxEntidades.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent e) {
                    SwingUtilities.invokeLater(new Runnable() {
                        public void run(){
                            if (!((Entidad) jComboBoxEntidades.getSelectedItem()).getId().equals("")) {
                                nombreEntidadJText.setText(((Entidad) jComboBoxEntidades.getSelectedItem()).getNombre());
                                nombreEntidadJText.setEnabled(true);
                                sridEntidadJText.setText(((Entidad) jComboBoxEntidades.getSelectedItem()).getSrid());
                                sridEntidadJText.setEnabled(true);
                                backupJCheckBox.setEnabled(true);
                                backupJCheckBox.setSelected(((Entidad)jComboBoxEntidades.getSelectedItem()).isBackup());
                                avisoJText.setEnabled(true);
                                avisoJText.setText(Integer.toString(((Entidad) jComboBoxEntidades.getSelectedItem()).getAviso()));
                                periodicidadJText.setEnabled(true);
                                periodicidadJText.setText(Integer.toString(((Entidad) jComboBoxEntidades.getSelectedItem()).getPeriodicidad()));
                                intentosJText.setEnabled(true);
                                intentosJText.setText(Integer.toString(((Entidad) jComboBoxEntidades.getSelectedItem()).getIntentos()));
                                entidadExtJText.setEnabled(true);
                                entidadExtJText.setText(((Entidad) jComboBoxEntidades.getSelectedItem()).getEntidadExt());
                            } else {
                                nombreEntidadJText.setText("");
                                nombreEntidadJText.setEnabled(false);
                                sridEntidadJText.setText("");
                                sridEntidadJText.setEnabled(false);
                                backupJCheckBox.setEnabled(false);
                                backupJCheckBox.setSelected(false);
                                avisoJText.setText("");
                                periodicidadJText.setText("");
                                intentosJText.setText("");
                                entidadExtJText.setText("");
                                avisoJText.setEnabled(false);
                                periodicidadJText.setEnabled(false);
                                intentosJText.setEnabled(false);
                                entidadExtJText.setEnabled(false);
                            }
                        }
                    });
                }
            });
        }
        return jComboBoxEntidades;
    }
    
//    private JButton getCancelarModificarEntidadJButton(){
//        if (cancelarModificarEntidadJButton == null) {            
//            cancelarModificarEntidadJButton = new JButton();            
//            cancelarModificarEntidadJButton.addActionListener(new ActionListener() {
//                public void actionPerformed(ActionEvent e) {
//                    editable(false);
//                }
//            });
//        }
//        return cancelarModificarEntidadJButton;
//    }
    
    public void editable(boolean b){        
        this.setEnabled(false);
        entidadJLabel.setEnabled(b);
        nombreEntidadJLabel.setEnabled(b);
        nombreEntidadJText.setEditable(b);
        sridEntidadJLabel.setEnabled(b);
        sridEntidadJText.setEditable(b);
        jComboBoxEntidades.setEnabled(b);
        modificarEntidadListaJButton.setEnabled(b);
        backupJCheckBox.setEnabled(b);
        avisoJText.setEnabled(b);
        periodicidadJText.setEnabled(b);
        intentosJText.setEnabled(b);
        entidadExtJText.setEnabled(b);
//        cancelarModificarEntidadJButton.setEnabled(b);
        if (b) {
            refrescarListaEntidades();            
        }
    }
    
    
    public void refrescarListaEntidades() {
    	//Si esta instalado SIGM
        listaEntidades = new OperacionesAdministrador(Constantes.url).getListaEntidadesWithExt();
        //listaEntidades = new OperacionesAdministrador(Constantes.url).getListaEntidades();
        Hashtable hEntidades = listaEntidades.gethEntidades();
        jComboBoxEntidades.removeAllItems();
        jComboBoxEntidades.addItem(new Entidad("", "Seleccione", "", backupJCheckBox.isSelected()));
        jComboBoxEntidades = listaEntidades.cargarJComboBox(jComboBoxEntidades);
        jComboBoxEntidades.setRenderer(new ComboBoxRendererEntidad());
        jComboBoxEntidades.setSelectedIndex(0);
        nombreEntidadJText.setText("");
        nombreEntidadJText.setEnabled(false);
        sridEntidadJText.setText("");
        sridEntidadJText.setEnabled(false);
        avisoJText.setText("");
        avisoJText.setEnabled(false);
        periodicidadJText.setText("");
        periodicidadJText.setEnabled(false);
        intentosJText.setText("");
        intentosJText.setEnabled(false);
        entidadExtJText.setText("");
        entidadExtJText.setEnabled(false);
    }
    
    JButton getBotonModificar() {
        return modificarEntidadListaJButton;
    }
    
    String getCodigoEntidad() {
        return ((Entidad)jComboBoxEntidades.getSelectedItem()).getId();
    }
    
    String getNombreEntidad() {
        return nombreEntidadJText.getText();
    }    
    
    String getSridEntidad() {
        return sridEntidadJText.getText();
    }
    
    String getEntidadExt() {
        return entidadExtJText.getText();
    }
    
    boolean isBackup() {
        return backupJCheckBox.isSelected();
    }
    
    public int getAviso(){
    	return (new Integer(avisoJText.getText())).intValue();
    }
    
    public int getPeriodicidad(){
    	return (new Integer(periodicidadJText.getText())).intValue();
    }
    
    public int getIntentos(){
    	return (new Integer(intentosJText.getText())).intValue();
    }
}
