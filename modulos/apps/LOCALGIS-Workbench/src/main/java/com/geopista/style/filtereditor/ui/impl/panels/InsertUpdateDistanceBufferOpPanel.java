/**
 * InsertUpdateDistanceBufferOpPanel.java
 * � MINETUR, Government of Spain
 * This program is part of LocalGIS
 * This program is free software: you can redistribute it and/or modify it under the terms of the GNU General Public License as published by the Free Software Foundation, either version 2 of the License, or (at your option) any later version.
 * This program is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU General Public License for more details.
 * You should have received a copy of the GNU General Public License along with this program. If not, see <http://www.gnu.org/licenses/>.
 */
/*
 * InsertUpdateDistanceBufferOpPanel.java
 *
 * Created on 22 de septiembre de 2004, 12:39
 */
package com.geopista.style.filtereditor.ui.impl.panels;

import javax.swing.JOptionPane;

import com.geopista.style.filtereditor.model.impl.DistanceBufferOp;

import es.enxenio.util.controller.Action;
import es.enxenio.util.controller.ActionForward;
import es.enxenio.util.controller.FrontController;
import es.enxenio.util.controller.FrontControllerFactory;
import es.enxenio.util.controller.Request;
import es.enxenio.util.controller.Session;
import es.enxenio.util.ui.impl.AbstractPanel;

/**
 *
 * @author enxenio s.l.
 */
public class InsertUpdateDistanceBufferOpPanel extends AbstractPanel {
    
    private boolean _newDistanceBufferOp = true;
    
	public void configure(Request request) {

		Session session = FrontControllerFactory.getSession();
		DistanceBufferOp distanceBufferOp = (DistanceBufferOp)session.getAttribute("DistanceBufferOperator");		
		if (session.getAttribute("GMLGeometry") != null) {
			_newDistanceBufferOp = false;
		}
		distanceTxt.setText(((Double)session.getAttribute("Distance")).toString());
	}

	public boolean windowClosing() {
		Request theRequest = FrontControllerFactory.createRequest();
		FrontController fc =  FrontControllerFactory.getFrontController();
		Action theAction = fc.getAction("GetBack"); 
		ActionForward theActionForward = theAction.doExecute(theRequest);
		_container.forward(theActionForward, theRequest);
		return false;
	}

	public String getTitle() {
		return "DistanceBufferOperator parameters";		
	}

