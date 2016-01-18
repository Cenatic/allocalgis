/**
 * BusquedaExportacionMasiva.java
 * � MINETUR, Government of Spain
 * This program is part of LocalGIS
 * This program is free software: you can redistribute it and/or modify it under the terms of the GNU General Public License as published by the Free Software Foundation, either version 2 of the License, or (at your option) any later version.
 * This program is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU General Public License for more details.
 * You should have received a copy of the GNU General Public License along with this program. If not, see <http://www.gnu.org/licenses/>.
 */
package com.geopista.app.catastro.registroExpedientes.busqueda;

import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Date;
import java.util.Hashtable;
import java.util.Iterator;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JPanel;

import com.geopista.app.catastro.gestorcatastral.IMultilingue;
import com.geopista.app.catastro.model.beans.BienInmuebleCatastro;
import com.geopista.app.catastro.model.beans.ConstantesRegExp;
import com.geopista.app.catastro.model.beans.Expediente;
import com.geopista.app.catastro.model.beans.FincaCatastro;
import com.geopista.app.catastro.registroExpedientes.paneles.PanelDatosBusqueda;
import com.geopista.app.catastro.registroExpedientes.paneles.TablaBusquedaExportacionMasiva;
import com.geopista.app.catastro.registroExpedientes.utils.UtilRegistroExp;
import com.geopista.app.catastro.utils.ConstantesCatastro;
import com.vividsolutions.jump.I18N;


/**
 * Created by IntelliJ IDEA.
 * User: jcarrillo
 * Date: 22-ene-2007
 * Time: 12:12:40
 * To change this template use File | Settings | File Templates.
 */

/**
 * Clase que extiende de JInternalFrame y crea una pantalla que muestra todos los expedientes no cerrados del usuario.
 * Si el usuario tiene permiso de administrador la busqueda muestra todos los expedientes no cerrados.
 * La clase se encarga de cargar los paneles y los dialogos necesario para funcionar.
 * */

public class BusquedaExportacionMasiva extends JInternalFrame implements IMultilingue
{
    private JFrame desktop;
    private ArrayList expedientes;
    private ArrayList expedienteFiltrados;
    private JPanel buscarTodoPanel;
    private JButton buscarJButton;
	private JButton exportarJButton;
	private JButton exportarTodoJButton;
    private JButton cancelarJButton;
    private PanelDatosBusqueda datosBusquedaPanel;
    private TablaBusquedaExportacionMasiva tablaBusqueda;
    private Hashtable usuarios;
    private ArrayList codigoEntGeneradora;
    private ArrayList codigoEstados;
    


    /**
     * Constructor de la clase. Inicializa todos los paneles de la pantalla y asocia los eventos para ser tratados.
     * Se le pasa por parametro un JFrame y la lista de expedientes a mostrar.
     *
     * @param desktop  JFrame
     * @param exp    lista de expedientes
     */
    public BusquedaExportacionMasiva(final JFrame desktop, ArrayList exp)
    {
        this.desktop= desktop;
        this.expedientes= exp;
        this.expedienteFiltrados= exp;
        this.setCursor(Cursor.getPredefinedCursor(Cursor.WAIT_CURSOR));
        UtilRegistroExp.menuBarSetEnabled(false, this.desktop);
        inicializaElementos();
        addInternalFrameListener(new javax.swing.event.InternalFrameListener()
        {
            public void internalFrameOpened(javax.swing.event.InternalFrameEvent evt)
            {
            }
            public void internalFrameClosing(javax.swing.event.InternalFrameEvent evt)
            {
            }
            public void internalFrameClosed(javax.swing.event.InternalFrameEvent evt)
            {
                cierraInternalFrame();
            }
            public void internalFrameIconified(javax.swing.event.InternalFrameEvent evt)
            {
            }
            public void internalFrameDeiconified(javax.swing.event.InternalFrameEvent evt)
            {
            }
            public void internalFrameActivated(javax.swing.event.InternalFrameEvent evt)
            {
            }
            public void internalFrameDeactivated(javax.swing.event.InternalFrameEvent evt)
            {
            }
        });
        this.setTitle(I18N.get("RegistroExpedientes",
                        "Catastro.RegistroExpedientes.ExportacionMasiva.tituloBusqueda"));
        setClosable(true);
        this.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
    }

