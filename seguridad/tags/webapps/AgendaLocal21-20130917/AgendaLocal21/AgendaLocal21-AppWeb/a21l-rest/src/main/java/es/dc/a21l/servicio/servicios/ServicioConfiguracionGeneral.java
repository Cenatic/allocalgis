/*
 * El presente software ha sido desarrollado por Balidea Consulting & Programming, con control de calidad y previo dise�o por Enxenio S.L., para la Diputaci�n de A Coru�a en el seno del proyecto LOURED (http://loured.es), inclu�do en el Plan AVANZA Local 2009-2011 del Ministerio de Industria, Energ�a y Turismo del Gobierno de Espa�a.  
 * Su distribuci�n se realiza bajo las condiciones establecidas por la licencia European Public License (EUPL), versi�n 1.1 o posteriores (http://http://joinup.ec.europa.eu/software/page/eupl/licence-eupl)
 */
package es.dc.a21l.servicio.servicios;

import java.util.Map;

import es.dc.a21l.base.utils.enumerados.TiposFuente;

public interface ServicioConfiguracionGeneral {
	public String getRutaFicherosFuentes();
	public void setRutaFicherosFuentes(String rutaFicherosFuentes);
	public String getPathCsv();
	public void setPathCsv(String pathCsv);
	public String getPathGml();
	public void setPathGml(String pathGml);
	public String getPathShapefile();
	public void setPathShapefile(String pathShapefile);
	public String getCaracterSeparadorCSV();
	public void setCaracterSeparadorCSV(String caracterSeparadorCSV);
	public String getPathMetadatos();
	public void setPathMetadatos(String pathMetadatos);	
	public Map<TiposFuente, String> getMapaPathTiposFuente();	
	public String getCatalogoUrl();
	public void setCatalogoUrl(String catalogoUrl);	
	public String getCatalogoNome();
	public void setCatalogoNome(String catalogoNome);	
	public String getCatalogoUser();
	public void setCatalogoUser(String catalogoUser);	
	public String getCatalogoPass();
	public void setCatalogoPass(String catalogoPass);	
	public String getCatalogoData();
	public void setCatalogoData(String catalogoData);
	public String getCodigoCordenadas();
	public void setCodigoCordenadas(String codigoCordenadas);
	public String getCaracterSeparadorDecimales();
	public void setCaracterSeparadorDecimales(String caracterSeparadorDecimales);
}