    /** Creates new form InsertUpdateDistanceBufferOpPanel */
    public InsertUpdateDistanceBufferOpPanel() {
        initComponents();
    }
    
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    private void initComponents() {//GEN-BEGIN:initComponents
        java.awt.GridBagConstraints gridBagConstraints;

        actionPanel = new javax.swing.JPanel();
        gmlGeometryPanel = new javax.swing.JPanel();
        gmlGeometryBtn = new javax.swing.JButton();
        distancePanel = new javax.swing.JPanel();
        distanceLbl = new javax.swing.JLabel();
        distanceTxt = new javax.swing.JTextField();
        buttonPanel = new javax.swing.JPanel();
        okBtn = new javax.swing.JButton();
        cancelBtn = new javax.swing.JButton();

        setLayout(new java.awt.BorderLayout());

        setPreferredSize(new java.awt.Dimension(400, 234));
        actionPanel.setLayout(new java.awt.GridBagLayout());

        actionPanel.setBorder(new javax.swing.border.TitledBorder(""));
        gmlGeometryPanel.setLayout(new java.awt.GridBagLayout());

        gmlGeometryPanel.setBorder(new javax.swing.border.TitledBorder("GML Geometry"));
        gmlGeometryBtn.setText("Geometria");
        gmlGeometryBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gmlGeometryBtnActionPerformed(evt);
            }
        });

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.insets = new java.awt.Insets(5, 100, 5, 100);
        gmlGeometryPanel.add(gmlGeometryBtn, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 0, 5);
        actionPanel.add(gmlGeometryPanel, gridBagConstraints);

        distancePanel.setLayout(new java.awt.GridBagLayout());

        distancePanel.setBorder(new javax.swing.border.TitledBorder("Distancia"));
        distanceLbl.setText("Distancia:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 0);
        distancePanel.add(distanceLbl, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 200);
        distancePanel.add(distanceTxt, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        actionPanel.add(distancePanel, gridBagConstraints);

        add(actionPanel, java.awt.BorderLayout.CENTER);

        okBtn.setText("Aceptar");
        okBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                okBtnActionPerformed(evt);
            }
        });

        buttonPanel.add(okBtn);

        cancelBtn.setText("Cancelar");
        cancelBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelBtnActionPerformed(evt);
            }
        });

        buttonPanel.add(cancelBtn);

        add(buttonPanel, java.awt.BorderLayout.SOUTH);

    }//GEN-END:initComponents

    private void cancelBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelBtnActionPerformed

		Request theRequest = FrontControllerFactory.createRequest();
		FrontController fc =  FrontControllerFactory.getFrontController();
		Action theAction = fc.getAction("GetBack"); 
		ActionForward theActionForward = theAction.doExecute(theRequest);
		_container.forward(theActionForward, theRequest);

    }//GEN-LAST:event_cancelBtnActionPerformed

    private void okBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_okBtnActionPerformed
		if (checkValues()) {
			Request theRequest = FrontControllerFactory.createRequest();
			FrontController fc =  FrontControllerFactory.getFrontController();
			theRequest.setAttribute("Distance",new Double(distanceTxt.getText()));
			Action theAction = fc.getAction("UpdateDistanceBufferOp"); 
			ActionForward theActionForward = theAction.doExecute(theRequest);
			_container.forward(theActionForward, theRequest);		
		}
    }//GEN-LAST:event_okBtnActionPerformed

    private void gmlGeometryBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gmlGeometryBtnActionPerformed

		Request theRequest = FrontControllerFactory.createRequest();
		FrontController fc =  FrontControllerFactory.getFrontController();
		Session session = FrontControllerFactory.getSession();
		session.setAttribute("Distance",new Double(distanceTxt.getText()));
		Action theAction = null;
		if (_newDistanceBufferOp) {
			theAction = fc.getAction("AddGMLGeometry"); 
		}
		else {
			theAction = fc.getAction("ChangeGMLGeometry"); 
		}
		ActionForward theActionForward = theAction.doExecute(theRequest);
		_container.forward(theActionForward, theRequest);

    }//GEN-LAST:event_gmlGeometryBtnActionPerformed
    
	private boolean checkValues() {
		boolean valuesAreCorrect = true;
		StringBuffer errorMessage = new StringBuffer();
		Session session = FrontControllerFactory.getSession();

		if (distanceTxt.getText().equals("")) {
			errorMessage.append("El operador debe tener definida una distancia\n");
			valuesAreCorrect = false;
		} 
		else {
			try {
				Double.parseDouble(distanceTxt.getText());			
			}
			catch (NumberFormatException e) {
				errorMessage.append("La distancia debe ser num�rica\n");
				valuesAreCorrect = false;
			}
		}
		if (session.getAttribute("GMLGeometry") == null) {
			errorMessage.append("Se necesita una GMLGeometry para el operador Distance \n");
			valuesAreCorrect = false;

		}
		if (!valuesAreCorrect) {
			JOptionPane.showMessageDialog(null, "Los siguientes valores son incorrectos:\n" + errorMessage.toString());
		}
		return valuesAreCorrect;	
	}
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel actionPanel;
    private javax.swing.JPanel buttonPanel;
    private javax.swing.JButton cancelBtn;
    private javax.swing.JLabel distanceLbl;
    private javax.swing.JPanel distancePanel;
    private javax.swing.JTextField distanceTxt;
    private javax.swing.JButton gmlGeometryBtn;
    private javax.swing.JPanel gmlGeometryPanel;
    private javax.swing.JButton okBtn;
    // End of variables declaration//GEN-END:variables
    
}
