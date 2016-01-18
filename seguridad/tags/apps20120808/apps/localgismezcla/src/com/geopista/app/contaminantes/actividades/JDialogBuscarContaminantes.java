package com.geopista.app.contaminantes.actividades;
/**
 * The GEOPISTA project is a set of tools and applications to manage
 * geographical data for local administrations.
 *
 * Copyright (C) 2004 INZAMAC-SATEC UTE
 *
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU General Public License
 * as published by the Free Software Foundation; either version 2
 * of the License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 59 Temple Place - Suite 330, Boston, MA  02111-1307,
 USA.
 *
 * For more information, contact:
 *
 *
 * www.geopista.com
 *
 *
 */
import com.geopista.app.contaminantes.init.Constantes;
import com.geopista.app.contaminantes.CMainContaminantes;
import com.geopista.app.utilidades.TableSorted;
import com.geopista.app.utilidades.CalendarButton;
import com.geopista.app.utilidades.estructuras.ComboBoxEstructuras;
import com.geopista.protocol.CResultadoOperacion;
import com.geopista.protocol.contaminantes.OperacionesContaminantes;
import com.geopista.protocol.contaminantes.Contaminante;
import org.apache.log4j.Logger;

import javax.swing.*;
import javax.swing.table.TableColumn;
import java.awt.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Hashtable;
import java.util.ResourceBundle;
import java.util.Vector;
import java.io.StringWriter;
import java.io.PrintWriter;

/**
 * @author angeles
 */
public class JDialogBuscarContaminantes extends javax.swing.JDialog {
	private Logger logger = Logger.getLogger(JDialogInspectores.class);
	private ResourceBundle messages;
	private Vector listaActividades;
	private ActividadesTableModel modelActividades;
	private TableSorted sorter;

	private Vector actividadesConsultadas = new Vector();

	/**
	 * Creates new form JDialogBuscarContaminantes
	 */
	public JDialogBuscarContaminantes(java.awt.Frame parent, boolean modal,
									  ResourceBundle messages, JFrame desktop) {

		super(parent, modal);
		this.desktop = desktop;
		this.messages = messages;
		initComponents();
		initComboBoxesEstructuras();
		actualizarModelo();
		configureComponentes();
		changeScreenLang(messages);
	}