   /**
    * Inicializa los elementos del panel.
    */
    private void inicializaElementos()
    {
        buscarTodoPanel= new JPanel();
        buscarTodoPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        buscarJButton= new JButton(I18N.get("RegistroExpedientes",
                        "Catastro.RegistroExpedientes.ExportacionMasiva.buscarJButton"));

        buscarJButton.addActionListener(new ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                buscarJButtonActionPerformed();
            }
        });

        exportarJButton = new JButton(I18N.get("RegistroExpedientes",
                        "Catastro.RegistroExpedientes.ExportacionMasiva.exportarJButton"));
        exportarTodoJButton = new JButton(I18N.get("RegistroExpedientes",
        				"Catastro.RegistroExpedientes.ExportacionMasiva.exportarTodoJButton"));
        
              
        cancelarJButton = new JButton(I18N.get("RegistroExpedientes",
                        "Catastro.RegistroExpedientes.ExportacionMasiva.cancelarJButton"));
        cancelarJButton.addActionListener(new ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                cierraInternalFrame();
            }
        });
        recopilaDatosBD();
        inicializaPanelBuscar();
        inicializaTablaBuscar();

        buscarTodoPanel.add(buscarJButton,new org.netbeans.lib.awtextra.AbsoluteConstraints(285, 335, 120, 30));
        buscarTodoPanel.add(exportarTodoJButton,new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 580, 110, 30));
        buscarTodoPanel.add(exportarJButton,new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 580, 80, 30));
        buscarTodoPanel.add(cancelarJButton,new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 580, 80, 30));
        
        buscarTodoPanel.setPreferredSize(new Dimension(700,660));
        getContentPane().add(buscarTodoPanel);
        setSize(new Dimension(700,660));
        this.setMaximizable(false);
        int w=(this.desktop.getWidth()/2)- (this.getWidth()/2);
        int d= (this.desktop.getHeight()/2) - (this.getHeight()/2)-30;
        this.setLocation(w,d);
        this.setMaximumSize(new Dimension(650,660));
        
    }

   /**
    * Inicializa el panel de datos donde se puede introducir datos para filtrar el resultado.
    */
    private void inicializaPanelBuscar()
    {
        datosBusquedaPanel = new PanelDatosBusqueda("Catastro.RegistroExpedientes.ExportacionMasiva.datosBusquedaPanel",
                usuarios, codigoEntGeneradora, codigoEstados);
        datosBusquedaPanel.setDesktop(desktop);
        buscarTodoPanel.add(datosBusquedaPanel.getPanel(), new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 15, 660, 310));
    }

   /**
    * Inicializa la tabla donde se muestran los expedientes.
    */
    private void inicializaTablaBuscar()
    {
        tablaBusqueda= new TablaBusquedaExportacionMasiva("Catastro.RegistroExpedientes.ExportacionMasiva.tablaBusqueda", this.expedientes, this.usuarios);
        buscarTodoPanel.add(tablaBusqueda.getPanel(), new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 370, 660, 200));
    }

   /**
    * Devuelve el boton exportar.
    *
    * @return JButton aceptarJButton
    */
    public JButton getExportarJButton()
    {
        return exportarJButton;
    }
    
    /**
     * Devuelve el boton exportar todo.
     *
     * @return JButton aceptarJButton
     */
     public JButton getExportarTodoJButton()
     {
         return exportarTodoJButton;
     }
    
    /**
     * Devuelve el boton buscar.
     *
     * @return JButton buscarJButton
     */
    public JButton getBuscarJButton() {
		return buscarJButton;
	}
   
    /**
     * Cierra la ventana y habilita el menu de la aplicacion.
     */
    public void cierraInternalFrame()
    {
        try
        {
            this.setClosed(true);
            if (expedientes!=null){
                expedientes.clear();
                expedientes=null;
            }
            if (expedienteFiltrados!=null){
                expedienteFiltrados.clear();
                expedienteFiltrados=null;
            }
            if (buscarTodoPanel!=null){
                getContentPane().remove(buscarTodoPanel);
                buscarTodoPanel.removeAll();
                buscarTodoPanel=null;
            }
        }
        catch(Exception e){e.printStackTrace();}
        UtilRegistroExp.menuBarSetEnabled(true, this.desktop);
    }    

    /**
     * Renombra los elementos de la gui con el resourceBundle que se este utilizando.
     */
    public void renombrarComponentes()
    {
        this.setTitle(I18N.get("RegistroExpedientes",
                        "Catastro.RegistroExpedientes.ExportacionMasiva.tituloBusqueda"));
        buscarJButton.setText(I18N.get("RegistroExpedientes",
                        "Catastro.RegistroExpedientes.ExportacionMasiva.buscarJButton"));
        exportarJButton.setText(I18N.get("RegistroExpedientes",
                        "Catastro.RegistroExpedientes.ExportacionMasiva.exportarJButton"));
        exportarTodoJButton.setText(I18N.get("RegistroExpedientes",
        				"Catastro.RegistroExpedientes.ExportacionMasiva.exportarTodoJButton"));
        cancelarJButton.setText(I18N.get("RegistroExpedientes",
                        "Catastro.RegistroExpedientes.ExportacionMasiva.cancelarJButton"));
        datosBusquedaPanel.renombrarComponentes();
        tablaBusqueda.renombrarComponentes();
        tablaBusqueda.cargaDatosTabla(this.expedientes,this.usuarios);
    }

    /**
     * Metodo que recopila datos de la base de datos para que luego se puedan mostrar en el panel y el usuario pueda
     * seleccionar entre ellos para hacer el filtrado.
     */
    private void recopilaDatosBD()
    {
        try
        {
            usuarios = ConstantesRegExp.clienteCatastro.getUsuariosConExpediente();
            codigoEntGeneradora = ConstantesRegExp.clienteCatastro.getCodigoEntidadGeneradora();
            ArrayList codigoEstadosAux = ConstantesRegExp.clienteCatastro.getCodigoEstados();
            codigoEstados = new ArrayList();
            
           //solo interesan los estados Finalizado y Modificado para que se muestren en el combo
            //de busqueda
           for (int i=0; i<codigoEstadosAux.size();i++){
        	   Integer codigoEstadoInteger = new Integer((String)codigoEstadosAux.get(i));
        	   if(codigoEstadoInteger.intValue() ==  ConstantesCatastro.ESTADO_FINALIZADO ||
        			   codigoEstadoInteger.intValue() == ConstantesCatastro.ESTADO_MODIFICADO  ){
        		   codigoEstados.add(codigoEstadosAux.get(i));
        	   }
           }  
            
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }

    /**
     * Metodo que filtra los expedientes que se estran mostrando con los parametros de busqueda que el usuario ha
     * introducido.
     */
    private void buscarJButtonActionPerformed()
    {
        Hashtable hashDatos = new Hashtable();
        if(datosBusquedaPanel.recopilaDatosPanel(hashDatos))
        {
            String numeroExpediente = (String)hashDatos.get(ConstantesCatastro.expedienteNumeroExpediente);
            String tipoExpediente = (String)hashDatos.get(ConstantesCatastro.expedienteTipoExpediente);
            String idEstado = (String)hashDatos.get(ConstantesCatastro.expedienteIdEstado);
            String idTecnicoCatastro = (String)hashDatos.get(ConstantesCatastro.expedienteIdTecnicoCatastro);
            Date fechaRegistroInicial = UtilRegistroExp.getDate((String)hashDatos.get(ConstantesCatastro.expedienteFechaRegistro + "Inicial"));
            Date fechaRegistroFinal = UtilRegistroExp.getDate((String)hashDatos.get(ConstantesCatastro.expedienteFechaRegistro + "Final"));
            String annoExpedienteAdminOrigenAlt_Ejercicio = (String)hashDatos.get(ConstantesCatastro.expedienteAnnoExpedienteAdminOrigenAlteracion);
            String codigoEntidadGeneradora_Control = (String)hashDatos.get(ConstantesCatastro.entidadGeneradoraCodigo);
            String referenciaCatastral = (String)hashDatos.get(ConstantesCatastro.expedienteReferenciasCatastrales);
            String nifPresentador = (String)hashDatos.get(ConstantesCatastro.expedienteNifPresentador);
            String nombreCompletoPresentador = (String)hashDatos.get(ConstantesCatastro.expedienteNombreCompletoPresentador);
            ArrayList expAux = new ArrayList();
            expAux.addAll(expedientes);
            String ultimoEstado = (String)codigoEstados.get(codigoEstados.size()-1);
            if(idEstado!=null && idEstado.equalsIgnoreCase(ultimoEstado))
            {
                expAux.removeAll(expedientes);
                try
                {
                    expAux= (ArrayList)ConstantesRegExp.clienteCatastro.getExpedientesUsuario("true", ConstantesCatastro.tipoConvenio,ConstantesCatastro.modoTrabajo);
                }
                catch(Exception e)
                {
                    e.printStackTrace();
                }
            }
            boolean siguiente;
            for(int i= 0; i<expAux.size();i++)
            {
                siguiente = true;
                Expediente exp= (Expediente)expAux.get(i);
                if(siguiente&&((numeroExpediente!=null)&&(!numeroExpediente.equals("")))&&(exp.getNumeroExpediente()!=null&&
                        !(exp.getNumeroExpediente().indexOf(numeroExpediente)>=0))|| exp.getNumeroExpediente()==null)
                {
                    expAux.remove(i);
                    siguiente= false;
                    i--;
                }
                if((siguiente&&(tipoExpediente!=null)&&(!tipoExpediente.equals("")))&&(exp.getTipoExpediente()!=null&&
                        !exp.getTipoExpediente().getCodigoTipoExpediente().equalsIgnoreCase(tipoExpediente))||exp.getTipoExpediente()==null)
                {
                    expAux.remove(i);
                    siguiente= false;
                    i--;
                }
                if((siguiente&&(idEstado!=null)&&(!idEstado.equals("")))&&(exp.getIdEstado()>0&&
                        exp.getIdEstado()!=Long.parseLong(idEstado))|| exp.getIdEstado()<=0)
                {
                    expAux.remove(i);
                    siguiente= false;
                    i--;
                }
                if((siguiente&&(idTecnicoCatastro!=null)&&(!idTecnicoCatastro.equals("")))&&(usuarios.get(String.valueOf(exp.getIdTecnicoCatastro()))!=null
                        &&!((String)usuarios.get(String.valueOf(exp.getIdTecnicoCatastro()))).equalsIgnoreCase(idTecnicoCatastro)
                        ||usuarios.get(String.valueOf(exp.getIdTecnicoCatastro()))==null))
                {
                    expAux.remove(i);
                    siguiente= false;
                    i--;
                }
                if((siguiente&& checkeRangoFechar(fechaRegistroInicial,fechaRegistroFinal,exp)))
                {
                    expAux.remove(i);
                    siguiente= false;
                    i--;
                }
                if((siguiente&&(annoExpedienteAdminOrigenAlt_Ejercicio!=null)&&(!annoExpedienteAdminOrigenAlt_Ejercicio.equals("")))
                        &&(exp.getAnnoExpedienteAdminOrigenAlteracion()>0&&exp.getAnnoExpedienteAdminOrigenAlteracion()!=Integer.parseInt(annoExpedienteAdminOrigenAlt_Ejercicio))
                        || exp.getAnnoExpedienteAdminOrigenAlteracion()<=0)
                {
                    expAux.remove(i);
                    siguiente= false;
                    i--;
                }
                if((siguiente&&(codigoEntidadGeneradora_Control!=null)&&(!codigoEntidadGeneradora_Control.equals("")))
                        &&(exp.getEntidadGeneradora().getCodigo()>0&&exp.getEntidadGeneradora().getCodigo()!=Integer.parseInt(codigoEntidadGeneradora_Control))
                        ||exp.getEntidadGeneradora().getCodigo()<=0)
                {
                    expAux.remove(i);
                    siguiente= false;
                    i--;
                }
                if((siguiente&&(referenciaCatastral!=null)&&(!referenciaCatastral.equals("")))
                        &&((exp.getListaReferencias().size()>0)&&
                        !checkeaContainsRefCatas(exp.getListaReferencias(),referenciaCatastral)
                        ||(exp.getListaReferencias().size()==0)))
                {
                    expAux.remove(i);
                    siguiente= false;
                    i--;
                }
                if((siguiente&&(nifPresentador!=null)&&(!nifPresentador.equals("")))&&(exp.getNifPresentador()!=null&&
                        !(exp.getNifPresentador().indexOf(nifPresentador)>=0)
                        ||exp.getNifPresentador()==null))
                {
                    expAux.remove(i);
                    siguiente= false;
                    i--;                    
                }
                if((siguiente&&(nombreCompletoPresentador!=null)&&(!nombreCompletoPresentador.equals("")))&&(exp.getNombreCompletoPresentador()!=null&&
                        exp.getNombreCompletoPresentador().indexOf(nombreCompletoPresentador)<0
                        ||exp.getNombreCompletoPresentador()==null))
                {
                    expAux.remove(i);
                    siguiente= false;
                    i--;
                }
            }
            expedienteFiltrados= expAux;
            tablaBusqueda.cargaDatosTabla(expAux, usuarios);
        }
    }

    /**
     * Metodos que checkea si las referencias del expediente que se esta filtrando contienen el patro que el usuario
     * ha introducido.
     *
     * @param refCatas ArrayList referencias del expediente
     * @param patron String patron del usuario
     * @return boolean
     */
    private boolean checkeaContainsRefCatas(ArrayList refCatas, String patron)
    {
        boolean encontrado= false;
        int i= 0;
        while(!encontrado && i< refCatas.size())
        {
            if(refCatas.get(i) instanceof FincaCatastro)
            {
                encontrado = (((FincaCatastro)refCatas.get(i)).getRefFinca().getRefCatastral().indexOf(patron)>=0);
            }
            else if(refCatas.get(i) instanceof BienInmuebleCatastro)
            {
                encontrado = (((BienInmuebleCatastro)refCatas.get(i)).getIdBienInmueble().getIdBienInmueble().indexOf(patron)>=0);
            }
            i++;
        }
        return encontrado;
    }

    /**
     * Metodo que checkea si la fecha de registro del expediente se encuentra en el rango que ha introducido el usuario.
     *
     * @param fechaRegistroInicial Date
     * @param fechaRegistroFinal Date
     * @param exp Expediente
     * @return boolean
     */
    private boolean checkeRangoFechar(Date fechaRegistroInicial, Date fechaRegistroFinal, Expediente exp)
    {
        boolean valida= true;
        if(((fechaRegistroInicial!=null)&&(fechaRegistroFinal!=null))&&(exp.getFechaRegistro()!=null&&
                        (fechaRegistroInicial.getTime()<=exp.getFechaRegistro().getTime()&&
                        fechaRegistroFinal.getTime()>=exp.getFechaRegistro().getTime())))
        {
            valida = false;
        }
        else if(((fechaRegistroInicial!=null)&&(fechaRegistroFinal==null))&&(exp.getFechaRegistro()!=null&&
                        fechaRegistroInicial.getTime()<=exp.getFechaRegistro().getTime()))
        {
            valida = false;
        }
        else if(((fechaRegistroInicial==null)&&(fechaRegistroFinal!=null))&&(exp.getFechaRegistro()!=null&&
                        fechaRegistroFinal.getTime()>=exp.getFechaRegistro().getTime()))
        {
            valida= false;
        }
        else if((fechaRegistroInicial==null)&&(fechaRegistroFinal==null))
        {
            valida = false;
        }
        return valida;
    }

    /**
     * Metodo que devuelve el expediente seleccionado por el usuario.
     *
     * @return Expediente
     */
    public ArrayList getExpedienteSeleccionado()
    {
    	ArrayList listaEspedientes = new ArrayList();
    	try{
	        ArrayList listaIdsExp = tablaBusqueda.getExpedienteSeleccionado();
	        for(int indiceExp=0; indiceExp<listaIdsExp.size(); indiceExp++){
	        	
	        	 for(Iterator it = expedienteFiltrados.iterator(); it.hasNext();){
	                 Expediente exp = (Expediente) it.next();
	                 if(exp.getNumeroExpediente().equals(listaIdsExp.get(indiceExp))){
	                	 listaEspedientes.add(exp);
	                 }
	                     
	             }
	        	 
	        }
	        return listaEspedientes;
        
    	}
    	catch (IndexOutOfBoundsException e) {
			// TODO: handle exception
    		e.printStackTrace();
    		return null;
		}
    }
    
    /**
     * Metodo que devuelve el expediente seleccionado por el usuario.
     *
     * @return Expediente
     */
    public ArrayList getTodosExpedientes()
    {
    	return tablaBusqueda.getLstExp();
    	
    }
}
