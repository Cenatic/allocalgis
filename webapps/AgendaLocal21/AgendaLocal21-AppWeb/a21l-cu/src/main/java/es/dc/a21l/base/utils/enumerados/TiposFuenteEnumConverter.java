/*
 * El presente software ha sido desarrollado por Balidea Consulting & Programming, con control de calidad y previo dise�o por Enxenio S.L., para la Diputaci�n de A Coru�a en el seno del proyecto LOURED (http://loured.es), inclu�do en el Plan AVANZA Local 2009-2011 del Ministerio de Industria, Energ�a y Turismo del Gobierno de Espa�a.  
 * Su distribuci�n se realiza bajo las condiciones establecidas por la licencia European Public License (EUPL), versi�n 1.1 o posteriores (http://http://joinup.ec.europa.eu/software/page/eupl/licence-eupl)
 */
package es.dc.a21l.base.utils.enumerados;

import java.beans.PropertyEditorSupport;

public class TiposFuenteEnumConverter extends PropertyEditorSupport {
    @Override 
    public void setAsText(final String text) throws IllegalArgumentException {
        if ( text.equals(TiposFuente.BDESPACIAL.getId()) )
        	setValue(TiposFuente.BDESPACIAL);
        else if ( text.equals(TiposFuente.CSV.getId()) )
        	setValue(TiposFuente.CSV);
        else if ( text.equals(TiposFuente.GML.getId()) )
        	setValue(TiposFuente.GML);
        else if ( text.equals(TiposFuente.ODBC.getId()) )
        	setValue(TiposFuente.ODBC);
        else if ( text.equals(TiposFuente.SHAPEFILE.getId()) )
        	setValue(TiposFuente.SHAPEFILE);
        else if ( text.equals(TiposFuente.WFS.getId()) )
        	setValue(TiposFuente.WFS);  
        else if(text.equals(TiposFuente.MYSQL.getId()))
        	setValue(TiposFuente.MYSQL);
        else if(text.equals(TiposFuente.ORACLE.getId()))
        	setValue(TiposFuente.ORACLE);
    }
}
