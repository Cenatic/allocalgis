/*
 * CAplicacionesFrame.java
 *
 * Created on 16 de junio de 2004, 15:13
 */

package com.geopista.app.centralizadorsso.localgisapp;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import java.util.Hashtable;
import java.util.ResourceBundle;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import javax.swing.ScrollPaneConstants;
import javax.swing.border.LineBorder;

import org.apache.log4j.Logger;

import com.geopista.app.AppContext;
import com.geopista.app.centralizadorsso.beans.LocalGISApp;
import com.geopista.app.centralizadorsso.utils.Utils;
import com.geopista.app.utilidades.TableSorted;
import com.geopista.security.SecurityManager;
import com.geopista.security.sso.SSOAuthManager;
import com.vividsolutions.jump.I18N;
import com.vividsolutions.jump.workbench.ui.task.TaskMonitorDialog;

/**
 * 
 * @author dcaaveiro
 */
public class CLocalGISAppFrame extends javax.swing.JInternalFrame {

	Logger logger = Logger.getLogger(CLocalGISAppFrame.class);
	LocalGISAppTableModel modelLocalGISApp;
	LocalGISAppTableModel modelLocalGISWeb;
	Hashtable<String,LocalGISApp> listaLocalGISApp;
	private TableSorted sorter;
	ResourceBundle messages;

	public final static String APP_TITLE_MARKER = "               "
			+ (new Character('\u25CF')) + "    ";
	private static final String IMAGE_SSO_TITLE_TOP = "/img/sso_title_top.png";
	private static final String IMAGE_SSO_TITLE_LEFT = "/img/sso_title_left.png";

	/** Creates new form CAplicacionesFrame */
	public CLocalGISAppFrame(ResourceBundle messages) {
		this.messages = messages;
		initComponents();
	}

