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
 * MeterIntervalsDialog.java
 * 
 * Created on September 27, 2006, 1:16 AM
 *
 */

package it.businesslogic.ireport.gui.sheet;

import it.businesslogic.ireport.chart.MeterInterval;
import it.businesslogic.ireport.util.Misc;
import java.awt.event.ActionEvent;
import java.text.DecimalFormat;
import javax.swing.DefaultListSelectionModel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableColumnModel;
import javax.swing.table.DefaultTableModel;
import it.businesslogic.ireport.util.I18n;

/**
 *
 * @author  gtoffoli
 */
public class MeterIntervalsDialog extends javax.swing.JDialog {
    
    private int dialogResult = javax.swing.JOptionPane.CANCEL_OPTION;
    private java.util.List meterIntervals = null;
    
    public static java.util.List clipboard = new java.util.ArrayList();
    public static java.util.List lastIntervals = new java.util.ArrayList();
    
    /** Creates new form SeriesColorsDialog */
    public MeterIntervalsDialog(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initAll();
    }
    
    /** Creates new form SeriesColorsDialog */
    public MeterIntervalsDialog(java.awt.Dialog parent, boolean modal) {
        super(parent, modal);
        initAll();
    }
    
    public void initAll()
    {
        initComponents();
        
        applyI18n();
        //jList1.setCellRenderer(new ColorsListCellRenderer());
        
        jButtonPasteInterval.setEnabled( clipboard.size() > 0 );
        jButtonUseLast.setEnabled( lastIntervals.size() > 0 );
        
         ((DefaultTableColumnModel)jTable1.getColumnModel()).getColumn(0).setCellRenderer(new MeterIntervalTableCellRenderer());
         ((DefaultTableColumnModel)jTable1.getColumnModel()).getColumn(1).setPreferredWidth(50);
         DefaultTableCellRenderer dtcr = new DefaultTableCellRenderer();
         dtcr.setHorizontalAlignment( SwingConstants.CENTER  );
         ((DefaultTableColumnModel)jTable1.getColumnModel()).getColumn(1).setCellRenderer(dtcr);
            
         this.pack();
         Misc.centerFrame(this);
        
        jTable1.getSelectionModel().addListSelectionListener( new ListSelectionListener()
        {
            public void valueChanged(ListSelectionEvent e) 
            {
                jTable1ValueChanged(e);
            }
        });
    }
    
