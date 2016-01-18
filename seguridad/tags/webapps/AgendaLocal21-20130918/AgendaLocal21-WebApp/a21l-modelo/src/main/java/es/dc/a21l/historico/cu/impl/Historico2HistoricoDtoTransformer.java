/*
 * El presente software ha sido desarrollado por Balidea Consulting & Programming, con control de calidad y previo dise�o por Enxenio S.L., para la Diputaci�n de A Coru�a en el seno del proyecto LOURED (http://loured.es), inclu�do en el Plan AVANZA Local 2009-2011 del Ministerio de Industria, Energ�a y Turismo del Gobierno de Espa�a.  
 * Su distribuci�n se realiza bajo las condiciones establecidas por la licencia European Public License (EUPL), versi�n 1.1 o posteriores (http://http://joinup.ec.europa.eu/software/page/eupl/licence-eupl)
 */
package es.dc.a21l.historico.cu.impl;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.dozer.Mapper;

import es.dc.a21l.base.cu.impl.TransformadorEntidadBase2DtoBase;
import es.dc.a21l.historico.cu.HistoricoDto;
import es.dc.a21l.historico.modelo.Historico;

public class Historico2HistoricoDtoTransformer extends TransformadorEntidadBase2DtoBase<Historico, HistoricoDto>{
	
	public Historico2HistoricoDtoTransformer(Mapper mapper) {
		super(mapper);
	}
	
	@Override
	protected void aplicaPropiedadesEstendidas(Historico origen,HistoricoDto destino) {
		super.aplicaPropiedadesEstendidas(origen, destino);
		destino.setDatosDto(origen.getDatos());
		destino.setMapaDto(origen.getMapa());
		destino.setFecha(origen.getFecha());
		destino.setStrFecha(dateToString(origen.getFecha()));
	}
	public String dateToString(Date fecha){
		try{
			SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
			sdf.setLenient(false);
			String strFecha;
			strFecha = sdf.format(fecha);
			return strFecha;
		}catch (Exception e) {
			return null;
		}
	}
}

