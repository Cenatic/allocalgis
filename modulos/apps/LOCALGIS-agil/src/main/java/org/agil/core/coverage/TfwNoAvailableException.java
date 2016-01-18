/**
 * TfwNoAvailableException.java
 * � MINETUR, Government of Spain
 * This program is part of LocalGIS
 * This program is free software: you can redistribute it and/or modify it under the terms of the GNU General Public License as published by the Free Software Foundation, either version 2 of the License, or (at your option) any later version.
 * This program is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU General Public License for more details.
 * You should have received a copy of the GNU General Public License along with this program. If not, see <http://www.gnu.org/licenses/>.
 */
/*
 * Creado el 26-abr-2004
 *
 * Este codigo se distribuye bajo licencia GPL
 * de GNU. Para obtener una c�pia integra de esta
 * licencia acude a www.gnu.org.
 * 
 * Este software se distribuye "como es". AGIL
 * solo  pretende desarrollar herramientas para
 * la promoci�n del GIS Libre.
 * AGIL no se responsabiliza de las perdidas econ�micas o de 
 * informaci�n derivadas del uso de este software.
 */
package org.agil.core.coverage;

/**
 * Excepcion que se lanza cuando se trata de cargar una im�gen de alguno de los formatos contemplados
 * por JAI (tiff, bmp, jpeg, png, etc) y �sta no tiene asociado el fichero de georreferenciacion
 * TFW.
 * 
 * @author Alvaro Zabala (AGIL)
 *
 */
public class TfwNoAvailableException extends Exception {
	public TfwNoAvailableException(){
		super();
	}
	
	public TfwNoAvailableException(String cause){
		super(cause);
	}
}
