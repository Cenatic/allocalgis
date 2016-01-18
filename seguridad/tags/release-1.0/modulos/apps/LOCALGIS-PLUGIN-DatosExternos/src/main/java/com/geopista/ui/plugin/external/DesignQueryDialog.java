/*
 * DesignQueryDialog.java
 *
 * Created on 21 de septiembre de 2007, 14:23
 */

package com.geopista.ui.plugin.external;

import java.awt.Dialog;
import java.awt.Dimension;
import java.sql.Connection;

import javax.swing.JDialog;
import javax.swing.JOptionPane;

import com.vividsolutions.jump.I18N;

import nickyb.sqleonardo.querybuilder.QueryBuilder;
import nickyb.sqleonardo.querybuilder.QueryModel;


public class DesignQueryDialog extends JDialog {
    
	private Connection connection;
	private DesignQueryHelper designQueryHelper;

    public DesignQueryDialog(final Dialog dialog, String title, boolean modal, Connection connection) {
        super(dialog,title, modal);
    	this.connection = connection;
        designQueryHelper = new DesignQueryHelper();
    	initComponents();
    }
        
    private void initComponents() {

        queryBuilder = new nickyb.sqleonardo.querybuilder.QueryBuilder();
        queryBuilder.setConnection(connection);
        
        okjButton = new javax.swing.JButton();
        canceljButton = new javax.swing.JButton();

        setTitle(I18N.get("ConfigureQueryExternalDataSource.consulta.titulo"));
        getContentPane().setLayout(null);

        setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
        setResizable(false);
        getContentPane().add(queryBuilder);
        queryBuilder.setBounds(0, 10, 603, 490);        

        okjButton.setText(I18N.get("ConfigureQueryExternalDataSource.botonAceptar"));
        okjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                okjButtonActionPerformed(evt);
            }
        });

        getContentPane().add(okjButton);
        okjButton.setBounds(230, 540, 80, 23);

        canceljButton.setText(I18N.get("ConfigureQueryExternalDataSource.botonCancelar"));
        canceljButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                canceljButtonActionPerformed(evt);
            }
        });

        getContentPane().add(canceljButton);
        canceljButton.setBounds(330, 540, 75, 23);
        pack();
        setSize(new Dimension(620,600));
    }   

    private void canceljButtonActionPerformed(java.awt.event.ActionEvent evt) {                                              
    	queryModel = null;
    	dispose();
    }                                             

    private void okjButtonActionPerformed(java.awt.event.ActionEvent evt) {                                          
    	queryModel = queryBuilder.getQueryModel();
    	if (designQueryHelper.isQueryModelEmpty(queryModel)) {
    		JOptionPane.showMessageDialog(this, I18N.get("ConfigureQueryExternalDataSource.consulta.errorTabla"), I18N.get("ConfigureQueryExternalDataSource.consulta.error"), JOptionPane.ERROR_MESSAGE);
    		return;
    	}
    	if (designQueryHelper.isQueryModelCorrect(queryModel,connection)){
    	  	setOkButtonPressed(true);
    	  	dispose();
    	}  
    	else {
    		JOptionPane.showMessageDialog(this, I18N.get("ConfigureQueryExternalDataSource.consulta.errorConsulta"), I18N.get("ConfigureQueryExternalDataSource.consulta.error"), JOptionPane.ERROR_MESSAGE);
    	}
    }                                         
    

    private boolean okButtonPressed;
    private QueryModel queryModel; 
    private javax.swing.JButton canceljButton;
    private javax.swing.JButton okjButton;
    private nickyb.sqleonardo.querybuilder.QueryBuilder queryBuilder;

	public boolean isOkButtonPressed() {
		return okButtonPressed;
	}

	public void setOkButtonPressed(boolean okButtonPressed) {
		this.okButtonPressed = okButtonPressed;
	}

	public QueryModel getQueryModel() {
		return queryModel;
	}

	public void setQueryModel(QueryModel queryModel) {
		this.queryModel = queryModel;
	}
	
	public void setOldQueryModel(QueryModel queryModel) {
		queryBuilder.setQueryModel(queryModel);
	}
    
}
