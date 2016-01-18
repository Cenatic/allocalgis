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
 * SortFieldDialog.java
 * 
 * Created on 9 maggio 2003, 17.25
 *
 */

package it.businesslogic.ireport.gui.subdataset;

import it.businesslogic.ireport.SortField;
import it.businesslogic.ireport.SubDataset;
import it.businesslogic.ireport.gui.sheet.Tag;
import it.businesslogic.ireport.util.I18n;
import it.businesslogic.ireport.util.Misc;

import java.util.Vector;
/**
 *
 * @author  Administrator
 */
public class SortFieldDialog extends javax.swing.JDialog {
    /**
     * Creates new form SortFieldDialog
     */
    private SortField tmpSortField = null;
    
    public SortFieldDialog(java.awt.Dialog parent, boolean modal) {
        
        super(parent, modal);
        initComponents();
        jComboBoxSortBy.setEditable(true);
        applyI18n();
        
        
        javax.swing.KeyStroke escape =  javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_ESCAPE, 0, false);
        javax.swing.Action escapeAction = new javax.swing.AbstractAction() {
            public void actionPerformed(java.awt.event.ActionEvent e) {
                jButtonCancelActionPerformed(e);
            }
        };
       
        getRootPane().getInputMap(javax.swing.JComponent.WHEN_IN_FOCUSED_WINDOW).put(escape, "ESCAPE");
        getRootPane().getActionMap().put("ESCAPE", escapeAction);


        //to make the default button ...
        this.getRootPane().setDefaultButton(this.jButtonOK);
        
