/*
 * JPanelResolucion.java
 *
 * Created on 9 de junio de 2005, 17:36
 */

package com.geopista.app.licencias.utilidades;

import com.geopista.app.utilidades.TextPane;
import com.geopista.app.utilidades.TextField;
import com.geopista.app.licencias.CUtilidadesComponentes;
import com.geopista.protocol.licencias.Resolucion;


import javax.swing.*;
import java.util.ResourceBundle;
import java.util.Date;
import java.text.SimpleDateFormat;

/**
 *
 * @author  angeles
 */
public class JPanelResolucion extends javax.swing.JPanel {
    org.apache.log4j.Logger logger = org.apache.log4j.Logger.getLogger(JPanelResolucion.class);
    private Resolucion resolucion;
    private JFrame padre;
    /** Creates new form JPanelResolucion */
    public JPanelResolucion(JFrame padre,ResourceBundle messages) {
        this.padre=padre;
        initComponents();
        changeScreenLang(messages);
        setEnabled(false);
    }
    
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    private void initComponents() {//GEN-BEGIN:initComponents
        jScrollPaneAsunto = new javax.swing.JScrollPane();
        jTextAreaAsunto = new TextPane(128);
        jPanelDatos = new javax.swing.JPanel();
        jCheckBoxFavorable = new javax.swing.JCheckBox();
        jTextFieldOrgano = new TextField(64);
        jLabelOrgano = new javax.swing.JLabel();
        jLabelFecha = new javax.swing.JLabel();
        jTextFieldFecha =new javax.swing.JFormattedTextField(new SimpleDateFormat("dd/MM/yyyy"));
        jButtonFecha = new javax.swing.JButton();
        jTextFieldColetilla = new TextField(128);
        jLabelColetilla = new javax.swing.JLabel();
        jLabelAsunto = new javax.swing.JLabel();

        setLayout(new java.awt.BorderLayout());

        jScrollPaneAsunto.setPreferredSize(new java.awt.Dimension(4, 100));
        jScrollPaneAsunto.setViewportView(jTextAreaAsunto);
        add(jScrollPaneAsunto, java.awt.BorderLayout.CENTER);
        jPanelDatos.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanelDatos.setPreferredSize(new java.awt.Dimension(307, 115));
        jPanelDatos.setRequestFocusEnabled(false);
        jCheckBoxFavorable.setFont(new java.awt.Font("MS Sans Serif", 0, 18));
        jPanelDatos.add(jCheckBoxFavorable, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, -1, -1));
        jPanelDatos.add(jTextFieldOrgano, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 40, 330, -1));
        jPanelDatos.add(jLabelOrgano, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 100, -1));
        jPanelDatos.add(jLabelFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 10, 110, -1));
        jPanelDatos.add(jTextFieldFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 10, 110, -1));
        jButtonFecha.setPreferredSize(new java.awt.Dimension(20, 20));
        jButtonFecha.setIcon(com.geopista.app.licencias.CUtilidadesComponentes.iconoZoom);
        jButtonFecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ponerFecha();
            }
        });
        jPanelDatos.add(jButtonFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 10, 20, 20));
        jPanelDatos.add(jTextFieldColetilla, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 70, 330, -1));
        jPanelDatos.add(jLabelColetilla, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 100, -1));
        jPanelDatos.add(jLabelAsunto, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 70, -1));

        add(jPanelDatos, java.awt.BorderLayout.NORTH);

    }//GEN-END:initComponents
    public void changeScreenLang(ResourceBundle mensajes)
   {
       try
       {
           jLabelFecha.setText(mensajes.getString("JPanelResolucion.jLabelFecha"));//"Fecha resoluci\u00f3n:");
           jLabelColetilla.setText(mensajes.getString("JPanelResolucion.jLabelColetilla"));//"Coletilla:");
           jLabelAsunto.setText(mensajes.getString("JPanelResolucion.jLabelAsunto"));//"Asunto:");
           jLabelOrgano.setText(mensajes.getString("JPanelResolucion.jLabelOrgano"));//"Organo aprobaci\u00f3n:");
           jCheckBoxFavorable.setText(mensajes.getString("JPanelResolucion.jCheckBoxFavorable"));//"Resoluci\u00f3n favorable");
           setBorder(new javax.swing.border.TitledBorder(mensajes.getString("JPanelResolucion.title")));//"Propuesta de Resoluci\u00f3n"));
           jButtonFecha.setToolTipText(mensajes.getString("JPanelResolucion.jButtonFecha"));
       }catch(Exception e)
       {
           logger.error("Error al cargar los recuros:", e);
       }
    }
    public void setEnabled(boolean bValue)
    {
        jCheckBoxFavorable.setEnabled(false);
        jButtonFecha.setEnabled(bValue);
        jTextAreaAsunto.setEditable(bValue);
        jTextAreaAsunto.setEnabled(bValue);
        jTextFieldColetilla.setEditable(bValue);
        jTextFieldFecha.setEditable(bValue);
        jTextFieldOrgano.setEditable(bValue);
        super.setEnabled(bValue);

    }
    public void setFavorable(boolean bFavorable)
    {
        jCheckBoxFavorable.setSelected(bFavorable);
    }
    public void load(Resolucion resolucion)
    {
        this.resolucion=resolucion;
        jTextFieldFecha.setValue((resolucion==null||resolucion.getFecha()==null?new Date():resolucion.getFecha()));
        jCheckBoxFavorable.setSelected((resolucion!=null&&resolucion.isFavorable()?true:false));
        jTextFieldColetilla.setText((resolucion==null||resolucion.getColetilla()==null)?"":resolucion.getColetilla());
        jTextFieldOrgano.setText((resolucion==null||resolucion.getOrgano()==null)?"":resolucion.getOrgano());
        jTextAreaAsunto.setText((resolucion==null||resolucion.getAsunto()==null)?"":resolucion.getAsunto());
    }
    public Resolucion save()
    {
        if (resolucion==null) resolucion=new Resolucion();
        resolucion.setFavorable(jCheckBoxFavorable.isSelected());
        resolucion.setColetilla(jTextFieldColetilla.getText());
        resolucion.setFecha((Date)jTextFieldFecha.getValue());
        resolucion.setAsunto(jTextAreaAsunto.getText());
        resolucion.setOrgano(jTextFieldOrgano.getText());
        return resolucion;
    }
    public void ponerFecha()
    {
        Date fecha= CUtilidadesComponentes.showCalendarDialog(padre);
        jTextFieldFecha.setValue((fecha==null?new Date():fecha));
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonFecha;
    private javax.swing.JCheckBox jCheckBoxFavorable;
    private javax.swing.JLabel jLabelAsunto;
    private javax.swing.JLabel jLabelColetilla;
    private javax.swing.JLabel jLabelFecha;
    private javax.swing.JLabel jLabelOrgano;
    private javax.swing.JPanel jPanelDatos;
    private javax.swing.JScrollPane jScrollPaneAsunto;
    private javax.swing.JTextArea jTextAreaAsunto;
    private javax.swing.JTextField jTextFieldColetilla;
    private javax.swing.JFormattedTextField jTextFieldFecha;
    private javax.swing.JTextField jTextFieldOrgano;
    // End of variables declaration//GEN-END:variables

}
