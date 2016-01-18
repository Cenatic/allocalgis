package com.geopista.app.eiel.dialogs;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.util.Locale;
import java.util.ResourceBundle;

import javax.swing.JDialog;
import javax.swing.JOptionPane;

import com.geopista.app.AppContext;
import com.geopista.app.eiel.beans.CementeriosEIEL;
import com.geopista.app.eiel.panels.CementeriosPanel;
import com.geopista.app.eiel.utils.EdicionUtils;
import com.vividsolutions.jump.I18N;
import com.vividsolutions.jump.workbench.ui.OKCancelPanel;



public class CementeriosDialog extends JDialog{
	
	private CementeriosPanel CementeriosPanel = null;    
    private OKCancelPanel _okCancelPanel = null;
    private boolean isEditable = false;       
    public static final int DIM_X = 750;
    public static final int DIM_Y = 600;
        
    private OKCancelPanel getOkCancelPanel(){
        if (_okCancelPanel == null){
            _okCancelPanel = new OKCancelPanel();
            _okCancelPanel.addActionListener(new java.awt.event.ActionListener(){
                public void actionPerformed(java.awt.event.ActionEvent e){
                    if (_okCancelPanel.wasOKPressed() && isEditable){
                        if(getCementeriosPanel().datosMinimosYCorrectos()){
                            String errorMessage = getCementeriosPanel().validateInput();
                            if (errorMessage != null){
                                JOptionPane.showMessageDialog(
                                        CementeriosDialog.this,
                                        errorMessage,
                                        I18N.get("LocalGISEIEL", "localgiseiel.mensajes.datosnocorrectos"),
                                        JOptionPane.ERROR_MESSAGE);
                                return;
                            } else{
                                try{
                                    getCementeriosPanel().okPressed();
                                }catch (Exception e1){
                                    JOptionPane.showMessageDialog(
                                            CementeriosDialog.this,
                                            errorMessage,
                                            I18N.get("LocalGISEIEL", "localgiseiel.mensajes.datosnocorrectos"),
                                            JOptionPane.ERROR_MESSAGE);
                                }
                            }
                        }else{
                            JOptionPane.showMessageDialog(CementeriosDialog.this,
                                    I18N.get("LocalGISEIEL", "localgiseiel.mensajes.datosnocorrectos"));
                            return;
                        }
                    }
                    dispose();                    
                }
            });
        }
        return _okCancelPanel;
    }
    
    
/* CONSTRUCTORES */    
    
    public CementeriosDialog(CementeriosEIEL elemento, boolean isEditable){
        super(AppContext.getApplicationContext().getMainFrame());
        initialize(I18N.get("LocalGISEIEL", "localgiseiel.dialog.titulo.ce"));       
        this.isEditable = isEditable;
        getCementeriosPanel().loadData (elemento);
        if (getCementeriosPanel().getJComboBoxEpigInventario().isEnabled())    	
        	EdicionUtils.enablePanel(getCementeriosPanel(), isEditable);
        else{
        	EdicionUtils.enablePanel(getCementeriosPanel(), isEditable);
        	getCementeriosPanel().getJComboBoxEpigInventario().setEnabled(false);
        	getCementeriosPanel().getJComboBoxNumInventario().setEnabled(false);
        }
        if(elemento!=null)
        	EdicionUtils.enablePanel(getCementeriosPanel().getJPanelDatosIdentificacion(), false);

        //Deshabilitamos la clave, el codigo de provincia y el codigo de municipio
        getCementeriosPanel().getJTextFieldClave().setEnabled(false);
        getCementeriosPanel().getJComboBoxProvincia().setEnabled(false);
        getCementeriosPanel().getJComboBoxMunicipio().setEnabled(false);
        
        this.setLocationRelativeTo(null);
    }
    
    public CementeriosDialog(){
        this(false);
        this.setLocationRelativeTo(null);
    }
    
    public CementeriosDialog(boolean isEditable){
        this(null, isEditable);
        this.setLocationRelativeTo(null);
    }
    
   
    
    /**
     * This method initializes this
     * 
     * @return void
     */
    private void initialize(String title){
        Locale loc=I18N.getLocaleAsObject();         
        ResourceBundle bundle = ResourceBundle.getBundle("com.geopista.app.eiel.language.LocalGISEIELi18n",loc,this.getClass().getClassLoader());
        I18N.plugInsResourceBundle.put("LocalGISEIEL",bundle);
        this.setModal(true);
        this.setContentPane(getCementeriosPanel());
        this.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        this.setSize(DIM_X, DIM_Y);
        this.setTitle(title);
        this.setResizable(true);
        this.getOkCancelPanel().setVisible(true);
        this.addWindowListener(new java.awt.event.WindowAdapter(){
            public void windowClosing(java.awt.event.WindowEvent e){
                dispose();
            }
        });              
    }    
   
    public static void main(String[] args){
        CementeriosDialog dialog = new CementeriosDialog();
        dialog.setVisible(true);
    }
    
    /* PANEL */
    public CementeriosPanel getCementeriosPanel(){
        if (CementeriosPanel == null){
        	CementeriosPanel = new CementeriosPanel(new GridBagLayout());
        	CementeriosPanel.add(getOkCancelPanel(), 
                    new GridBagConstraints(0, 5, 1, 1, 0.1, 0.1,
                            GridBagConstraints.CENTER, GridBagConstraints.NONE,
                            new Insets(0, 5, 0, 5), 0, 0));           
        }
        return CementeriosPanel;
    }
    
    /* DATOS */
    public CementeriosEIEL getCementerios(CementeriosEIEL elemento){
    	return getCementeriosPanel().getCementerios(elemento);
    }
    
}
