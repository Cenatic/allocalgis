/*
 * Copyright (C) 2005 - 2007 JasperSoft Corporation.  All rights reserved. 
 * http://www.jaspersoft.com.
 *
 * Unless you have purchased a commercial license agreement from JasperSoft,
 * the following license terms apply:
 *
 * This program is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License version 2 as published by
 * the Free Software Foundation.
 *
 * This program is distributed WITHOUT ANY WARRANTY; and without the
 * implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.
 * See the GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, see http://www.gnu.org/licenses/gpl.txt
 * or write to:
 *
 * Free Software Foundation, Inc.,
 * 59 Temple Place - Suite 330,
 * Boston, MA  USA  02111-1307
 *
 *
 *
 *
 * SubreportWizardExistingReport.java
 * 
 * Created on March 22, 2006, 8:52 PM
 *
 */

package it.businesslogic.ireport.gui.wizard;

import it.businesslogic.ireport.JRSubreportParameter;
import it.businesslogic.ireport.Report;
import it.businesslogic.ireport.SubReportElement;
import it.businesslogic.ireport.gui.MainFrame;
import it.businesslogic.ireport.util.Misc;
import java.io.File;
import java.util.Vector;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.table.TableColumn;
import net.sf.jasperreports.engine.JRParameter;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.design.JasperDesign;
import it.businesslogic.ireport.util.I18n;
import javax.swing.SwingUtilities;

/**
 *
 * @author  gtoffoli
 */
public class SubreportWizardExistingReport extends javax.swing.JPanel implements GenericWizard {
    
    private String reportFileName = null;
    private SubReportElement subReportElement = null;
    private BaseWizardPanel wizardPanel = null;
    private javax.swing.JDialog wizardDialog = null;
  
    /** Creates new form SubreportWizardPanes */
    public SubreportWizardExistingReport() {
        initComponents();
        applyI18n();
        jRTextExpressionAreaConnectionExpression.getDocument().addDocumentListener( new DocumentListener() {
            public void changedUpdate(DocumentEvent e) {
                if (wizardPanel != null) wizardPanel.updateButtons();
            }
            public void insertUpdate(DocumentEvent e) {
                if (wizardPanel != null) wizardPanel.updateButtons();
            }
            public void removeUpdate(DocumentEvent e) {
                if (wizardPanel != null) wizardPanel.updateButtons();
            }
        });
        
        jRTextExpressionAreaDataSourceExpression.getDocument().addDocumentListener( new DocumentListener() {
            public void changedUpdate(DocumentEvent e) {
                if (wizardPanel != null) wizardPanel.updateButtons();
            }
            public void insertUpdate(DocumentEvent e) {
                if (wizardPanel != null) wizardPanel.updateButtons();
            }
            public void removeUpdate(DocumentEvent e) {
                if (wizardPanel != null) wizardPanel.updateButtons();
            }
        });
        
        // These are the combobox values
        Vector values = new Vector();
        
        Report report = MainFrame.getMainInstance().getActiveReportFrame().getReport();
        
        values.addAll( report.getFields());
        values.addAll( report.getVariables());
        values.addAll(report.getParameters());
        jTableParameters.setRowHeight(20);

    
        TableColumn col = jTableParameters.getColumnModel().getColumn(1);
        TableComboBoxEditor tcb = new TableComboBoxEditor(values);
        ((JComboBox)tcb.getComponent()).setEditable(true);
        col.setCellEditor(tcb);
    
        // If the cell should appear like a combobox in its
        // non-editing state, also set the combobox renderer
        //col.setCellRenderer(new TableComboBoxRenderer(values));

    }   
    
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc=" Generated Code ">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jPanel0 = new javax.swing.JPanel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jRTextExpressionAreaConnectionExpression = new it.businesslogic.ireport.gui.JRTextExpressionArea();
        jRadioButton3 = new javax.swing.JRadioButton();
        jRTextExpressionAreaDataSourceExpression = new it.businesslogic.ireport.gui.JRTextExpressionArea();
        jRadioButton6 = new javax.swing.JRadioButton();
        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableParameters = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jRadioButton4 = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();
        jRadioButton5 = new javax.swing.JRadioButton();
        jLabel2 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        buttonGroup2 = new javax.swing.ButtonGroup();

