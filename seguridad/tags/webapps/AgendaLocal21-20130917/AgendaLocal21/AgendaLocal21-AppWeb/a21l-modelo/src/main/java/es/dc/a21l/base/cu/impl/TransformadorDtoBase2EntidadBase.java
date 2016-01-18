/*
 * El presente software ha sido desarrollado por Balidea Consulting & Programming, con control de calidad y previo dise�o por Enxenio S.L., para la Diputaci�n de A Coru�a en el seno del proyecto LOURED (http://loured.es), inclu�do en el Plan AVANZA Local 2009-2011 del Ministerio de Industria, Energ�a y Turismo del Gobierno de Espa�a.  
 * Su distribuci�n se realiza bajo las condiciones establecidas por la licencia European Public License (EUPL), versi�n 1.1 o posteriores (http://http://joinup.ec.europa.eu/software/page/eupl/licence-eupl)
 */
package es.dc.a21l.base.cu.impl;

import org.dozer.Mapper;

import es.dc.a21l.base.cu.DtoBase;
import es.dc.a21l.base.modelo.EntidadBase;

public class TransformadorDtoBase2EntidadBase<D extends DtoBase, E extends EntidadBase> extends TransformadorBase<D, E> {
	
	public TransformadorDtoBase2EntidadBase(Mapper mapper) {
		super(mapper);
	}

	protected void aplicaPropiedadesEstendidas(D origen, E destino) {
	}
}
