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
 * Created on 7 giugno 2004, 11.18
 *
 */

package it.businesslogic.ireport.gui;
import it.businesslogic.ireport.util.I18n;

import java.lang.reflect.InvocationTargetException;

import javax.swing.SwingUtilities;

/**
 *
 * @author  Administrator
 */
public class PasswordDialog extends javax.swing.JDialog {
    
    private String password = "";
    private int response = javax.swing.JOptionPane.CANCEL_OPTION;
    /** Creates new form PasswordDialog */
    public PasswordDialog(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        
        this.setSize( 300, 164 );
        it.businesslogic.ireport.util.Misc.centerFrame(this);
        
        
        javax.swing.KeyStroke escape =  javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_ESCAPE, 0, false);
        javax.swing.Action escapeAction = new javax.swing.AbstractAction() {
            public void actionPerformed(java.awt.event.ActionEvent e) {
                jButton2ActionPerformed(e);
            }
        };
       
        getRootPane().getInputMap(javax.swing.JComponent.WHEN_IN_FOCUSED_WINDOW).put(escape, "ESCAPE");
        getRootPane().getActionMap().put("ESCAPE", escapeAction);

        applyI18n();
        //to make the default button ...
        this.getRootPane().setDefaultButton(this.jButton1);
        
    }
    
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc=" Generated Code ">//GEN-BEGIN:initComponents
    private void initComponents() {
        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPasswordField1 = new javax.swing.JPasswordField();
        jSeparator1 = new javax.swing.JSeparator();
        jButton2 = new javax.swing.JButton();

        getContentPane().setLayout(null);

        setTitle("Database password");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                closeDialog(evt);
            }
        });

        jPanel1.setLayout(null);

        jPanel1.setMaximumSize(new java.awt.Dimension(290, 130));
        jButton1.setText("Ok");
        jButton1.setMaximumSize(new java.awt.Dimension(50, 34));
        jButton1.setMinimumSize(new java.awt.Dimension(50, 34));
        jButton1.setPreferredSize(new java.awt.Dimension(50, 34));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jPanel1.add(jButton1);
        jButton1.setBounds(70, 90, 70, 24);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/it/businesslogic/ireport/icons/password.png")));
        jPanel1.add(jLabel1);
        jLabel1.setBounds(10, 0, 90, 80);

        jLabel2.setText("Password");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(90, 20, 130, 14);

        jPanel1.add(jPasswordField1);
        jPasswordField1.setBounds(90, 40, 180, 23);

        jPanel1.add(jSeparator1);
        jSeparator1.setBounds(10, 80, 260, 2);

        jButton2.setText("Cancel");
        jButton2.setPreferredSize(new java.awt.Dimension(50, 34));
        jButton2.setMaximumSize(new java.awt.Dimension(50, 34));
        jButton2.setMinimumSize(new java.awt.Dimension(50, 34));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jPanel1.add(jButton2);
        jButton2.setBounds(150, 90, 80, 24);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 290, 130);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
         response = javax.swing.JOptionPane.CANCEL_OPTION;
         password="";
        setVisible(false);
        dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        response = javax.swing.JOptionPane.OK_OPTION;
        char chars[] = this.jPasswordField1.getPassword();
        if (chars != null) 
        {
            password = new String(chars);
        }
        else
            password = "";
        chars = null;
        
        setVisible(false);
        dispose();
        
    }//GEN-LAST:event_jButton1ActionPerformed
    
    /** Closes the dialog */
    private void closeDialog(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_closeDialog
        setVisible(false);
        dispose();
    }//GEN-LAST:event_closeDialog
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        new PasswordDialog(new javax.swing.JFrame(), true).setVisible(true);
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
    
    /** Getter for property response.
     * @return Value of property response.
     *
     */
    public int getResponse() {
        return response;
    }
    
    /** Setter for property response.
     * @param response New value of property response.
     *
     */
    public void setResponse(int response) {
        this.response = response;
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables
    
    public void applyI18n(){
                // Start autogenerated code ----------------------
                jButton1.setText(I18n.getString("passwordDialog.button1","Ok"));
                jButton2.setText(I18n.getString("passwordDialog.button2","Cancel"));
                jLabel2.setText(I18n.getString("passwordDialog.label2","Password"));
                // End autogenerated code ----------------------
                this.setTitle(I18n.getString("passwordDialog.title","Database password"));
                jButton1.setMnemonic(I18n.getString("passwordDialog.button1Mnemonic","o").charAt(0));
                jButton2.setMnemonic(I18n.getString("passwordDialog.button2Mnemonic","c").charAt(0));
    }

    public static String askPassword()
    {
        final PasswordDialog pd = new PasswordDialog(it.businesslogic.ireport.gui.MainFrame.getMainInstance(), true);
        
        Runnable r = new Runnable() {
                public void run() {
                    pd.setVisible(true);
                }
            };

        if (!SwingUtilities.isEventDispatchThread())
        {
            try {
                SwingUtilities.invokeAndWait( r );
            } catch (InvocationTargetException ex) {
                ex.printStackTrace();
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
        }
        else
        {
                r.run();
        }
        
        return pd.getPassword();
        
    }
}