	public void initComboBoxesEstructuras() {
		while (!com.geopista.app.contaminantes.estructuras.Estructuras.isCargada()) {
			if (!com.geopista.app.contaminantes.estructuras.Estructuras.isIniciada()) com.geopista.app.contaminantes.estructuras.Estructuras.cargarEstructuras();
			try {Thread.sleep(500);} catch (Exception e) {}
		}


		/** Inicializamos los comboBox que llevan estructuras */

		tipoActividadContaminateEJCBox = new ComboBoxEstructuras(com.geopista.app.contaminantes.estructuras.Estructuras.getListaTipo(), null, Constantes.Locale.toString());
		jPanelDatos.add(tipoActividadContaminateEJCBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 50, 140, -1));
        razonEstudioEJCBox = new ComboBoxEstructuras(com.geopista.app.contaminantes.estructuras.Estructuras.getListaRazonEstudio(), null, Constantes.Locale.toString());
		jPanelDatos.add(razonEstudioEJCBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 50, 140, -1));

	}


	/**
	 * This method is called from within the constructor to
	 * initialize the form.
	 * WARNING: Do NOT modify this code. The content of this method is
	 * always regenerated by the Form Editor.
	 */

	private void configureComponentes() {
		jTextFieldFechaDesde.setEditable(false);
		jTextFieldFechaHasta.setEditable(false);
		razonEstudioEJCBox.setSelectedPatron("-1");
		tipoActividadContaminateEJCBox.setSelectedPatron("-1");


	}

	private void initComponents() {//GEN-BEGIN:initComponents
		jPanelPrincipal = new javax.swing.JPanel();
		jPanelDatos = new javax.swing.JPanel();
		jTextFieldFechaHasta = new JFormattedTextField((new SimpleDateFormat("dd-MM-yyyy")));
		jTextFieldFechaDesde =  new JFormattedTextField((new SimpleDateFormat("dd-MM-yyyy")));
        jButtonFechaHasta = new CalendarButton(jTextFieldFechaHasta);
        jButtonFechaDesde = new CalendarButton(jTextFieldFechaDesde);
		jLabelFecha = new javax.swing.JLabel();
		jTextFieldAsunto = new javax.swing.JTextField();
		jLabelAsunto = new javax.swing.JLabel();
		jLabelTipo = new javax.swing.JLabel();
		jLabelRazon = new javax.swing.JLabel();
		jTextFieldNumero = new javax.swing.JTextField();
		jLabelNumero = new javax.swing.JLabel();
		jPanelBuscar = new javax.swing.JPanel();
		jButtonTodos = new javax.swing.JButton();
		jButtonBuscar = new javax.swing.JButton();
		jPanelListado = new javax.swing.JPanel();
		jScrollPaneListado = new javax.swing.JScrollPane();
		jTableListado = new javax.swing.JTable();
		jPanelBotonera = new javax.swing.JPanel();
		jButtonMostrar = new javax.swing.JButton();
		jButtonBorrar = new javax.swing.JButton();
		jButtonImprimir = new javax.swing.JButton();
		jButtonCancelar = new javax.swing.JButton();

		setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
		jPanelPrincipal.setLayout(new java.awt.BorderLayout());

		jPanelDatos.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
		jPanelDatos.add(jButtonFechaHasta, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 110, 20, 20));
		jPanelDatos.add(jButtonFechaDesde, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 110, 20, 20));
		jPanelDatos.add(jTextFieldFechaHasta, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 110, 140, -1));
		jPanelDatos.add(jTextFieldFechaDesde, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 110, 140, -1));
		jPanelDatos.add(jLabelFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 110, -1));
		jPanelDatos.add(jTextFieldAsunto, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 80, 330, -1));
		jPanelDatos.add(jLabelAsunto, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 110, -1));
    	jPanelDatos.add(jLabelRazon, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 50, 40, -1));
		jPanelDatos.add(jLabelTipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 110, -1));
		jPanelDatos.add(jTextFieldNumero, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 20, 140, -1));
		jPanelDatos.add(jLabelNumero, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 110, -1));
    	jButtonTodos.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButtonBuscarActionPerformed(evt, new Hashtable());
			}
		});
		jPanelBuscar.add(jButtonTodos);
    	jPanelBuscar.add(jButtonBuscar);
		jButtonBuscar.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButtonBuscarActionPerformed(evt, null);
			}
		});
		jPanelDatos.add(jPanelBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, 440, 30));
		jPanelPrincipal.add(jPanelDatos, java.awt.BorderLayout.CENTER);
		jPanelListado.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
		jScrollPaneListado.setViewportView(jTableListado);
		jPanelListado.add(jScrollPaneListado, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 520, 250));
		jPanelPrincipal.add(jPanelListado, java.awt.BorderLayout.SOUTH);
        getContentPane().add(jPanelPrincipal, java.awt.BorderLayout.CENTER);
        jButtonMostrar.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButtonMostrarActionPerformed(evt);
			}
		});
		jPanelBotonera.add(jButtonMostrar);
        jButtonBorrar.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButtonBorrarActionPerformed(evt);
			}
		});
		jPanelBotonera.add(jButtonBorrar);
		jButtonImprimir.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButtonImprimirActionPerformed(evt);
			}
		});
		jPanelBotonera.add(jButtonImprimir);
		jButtonCancelar.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				dispose();
			}
		});
		jPanelBotonera.add(jButtonCancelar);
        boolean permitido=true;
        if (CMainContaminantes.acl!=null)
            permitido=CMainContaminantes.acl.checkPermission(new com.geopista.security.GeopistaPermission(com.geopista.security.GeopistaPermission.EDITAR_CONTAMINANTES));
	    jButtonBorrar.setEnabled(permitido);

		getContentPane().add(jPanelBotonera, java.awt.BorderLayout.SOUTH);

		pack();
	}//GEN-END:initComponents




	private void actualizarModelo() {
		modelActividades = new ActividadesTableModel();
		modelActividades.setModelData(listaActividades);
		sorter = new TableSorted(modelActividades);
		sorter.setTableHeader(jTableListado.getTableHeader());
		jTableListado.setModel(sorter);
		TableColumn column = jTableListado.getColumnModel().getColumn(0);
		column.setPreferredWidth(5);
		jTableListado.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
	}


	private void jButtonMostrarActionPerformed(java.awt.event.ActionEvent evt) {


		try {

			desktop.setCursor(Cursor.getPredefinedCursor(Cursor.WAIT_CURSOR));
			int row = jTableListado.getSelectedRow();
			if (row == -1) {
				logger.warn("El usuario ha de seleccionar una fila, antes de su edicion.");
				return;
			}
			String id = (String) jTableListado.getValueAt(row, 0);
			logger.info("id: " + id);
			this.dispose();
			//JFrameContaminantes jFrameContaminantes = new JFrameContaminantes(messages, desktop, id);
			CMainContaminantes mainContaminantes = (CMainContaminantes) desktop;
			mainContaminantes.verActividad(id);
            //jFrameContaminantes.zoom();

		} catch (Exception ex) {
			StringWriter sw = new StringWriter();
			PrintWriter pw = new PrintWriter(sw);
			ex.printStackTrace(pw);
			logger.error("Exception: " + sw.toString());
		}
		desktop.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));

	}

	private void jButtonImprimirActionPerformed(java.awt.event.ActionEvent evt) {
		Container container = this.getContentPane();

		try {

			container.setCursor(Cursor.getPredefinedCursor(Cursor.WAIT_CURSOR));


			this.dispose();

			JFrameInformesActividades informesActividades = new JFrameInformesActividades(messages, desktop, actividadesConsultadas);

			CMainContaminantes mainContaminantes = (CMainContaminantes) desktop;
			mainContaminantes.mostrarJInternalFrame(informesActividades);

			container.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
			


		} catch (Exception ex) {
			StringWriter sw = new StringWriter();
			PrintWriter pw = new PrintWriter(sw);
			ex.printStackTrace(pw);
			logger.error("Exception: " + sw.toString());
			container.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
		}
	}


	private void jButtonBorrarActionPerformed(java.awt.event.ActionEvent evt) {
		try {
			int row = jTableListado.getSelectedRow();
			if (row == -1) {
				logger.warn("El usuario ha de seleccionar una fila, antes de su edicion.");
				return;
			}


			Object[] options = {"Si", "No"};
			int n = JOptionPane.showOptionDialog(this,
					"�Est� seguro de querer borrar el registro?",
					"Importante",
					JOptionPane.YES_NO_OPTION,
					JOptionPane.QUESTION_MESSAGE,
					null, //don't use a custom Icon
					options, //the titles of buttons
					options[1]); //default button title
			logger.info("n: " + n);

			if (n != 0) {
				return;
			}


			desktop.setCursor(Cursor.getPredefinedCursor(Cursor.WAIT_CURSOR));
			String id = (String) jTableListado.getValueAt(row, 0);
			logger.info("id: " + id);

			Contaminante contaminante = new Contaminante();
			contaminante.setId(id);
			CResultadoOperacion result = new OperacionesContaminantes(com.geopista.app.contaminantes.init.Constantes.url).deleteActividad(contaminante);
            if (result.getResultado()==true)
            {
			    listaActividades=actualizarListado(contaminante,true);
			    actualizarModelo();
            }
            else {
			    JOptionPane optionPane = new JOptionPane(result.getDescripcion(), JOptionPane.ERROR_MESSAGE);
			    JDialog dialog = optionPane.createDialog(this, "ERROR");
			    dialog.show();
		    }
			desktop.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));

		} catch (Exception ex) {
			StringWriter sw = new StringWriter();
			PrintWriter pw = new PrintWriter(sw);
			ex.printStackTrace(pw);
			logger.error("Exception: " + sw.toString());
			desktop.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
		}

	}

	private Vector actualizarListado(Contaminante newContaminante, boolean borrar) {

		Vector vector = new Vector();

		for (int i = 0; i < listaActividades.size(); i++) {
			Contaminante contaminante = (Contaminante) listaActividades.elementAt(i);

			if (newContaminante.getId().equalsIgnoreCase(contaminante.getId())) {
				if (!borrar) {
					vector.add(newContaminante);
				}
				continue;
			}
			vector.add(contaminante);

		}

		return vector;

	}


	private void jButtonBuscarActionPerformed(java.awt.event.ActionEvent evt, Hashtable hash) {
		try {


			if (hash == null) {


				hash = new Hashtable();

				//logger.info("tipoActividadContaminateEJCBox.getSelectedPatron(): " + tipoActividadContaminateEJCBox.getSelectedPatron());
				if (tipoActividadContaminateEJCBox.getSelectedPatron()!=null) {
					hash.put("ID_TIPO_ACTIVIDAD", "" + tipoActividadContaminateEJCBox.getSelectedPatron().toString());
				}

				//logger.info("razonEstudioEJCBox.getSelectedPatron(): " + razonEstudioEJCBox.getSelectedPatron());
				if (razonEstudioEJCBox.getSelectedPatron()!=null) {
					hash.put("ID_RAZON_ESTUDIO", "" + razonEstudioEJCBox.getSelectedPatron());
				}

                if(jTextFieldNumero.getText().trim().length()>0)
				    hash.put("NUM_ADMINISTRATIVO", jTextFieldNumero.getText());

                if(jTextFieldAsunto.getText().trim().length()>0)
                    hash.put("ASUNTO", jTextFieldAsunto.getText());

                if (jTextFieldFechaDesde.getText().trim().length()>0 || jTextFieldFechaHasta.getText().trim().length()>0)
                {
                     Date fechaDesde=null;
			    	if (jTextFieldFechaDesde.getText().trim().equals(""))
				    	fechaDesde = new Date(1);
				    else
                        fechaDesde= jButtonFechaDesde.getCalendar().getTime();

                    if (fechaDesde == null) {
                        JOptionPane.showMessageDialog(desktop, "La fecha 'desde' no parece correcta. Formato correcto: dd/mm/yyyy");
				    	return;
				    }

				    Date fechaHasta=null;
			    	if (jTextFieldFechaHasta.getText().trim().equals("")) {
				    	long fechaHastaMillis = new Date().getTime();
				    	fechaHastaMillis += (24 * 60 * 60 * 1000); //1 d�a
				    	fechaHasta = new Date(fechaHastaMillis);
				    }
                    else
                        fechaHasta= jButtonFechaHasta.getCalendar().getTime();
			    	if (fechaHasta == null) {
				    	JOptionPane.showMessageDialog(desktop, "La fecha 'hasta' no parece correcta. Formato correcto: dd/mm/yyyy");
				    	return;
				    }
                    if ((fechaDesde != null) && (fechaHasta != null)) {
                    		if (fechaHasta.before(fechaDesde)) {
                        	    JOptionPane.showMessageDialog(desktop, "La fecha 'desde' no parece anterior a la fecha 'hasta'.");
						        return;
                   	        }
                            String fechaDesdeFormatted = new SimpleDateFormat("yyyy-MM-dd").format(fechaDesde);
					        String fechaHastaFormatted = new SimpleDateFormat("yyyy-MM-dd").format(fechaHasta);
                            hash.put("BETWEEN*FECHA_INICIO", fechaDesdeFormatted + "*" + fechaHastaFormatted);
				    }
                }
			}


			this.setCursor(Cursor.getPredefinedCursor(Cursor.WAIT_CURSOR));

			CResultadoOperacion result = new OperacionesContaminantes(com.geopista.app.contaminantes.init.Constantes.url).getSearchedActividadesContaminantes(hash);
			actividadesConsultadas = result.getVector();
			if (result.getResultado()) {
				listaActividades = result.getVector();
				actualizarModelo();
			} else {
				JOptionPane optionPane = new JOptionPane(result.getDescripcion(), JOptionPane.INFORMATION_MESSAGE);
				JDialog dialog = optionPane.createDialog(this, "INFO");
				dialog.show();
				return;

			}
			if (listaActividades == null) listaActividades = new Vector();

			this.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));


		} catch (Exception e) {
			logger.error("Error de contactos al inicializar los datos: " + e.toString());
			this.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
		}
	}

	public void changeScreenLang(ResourceBundle messages) {
        this.messages=messages;

		try {
			setTitle(messages.getString("JDialogBuscarContaminantes.JInternalFrame.title"));
			jPanelDatos.setBorder(new javax.swing.border.TitledBorder(messages.getString("JDialogBuscarContaminantes.jPanelDatos.TitleBorder")));

			jButtonBuscar.setText(messages.getString("JDialogBuscarContaminantes.jButtonBuscar.text"));
			jButtonCancelar.setText(messages.getString("JDialogBuscarContaminantes.jButtonCancelar.text"));
			jButtonImprimir.setText(messages.getString("JDialogBuscarContaminantes.jButtonImprimir.text"));
			jButtonMostrar.setText(messages.getString("JDialogBuscarContaminantes.jButtonMostrar.text"));
			jButtonBorrar.setText(messages.getString("JDialogBuscarContaminantes.jButtonBorrar.text"));
			jButtonTodos.setText(messages.getString("JDialogBuscarContaminantes.jButtonTodos.text"));
			jLabelAsunto.setText(messages.getString("JDialogBuscarContaminantes.jLabelAsunto.text"));
			jLabelFecha.setText(messages.getString("JDialogBuscarContaminantes.jLabelFecha.text"));
			jLabelNumero.setText(messages.getString("JDialogBuscarContaminantes.jLabelNumero.text"));
			jLabelRazon.setText(messages.getString("JDialogBuscarContaminantes.jLabelRazon.text"));
			jLabelTipo.setText(messages.getString("JDialogBuscarContaminantes.jLabelTipo.text"));

            jButtonBuscar.setToolTipText(messages.getString("JDialogBuscarContaminantes.jButtonBuscar.text"));
            jButtonCancelar.setToolTipText(messages.getString("JDialogBuscarContaminantes.jButtonCancelar.text"));
            jButtonFechaDesde.setToolTipText(messages.getString("JDialogBuscarContaminantes.jButtonFechaDesde.text"));
            jButtonFechaHasta.setToolTipText(messages.getString("JDialogBuscarContaminantes.jButtonFechaHasta.text"));
            jButtonImprimir.setToolTipText(messages.getString("JDialogBuscarContaminantes.jButtonImprimir.text"));
            jButtonMostrar.setToolTipText(messages.getString("JDialogBuscarContaminantes.jButtonMostrar.text"));
            jButtonBorrar.setToolTipText(messages.getString("JDialogBuscarContaminantes.jButtonBorrar.text"));
            jButtonTodos.setToolTipText(messages.getString("JDialogBuscarContaminantes.jButtonTodos.text"));


			ActividadesTableModel.setColumnNames(new String[]{messages.getString("JDialogBuscarContaminantes.ActividadesTableModel.col0.text"),messages.getString("JDialogBuscarContaminantes.ActividadesTableModel.col1.text"),messages.getString("JDialogBuscarContaminantes.ActividadesTableModel.col2.text"),messages.getString("JDialogBuscarContaminantes.ActividadesTableModel.col3.text")});
			actualizarModelo();

		} catch (Exception ex) {
			StringWriter sw = new StringWriter();
			PrintWriter pw = new PrintWriter(sw);
			ex.printStackTrace(pw);
			logger.error("Exception: " + sw.toString());
		}
	}



	private ComboBoxEstructuras tipoActividadContaminateEJCBox;
	private ComboBoxEstructuras razonEstudioEJCBox;
	private JFrame desktop;
	// Variables declaration - do not modify//GEN-BEGIN:variables
	private javax.swing.JButton jButtonBuscar;
	private javax.swing.JButton jButtonCancelar;
	private CalendarButton jButtonFechaDesde;
	private CalendarButton jButtonFechaHasta;
	private javax.swing.JButton jButtonImprimir;
	private javax.swing.JButton jButtonMostrar;
	private javax.swing.JButton jButtonBorrar;
	private javax.swing.JButton jButtonTodos;
	private javax.swing.JLabel jLabelAsunto;
	private javax.swing.JLabel jLabelFecha;
	private javax.swing.JLabel jLabelNumero;
	private javax.swing.JLabel jLabelRazon;
	private javax.swing.JLabel jLabelTipo;
	private javax.swing.JPanel jPanelBotonera;
	private javax.swing.JPanel jPanelBuscar;
	private javax.swing.JPanel jPanelDatos;
	private javax.swing.JPanel jPanelListado;
	private javax.swing.JPanel jPanelPrincipal;
	private javax.swing.JScrollPane jScrollPaneListado;
	private javax.swing.JTable jTableListado;
	private javax.swing.JTextField jTextFieldAsunto;
	private javax.swing.JFormattedTextField jTextFieldFechaDesde;
    private javax.swing.JFormattedTextField jTextFieldFechaHasta;
	private javax.swing.JTextField jTextFieldNumero;
	// End of variables declaration//GEN-END:variables

}
