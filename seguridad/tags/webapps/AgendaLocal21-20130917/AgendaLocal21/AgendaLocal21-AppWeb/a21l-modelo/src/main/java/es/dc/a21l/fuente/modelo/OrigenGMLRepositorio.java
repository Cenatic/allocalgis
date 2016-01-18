/*
 * El presente software ha sido desarrollado por Balidea Consulting & Programming, con control de calidad y previo dise�o por Enxenio S.L., para la Diputaci�n de A Coru�a en el seno del proyecto LOURED (http://loured.es), inclu�do en el Plan AVANZA Local 2009-2011 del Ministerio de Industria, Energ�a y Turismo del Gobierno de Espa�a.  
 * Su distribuci�n se realiza bajo las condiciones establecidas por la licencia European Public License (EUPL), versi�n 1.1 o posteriores (http://http://joinup.ec.europa.eu/software/page/eupl/licence-eupl)
 */
package es.dc.a21l.fuente.modelo;

import es.dc.a21l.base.modelo.RepositorioBase;
import es.dc.a21l.base.modelo.encapsulacionSW.EncapsuladorListSW;
import es.dc.a21l.fuente.cu.AtributoFuenteDatosDto;
import es.dc.a21l.fuente.cu.AtributosMapDto;
import es.dc.a21l.fuente.cu.DescripcionAtributoDto;
import es.dc.a21l.fuente.cu.TablaFuenteDatosDto;

/**
 *
 * @author Balidea Consulting & Programming
 */
public interface OrigenGMLRepositorio extends RepositorioBase<Fuente> {
    public EncapsuladorListSW<TablaFuenteDatosDto> listarTablasFuenteExterna(Fuente fuente, String path);
    public EncapsuladorListSW<AtributoFuenteDatosDto> listarColumnasTablaFuenteExterna(Fuente fuente, String tabla, String path);
    public EncapsuladorListSW<DescripcionAtributoDto> obtenerEsquemaTablaFuenteExterna(Fuente fuente, String tabla, String path);
    public AtributosMapDto obtenerDatosTablaFuenteExterna(Fuente fuente, String tabla, String path, boolean completos);
    public AtributosMapDto obtenerMapaTablaFuenteExterna(Fuente fuente, String tabla, String path);
    public boolean probarFuente(Fuente fuente,String path);
}
