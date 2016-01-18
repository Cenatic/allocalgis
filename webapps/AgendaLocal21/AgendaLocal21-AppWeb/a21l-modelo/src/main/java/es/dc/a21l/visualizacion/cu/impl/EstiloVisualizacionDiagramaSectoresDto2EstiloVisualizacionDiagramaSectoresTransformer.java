/*
 * El presente software ha sido desarrollado por Balidea Consulting & Programming, con control de calidad y previo dise�o por Enxenio S.L., para la Diputaci�n de A Coru�a en el seno del proyecto LOURED (http://loured.es), inclu�do en el Plan AVANZA Local 2009-2011 del Ministerio de Industria, Energ�a y Turismo del Gobierno de Espa�a.  
 * Su distribuci�n se realiza bajo las condiciones establecidas por la licencia European Public License (EUPL), versi�n 1.1 o posteriores (http://http://joinup.ec.europa.eu/software/page/eupl/licence-eupl)
 */
package es.dc.a21l.visualizacion.cu.impl;

import org.dozer.Mapper;

import es.dc.a21l.base.cu.impl.EstrategiaCreacionEntidadRepositorio;
import es.dc.a21l.base.cu.impl.TransformadorDtoBase2EntidadBase;
import es.dc.a21l.visualizacion.cu.EstiloVisualizacionDiagramaSectoresDto;
import es.dc.a21l.visualizacion.modelo.EstiloVisualizacionDiagramaSectores;
import es.dc.a21l.visualizacion.modelo.EstiloVisualizacionDiagramaSectoresRepositorio;

public class EstiloVisualizacionDiagramaSectoresDto2EstiloVisualizacionDiagramaSectoresTransformer extends TransformadorDtoBase2EntidadBase<EstiloVisualizacionDiagramaSectoresDto, EstiloVisualizacionDiagramaSectores> {

	private EstiloVisualizacionDiagramaSectoresRepositorio estiloVisualizacionDiagramaSectoresRepositorio;
	
	public EstiloVisualizacionDiagramaSectoresDto2EstiloVisualizacionDiagramaSectoresTransformer(Mapper mapper, EstiloVisualizacionDiagramaSectoresRepositorio estiloVisualizacionDiagramaSectoresRepositorio) {
		super(mapper);
		this.estiloVisualizacionDiagramaSectoresRepositorio = estiloVisualizacionDiagramaSectoresRepositorio;
		setEstrategiaCreacion(new EstrategiaCreacionEntidadRepositorio<EstiloVisualizacionDiagramaSectoresDto, EstiloVisualizacionDiagramaSectores>(estiloVisualizacionDiagramaSectoresRepositorio, this));
	}
	
	@Override
	protected void aplicaPropiedadesEstendidas(EstiloVisualizacionDiagramaSectoresDto origen, EstiloVisualizacionDiagramaSectores destino) {
		super.aplicaPropiedadesEstendidas(origen, destino);
	}
	

}
