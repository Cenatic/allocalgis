/**
 * CHistoricoJDialog.java
 * � MINETUR, Government of Spain
 * This program is part of LocalGIS
 * This program is free software: you can redistribute it and/or modify it under the terms of the GNU General Public License as published by the Free Software Foundation, either version 2 of the License, or (at your option) any later version.
 * This program is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU General Public License for more details.
 * You should have received a copy of the GNU General Public License along with this program. If not, see <http://www.gnu.org/licenses/>.
 */
/*
 * JSearch.java
 *
 * Created on 4 de mayo de 2004, 12:04
 */

package com.geopista.app.ocupaciones.panel;

import java.io.PrintWriter;
import java.io.StringWriter;

import javax.swing.table.DefaultTableModel;

import org.apache.log4j.Logger;

import com.geopista.app.ocupaciones.CConstantesOcupaciones;
import com.geopista.app.ocupaciones.CMainOcupaciones;
import com.geopista.app.ocupaciones.CUtilidades;
import com.geopista.app.ocupaciones.Estructuras;
import com.geopista.protocol.administrador.dominios.DomainNode;
import com.geopista.protocol.licencias.CHistorico;

/**
 * @author avivar
 */
public class CHistoricoJDialog extends javax.swing.JDialog {
	private CHistorico _historico = new CHistorico();

	Logger logger = Logger.getLogger(CHistoricoJDialog.class);

	/**
	 * Creates new form JSearch
	 */
	public CHistoricoJDialog(java.awt.Frame parent, boolean modal) {
		super(parent, modal);
		initComponents();
		configureComponents();
	}

    public CHistoricoJDialog(java.awt.Frame parent, boolean modal, CHistorico historico) {
        super(parent, modal);
        initComponents();
        _historico= historico;
        configureComponents();
    }


	private void configureComponents() {
        apunteJTextArea.setLineWrap(true);
        apunteJTextArea.setWrapStyleWord(true);


		if (CConstantesOcupaciones.OPERACION_HISTORICO == CConstantesOcupaciones.CMD_HISTORICO_ADDED)
			historicoJPanel.setBorder(new javax.swing.border.TitledBorder(CMainOcupaciones.literales.getString("CHistoricoJDialog.historicoJPanel.TitleBorder.insertar")));
		else
			historicoJPanel.setBorder(new javax.swing.border.TitledBorder(CMainOcupaciones.literales.getString("CHistoricoJDialog.historicoJPanel.TitleBorder.modificar")));

        String estado= "";
        try{
            estado= ((DomainNode)Estructuras.getListaEstadosOcupacion().getDomainNode(new Integer(_historico.getEstado().getIdEstado()).toString())).getTerm(CMainOcupaciones.currentLocale.toString());
        }catch(Exception e){
            logger.error("NO se ha podido cargar el estado "+_historico.getEstado().getIdEstado());
        }
		estadoJTextField.setText(estado);
		estadoJTextField.setEditable(true);
		usuarioJTextField.setText(_historico.getUsuario());
		usuarioJTextField.setEditable(true);

		if (CConstantesOcupaciones.OPERACION_HISTORICO == CConstantesOcupaciones.CMD_HISTORICO_ADDED)
			fechaJTextField.setText(CUtilidades.formatFecha(_historico.getFechaHistorico()));
		else if ((CConstantesOcupaciones.OPERACION_HISTORICO == CConstantesOcupaciones.CMD_HISTORICO_MODIFIED) && (_historico.getIdHistorico() == -1))
			fechaJTextField.setText(CUtilidades.formatFecha(_historico.getFechaHistorico()));
		else
			fechaJTextField.setText(CUtilidades.formatFechaH24(_historico.getFechaHistorico()));

		fechaJTextField.setEditable(true);
		apunteJTextArea.setText(_historico.getApunte());
		apunteJTextArea.setEditable(true);

		renombrarComponentes();
	}

