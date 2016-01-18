/**
 * IAction.java
 * � MINETUR, Government of Spain
 * This program is part of LocalGIS
 * This program is free software: you can redistribute it and/or modify it under the terms of the GNU General Public License as published by the Free Software Foundation, either version 2 of the License, or (at your option) any later version.
 * This program is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU General Public License for more details.
 * You should have received a copy of the GNU General Public License along with this program. If not, see <http://www.gnu.org/licenses/>.
 */
package com.geopista.app.licencias.action;

import com.geopista.protocol.licencias.CExpedienteLicencia;
import com.geopista.protocol.licencias.CSolicitudLicencia;

/**
 * Interfaz que deben implementar todas las Acciones a ejecutar.
 *
 */
public interface IAction {

    /**
     * Ejecuta la acci�n.
     * @param rctx Contexto de ejecuci�n de la regla
     * @param attContext Atributos con informaci�n extra, utilizados dentro de la ejecuci�n de la regla.
     * @return true si la ejecuci�n termina correctamente, false en caso contrario.
     * @throws ActionException
     */
    public boolean execute(String attContext,  CExpedienteLicencia expLic, int tipoLicencia, CSolicitudLicencia solicitud);
    
    /**
     * Obtiene la informaci�n causante de que la ejecuci�n de la acci�n haya 
     * dado resultado negativo.
     * @return Cadena con informaci�n.
     */
    public String getInfo();
    

    /**
     * Obtiene el c�digo de error. Este c�digo es un entero que indentifica al 
     * causante de que la ejecuci�n de la acci�n de resultado negativo.
     * @return C�digo de error.
     */
    public int getErrorCode();
}