    private void jTable1ValueChanged(javax.swing.event.ListSelectionEvent evt) {                                    

        
        if (jTable1.getSelectedRowCount() > 0)
        {
            jButtonDelete.setEnabled(true);
            jButtonModify.setEnabled(true);
            jButtonMoveUp.setEnabled(jTable1.getSelectedRow() > 0);
            jButtonMoveDown.setEnabled(jTable1.getSelectedRow() < jTable1.getRowCount()-1);
        }
        else
        {
            jButtonModify.setEnabled(false);
            jButtonDelete.setEnabled(false);
            jButtonMoveUp.setEnabled(false);
            jButtonMoveDown.setEnabled(false);
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

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jButtonAdd = new javax.swing.JButton();
        jButtonModify = new javax.swing.JButton();
        jButtonDelete = new javax.swing.JButton();
        jButtonMoveUp = new javax.swing.JButton();
        jButtonMoveDown = new javax.swing.JButton();
        jButtonCopyInterval = new javax.swing.JButton();
        jButtonPasteInterval = new javax.swing.JButton();
        jButtonUseLast = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jPanel1 = new javax.swing.JPanel();
        jButtonOk = new javax.swing.JButton();
        jButtonCancel = new javax.swing.JButton();

        getContentPane().setLayout(new java.awt.GridBagLayout());

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Label", "Alpha", "Low exp", "High exp"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });

        jScrollPane1.setViewportView(jTable1);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(4, 4, 4, 4);
        getContentPane().add(jScrollPane1, gridBagConstraints);

        jPanel2.setLayout(new java.awt.GridBagLayout());

        jPanel2.setMinimumSize(new java.awt.Dimension(150, 150));
        jPanel2.setPreferredSize(new java.awt.Dimension(100, 283));
        jButtonAdd.setText("Add");
        jButtonAdd.setMargin(new java.awt.Insets(2, 8, 2, 8));
        jButtonAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAddActionPerformed(evt);
            }
        });

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(0, 4, 4, 4);
        jPanel2.add(jButtonAdd, gridBagConstraints);

        jButtonModify.setText("Modify");
        jButtonModify.setEnabled(false);
        jButtonModify.setMargin(new java.awt.Insets(2, 8, 2, 8));
        jButtonModify.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonModifyActionPerformed(evt);
            }
        });

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(0, 4, 4, 4);
        jPanel2.add(jButtonModify, gridBagConstraints);

        jButtonDelete.setText("Delete");
        jButtonDelete.setEnabled(false);
        jButtonDelete.setMargin(new java.awt.Insets(2, 8, 2, 8));
        jButtonDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDeleteActionPerformed(evt);
            }
        });

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(0, 4, 4, 4);
        jPanel2.add(jButtonDelete, gridBagConstraints);

        jButtonMoveUp.setText("Move up");
        jButtonMoveUp.setEnabled(false);
        jButtonMoveUp.setMargin(new java.awt.Insets(2, 8, 2, 8));
        jButtonMoveUp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMoveUpActionPerformed(evt);
            }
        });

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(0, 4, 4, 4);
        jPanel2.add(jButtonMoveUp, gridBagConstraints);

        jButtonMoveDown.setText("Move down");
        jButtonMoveDown.setEnabled(false);
        jButtonMoveDown.setMargin(new java.awt.Insets(2, 8, 2, 8));
        jButtonMoveDown.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMoveDownActionPerformed(evt);
            }
        });

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(0, 4, 14, 4);
        jPanel2.add(jButtonMoveDown, gridBagConstraints);

        jButtonCopyInterval.setText("Copy intervals");
        jButtonCopyInterval.setMargin(new java.awt.Insets(2, 8, 2, 8));
        jButtonCopyInterval.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCopyIntervalActionPerformed(evt);
            }
        });

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(0, 4, 4, 4);
        jPanel2.add(jButtonCopyInterval, gridBagConstraints);

        jButtonPasteInterval.setText("Paste intervals");
        jButtonPasteInterval.setEnabled(false);
        jButtonPasteInterval.setMargin(new java.awt.Insets(2, 8, 2, 8));
        jButtonPasteInterval.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPasteIntervalActionPerformed(evt);
            }
        });

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(0, 4, 4, 4);
        jPanel2.add(jButtonPasteInterval, gridBagConstraints);

        jButtonUseLast.setText("Use last");
        jButtonUseLast.setEnabled(false);
        jButtonUseLast.setMargin(new java.awt.Insets(2, 8, 2, 8));
        jButtonUseLast.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPasteIntervalActionPerformed1(evt);
            }
        });

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(0, 4, 4, 4);
        jPanel2.add(jButtonUseLast, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(4, 0, 4, 4);
        getContentPane().add(jPanel2, gridBagConstraints);

        jSeparator1.setMinimumSize(new java.awt.Dimension(0, 2));
        jSeparator1.setPreferredSize(new java.awt.Dimension(3, 2));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        getContentPane().add(jSeparator1, gridBagConstraints);

        jPanel1.setLayout(new java.awt.GridBagLayout());

        jPanel1.setPreferredSize(new java.awt.Dimension(320, 23));
        jButtonOk.setText("OK");
        jButtonOk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonOkActionPerformed(evt);
            }
        });

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 4);
        jPanel1.add(jButtonOk, gridBagConstraints);

        jButtonCancel.setText("Cancel");
        jButtonCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelActionPerformed(evt);
            }
        });

        jPanel1.add(jButtonCancel, new java.awt.GridBagConstraints());

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(4, 4, 4, 4);
        getContentPane().add(jPanel1, gridBagConstraints);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        openExtraWindows();
    }//GEN-LAST:event_formWindowOpened

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked

         if (evt.getButton() == evt.BUTTON1 && evt.getClickCount() == 2)
        {
            jButtonModifyActionPerformed(null);
        }
        
    }//GEN-LAST:event_jTable1MouseClicked

    private void jButtonPasteIntervalActionPerformed1(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPasteIntervalActionPerformed1
        if (lastIntervals.size() > 0)
        {
            for (int i=0; i<lastIntervals.size(); ++i)
            {
                addRowValues( ((MeterInterval)lastIntervals.get(i)).cloneMe() );
            }
        }
    }//GEN-LAST:event_jButtonPasteIntervalActionPerformed1

    private void jButtonPasteIntervalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPasteIntervalActionPerformed

        if (clipboard.size() > 0)
        {
            for (int i=0; i<clipboard.size(); ++i)
            {
                addRowValues( ((MeterInterval)clipboard.get(i)).cloneMe() );
            }
        }
        
        
    }//GEN-LAST:event_jButtonPasteIntervalActionPerformed

    private void jButtonCopyIntervalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCopyIntervalActionPerformed

        if (jTable1.getRowCount() > 0)
        {
            clipboard.clear();
            for (int i=0; i<jTable1.getRowCount(); ++i)
            {
                clipboard.add( ((MeterInterval)jTable1.getValueAt(i,0)).cloneMe() );
            }
        }
        
        jButtonPasteInterval.setEnabled(true);
    }//GEN-LAST:event_jButtonCopyIntervalActionPerformed

    private void jButtonCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelActionPerformed

        setDialogResult( JOptionPane.CANCEL_OPTION);
        setVisible(false);
        dispose();
        
    }//GEN-LAST:event_jButtonCancelActionPerformed

    private void jButtonOkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonOkActionPerformed

        
        java.util.List temp_list = new java.util.ArrayList();

        lastIntervals.clear();
        
        for (int i=0; i<jTable1.getRowCount(); ++i)
        {
            temp_list.add( ((MeterInterval)jTable1.getValueAt(i,0)).cloneMe() );
            lastIntervals.add( ((MeterInterval)jTable1.getValueAt(i,0)).cloneMe() );
        }
        
        setMeterIntervals( temp_list );
        setDialogResult(JOptionPane.OK_OPTION);
        this.setVisible(false);
        this.dispose();
        
    }//GEN-LAST:event_jButtonOkActionPerformed

    private void jButtonMoveDownActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMoveDownActionPerformed
        if (jTable1.getSelectedRowCount() > 0)
        {
            DefaultTableModel dtm = (DefaultTableModel)jTable1.getModel();
            int[] indices = jTable1.getSelectedRows();
            for (int i=indices.length-1; i>=0; --i)
            {
                if (indices[i] >= (jTable1.getRowCount() -1)) continue;

                Object val = jTable1.getValueAt( indices[i], 0);
                dtm.removeRow(indices[i]);
                dtm.insertRow(indices[i]+1, new Object[5]  );
                setRowValues( (MeterInterval)val, indices[i]+1);
                indices[i]++;
            }
            
            DefaultListSelectionModel dlsm = (DefaultListSelectionModel)jTable1.getSelectionModel();
            dlsm.setValueIsAdjusting(true);
            dlsm.clearSelection();
            for (int i=0; i<indices.length; ++i)
            {
                dlsm.addSelectionInterval(indices[i],  indices[i]);
            }
            dlsm.setValueIsAdjusting( false ); 
        }
    }//GEN-LAST:event_jButtonMoveDownActionPerformed

    private void jButtonMoveUpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMoveUpActionPerformed

    if (jTable1.getSelectedRow() > 0)
        {
            DefaultTableModel dtm = (DefaultTableModel)jTable1.getModel();
            int[] indices = jTable1.getSelectedRows();
            for (int i=indices.length-1; i>=0; --i)
            {
                if (indices[i] == 0) continue;

                Object val = jTable1.getValueAt( indices[i], 0);
                dtm.removeRow(indices[i]);
                dtm.insertRow(indices[i]-1, new Object[5]  );
                setRowValues( (MeterInterval)val, indices[i]-1);
                indices[i]--;
            }
            
            DefaultListSelectionModel dlsm = (DefaultListSelectionModel)jTable1.getSelectionModel();
            dlsm.setValueIsAdjusting(true);
            dlsm.clearSelection();
            for (int i=0; i<indices.length; ++i)
            {
                dlsm.addSelectionInterval(indices[i],  indices[i]);
            }
            dlsm.setValueIsAdjusting( false ); 
        }
    }//GEN-LAST:event_jButtonMoveUpActionPerformed

    private void jButtonDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDeleteActionPerformed

        
        int[] indexes = jTable1.getSelectedRows();
        
        for (int i=indexes.length-1;  i>=0; --i)
        {
            ((DefaultTableModel)jTable1.getModel()).removeRow(indexes[i]);
        }
        jTable1.updateUI();
        
    }//GEN-LAST:event_jButtonDeleteActionPerformed

    private void jButtonModifyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonModifyActionPerformed

        int index = jTable1.getSelectedRow();
        if (index >=0)
        {
                MeterInterval c = (MeterInterval)jTable1.getValueAt(jTable1.getSelectedRow(), 0);
                MeterIntervalDialog cc = new MeterIntervalDialog(this, true);
                cc.setMeterInterval( c );
                if (newInfo != null)
                {
                    cc.setFocusedExpression(newInfo);
                }
                cc.setVisible(true);
                
                if (cc.getDialogResult() == JOptionPane.OK_OPTION)
                {
                    setRowValues(c, index);
                }
        }
        
    }//GEN-LAST:event_jButtonModifyActionPerformed

    private void jButtonAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAddActionPerformed
        
        MeterIntervalDialog cc = new MeterIntervalDialog(this, true);
        cc.setVisible(true);
                
        if (cc.getDialogResult() == JOptionPane.OK_OPTION)
        {
            addRowValues(cc.getMeterInterval());
        }
        
    }//GEN-LAST:event_jButtonAddActionPerformed
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SeriesColorsDialog(new javax.swing.JFrame(), true).setVisible(true);
            }
        });
    }

    public int getDialogResult() {
        return dialogResult;
    }

    public void setDialogResult(int dialogResult) {
        this.dialogResult = dialogResult;
    }


    public void setRowValues(MeterInterval mi, int row)
    {
        DecimalFormat dnf = new DecimalFormat("0.00");
        jTable1.setValueAt(mi, row, 0);
        jTable1.setValueAt(dnf.format(mi.getAlpha()) , row, 1);
        jTable1.setValueAt(mi.getDataRange().getLowExpression(), row, 2);
        jTable1.setValueAt(mi.getDataRange().getHighExpression(), row, 3);
        jTable1.updateUI();
    }
    
    public void addRowValues(MeterInterval mi)
    {
        DecimalFormat dnf = new DecimalFormat("0.00");
        DefaultTableModel dtm = (DefaultTableModel)jTable1.getModel();
        dtm.addRow(new Object[]{mi, dnf.format(mi.getAlpha()), mi.getDataRange().getLowExpression(), mi.getDataRange().getHighExpression()} );
        jTable1.updateUI();
    }

    public java.util.List getMeterIntervals() {
        return meterIntervals;
    }

    public void setMeterIntervals(java.util.List meterIntervals) {
        this.meterIntervals = meterIntervals;
        
        DefaultTableModel dtm = (DefaultTableModel)jTable1.getModel();
        dtm.setRowCount(0);
        
        for (int i=0; i<meterIntervals.size(); ++i)
        {
            addRowValues( ((MeterInterval)meterIntervals.get(i)).cloneMe() );
        }
        
        jTable1.updateUI();
    }

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAdd;
    private javax.swing.JButton jButtonCancel;
    private javax.swing.JButton jButtonCopyInterval;
    private javax.swing.JButton jButtonDelete;
    private javax.swing.JButton jButtonModify;
    private javax.swing.JButton jButtonMoveDown;
    private javax.swing.JButton jButtonMoveUp;
    private javax.swing.JButton jButtonOk;
    private javax.swing.JButton jButtonPasteInterval;
    private javax.swing.JButton jButtonUseLast;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
    
    public void applyI18n(){
                // Start autogenerated code ----------------------
                jButtonAdd.setText(I18n.getString("meterIntervalsDialog.buttonAdd","Add"));
                jButtonCancel.setText(I18n.getString("meterIntervalsDialog.buttonCancel","Cancel"));
                jButtonCopyInterval.setText(I18n.getString("meterIntervalsDialog.buttonCopyInterval","Copy intervals"));
                jButtonDelete.setText(I18n.getString("meterIntervalsDialog.buttonDelete","Delete"));
                jButtonModify.setText(I18n.getString("meterIntervalsDialog.buttonModify","Modify"));
                jButtonMoveDown.setText(I18n.getString("meterIntervalsDialog.buttonMoveDown","Move down"));
                jButtonMoveUp.setText(I18n.getString("meterIntervalsDialog.buttonMoveUp","Move up"));
                jButtonOk.setText(I18n.getString("meterIntervalsDialog.buttonOk","OK"));
                jButtonPasteInterval.setText(I18n.getString("meterIntervalsDialog.buttonPasteInterval","Paste intervals"));
                jButtonUseLast.setText(I18n.getString("meterIntervalsDialog.buttonUseLast","Use last"));
                // End autogenerated code ----------------------
                
                jTable1.getColumnModel().getColumn(0).setHeaderValue( I18n.getString("meterIntervalsDialog.tablecolumn.label","Label") );
                jTable1.getColumnModel().getColumn(1).setHeaderValue( I18n.getString("meterIntervalsDialog.tablecolumn.alpha","Alpha") );
                jTable1.getColumnModel().getColumn(2).setHeaderValue( I18n.getString("meterIntervalsDialog.tablecolumn.lowExp","Low exp") );
                jTable1.getColumnModel().getColumn(3).setHeaderValue( I18n.getString("meterIntervalsDialog.tablecolumn.highExp","High exp") );
                
                jButtonCancel.setMnemonic(I18n.getString("meterIntervalsDialog.buttonCancelMnemonic","c").charAt(0));
                jButtonOk.setMnemonic(I18n.getString("meterIntervalsDialog.buttonOkMnemonic","o").charAt(0));
    }
    
    public static final int COMPONENT_NONE=0;
    public static final int COMPONENT_INTERVALS_LIST=1;
    
    /**
     * This variable is checked by openExtraWindows() called when the component is shown.
     * If the value is != 0, the modify button will be action-performed.
     */
    public Object[]  newInfo = null;
    /**
     * This method set the focus on a specific component.
     * 
     * For this kind of datasource otherInfo must be:
     * [0] = Fixed to COMPONENT_PERIOD_SERIES_LIST (used for future extensions)
     * [1] = Integer, the category series to edit
     * [2] = The expression id in the category window to focus on 
     * [3] = The expression in the hyperlink...
     * [4] = The hyperlink parameter
     * [5] = The expression of the hyperlink parameter
     */
    public void setFocusedExpression(Object[] expressionInfo)
    {
        if (expressionInfo == null) return;
        int expID = ((Integer)expressionInfo[0]).intValue();
        switch (expID)
        {
            case COMPONENT_INTERVALS_LIST:
                int index = ((Integer)expressionInfo[1]).intValue();
                
                if (index >=0 && jTable1.getRowCount() > index )
                {
                    jTable1.setRowSelectionInterval(index, index);
                    newInfo = new Object[expressionInfo.length-2];
                    for (int i=2; i< expressionInfo.length; ++i) newInfo[i-2] = expressionInfo[i];
                    break;
                }
        }
    }
    
    /**
     * This method checks for the variable subExpID. It is called when the component is shown.
     * If the value is >= 0, the modify button will be action-performed
     */
    private void openExtraWindows()
    {
        if (newInfo != null)
        {
            jButtonModifyActionPerformed(new ActionEvent(jButtonModify,0,""));
        }
        newInfo = null;
    }
}
