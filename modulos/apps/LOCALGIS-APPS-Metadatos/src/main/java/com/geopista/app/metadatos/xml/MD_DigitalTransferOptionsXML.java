/**
 * MD_DigitalTransferOptionsXML.java
 * � MINETUR, Government of Spain
 * This program is part of LocalGIS
 * This program is free software: you can redistribute it and/or modify it under the terms of the GNU General Public License as published by the Free Software Foundation, either version 2 of the License, or (at your option) any later version.
 * This program is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU General Public License for more details.
 * You should have received a copy of the GNU General Public License along with this program. If not, see <http://www.gnu.org/licenses/>.
 */
package com.geopista.app.metadatos.xml;

import org.w3c.dom.Element;

import com.geopista.protocol.metadatos.CI_OnLineResource;


/**
 * Created by IntelliJ IDEA.
 * User: angeles
 * Date: 07-sep-2004
 * Time: 16:00:55
 */
public class MD_DigitalTransferOptionsXML implements IXMLElemento{
            CI_OnLineResource recurso;
            private String language=null;
            public MD_DigitalTransferOptionsXML()
           {

           }

           public MD_DigitalTransferOptionsXML(CI_OnLineResource recurso) {
                this.recurso = recurso;
            }
            public MD_DigitalTransferOptionsXML(CI_OnLineResource recurso, String language) {
                    this.recurso = recurso;
                 this.language=language;
             }


           public String getTag()
           {
               return MD_DIGTRANSOPT;
           }

            public static Object load(Element nodoPadre)
           {
               Element esteNodo = XMLTranslator_LCGIII.recuperarHijo(nodoPadre,MD_DIGTRANSOPT );
               if(esteNodo == null) return null;
               Element onlinoptex = XMLTranslator_LCGIII.recuperarHijo(esteNodo, ONLINOPT);
               if (onlinoptex == null) return null;
               return CI_OnLineResourceXML.load(onlinoptex);
          }

          public void save(XMLTranslator traductor) throws Exception {
               traductor.save(new CI_OnLineResourceXML(recurso,language),ONLINOPT);
           }

       public static final String MD_DIGTRANSOPT = "MD_DigitalTransferOptions";
       public static final String ONLINOPT = "onLine";

}