	private void initComponents() {// GEN-BEGIN:initComponents
		final JFrame parent = (JFrame) getRootPane().getTopLevelAncestor();
		final JInternalFrame parentInternal = (JInternalFrame) getRootPane()
				.getParent();
				
		jPanelTopImg = new javax.swing.JPanel();
		jPanelLeftImg = new javax.swing.JPanel();
		jPanelContent = new javax.swing.JPanel();
		jPanelRightLine = new javax.swing.JPanel();
		jPanelBottomLine = new javax.swing.JPanel();

		jPanelInfo = new javax.swing.JPanel();
		jPanelAplications = new javax.swing.JPanel();
		jPanelWeb = new javax.swing.JPanel();

		getContentPane().setLayout(new BorderLayout(0, 0));
		// this.setBackground(Color.WHITE);

		getContentPane().add(jPanelTopImg, BorderLayout.NORTH);

		// jPanelTopImg.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		jPanelTopImg.setLayout(new BorderLayout(0, 0));
		jPanelTopImg.setBackground(Color.WHITE);

		ImageIcon imageIconTitleTop = new ImageIcon(
				CLocalGISAppFrame.class.getResource(IMAGE_SSO_TITLE_TOP));
		imageTitleTop = new JLabel(imageIconTitleTop);

//		jPanelTopImg.setSize(900, 275);
//		jPanelTopImg.setPreferredSize(new Dimension(900, 275));
		jPanelTopImg.setSize(900, 215);
		jPanelTopImg.setPreferredSize(new Dimension(900, 215));
		imageTitleTop.setPreferredSize(new Dimension(imageIconTitleTop
				.getIconWidth(), imageIconTitleTop.getIconHeight()));
		imageTitleTop.setSize(imageIconTitleTop.getIconWidth(),
				imageIconTitleTop.getIconHeight());
		jPanelTopImg.add(imageTitleTop, BorderLayout.CENTER);

		getContentPane().add(jPanelLeftImg, BorderLayout.WEST);
		jPanelLeftImg.setLayout(new BorderLayout(0, 0));
		jPanelLeftImg.setBackground(Color.WHITE);

		ImageIcon imageIconTitleLeft = new ImageIcon(
				CLocalGISAppFrame.class.getResource(IMAGE_SSO_TITLE_LEFT));
		imageTitleLeft = new JLabel(imageIconTitleLeft);

//		jPanelLeftImg.setSize(200, 325);
//		jPanelLeftImg.setPreferredSize(new Dimension(200, 325));
		jPanelLeftImg.setSize(275, 325);
		jPanelLeftImg.setPreferredSize(new Dimension(275, 325));
		imageTitleLeft.setPreferredSize(new Dimension(imageIconTitleLeft
				.getIconWidth(), imageIconTitleLeft.getIconHeight()));
		imageTitleLeft.setSize(imageIconTitleLeft.getIconWidth(),
				imageIconTitleLeft.getIconHeight());
		jPanelLeftImg.add(imageTitleLeft, BorderLayout.NORTH);

		getContentPane().add(jPanelContent, BorderLayout.CENTER);

		jPanelContent.setLayout(new BorderLayout(0, 0));

		jPanelContent.add(jPanelInfo, BorderLayout.NORTH);
		jPanelInfo.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		// jPanelInfo.setBorder(BorderFactory.createLoweredBevelBorder());
		jPanelInfo.setBackground(Color.WHITE);
		jButtonCloseSession = new javax.swing.JButton();
		jButtonCloseSession.setFont(new Font("Arial", Font.BOLD, 12));
		jButtonCloseSession.addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseMoved(MouseEvent e) {
				if(jButtonCloseSession.getComponentAt(e.getPoint())==null)
					jButtonCloseSession.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
				else
					jButtonCloseSession.setCursor(new Cursor(Cursor.HAND_CURSOR));
			}
		});
		jPanelInfo.add(jButtonCloseSession);

		
		jButtonCloseSession
				.addActionListener(new java.awt.event.ActionListener() {
					public void actionPerformed(java.awt.event.ActionEvent evt) {
						jButtonCloseSessionActionPerformed(evt);
					}
				});

		jPanelContent.add(jPanelAplications, BorderLayout.CENTER);
		jPanelAplications.setLayout(new BorderLayout(0, 0));
		jPanelTitleAplications = new JPanel();
		jPanelAplications.add(jPanelTitleAplications, BorderLayout.NORTH);
		jPanelTitleAplications.setLayout(new BorderLayout(0, 0));

		jLabelTitleAplications = new JLabel("");
		jLabelTitleAplications.setBackground(new Color(230, 230, 250));
		jLabelTitleAplications.setOpaque(true);
		
		jLabelTitleAplications.setFont(new Font("Arial", Font.BOLD, 12));
		jLabelTitleAplications.setPreferredSize(new Dimension(jLabelTitleAplications.getWidth(),20));
		// jLabelTitleAplicaciones.setHorizontalAlignment(SwingConstants.CENTER);
		jPanelTitleAplications.add(jLabelTitleAplications);
		jPanelTitleAplications.setBorder(BorderFactory
				.createLineBorder(Color.BLACK));

		jPanelTableAplications = new JPanel();
		jPanelAplications.add(jPanelTableAplications, BorderLayout.CENTER);

		jPanelTableAplications.setLayout(new BorderLayout(0, 0));
		jTableAplication = new javax.swing.JTable();
		jTableAplication.setBackground(Color.WHITE);

		jTableAplication.addMouseMotionListener(new MouseMotionAdapter() {
			public void mouseDragged(MouseEvent e) {
				jTableWeb.clearSelection();
			}

			@Override
			public void mouseMoved(MouseEvent e) {
				int row = jTableAplication.rowAtPoint(e.getPoint());
				if (row > -1) {
					jTableWeb.clearSelection();
					jTableAplication.clearSelection();
					jTableAplication.setRowSelectionInterval(row, row);
					jTableAplication.setSelectionBackground(new Color(102, 153, 204));				
				}
			}
		});
		jScrollPaneTableAplications = new javax.swing.JScrollPane();

		jPanelTableAplications.add(jScrollPaneTableAplications,
				BorderLayout.CENTER);
		

		jTableAplication.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				jTableWeb.clearSelection();
				if (e.getClickCount() == 2) {
					final String rutaApp = listaLocalGISApp.get(
							jTableAplication
									.getValueAt(
											jTableAplication.getSelectedRow(),
											0).toString()
									.replace(APP_TITLE_MARKER, ""))
							.getRutaApp();
					// Utils.openDesktopApp(rutaApp);

					final TaskMonitorDialog progressDialog = new TaskMonitorDialog(
							parent, null);
					progressDialog.setModal(true);
					// progressDialog.setTitle(literales.getString("CAuthDialog.title"));
					progressDialog.setTitle("Informaci�n");
					progressDialog.report("Cargando: "
							+ jTableAplication
									.getValueAt(jTableAplication.getSelectedRow(), 0)
									.toString().replace(APP_TITLE_MARKER, ""));

					progressDialog.addComponentListener(new ComponentAdapter() {
						public void componentShown(ComponentEvent e) {
							new Thread(new Runnable() {
								public void run() {
									try {
										Utils.openDesktopApp(rutaApp);
									} catch (Exception e) {
										logger.error(e);
									} finally {
										progressDialog.setVisible(false);
										parentInternal.setCursor(Cursor
												.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
										progressDialog.dispose();
									}
								}
							}).start();
						}
					});
					Utils.centreComponent(progressDialog, parentInternal);
					progressDialog.setVisible(true);

				}
			}			
			@Override
			public void mouseExited(MouseEvent e) {
				jTableAplication.clearSelection();
			}
		});

		jPanelContent.add(jPanelWeb, BorderLayout.SOUTH);
		jPanelWeb.setLayout(new BorderLayout());

		jPanelTitleWeb = new JPanel();
		jPanelWeb.add(jPanelTitleWeb, BorderLayout.NORTH);
		jPanelTitleWeb.setLayout(new BorderLayout(0, 0));

		jLabelTitleWeb = new JLabel("");
		jLabelTitleWeb.setBackground(new Color(230, 230, 250));
		jLabelTitleWeb.setOpaque(true);

		jLabelTitleWeb.setFont(new Font("Arial", Font.BOLD, 12));
		jLabelTitleWeb.setPreferredSize(new Dimension(jLabelTitleWeb.getWidth(),20));
		// jLabelTitleWeb.setHorizontalAlignment(SwingConstants.CENTER);
		jPanelTitleWeb.add(jLabelTitleWeb);
		jPanelTitleWeb.setBorder(BorderFactory.createLineBorder(Color.black));
		//jLabelTitleWeb.setBackground(new Color(102, 153, 204));
		//jLabelTitleWeb.setOpaque(true);
		
		jPanelTableWeb = new JPanel();
		jPanelWeb.add(jPanelTableWeb, BorderLayout.CENTER);

		jPanelTableWeb.setLayout(new BorderLayout(0, 0));
		jScrollPaneTableWeb = new javax.swing.JScrollPane();
		jPanelTableWeb.add(jScrollPaneTableWeb, BorderLayout.CENTER);
		jTableWeb = new javax.swing.JTable();
		jTableWeb.setBackground(Color.WHITE);

		jTableWeb.addMouseMotionListener(new MouseMotionAdapter() {
			public void mouseDragged(MouseEvent e) {
				jTableAplication.clearSelection();
			}
			@Override
			public void mouseMoved(MouseEvent e) {
				int row = jTableWeb.rowAtPoint(e.getPoint());
				if (row > -1) {
					jTableAplication.clearSelection();
					jTableWeb.clearSelection();
					jTableWeb.setRowSelectionInterval(row, row);
					jTableWeb.setSelectionBackground(new Color(102, 153, 204));				
				}
			}
		});

		jTableWeb.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				jTableAplication.clearSelection();
				if (e.getClickCount() == 2) {
					final String rutaApp = listaLocalGISApp.get(
							jTableWeb.getValueAt(jTableWeb.getSelectedRow(), 0)
									.toString().replace(APP_TITLE_MARKER, ""))
							.getRutaApp();
					// Utils.openWebApp(rutaApp, SecurityManager.getIdSesion());

					final TaskMonitorDialog progressDialog = new TaskMonitorDialog(
							parent, null);
					progressDialog.setModal(true);
					// progressDialog.setTitle(literales.getString("CAuthDialog.title"));
					progressDialog.setTitle("Informaci�n");
					progressDialog.report("Cargando: "
							+ jTableWeb
									.getValueAt(jTableWeb.getSelectedRow(), 0)
									.toString().replace(APP_TITLE_MARKER, ""));

					progressDialog.addComponentListener(new ComponentAdapter() {
						public void componentShown(ComponentEvent e) {
							new Thread(new Runnable() {
								public void run() {
									try {

										Utils.openWebApp(rutaApp,
												SecurityManager.getIdSesion());

									} catch (Exception e) {
										logger.error(e);
									} finally {
										progressDialog.setVisible(false);
										parentInternal.setCursor(Cursor
												.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
										progressDialog.dispose();
									}
								}
							}).start();
						}
					});
					Utils.centreComponent(progressDialog, parentInternal);
					progressDialog.setVisible(true);

				}
			}
			@Override
			public void mouseExited(MouseEvent e) {
				jTableWeb.clearSelection();
			}
		});

		getContentPane().add(jPanelRightLine, BorderLayout.EAST);
		jPanelRightLine.setSize(8,300);
		jPanelRightLine.setPreferredSize(new Dimension(8,300));
		jPanelRightLine.setBackground(Color.WHITE);
		
		getContentPane().add(jPanelBottomLine, BorderLayout.SOUTH);
		jPanelBottomLine.setSize(900,5);
		jPanelBottomLine.setPreferredSize(new Dimension(900,5));
		jPanelBottomLine.setBackground(Color.WHITE);
		
		jScrollPaneTableAplications.setViewportView(jTableAplication);
		jScrollPaneTableWeb.setViewportView(jTableWeb);

		I18N.plugInsResourceBundle.put("centralizadorsso", messages);
		changeScreenLang(messages);

		pack();

		this.setBorder(new LineBorder(Color.BLACK, 0));
		((javax.swing.plaf.basic.BasicInternalFrameUI) this.getUI())
				.setNorthPane(null);

	}

	private void jButtonCloseSessionActionPerformed(
			java.awt.event.ActionEvent evt) {
		try {
			SecurityManager.logout();
			SSOAuthManager.clearRegistrySesion();
			setClosed(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private Hashtable<String,LocalGISApp> peticionBD(){
		Hashtable<String,LocalGISApp> listaLocalGISApps = new Hashtable<String,LocalGISApp>();
		String serverHost = AppContext.getApplicationContext().getString(AppContext.URL_TOMCAT);   
	   	//RECUPERAR BD Y CON rs.next ir haciendo el put
		//Aplicaciones Escritorio
		listaLocalGISApps.put(I18N.get("centralizadorsso","CMainCentralizadorSSO.localGISApps.editor"), new LocalGISApp("Administracion", "Geopista.Administracion.Login", LocalGISApp.TipoApp.DESKTOP,serverHost + "/software/localgis.jnlp"));
		listaLocalGISApps.put(I18N.get("centralizadorsso","CMainCentralizadorSSO.localGISApps.informacionReferencia"), new LocalGISApp("Administracion", "Geopista.Administracion.Login", LocalGISApp.TipoApp.DESKTOP,serverHost + "/software/localgis_informacion_de_referencia.jnlp"));
		listaLocalGISApps.put(I18N.get("centralizadorsso","CMainCentralizadorSSO.localGISApps.planeamiento"), new LocalGISApp("Administracion", "Geopista.Administracion.Login", LocalGISApp.TipoApp.DESKTOP,serverHost + "/software/localgis_planeamiento.jnlp"));
		listaLocalGISApps.put(I18N.get("centralizadorsso","CMainCentralizadorSSO.localGISApps.infraestructuras"), new LocalGISApp("Administracion", "Geopista.Administracion.Login", LocalGISApp.TipoApp.DESKTOP,serverHost + "/software/localgis_infraestructuras.jnlp"));       
		listaLocalGISApps.put(I18N.get("centralizadorsso","CMainCentralizadorSSO.localGISApps.administracionUsuarios"), new LocalGISApp("Administracion", "Geopista.Administracion.Login", LocalGISApp.TipoApp.DESKTOP,serverHost + "/software/localgis_administrador.jnlp"));
		listaLocalGISApps.put(I18N.get("centralizadorsso","CMainCentralizadorSSO.localGISApps.gestorMedioambiental"), new LocalGISApp("Administracion","Geopista.Contaminantes.Login",LocalGISApp.TipoApp.DESKTOP,serverHost + "/software/localgis_contaminantes.jnlp"));
		listaLocalGISApps.put(I18N.get("centralizadorsso","CMainCentralizadorSSO.localGISApps.licenciasObra"), new LocalGISApp("Licencias de Obra","Geopista.Licencias.Login",LocalGISApp.TipoApp.DESKTOP,serverHost + "/software/localgis_licencias.jnlp"));
		listaLocalGISApps.put(I18N.get("centralizadorsso","CMainCentralizadorSSO.localGISApps.licenciasActividad"), new LocalGISApp("Licencias de Obra","Geopista.Licencias.Login",LocalGISApp.TipoApp.DESKTOP,serverHost + "/software/localgis_licencias_actividad.jnlp"));       
		listaLocalGISApps.put(I18N.get("centralizadorsso","CMainCentralizadorSSO.localGISApps.metadatos"), new LocalGISApp("Metadatos","Geopista.Metadatos.Login",LocalGISApp.TipoApp.DESKTOP,serverHost + "/software/localgis_metadatos.jnlp"));       
		listaLocalGISApps.put(I18N.get("centralizadorsso","CMainCentralizadorSSO.localGISApps.ocupaciones"), new LocalGISApp("Ocupaciones","Geopista.Ocupaciones.Login",LocalGISApp.TipoApp.DESKTOP,serverHost + "/software/localgis_ocupaciones.jnlp"));       
		listaLocalGISApps.put(I18N.get("centralizadorsso","CMainCentralizadorSSO.localGISApps.catastro"), new LocalGISApp("Catastro","Catastro.RegistroExpediente.Login",LocalGISApp.TipoApp.DESKTOP,serverHost + "/software/localgis_catastro.jnlp"));
		listaLocalGISApps.put(I18N.get("centralizadorsso","CMainCentralizadorSSO.localGISApps.gestorCapas"), new LocalGISApp("Administracion", "Geopista.Administracion.Login", LocalGISApp.TipoApp.DESKTOP,serverHost + "/software/localgis_gestor_capas.jnlp"));
		listaLocalGISApps.put(I18N.get("centralizadorsso","CMainCentralizadorSSO.localGISApps.alp"), new LocalGISApp("ALP", "LocalGis.ALP.Login", LocalGISApp.TipoApp.DESKTOP,serverHost + "/software/localgis_alp.jnlp"));
		listaLocalGISApps.put(I18N.get("centralizadorsso","CMainCentralizadorSSO.localGISApps.backup"), new LocalGISApp("Administracion", "Geopista.Administracion.Login", LocalGISApp.TipoApp.DESKTOP,serverHost + "/software/localgis_backup.jnlp"));
		listaLocalGISApps.put(I18N.get("centralizadorsso","CMainCentralizadorSSO.localGISApps.generadorInformes"), new LocalGISApp("Administracion", "Geopista.Administracion.Login", LocalGISApp.TipoApp.DESKTOP,serverHost + "/software/localgis_informes.jnlp"));
		listaLocalGISApps.put(I18N.get("centralizadorsso","CMainCentralizadorSSO.localGISApps.inventarioPatrimonio"), new LocalGISApp("Inventario","Geopista.Inventario.Login",LocalGISApp.TipoApp.DESKTOP,serverHost + "/software/localgis_inventario.jnlp"));
		listaLocalGISApps.put(I18N.get("centralizadorsso","CMainCentralizadorSSO.localGISApps.espacioPublico"), new LocalGISApp("Gestion de Espacio Publico", "localgis.espaciopublico.login", LocalGISApp.TipoApp.DESKTOP,serverHost + "/software/localgis_espaciopublico.jnlp"));
		listaLocalGISApps.put(I18N.get("centralizadorsso","CMainCentralizadorSSO.localGISApps.eiel"), new LocalGISApp("EIEL", "LocalGis.EIEL.Login", LocalGISApp.TipoApp.DESKTOP,serverHost + "/software/localgis_eiel.jnlp"));
        
        
        //Aplicaciones Web
		listaLocalGISApps.put(I18N.get("centralizadorsso","CMainCentralizadorSSO.localGISApps.wmsManager"), new LocalGISApp("Visualizador","Geopista.Visualizador.Login",LocalGISApp.TipoApp.WEB,serverHost + "/localgis-wmsmanager/admin/index.jsp"));
		listaLocalGISApps.put(I18N.get("centralizadorsso","CMainCentralizadorSSO.localGISApps.guiaUrbanaPrivada"), new LocalGISApp("Visualizador","Geopista.Visualizador.Login",LocalGISApp.TipoApp.WEB,serverHost + "/localgis-guiaurbana/private/"));

		
		return listaLocalGISApps;
	}
	
	private void actualizarModelo() {
		//Peticion de apps a la bd o fichero
		listaLocalGISApp = peticionBD();
		//listaLocalGISApp = new ListaLocalGISApps(this.messages);
		modelLocalGISApp = new LocalGISAppTableModel();
		modelLocalGISApp.setModelData(listaLocalGISApp,
				LocalGISApp.TipoApp.DESKTOP);
		
		sorter = new TableSorted(modelLocalGISApp);
		sorter.setTableHeader(jTableAplication.getTableHeader());
		sorter.setSortingStatus(0, TableSorted.ASCENDING);
		jTableAplication.setTableHeader(null);
		jTableAplication.setCursor(new Cursor(Cursor.HAND_CURSOR));
		// jTableAplication.setRowHeight(50);
		jTableAplication.setRowHeight(30);
		//jPanelTableAplications.setBackground(Color.WHITE);

		// jTableAplication.setBackground(Color.getHSBColor(60, 20, 33));
		// jTableAplication.setSelectionBackground(Color.ORANGE);
		// jTableAplication.setSelectionBackground(Color.WHITE);
		// jTableAplication.setSelectionForeground(Color.BLACK);

		jTableAplication.setFont(new Font("Arial Bold", 0, 12));
		// jTableAplication.setModel(modelLocalGISApp);
		jTableAplication.setModel(sorter);
		jTableAplication.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		jTableAplication.setBorder(BorderFactory.createLineBorder(Color.GRAY));
		
		jScrollPaneTableAplications.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED);
		jScrollPaneTableAplications.getViewport().setOpaque(true);
		jScrollPaneTableAplications.getViewport().setBackground(Color.WHITE);
		jScrollPaneTableAplications.setBorder(BorderFactory.createEmptyBorder());
		
		modelLocalGISWeb = new LocalGISAppTableModel();
		modelLocalGISWeb
				.setModelData(listaLocalGISApp, LocalGISApp.TipoApp.WEB);
	
		sorter = new TableSorted(modelLocalGISWeb);
		sorter.setTableHeader(jTableAplication.getTableHeader());
		sorter.setSortingStatus(0, TableSorted.ASCENDING);
		
		jTableWeb.setTableHeader(null);
		jTableWeb.setCursor(new Cursor(Cursor.HAND_CURSOR));
		// jTableWeb.setRowHeight(50);
		jTableWeb.setRowHeight(30);
		
//		jPanelWeb.setBackground(Color.WHITE);
//		jPanelWeb.setOpaque(true);
//		jPanelWeb.setBackground(Color.WHITE);
//		jPanelTableWeb.setOpaque(true);		
//		jPanelTableWeb.setBackground(Color.WHITE);
//		jTableWeb.setOpaque(true);		
//		jTableWeb.setBackground(Color.WHITE);
//		jScrollPaneTableWeb.setOpaque(true);		
//		jScrollPaneTableWeb.setBackground(Color.WHITE);
//		
		
		// jTableWeb.setBackground(Color.getHSBColor(60, 20, 33));
		// jTableWeb.setSelectionBackground(Color.getHSBColor(100, 100, 65));
		// jTableWeb.setSelectionBackground(Color.WHITE);
		// jTableWeb.setSelectionForeground(Color.BLACK);

		jTableWeb.setFont(new Font("Arial Bold", 0, 12));
		// jTableWeb.setModel(modelLocalGISWeb);
		jTableWeb.setModel(sorter);
		jTableWeb.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);		
		jTableWeb.setBorder(BorderFactory.createLineBorder(Color.GRAY));
//		jPanelTableWeb.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		jPanelTableWeb.setPreferredSize(new Dimension(
				jPanelTableWeb.getWidth(), (jTableWeb.getRowCount()*30)+5));
		jPanelTableWeb.setMaximumSize(new Dimension(
				jPanelTableWeb.getWidth(), (4*30)+5));
