/**
 * CGeneracionPlanos.java
 * � MINETUR, Government of Spain
 * This program is part of LocalGIS
 * This program is free software: you can redistribute it and/or modify it under the terms of the GNU General Public License as published by the Free Software Foundation, either version 2 of the License, or (at your option) any later version.
 * This program is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU General Public License for more details.
 * You should have received a copy of the GNU General Public License along with this program. If not, see <http://www.gnu.org/licenses/>.
 */
/*
 * CCreacionLicencias.java
 *
 * Created on 16 de abril de 2004, 14:38
 */

package com.geopista.app.ocupaciones;

import java.awt.BorderLayout;
import java.awt.Cursor;
import java.awt.Dimension;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.Collection;
import java.util.Iterator;
import java.util.Vector;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import org.apache.log4j.Logger;

import com.geopista.app.ocupaciones.panel.CSearchJDialog;
import com.geopista.app.printer.FichasDisponibles;
import com.geopista.app.printer.GeopistaPrintableOcupaciones;
import com.geopista.editor.GeopistaEditor;
import com.geopista.model.GeopistaLayer;
import com.geopista.protocol.CResultadoOperacion;
import com.geopista.protocol.licencias.COperacionesLicencias;
import com.geopista.protocol.licencias.CReferenciaCatastral;
import com.geopista.protocol.licencias.CSolicitudLicencia;
import com.vividsolutions.jump.feature.Feature;


/**
 * @author charo
 */
public class CGeneracionPlanos extends javax.swing.JInternalFrame implements IMultilingue{
	Logger logger = Logger.getLogger(CGeneracionPlanos.class);
    private final String layerName="ocupaciones";


	/**
	 * Modelo para el componente listaAnexosJTable
	 */
	final CListaAnexosTableModel _listaAnexosTableModel = new CListaAnexosTableModel();

	/**
	 * Creates new form CCreacionLicencias
	 */
	public CGeneracionPlanos(JFrame desktop) {
		this.desktop = desktop;
        CUtilidadesComponentes.menuLicenciasSetEnabled(false, this.desktop);
    	initComponents();
		configureComponets();
		String mostrarMapa=System.getProperty("mostrarMapa");
		if(mostrarMapa==null || !mostrarMapa.equals("false")){
			CUtilidadesComponentes.showGeopistaEditor(desktop,jPanelMapa, CMainOcupaciones.geopistaEditor, false);
		}
	}

	private boolean configureComponets() {
		if (CMainOcupaciones.geopistaEditor==null) CMainOcupaciones.geopistaEditor = new GeopistaEditor("workbench-properties-simple.xml");
		buscarExpedienteJButton.setIcon(CUtilidadesComponentes.iconoZoom);
        renombrarComponentes();
		return true;
	}


