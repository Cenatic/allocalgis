package com.geopista.app.catastro.intercambio.importacion;


import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import java.io.File;
import java.net.URL;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.ResourceBundle;

import javax.help.HelpBroker;
import javax.help.HelpSet;
import javax.swing.JComboBox;
import javax.swing.JEditorPane;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import com.geopista.app.AppContext;
import com.geopista.app.catastro.gestorcatastral.MainCatastro;
import com.geopista.app.catastro.intercambio.images.IconLoader;
import com.geopista.app.catastro.intercambio.importacion.dialogs.FileImportSelectPanel;
import com.geopista.app.catastro.intercambio.importacion.utils.ImportarUtils;
import com.geopista.app.catastro.intercambio.importacion.utils.ImportarUtils_LCGIII;
import com.geopista.app.editor.GeopistaFiltroFicheroFilter;
import com.geopista.security.GeopistaPermission;
import com.geopista.ui.wizard.WizardContext;
import com.geopista.ui.wizard.WizardPanel;
import com.vividsolutions.jump.I18N;
import com.vividsolutions.jump.util.Blackboard;
import com.vividsolutions.jump.workbench.ui.GUIUtil;
import com.vividsolutions.jump.workbench.ui.InputChangedListener;
import com.vividsolutions.jump.workbench.ui.task.TaskMonitorDialog;

public class ImportarMunicipios extends JPanel implements WizardPanel
{
    private boolean permiso = true;
    
    private AppContext application = (AppContext) AppContext.getApplicationContext();
    private Blackboard blackboard = application.getBlackboard();
    private WizardContext wizardContext; 
    private String nextID = "2";
    
    private StringBuffer strBuf = new StringBuffer();    
    
    private JComboBox jComboBoxFileType = new JComboBox();
    private JEditorPane jEditorPaneErrores = new JEditorPane();
    private JFileChooser fc = new JFileChooser();
    private JTextField jTextFieldFileName = null;
    
    //  Variables utilizadas para las validaciones
    private boolean continuar = false;       
    
    
    //TODO Sustituir por las que correspondan al fichero de municipios
    private static final int LONGITUD_REGISTRO = 200;
    private static final String TIPO_CABECERA = "01";
    private static final String TIPO_GENERALES = "02";
    private static final String TIPO_POLIGONO = "03";
    private static final String TIPO_ZONA_URBANISTICA = "04";
    private static final String TIPO_CALLE = "05";
    private static final String TIPO_VALOR = "06";
    private static final String TIPO_COLA = "90";
    
