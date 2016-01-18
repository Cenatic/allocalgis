/*
 * QueryBuilderDialog.java
 *
 * Created on December 11, 2006, 4:21 PM
 */

package it.businesslogic.ireport.data;

import it.businesslogic.ireport.util.I18n;
import it.businesslogic.ireport.util.Misc;
import java.io.IOException;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import nickyb.sqleonardo.environment.Application;
import nickyb.sqleonardo.querybuilder.QueryActions;
import nickyb.sqleonardo.querybuilder.QueryModel;
import nickyb.sqleonardo.querybuilder.syntax.SQLParser;



/**
 *
 * @author  gtoffoli
 */
public class QueryBuilderDialog extends javax.swing.JDialog {
    
    private String query = null;
    private int dialogResult = javax.swing.JOptionPane.CANCEL_OPTION;
    private boolean init = false;
    
    /**
     * Creates new form QueryBuilderDialog
     */
    public QueryBuilderDialog(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initAll();
    }
    
    /**
     * Creates new form QueryBuilderDialog
     */
    public QueryBuilderDialog(java.awt.Dialog parent, boolean modal) {
        super(parent, modal);
        initAll();
    }
    
    public void applyI18n()
    {
        
        jTabbedPane1.setTitleAt(0, I18n.getString("application.builder","Builder"));
        jTabbedPane1.setTitleAt(1, I18n.getString("application.syntax","SQL"));
        
        jButtonOk.setText( I18n.getString("ok","Ok") );
        jButtonCancel.setText( I18n.getString("cancel","jButtonCancel") );
        
    }
    
    private void initAll()
    {
        setInit(true);
        initComponents();
        applyI18n();
        setInit(false);
        Misc.centerFrame(this);
    }
    
    public void setConnection(java.sql.Connection c)
    {
        this.queryBuilder1.setConnection(c);
    }
    
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc=" Generated Code ">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jTabbedPane1 = new javax.swing.JTabbedPane();
        queryBuilder1 = new nickyb.sqleonardo.querybuilder.QueryBuilder();
        jRSQLExpressionArea1 = new it.businesslogic.ireport.gui.JRSQLExpressionArea();
        jPanel1 = new javax.swing.JPanel();
        jButtonOk = new javax.swing.JButton();
        jButtonCancel = new javax.swing.JButton();

        getContentPane().setLayout(new java.awt.GridBagLayout());

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        jTabbedPane1.setTabPlacement(javax.swing.JTabbedPane.BOTTOM);
        jTabbedPane1.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jTabbedPane1StateChanged(evt);
            }
        });

        queryBuilder1.setPreferredSize(new java.awt.Dimension(600, 483));
        jTabbedPane1.addTab("Design", queryBuilder1);

        jRSQLExpressionArea1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jRSQLExpressionArea1.setMinimumSize(new java.awt.Dimension(50, 200));
        jRSQLExpressionArea1.setPreferredSize(new java.awt.Dimension(661, 340));
        jTabbedPane1.addTab("SQL", jRSQLExpressionArea1);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        getContentPane().add(jTabbedPane1, gridBagConstraints);

        jPanel1.setLayout(new java.awt.GridBagLayout());

        jButtonOk.setText("Ok");
        jButtonOk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonOkActionPerformed(evt);
            }
        });

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(4, 4, 4, 0);
        jPanel1.add(jButtonOk, gridBagConstraints);

        jButtonCancel.setText("Cancel");
        jButtonCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelActionPerformed(evt);
            }
        });

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.insets = new java.awt.Insets(4, 4, 4, 4);
        jPanel1.add(jButtonCancel, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        getContentPane().add(jPanel1, gridBagConstraints);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTabbedPane1StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jTabbedPane1StateChanged

            if (isInit()) return; 
            if(jTabbedPane1.getSelectedIndex() == 0)
		{
			String msql = queryBuilder1.getQueryModel().toString(true);
			String tsql = jRSQLExpressionArea1.getText();
			
			if(!tsql.equals(msql))
			{
				if(JOptionPane.showConfirmDialog( this, I18n.getString("application.syntaxChanged","syntax changed!\ndo you want to apply changes (builder need to reload)?")) == JOptionPane.OK_OPTION)
				{
					// this thread resolve: IllegalComponentStateException
					new Thread(new Runnable()
					{
						public void run()
						{
							while(!queryBuilder1.isVisible());
							try
							{
								QueryModel qm = SQLParser.toQueryModel(jRSQLExpressionArea1.getText());
								queryBuilder1.setQueryModel(qm);
							}
							catch (IOException e)
							{
								JOptionPane.showMessageDialog(QueryBuilderDialog.this, I18n.getString("errorParsingSQL","I'm sorry, I'm unable to parse the query..." ));
                                                                jTabbedPane1.setSelectedIndex(0);
                                                        }
						}
					}).start();
				}
			}
		}
		else
                {
                    try {
		
                        jRSQLExpressionArea1.setText(queryBuilder1.getQueryModel().toString(true));
                    
                    } catch (Exception ex)
                    {
                        
                    }
                }
        
    }//GEN-LAST:event_jTabbedPane1StateChanged

    private void jButtonCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelActionPerformed

        this.setVisible(false);
        this.dispose();
        
    }//GEN-LAST:event_jButtonCancelActionPerformed

    private void jButtonOkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonOkActionPerformed

        if (jTabbedPane1.getSelectedIndex() == 0)
        {
            query = this.queryBuilder1.getQueryModel().toString(true);
        }
        else
        {
            query = this.jRSQLExpressionArea1.getText();
        }
        
        this.setDialogResult(javax.swing.JOptionPane.OK_OPTION);
        this.setVisible(false);
        this.dispose();
    }//GEN-LAST:event_jButtonOkActionPerformed
    
    public String getQuery() {
        return query;
    }

    public void setQuery(String query) throws Exception {
        
        final QueryModel qm = SQLParser.toQueryModel(query);
        
        SwingUtilities.invokeLater(new Runnable()
        {
            public void run()
            {
                if (isVisible())
                {
                    queryBuilder1.setQueryModel( qm );
                }
            }
        });
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCancel;
    private javax.swing.JButton jButtonOk;
    private javax.swing.JPanel jPanel1;
    private it.businesslogic.ireport.gui.JRSQLExpressionArea jRSQLExpressionArea1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private nickyb.sqleonardo.querybuilder.QueryBuilder queryBuilder1;
    // End of variables declaration//GEN-END:variables
    
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

    public boolean isInit() {
        return init;
    }

    public void setInit(boolean init) {
        this.init = init;
    }
    
}