        jPanel0.setLayout(new java.awt.GridBagLayout());

        jPanel0.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                jPanel0PropertyChange(evt);
            }
        });

        buttonGroup1.add(jRadioButton1);
        jRadioButton1.setSelected(true);
        jRadioButton1.setText("Use the same connection used to fill the master report");
        jRadioButton1.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        jRadioButton1.setFocusPainted(false);
        jRadioButton1.setMargin(new java.awt.Insets(0, 0, 0, 0));
        jRadioButton1.setMinimumSize(new java.awt.Dimension(115, 20));
        jRadioButton1.setPreferredSize(new java.awt.Dimension(115, 20));
        jRadioButton1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jRadioButton1ItemStateChanged(evt);
            }
        });
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.SOUTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(4, 20, 0, 0);
        jPanel0.add(jRadioButton1, gridBagConstraints);

        buttonGroup1.add(jRadioButton2);
        jRadioButton2.setText("Use another connection");
        jRadioButton2.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        jRadioButton2.setFocusPainted(false);
        jRadioButton2.setMargin(new java.awt.Insets(0, 0, 0, 0));
        jRadioButton2.setMinimumSize(new java.awt.Dimension(115, 20));
        jRadioButton2.setPreferredSize(new java.awt.Dimension(115, 20));
        jRadioButton2.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jRadioButton1ItemStateChanged1(evt);
            }
        });
        jRadioButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed1(evt);
            }
        });

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.SOUTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(10, 20, 0, 0);
        jPanel0.add(jRadioButton2, gridBagConstraints);

        jRTextExpressionAreaConnectionExpression.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jRTextExpressionAreaConnectionExpression.setElectricScroll(0);
        jRTextExpressionAreaConnectionExpression.setMinimumSize(new java.awt.Dimension(300, 47));
        jRTextExpressionAreaConnectionExpression.setPreferredSize(new java.awt.Dimension(300, 47));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(1, 40, 0, 6);
        jPanel0.add(jRTextExpressionAreaConnectionExpression, gridBagConstraints);

        buttonGroup1.add(jRadioButton3);
        jRadioButton3.setText("Use a JRDataSource expression");
        jRadioButton3.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        jRadioButton3.setFocusPainted(false);
        jRadioButton3.setMargin(new java.awt.Insets(0, 0, 0, 0));
        jRadioButton3.setPreferredSize(new java.awt.Dimension(129, 20));
        jRadioButton3.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jRadioButton3ItemStateChanged(evt);
            }
        });

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(10, 20, 0, 0);
        jPanel0.add(jRadioButton3, gridBagConstraints);

        jRTextExpressionAreaDataSourceExpression.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jRTextExpressionAreaDataSourceExpression.setElectricScroll(0);
        jRTextExpressionAreaDataSourceExpression.setMinimumSize(new java.awt.Dimension(300, 47));
        jRTextExpressionAreaDataSourceExpression.setPreferredSize(new java.awt.Dimension(300, 47));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(1, 40, 0, 6);
        jPanel0.add(jRTextExpressionAreaDataSourceExpression, gridBagConstraints);

        buttonGroup1.add(jRadioButton6);
        jRadioButton6.setText("Do not use any connection or datasource");
        jRadioButton6.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        jRadioButton6.setFocusPainted(false);
        jRadioButton6.setMargin(new java.awt.Insets(0, 0, 0, 0));
        jRadioButton6.setMinimumSize(new java.awt.Dimension(129, 20));
        jRadioButton6.setPreferredSize(new java.awt.Dimension(129, 20));
        jRadioButton6.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jRadioButton3ItemStateChanged1(evt);
            }
        });

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(10, 20, 0, 0);
        jPanel0.add(jRadioButton6, gridBagConstraints);

        jPanel1.setLayout(new java.awt.GridBagLayout());

        jTableParameters.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Parameter name", "Expression"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTableParameters);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        jPanel1.add(jScrollPane1, gridBagConstraints);

        jPanel2.setLayout(new java.awt.GridBagLayout());

        buttonGroup2.add(jRadioButton4);
        jRadioButton4.setSelected(true);
        jRadioButton4.setText("Store the directory name in a parameter");
        jRadioButton4.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        jRadioButton4.setFocusPainted(false);
        jRadioButton4.setMargin(new java.awt.Insets(0, 0, 0, 0));
        jRadioButton4.setMinimumSize(new java.awt.Dimension(115, 20));
        jRadioButton4.setPreferredSize(new java.awt.Dimension(115, 20));
        jRadioButton4.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jRadioButton1ItemStateChanged2(evt);
            }
        });
        jRadioButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed2(evt);
            }
        });

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.SOUTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(10, 20, 0, 0);
        jPanel2.add(jRadioButton4, gridBagConstraints);

        jLabel1.setText("$P{SUBREPORT_DIR} + \"/name.jasper\"");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(2, 40, 0, 0);
        jPanel2.add(jLabel1, gridBagConstraints);

        buttonGroup2.add(jRadioButton5);
        jRadioButton5.setText("Use a static absolute path reference");
        jRadioButton5.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        jRadioButton5.setFocusPainted(false);
        jRadioButton5.setMargin(new java.awt.Insets(0, 0, 0, 0));
        jRadioButton5.setMinimumSize(new java.awt.Dimension(115, 20));
        jRadioButton5.setPreferredSize(new java.awt.Dimension(115, 20));
        jRadioButton5.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jRadioButton2jRadioButton1ItemStateChanged1(evt);
            }
        });
        jRadioButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton2jRadioButton1ActionPerformed1(evt);
            }
        });

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.SOUTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(24, 20, 0, 0);
        jPanel2.add(jRadioButton5, gridBagConstraints);

        jLabel2.setText("\" path reference \"");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(2, 40, 0, 0);
        jPanel2.add(jLabel2, gridBagConstraints);

        jPanel3.setLayout(new java.awt.GridBagLayout());

        jLabel3.setText("Finish");
        jPanel3.add(jLabel3, new java.awt.GridBagConstraints());

        setLayout(new java.awt.BorderLayout());

    }// </editor-fold>//GEN-END:initComponents

    private void jRadioButton3ItemStateChanged1(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jRadioButton3ItemStateChanged1
        if (wizardPanel != null) wizardPanel.updateButtons();
    }//GEN-LAST:event_jRadioButton3ItemStateChanged1

    private void jRadioButton2jRadioButton1ActionPerformed1(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton2jRadioButton1ActionPerformed1
// TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton2jRadioButton1ActionPerformed1

    private void jRadioButton2jRadioButton1ItemStateChanged1(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jRadioButton2jRadioButton1ItemStateChanged1
// TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton2jRadioButton1ItemStateChanged1

    private void jRadioButton1ActionPerformed2(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed2
// TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton1ActionPerformed2

    private void jRadioButton1ItemStateChanged2(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jRadioButton1ItemStateChanged2
// TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton1ItemStateChanged2

    private void jRadioButton1ActionPerformed1(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed1
// TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton1ActionPerformed1

    private void jRadioButton1ItemStateChanged1(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jRadioButton1ItemStateChanged1
// TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton1ItemStateChanged1

    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed
       if (wizardPanel != null) wizardPanel.updateButtons();
    }//GEN-LAST:event_jRadioButton1ActionPerformed

    private void jRadioButton1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jRadioButton1ItemStateChanged
        if (wizardPanel != null) wizardPanel.updateButtons();
    }//GEN-LAST:event_jRadioButton1ItemStateChanged

    private void jRadioButton3ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jRadioButton3ItemStateChanged
        wizardPanel.updateButtons();
    }//GEN-LAST:event_jRadioButton3ItemStateChanged

    private void jPanel0PropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jPanel0PropertyChange

        
        
    }//GEN-LAST:event_jPanel0PropertyChange
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel0;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private it.businesslogic.ireport.gui.JRTextExpressionArea jRTextExpressionAreaConnectionExpression;
    private it.businesslogic.ireport.gui.JRTextExpressionArea jRTextExpressionAreaDataSourceExpression;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JRadioButton jRadioButton4;
    private javax.swing.JRadioButton jRadioButton5;
    private javax.swing.JRadioButton jRadioButton6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableParameters;
    // End of variables declaration//GEN-END:variables


    public String[] getStepsNames() {
        
        String[] names = new String[3];
        //
        names[0] = I18n.getString("subreportWizardExistingReport.stepsnames.connection","Connection / datasource");
        names[1] = I18n.getString("subreportWizardExistingReport.stepsnames.parameters","Parameters");
        names[2] = I18n.getString("subreportWizardExistingReport.stepsnames.expression","Expression");
        //names[3] = I18n.getString("subreportWizardExistingReport.stepsnames.finish","Finish");
        //names[0] = "Connection / datasource";
        //names[1] = "Parameters";
        //names[2] = "Expression";
        //names[3] = "Finish";
        //
        
        return names;
    }

    public String getStepDescription(int step) {
        
    	//
        if (step==0) return
        		I18n.getString("subreportWizardExistingReport.stepdescription.step0","How fill the subreport");
        		//"How fill the subreport";        
        if (step==1) return
        		I18n.getString("subreportWizardExistingReport.stepdescription.step1","Subreport parameters");
        		//"Subreport parameters";
        if (step==2) return
        		I18n.getString("subreportWizardExistingReport.stepdescription.step2","Subreport expession");
        		//"Subreport expession";
        if (step==3) return
        		I18n.getString("subreportWizardExistingReport.stepdescription.step3","Finish");
        		//"Finish";
        //
        
        return "";
    }

    public void initWizard() {
        
    }

    public void finish(int currentStep) {
        
        if (currentStep > 0)
        {
            
            // Set the connection...
            if (jRadioButton1.isSelected())
            {
                getSubReportElement().setUseConnection(true);
                getSubReportElement().setConnectionExpression("$P{REPORT_CONNECTION}");
            }
            else if (jRadioButton2.isSelected())
            {
                getSubReportElement().setUseConnection(true);
                getSubReportElement().setConnectionExpression(jRTextExpressionAreaConnectionExpression.getText());
            }
            else if (jRadioButton3.isSelected())
            {
                getSubReportElement().setUseConnection(false);
                getSubReportElement().setDataSourceExpression(jRTextExpressionAreaDataSourceExpression.getText());
            }
            else if (jRadioButton6.isSelected())
            {
                getSubReportElement().setUseConnection(false);
                getSubReportElement().setConnectionExpression("");
                getSubReportElement().setDataSourceExpression("");
            }
            
            for (int i=0; i<jTableParameters.getRowCount(); ++i)
            {
                Object obj = jTableParameters.getValueAt(i,1);
                if (obj != null && (""+obj).trim().length() > 0)
                {
                    if (obj instanceof it.businesslogic.ireport.JRParameter)
                    {
                       obj = "$P{" + obj + "}";
                    }
                    else if (obj instanceof it.businesslogic.ireport.JRVariable)
                    {
                       obj = "$V{" + obj + "}";
                    }
                    else if (obj instanceof it.businesslogic.ireport.JRField)
                    {
                        obj = "$F{" + obj + "}";
                    }
                       
                    it.businesslogic.ireport.JRSubreportParameter srp = new it.businesslogic.ireport.JRSubreportParameter(
                            ""+jTableParameters.getValueAt(i,0),
                            ""+obj);
                    
                    getSubReportElement().getSubreportParameters().add(srp);
                }
            }
            
            if (jRadioButton4.isSelected())
            {
                Report report = MainFrame.getMainInstance().getActiveReportFrame().getReport();
                Vector v = report.getParameters();
                boolean found = false;
                for (int i=0; i<report.getParameters().size(); ++i)
                {
                    it.businesslogic.ireport.JRParameter param = (it.businesslogic.ireport.JRParameter)report.getParameters().elementAt(i);

                    if (param.getName().equals("SUBREPORT_DIR"))
                    {
                        found = true;
                        
                        break;
                    }
                }
                if (!found)
                {
                    it.businesslogic.ireport.JRParameter param = new it.businesslogic.ireport.JRParameter("SUBREPORT_DIR","java.lang.String");
                    File f = new File( getReportFileName() );
                    
                    // Set as subreport directory the current compilation directory...
                    /*
                    
                    String s = f.getParent(); //Path();
                    */
                    String s = MainFrame.getMainInstance().getTranslatedCompileDirectory();
                    
                    if (s.length() > 0 && !s.endsWith(File.separator)) s += File.separator;
                    
                    s = Misc.string_replace("\\\\","\\",s);
                    s = "\"" + s + "\"";
                    
                    param.setDefaultValueExpression(s);
                    report.addParameter( param );
                }
                getSubReportElement().setSubreportExpression(jLabel1.getText());
            }
            else
            {
                getSubReportElement().setSubreportExpression(jLabel2.getText());
            }
            getSubReportElement().setSubreportExpressionClass("java.lang.String");
        }
        
        this.getWizardDialog().setVisible(false);
        this.getWizardDialog().dispose();
    }
    
    public boolean nextStep(int nextStep) {
        
        if (nextStep == 0) // First step == 0
        {
        } 
        else if (nextStep == 1) // First step == 0
        {
            try{
                if (getReportFileName().toLowerCase().endsWith(".jasper"))
                {

                    JasperReport jr = (JasperReport)net.sf.jasperreports.engine.util.JRLoader.loadObject( getReportFileName() );
                    JRParameter[] params = jr.getParameters();

                    javax.swing.table.DefaultTableModel dtm = (javax.swing.table.DefaultTableModel)jTableParameters.getModel();
                    dtm.setRowCount(0);
                    for (int i=0; i<params.length; ++i)
                    {
                        JRParameter param = params[i];
                        if (param.getName() != null &&
                            !param.isSystemDefined())
                        {
                            dtm.addRow(new Object[]{param.getName(),""});
                        }
                    }
                    jTableParameters.updateUI();


                }
                else
                {

                    JasperDesign jr = (JasperDesign)net.sf.jasperreports.engine.xml.JRXmlLoader.load( getReportFileName() );
                    
                    JRParameter[] params = jr.getParameters();

                    javax.swing.table.DefaultTableModel dtm = (javax.swing.table.DefaultTableModel)jTableParameters.getModel();
                    dtm.setRowCount(0);
                    for (int i=0; i<params.length; ++i)
                    {
                        JRParameter param = params[i];
                        if (param.getName() != null &&
                            !param.isSystemDefined())
                        {
                            dtm.addRow(new Object[]{param.getName(),""});
                        }
                    }
                    jTableParameters.updateUI();
                    
                    
                }
                
            } catch (Exception ex)
            {
                final String errorMessage = ex.getMessage();
                SwingUtilities.invokeLater(new Runnable() {
                    public void run() {
                        JOptionPane.showMessageDialog(SubreportWizardExistingReport.this,
                        I18n.getFormattedString( "messages.subreportWizardExistingReport.errorLoadingSubreport","Error loading the subreport file: {0}", new Object[]{errorMessage})
                         );
                    }
                });
                                
                ex.printStackTrace();
                //finish(-1);
                //return false;
            }
            return true;
        }
        else if (nextStep == 2) // First step == 0
        {
            try {
                   File f = new File( getReportFileName() );

                   String s = f.getName();
                   if (!s.toLowerCase().endsWith(".jasper"))
                   {
                       if (s.lastIndexOf(".") > 0)
                       {
                           s = s.substring(0,s.lastIndexOf("."));
                       }
                       s += ".jasper";
                   }
                   
                   jLabel1.setText("$P{SUBREPORT_DIR} + \"" + s + "\"");
                   
                   
                   String s2 = MainFrame.getMainInstance().getTranslatedCompileDirectory();
                   f = new File( getReportFileName() );
                   f = new File(s2, f.getName());
                
                   s2 = Misc.string_replace("\\\\","\\","" + f);
                
                   jLabel2.setText("\"" + s2 + "\"");
           
            } catch (Exception ex)
            {
                ex.printStackTrace();
            }
           
           
        }
        return true;
    }

    public boolean previousStep(int previousStep) {
        return true;
    }

    public boolean canFinish(int currentStep) {
        return true;
    }

    public boolean canNext(int currentStep) {
        
        if (currentStep == 0)
        {
            if (jRadioButton1.isSelected()) return true;
            else if (jRadioButton2.isSelected() &&
                jRTextExpressionAreaConnectionExpression.getText().trim().length() > 0) return true;
            else if (jRadioButton3.isSelected() &&
                jRTextExpressionAreaDataSourceExpression.getText().trim().length() > 0) return true;
            else if (jRadioButton6.isSelected()) return true;
                    
            return false;
        }
        if (currentStep == 1)
        {
            return true;
        }
        return false;
    }

    public boolean canPrevious(int currentStep) {
        return (currentStep > 0);
    }

    public JPanel getStepPanel(int step) {
       if (step == 0) return jPanel0;
       if (step == 1) return jPanel1;
       if (step == 2) return jPanel2;
       if (step == 3) return jPanel3;
       return  null;
    }

    public String getReportFileName() {
        return reportFileName;
    }

    public void setReportFileName(String reportFileName) {
        this.reportFileName = reportFileName;
    }

    public SubReportElement getSubReportElement() {
        return subReportElement;
    }

    public void setSubReportElement(SubReportElement subReportElement) {
        this.subReportElement = subReportElement;
    }

    public BaseWizardPanel getWizardPanel() {
        return wizardPanel;
    }

    public void setWizardPanel(BaseWizardPanel wizardPanel) {
        this.wizardPanel = wizardPanel;
    }

    public javax.swing.JDialog getWizardDialog() {
        return wizardDialog;
    }

    public void setWizardDialog(javax.swing.JDialog wizardDialog) {
        this.wizardDialog = wizardDialog;
    }
    
    public void applyI18n(){
                // Start autogenerated code ----------------------
                jRadioButton1.setText(I18n.getString("subreportWizardExistingReport.radioButton1","Use the same connection used to fill the master report"));
                jRadioButton2.setText(I18n.getString("subreportWizardExistingReport.radioButton2","Use another connection"));
                jRadioButton3.setText(I18n.getString("subreportWizardExistingReport.radioButton3","Use a JRDataSource expression"));
                jRadioButton4.setText(I18n.getString("subreportWizardExistingReport.radioButton4","Store the directory name in a parameter"));
                jRadioButton5.setText(I18n.getString("subreportWizardExistingReport.radioButton5","Use a static absolute path reference"));
                jRadioButton6.setText(I18n.getString("subreportWizardExistingReport.radioButton6","Do not use any connection or datasource"));
                // End autogenerated code ----------------------
                // Start autogenerated code ----------------------
                jLabel1.setText(I18n.getString("subreportWizardExistingReport.label1","$P{SUBREPORT_DIR} + \"/name.jasper\""));
                jLabel2.setText(I18n.getString("subreportWizardExistingReport.label2","\" path reference \""));
                jLabel3.setText(I18n.getString("subreportWizardExistingReport.label3","Finish"));
                // End autogenerated code ----------------------
                
                jTableParameters.getColumnModel().getColumn(0).setHeaderValue( I18n.getString("subreportWizardExistingReport.tablecolumn.parameterName","Parameter name") );
                jTableParameters.getColumnModel().getColumn(1).setHeaderValue( I18n.getString("subreportWizardExistingReport.tablecolumn.expression","Expression") );

    }
}
