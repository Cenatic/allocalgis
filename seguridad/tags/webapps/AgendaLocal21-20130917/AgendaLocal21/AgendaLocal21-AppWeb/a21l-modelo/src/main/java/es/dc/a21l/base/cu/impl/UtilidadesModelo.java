/*
 * El presente software ha sido desarrollado por Balidea Consulting & Programming, con control de calidad y previo dise�o por Enxenio S.L., para la Diputaci�n de A Coru�a en el seno del proyecto LOURED (http://loured.es), inclu�do en el Plan AVANZA Local 2009-2011 del Ministerio de Industria, Energ�a y Turismo del Gobierno de Espa�a.  
 * Su distribuci�n se realiza bajo las condiciones establecidas por la licencia European Public License (EUPL), versi�n 1.1 o posteriores (http://http://joinup.ec.europa.eu/software/page/eupl/licence-eupl)
 */
package es.dc.a21l.base.cu.impl;

public class UtilidadesModelo {
	
	public static short convertBooleanToShort(boolean value)
	  {
	    return (short)(value == true ? 1 : 0);
	  }

	public static boolean convertShortToBoolean(short value) throws IllegalArgumentException {
	    if ((value != 0) && (value != 1)) {
	      throw new IllegalArgumentException("El varlor debe ser 0 o 1");
	    }
	    return value == 1;
	  }
}
