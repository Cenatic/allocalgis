/*
 * El presente software ha sido desarrollado por Balidea Consulting & Programming, con control de calidad y previo dise�o por Enxenio S.L., para la Diputaci�n de A Coru�a en el seno del proyecto LOURED (http://loured.es), inclu�do en el Plan AVANZA Local 2009-2011 del Ministerio de Industria, Energ�a y Turismo del Gobierno de Espa�a.  
 * Su distribuci�n se realiza bajo las condiciones establecidas por la licencia European Public License (EUPL), versi�n 1.1 o posteriores (http://http://joinup.ec.europa.eu/software/page/eupl/licence-eupl)
 */
package es.dc.a21l.base.cu.impl;

import org.apache.commons.collections15.Transformer;
import org.dozer.Mapper;


public abstract class TransformadorBase<S, D>  implements Transformer<S, D> {

	private Mapper mapper;
	private EstrategiaCreacion<S, D> estrategiaCreacion;

	public TransformadorBase(Mapper mapper) {
		this.mapper = mapper;
	}

  public void setEstrategiaCreacion(EstrategiaCreacion<S, D> estratexiaCreacion) {
	    this.estrategiaCreacion = estratexiaCreacion;
  }

  public D transform(S origen) {
	    if (this.estrategiaCreacion == null) throw new IllegalStateException();
	    if (origen == null) return null;
	    D destino = this.estrategiaCreacion.crea(origen);
	    getMapper().map(origen, destino);
	    aplicaPropiedadesEstendidas(origen, destino);
	    return destino;
	}

	protected abstract void aplicaPropiedadesEstendidas(S origen, D destino);

	public Mapper getMapper() {
		return mapper;
	}
	
}