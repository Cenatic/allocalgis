package com.geopista.reports.gui;

import java.awt.Frame;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.swing.JOptionPane;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

/**
 * Dialogo para introducir una escala
 * @author  albegarcia
 */
public class MapScaleDialog extends javax.swing.JDialog {
    
    private static final Pattern userDefinedScalePattern = Pattern.compile("([0-9])*:([0-9])*");

    /** Creates new form MapParameterDialog */
    public MapScaleDialog() {
        initComponents();
        postInitComponents();
    }
    
    public MapScaleDialog(Frame owner){
        super(owner);
        initComponents();
        postInitComponents();
    }
    
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabelEscala = new javax.swing.JLabel();
        jTextFieldScale = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jButtonCancel = new javax.swing.JButton();
        jButtonOk = new javax.swing.JButton();

        setTitle("Nueva escala");
        setModal(true);
        setResizable(false);
        getContentPane().setLayout(new java.awt.GridLayout(2, 1));

        jPanel1.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.RIGHT, 10, 10));

        jLabelEscala.setText("Escala");
        jPanel1.add(jLabelEscala);

        jTextFieldScale.setMinimumSize(new java.awt.Dimension(150, 19));
        jTextFieldScale.setPreferredSize(new java.awt.Dimension(165, 19));
        jPanel1.add(jTextFieldScale);

        getContentPane().add(jPanel1);

        jPanel2.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 10, 10));

        jButtonCancel.setText("Cancelar");
        jButtonCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelActionPerformed(evt);
            }
        });
        jPanel2.add(jButtonCancel);

        jButtonOk.setText("Aceptar");
        jButtonOk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonOkActionPerformed(evt);
            }
        });
        jPanel2.add(jButtonOk);

        getContentPane().add(jPanel2);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void postInitComponents() {
        jTextFieldScale.getDocument().addDocumentListener(new DocumentListener() {
            public void insertUpdate(DocumentEvent documentevent) {
                jTextFieldMapNameChanged(documentevent);
            }
            
            public void removeUpdate(DocumentEvent documentevent) {
                jTextFieldMapNameChanged(documentevent);
            }
            
            public void changedUpdate(DocumentEvent documentevent) {
            }
        });
    }

    private void jButtonCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonOkMouseClicked
        jTextFieldScale.setText("");
        this.setVisible(false);
    }//GEN-LAST:event_jButtonOkActionPerformed

    private void jButtonOkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonOkMouseClicked
        if (!isValidUserDefinedScale(jTextFieldScale.getText())) {
            String msg = "La escala introducida no es valida. Debe tener el formato \"1:100\"";         
            JOptionPane.showMessageDialog(null, msg, "Error", JOptionPane.ERROR_MESSAGE);
            return;
        } else {
            this.setVisible(false);
        }
    }//GEN-LAST:event_jButtonOkActionPerformed

    private void jTextFieldMapNameChanged(DocumentEvent evt) {
        if (!jTextFieldScale.getText().equals("")){
            jButtonOk.setEnabled(true);
        }
        else {
            jButtonOk.setEnabled(false);
        }
    }

    public void setVisible(boolean visible){
    	if (visible == true){
            jTextFieldScale.setText("");
            jButtonOk.setEnabled(false);
    	}
    	
        setLocationRelativeTo(null);        
    	super.setVisible(visible);
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MapScaleDialog().setVisible(true);
            }
        });
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCancel;
    private javax.swing.JButton jButtonOk;
    private javax.swing.JLabel jLabelEscala;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField jTextFieldScale;
    // End of variables declaration//GEN-END:variables
    
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

    public String getScale() {
        return jTextFieldScale.getText();
    }

    public void setScale(String scale) {
        jTextFieldScale.setText(scale);
    }
}
