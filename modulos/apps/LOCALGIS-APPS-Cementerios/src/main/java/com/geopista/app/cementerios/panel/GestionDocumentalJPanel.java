/**
 * GestionDocumentalJPanel.java
 * � MINETUR, Government of Spain
 * This program is part of LocalGIS
 * This program is free software: you can redistribute it and/or modify it under the terms of the GNU General Public License as published by the Free Software Foundation, either version 2 of the License, or (at your option) any later version.
 * This program is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU General Public License for more details.
 * You should have received a copy of the GNU General Public License along with this program. If not, see <http://www.gnu.org/licenses/>.
 */
package com.geopista.app.cementerios.panel;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.File;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Vector;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import org.apache.log4j.Logger;

import com.geopista.app.AppContext;
import com.geopista.app.UserPreferenceConstants;
import com.geopista.app.document.DocumentInterface;
import com.geopista.app.document.DocumentPanel;
import com.geopista.app.document.JDialogBD;
import com.geopista.app.document.JDialogLocal;
import com.geopista.app.document.JFrameOpciones;
import com.geopista.app.document.JPanelComentarios;
import com.geopista.client.alfresco.AlfrescoConstants;
import com.geopista.client.alfresco.ui.AlfrescoExplorer;
import com.geopista.client.alfresco.utils.implementations.LocalgisIntegrationManagerImpl;
import com.geopista.client.alfresco.utils.interfaces.LocalgisIntegrationManager;
import com.geopista.global.ServletConstants;
import com.geopista.global.WebAppConstants;
import com.geopista.protocol.cementerios.ElemCementerioBean;
import com.geopista.protocol.document.CementerioDocumentClient;
import com.geopista.protocol.document.DocumentBean;
import com.geopista.protocol.document.IDocumentClient;
import com.geopista.protocol.document.Thumbnail;
import com.geopista.util.config.UserPreferenceStore;
import com.geopista.utils.alfresco.manager.utils.AlfrescoManagerUtils;
import com.vividsolutions.jump.util.StringUtil;
import com.vividsolutions.jump.workbench.ui.ErrorDialog;
import com.vividsolutions.jump.workbench.ui.GUIUtil;
import com.vividsolutions.jump.workbench.ui.task.TaskMonitorDialog;


public class GestionDocumentalJPanel extends JPanel  implements DocumentInterface{
    Logger logger= Logger.getLogger(GestionDocumentalJPanel.class);

     private AppContext aplicacion;

    private DocumentPanel documentosJPanel;


	private JPanelComentarios comentariosJPanel;

    private CementerioDocumentClient documentClient= null;

    /* Necesario para mostrar la pantalla del reloj*/
    private DocumentBean auxDocument= new DocumentBean();
    private DocumentBean document;
    
	/* Alfresco */
	private LocalgisIntegrationManager localgisIntegrationManager;

    /* Botones jPanelButtons */
    private JButton annadirJButton= new JButton();
    private JButton modificarJButton = new JButton();
    private JButton borrarJButton= new JButton();
    private JButton guardarJButton= new JButton();
    private JButton visualizarJButton= new JButton();
	private JButton bAlfrescoManager = new JButton();
	
    /** Si la llamada no se hace desde GestionDocumentalJDialog, no se actualiza una por una en BD cada una de las operaciones sobre la documentacion. */
    private boolean fromDialog= false;

	private ElemCementerioBean elemCementerioBean = null;
    
    private Hashtable filesInUp= new Hashtable();
    
    private ArrayList actionListeners= new ArrayList();

    private long id= -1;
    
    private String superPatron;
    private String patron;

    public GestionDocumentalJPanel(boolean fromDialog) throws Exception{
        this.fromDialog= fromDialog;
        inicializar(null);
    }
     /**
      * M�todo que genera el dialogo que muestra los datos de un bien mueble
      */
     public GestionDocumentalJPanel(final Object obj, boolean fromDialog) throws Exception{
         this.fromDialog= fromDialog;
         inicializar(obj);

     }

