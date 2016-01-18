/*
 * JPanelInformes.java
 *
 * Created on 2 de junio de 2005, 11:49
 */

package com.geopista.app.licencias.utilidades;

import com.geopista.app.licencias.CUtilidadesComponentes;
import com.geopista.app.licencias.CConstantesLicencias;
import com.geopista.app.licencias.estructuras.Estructuras;
import com.geopista.app.utilidades.TextPane;
import com.geopista.app.utilidades.estructuras.ComboBoxEstructuras;
import com.geopista.protocol.licencias.Informe;
import com.geopista.protocol.CConstantesComando;


import javax.swing.*;
import javax.swing.event.ListSelectionListener;
import javax.swing.event.ListSelectionEvent;
import java.util.ResourceBundle;
import java.util.Vector;
import java.util.Enumeration;
import java.util.Date;
import java.awt.*;
import java.text.SimpleDateFormat;
import java.io.*;

/**
 *
 * @author  angeles
 */
public class JPanelInformes extends javax.swing.JPanel {
    org.apache.log4j.Logger logger = org.apache.log4j.Logger.getLogger(JPanelInformes.class);
    private JFrame padre;
    private Vector informes;
    private Informe informeSelected;
    private long idSolicitud;
    public static ResourceBundle messages;
    public boolean consulta= false;

