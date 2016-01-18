/**
 * DatosActividadJPanel.java
 * � MINETUR, Government of Spain
 * This program is part of LocalGIS
 * This program is free software: you can redistribute it and/or modify it under the terms of the GNU General Public License as published by the Free Software Foundation, either version 2 of the License, or (at your option) any later version.
 * This program is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU General Public License for more details.
 * You should have received a copy of the GNU General Public License along with this program. If not, see <http://www.gnu.org/licenses/>.
 */
/*
 * DatosActividad.java
 *
 * Created on 21 de junio de 2005, 14:53
 */

package com.geopista.app.licencias.actividad.datosActividad;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.ResourceBundle;

import javax.swing.JFrame;

import org.apache.log4j.Logger;

import com.geopista.app.licencias.CConstantesLicencias;
import com.geopista.app.licencias.CUtilidadesComponentes;
import com.geopista.app.utilidades.JNumberTextField;
import com.geopista.protocol.licencias.actividad.DatosActividad;

/**
 *
 * @author  charo
 */
public class DatosActividadJPanel extends javax.swing.JPanel {
    ResourceBundle literales;
    private JFrame desktop;
    Logger logger = Logger.getLogger(DatosActividadJPanel.class);

    /** Creates new form DatosActividad */
    public DatosActividadJPanel(JFrame desktop, ResourceBundle literales) {
        this.literales= literales;
        this.desktop= desktop;
        initComponents();
        configureComponents();
        renameComponents(literales);
    }
    
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    private void initComponents() {//GEN-BEGIN:initComponents
        datosActividadJPanel = new javax.swing.JPanel();
        antecedenteObraJLabel = new javax.swing.JLabel();
        buscarObraJButton = new javax.swing.JButton();
        enAlquilerJCheckBox = new javax.swing.JCheckBox();
        aforoJLabel = new javax.swing.JLabel();
        numOperariosJLabel = new javax.swing.JLabel();
        alturaTechosJLabel = new javax.swing.JLabel();
        ventilacionJLabel = new javax.swing.JLabel();
        ventilacionJScrollPane = new javax.swing.JScrollPane();
        almacenajeJLabel = new javax.swing.JLabel();
        almacenajeJScrollPane = new javax.swing.JScrollPane();
        alquilerJLabel = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        datosActividadJPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        datosActividadJPanel.setBorder(new javax.swing.border.TitledBorder("Datos Actividad"));
        antecedenteObraJLabel.setText("Antecedente Obra:");
        datosActividadJPanel.add(antecedenteObraJLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 230, 20));

        buscarObraJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarObraJButtonActionPerformed(evt);
            }
        });

        datosActividadJPanel.add(buscarObraJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 30, 20, 20));

        datosActividadJPanel.add(enAlquilerJCheckBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 20, 20));

        aforoJLabel.setText("Aforo:");
        datosActividadJPanel.add(aforoJLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 230, 20));

        numOperariosJLabel.setText("N\u00famero Operarios:");
        datosActividadJPanel.add(numOperariosJLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 230, 20));

        alturaTechosJLabel.setText("Altura techos:");
        datosActividadJPanel.add(alturaTechosJLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, 230, 20));

        ventilacionJLabel.setText("Ventilaci\u00f3n:");
        datosActividadJPanel.add(ventilacionJLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, 200, 20));

        datosActividadJPanel.add(ventilacionJScrollPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, 430, 90));

        almacenajeJLabel.setText("Almacenaje:");
        datosActividadJPanel.add(almacenajeJLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 380, 200, 20));

        datosActividadJPanel.add(almacenajeJScrollPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 400, 430, 90));

        alquilerJLabel.setText("En Alquiler");
        datosActividadJPanel.add(alquilerJLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 60, 380, 20));

        add(datosActividadJPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 518, 547));

    }//GEN-END:initComponents

    private void buscarObraJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarObraJButtonActionPerformed
        // TODO add your handling code here:
        CUtilidadesComponentes.showSearchDialog(this.desktop, "-1", "-1", "-1", "", true, literales, true);

        if ((numExpedienteObraTField.getText() != null) && (numExpedienteObraTField.getText().trim().length() > 0)){
            if ((CConstantesLicencias.searchValue != null) && (CConstantesLicencias.searchValue.trim().length() > 0)){
                // se ha aceptado en el dialogo de busqueda
                numExpedienteObraTField.setText(CConstantesLicencias.searchValue);
            }
        }else{
            numExpedienteObraTField.setText(CConstantesLicencias.searchValue);
        }

    }//GEN-LAST:event_buscarObraJButtonActionPerformed

    private void configureComponents(){

        /** antecedente de obra */
        buscarObraJButton.setIcon(com.geopista.app.licencias.CUtilidadesComponentes.iconoZoom);
        numExpedienteObraTField= new com.geopista.app.utilidades.TextField(20);
        datosActividadJPanel.add(numExpedienteObraTField, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 30, 170, -1));

        /** aforo */
        aforoJNTField= new com.geopista.app.utilidades.JNumberTextField(JNumberTextField.NUMBER, new Integer(99999999), true);
        aforoJNTField.setSignAllowed(false);
        datosActividadJPanel.add(aforoJNTField, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 140, 190, -1));

        /** numero de operarios */
        numOperariosJNTField= new com.geopista.app.utilidades.JNumberTextField(JNumberTextField.NUMBER, new Integer(99999999), true);
        numOperariosJNTField.setSignAllowed(false);
        datosActividadJPanel.add(numOperariosJNTField, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 100, 190, -1));

        /** altura techos */
        alturaTechosJNTField= new com.geopista.app.utilidades.JNumberTextField(JNumberTextField.REAL, new Integer(9999), true, 2);
        alturaTechosJNTField.setSignAllowed(false);
        datosActividadJPanel.add(alturaTechosJNTField, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 160, 190, -1));

        /** descripcion del almacenaje */
        almacenajeTPane= new com.geopista.app.utilidades.TextPane(254);
        almacenajeTPane.setLineWrap(true);
        almacenajeTPane.setWrapStyleWord(true);
        almacenajeJScrollPane.setViewportView(almacenajeTPane);

        /** descripcion de la ventilacion */
        ventilacionTPane= new com.geopista.app.utilidades.TextPane(254);
        ventilacionTPane.setLineWrap(true);
        ventilacionTPane.setWrapStyleWord(true);
        ventilacionJScrollPane.setViewportView(ventilacionTPane);
    }

    public void renameComponents(ResourceBundle literales){
        this.literales= literales;

        datosActividadJPanel.setBorder(new javax.swing.border.TitledBorder(literales.getString("DatosActividadJPanel.datosActividadJPanel.setBorder")));
        antecedenteObraJLabel.setText(literales.getString("DatosActividadJPanel.antecedenteObraJLabel.setText"));
        alquilerJLabel.setText(literales.getString("DatosActividadJPanel.enAlquilerJCheckBox.setText"));
        aforoJLabel.setText(literales.getString("DatosActividadJPanel.aforoJLabel.setText"));
        numOperariosJLabel.setText(literales.getString("DatosActividadJPanel.numOperariosJLabel.setText"));
        alturaTechosJLabel.setText(literales.getString("DatosActividadJPanel.alturaTechosJLabel.setText"));
        ventilacionJLabel.setText(literales.getString("DatosActividadJPanel.ventilacionJLabel.setText"));
        almacenajeJLabel.setText(literales.getString("DatosActividadJPanel.almacenajeJLabel.setText"));

        buscarObraJButton.setToolTipText(literales.getString("DatosActividadJPanel.buscarObraJButton.setText"));
    }

    public void setEnabled(boolean b){
        numExpedienteObraTField.setEnabled(b);
        aforoJNTField.setEnabled(b);
        numOperariosJNTField.setEnabled(b);
        alturaTechosJNTField.setEnabled(b);
        almacenajeTPane.setEnabled(b);
        ventilacionTPane.setEnabled(b);
        buscarObraJButton.setEnabled(b);
        enAlquilerJCheckBox.setEnabled(b);

    }

    public void load(DatosActividad datosActividad){
        numExpedienteObraTField.setText(((datosActividad != null)&&(datosActividad.getNumExpedienteObra() != null))?datosActividad.getNumExpedienteObra():"");
        /*
        aforoJNTField.setText(((datosActividad != null)&&(datosActividad.getAforo() != -1))?new Integer(datosActividad.getAforo()).toString():"");
        numOperariosJNTField.setText(((datosActividad != null)&&(datosActividad.getNumeroOperarios() != -1))?new Integer(datosActividad.getNumeroOperarios()).toString():"");
        alturaTechosJNTField.setText(((datosActividad != null)&&(datosActividad.getAlturaTechos() != -1))?new Double(datosActividad.getAlturaTechos()).toString():"");
        */
        if ((datosActividad != null)&&(datosActividad.getAforo() != -1)){
            aforoJNTField.setNumber(new Integer(datosActividad.getAforo()));
        }else aforoJNTField.setText("");
        if((datosActividad != null)&&(datosActividad.getNumeroOperarios() != -1)){
            numOperariosJNTField.setNumber(new Integer(datosActividad.getNumeroOperarios()));
        }else numOperariosJNTField.setText("");
        if (((datosActividad != null)&&(datosActividad.getAlturaTechos() != -1))){
            alturaTechosJNTField.setNumber(new Double(datosActividad.getAlturaTechos()));
        }else alturaTechosJNTField.setText("");

        almacenajeTPane.setText(((datosActividad != null)&&(datosActividad.getDescripcionAlmacenaje() != null))?datosActividad.getDescripcionAlmacenaje():"");
        ventilacionTPane.setText(((datosActividad != null)&&(datosActividad.getDescripcionVentilacion() != null))?datosActividad.getDescripcionVentilacion():"");

        enAlquilerJCheckBox.setSelected((datosActividad != null)?(datosActividad.getAlquiler()==1?true:false):false);
    }


    public DatosActividad getDatosActividad(){
        try{
            /** comprobamos que haya sido rellenado */
            double altura= -1;
            try {
                altura= alturaTechosJNTField.getNumber().doubleValue();
            } catch (Exception ex) {
                logger.warn("Altura no v�lida. alturaTechosJNTField.getText(): " + alturaTechosJNTField.getText());
            }

            int aforo= -1;
            try {
                aforo= aforoJNTField.getNumber().intValue();
            } catch (Exception ex) {
                logger.warn("Aforo no v�lida. aforoJNTField.getText(): " + aforoJNTField.getText());
            }

            int numOperarios= -1;
            try {
                numOperarios= numOperariosJNTField.getNumber().intValue();
            } catch (Exception ex) {
                logger.warn("numOperarios no v�lido. numOperariosJNTField.getText(): " + numOperariosJNTField.getText());
            }

            String numExpedienteObra= numExpedienteObraTField.getText().trim();
            String almacenaje= almacenajeTPane.getText().trim();
            String ventilacion= ventilacionTPane.getText().trim();

            /** si TODOS los campos estan sin rellenar, devolvemos null */
            if (!((altura != -1) || (aforo != -1) || (numOperarios != -1) ||
                (numExpedienteObra.length() > 0) ||
                (almacenaje.length() > 0) ||
                (ventilacion.length() > 0) ||
                 enAlquilerJCheckBox.isSelected())) return null;

            DatosActividad datosActividad= new DatosActividad();
            datosActividad.setAlturaTechos(altura);
            datosActividad.setAforo(aforo);
            datosActividad.setNumeroOperarios(numOperarios);
            datosActividad.setNumExpedienteObra(numExpedienteObra);
            datosActividad.setDescripcionAlmacenaje(almacenaje);
            datosActividad.setDescripcionVentilacion(ventilacion);
            datosActividad.setAlquiler(enAlquilerJCheckBox.isSelected()?1:0);

            return datosActividad;

        }catch (Exception ex){
            StringWriter sw = new StringWriter();
            PrintWriter pw = new PrintWriter(sw);
            ex.printStackTrace(pw);
            logger.error("Exception: " + sw.toString());

            return null;
        }
    }

    private com.geopista.app.utilidades.JNumberTextField aforoJNTField;
    private com.geopista.app.utilidades.JNumberTextField numOperariosJNTField;
    private com.geopista.app.utilidades.JNumberTextField alturaTechosJNTField;

    private com.geopista.app.utilidades.TextField numExpedienteObraTField;

    private com.geopista.app.utilidades.TextPane almacenajeTPane;
    private com.geopista.app.utilidades.TextPane ventilacionTPane;


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel aforoJLabel;
    private javax.swing.JLabel almacenajeJLabel;
    private javax.swing.JScrollPane almacenajeJScrollPane;
    private javax.swing.JLabel alquilerJLabel;
    private javax.swing.JLabel alturaTechosJLabel;
    private javax.swing.JLabel antecedenteObraJLabel;
    private javax.swing.JButton buscarObraJButton;
    private javax.swing.JPanel datosActividadJPanel;
    private javax.swing.JCheckBox enAlquilerJCheckBox;
    private javax.swing.JLabel numOperariosJLabel;
    private javax.swing.JLabel ventilacionJLabel;
    private javax.swing.JScrollPane ventilacionJScrollPane;
    // End of variables declaration//GEN-END:variables
    
}
