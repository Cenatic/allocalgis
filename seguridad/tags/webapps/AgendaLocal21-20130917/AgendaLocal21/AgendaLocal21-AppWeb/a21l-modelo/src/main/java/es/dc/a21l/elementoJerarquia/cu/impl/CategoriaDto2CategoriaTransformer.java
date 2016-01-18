/*
 * El presente software ha sido desarrollado por Balidea Consulting & Programming, con control de calidad y previo dise�o por Enxenio S.L., para la Diputaci�n de A Coru�a en el seno del proyecto LOURED (http://loured.es), inclu�do en el Plan AVANZA Local 2009-2011 del Ministerio de Industria, Energ�a y Turismo del Gobierno de Espa�a.  
 * Su distribuci�n se realiza bajo las condiciones establecidas por la licencia European Public License (EUPL), versi�n 1.1 o posteriores (http://http://joinup.ec.europa.eu/software/page/eupl/licence-eupl)
 */
package es.dc.a21l.elementoJerarquia.cu.impl;

import org.dozer.Mapper;

import es.dc.a21l.base.cu.impl.EstrategiaCreacionEntidadRepositorio;
import es.dc.a21l.base.cu.impl.TransformadorDtoBase2EntidadBase;
import es.dc.a21l.elementoJerarquia.cu.CategoriaDto;
import es.dc.a21l.elementoJerarquia.modelo.Categoria;
import es.dc.a21l.elementoJerarquia.modelo.CategoriaRepositorio;

public class CategoriaDto2CategoriaTransformer extends TransformadorDtoBase2EntidadBase<CategoriaDto, Categoria> {

	private CategoriaRepositorio categoriaRepositorio;
	
	public CategoriaDto2CategoriaTransformer(Mapper mapper, CategoriaRepositorio categoriaRepositorio) {
		super(mapper);
		this.categoriaRepositorio=categoriaRepositorio;
		setEstrategiaCreacion(new EstrategiaCreacionEntidadRepositorio<CategoriaDto, Categoria>(categoriaRepositorio, this));
	}
	
	@Override
	protected void aplicaPropiedadesEstendidas(CategoriaDto origen,Categoria destino) {
		super.aplicaPropiedadesEstendidas(origen, destino);
		destino.setCategoriaPadre(origen.getIdCategoriaPadre()!=null && origen.getIdCategoriaPadre()!=0?categoriaRepositorio.carga(origen.getIdCategoriaPadre()):null);
	}

}
