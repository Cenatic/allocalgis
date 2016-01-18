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
 * FontsPathDialog.java
 *
 * Created on 22 aprile 2005, 18.05
 *
 */

package it.businesslogic.ireport.gui.fonts;

import it.businesslogic.ireport.gui.ClassPathDialog;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Arrays;
import java.util.StringTokenizer;
import java.util.Vector;

import javax.swing.DefaultListModel;
import javax.swing.JCheckBox;
/**
 *
 * @author  Administrator
 */
public class FontsPathDialog extends javax.swing.JDialog {

    private int dialogResult = javax.swing.JOptionPane.CANCEL_OPTION;
    private boolean modifiedPath = false;
    /** Creates new form ClassPathDialog */
    public FontsPathDialog(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        applyI18n();    
        jList1.setModel(new DefaultListModel());
        it.businesslogic.ireport.util.Misc.centerFrame( this );


        javax.swing.KeyStroke escape =  javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_ESCAPE, 0, false);
        javax.swing.Action escapeAction = new javax.swing.AbstractAction() {
            public void actionPerformed(java.awt.event.ActionEvent e) {
                jButtonCancelActionPerformed(e);
            }
        };

        getRootPane().getInputMap(javax.swing.JComponent.WHEN_IN_FOCUSED_WINDOW).put(escape, "ESCAPE");
        getRootPane().getActionMap().put("ESCAPE", escapeAction);


        jList1.addMouseListener(new MouseAdapter()
        {
            public void mousePressed(MouseEvent e)
            {
               modifiedPath = true;
            }
         });

        //to make the default button ...
        this.getRootPane().setDefaultButton(this.jButtonSave);
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc=" Generated Code ">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jLabelClasspath = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new it.businesslogic.ireport.gui.fonts.CheckBoxList();
        jPanel1 = new javax.swing.JPanel();
        jButtonSelectAll = new javax.swing.JButton();
        jButtonDeselectAll = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jButtonSave = new javax.swing.JButton();
        jButtonCancel = new javax.swing.JButton();

        getContentPane().setLayout(new java.awt.GridBagLayout());

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle(it.businesslogic.ireport.util.I18n.getString("fonts", "Classpath"));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jLabelClasspath.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabelClasspath.setText(it.businesslogic.ireport.util.I18n.getString("fonts", "Fonts path"));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 1;
        gridBagConstraints.insets = new java.awt.Insets(4, 4, 4, 4);
        getContentPane().add(jLabelClasspath, gridBagConstraints);

        jScrollPane1.setPreferredSize(new java.awt.Dimension(359, 260));
        jList1.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(jList1);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(0, 4, 4, 4);
        getContentPane().add(jScrollPane1, gridBagConstraints);

        jPanel1.setLayout(new java.awt.GridBagLayout());

