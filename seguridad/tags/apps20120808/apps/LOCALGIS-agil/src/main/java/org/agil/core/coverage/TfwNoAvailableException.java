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