//		jPanelTableWeb.setPreferredSize(new Dimension(
//				jPanelTableWeb.getWidth(), 100));
		jScrollPaneTableWeb.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED);
		jScrollPaneTableWeb.getViewport().setOpaque(true);
		jScrollPaneTableWeb.getViewport().setBackground(Color.WHITE);
		jScrollPaneTableWeb.setBorder(BorderFactory.createEmptyBorder());

		
	}

	public void changeScreenLang(ResourceBundle messages) {
		this.messages = messages;
		
		actualizarModelo();
		
		jButtonCloseSession.setText(messages.getString("cerrarSesion"));
		jButtonCloseSession.setToolTipText(messages.getString("cerrarSesion"));
		jLabelTitleAplications.setText("          "
				+ messages.getString("aplicacionesEscritorio"));
		jLabelTitleWeb.setText("          "
				+ messages.getString("aplicacionesWeb"));
	}

	// Variables declaration - do not modify//GEN-BEGIN:variables
	private javax.swing.JPanel jPanelTopImg;
	private javax.swing.JPanel jPanelLeftImg;
	private javax.swing.JPanel jPanelContent;
	private javax.swing.JPanel jPanelRightLine;
	private javax.swing.JPanel jPanelBottomLine;	
	private javax.swing.JPanel jPanelInfo;
	private javax.swing.JPanel jPanelAplications;
	private javax.swing.JButton jButtonCloseSession;
	private javax.swing.JScrollPane jScrollPaneTableAplications;
	private javax.swing.JTable jTableAplication;
	private JScrollPane jScrollPaneTableWeb;
	private JTable jTableWeb;
	private JPanel jPanelWeb;
	private JPanel jPanelTitleAplications;
	private JLabel jLabelTitleAplications;
	private JPanel jPanelTitleWeb;
	private JLabel jLabelTitleWeb;
	private JPanel jPanelTableAplications;
	private JPanel jPanelTableWeb;
	private JLabel imageTitleTop;
	private JLabel imageTitleLeft;

}