    /** Creates new form JPanelInformes */
    public JPanelInformes(JFrame padre,ResourceBundle mensajes) {
        this.padre=padre;
        messages=mensajes;
        initComponents();
        changeScreenLang(messages);
        setEnabled(false);
        setActiva(false);
    }
    
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    private void initComponents() {//GEN-BEGIN:initComponents
        jPanelLista = new javax.swing.JPanel();
        jListInformes = new javax.swing.JList();
        jPanelInforme = new javax.swing.JPanel();
        jLabelFecha = new javax.swing.JLabel();
        jTextFieldFecha = new javax.swing.JFormattedTextField(new SimpleDateFormat("dd/MM/yyyy"));
        jCheckBoxFavorable = new javax.swing.JCheckBox();
        jLabelTipo = new javax.swing.JLabel();
        jComboBoxTipo =new ComboBoxEstructuras(Estructuras.getListaTiposInforme(), null, messages.getLocale().toString());
        jLabelFichero = new javax.swing.JLabel();
        jTextFieldFichero = new javax.swing.JTextField();
        jButtonFichero = new javax.swing.JButton();
        jButtonFichero.setIcon(com.geopista.app.licencias.CUtilidadesComponentes.iconoZoom);
        jButtonVer = new javax.swing.JButton();
        jButtonFecha = new javax.swing.JButton();
        jScrollPaneObservaciones = new javax.swing.JScrollPane();
        jLabelComentario= new javax.swing.JLabel();
        jTextAreaObservaciones = new TextPane(254);
        jLabelObservaciones = new javax.swing.JLabel();
        jButtonGuardar = new javax.swing.JButton();
        jPanelBotonera = new javax.swing.JPanel();
        jButtonAdd = new javax.swing.JButton();
        jButtonSave = new javax.swing.JButton();
        jButtonDelete = new javax.swing.JButton();
        jScrollPaneInformes = new javax.swing.JScrollPane();

        setLayout(new java.awt.BorderLayout());
        jPanelLista.setLayout(new java.awt.BorderLayout());
        jPanelLista.setPreferredSize(new java.awt.Dimension(200, 200));
        jScrollPaneInformes.setViewportView(jListInformes);
        jListInformes.setCellRenderer(new RendererInformes());
        jPanelLista.add(jScrollPaneInformes, java.awt.BorderLayout.CENTER);
        add(jPanelLista, java.awt.BorderLayout.NORTH);
        jPanelInforme.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanelInforme.add(jLabelFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 110, -1));
        jTextFieldFecha.setEnabled(false);
        jPanelInforme.add(jTextFieldFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 30, 120, -1));
        jCheckBoxFavorable.setSelected(true);
        jPanelInforme.add(jCheckBoxFavorable, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 30, 140, -1));
        jPanelInforme.add(jLabelTipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 100, -1));
        jPanelInforme.add(jComboBoxTipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 60, 140, -1));
        jPanelInforme.add(jLabelFichero, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, -1, -1));
        jPanelInforme.add(jTextFieldFichero, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 90, 260, -1));
        jPanelInforme.add(jButtonFichero, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 90, 20, 20));
        jPanelInforme.add(jButtonVer, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 140, 120, -1));
        jButtonFecha.setIcon(com.geopista.app.licencias.CUtilidadesComponentes.iconoZoom);
        jButtonFecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ponerFecha();
            }
        });
        jPanelInforme.add(jButtonFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 30, 20, 20));

        jScrollPaneObservaciones.setViewportView(jTextAreaObservaciones);
        jPanelInforme.add(jScrollPaneObservaciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 190, 511, 150));
        jPanelInforme.add(jLabelComentario,new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 300, -1, -1));
        jPanelInforme.add(jLabelObservaciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, 120, 20));
        jPanelInforme.add(jButtonGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 140, 130, -1));
        add(jPanelInforme, java.awt.BorderLayout.CENTER);
        jPanelBotonera.add(jButtonAdd);
        jPanelBotonera.add(jButtonSave);
        jPanelBotonera.add(jButtonDelete);
        add(jPanelBotonera, java.awt.BorderLayout.SOUTH);
        jButtonAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nuevo();
            }
        });
        jButtonSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salvar();
            }
        });
        jButtonDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                borrar();
            }
        });
        jButtonFichero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addFichero();
            }
        });
        jButtonVer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                verFichero();
            }
        });
        jButtonGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guardarFichero();
            }
        });
        ListSelectionModel rowSM = jListInformes.getSelectionModel();
        rowSM.addListSelectionListener(new ListSelectionListener() {
            public void valueChanged(ListSelectionEvent e) {
                seleccionar();
            }
        });

  }//GEN-END:initComponents

    public void changeScreenLang(ResourceBundle mensajes)
    {
        try
        {
            messages=mensajes;
            jPanelLista.setBorder(new javax.swing.border.TitledBorder(messages.getString("JPanelInformes.jPanelLista")));//"Lista de informes"));
            jPanelInforme.setBorder(new javax.swing.border.TitledBorder(messages.getString("JPanelInformes.jPanelInforme")));//"Informe"));
            jButtonDelete.setText(messages.getString("JPanelInformes.jButtonDelete"));//"Borrar");
            jButtonAdd.setText(messages.getString("JPanelInformes.jButtonAdd"));//"A\u00f1adir");
            jButtonSave.setText(messages.getString("JPanelInformes.jButtonSave"));//"Salvar");
            jButtonGuardar.setText(messages.getString("JPanelInformes.jButtonGuardar"));//"Guardar informe");
            jLabelObservaciones.setText(messages.getString("JPanelInformes.jLabelObservaciones"));//"Observaciones:");
            jButtonVer.setText(messages.getString("JPanelInformes.jButtonVer"));//"Ver informe");
            jLabelFecha.setText(messages.getString("JPanelInformes.jLabelFecha"));//"Fecha de llegada:");
            jCheckBoxFavorable.setText(messages.getString("JPanelInformes.jCheckBoxFavorable"));//"Favorable");
            jLabelTipo.setText(messages.getString("JPanelInformes.jLabelTipo"));//"Tipo informe:");
            jLabelFichero.setText(messages.getString("JPanelInformes.jLabelFichero"));//"Fichero:");
            //jLabelComentario.setText("Esta pesta�a s�lo estar� activa cuando el \nexpediente este en estado 'ESPERANDO_INFORMES'");

            jButtonDelete.setToolTipText(messages.getString("JPanelInformes.jButtonDelete.toolTipText"));
            jButtonAdd.setToolTipText(messages.getString("JPanelInformes.jButtonAdd.toolTipText"));
            jButtonSave.setToolTipText(messages.getString("JPanelInformes.jButtonSave.toolTipText"));
            jButtonGuardar.setToolTipText(messages.getString("JPanelInformes.jButtonGuardar.toolTipText"));
            jButtonVer.setToolTipText(messages.getString("JPanelInformes.jButtonVer.toolTipText"));
            jButtonFecha.setToolTipText(messages.getString("JPanelInformes.jButtonFecha.toolTipText"));
            jButtonFichero.setToolTipText(messages.getString("JPanelInformes.jButtonFichero.toolTipText"));
        }catch(Exception e)
        {
            logger.error("Error al escribir las etiquetas:",e);
        }
    }
    public void nuevo()
    {
        setEnabled(true);

        load(new Informe());
    }
    private void borrar()
    {
        if (informeSelected==null) return;
        informes.remove(informeSelected);
        actualizarModelo(informes);
        load(null);
    }
    private void actualizarModelo(Vector informes)
    {
        DefaultListModel  listModel= new DefaultListModel();
        if (informes!=null)
        {
            for (Enumeration e=informes.elements();e.hasMoreElements();)
               listModel.addElement(e.nextElement());
        }
        jListInformes.setModel(listModel);
    }
    public void load(Informe informe)
    {
        informeSelected=informe;
        jTextAreaObservaciones.setText((informe==null||informe.getObservaciones()==null?"":informe.getObservaciones()));
        jTextFieldFecha.setValue((informe==null||informe.getFecha()==null?new Date():informe.getFecha()));
        jTextFieldFichero.setText((informe==null||informe.getFichero()==null?"":informe.getFichero().toString()));
        jCheckBoxFavorable.setSelected((informe==null||informe.isFavorable()?true:false));
        if (informe==null|| informe.getTipo()==null)
            jComboBoxTipo.setSelectedIndex(0);
        else
            jComboBoxTipo.setSelectedPatron(informe.getTipo());
    }
    public Informe save()
    {
        informeSelected.setFavorable(jCheckBoxFavorable.isSelected());
        informeSelected.setFichero(jTextFieldFichero.getText());
        informeSelected.setFecha((Date)jTextFieldFecha.getValue());
        informeSelected.setObservaciones(jTextAreaObservaciones.getText());
        informeSelected.setTipo((jComboBoxTipo.getSelectedIndex()==0?null:jComboBoxTipo.getSelectedPatron()));
        return informeSelected;
    }
    public boolean checkCampos()
    {
        if (jTextFieldFichero.getText().length()<=0) return false;
        //Comprobamos que el fichero existe
        try
        {
            File file = new File(jTextFieldFichero.getText());
            return (file.exists());
        }catch (Exception e)
        {
            return false;
        }
    }
    public void salvar()
    {
        if (informeSelected==null) return;
        if (!checkCampos())
        {
            new JOptionPane(messages.getString("JPanelInformes.mensaje1"), JOptionPane.INFORMATION_MESSAGE).createDialog(padre,"INFORMATION").show();
            return;
        }
        if (informes==null) informes=new Vector();
        informes.add(save());
        actualizarModelo(informes);
        setEnabled(false);
    }
    public void setEnabled(boolean bValue)
    {
        jTextFieldFecha.setEditable(bValue);
        jTextAreaObservaciones.setEnabled(bValue);
        jTextAreaObservaciones.setEditable(bValue);
        jTextFieldFichero.setEditable(bValue);
        jCheckBoxFavorable.setEnabled(bValue);
        jComboBoxTipo.setEnabled(bValue);
        jButtonFecha.setEnabled(bValue);
        jButtonFichero.setEnabled(bValue);
        if (consulta)
            jButtonAdd.setEnabled(bValue);
        else jButtonAdd.setEnabled(!bValue);
        jButtonSave.setEnabled(bValue);
        if (consulta)
            jButtonDelete.setEnabled(bValue);
        else jButtonDelete.setEnabled(!bValue);
        jButtonVer.setEnabled(!bValue);
        jButtonGuardar.setEnabled(!bValue);
    }
    public void initValues()
    {
        jCheckBoxFavorable.setSelected(true);
        jTextAreaObservaciones.setText("");
        jTextFieldFecha.setValue(new Date());
        jTextFieldFichero.setText("");
    }
    public void ponerFecha()
    {
        Date fecha= CUtilidadesComponentes.showCalendarDialog(padre);
        jTextFieldFecha.setValue((fecha==null?new Date():fecha));
    }
    public Vector getInformes() {
        return informes;
    }

    public void setInformes(Vector informes, long idSolicitud) {
        setInformes(informes, idSolicitud, true);
    }
    public void setInformes(Vector informes, long idSolicitud, boolean activo) {
        this.informes = informes;
        this.idSolicitud=idSolicitud;
        actualizarModelo(informes);
        load(null);
        setActiva(activo);
        consulta= !activo;
    }
     public void setActiva(boolean bValue) {
        jButtonAdd.setEnabled(bValue);
        jButtonDelete.setEnabled(bValue);
        jButtonSave.setEnabled(false);
    }
    public void seleccionar()
    {
        setEnabled(false);
        int selectedRow = jListInformes.getMinSelectionIndex();
        if (selectedRow<0)return;
        ListModel auxList=jListInformes.getModel();
        Informe auxInforme=( Informe)auxList.getElementAt(selectedRow);
        load(auxInforme);
    }
    public boolean existeFichero(String sNombreFichero)
    {
        if (informes==null || sNombreFichero==null) return false;
        for (Enumeration e= informes.elements();e.hasMoreElements();)
        {
               Informe auxInforme=(Informe)e.nextElement();
               File file = new File(auxInforme.getFichero());
               String nombre=auxInforme.getFichero();
               if (file.isAbsolute()) nombre = file.getName();
               if (nombre.equalsIgnoreCase(sNombreFichero))
                  return true;
        }
        return false;
    }
    public void addFichero()
    {
        JFileChooser chooser = new JFileChooser();
        com.geopista.app.utilidades.GeoPistaFileFilter filter = new com.geopista.app.utilidades.GeoPistaFileFilter();
        filter.addExtension("doc");
        filter.addExtension("txt");
        filter.setDescription("Fichero DOC & TXT");
        chooser.setFileFilter(filter);
        chooser.setMultiSelectionEnabled(false);
        if (chooser.showOpenDialog(this) != JFileChooser.APPROVE_OPTION) return;
        File fichero= chooser.getSelectedFile();
        if (fichero==null) return;
        if (existeFichero(fichero.getName()))
        {
             new JOptionPane(messages.getString("DocumentacionLicenciasJPanel.mensaje6")+": " +fichero.getName(), JOptionPane.INFORMATION_MESSAGE).createDialog(padre,"INFORMATION").show();
             return;
        }
        if (fichero.length() > CConstantesLicencias.totalMaxSizeFilesUploaded)
        {
              new JOptionPane(messages.getString("DocumentacionLicenciasJPanel.mensaje5")+": " +CConstantesLicencias.totalMaxSizeFilesUploaded+" bytes", JOptionPane.INFORMATION_MESSAGE).createDialog(padre,"INFORMATION").show();
              return;
        }
        jTextFieldFichero.setText(fichero.getAbsolutePath());
    }
    private void verFichero()
    {
         if (informeSelected==null || informeSelected.getFichero()==null) return;
         this.setCursor(Cursor.getPredefinedCursor(Cursor.WAIT_CURSOR));
         File f= new File(informeSelected.getFichero());
         String tmpFile="";
         if (!f.isAbsolute())
         {
                String tmpDir = System.getProperty("user.dir") + File.separator + "tmp" + File.separator + "licencias" + File.separator + "informes" + File.separator + informeSelected.getId() + File.separator;
                tmpFile = tmpDir + informeSelected.getFichero();
                try {File dir = new File(tmpDir);
                     if (!dir.exists()) {dir.mkdirs();}
                     File[] files = dir.listFiles();
                     for (int i = 0; i < files.length; i++)
                     {
                         File file = files[i];
                         if (file.isDirectory()) continue;
                         try {file.delete();} catch (Exception e) {}
                     }
                } catch (Exception ex) {
                     logger.error("Exception al crear y limpiar el directorio: " + tmpDir, ex);
                }
                 boolean resultado = CUtilidadesComponentes.GetURLFile(CConstantesComando.anexosLicenciasUrl + idSolicitud + "/"+ "informes"+"/"+  informeSelected.getFichero(), tmpFile, "", 0);
                 if (!resultado) {
                      new JOptionPane(messages.getString("DocumentacionLicenciasJPanel.mensaje2"), JOptionPane.INFORMATION_MESSAGE).createDialog(padre,"INFORMATION").show();
                      this.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
                      return;
                 }
         }else tmpFile=f.getAbsolutePath();
         try{Runtime.getRuntime().exec("rundll32 SHELL32.DLL,ShellExec_RunDLL \"" + tmpFile + "\"");}
         catch (Exception ex)
         {
              logger.warn("Exception: " + ex.toString());
              //mostrarMensaje(CMainLicencias.literales.getString("DocumentacionLicenciasJPanel.mensaje3") + " " + tmpFile);
         }
         this.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
   }
   public void guardarFichero()
   {
       try{
            if (informeSelected==null || informeSelected.getFichero()==null) return;
            JFileChooser chooser = new JFileChooser();
            com.geopista.app.utilidades.GeoPistaFileFilter filter = new com.geopista.app.utilidades.GeoPistaFileFilter();
            filter.addExtension("doc");
            filter.addExtension("txt");
            filter.setDescription("Fichero DOC & TXT");
            chooser.setFileFilter(filter);
            chooser.setMultiSelectionEnabled(false);
            chooser.setDialogType(JFileChooser.SAVE_DIALOG);
            if (chooser.showOpenDialog(this) != JFileChooser.APPROVE_OPTION) return;
            File fDestino= chooser.getSelectedFile();
            if (fDestino==null) return;
            this.setCursor(Cursor.getPredefinedCursor(Cursor.WAIT_CURSOR));
            File fFuente= new File(informeSelected.getFichero());
            if (!fFuente.isAbsolute())
            {
                    String tmpFile=fDestino.getAbsolutePath();
                    boolean resultado = CUtilidadesComponentes.GetURLFile(CConstantesComando.anexosLicenciasUrl + idSolicitud +  File.separator+ "informes"+ File.separator +  informeSelected.getFichero(), tmpFile, "", 0);
                    if (!resultado) {
                        new JOptionPane(messages.getString("DocumentacionLicenciasJPanel.mensaje2"), JOptionPane.INFORMATION_MESSAGE).createDialog(padre,"INFORMATION").show();
                        this.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
                        return;
                    }
                    else
                        new JOptionPane(messages.getString("JPanelInformes.mensaje2"), JOptionPane.INFORMATION_MESSAGE).createDialog(padre,"INFORMATION").show();
             }else
            {
                copy(fFuente, fDestino);
                new JOptionPane(messages.getString("JPanelInformes.mensaje2"), JOptionPane.INFORMATION_MESSAGE).createDialog(padre,"INFORMATION").show();
            }
       }
       catch (Exception ex)
       {
              logger.warn("Exception: " + ex.toString());
              //mostrarMensaje(CMainLicencias.literales.getString("DocumentacionLicenciasJPanel.mensaje3") + " " + tmpFile);
       }
       this.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));

    }
    void copy(File src, File dst) throws IOException {
        InputStream in = new FileInputStream(src);
        OutputStream out = new FileOutputStream(dst);
        byte[] buf = new byte[1024];
        int len;
        while ((len = in.read(buf)) > 0) {
            out.write(buf, 0, len);
        }
        in.close();
        out.close();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAdd;
    private javax.swing.JButton jButtonSave;
    private javax.swing.JButton jButtonDelete;
    private javax.swing.JButton jButtonFecha;
    private javax.swing.JButton jButtonFichero;
    private javax.swing.JButton jButtonGuardar;
    private javax.swing.JButton jButtonVer;
    private javax.swing.JCheckBox jCheckBoxFavorable;
    private ComboBoxEstructuras jComboBoxTipo;
    private javax.swing.JLabel jLabelFecha;
    private javax.swing.JLabel jLabelFichero;
    private javax.swing.JLabel jLabelObservaciones;
    private javax.swing.JLabel jLabelTipo;
    private javax.swing.JList jListInformes;
    private javax.swing.JPanel jPanelBotonera;
    private javax.swing.JPanel jPanelInforme;
    private javax.swing.JPanel jPanelLista;
    private javax.swing.JScrollPane jScrollPaneObservaciones;
    private javax.swing.JScrollPane jScrollPaneInformes;
    private javax.swing.JTextArea jTextAreaObservaciones;
    private JFormattedTextField    jTextFieldFecha;
    private javax.swing.JTextField jTextFieldFichero;
    private javax.swing.JLabel jLabelComentario;
    // End of variables declaration//GEN-END:variables

}

class RendererInformes extends DefaultListCellRenderer
{
    public Component getListCellRendererComponent(JList l,
           Object value, int i, boolean s, boolean f)
    {
            Informe informe = (Informe)value;
            String sTitulo=" ["+(informe.getFecha()==null?"":new SimpleDateFormat("dd-MM-yyyy").format(informe.getFecha()))+"] "+ informe.getFichero()+(informe.getTipo()!=null?" ["+Estructuras.getListaTiposInforme().getDomainNode(informe.getTipo()).getTerm(JPanelInformes.messages.getLocale().toString())+"] ":" ")+(informe.getObservaciones()!=null?"- "+informe.getObservaciones():"");
            JLabel label =(JLabel) super.getListCellRendererComponent(l,sTitulo,i, s, f);
            if (informe.isFavorable())
                label.setIcon(CUtilidadesComponentes.iconoDocumento);
            else
                label.setIcon(CUtilidadesComponentes.iconoDocumentoNegativo);
           return label;
    }
}
