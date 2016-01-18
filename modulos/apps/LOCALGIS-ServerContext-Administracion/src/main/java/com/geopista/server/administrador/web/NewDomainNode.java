/**
 * NewDomainNode.java
 * � MINETUR, Government of Spain
 * This program is part of LocalGIS
 * This program is free software: you can redistribute it and/or modify it under the terms of the GNU General Public License as published by the Free Software Foundation, either version 2 of the License, or (at your option) any later version.
 * This program is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU General Public License for more details.
 * You should have received a copy of the GNU General Public License along with this program. If not, see <http://www.gnu.org/licenses/>.
 */
package com.geopista.server.administrador.web;

import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.StringReader;
import java.io.Writer;
import java.util.Enumeration;
import java.util.Vector;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.exolab.castor.xml.Marshaller;
import org.exolab.castor.xml.Unmarshaller;

import com.geopista.protocol.CResultadoOperacion;
import com.geopista.protocol.administrador.dominios.DomainNode;
import com.geopista.protocol.net.EnviarSeguro;
import com.geopista.server.LoggerHttpServlet;
import com.geopista.server.administrador.ReloadDomains;
import com.geopista.server.database.COperacionesAdministrador;


/**
 * Created by IntelliJ IDEA.
 * User: angeles
 * Date: 09-jun-2004
 * Time: 17:58:08
 */
public class NewDomainNode  extends LoggerHttpServlet
 {
      
	   private static final long serialVersionUID = 7247110159859908608L;
	   private org.apache.log4j.Logger logger = org.apache.log4j.Logger.getLogger(UpdateRol.class);
       public void doPost (HttpServletRequest request, HttpServletResponse response)
                throws ServletException, IOException
       {
    	       super.doPost(request);	
               CResultadoOperacion resultado=null;
               try
               {
                     DomainNode domainNode=(DomainNode)Unmarshaller.unmarshal(DomainNode.class,new StringReader(request.getParameter(EnviarSeguro.mensajeXML)));
                     Marshaller.marshal(domainNode,new OutputStreamWriter(System.out));
                     resultado=COperacionesAdministrador.ejecutarNewDomainNode(domainNode);
                     if (resultado.getResultado())
                     {
                        if (domainNode.getlHijos().gethDom().size()>0)
                        {
                          for(Enumeration e=domainNode.getlHijos().gethDom().elements();e.hasMoreElements();)
                          {
                              DomainNode auxNode= (DomainNode)e.nextElement();
                              //Introducido para el proceso de importacion.
                              auxNode.setIdDomain(domainNode.getIdDomain());
                              auxNode.setIdParent(resultado.getDescripcion());
                              COperacionesAdministrador.ejecutarNewDomainNode(auxNode);

                          }
                        }
                        Vector vResultados = new Vector();
                        vResultados.add(domainNode);
                        resultado.setVector(vResultados);
                        try {new ReloadDomains();}catch(Exception e){}
                     }

               }catch(Exception e)
               {

                   java.io.StringWriter sw=new java.io.StringWriter();
                   java.io.PrintWriter pw=new java.io.PrintWriter(sw);
                    e.printStackTrace(pw);
                    logger.error("Excepci�n al crear el nuevo domminio:"+sw.toString());
                   resultado= new CResultadoOperacion(false, "Excepci�n al crear el nuevo domminio:"+e.toString());
               }
                Writer writer = response.getWriter();
                writer.write (resultado.buildResponse());
                writer.flush();
                writer.close();
              }
}
