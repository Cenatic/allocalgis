package com.geopista.app.utilidades;

import org.apache.log4j.Logger;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;
import javax.swing.*;
import java.util.Vector;
import java.util.Hashtable;
import java.util.ResourceBundle;
import java.util.Enumeration;
import java.awt.*;
import com.geopista.protocol.licencias.CPersonaJuridicoFisica;
import com.geopista.protocol.licencias.COperacionesLicencias;


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


public class JDialogPersona extends javax.swing.JDialog {
    ResourceBundle messages;
    CPersonaJuridicoFisica persona=null;
    private boolean aceptado=false;
    PersonaTableModel modelPersona;
    private Vector personas= new Vector();
    private TableSorted sorter;
    private JFrame padre;
   	Logger logger = Logger.getLogger(JDialogPersona.class);

	/**
	 * Creates new form JSearch
	 */
	public JDialogPersona(java.awt.Frame parent, boolean modal, ResourceBundle messages) {
		super(parent, modal);
        this.messages=messages;
        initComponents();
        changeScreenLang(messages);
		actualizarModelo();
	}


	/**
	 * This method is called from within the constructor to
	 * initialize the form.
	 * WARNING: Do NOT modify this code. The content of this method is
	 * always regenerated by the Form Editor.
	 */
    private void initComponents() {//GEN-BEGIN:initComponents
        jPanelPrincipal = new javax.swing.JPanel();
        aceptarJButton = new javax.swing.JButton();
        cancelarJButton = new javax.swing.JButton();
        buscarJButton = new javax.swing.JButton();
        dniJTextField = new javax.swing.JTextField();
        dniJLabel = new javax.swing.JLabel();
        expedientesJScrollPane = new javax.swing.JScrollPane();
        expedientesJTable = new javax.swing.JTable();
        nombreJTextField = new javax.swing.JTextField();
        nombreJLabel = new javax.swing.JLabel();
        apellido1JTextField = new javax.swing.JTextField();
        apellido1JLabel = new javax.swing.JLabel();
        apellido2JLabel = new javax.swing.JLabel();
        apellido2JTextField = new javax.swing.JTextField();

        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        jPanelPrincipal.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanelPrincipal.setBorder(new javax.swing.border.EtchedBorder());
        aceptarJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aceptar();
            }
        });

        jPanelPrincipal.add(aceptarJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 360, -1, -1));
        cancelarJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                 aceptado=false;
                 dispose();
            }
        });

        jPanelPrincipal.add(cancelarJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 360, -1, -1));

        buscarJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscar();
            }
        });
        jPanelPrincipal.add(buscarJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 110, -1, -1));
        jPanelPrincipal.add(dniJTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 20, 320, -1));
        jPanelPrincipal.add(dniJLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 120, 20));
        expedientesJTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                load();
            }
        });

        expedientesJScrollPane.setViewportView(expedientesJTable);

        jPanelPrincipal.add(expedientesJScrollPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, 460, 200));

        jPanelPrincipal.add(nombreJTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 40, 320, -1));
        jPanelPrincipal.add(nombreJLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 120, 20));

        jPanelPrincipal.add(apellido1JTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 60, 320, -1));
        jPanelPrincipal.add(apellido1JLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 120, 20));
        jPanelPrincipal.add(apellido2JLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 120, 20));
        jPanelPrincipal.add(apellido2JTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 80, 320, -1));
        getContentPane().add(jPanelPrincipal, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 480, 400));

        pack();
    }//GEN-END:initComponents

	private void load() {//GEN-FIRST:event_expedientesJTableMouseClicked

		try{
		    int seleccion = expedientesJTable.getSelectedRow();
            if (seleccion != -1){

                persona= (CPersonaJuridicoFisica) sorter.getValueAt(seleccion, PersonaTableModel.idIndex);
          }
		}catch(Exception ex){
            logger.error("Exception: "+ex.toString());

        }
	}//GEN-LAST:event_expedientesJTableMouseClicked

	private void buscar() {//GEN-FIRST:event_buscarJButtonActionPerformed

		Hashtable hash=new Hashtable();
		hash.put("DNI_CIF",dniJTextField.getText());
		hash.put("NOMBRE",nombreJTextField.getText());
		hash.put("APELLIDO1",apellido1JTextField.getText());
		hash.put("APELLIDO2",apellido2JTextField.getText());
		this.setCursor(Cursor.getPredefinedCursor(Cursor.WAIT_CURSOR));
		personas = COperacionesLicencias.getSearchedPersonas(hash);
		this.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
        actualizarModelo();
		if ((personas == null) || (personas.size() == 0)) {
			JOptionPane.showMessageDialog(padre, "Persona no encontrada.");
			return;
		}
	}//GEN-LAST:event_buscarJButtonActionPerformed
    private void aceptar()
    {
         aceptado=true;
         dispose();
    }

    private void actualizarModelo()
    {
          modelPersona = new PersonaTableModel();
          modelPersona.setModelData(personas);
          sorter = new TableSorted(modelPersona);
          sorter.setTableHeader(expedientesJTable.getTableHeader());
          expedientesJTable.setModel(sorter);
          expedientesJTable.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
          TableColumn column = expedientesJTable.getColumnModel().getColumn(PersonaTableModel.idIndex);
          column.setPreferredWidth(1);
          column.setWidth(1);
          column.setResizable(false);
          column.setMaxWidth(1);
    }

    public CPersonaJuridicoFisica getPersona() {
        return persona;
    }
    public boolean isAceptado() {
         return aceptado;
     }

    private javax.swing.JButton aceptarJButton;
    private javax.swing.JLabel apellido1JLabel;
    private javax.swing.JTextField apellido1JTextField;
    private javax.swing.JLabel apellido2JLabel;
    private javax.swing.JTextField apellido2JTextField;
    private javax.swing.JButton buscarJButton;
    private javax.swing.JButton cancelarJButton;
    private javax.swing.JLabel dniJLabel;
    private javax.swing.JTextField dniJTextField;
    private javax.swing.JScrollPane expedientesJScrollPane;
    private javax.swing.JTable expedientesJTable;
    private javax.swing.JPanel jPanelPrincipal;
    private javax.swing.JLabel nombreJLabel;
    private javax.swing.JTextField nombreJTextField;
    // End of variables declaration//GEN-END:variables

    public void changeScreenLang(ResourceBundle messages)
    {
    	try {
			setTitle(messages.getString("CPersonaJDialog.JInternalFrame.title"));
			dniJLabel.setText(messages.getString("CPersonaJDialog.dniJLabel.text"));
			nombreJLabel.setText(messages.getString("CPersonaJDialog.nombreJLabel.text"));
			apellido1JLabel.setText(messages.getString("CPersonaJDialog.apellido1JLabel.text"));
			apellido2JLabel.setText(messages.getString("CPersonaJDialog.apellido2JLabel.text"));
			buscarJButton.setText(messages.getString("CPersonaJDialog.buscarJButton.text"));
			cancelarJButton.setText(messages.getString("CPersonaJDialog.cancelarJButton.text"));
			aceptarJButton.setText(messages.getString("CPersonaJDialog.aceptarJButton.text"));
            PersonaTableModel.setColumnNames(new String[]{messages.getString("CPersonaJDialog.expedientesJTableModel.text.column1"),messages.getString("CPersonaJDialog.expedientesJTableModel.text.column2"),messages.getString("CPersonaJDialog.expedientesJTableModel.text.column3"),messages.getString("CPersonaJDialog.expedientesJTableModel.text.column4"),""});
		} catch (Exception ex) {
			logger.error("Exception: " ,ex);
		}
	}
}

class PersonaTableModel extends DefaultTableModel
{
    Logger logger = Logger.getLogger(JDialogPersona.class);

	private static String[] tableModelNames = new String[]{"D.N.I. / N.I.F.", "Nombre", "1er apellido","2do apellido",""};
    public static int idIndex=4;

	public void setModelData(Vector personas)
    {
		try
        {
			if (personas == null) return;
			for (Enumeration e = personas.elements(); e.hasMoreElements();) {
				CPersonaJuridicoFisica aux = (CPersonaJuridicoFisica) e.nextElement();
				Object row[] = new Object[]{aux.getDniCif(), aux.getNombre(), aux.getApellido1(),aux.getApellido2(), aux};
				this.addRow(row);
			}
			fireTableDataChanged();
		} catch (Exception e) {
            logger.error("Error al mostrar la lista de personas: ",e);
		}
	}


	public int getColumnCount() {
		return tableModelNames.length;
	}

	public String getColumnName(int c) {
		return tableModelNames[c];
	}

	public String setColumnName(int c, String sName) {
		return tableModelNames[c] = sName;
	}

	public boolean isCellEditable(int rowIndex, int columnIndex) {
		return false;
	}

    public static void setColumnNames(String[] colNames){
        tableModelNames= colNames;
    }
}
