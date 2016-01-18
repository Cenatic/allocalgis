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
 * PasswordDialog.java
 * 
 * Created on 9 maggio 2003, 17.25
 *
 */

package it.businesslogic.ireport.connection;

import it.businesslogic.ireport.util.*;
import it.businesslogic.ireport.*;
import java.lang.reflect.InvocationTargetException;
import javax.swing.SwingUtilities;
/**
 *
 * @author  Administrator
 */
public class PasswordDialog extends javax.swing.JDialog {
    /** Creates new form JRParameterDialog */
    private String password = null;
    
    public PasswordDialog(java.awt.Frame parent, boolean modal) {
        
        super(parent, modal);
        initComponents();
        this.setSize(320, 144);          
        Misc.centerFrame(this);
        
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
    }
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc=" Generated Code ">//GEN-BEGIN:initComponents
    private void initComponents() {
        jLabel1 = new javax.swing.JLabel();
        jButtonCancel = new javax.swing.JButton();
        jButtonOK = new javax.swing.JButton();
        jPasswordField = new javax.swing.JPasswordField();

        getContentPane().setLayout(null);

        setTitle("Password");
        setModal(true);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                closeDialog(evt);
            }
        });

        jLabel1.setText("Password:");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(4, 4, 250, 14);

        jButtonCancel.setMnemonic('c');
        jButtonCancel.setText("Cancel");
        jButtonCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelActionPerformed(evt);
            }
        });

        getContentPane().add(jButtonCancel);
        jButtonCancel.setBounds(220, 52, 70, 23);

        jButtonOK.setMnemonic('o');
        jButtonOK.setText("OK");
        jButtonOK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonOKActionPerformed(evt);
            }
        });

        getContentPane().add(jButtonOK);
        jButtonOK.setBounds(138, 52, 70, 23);

        getContentPane().add(jPasswordField);
        jPasswordField.setBounds(4, 20, 286, 24);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelActionPerformed
        setVisible(false);
        this.setDialogResult( javax.swing.JOptionPane.CANCEL_OPTION);
        dispose();
    }//GEN-LAST:event_jButtonCancelActionPerformed

    private void jButtonOKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonOKActionPerformed
        
        try {
            password = this.jPasswordField.getDocument().getText(0,this.jPasswordField.getDocument().getLength());
        } catch (Exception ex) {}
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
    
    /** Getter for property password.
     * @return Value of property password.
     *
     */
    public java.lang.String getPassword() {
        return password;
    }
    
    /** Setter for property password.
     * @param password New value of property password.
     *
     */
    public void setPassword(java.lang.String password) {
        this.password = password;
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCancel;
    private javax.swing.JButton jButtonOK;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPasswordField jPasswordField;
    // End of variables declaration//GEN-END:variables

    private int dialogResult;    
    
    public void applyI18n(){
                // Start autogenerated code ----------------------
                jButtonCancel.setText(I18n.getString("passwordDialog.buttonCancel","Cancel"));
                jButtonOK.setText(I18n.getString("passwordDialog.buttonOK","OK"));
                jLabel1.setText(I18n.getString("passwordDialog.label1","Password:"));
                // End autogenerated code ----------------------
                
                this.setTitle(I18n.getString("passwordDialog.title","Password"));
                jButtonCancel.setMnemonic(I18n.getString("passwordDialog.buttonCancelMnemonic","c").charAt(0));
                jButtonOK.setMnemonic(I18n.getString("passwordDialog.buttonOKMnemonic","o").charAt(0));
    }
    
    
}
