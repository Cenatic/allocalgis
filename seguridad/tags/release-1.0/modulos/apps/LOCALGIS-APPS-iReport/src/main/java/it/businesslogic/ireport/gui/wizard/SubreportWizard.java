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
 * SubreportWizard.java
 * 
 * Created on March 22, 2006, 8:52 PM
 *
 */

package it.businesslogic.ireport.gui.wizard;

import it.businesslogic.ireport.SubReportElement;
import it.businesslogic.ireport.gui.JReportFrame;
import it.businesslogic.ireport.gui.MainFrame;
import it.businesslogic.ireport.gui.wizard.SubreportWizardExistingReport;
import it.businesslogic.ireport.util.Misc;
import javax.swing.JDialog;
import javax.swing.JFileChooser;
import javax.swing.JPanel;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import it.businesslogic.ireport.util.I18n;

/**
 *
 * @author  gtoffoli
 */
public class SubreportWizard extends javax.swing.JPanel implements GenericWizard {
    
    private String reportFileName = null;
    private SubReportElement subReportElement = null;
    private JReportFrame jReportFrame = null;
    private JDialog wizardDialog = null;

    
    private BaseWizardPanel baseWizardPanel = null;

    public BaseWizardPanel getBaseWizardPanel() {
        return baseWizardPanel;
    }

    public void setBaseWizardPanel(BaseWizardPanel baseWizardPanel) {
        this.baseWizardPanel = baseWizardPanel;
    }
   
    /** Creates new form SubreportWizardPanes */
    public SubreportWizard() {
        initComponents();
        applyI18n();
        jTextFieldReportFileName.getDocument().addDocumentListener( new DocumentListener() {
            public void changedUpdate(DocumentEvent e) {
                if (baseWizardPanel != null) baseWizardPanel.updateButtons();
            }
            public void insertUpdate(DocumentEvent e) {
                if (baseWizardPanel != null) baseWizardPanel.updateButtons();
            }
            public void removeUpdate(DocumentEvent e) {
                if (baseWizardPanel != null) baseWizardPanel.updateButtons();
            }
        });
    }
    
    public void startWizard()
    {
        setJReportFrame(MainFrame.getMainInstance().getActiveReportFrame());      
        wizardDialog = new JDialog(MainFrame.getMainInstance(),true);
        baseWizardPanel = new it.businesslogic.ireport.gui.wizard.BaseWizardPanel();
        baseWizardPanel.setGenericWizard(this);
        wizardDialog.getContentPane().add(baseWizardPanel);
        wizardDialog.pack();
        Misc.centerFrame(wizardDialog);
        
        wizardDialog.setVisible(true);
    }
    
    
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc=" Generated Code ">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jPanel1 = new javax.swing.JPanel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();
        jRadioButton2 = new javax.swing.JRadioButton();
        jPanel2 = new javax.swing.JPanel();
        jTextFieldReportFileName = new javax.swing.JTextField();
        jButtonBrowse = new javax.swing.JButton();
        jRadioButton3 = new javax.swing.JRadioButton();
        buttonGroup1 = new javax.swing.ButtonGroup();

        jPanel1.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                jPanel1PropertyChange(evt);
            }
        });
        jPanel1.setLayout(new java.awt.GridBagLayout());

        buttonGroup1.add(jRadioButton1);
        jRadioButton1.setSelected(true);
        jRadioButton1.setText("Create a new report");
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
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.SOUTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(0, 20, 0, 0);
        jPanel1.add(jRadioButton1, gridBagConstraints);

        jLabel1.setForeground(new java.awt.Color(255, 0, 0));
        jLabel1.setText("Save the current report first!");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(0, 40, 0, 0);
        jPanel1.add(jLabel1, gridBagConstraints);

        buttonGroup1.add(jRadioButton2);
        jRadioButton2.setText("Use an exsisting report");
        jRadioButton2.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        jRadioButton2.setFocusPainted(false);
        jRadioButton2.setMargin(new java.awt.Insets(0, 0, 0, 0));
        jRadioButton2.setPreferredSize(new java.awt.Dimension(129, 20));
        jRadioButton2.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jRadioButton2ItemStateChanged(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(24, 20, 0, 0);
        jPanel1.add(jRadioButton2, gridBagConstraints);

        jPanel2.setLayout(new java.awt.GridBagLayout());

        jTextFieldReportFileName.setMinimumSize(new java.awt.Dimension(100, 19));
        jTextFieldReportFileName.setPreferredSize(new java.awt.Dimension(250, 19));
        jTextFieldReportFileName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldReportFileNameActionPerformed(evt);
            }
        });
        jPanel2.add(jTextFieldReportFileName, new java.awt.GridBagConstraints());

        jButtonBrowse.setText("Browse");
        jButtonBrowse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBrowseActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.weightx = 1.0;
        jPanel2.add(jButtonBrowse, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(4, 40, 0, 0);
        jPanel1.add(jPanel2, gridBagConstraints);

        buttonGroup1.add(jRadioButton3);
        jRadioButton3.setText("Just create the subreport element");
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
        gridBagConstraints.insets = new java.awt.Insets(24, 20, 0, 0);
        jPanel1.add(jRadioButton3, gridBagConstraints);

        setLayout(new java.awt.BorderLayout());
    }// </editor-fold>//GEN-END:initComponents