        jPanel1.setMinimumSize(new java.awt.Dimension(120, 10));
        jPanel1.setPreferredSize(new java.awt.Dimension(120, 10));
        jButtonSelectAll.setText(it.businesslogic.ireport.util.I18n.getString("selectAll", "Select all"));
        jButtonSelectAll.setMaximumSize(new java.awt.Dimension(200, 26));
        jButtonSelectAll.setMinimumSize(new java.awt.Dimension(90, 26));
        jButtonSelectAll.setPreferredSize(new java.awt.Dimension(120, 26));
        jButtonSelectAll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSelectAllActionPerformed(evt);
            }
        });

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 4, 0);
        jPanel1.add(jButtonSelectAll, gridBagConstraints);

        jButtonDeselectAll.setText(it.businesslogic.ireport.util.I18n.getString("deSelectAll", "Deselect all"));
        jButtonDeselectAll.setMaximumSize(new java.awt.Dimension(200, 26));
        jButtonDeselectAll.setMinimumSize(new java.awt.Dimension(90, 26));
        jButtonDeselectAll.setPreferredSize(new java.awt.Dimension(120, 26));
        jButtonDeselectAll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDeselectAllActionPerformed(evt);
            }
        });

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 4, 0);
        jPanel1.add(jButtonDeselectAll, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.weighty = 1.0;
        jPanel1.add(jPanel2, gridBagConstraints);

        jButtonSave.setText(it.businesslogic.ireport.util.I18n.getString("saveFontPath", "Save fonts path"));
        jButtonSave.setMaximumSize(new java.awt.Dimension(200, 26));
        jButtonSave.setMinimumSize(new java.awt.Dimension(90, 26));
        jButtonSave.setPreferredSize(new java.awt.Dimension(120, 26));
        jButtonSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSaveActionPerformed(evt);
            }
        });

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 4, 0);
        jPanel1.add(jButtonSave, gridBagConstraints);

        jButtonCancel.setText(it.businesslogic.ireport.util.I18n.getString("cancel", "Cancel"));
        jButtonCancel.setMaximumSize(new java.awt.Dimension(200, 26));
        jButtonCancel.setMinimumSize(new java.awt.Dimension(90, 26));
        jButtonCancel.setPreferredSize(new java.awt.Dimension(120, 26));
        jButtonCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelActionPerformed(evt);
            }
        });

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 4, 0);
        jPanel1.add(jButtonCancel, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 4, 4);
        getContentPane().add(jPanel1, gridBagConstraints);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonDeselectAllActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDeselectAllActionPerformed
        DefaultListModel dlm = (DefaultListModel)jList1.getModel();

        for (int i=0; i<dlm.size(); ++i)
        {
            Object obj = dlm.getElementAt(i);
            if (obj instanceof JCheckBox)
            {
                JCheckBox checkbox = (JCheckBox)obj;
                checkbox.setSelected(false);
            }
        }
        jList1.updateUI();
    }//GEN-LAST:event_jButtonDeselectAllActionPerformed

    private void jButtonSelectAllActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSelectAllActionPerformed

        DefaultListModel dlm = (DefaultListModel)jList1.getModel();

        for (int i=0; i<dlm.size(); ++i)
        {
            Object obj = dlm.getElementAt(i);
            if (obj instanceof JCheckBox)
            {
                JCheckBox checkbox = (JCheckBox)obj;
                checkbox.setSelected(true);
            }
        }
        jList1.updateUI();

    }//GEN-LAST:event_jButtonSelectAllActionPerformed

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed

    }//GEN-LAST:event_formWindowClosed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing

        if (modifiedPath)
        {
            int ret = javax.swing.JOptionPane.showConfirmDialog(this, it.businesslogic.ireport.util.I18n.getString("saveFontsPathQuestion", "Do you want save the fontspath ?"));

            if (ret == javax.swing.JOptionPane.CANCEL_OPTION)
            {
                return;
            }

            jButtonSaveActionPerformed(null);
        }
        else
        {
            setVisible(false);
        }
    }//GEN-LAST:event_formWindowClosing

    private void jButtonCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelActionPerformed
        setVisible(false);
    }//GEN-LAST:event_jButtonCancelActionPerformed

    private void jButtonSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSaveActionPerformed

        javax.swing.JOptionPane.showMessageDialog(this,it.businesslogic.ireport.util.I18n.getString("saveFontsRestartInfo", "You have to restart iReport for the changes to take effect"));

        setDialogResult(javax.swing.JOptionPane.OK_OPTION);
        setVisible(false);
    }//GEN-LAST:event_jButtonSaveActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ClassPathDialog(new javax.swing.JFrame(), true).setVisible(true);
            }
        });
    }

    public void setFontspath(Vector fontPath, Vector cp)
    {
        Vector newcp = new Vector(cp);
        Vector cp_old = new Vector();
        String path = System.getProperty("java.class.path");
        //path += System.getProperty("path.separator") + "C:\\winnt\\fonts";
        if (path != null && path.length()>0)
        {
           StringTokenizer st = new StringTokenizer(path,  System.getProperty("path.separator") );

            while (st.hasMoreTokens())
            {
                String s = (String)st.nextToken();
                if (!newcp.contains(s))
                {
                 newcp.add(s);
                 cp_old.add(s);
                }
            }
        }
        for (int i=0; i<fontPath.size(); ++i) {
              String s = (String)fontPath.elementAt(i);
              if (!newcp.contains(s))
              {
                  newcp.add(s);
              }
        }

        Object[] allStrings = new Object[newcp.size()];
        newcp.copyInto(allStrings);

        Arrays.sort(allStrings);

        for (int i=0; i<allStrings.length; ++i)
        {
            String s = ""+allStrings[i];
            CheckBoxListEntry cble = new CheckBoxListEntry(s,fontPath.contains(s));

            if (!cp.contains(s) && !cp_old.contains(s))
            {
                cble.setRed(true);
            }

            ((DefaultListModel)jList1.getModel()).addElement( cble);
        }
    }



    public Vector getFontspath()
    {
         Vector cp = new Vector();
         java.util.List list = jList1.getCheckedItems();
         for (int i=0; i<list.size(); ++i )
         {
             CheckBoxListEntry cble = (CheckBoxListEntry)list.get( i );
             cp.addElement( cble.getValue() + "" );
         }

         return cp;
    }

    public int getDialogResult() {
        return dialogResult;
    }

    public void setDialogResult(int dialogResult) {
        this.dialogResult = dialogResult;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCancel;
    private javax.swing.JButton jButtonDeselectAll;
    private javax.swing.JButton jButtonSave;
    private javax.swing.JButton jButtonSelectAll;
    private javax.swing.JLabel jLabelClasspath;
    private it.businesslogic.ireport.gui.fonts.CheckBoxList jList1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables

    public void applyI18n(){
                // Start autogenerated code ----------------------
                // End autogenerated code ----------------------
    }
}