	/**
	 * This method is called from within the constructor to
	 * initialize the form.
	 * WARNING: Do NOT modify this code. The content of this method is
	 * always regenerated by the Form Editor.
	 */
    private void initComponents() {//GEN-BEGIN:initComponents
        buttonGroup1 = new javax.swing.ButtonGroup();
        templateJScrollPane = new javax.swing.JScrollPane();
        jPanelPrincipal = new javax.swing.JPanel();
        jPanelBotonera = new javax.swing.JPanel();
        jPanelOpciones = new javax.swing.JPanel();
        salirJButton = new javax.swing.JButton();
        previewJButton = new javax.swing.JButton();
        jPanelMapa = new javax.swing.JPanel();
        generarJButton = new javax.swing.JButton();
        todosExpedientesJRadioButton = new javax.swing.JRadioButton();
        expedienteEspecificoJRadioButton = new javax.swing.JRadioButton();
        expedienteJTextField = new javax.swing.JTextField();
        buscarExpedienteJButton = new javax.swing.JButton();
        getContentPane().setLayout(new java.awt.GridLayout(1, 0));
        jPanelPrincipal.setLayout(new BorderLayout());

        setClosable(true);
        addInternalFrameListener(new javax.swing.event.InternalFrameListener() {
            public void internalFrameOpened(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosing(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosed(javax.swing.event.InternalFrameEvent evt) {
                formInternalFrameClosed(evt);
            }
            public void internalFrameIconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeiconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameActivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeactivated(javax.swing.event.InternalFrameEvent evt) {
            }
        });

        jPanelBotonera.setBorder(new javax.swing.border.EtchedBorder());
        previewJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                previewJButtonActionPerformed(evt);
            }
        });
        jPanelBotonera.add(previewJButton);
        generarJButton.addActionListener(new java.awt.event.ActionListener() {
                    public void actionPerformed(java.awt.event.ActionEvent evt) {
                        generarJButtonActionPerformed(evt);
                    }
                });
        jPanelBotonera.add(generarJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 10, 110, -1));
        salirJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salirJButtonActionPerformed(evt);
            }
        });

        jPanelBotonera.add(salirJButton);
        jPanelPrincipal.add(jPanelBotonera, BorderLayout.SOUTH);
        jPanelMapa.setLayout(new java.awt.GridLayout(1, 0));
        jPanelPrincipal.add(jPanelMapa, BorderLayout.CENTER);

        jPanelOpciones.setPreferredSize(new Dimension(350,350));
        jPanelOpciones.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        todosExpedientesJRadioButton.setSelected(true);
        buttonGroup1.add(todosExpedientesJRadioButton);
        todosExpedientesJRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                previewJButtonActionPerformed(null);
            }
        });
        jPanelOpciones.add(todosExpedientesJRadioButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, -1, -1));
        buttonGroup1.add(expedienteEspecificoJRadioButton);
        expedienteEspecificoJRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                expedienteEspecificoJRadioButtonActionPerformed(evt);
            }
        });
        jPanelOpciones.add(expedienteEspecificoJRadioButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, -1, -1));
        expedienteJTextField.setEditable(true);
        expedienteJTextField.setEnabled(false);
        jPanelOpciones.add(expedienteJTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 100, 190, -1));
        buscarExpedienteJButton.setBorder(new javax.swing.border.BevelBorder(javax.swing.border.BevelBorder.RAISED));
        buscarExpedienteJButton.setPreferredSize(new java.awt.Dimension(30, 30));
        buscarExpedienteJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarExpedienteJButtonActionPerformed();
            }
        });
        jPanelOpciones.add(buscarExpedienteJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 100, 20, 20));
        jPanelPrincipal.add(jPanelOpciones, BorderLayout.WEST);
        templateJScrollPane.setViewportView(jPanelPrincipal);
        getContentPane().add(templateJScrollPane);
    }//GEN-END:initComponents

    private void formInternalFrameClosed(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameClosed
        CConstantesOcupaciones.helpSetHomeID = "ocupacionesIntro";
        CUtilidadesComponentes.menuLicenciasSetEnabled(true, this.desktop);        
    }//GEN-LAST:event_formInternalFrameClosed

	private void expedienteEspecificoJRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_expedienteEspecificoJRadioButtonActionPerformed
        CSearchJDialog dialog= CUtilidadesComponentes.showSearchDialog(desktop, false);
        if ((dialog != null) && (dialog.getSelectedExpediente() != null)){
            expedienteJTextField.setText(dialog.getSelectedExpediente());
       }
        previewJButtonActionPerformed(null);

	}//GEN-LAST:event_expedienteEspecificoJRadioButtonActionPerformed


	private void generarJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_generarJButtonActionPerformed
        try
        {
            new GeopistaPrintableOcupaciones().printObjeto(FichasDisponibles.planoocupacion, null , null, CMainOcupaciones.geopistaEditor.getLayerViewPanel(), GeopistaPrintableOcupaciones.FICHA_OCUPACIONES_PLANOS);
        }catch(Exception e)
        {
            logger.error("Error al generar el plano",e);
        }
	}//GEN-LAST:event_generarJButtonActionPerformed

	private void previewJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_previewJButtonActionPerformed

		this.setCursor(Cursor.getPredefinedCursor(Cursor.WAIT_CURSOR));
		try {
			CMainOcupaciones.geopistaEditor.getSelectionManager().clear();
			if (todosExpedientesJRadioButton.isSelected()) {
                refreshFeatureSelection();
			} else if (expedienteEspecificoJRadioButton.isSelected()) {
				if ((expedienteJTextField.getText() == null) || (expedienteJTextField.getText().trim().equals(""))) {
					mostrarMensaje("Por favor, selecione un expediente espec�fico.");
					logger.warn("No hay un expediente especifico seleccionado.");
					this.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
					return;
				}
				CResultadoOperacion resultadoOperacion = COperacionesLicencias.getExpedienteLicencia(expedienteJTextField.getText(), CMainOcupaciones.currentLocale, null);
                CSolicitudLicencia solicitudLicencia = (CSolicitudLicencia) resultadoOperacion.getSolicitudes().get(0);
				Vector referenciasCatastrales = solicitudLicencia.getReferenciasCatastrales();
                refreshFeatureSelection(referenciasCatastrales);
			}
			CMainOcupaciones.geopistaEditor.zoomToSelected();
		} catch (Exception ex) {
			logger.error("Exception: ", ex);
		}
		this.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
	}//GEN-LAST:event_previewJButtonActionPerformed
    private boolean refreshFeatureSelection()
    {
            try {
                this.setCursor(Cursor.getPredefinedCursor(Cursor.WAIT_CURSOR));
                CMainOcupaciones.geopistaEditor.getSelectionManager().clear();
                GeopistaLayer layer= (GeopistaLayer)CMainOcupaciones.geopistaEditor.getLayerManager().getLayer(layerName);
                for (Iterator i=layer.getFeatureCollectionWrapper().getFeatures().iterator();i.hasNext();) {
                        Feature feature = (Feature) i.next();
                        CMainOcupaciones.geopistaEditor.select(layer, feature);
                }
                CMainOcupaciones.geopistaEditor.zoomToSelected();
                this.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
                return true;
            } catch (Exception ex) {

                this.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
                logger.error("Exception al mostrar las features: " ,ex);
                return false;
            }
        }


	private boolean refreshFeatureSelection(Vector referenciasCatastrales) {

		try {
			this.setCursor(Cursor.getPredefinedCursor(Cursor.WAIT_CURSOR));
			CMainOcupaciones.geopistaEditor.getSelectionManager().clear();
            GeopistaLayer geopistaLayer = (GeopistaLayer) CMainOcupaciones.geopistaEditor.getLayerManager().getLayer(layerName);
            java.util.List featureList = geopistaLayer.getFeatureCollectionWrapper().getFeatures();
            if(featureList!=null){
            	if(featureList.size()>0){
	            Feature feature = (Feature) featureList.get(0);
	            String attributeName = feature.getSchema().getAttributeName(0);
	            if (referenciasCatastrales==null) return true;
				for (int i=0; i < referenciasCatastrales.size(); i++){
					CReferenciaCatastral referenciaCatastral = (CReferenciaCatastral)referenciasCatastrales.get(i);
					Collection collection = CUtilidadesComponentes.searchByAttribute(geopistaLayer, attributeName, referenciaCatastral.getReferenciaCatastral());
					Iterator it = collection.iterator();
					if (it.hasNext()) {
						CMainOcupaciones.geopistaEditor.select(geopistaLayer, (Feature) it.next());
					}
				}
            }//la lista de features no est� vac�a
           }//la lista de features no es nula
			CMainOcupaciones.geopistaEditor.zoomToSelected();
			this.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
			return true;
		} catch (Exception ex) {

			this.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
			StringWriter sw = new StringWriter();
			PrintWriter pw = new PrintWriter(sw);
			ex.printStackTrace(pw);
			logger.error("Exception: " + sw.toString());
			return false;
		}

	}


	public void mostrarMensaje(String mensaje) {
		JOptionPane.showMessageDialog(desktop, mensaje);
	}


	private void buscarExpedienteJButtonActionPerformed()
    {//GEN-FIRST:event_buscarExpedienteJButtonActionPerformed
		expedienteEspecificoJRadioButton.setSelected(true);
        CSearchJDialog dialog= CUtilidadesComponentes.showSearchDialog(desktop, false);
        if ((dialog != null) && (dialog.getSelectedExpediente() != null)){
            expedienteJTextField.setText(dialog.getSelectedExpediente());
        }
        previewJButtonActionPerformed(null);
	}//GEN-LAST:event_buscarExpedienteJButtonActionPerformed

	private void salirJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salirJButtonActionPerformed
		dispose();
	}//GEN-LAST:event_salirJButtonActionPerformed






	/*********************************************************************/

	/**
	 * Exit the Application
	 */
	private void exitForm(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_exitForm
		System.exit(0);
	}//GEN-LAST:event_exitForm

	/**
	 * @param args the command line arguments
	 */
	public static void main(String args[]) {
		new CGeneracionPlanos(null).show();
	}

	private JFrame desktop;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanelBotonera;
    private javax.swing.JButton buscarExpedienteJButton;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JPanel jPanelMapa;
    private javax.swing.JRadioButton expedienteEspecificoJRadioButton;
    private javax.swing.JTextField expedienteJTextField;
    private javax.swing.JButton generarJButton;
    private javax.swing.JButton previewJButton;
    private javax.swing.JButton salirJButton;
    private javax.swing.JPanel jPanelOpciones;
    private javax.swing.JPanel jPanelPrincipal;
    private javax.swing.JScrollPane templateJScrollPane;
    private javax.swing.JRadioButton todosExpedientesJRadioButton;
    // End of variables declaration//GEN-END:variables


	public void renombrarComponentes() {

		try {
			setTitle(CMainOcupaciones.literales.getString("CGeneracionPlanosForm.JInternalFrame.title"));
			jPanelOpciones.setBorder(new javax.swing.border.TitledBorder(CMainOcupaciones.literales.getString("CGeneracionPlanosForm.jPanel2.TitleBorder")));
			jPanelMapa.setBorder(new javax.swing.border.TitledBorder(CMainOcupaciones.literales.getString("CGeneracionPlanosForm.editorMapaJPanel.TitleBorder")));
			todosExpedientesJRadioButton.setText(CMainOcupaciones.literales.getString("CGeneracionPlanosForm.todosExpedientesJRadioButton.text"));
			expedienteEspecificoJRadioButton.setText(CMainOcupaciones.literales.getString("CGeneracionPlanosForm.expedienteEspecificoJRadioButton.text"));
			previewJButton.setText(CMainOcupaciones.literales.getString("CGeneracionPlanosForm.previewJButton.text"));
			salirJButton.setText(CMainOcupaciones.literales.getString("CGeneracionPlanosForm.salirJButton.text"));
			generarJButton.setText(CMainOcupaciones.literales.getString("CGeneracionPlanosForm.generarJButton.text"));

            previewJButton.setToolTipText(CMainOcupaciones.literales.getString("CGeneracionPlanosForm.previewJButton.text"));
            salirJButton.setToolTipText(CMainOcupaciones.literales.getString("CGeneracionPlanosForm.salirJButton.text"));
            generarJButton.setToolTipText(CMainOcupaciones.literales.getString("CGeneracionPlanosForm.generarJButton.text"));
            buscarExpedienteJButton.setToolTipText(CMainOcupaciones.literales.getString("CGeneracionPlanosForm.buscarExpedienteJButton.text"));
		} catch (Exception ex) {
			StringWriter sw = new StringWriter();
			PrintWriter pw = new PrintWriter(sw);
			ex.printStackTrace(pw);
			logger.error("Exception: " + sw.toString());
		}
	}

}
