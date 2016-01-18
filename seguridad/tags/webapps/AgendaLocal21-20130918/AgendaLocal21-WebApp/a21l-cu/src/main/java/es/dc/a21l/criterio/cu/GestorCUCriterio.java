/*
 * El presente software ha sido desarrollado por Balidea Consulting & Programming, con control de calidad y previo dise�o por Enxenio S.L., para la Diputaci�n de A Coru�a en el seno del proyecto LOURED (http://loured.es), inclu�do en el Plan AVANZA Local 2009-2011 del Ministerio de Industria, Energ�a y Turismo del Gobierno de Espa�a.  
 * Su distribuci�n se realiza bajo las condiciones establecidas por la licencia European Public License (EUPL), versi�n 1.1 o posteriores (http://http://joinup.ec.europa.eu/software/page/eupl/licence-eupl)
 */
package es.dc.a21l.criterio.cu;

import java.util.List;
import java.util.Set;

import es.dc.a21l.base.modelo.GestionErrores.EncapsuladorErroresSW;
import es.dc.a21l.base.modelo.encapsulacionSW.EncapsuladorListSW;
import es.dc.a21l.base.modelo.encapsulacionSW.EncapsuladorStringSW;
import es.dc.a21l.base.utils.enumerados.TipoAtributoFD;

public interface GestorCUCriterio {
	
	public CriterioDto cargaPorId(Long id);
	public CriterioDto guarda(CriterioDto criterioDto,EncapsuladorErroresSW errores);
	public CriterioDto guardaNuevoCriterio(Long idAtributo, String cadenaCriterio,String tipoColumna,EncapsuladorErroresSW errores, String caracterSeparadorDecimales);
	public void borraPorIdIndicador(Long id);
	public EncapsuladorListSW<CriterioDto> cargarPorIdIndicador(Long idIndicador);
	public CriterioDto borra(Long id);
	public Set<Integer> cargaPosicionesNoValidas(CriterioDto criterioDto,List<String> columna);
	public Boolean cargaEvaluacionCriterio(CriterioDto criterioDto, Double valor) throws Exception;
	public Set<Integer> cargaPosicionesNoValidasESW(CriterioDto criterioDto,List<EncapsuladorStringSW> columna,TipoAtributoFD tipoAtributo);
	public CriterioDto cargaPorAtributo(Long idAtributo);
}