	/**
	 * This method is called from within the constructor to
	 * initialize the form.
	 * WARNING: Do NOT modify this code. The content of this method is
	 * always regenerated by the Form Editor.
	 */
    private void initComponents() {//GEN-BEGIN:initComponents
        historicoJPanel = new javax.swing.JPanel();
        aceptarJButton = new javax.swing.JButton();
        cancelarJButton = new javax.swing.JButton();
        estadoJTextField = new javax.swing.JTextField();
        estadoJLabel = new javax.swing.JLabel();
        usuarioJTextField = new javax.swing.JTextField();
        usuarioJLabel = new javax.swing.JLabel();
        fechaJLabel = new javax.swing.JLabel();
        fechaJTextField = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        apunteJTextArea = new javax.swing.JTextArea();
        apunteJLabel = new javax.swing.JLabel();

        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Di\u00e1logo de busqueda");
        historicoJPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        historicoJPanel.setBorder(new javax.swing.border.TitledBorder("Modificar Hist\u00f3rico"));
        aceptarJButton.setText("Aceptar");
        aceptarJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aceptarJButtonActionPerformed(evt);
            }
        });

        historicoJPanel.add(aceptarJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 360, 100, -1));

        cancelarJButton.setText("Cancelar");
        cancelarJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelarJButtonActionPerformed(evt);
            }
        });

        historicoJPanel.add(cancelarJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(367, 360, 100, -1));

        estadoJTextField.setEnabled(false);
        historicoJPanel.add(estadoJTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 50, 280, -1));

        estadoJLabel.setText("Estado del expediente:");
        historicoJPanel.add(estadoJLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 160, 20));

        usuarioJTextField.setEnabled(false);
        historicoJPanel.add(usuarioJTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 70, 280, -1));

        usuarioJLabel.setText("Usuario:");
        historicoJPanel.add(usuarioJLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 120, 20));

        fechaJLabel.setText("Fecha:");
        historicoJPanel.add(fechaJLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 120, 20));

        fechaJTextField.setEnabled(false);
        historicoJPanel.add(fechaJTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 90, 280, -1));

        jScrollPane1.setViewportView(apunteJTextArea);

        historicoJPanel.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, 450, 120));

        apunteJLabel.setText("Apunte:");
        historicoJPanel.add(apunteJLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, 150, -1));

        getContentPane().add(historicoJPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 480, 430));

        pack();
    }//GEN-END:initComponents

	private void cancelarJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarJButtonActionPerformed
		_historico.setHasBeen(-1);
		dispose();

	}//GEN-LAST:event_cancelarJButtonActionPerformed

	private void aceptarJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aceptarJButtonActionPerformed
		/** actualizamos los campos editables tanto en la modificacion como en la inserccion */
		_historico.setApunte(apunteJTextArea.getText());
		_historico.setUsuario(usuarioJTextField.getText());

		if (CConstantesOcupaciones.OPERACION_HISTORICO == CConstantesOcupaciones.CMD_HISTORICO_MODIFIED) {
			if (_historico.getHasBeen() != CConstantesOcupaciones.CMD_HISTORICO_ADDED)
				_historico.setHasBeen(CConstantesOcupaciones.CMD_HISTORICO_MODIFIED);
		} else if (CConstantesOcupaciones.OPERACION_HISTORICO == CConstantesOcupaciones.CMD_HISTORICO_ADDED) {
			_historico.setHasBeen(CConstantesOcupaciones.CMD_HISTORICO_ADDED);
		} else
			_historico.setHasBeen(-1);

		dispose();
	}//GEN-LAST:event_aceptarJButtonActionPerformed

    public CHistorico getHistorico(){
        return _historico;
    }



	/**
	 * @param args the command line arguments
	 */
	public static void main(String args[]) {
		new CHistoricoJDialog(new javax.swing.JFrame(), true).show();
	}

	private DefaultTableModel expedientesJTableModel;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton aceptarJButton;
    private javax.swing.JLabel apunteJLabel;
    private javax.swing.JTextArea apunteJTextArea;
    private javax.swing.JButton cancelarJButton;
    private javax.swing.JLabel estadoJLabel;
    private javax.swing.JTextField estadoJTextField;
    private javax.swing.JLabel fechaJLabel;
    private javax.swing.JTextField fechaJTextField;
    private javax.swing.JPanel historicoJPanel;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel usuarioJLabel;
    private javax.swing.JTextField usuarioJTextField;
    // End of variables declaration//GEN-END:variables
	private void renombrarComponentes() {

		try {
            if (CConstantesOcupaciones.OPERACION_HISTORICO == CConstantesOcupaciones.CMD_HISTORICO_ADDED){
			    setTitle(CMainOcupaciones.literales.getString("CHistoricoJDialog.JInternalFrame.title.insertar"));
                historicoJPanel.setBorder(new javax.swing.border.TitledBorder(CMainOcupaciones.literales.getString("CHistoricoJDialog.historicoJPanel.TitleBorder.insertar")));
            }else{
                setTitle(CMainOcupaciones.literales.getString("CHistoricoJDialog.JInternalFrame.title.modificar"));
                historicoJPanel.setBorder(new javax.swing.border.TitledBorder(CMainOcupaciones.literales.getString("CHistoricoJDialog.historicoJPanel.TitleBorder.modificar")));
            }

            if (CConstantesOcupaciones.OPERACION_HISTORICO == CConstantesOcupaciones.CMD_HISTORICO_ADDED)
                fechaJTextField.setText(CUtilidades.formatFecha(_historico.getFechaHistorico()));
            else if ((CConstantesOcupaciones.OPERACION_HISTORICO == CConstantesOcupaciones.CMD_HISTORICO_MODIFIED) && (_historico.getIdHistorico() == -1))
                fechaJTextField.setText(CUtilidades.formatFecha(_historico.getFechaHistorico()));
            else
                fechaJTextField.setText(CUtilidades.formatFechaH24(_historico.getFechaHistorico()));

            fechaJTextField.setEnabled(false);

			estadoJLabel.setText(CMainOcupaciones.literales.getString("CHistoricoJDialog.estadoJLabel.text"));
			usuarioJLabel.setText(CMainOcupaciones.literales.getString("CHistoricoJDialog.usuarioJLabel.text"));
			fechaJLabel.setText(CMainOcupaciones.literales.getString("CHistoricoJDialog.fechaJLabel.text"));
			apunteJLabel.setText(CMainOcupaciones.literales.getString("CHistoricoJDialog.apunteJLabel.text"));

			cancelarJButton.setText(CMainOcupaciones.literales.getString("CHistoricoJDialog.cancelarJButton.text"));
			aceptarJButton.setText(CMainOcupaciones.literales.getString("CHistoricoJDialog.aceptarJButton.text"));


		} catch (Exception ex) {
			StringWriter sw = new StringWriter();
			PrintWriter pw = new PrintWriter(sw);
			ex.printStackTrace(pw);
			logger.error("Exception: " + sw.toString());
		}
	}
}
