/*
 * EJBQLConnectionEditor.java
 *
 * Created on March 27, 2007, 1:18 PM
 */

package it.businesslogic.ireport.connection.gui;

import it.businesslogic.ireport.IReportConnection;
import it.businesslogic.ireport.IReportConnectionEditor;
import it.businesslogic.ireport.connection.JRHibernateConnection;
import it.businesslogic.ireport.util.I18n;

/**
 *
 * @author  gtoffoli
 */
public class JRHibernateConnectionEditor extends javax.swing.JPanel implements IReportConnectionEditor {
    
    private IReportConnection iReportConnection = null;
    private boolean init = false;
    
    /** Creates new form EJBQLConnectionEditor */
    public JRHibernateConnectionEditor() {
        initComponents();
        applyI18n();
    }
    
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc=" Generated Code ">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jPanelHibernate = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setLayout(new java.awt.BorderLayout());

        jPanelHibernate.setLayout(new java.awt.GridBagLayout());

        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/it/businesslogic/ireport/icons/hibernate.png")));
        jLabel8.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jLabel8.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        jPanelHibernate.add(jLabel8, gridBagConstraints);

        jLabel1.setText("jLabel1");
        jLabel1.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        jPanelHibernate.add(jLabel1, gridBagConstraints);

        add(jPanelHibernate, java.awt.BorderLayout.CENTER);

    }// </editor-fold>//GEN-END:initComponents
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanelHibernate;
    // End of variables declaration//GEN-END:variables
    
    
    public void setIReportConnection(IReportConnection c) {
        this.iReportConnection = c;
    }

    public IReportConnection getIReportConnection() {
        
        IReportConnection irConn = new JRHibernateConnection();
        iReportConnection = irConn;
        return iReportConnection;
    }
    
    public void applyI18n(){
          jLabel1.setText("<html>"+ I18n.getString("connectionDialog.textPane1","Press the test button.\n\niReport will look in the classpath for a valid hibernate configuration."));
    }
    
    
}