        applyI18n();
        this.pack();
        
    }
    
    public void applyI18n()
    {
                // Start autogenerated code ----------------------
                // End autogenerated code ----------------------
        this.setTitle( I18n.getString("sortFieldDialog.title","Sort field") );
        jLabelSortBy.setText( I18n.getString("sortFieldDialog.labelSortBy","Sort by..."));
        jLabelSortType.setText( I18n.getString("sortFieldDialog.labelSortType","Sort type"));
        this.jComboBoxSortType.removeAllItems();
        this.jComboBoxSortType.addItem(new Tag("Ascending",I18n.getString("sortFieldDialog.Ascending","Ascending")));
        this.jComboBoxSortType.addItem(new Tag("Descending",I18n.getString("sortFieldDialog.Descending","Descending")));
        Misc.setComboboxSelectedTagValue(jComboBoxSortType, "Ascending");
        jButtonOK.setText( I18n.getString("ok","Ok"));
        jButtonCancel.setText(I18n.getString("cancel","Cancel"));
    }
    
    /**
     * Populate the fields combobox
     */
    private void setFieldNames(Vector fields)
    {
        jComboBoxSortBy.removeAllItems();
        if (fields != null)
        {
            for (int i=0; i<fields.size(); ++i)
            {
                jComboBoxSortBy.addItem( fields.get(i) + "" );
            }
        }
        
    }
    
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc=" Generated Code ">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jLabelSortBy = new javax.swing.JLabel();
        jComboBoxSortBy = new javax.swing.JComboBox();
        jSeparator1 = new javax.swing.JSeparator();
        jPanel1 = new javax.swing.JPanel();
        jButtonOK = new javax.swing.JButton();
        jButtonCancel = new javax.swing.JButton();
        jLabelSortType = new javax.swing.JLabel();
        jComboBoxSortType = new javax.swing.JComboBox();

        getContentPane().setLayout(new java.awt.GridBagLayout());

        setTitle("Add/modify parameter");
        setModal(true);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                closeDialog(evt);
            }
        });

        jLabelSortBy.setText("Sort by");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(4, 4, 0, 4);
        getContentPane().add(jLabelSortBy, gridBagConstraints);

        jComboBoxSortBy.setEditable(true);
        jComboBoxSortBy.setPreferredSize(new java.awt.Dimension(250, 22));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(4, 4, 4, 4);
        getContentPane().add(jComboBoxSortBy, gridBagConstraints);

        jSeparator1.setMinimumSize(new java.awt.Dimension(2, 2));
        jSeparator1.setPreferredSize(new java.awt.Dimension(2, 2));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.SOUTH;
        gridBagConstraints.weighty = 1.0;
        getContentPane().add(jSeparator1, gridBagConstraints);

        jPanel1.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.RIGHT));

        jButtonOK.setMnemonic('o');
        jButtonOK.setText("OK");
        jButtonOK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonOKActionPerformed(evt);
            }
        });

        jPanel1.add(jButtonOK);

        jButtonCancel.setMnemonic('c');
        jButtonCancel.setText("Cancel");
        jButtonCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelActionPerformed(evt);
            }
        });

        jPanel1.add(jButtonCancel);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 9;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.SOUTH;
        gridBagConstraints.weightx = 1.0;
        getContentPane().add(jPanel1, gridBagConstraints);

        jLabelSortType.setText("Sort type");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(4, 4, 0, 4);
        getContentPane().add(jLabelSortType, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(4, 4, 8, 4);
        getContentPane().add(jComboBoxSortType, gridBagConstraints);

        pack();
        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        java.awt.Dimension dialogSize = getSize();
        setLocation((screenSize.width-dialogSize.width)/2,(screenSize.height-dialogSize.height)/2);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelActionPerformed
        setVisible(false);
        this.setDialogResult( javax.swing.JOptionPane.CANCEL_OPTION);
        dispose();
    }//GEN-LAST:event_jButtonCancelActionPerformed

    private void jButtonOKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonOKActionPerformed
        
        String fieldName = (String)this.jComboBoxSortBy.getSelectedItem();
        if (fieldName == null) fieldName="";
        fieldName = fieldName.trim();
        
        if (fieldName.length() <= 0)
        {
            javax.swing.JOptionPane.showMessageDialog(this,
                    I18n.getString("sortFieldDialog.messageNotValidField","Please insert a valid field name!"),
                    I18n.getString("sortFieldDialog.messageTitleNotValidField","Invalid field!"),
                    javax.swing.JOptionPane.WARNING_MESSAGE );
            return;
        }
        
        tmpSortField = new SortField(
                    fieldName,
                    jComboBoxSortType.getSelectedIndex() == 1
                );

        setVisible(false);
        this.setDialogResult( javax.swing.JOptionPane.OK_OPTION);
        dispose();
    }//GEN-LAST:event_jButtonOKActionPerformed
    
    /** Closes the dialog */
    private void closeDialog(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_closeDialog
        setVisible(false);
        this.setDialogResult( javax.swing.JOptionPane.CLOSED_OPTION);
        dispose();
    }//GEN-LAST:event_closeDialog
    
    
    /** Getter for property dialogResult.
     * @return Value of property dialogResult.
     *
     */
    public int getDialogResult() {
        return dialogResult;
    }
    
    /** Setter for property dialogResult.
     * @param dialogResult New value of property dialogResult.
     *
     */
    public void setDialogResult(int dialogResult) {
        this.dialogResult = dialogResult;
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCancel;
    private javax.swing.JButton jButtonOK;
    private javax.swing.JComboBox jComboBoxSortBy;
    private javax.swing.JComboBox jComboBoxSortType;
    private javax.swing.JLabel jLabelSortBy;
    private javax.swing.JLabel jLabelSortType;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables

    private int dialogResult;    
    
    public void setSubDataset(SubDataset subDataset) {
    
       //jRTextExpressionAreaDefaultExpression.setSubDataset( subDataset);
       //jRTextExpressionAreaDefaultExpression.getTokenMarker().setKeywordLookup(subDataset.getKeywordLookup());
       setFieldNames( subDataset.getFields() );
       
    }

    /**
     * return a new sortField instance
     */
    public SortField getSortField() {
        return tmpSortField;
    }

    public void setSortField(SortField tmpSortField) {
        this.tmpSortField = new SortField(tmpSortField);
        this.jComboBoxSortBy.setSelectedItem( tmpSortField.getFieldName() );
        this.jComboBoxSortType.setSelectedIndex( (tmpSortField.isDesc() ? 1 : 0) );
    }
    
}
