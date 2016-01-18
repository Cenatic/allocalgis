/*
 * TareasPendientesJDialog.java
 *
 * Created on 16 de noviembre de 2004, 12:57
 */

package com.geopista.app.ocupaciones.panel;

import com.geopista.app.ocupaciones.IMultilingue;
import com.geopista.app.ocupaciones.CMainOcupaciones;
import com.geopista.app.ocupaciones.CConstantesOcupaciones;
import com.geopista.security.GeopistaAcl;


import java.awt.*;
import java.io.StringWriter;
import java.io.PrintWriter;

import org.apache.log4j.Logger;

import javax.swing.*;

/**
 *
 * @author  charo
 */
public class TareasPendientesJDialog extends javax.swing.JDialog implements IMultilingue {
    private Frame desktop;
    public TareasPendientesJPanel _tareasPendientesJPanel;

    Logger logger = Logger.getLogger(TareasPendientesJDialog.class);

    /** Creates new form TareasPendientesJDialog */
    public TareasPendientesJDialog(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        this.desktop= parent;
        menuLicenciasSetEnabled(false, (JFrame)this.desktop);
        initComponents();
        renombrarComponentes();
    }
    
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    private void initComponents() {//GEN-BEGIN:initComponents
        templateJScrollPane = new javax.swing.JScrollPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });
        _tareasPendientesJPanel= new TareasPendientesJPanel(this, (JFrame)this.desktop);
        templateJScrollPane.setViewportView(_tareasPendientesJPanel);
        getContentPane().add(templateJScrollPane, java.awt.BorderLayout.CENTER);

        pack();
    }//GEN-END:initComponents

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        // TODO add your handling code here:
        CConstantesOcupaciones.helpSetHomeID = "ocupacionesIntro";
        menuLicenciasSetEnabled(true, (JFrame)this.desktop);
    }//GEN-LAST:event_formWindowClosing

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        // TODO add your handling code here:
        CConstantesOcupaciones.helpSetHomeID = "ocupacionesIntro";
        menuLicenciasSetEnabled(true, (JFrame)this.desktop);
    }//GEN-LAST:event_formWindowClosed
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        new TareasPendientesJDialog(new javax.swing.JFrame(), true).show();
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane templateJScrollPane;
    // End of variables declaration//GEN-END:variables


    public void renombrarComponentes() {

        try {
            setTitle(CMainOcupaciones.literales.getString("CTareasPendientes.JDialog.title"));

        } catch (Exception ex) {
            StringWriter sw = new StringWriter();
            PrintWriter pw = new PrintWriter(sw);
            ex.printStackTrace(pw);
            logger.error("Exception: " + sw.toString());
        }
    }
    public  void menuLicenciasSetEnabled(boolean b, JFrame desktop)
    {
            try {
                desktop.getJMenuBar().getMenu(0).setEnabled(b);
                desktop.getJMenuBar().getMenu(1).setEnabled(b);
                desktop.getJMenuBar().getMenu(2).setEnabled(b);
                desktop.getJMenuBar().getMenu(3).setEnabled(b);
                desktop.getJMenuBar().getMenu(4).setEnabled(b);
                desktop.getJMenuBar().getMenu(5).setEnabled(b);

                if (b){
                    ((CMainOcupaciones)desktop).resetSecurityPolicy();
                    GeopistaAcl acl = com.geopista.security.SecurityManager.getPerfil("Licencias de Obra");
                    ((CMainOcupaciones)desktop).applySecurityPolicy(acl, com.geopista.security.SecurityManager.getPrincipal());
               }
            } catch (Exception e) {
                logger.error("Exception: ",e);
            }
        }
     

}
