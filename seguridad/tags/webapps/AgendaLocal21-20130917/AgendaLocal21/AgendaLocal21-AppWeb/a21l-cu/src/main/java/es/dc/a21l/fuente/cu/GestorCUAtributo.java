/*
 * El presente software ha sido desarrollado por Balidea Consulting & Programming, con control de calidad y previo dise�o por Enxenio S.L., para la Diputaci�n de A Coru�a en el seno del proyecto LOURED (http://loured.es), inclu�do en el Plan AVANZA Local 2009-2011 del Ministerio de Industria, Energ�a y Turismo del Gobierno de Espa�a.  
 * Su distribuci�n se realiza bajo las condiciones establecidas por la licencia European Public License (EUPL), versi�n 1.1 o posteriores (http://http://joinup.ec.europa.eu/software/page/eupl/licence-eupl)
 */
package es.dc.a21l.fuente.cu;

import java.util.Map;

import es.dc.a21l.base.modelo.GestionErrores.EncapsuladorErroresSW;
import es.dc.a21l.base.modelo.encapsulacionSW.EncapsuladorListSW;
import es.dc.a21l.base.utils.enumerados.TiposFuente;

/**
 *
 * @author Balidea Consulting & Programming
 */
public interface GestorCUAtributo {
	
	public AtributoDto guarda(AtributoDto atributoDto, EncapsuladorErroresSW erros,String sistemaCoordenadas);
	public AtributoDto cargaPorAtributoFuenteDatos(Long idAtributoFuenteDatos);
	public AtributoDto carga(Long idAtributo);
	public EncapsuladorListSW<AtributoDto> cargaPorIndicador(Long idIndicador);
    public AtributoDto borra(Long id, EncapsuladorErroresSW erros);
    public void borraPorIdIndicador(Long id);
    public AtributosMapDto cargarDatosIndicador(EncapsuladorListSW<AtributoDto> listaAtributos, String caracterSeparador, String tipoFecha, Map<TiposFuente, String> mapaPath);
    public AtributosMapDto cargarDatosMapaIndicador(EncapsuladorListSW<AtributoDto> listaAtributos, String caracterSeparador, Map<TiposFuente, String> mapaPath);
    public AtributosMapDto cargarMapaIndicador(EncapsuladorListSW<AtributoDto> listaAtributos, String caracterSeparador);
    public AtributosMapDto cargarDatosIndicadorTodasColumnas(EncapsuladorListSW<AtributoDto> listaAtributos, String caracterSeparador, String tipoFecha, Map<TiposFuente, String> mapaPath);
}