    public void inicializar(final Object obj) throws Exception{
        this.aplicacion = (AppContext) AppContext.getApplicationContext();
        setLayout(new BorderLayout());

        documentClient= new CementerioDocumentClient(aplicacion.getString(UserPreferenceConstants.LOCALGIS_SERVER_URL) + WebAppConstants.CEMENTERIOS_WEBAPP_NAME + ServletConstants.ADMINISTRADOR_CARTOGRAFIA_SERVLET_NAME +
                ServletConstants.CEMENTERIO_DOCUMENT_SERVLET_NAME);

       boolean activo=LocalgisIntegrationManagerImpl.verifyStatusAlfresco(UserPreferenceStore.getUserPreference(UserPreferenceConstants.LOCALGIS_SERVER_URL, "",false),
				String.valueOf(aplicacion.getIdMunicipio()),AlfrescoConstants.APP_CEMENTERY);
        AlfrescoManagerUtils.setAlfrescoActive(activo);
        
        if (AlfrescoManagerUtils.isAlfrescoClientActive()){
			localgisIntegrationManager = new LocalgisIntegrationManagerImpl(
					UserPreferenceStore.getUserPreference(UserPreferenceConstants.LOCALGIS_SERVER_URL, "",false),
					String.valueOf(aplicacion.getIdMunicipio()),AlfrescoConstants.APP_CEMENTERY);
		}
        
        JPanel botoneraJPanel= new JPanel();
        botoneraJPanel.setLayout(new java.awt.FlowLayout());
        annadirJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                annadirDocumento();
            }
        });
        botoneraJPanel.add(annadirJButton);

        modificarJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modificarDocumento();
            }
        });
        botoneraJPanel.add(modificarJButton);

        borrarJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarDocumento();
            }
        });
        botoneraJPanel.add(borrarJButton);

        guardarJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guardarDocumento();
            }
        });
        botoneraJPanel.add(guardarJButton);

        visualizarJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                visualizarDocumento();
            }
        });
        botoneraJPanel.add(visualizarJButton);

        if (AlfrescoManagerUtils.isAlfrescoClientActive()) {
			// bAlfrescoManager.setText(aplicacion.getI18nString("document.infodocument.botones.visualizar"));
			bAlfrescoManager.setText(AppContext.getApplicationContext().getI18nString("alfresco.button.documentManager"));
			bAlfrescoManager.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					docManager();
				}
			});
			botoneraJPanel.add(bAlfrescoManager);
		}
        
        if (obj != null){
            id= ((ElemCementerioBean)obj).getId();
            superPatron = ((ElemCementerioBean)obj).getSuperPatron();
            patron = ((ElemCementerioBean)obj).getPatron();
            elemCementerioBean = ((ElemCementerioBean)obj);
            Collection c= documentClient.getAttachedDocuments(id, superPatron, patron);
            documentosJPanel= new DocumentPanel(null, c, this);           
        }else{
           documentosJPanel= new DocumentPanel(null, new HashMap().values(), this);
        }

        comentariosJPanel= new JPanelComentarios(true);
        comentariosJPanel.setEnabled(false);
        add(documentosJPanel, BorderLayout.NORTH);
        add(comentariosJPanel, BorderLayout.CENTER);
        add(botoneraJPanel, BorderLayout.SOUTH);
        documentosJPanel.addMouseListener(new ActionJList());
        renombrarComponentes();

    }

    /*
	 * m�todo que realiza las llamadas correspondientes para a�adir nuevos
	 * documentos
	 */
	private void annadirDocumento() {
		if (!AlfrescoManagerUtils.isAlfrescoClientActive()) {
			JFrameOpciones frameOpciones = new JFrameOpciones(
					aplicacion.getMainFrame());
			frameOpciones.setVisible(true);
			if (!frameOpciones.isAceptar())
				return;
			if (frameOpciones.isLocal())
				anadirlocal();
			else
				anadirBD();
		} else
			anadirlocal();
	}

    /* a�adimos un documento en local */
    private void anadirlocal(){
        JDialogLocal jDialogLocal= new JDialogLocal(aplicacion.getMainFrame(), DocumentBean.ALL_CODE, true);
        jDialogLocal.setVisible(true);
        if(!jDialogLocal.okCancelPanel.wasOKPressed()) return;
        auxDocument= new DocumentBean();
        auxDocument = jDialogLocal.save(auxDocument);
        if(auxDocument.getFileName() == null) return;
        
         /* ponemos una pantalla con el reloj */
        final TaskMonitorDialog progressDialog = new TaskMonitorDialog(aplicacion.getMainFrame(), null);
        if (fromDialog){
            progressDialog.setTitle(aplicacion.getI18nString("document.infodocument.salvando.title"));
            progressDialog.report(aplicacion.getI18nString("document.infodocument.salvando"));
        }else{
            progressDialog.setTitle(aplicacion.getI18nString("cementerio.gestionDocumental.tag1"));
            progressDialog.report(aplicacion.getI18nString("cementerio.gestionDocumental.tag2"));
        }
        progressDialog.addComponentListener(new ComponentAdapter(){
            public void componentShown(ComponentEvent e){
                new Thread(new Runnable(){
                    public void run(){
                        /* a�adimos el documento a la lista */
                        try{
                        	if (!AlfrescoManagerUtils.isAlfrescoClientActive()){
	                            if (fromDialog){
	                            	if (auxDocument.getFileName()!=null){
	                            		File file= new File(auxDocument.getFileName());
	                            		auxDocument.setTypeByExtension();
	                            		if (auxDocument.isImagen())
	                                        auxDocument.setThumbnail(Thumbnail.createThumbnail(file.getAbsolutePath(), 20, 20));
	                            	}
	                                auxDocument= documentClient.attachDocument(id,superPatron, patron, auxDocument);
	                                
	                            }else{
	                                File file= new File(auxDocument.getFileName());
	                                auxDocument.setFileName(file.getAbsolutePath());
	                                auxDocument.setSize(file.length());
	                                auxDocument= documentClient.updateTipo(auxDocument);
	                                auxDocument.setTypeByExtension();
	                                if (auxDocument.isImagen())
	                                    auxDocument.setThumbnail(Thumbnail.createThumbnail(file.getAbsolutePath(), 20, 20));
	
	                                filesInUp.put(""+filesInUp.size(), file);
	                            }
	                            documentosJPanel.add(auxDocument);
                        	}
							else { 
	                        	if (localgisIntegrationManager
										.associateAlfrescoCementerioDocument(
												String.valueOf(aplicacion
														.getIdMunicipio()),
												AlfrescoConstants.APP_CEMENTERY,
												auxDocument,
												documentClient, elemCementerioBean)) {
									documentosJPanel.add(auxDocument);
									// CAMBIAR
									JOptionPane.showMessageDialog(
											aplicacion.getMainFrame(),
											"Documento a�adido correctamente");
								} else
									JOptionPane.showMessageDialog(
											aplicacion.getMainFrame(),
											"Error al a�adir el documento");
							}							
                        }
                        catch(Exception e){
                            logger.error("Error al a�adir el documento ", e);
                            ErrorDialog.show(aplicacion.getMainFrame(), aplicacion.getI18nString("SQLError.Titulo"), aplicacion.getI18nString("SQLError.Aviso"), StringUtil.stackTrace(e));
                            return;
                        }
                        finally{
                            progressDialog.setVisible(false);
                        }
                    }
              }).start();
          }
       });
       GUIUtil.centreOnWindow(progressDialog);
       progressDialog.setVisible(true);
    }

    /* a�adimos un documento en BD */
    private void anadirBD(){
        final JDialogBD jDialogBD = new JDialogBD(aplicacion.getMainFrame(), DocumentBean.ALL_CODE);
        jDialogBD.show();
        if(!jDialogBD.okCancelPanel.wasOKPressed()) return;
        auxDocument= jDialogBD.get();
        if(auxDocument.getFileName() == null) return;
        /* ponemos una pantalla con el reloj */
        final TaskMonitorDialog progressDialog = new TaskMonitorDialog(aplicacion.getMainFrame(), null);
        if (fromDialog){
            progressDialog.setTitle(aplicacion.getI18nString("document.infodocument.salvando.title"));
            progressDialog.report(aplicacion.getI18nString("document.infodocument.salvando"));
        }else{
            progressDialog.setTitle(aplicacion.getI18nString("cementerio.gestionDocumental.tag1"));
            progressDialog.report(aplicacion.getI18nString("cementerio.gestionDocumental.tag2"));
        }

        progressDialog.addComponentListener(new ComponentAdapter(){
            public void componentShown(ComponentEvent e){
                new Thread(new Runnable(){
                    public void run(){
                        try{
                            if (!documentosJPanel.existDocument(auxDocument)){
                                    if (fromDialog){
                                        /* enlazamos el documento de BD al bien */
                                        documentClient.linkCementerioDocument(id, superPatron, patron, auxDocument);
                                    }else{
                                        filesInUp.put(""+filesInUp.size(), new File(auxDocument.getFileName()));
                                    }
                                    documentosJPanel.add(auxDocument);
                            }

                        }
                        catch(Exception e){
                            logger.error("Error al asociar el documento al eleme de cementerio ", e);
                            ErrorDialog.show(aplicacion.getMainFrame(), aplicacion.getI18nString("SQLError.Titulo"), aplicacion.getI18nString("SQLError.Aviso"), StringUtil.stackTrace(e));
                            return;
                        }
                        finally{
                            progressDialog.setVisible(false);
                        }
                    }
                }).start();
            }
        });
        GUIUtil.centreOnWindow(progressDialog);
        progressDialog.setVisible(true);
    }


    /* modificamos un documento ya existente */
    private void modificarDocumento(){
        final JDialogLocal jDialogLocal= new JDialogLocal(aplicacion.getMainFrame(), DocumentBean.DOC_CODE, true);
        if (documentosJPanel.getdocumentSelected()==null) return;
        document= (DocumentBean)documentosJPanel.getdocumentSelected().clone();
        jDialogLocal.load(document);
        jDialogLocal.show();
        if(!jDialogLocal.okCancelPanel.wasOKPressed()) return;
        document= jDialogLocal.save(document);
        document.setContent(null);
        /* ponemos una pantalla con el reloj */
        final TaskMonitorDialog progressDialog = new TaskMonitorDialog(aplicacion.getMainFrame(), null);
        if (fromDialog){
            progressDialog.setTitle(aplicacion.getI18nString("imagen.infoimage.salvando.title"));
            progressDialog.report(aplicacion.getI18nString("image.infoimage.salvando"));
        }else{
            progressDialog.setTitle(aplicacion.getI18nString("cementerio.gestionDocumental.tag1"));
            progressDialog.report(aplicacion.getI18nString("cementerio.gestionDocumental.tag2"));
        }
        progressDialog.addComponentListener(new ComponentAdapter(){
            public void componentShown(ComponentEvent e){
                new Thread(new Runnable(){
                    public void run(){
                        try{
                        	if (!AlfrescoManagerUtils.isAlfrescoClientActive()) {
								if (fromDialog) {
									document = documentClient.updateTipo(document);
									document.setTypeByExtension();
									if (document.isImagen())
										document = documentClient
												.updateDocument(document);
									else {									
										if (jDialogLocal.isNewDocument()) {
											File file = new File(document
													.getFileName());
											document.setFileName(file.getName());
											documentClient.updateDocument(
													document, file);
										} else {
											documentClient
													.updateDocumentByteStream(document);
										}
									
									}
								}					
								else {
									File file = new File(document.getFileName());
									if (file.isAbsolute()) {
										document.setSize(file.length());
										document = documentClient
													.updateTipo(document);
										document.setTypeByExtension();
										if (document.isImagen())
											document.setThumbnail(com.geopista.protocol.document.Thumbnail
														.createThumbnail(
																file.getAbsolutePath(),
																20, 20));
									}
									int index = documentosJPanel.getSelectedIndex();
									if (index != -1)
										filesInUp.put("" + index, file);
									}
									documentosJPanel.update(document);
									documentosJPanel.seleccionar(document);
							} 
							else {
								// CAMBIAR: Mirar si ya existe el
								// documento (del tipo ) o no y crear
								// nueva version
								if (localgisIntegrationManager
										.associateAlfrescoCementerioDocument(
												String.valueOf(aplicacion
														.getIdMunicipio()),
												AlfrescoConstants.APP_CEMENTERY,
												documentosJPanel.getdocumentSelected().getFileName(),
												document,
												(IDocumentClient) documentClient)){
									documentosJPanel.update(document);
									documentosJPanel.seleccionar(document);
									// CAMBIAR
									JOptionPane.showMessageDialog(
											aplicacion.getMainFrame(),
											"Documento modificado correctamente");
								}
								else
									JOptionPane.showMessageDialog(
											aplicacion.getMainFrame(),
											"Error al modificar el documento");
							}
                        }catch(Exception e){
                            logger.error("Error al modificar el documento ", e);
                            ErrorDialog.show(aplicacion.getMainFrame(), aplicacion.getI18nString("SQLError.Titulo"), aplicacion.getI18nString("SQLError.Aviso"), StringUtil.stackTrace(e));
                            return;
                        }finally{
                            progressDialog.setVisible(false);
                        }
                    }
                }).start();
            }
        });
        GUIUtil.centreOnWindow(progressDialog);
        progressDialog.setVisible(true);
    }



    /* m�todo xa eliminar el documento seleccionado de la lista */
    private void eliminarDocumento(){
        if(documentosJPanel.getdocumentSelected() == null) return;
        int n = JOptionPane.showOptionDialog(aplicacion.getMainFrame(),
                aplicacion.getI18nString("document.infodocument.respuesta.mensaje"),
                "",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE,
                null, null, null);
        if(n == JOptionPane.NO_OPTION) return;
        /* ponemos una pantalla con el reloj */
        final TaskMonitorDialog progressDialog = new TaskMonitorDialog(aplicacion.getMainFrame(), null);
        if (fromDialog){
            progressDialog.setTitle(aplicacion.getI18nString("imagen.infoimage.salvando.title"));
            progressDialog.report(aplicacion.getI18nString("image.infoimage.salvando"));
        }else{
            progressDialog.setTitle(aplicacion.getI18nString("cementerio.gestionDocumental.tag1"));
            progressDialog.report(aplicacion.getI18nString("cementerio.gestionDocumental.tag2"));
        }
            
        progressDialog.addComponentListener(new ComponentAdapter(){
            public void componentShown(ComponentEvent e){
                new Thread(new Runnable(){
                    public void run(){
                        try{
                            DocumentBean document= (DocumentBean)documentosJPanel.getdocumentSelected();
                            if (fromDialog){
                                documentClient.detachDocument(id, superPatron, patron, document);
                            }else{
                                int index= documentosJPanel.getSelectedIndex();
                                if (index != -1){
                                    filesInUp.remove(""+index);
                                    actualizarFilesInUp(index);
                                }
                            }
                            /* borrar el elemento de la lista */
                            documentosJPanel.borrar();
                            comentariosJPanel.load(null);
                        }catch(Exception e){
                            logger.error("Error al eliminar un documento ", e);
                            ErrorDialog.show(aplicacion.getMainFrame(), aplicacion.getI18nString("SQLError.Titulo"), aplicacion.getI18nString("SQLError.Aviso"), StringUtil.stackTrace(e));
                        }finally{
                            progressDialog.setVisible(false);
                        }
                    }
                }).start();
            }
        });
        GUIUtil.centreOnWindow(progressDialog);
        progressDialog.setVisible(true);
    }
    /**
     * M�todo para visualizar en un editor el documento seleccionado de una lista.
     */
    private void guardarDocumento(){
        if(documentosJPanel.getdocumentSelected() == null) return;
        /* ponemos una pantalla con el reloj */
        final TaskMonitorDialog progressDialog = new TaskMonitorDialog(aplicacion.getMainFrame(), null);
        progressDialog.setTitle(aplicacion.getI18nString("document.infodocument.abrir"));
        progressDialog.report(aplicacion.getI18nString("document.infodocument.abrir"));
        progressDialog.addComponentListener(new ComponentAdapter(){
            public void componentShown(ComponentEvent e){
                new Thread(new Runnable(){
                    public void run(){
                        try{
                            auxDocument= documentosJPanel.getdocumentSelected();
                    
							if (!AlfrescoManagerUtils.isAlfrescoClientActive()){
								if (auxDocument != null
										&& !(new File(auxDocument.getFileName())
												.isAbsolute()))
									auxDocument.setContent(documentClient
											.getAttachedByteStream(auxDocument));
							}
//                            if (auxDocument!=null && !(new File(auxDocument.getFileName()).isAbsolute()))
//                                auxDocument.setContent(documentClient.getAttachedByteStream(auxDocument));
                        }
                        catch(Exception e){
                            logger.error("Error al mostrar la pantalla de reloj ", e);
                            ErrorDialog.show(aplicacion.getMainFrame(), aplicacion.getI18nString("SQLError.Titulo"), aplicacion.getI18nString("SQLError.Aviso"), StringUtil.stackTrace(e));
                        }finally{
                            progressDialog.setVisible(false);
                        }
                    }
                  }).start();
            }
        });
        try{
            GUIUtil.centreOnWindow(progressDialog);
            progressDialog.setVisible(true);
            String selectedFile= "";
            if (new File(auxDocument.getFileName()).isAbsolute()) selectedFile= new File(auxDocument.getFileName()).getAbsolutePath();
            else{
                selectedFile= seleccionaFichero(auxDocument.getFileName());
                if (selectedFile == null) return;
                
                if (!AlfrescoManagerUtils.isAlfrescoClientActive()) {
					RandomAccessFile outFile = new RandomAccessFile(
							selectedFile, "rw");

					outFile.write(auxDocument.getContent());
					outFile.close();
				} else {
					if (localgisIntegrationManager.downloadAssociateDocument(
							auxDocument.getId(), selectedFile))
						// CAMBIAR
						JOptionPane.showMessageDialog(
								aplicacion.getMainFrame(),
								"Documento descargado correctamente");
					else
						JOptionPane.showMessageDialog(
								aplicacion.getMainFrame(),
								"Error al descargar el documento");

				}
               
            }

            /* visualizamos si el SO es Windows */
            if(com.geopista.app.licencias.CUtilidadesComponentes_LCGIII.isWindows()){
               try{
                     Runtime.getRuntime().exec("rundll32 SHELL32.DLL,ShellExec_RunDLL \"" +  selectedFile+ "\"");
                }
                catch(Exception ex){
                        logger.error("Error al abrir el documento : ", ex);
                }
            }
        }
        catch(Exception e){
             logger.error("Error al visualizar un documento ", e);
             ErrorDialog.show(aplicacion.getMainFrame(), aplicacion.getI18nString("SQLError.Titulo"), aplicacion.getI18nString("SQLError.Aviso"), StringUtil.stackTrace(e));
        }
    }
    /**
     * M�todo para visualizar en un editor el documento seleccionado de una lista.
     */
    private void visualizarDocumento(){
        if(documentosJPanel.getdocumentSelected() == null) return;
        /* ponemos una pantalla con el reloj */
        final TaskMonitorDialog progressDialog = new TaskMonitorDialog(aplicacion.getMainFrame(), null);
        progressDialog.setTitle(aplicacion.getI18nString("document.infodocument.abrir"));
        progressDialog.report(aplicacion.getI18nString("document.infodocument.abrir"));
        progressDialog.addComponentListener(new ComponentAdapter(){
            public void componentShown(ComponentEvent e){
                new Thread(new Runnable(){
                    public void run(){
                        try{
                            auxDocument= documentosJPanel.getdocumentSelected();
                            
                            if (!AlfrescoManagerUtils.isAlfrescoClientActive()){ 
								if (auxDocument != null
										&& !(new File(auxDocument.getFileName())
												.isAbsolute()))
									auxDocument.setContent(documentClient
											.getAttachedByteStream(auxDocument));
							}
                            
//                            if (auxDocument!=null && !(new File(auxDocument.getFileName()).isAbsolute()))
//                                auxDocument.setContent(documentClient.getAttachedByteStream(auxDocument));
                        }
                        catch(Exception e){
                            logger.error("Error al mostrar la pantalla de reloj ", e);
                            ErrorDialog.show(aplicacion.getMainFrame(), aplicacion.getI18nString("SQLError.Titulo"), aplicacion.getI18nString("SQLError.Aviso"), StringUtil.stackTrace(e));
                        }finally{
                            progressDialog.setVisible(false);
                        }
                    }
                  }).start();
            }
        });
        try{
            GUIUtil.centreOnWindow(progressDialog);
            progressDialog.setVisible(true);
            String selectedFile= "";
            if (auxDocument.getFileName() == null) return;
            
            
            if (new File(auxDocument.getFileName()).isAbsolute()) selectedFile= new File(auxDocument.getFileName()).getAbsolutePath();
            else{
                selectedFile=System.getProperty("java.io.tmpdir")+auxDocument.getFileName();
                
            	if (!AlfrescoManagerUtils.isAlfrescoClientActive()) {
					RandomAccessFile outFile = new RandomAccessFile(
							selectedFile, "rw");
					outFile.write(auxDocument.getContent());
					outFile.close();
				} else {
					if (localgisIntegrationManager.downloadAssociateDocument(
							auxDocument.getId(), selectedFile))
						System.out.println("BIEN");
					else
						System.out.println("MAL");
				}
            	
            }

            /* visualizamos si el SO es Windows */
            if(com.geopista.app.licencias.CUtilidadesComponentes_LCGIII.isWindows()){
               try{
                     Runtime.getRuntime().exec("rundll32 SHELL32.DLL,ShellExec_RunDLL \"" +  selectedFile+ "\"");
                }
                catch(Exception ex){
                        logger.error("Error al abrir el documento : ", ex);
                }
            }
        }
        catch(Exception e){
             logger.error("Error al visualizar un documento ", e);
             ErrorDialog.show(aplicacion.getMainFrame(), aplicacion.getI18nString("SQLError.Titulo"), aplicacion.getI18nString("SQLError.Aviso"), StringUtil.stackTrace(e));
        }
    }

    /**
     * M�todo que abre el directorio donde queremos dejar el documento que estamos abriendo para su visualizacion
     * @param filename
     * @return path donde se va a guardar el fichero en local
     * @throws Exception
     */
    private String seleccionaFichero(String filename) throws Exception{
        File f= new File(filename);
        /* Dialogo para seleccionar donde dejar el fichero */
        JFileChooser chooser = new JFileChooser();
        chooser.setMultiSelectionEnabled(false);
        chooser.setSelectedFile(f);
        if (chooser.showSaveDialog(aplicacion.getMainFrame()) != JFileChooser.APPROVE_OPTION) return null;

        File selectedFile= chooser.getSelectedFile();
        if (selectedFile ==null) return null;
        String tmpDir= "";
        String tmpFile= selectedFile.getAbsolutePath();
        if (tmpFile.lastIndexOf(selectedFile.getName()) != -1){
            tmpDir= tmpFile.substring(0, tmpFile.lastIndexOf(selectedFile.getName()));
        }
        /** Comprobamos si existe el directorio. */
        try{
            File dir = new File(tmpDir);
            if (!dir.exists()){
                dir.mkdirs();
            }
        } catch (Exception ex){
            logger.error("Error al seleccionar un fichero ", ex);
        }
        return selectedFile.getAbsolutePath();
    }

    private void docManager() {
		new AlfrescoExplorer(aplicacion.getMainFrame(), elemCementerioBean, documentosJPanel.getFeatureDocumentsId(),
				String.valueOf(aplicacion.getIdMunicipio()),
				AlfrescoConstants.APP_CEMENTERY);
		//RECARGAR PANEL DOCUMENTOS
		try {
			load(elemCementerioBean);
		} catch (Exception e) {
			logger.error(e);
		}
	}

    public void renombrarComponentes(){
        try{annadirJButton.setText(aplicacion.getI18nString("cementerio.document.tag2"));}catch(Exception e){}
        try{modificarJButton.setText(aplicacion.getI18nString("cementerio.document.tag3"));}catch(Exception e){}
        try{borrarJButton.setText(aplicacion.getI18nString("cementerio.document.tag4"));}catch(Exception e){}
        try{visualizarJButton.setText(aplicacion.getI18nString("cementerio.document.tag5"));}catch(Exception e){}
        try{guardarJButton.setText(aplicacion.getI18nString("cementerio.document.tag10"));}catch(Exception e){}
    }

    /**
     * M�todo que carga la lista de documentos de un eleme
     * @param elem
     */
    public void load(ElemCementerioBean elem) throws Exception{
        if (elem==null) return;
        id= elem.getId();
        String superpatron = elem.getSuperPatron();
        String patron = elem.getPatron();
        Collection c= documentClient.getAttachedDocuments(id, superpatron, patron);
        documentosJPanel.setDocumentos(c);
        documentosJPanel.actualizarModelo();

        /** actualizamos filesInUp */
        if (c != null){
            Object[] originales= c.toArray();
            for (int i=0; i<originales.length; i++){
                DocumentBean doc= (DocumentBean)originales[i];
                filesInUp.put(""+i, new File(doc.getFileName()));
            }
        }
    }

    public void actualizarDatos(ElemCementerioBean elem){
        elem.setDocumentos(documentosJPanel.getDocumentos());
    }

    public void setEnabled(boolean b){
        documentosJPanel.setEnabled(b);
        annadirJButton.setEnabled(b);
        modificarJButton.setEnabled(b);
        borrarJButton.setEnabled(b);
        guardarJButton.setEnabled(true);
        visualizarJButton.setEnabled(true);
    }

    public void modificarJButtonSetEnabled(boolean b){
        modificarJButton.setEnabled(b);
    }

    public Vector getFilesInUp() {
        Vector aux= new Vector();
        for (int i=0; i<filesInUp.size(); i++){
            aux.add((File)filesInUp.get(""+i));
        }
        return aux;
    }

    private void actualizarFilesInUp(int index){
        Hashtable aux= new Hashtable();
        if (index != -1){
            if (index < filesInUp.size()){
                for (int i=0; i<index; i++){
                      aux.put(""+i, (File)filesInUp.get(""+i));
                }
                for (int i= index; i < filesInUp.size(); i++){
                    index++;
                    aux.put(""+i, (File)filesInUp.get(""+index));
                }
                filesInUp= aux;
            }/* else seria el ultimo */
        }
    }


     /**
      * M�todo para cargar los comentarios y la opci�n de p�blico asociados a un documento
      * @param documento
      */
    public void seleccionar(DocumentBean documento){
        comentariosJPanel.load(documento);
    }

    /**
     * M�todo de la interfaz no implementado
     * @param documentBean
     * @param indicePanel
     */
    public void seleccionar(DocumentBean documentBean, int indicePanel){
    }

    class ActionJList extends MouseAdapter{
        public ActionJList(){
       }

      public void mouseClicked(MouseEvent e){
       if(e.getClickCount() == 2){
           visualizarDocumento();
       }
       }
    }

    private void fireActionPerformed() {
        for (Iterator i = actionListeners.iterator(); i.hasNext();) {
            ActionListener l = (ActionListener) i.next();
            l.actionPerformed(new ActionEvent(this, 0, null));
        }
    }
    
    public DocumentPanel getDocumentosJPanel() {
		return documentosJPanel;
	}
	public void setDocumentosJPanel(DocumentPanel documentosJPanel) {
		this.documentosJPanel = documentosJPanel;
	}

}

