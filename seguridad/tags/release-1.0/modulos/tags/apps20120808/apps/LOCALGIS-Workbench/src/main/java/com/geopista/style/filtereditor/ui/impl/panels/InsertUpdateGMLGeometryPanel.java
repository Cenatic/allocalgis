/*
 * InsertUpdateGMLGeometryPanel.java
 *
 * Created on 21 de septiembre de 2004, 18:16
 */
package com.geopista.style.filtereditor.ui.impl.panels;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

import org.deegree.gml.GMLCoordinates;
import org.deegree.gml.GMLGeometry;
import org.deegree.gml.GMLPoint;
import org.deegree.model.geometry.GM_Position;
import org.deegree_impl.gml.GMLCoordinatesParser_Impl;

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
public class InsertUpdateGMLGeometryPanel extends AbstractPanel {
    
	private DefaultComboBoxModel _srsCmbModel;
	private static final String[] _srsValues = { "EPSG:4326", "EPSG:23028", "EPSG:23029", "EPSG:23030"};
    
    
	public void configure(Request request) {

		Session session = FrontControllerFactory.getSession();
		_srsCmbModel = new DefaultComboBoxModel(_srsValues);	
		srsCmb.setModel(_srsCmbModel);
		if (session.getAttribute("GMLGeometry") != null) {
			GMLGeometry gmlGeometry = (GMLGeometry)session.getAttribute("GMLGeometry");
			srsCmb.setSelectedItem(gmlGeometry.getSrs());	
			GMLPoint gmlPoint = (GMLPoint)gmlGeometry;
			GMLCoordinates gmlCoordinates = gmlPoint.getCoordinates();
			GM_Position[] points = GMLCoordinatesParser_Impl.coordinatesToPoints(gmlCoordinates);
			coorxTxt.setText((new Double(points[0].getX())).toString());
			cooryTxt.setText((new Double(points[0].getY())).toString());
			if (points[0].getAsArray().length == 3) {
				coorzTxt.setText((new Double(points[0].getZ())).toString());
			}
		}
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
		return "GMLPoint parameters";		
	}

    /** Creates new form InsertUpdateGMLGeometryPanel */
    public InsertUpdateGMLGeometryPanel() {
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
        srsPanel = new javax.swing.JPanel();
        srsLbl = new javax.swing.JLabel();
        srsCmb = new javax.swing.JComboBox();
        pointPanel = new javax.swing.JPanel();
        coorxLbl = new javax.swing.JLabel();
        coorxTxt = new javax.swing.JTextField();
        cooryLbl = new javax.swing.JLabel();
        cooryTxt = new javax.swing.JTextField();
        coorzLbl = new javax.swing.JLabel();
        coorzTxt = new javax.swing.JTextField();
        buttonPanel = new javax.swing.JPanel();
        okBtn = new javax.swing.JButton();
        cancelBtn = new javax.swing.JButton();

        setLayout(new java.awt.BorderLayout());

        setPreferredSize(new java.awt.Dimension(400, 194));
        actionPanel.setLayout(new java.awt.GridBagLayout());

        actionPanel.setBorder(new javax.swing.border.TitledBorder(""));
        srsPanel.setLayout(new java.awt.GridBagLayout());

        srsPanel.setBorder(new javax.swing.border.TitledBorder("Sistema de referencia espacial"));
        srsLbl.setText("SRS:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 0);
        srsPanel.add(srsLbl, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 200);
        srsPanel.add(srsCmb, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        actionPanel.add(srsPanel, gridBagConstraints);

        pointPanel.setLayout(new java.awt.GridBagLayout());

        pointPanel.setBorder(new javax.swing.border.TitledBorder("Coordenadas Punto"));
        coorxLbl.setText("CoorX:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        pointPanel.add(coorxLbl, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(5, 0, 5, 5);
        pointPanel.add(coorxTxt, gridBagConstraints);

        cooryLbl.setText("CoorY:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        pointPanel.add(cooryLbl, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(5, 0, 5, 5);
        pointPanel.add(cooryTxt, gridBagConstraints);

        coorzLbl.setText("CoorZ:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        pointPanel.add(coorzLbl, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 5;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(5, 0, 5, 5);
        pointPanel.add(coorzTxt, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        actionPanel.add(pointPanel, gridBagConstraints);

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
			Session session = FrontControllerFactory.getSession();
			Request theRequest = FrontControllerFactory.createRequest();
			FrontController fc =  FrontControllerFactory.getFrontController();
			theRequest.setAttribute("CoordX",coorxTxt.getText());
			theRequest.setAttribute("CoordY",cooryTxt.getText());
			if (!coorzTxt.getText().equals("")) {
				theRequest.setAttribute("CoordZ",coorzTxt.getText());
			}
			theRequest.setAttribute("SRS",(String)srsCmb.getSelectedItem());
			Action theAction = fc.getAction("UpdateGMLGeometry");
			ActionForward theActionForward = theAction.doExecute(theRequest);
			_container.forward(theActionForward, theRequest);        		
		}
    }//GEN-LAST:event_okBtnActionPerformed
    
	private boolean checkValues() {
		boolean valuesAreCorrect = true;
		StringBuffer errorMessage = new StringBuffer();
    	
		if (coorxTxt.getText().equals("")) {
			errorMessage.append("La coordenada X es obligatoria\n");
			valuesAreCorrect = false;
		} 
		else {
			try {
				Double.parseDouble(coorxTxt.getText());			
			}
			catch (NumberFormatException e) {
				errorMessage.append("El valor de la coordenada X debe ser num�rica\n");
				valuesAreCorrect = false;
			}
		}
		if (cooryTxt.getText().equals("")) {
			errorMessage.append("La coordenada Y es obligatorio\n");
			valuesAreCorrect = false;
		}
		else {
			try {
				Double.parseDouble(cooryTxt.getText());			
			}
			catch (NumberFormatException e) {
				errorMessage.append("El valor de la coordenada Y debe ser num�rico\n");
				valuesAreCorrect = false;
			}
		}
		if (!coorzTxt.getText().equals("")) {
			try {
				Double.parseDouble(coorzTxt.getText());			
			}
			catch (NumberFormatException e) {
				errorMessage.append("El de la coordenada Z debe ser num�rico\n");
				valuesAreCorrect = false;
			}
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
    private javax.swing.JLabel coorxLbl;
    private javax.swing.JTextField coorxTxt;
    private javax.swing.JLabel cooryLbl;
    private javax.swing.JTextField cooryTxt;
    private javax.swing.JLabel coorzLbl;
    private javax.swing.JTextField coorzTxt;
    private javax.swing.JButton okBtn;
    private javax.swing.JPanel pointPanel;
    private javax.swing.JComboBox srsCmb;
    private javax.swing.JLabel srsLbl;
    private javax.swing.JPanel srsPanel;
    // End of variables declaration//GEN-END:variables
    
}
