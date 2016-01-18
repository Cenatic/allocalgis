/*
 * El presente software ha sido desarrollado por Balidea Consulting & Programming, con control de calidad y previo dise�o por Enxenio S.L., para la Diputaci�n de A Coru�a en el seno del proyecto LOURED (http://loured.es), inclu�do en el Plan AVANZA Local 2009-2011 del Ministerio de Industria, Energ�a y Turismo del Gobierno de Espa�a.  
 * Su distribuci�n se realiza bajo las condiciones establecidas por la licencia European Public License (EUPL), versi�n 1.1 o posteriores (http://http://joinup.ec.europa.eu/software/page/eupl/licence-eupl)
 */
package es.dc.a21l.elementoJerarquia.cu;

import java.io.IOException;
import java.util.List;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.xpath.XPathExpressionException;

import org.xml.sax.SAXException;

import es.dc.a21l.base.modelo.GestionErrores.EncapsuladorErroresSW;
import es.dc.a21l.base.modelo.encapsulacionSW.EncapsuladorListSW;
import es.dc.a21l.base.modelo.encapsulacionSW.EncapsuladorMapSW;
import es.dc.a21l.fuente.cu.TablaFuenteDatosDto;

public interface GestorCUIndicador {
	
	public EncapsuladorListSW<IndicadorDto> cargaIndicadoresPorCategoria(Long idCategoria);
	public EncapsuladorListSW<IndicadorDto> cargaIndicadoresPorCategoriaPorFuente(Long idCategoria, Long idFuente);
	public EncapsuladorListSW<IndicadorDto> cargaIndicadoresPorCategoriaPendientesDePublico(Long idCategoria);
	public EncapsuladorListSW<IndicadorDto> cargaIndicadoresPorCategoriaPendientesPublicacionWeb(Long idCategoria);
	public EncapsuladorListSW<IndicadorDto> cargaIndicadoresPorCategoriaPublicos(Long idCategoria);
	public EncapsuladorListSW<IndicadorDto> cargaIndicadoresPorCategoriaPublicados(Long idCategoria);
	public EncapsuladorListSW<IndicadorDto> cargaIndicadoresSinCategoria();
	public EncapsuladorListSW<IndicadorDto> cargaIndicadoresSinCategoriaPorFuente(Long idFuente);
	public EncapsuladorListSW<IndicadorDto> cargaIndicadoresSinCategoriaPendientesDePublico();
	public EncapsuladorListSW<IndicadorDto> cargaIndicadoresSinCategoriaPendientesPublicacionWeb();
	public EncapsuladorListSW<IndicadorDto> cargaIndicadoresSinCategoriaPublicos();
	public EncapsuladorListSW<IndicadorDto> cargaIndicadoresSinCategoriaPublicados();
	public IndicadorDto cargaPorId(Long id);
	public IndicadorDto guarda(IndicadorDto indicadorDto,Long idUsuario,EncapsuladorErroresSW errores);
	public EncapsuladorListSW<IndicadorDto> cargaIndicadoresSinCategoriaPublicosOPorPermisoUsuario(Long idUsuario);
	public EncapsuladorListSW<IndicadorDto> cargaIndicadoresConCategoriaPublicosOPorPermisoUsuario(Long idCategoria,Long idUsuario);
	public EncapsuladorListSW<IndicadorDto> cargaIndicadoresConCategoriaNoPublicosPorPermisoUsuario(Long idUsuario,Long idCategoria);
	public EncapsuladorMapSW<String, EncapsuladorMapSW<Long, EncapsuladorListSW<ElementoJerarquiaDto>>> cargaBusquedaDirecta(Long idUsuario,String criterio,String rutaMetadatos) throws XPathExpressionException, ParserConfigurationException, SAXException, IOException;
	public List<IndicadorDto> cargaIndicadorePublicosPorCategoria(Long idCategoria);
	public IndicadorDto borra(Long id, EncapsuladorErroresSW erros);
	public EncapsuladorMapSW<String, EncapsuladorMapSW<Long, EncapsuladorListSW<ElementoJerarquiaDto>>> cargaBusquedaAvanzada(Long idUsuario,IndicadorBusquedaAvanzadaDto criterio,String rutaMetadatos) throws XPathExpressionException, ParserConfigurationException, SAXException, IOException;
	public EncapsuladorMapSW<String, EncapsuladorMapSW<Long, EncapsuladorListSW<ElementoJerarquiaDto>>> cargaTodasCategoriasYIndicadoresPorUsuarioVisualizar(Long idUsuario);
	public EncapsuladorMapSW<String, EncapsuladorMapSW<Long, EncapsuladorListSW<ElementoJerarquiaDto>>> cargaTodasCategoriasYIndicadoresPorUsuarioVisualizarPorFuente(Long idUsuario, Long idFuente);
}