private void jRadioButton3ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jRadioButton3ItemStateChanged
    getBaseWizardPanel().updateButtons();
}//GEN-LAST:event_jRadioButton3ItemStateChanged

    private void jButtonBrowseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBrowseActionPerformed
        
        // jfilechooser...
	    JFileChooser jfc = new JFileChooser();
	    jfc.setFileFilter( new javax.swing.filechooser.FileFilter() {
		    public boolean accept(java.io.File file) {
			    String filename = file.getName().toLowerCase();
			    return (filename.endsWith(".xml") || filename.endsWith(".jrxml") || filename.endsWith(".jasper") || file.isDirectory()) ;
		    }
		    public String getDescription() {
			    return "JasperReports Report file *.xml;*jrxml;*.jasper";
		    }
	    });
	    if (jfc.showOpenDialog(null) == JFileChooser.APPROVE_OPTION) {
		    jTextFieldReportFileName.setText( jfc.getSelectedFile().getPath());
                    jRadioButton2.setSelected(true);
            }
        getBaseWizardPanel().updateButtons();
    }//GEN-LAST:event_jButtonBrowseActionPerformed

    private void jRadioButton1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jRadioButton1ItemStateChanged
        getBaseWizardPanel().updateButtons();
    }//GEN-LAST:event_jRadioButton1ItemStateChanged

    private void jRadioButton2ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jRadioButton2ItemStateChanged
        
        getBaseWizardPanel().updateButtons();
    }//GEN-LAST:event_jRadioButton2ItemStateChanged

    private void jPanel1PropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jPanel1PropertyChange

        
        
    }//GEN-LAST:event_jPanel1PropertyChange

    private void jTextFieldReportFileNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldReportFileNameActionPerformed
    
        
        getBaseWizardPanel().updateButtons();
            
            
    }//GEN-LAST:event_jTextFieldReportFileNameActionPerformed
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButtonBrowse;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JTextField jTextFieldReportFileName;
    // End of variables declaration//GEN-END:variables


    public String[] getStepsNames() {
        
        String[] names = new String[1];
        //
        names[0] = I18n.getString("subreportWizard.stepsnames.reportSelection","Report selection");
        //names[0] = "Report selection";
        //
        
        return names;
    }

    public String getStepDescription(int step) {
        
    	//
        if (step==0) return
        		I18n.getString("subreportWizard.stepdescription.step0","New or exsisting report...");
        		//"New or exsisting report...";
        //
        
        return "";
    }

    public void initWizard() {
        
        jLabel1.setVisible(!(MainFrame.getMainInstance().getActiveReportFrame().getReport().getFilename() != null &&
            MainFrame.getMainInstance().getActiveReportFrame().getReport().getFilename().trim().length() > 0));
    }

    public void finish(int currentStep) {
        
        wizardDialog.setVisible(false);
        wizardDialog.dispose();
            
        if (currentStep == -1)
        {
            
        }
    }
    
    public boolean nextStep(int nextStep) {
        
        if (nextStep == 1) // First step == 0
        {
            if (jRadioButton1.isSelected())
            {
                // Close the current wizard and start the new wizard 2...
                SubreportWizardNewReport wizard2 = new SubreportWizardNewReport();
                wizard2.setSubReportElement(getSubReportElement());
                wizard2.setReportFileName( jTextFieldReportFileName.getText());
                wizard2.setWizardPanel( baseWizardPanel );
                wizard2.setWizardDialog( wizardDialog);
                baseWizardPanel.setGenericWizard( wizard2 );
            }
            else if (jRadioButton2.isSelected())
            {
                // Close the current wizard and start the new wizard 3...
                SubreportWizardExistingReport wizard2 = new SubreportWizardExistingReport();
                wizard2.setSubReportElement(getSubReportElement());
                wizard2.setReportFileName( jTextFieldReportFileName.getText());
                wizard2.setWizardPanel( baseWizardPanel );
                wizard2.setWizardDialog( wizardDialog);
                baseWizardPanel.setGenericWizard( wizard2 );
            }
            else
            {
                return true;
            }
            return false;
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
        
        if (jRadioButton1.isSelected() &&
            MainFrame.getMainInstance().getActiveReportFrame().getReport().getFilename() != null &&
            MainFrame.getMainInstance().getActiveReportFrame().getReport().getFilename().trim().length() > 0)
        {
            return true;
        }
        if (jRadioButton3.isSelected()) return true;
        
        if (jTextFieldReportFileName.getText().trim().length() > 0) return true;
        
        return false;
    }

    public boolean canPrevious(int currentStep) {
        return false;
    }

    public JPanel getStepPanel(int step) {
       return jPanel1;
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

    public JReportFrame getJReportFrame() {
        return jReportFrame;
    }

    public void setJReportFrame(JReportFrame jReportFrame) {
        this.jReportFrame = jReportFrame;
    }
    
    public void applyI18n(){
                // Start autogenerated code ----------------------
                jRadioButton1.setText(I18n.getString("subreportWizard.radioButton1","Create a new report"));
                jRadioButton2.setText(I18n.getString("subreportWizard.radioButton2","Use an exsisting report"));
                // End autogenerated code ----------------------
                // Start autogenerated code ----------------------
                jButtonBrowse.setText(I18n.getString("subreportWizard.buttonBrowse","Browse"));
                jLabel1.setText(I18n.getString("subreportWizard.label1","Save the current report first!"));
                // End autogenerated code ----------------------
    }
}
