/*
 * El presente software ha sido desarrollado por Balidea Consulting & Programming, con control de calidad y previo dise�o por Enxenio S.L., para la Diputaci�n de A Coru�a en el seno del proyecto LOURED (http://loured.es), inclu�do en el Plan AVANZA Local 2009-2011 del Ministerio de Industria, Energ�a y Turismo del Gobierno de Espa�a.  
 * Su distribuci�n se realiza bajo las condiciones establecidas por la licencia European Public License (EUPL), versi�n 1.1 o posteriores (http://http://joinup.ec.europa.eu/software/page/eupl/licence-eupl)
 */
package es.dc.a21l.elementoJerarquia.modelo.impl;

import java.util.List;

import es.dc.a21l.base.modelo.impl.RepositorioBaseImpl;
import es.dc.a21l.elementoJerarquia.modelo.IndicadorUsuario;
import es.dc.a21l.elementoJerarquia.modelo.IndicadorUsuarioModificacion;
import es.dc.a21l.elementoJerarquia.modelo.IndicadorUsuarioModificacionRepositorio;
import es.dc.a21l.elementoJerarquia.modelo.IndicadorUsuarioRepositorio;
import es.dc.a21l.elementoJerarquia.modelo.Relacion;

public class IndicadorUsuarioModificacionRepositorioImpl extends RepositorioBaseImpl<IndicadorUsuarioModificacion> implements IndicadorUsuarioModificacionRepositorio {
	private static final String DELETE_POR_INDICADOR="delete from IndicadorUsuarioModificacion ie where ie.indicador.id = :idIndicador";
	private static final String SELECT_POR_INDICADOR="select ie from IndicadorUsuarioModificacion ie where ie.indicador.id = :idIndicador";
	
	public void borraPorIdIndicador(Long idIndicador) {
		getEntityManager().createQuery(DELETE_POR_INDICADOR).setParameter("idIndicador", idIndicador).executeUpdate();
	}
	public List<IndicadorUsuarioModificacion> cargaPorIdIndicador(Long idIndicador) {
		return getEntityManager().createQuery(SELECT_POR_INDICADOR).setParameter("idIndicador", idIndicador).getResultList();
	}
}