    public ImportarMunicipios()
    {   
        try
        {     
            Locale loc=I18N.getLocaleAsObject();         
            ResourceBundle bundle = ResourceBundle.getBundle("com.geopista.app.catastro.intercambio.language.Importacioni18n",loc,this.getClass().getClassLoader());
            I18N.plugInsResourceBundle.put("Importacion",bundle);
            jbInit();
        } 
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
    
    private void jbInit() throws Exception
    {  
        this.setLayout(new GridBagLayout());
        
        final TaskMonitorDialog progressDialog = new TaskMonitorDialog(application.getMainFrame(), null);
        
        progressDialog.setTitle(I18N.get("Importacion","CargandoDatosIniciales"));
        progressDialog.report(I18N.get("Importacion","CargandoDatosIniciales"));
        progressDialog.addComponentListener(new ComponentAdapter()
                {
            public void componentShown(ComponentEvent e)
            {                
                // Wait for the dialog to appear before starting the
                // task. Otherwise
                // the task might possibly finish before the dialog
                // appeared and the
                // dialog would never close. [Jon Aquino]
                new Thread(new Runnable()
                        {
                    public void run()
                    {
                        try
                        {
                            FileImportSelectPanel panel = new FileImportSelectPanel();
                            add(panel,  
                                    new GridBagConstraints(0, 0, 1, 1, 1, 1, GridBagConstraints.CENTER,
                                            GridBagConstraints.BOTH, new Insets(10,10,10,10) ,0,0));
                            
                            panel.getJComboBoxDatosImportar().addItem(I18N.get("Importacion","importar.asistente.municipios.tipo"));
                            jTextFieldFileName = panel.getJTextFieldFicheroImportar();
                            jComboBoxFileType = panel.getJComboBoxTipoFichero();
                            jComboBoxFileType.addItem(I18N.get("Importacion","importar.general.tiposfichero.texto"));                            
                            jEditorPaneErrores = panel.getJEditorPaneErrores();
                            
                            panel.getLabelImagen().setIcon(IconLoader.icon(MainCatastro.BIG_PICTURE_LOCATION));
                            panel.getJButtonFicheroImportar().addActionListener(new ActionListener()
                                    {
                                public void actionPerformed(ActionEvent e)
                                {
                                    btnOpen_actionPerformed(e);
                                }
                                    });
                            
                            panel.getJComboBoxTipoFichero().addActionListener(new ActionListener()
                                    {
                                public void actionPerformed(ActionEvent e)
                                {
                                    cmbTipoFichero_actionPerformed(e);
                                }
                                    });
                            
                        } 
                        catch (Exception e)
                        {
                            e.printStackTrace();
                        } 
                        finally
                        {
                            progressDialog.setVisible(false);
                        }
                    }
                        }).start();
            }
                });
        GUIUtil.centreOnWindow(progressDialog);
        progressDialog.setVisible(true);
        
    }
    
    public void enteredFromLeft(Map dataMap)
    {
        if(!application.isLogged())
        {
            application.login();
        }
        if(!application.isLogged())
        {
            wizardContext.cancelWizard();
            return;
        }
        
        GeopistaPermission paso = new GeopistaPermission("Geopista.InfReferencia.ImportarDatosIne");
        
        permiso = application.checkPermission(paso, "Informacion de Referencia");
        
        try
        {
            // Iniciamos la ayuda
            String helpHS = "ayuda.hs";
            ClassLoader c1 = this.getClass().getClassLoader();
            URL hsURL = HelpSet.findHelpSet(c1, helpHS);
            HelpSet hs = new HelpSet(null, hsURL);
            HelpBroker hb = hs.createHelpBroker();
            // fin de la ayuda
            hb.enableHelpKey(this,"InformacionReferenciaSeleccionFicheroImportarDGCatastro", hs);
        } 
        catch (Exception excp)
        {
            excp.printStackTrace();
        }
    }
    
    /**
     * Called when the user presses Next on this panel
     */
    public void exitingToRight() throws Exception
    {
        blackboard.put(ImportarUtils_LCGIII.FILE_TO_IMPORT, jTextFieldFileName.getText());        
    }
    
    /**
     * Tip: Delegate to an InputChangedFirer.
     * 
     * @param listener
     *            a party to notify when the input changes (usually the
     *            WizardDialog, which needs to know when to update the enabled
     *            state of the buttons.
     */
    public void add(InputChangedListener listener)
    {
        
    }
    
    public void remove(InputChangedListener listener)
    {
        
    }
    
    public String getTitle()
    {
        return this.getName();
    }
    
    public String getID()
    {
        return "1";
    }
    
    public String getInstructions()
    {
        return " ";
    }
    
    public boolean isInputValid()
    {        
        if (!permiso)
        {
            JOptionPane.showMessageDialog(application.getMainFrame(), application
                    .getI18nString("NoPermisos"));
            return false;
        } 
        else
        {
            if (!continuar)            
                return false;             
            else                         
                if ((jTextFieldFileName.getText().length()) == 0)                
                    return false;                 
                else                
                    return true;   
        }
    }
    
    
    
    public void setNextID(String nextID)
    {
        this.nextID = nextID;
    }
    
    /**
     * @return null to turn the Next button into a Finish button
     */
    public String getNextID()
    {
        return nextID;
    }
    
    public void setWizardContext(WizardContext wd)
    {
        wizardContext = wd;
    }
    
    private void btnOpen_actionPerformed(ActionEvent e)
    {        
        // Se inicializa para cada proceso de importacion
        continuar = false;       
        
        GeopistaFiltroFicheroFilter filter = new GeopistaFiltroFicheroFilter();
        
        int cmbIndex = jComboBoxFileType.getSelectedIndex();
        if ((cmbIndex == 0) || (cmbIndex == 1))
        {
            filter.addExtension("TXT");
            filter.setDescription(I18N.get("Importacion","importar.general.tiposfichero.texto"));
        }
        
        fc.setFileFilter(filter);
        fc.setAcceptAllFileFilterUsed(false); // QUITA LA OPCION ALL FILES(*.*)
        
        File currentDirectory = (File) blackboard.get(ImportarUtils_LCGIII.LAST_IMPORT_DIRECTORY);
        
        fc.setCurrentDirectory(currentDirectory);
        
        int returnVal = fc.showOpenDialog(this);
        
        blackboard.put(ImportarUtils_LCGIII.LAST_IMPORT_DIRECTORY, fc.getCurrentDirectory());
        
        if (returnVal == JFileChooser.APPROVE_OPTION)
        {
            // Cargamos el fichero que hemos obtenido
            String fichero;
            fichero = fc.getSelectedFile().getPath();
            jTextFieldFileName.setText(fichero); 
            
            jEditorPaneErrores.removeAll();
            strBuf = new StringBuffer();
            
            strBuf.append(ImportarUtils_LCGIII.HTML_NUEVO_PARRAFO)
            .append(I18N.get("Importacion","importar.general.proceso.comenzar"))
            .append(" ").append(fc.getSelectedFile().getName())
            .append(ImportarUtils_LCGIII.HTML_FIN_PARRAFO);
            
            strBuf.append(ImportarUtils_LCGIII.HTML_NUEVO_PARRAFO)
            .append(I18N.get("Importacion","importar.general.proceso.espera"))
            .append(ImportarUtils_LCGIII.HTML_FIN_PARRAFO);
            
            strBuf.append(ImportarUtils_LCGIII.HTML_NUEVO_PARRAFO)
            .append(I18N.get("Importacion","importar.general.proceso.verificando"))
            .append(ImportarUtils_LCGIII.HTML_FIN_PARRAFO);
            
            jEditorPaneErrores.setText(strBuf.toString());
            strBuf=new StringBuffer();;
            
            final TaskMonitorDialog progressDialog = new TaskMonitorDialog(application
                    .getMainFrame(), null);
            
            progressDialog.setTitle(I18N.get("Importacion","importar.general.proceso.validando"));
            progressDialog.report(I18N.get("Importacion","importar.general.proceso.validando"));
            progressDialog.addComponentListener(new ComponentAdapter()
                    {
                public void componentShown(ComponentEvent e)
                {                    
                    // Wait for the dialog to appear before starting the
                    // task. Otherwise
                    // the task might possibly finish before the dialog
                    // appeared and the
                    // dialog would never close. [Jon Aquino]
                    new Thread(new Runnable()
                            {
                        public void run()
                        {                            
                            try
                            {
                                continuar = false;
                                
                                //COMPROBAR TAMA�O Y CONTENIDO DEL FICHERO (PRINCIPIO DE CADA REGISTRO)
                                //comprueba el tama�o del fichero, y si tiene cabecera y cola
                                if (ImportarUtils.testFileSize(fc.getSelectedFile().getPath(), LONGITUD_REGISTRO))
                                {  
                                    if (ImportarUtils.testHeader(fc.getSelectedFile().getPath(), TIPO_CABECERA))
                                    { 
                                        if(ImportarUtils.testTail(fc.getSelectedFile().getPath(), TIPO_COLA))
                                        {
                                            //comprueba si el resto del fichero contiene registros de los tipos esperados
                                            ArrayList lstTipos = new ArrayList();
                                            lstTipos.add(TIPO_GENERALES);
                                            lstTipos.add(TIPO_POLIGONO);
                                            lstTipos.add(TIPO_ZONA_URBANISTICA);
                                            lstTipos.add(TIPO_CALLE);
                                            lstTipos.add(TIPO_VALOR);
                                            
                                            ArrayList lst = ImportarUtils.getErroneousRows(fc.getSelectedFile().getPath(),lstTipos, ImportarUtils_LCGIII.BORDERS_OFF);
                                            
                                            if(lst.size()!=0)
                                            {
                                                strBuf.append(ImportarUtils_LCGIII.HTML_ROJO).append(I18N.get("Importacion","importar.general.registros.incorrectos")).append(ImportarUtils_LCGIII.HTML_SALTO);
                                                
                                                Iterator it = lst.iterator();
                                                while (it.hasNext())
                                                {
                                                    strBuf.append(it.next().toString()).append(ImportarUtils_LCGIII.HTML_SALTO);
                                                }
                                                strBuf.append(ImportarUtils_LCGIII.HTML_FIN_PARRAFO);
                                                
                                                continuar = false;
                                            }
                                            else
                                            {
                                                continuar = true;
                                            }
                                        }
                                        //mal cola
                                        else
                                        {
                                            strBuf.append(ImportarUtils_LCGIII.HTML_ROJO).append(I18N.get("Importacion","importar.general.cola.incorrecta")).append(ImportarUtils_LCGIII.HTML_FIN_PARRAFO);
                                        }                                       
                                    }                                    
                                    //mal cabecera
                                    else
                                    {
                                        strBuf.append(ImportarUtils_LCGIII.HTML_ROJO).append(I18N.get("Importacion","importar.general.cabecera.incorrecta")).append(ImportarUtils_LCGIII.HTML_FIN_PARRAFO);
                                    }                                    
                                }
                                //longitud incorrecta
                                else
                                {
                                    strBuf.append(ImportarUtils_LCGIII.HTML_ROJO).append(I18N.get("Importacion","importar.general.longitud.incorrecta"))
                                    .append(ImportarUtils_LCGIII.HTML_FIN_PARRAFO);
                                    continuar = false;
                                }                                
                            } 
                            catch (Exception e)
                            {
                                continuar = false;
                            } 
                            finally
                            {
                                progressDialog.setVisible(false);
                            }
                        }
                            }).start();
                }
                    });
            GUIUtil.centreOnWindow(progressDialog);
            progressDialog.setVisible(true);
            
            if (continuar)
            {  
                strBuf.append(ImportarUtils_LCGIII.HTML_VERDE)
                .append(I18N.get("Importacion","importar.general.validacion.correcta"))
                //.append(ImportarUtils.HTML_FIN_PARRAFO)
                .append(ImportarUtils_LCGIII.HTML_SALTO).append(ImportarUtils_LCGIII.HTML_SALTO)
                .append(I18N.get("Importacion","importar.general.validacion.finalizada"))
                .append(ImportarUtils_LCGIII.HTML_FIN_PARRAFO);            
            }            
            else
            {
                jEditorPaneErrores.removeAll();
                
                strBuf.append(ImportarUtils_LCGIII.HTML_ROJO)
                .append(I18N.get("Importacion","importar.general.validacion.incorrecta"))
                //.append(ImportarUtils.HTML_FIN_PARRAFO)
                .append(ImportarUtils_LCGIII.HTML_SALTO).append(ImportarUtils_LCGIII.HTML_SALTO)
                .append(I18N.get("Importacion","importar.general.validacion.finalizada"))
                .append(ImportarUtils_LCGIII.HTML_FIN_PARRAFO);
                
                jEditorPaneErrores.setText(strBuf.toString());
                wizardContext.inputChanged();                
            }
            
            jEditorPaneErrores.setText(strBuf.toString());
            wizardContext.inputChanged();
        }        
    }
    
    private void cmbTipoFichero_actionPerformed(ActionEvent e)
    {
        //txtFile.setText("");
        jTextFieldFileName.setText("");
    }
    
    
    public void exiting()
    {   
    }
}  
