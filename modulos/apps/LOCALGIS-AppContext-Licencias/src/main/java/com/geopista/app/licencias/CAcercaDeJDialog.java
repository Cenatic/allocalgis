/**
 * CAcercaDeJDialog.java
 * � MINETUR, Government of Spain
 * This program is part of LocalGIS
 * This program is free software: you can redistribute it and/or modify it under the terms of the GNU General Public License as published by the Free Software Foundation, either version 2 of the License, or (at your option) any later version.
 * This program is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU General Public License for more details.
 * You should have received a copy of the GNU General Public License along with this program. If not, see <http://www.gnu.org/licenses/>.
 */
/*
 * CAcercaDeJDialog.java
 *
 * Created on 9 de diciembre de 2004, 17:33
 */

package com.geopista.app.licencias;

import javax.swing.ImageIcon;

import com.geopista.ui.images.IconLoader;
import com.vividsolutions.jump.workbench.ui.SplashPanel;

/**
 *
 * @author  charo
 */
public class CAcercaDeJDialog extends javax.swing.JDialog {

    public static final String VERSION_TEXT = "Version 2.1";
    protected static ImageIcon splashImage;


    /** Creates new form CAcercaDeJDialog */
    public CAcercaDeJDialog(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();

        IconLoader.icon("splash.png");
        SplashPanel splashPanel = new SplashPanel(splashImage(), VERSION_TEXT);
        splashPanel.setAlignmentX(0);
        splashPanel.setAlignmentY(0);
        acercaDeJPanel.add(splashPanel, 0);
        this.setTitle(CMainLicencias.literales.getString("CAcercaDe.tittle"));
    }
    
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    private void initComponents() {//GEN-BEGIN:initComponents
        acercaDeJPanel = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);
        acercaDeJPanel.setLayout(new java.awt.BorderLayout());

        getContentPane().add(acercaDeJPanel, java.awt.BorderLayout.CENTER);

        pack();
    }//GEN-END:initComponents

    public static ImageIcon splashImage() {
       if (splashImage == null)
                splashImage = IconLoader.icon("splash.png");
       return splashImage;
   }


    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        new CAcercaDeJDialog(new javax.swing.JFrame(), true).show();
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel acercaDeJPanel;
    // End of variables declaration//GEN-END:variables
    
}
