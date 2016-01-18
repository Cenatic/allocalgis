/*
 * El presente software ha sido desarrollado por Balidea Consulting & Programming, con control de calidad y previo dise�o por Enxenio S.L., para la Diputaci�n de A Coru�a en el seno del proyecto LOURED (http://loured.es), inclu�do en el Plan AVANZA Local 2009-2011 del Ministerio de Industria, Energ�a y Turismo del Gobierno de Espa�a.  
 * Su distribuci�n se realiza bajo las condiciones establecidas por la licencia European Public License (EUPL), versi�n 1.1 o posteriores (http://http://joinup.ec.europa.eu/software/page/eupl/licence-eupl)
 */
package es.dc.a21l.fuente.cu;

import java.util.LinkedHashMap;
import java.util.Map;

import es.dc.a21l.base.modelo.GestionErrores.EncapsuladorErroresSW;
import es.dc.a21l.base.modelo.encapsulacionSW.EncapsuladorIntegerSW;
import es.dc.a21l.base.modelo.encapsulacionSW.EncapsuladorListSW;
import es.dc.a21l.base.modelo.encapsulacionSW.EncapsuladorStringSW;
import es.dc.a21l.base.utils.enumerados.TiposFuente;

/**
 *
 * @author Balidea Consulting & Programming
 */
public interface GestorCUAtributoFuenteDatos {
	
	public AtributoFuenteDatosDto guarda(AtributoFuenteDatosDto atributoFuenteDatosDto, EncapsuladorErroresSW erros);
	public EncapsuladorListSW<AtributoFuenteDatosDto> cargaTodosPorTabla(Long idTabla);
	public AtributoFuenteDatosDto carga(Long idAtributo);
    public AtributoFuenteDatosDto borra(Long id);
    public EncapsuladorListSW<EncapsuladorStringSW> cargaValores(AtributoFuenteDatosDto atributoFuenteDatosDto,String caracterSeparador, Map<TiposFuente, String> mapaPath);
    public EncapsuladorListSW<EncapsuladorStringSW> cargaValoresEstructura(AtributoFuenteDatosDto atributoFuenteDatosDto, LinkedHashMap<String, AtributosMapDto> mapaTablas);
    public EncapsuladorIntegerSW cargaTamnhoColumna(AtributoFuenteDatosDto atributoFuenteDatosDto,String caracterSeparador, Map<TiposFuente, String> mapaPath);
    public EncapsuladorIntegerSW obtenerTamanhoColumnaEstructura(AtributoFuenteDatosDto atributoFuenteDatosDto, LinkedHashMap<String, AtributosMapDto> mapaTablas);
    public AtributoFuenteDatosDto guardaOCargaPorCadenaExpresion(String expresion,Long idIndicador,EncapsuladorErroresSW errores);
}
