/**
 * JPanelComentariosSinFeature.java
 * � MINETUR, Government of Spain
 * This program is part of LocalGIS
 * This program is free software: you can redistribute it and/or modify it under the terms of the GNU General Public License as published by the Free Software Foundation, either version 2 of the License, or (at your option) any later version.
 * This program is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU General Public License for more details.
 * You should have received a copy of the GNU General Public License along with this program. If not, see <http://www.gnu.org/licenses/>.
 */
package com.geopista.app.document;

import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.BorderFactory;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.geopista.app.AppContext;
import com.geopista.app.UserPreferenceConstants;
import com.geopista.protocol.document.DocumentBean;
import com.geopista.security.GeopistaPermission;
import com.geopista.util.config.UserPreferenceStore;
import com.vividsolutions.jump.util.StringUtil;
import com.vividsolutions.jump.workbench.ui.ErrorDialog;

/**
 * Created by IntelliJ IDEA.
 * User: lara
 * Date: 05-may-2006
 * Time: 11:23:01
 * To change this template use File | Settings | File Templates.
 */

public class JPanelComentariosSinFeature extends JPanel
{
//    private JCheckBox cPublico = new JCheckBox();
	private final static int PUBLICO = 1;
	private final static int OCULTO = 1;
    private JTextArea jAreaComments = new JTextArea();

    private AppContext aplicacion;
    /** Inventario */
//    private JCheckBox cOculto= new JCheckBox();

    private static final Log logger = LogFactory.getLog(JPanelComentariosSinFeature.class);

    /* constructor de la clase */
    public JPanelComentariosSinFeature()
    {
        jbinit(false);
    }

    public JPanelComentariosSinFeature(boolean fromInventario){
        jbinit(fromInventario);
    }

    /* constructor de la clase */
    public void jbinit(boolean b)
    {
        setLayout(new BorderLayout());
        setPreferredSize(new Dimension(150, 150));
        aplicacion = (AppContext) AppContext.getApplicationContext();
        setBorder(BorderFactory.createTitledBorder(aplicacion.getI18nString("document.sinfeature.url")));
        
        jAreaComments.setLineWrap(true);
        jAreaComments.setText("");
        JScrollPane scroll = new JScrollPane();
        scroll.setViewportView(jAreaComments);
        jAreaComments.setEditable(false);

        add(scroll, BorderLayout.CENTER);
        /* A�adimos los componentes al panel */
//        if (b){
//            add(cOculto, BorderLayout.NORTH);
//        }else{
//            add(cPublico, BorderLayout.NORTH);
//        }
    }

    /* m�todo xa cargar los comentarios asociados a un documento, imagen o texto */
    public void load(DocumentBean document)
    {
//        cPublico.setSelected(document==null?false:document.isPublic());
//        cOculto.setSelected(document==null?false:document.isOculto());
        jAreaComments.setText(document==null||document.getServerPath()==null? "":UserPreferenceStore.getUserPreference(UserPreferenceConstants.TOMCAT_URL,"",true)+"/localgis-guiaurbana/"+document.getServerPath());

    }

    /**
     * metodo xa habilitar o deshabilitar la opcion de Publico, dependiendo de los
     * permisos q tengamos
     */
    public void setEnabled(boolean estado)
    {
        /* Comprobamos que tengo permisos para publicar el documentos */
        try
        {
            GeopistaPermission paso = new GeopistaPermission(GeopistaPermission.PUBLICAR_DOCUMENTO_SIN_FEATURE);
            
 //           cPublico.setEnabled(estado&&aplicacion.checkPermission(paso,"General"));
 //           cOculto.setEnabled(estado);
        }
        catch(Exception e)
        {
             logger.error("Error al comprobar los permisos ", e);
            ErrorDialog.show(aplicacion.getMainFrame(), aplicacion.getI18nString("SQLError.Titulo"), aplicacion.getI18nString("SQLError.Aviso"), StringUtil.stackTrace(e));
        }
        jAreaComments.setEditable(false);
    }

    /* salvamos el documento, imagen o texto */
    public DocumentBean save(DocumentBean document)
    {
        if(document == null) return null;
        document.setPublico(PUBLICO);
        document.setOculto(OCULTO);
        document.setComentario(jAreaComments.getText());
        return document;
    }

}
