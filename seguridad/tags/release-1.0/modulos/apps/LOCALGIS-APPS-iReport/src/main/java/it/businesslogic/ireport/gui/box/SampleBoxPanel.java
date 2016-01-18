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
 * SampleBoxPanel.java
 * 
 * Created on 29 novembre 2004, 18.16
 *
 */

package it.businesslogic.ireport.gui.box;
import it.businesslogic.ireport.*;
import java.awt.*;
/**
 *
 * @author  Administrator
 */
public class SampleBoxPanel extends javax.swing.JPanel {
    
    private Box box;
    
    /** Creates new form SampleBoxPanel */
    public SampleBoxPanel() {
        initComponents();
        this.setBackground(Color.WHITE);
        setBox(new Box());
    }

    public Box getBox() {
        return box;
    }

    public void setBox(Box box) {
        this.box = box;
        this.invalidate();
        this.repaint();
    }
    
    public void refresh() {
        this.invalidate();
        this.repaint();
    }
    
    public void paint(Graphics g2)
    {
        Graphics2D g = (Graphics2D)g2;
        g.clearRect(0,0,this.getWidth(),this.getHeight());
        g.setColor( Color.LIGHT_GRAY);
        Stroke oldStroke = g.getStroke();
        Color oldColor  = g.getColor();

        g.fillRect(10, 10, this.getWidth()-20, this.getHeight()-20);
        
        if (!getBox().getLeftBorder().equals("None"))
        {
            Stroke stroke = ReportElement.getPenStroke( getBox().getLeftBorder(), 1.0);
            g.setStroke(stroke);
            g.setColor(getBox().getLeftBorderColor());
            g.drawLine(10, 10, 10, this.getHeight()-10);
        }
        
        if (!getBox().getRightBorder().equals("None"))
        {
            Stroke stroke = ReportElement.getPenStroke( getBox().getRightBorder(), 1.0);
            g.setStroke(stroke);
            g.setColor(getBox().getRightBorderColor());
            g.drawLine(this.getWidth()-10, 10, this.getWidth()-10, this.getHeight()-10);
        }
        
        if (!getBox().getTopBorder().equals("None"))
        {
            Stroke stroke = ReportElement.getPenStroke( getBox().getTopBorder(), 1.0);
            g.setStroke(stroke);
            g.setColor(getBox().getTopBorderColor());
            g.drawLine(10, 10, this.getWidth()-10, 10);
        }
        
        if (!getBox().getBottomBorder().equals("None"))
        {
            Stroke stroke = ReportElement.getPenStroke( getBox().getBottomBorder(), 1.0);
            g.setStroke(stroke);
            g.setColor(getBox().getBottomBorderColor());
            g.drawLine(10, this.getHeight()-10, this.getWidth()-10, this.getHeight()-10);
        }
        
        g.setColor(oldColor);
        g.setStroke(oldStroke);
    }
    
    
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    private void initComponents() {//GEN-BEGIN:initComponents

        setLayout(new java.awt.BorderLayout());

    }//GEN-END:initComponents
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
    
}
