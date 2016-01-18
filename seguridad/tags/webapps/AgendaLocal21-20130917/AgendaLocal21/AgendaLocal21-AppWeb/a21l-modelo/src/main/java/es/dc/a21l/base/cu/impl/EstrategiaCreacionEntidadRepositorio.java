/*
 * El presente software ha sido desarrollado por Balidea Consulting & Programming, con control de calidad y previo dise�o por Enxenio S.L., para la Diputaci�n de A Coru�a en el seno del proyecto LOURED (http://loured.es), inclu�do en el Plan AVANZA Local 2009-2011 del Ministerio de Industria, Energ�a y Turismo del Gobierno de Espa�a.  
 * Su distribuci�n se realiza bajo las condiciones establecidas por la licencia European Public License (EUPL), versi�n 1.1 o posteriores (http://http://joinup.ec.europa.eu/software/page/eupl/licence-eupl)
 */
package es.dc.a21l.base.cu.impl;

import es.dc.a21l.base.cu.DtoBase;
import es.dc.a21l.base.modelo.EntidadBase;
import es.dc.a21l.base.modelo.RepositorioBase;

public class EstrategiaCreacionEntidadRepositorio<S extends DtoBase, D extends EntidadBase>	extends EstrategiaCreacionEntidade<S, D> {

	private RepositorioBase<D> repositorio;
	private Object obxectoBuscaPrototipo;
	private Class<D> claseBuscaPrototipo = null;

	public EstrategiaCreacionEntidadRepositorio(RepositorioBase<D> repositorio,	Object obxectoBuscaPrototipo) {
		this.repositorio = repositorio;
		this.obxectoBuscaPrototipo = obxectoBuscaPrototipo;
	}

	public EstrategiaCreacionEntidadRepositorio(RepositorioBase<D> repositorio,	Class<D> claseBuscaPrototipo) {
		this.repositorio = repositorio;
		this.claseBuscaPrototipo = claseBuscaPrototipo;
	}

	public D cargaEntidade(S s) {
		return this.repositorio.carga(s.getId());
	}

	public D creaEntidade(S s) {
		if (this.claseBuscaPrototipo != null) {
			return  new EstrategiaCreacionNuevo<S,D>(this.claseBuscaPrototipo).crea(s);
		} else {
			return new EstrategiaCreacionNuevo<S,D>(this.obxectoBuscaPrototipo).crea(s);
		}
	}
}
