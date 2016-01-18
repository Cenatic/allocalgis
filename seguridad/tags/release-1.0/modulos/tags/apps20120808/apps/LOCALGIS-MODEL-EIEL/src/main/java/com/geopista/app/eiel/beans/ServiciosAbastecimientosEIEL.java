 package com.geopista.app.eiel.beans;

import java.io.Serializable;
import java.sql.Date;
import java.util.ArrayList;
import java.util.Hashtable;

import com.geopista.app.eiel.beans.filter.LCGCampoCapaTablaEIEL;
import com.geopista.util.EIELPanel;

public class ServiciosAbastecimientosEIEL extends WorkflowEIEL implements Serializable, EIELPanel{
		
	public ServiciosAbastecimientosEIEL(){
		relacionFields = new ArrayList<LCGCampoCapaTablaEIEL>();
		relacionFields.add(new LCGCampoCapaTablaEIEL("C�digo Provincia","codprov","eiel_t_abast_serv","getCodINEProvincia"));
		relacionFields.add(new LCGCampoCapaTablaEIEL("C�digo Municipio","codmunic","eiel_t_abast_serv","getCodINEMunicipio"));
		relacionFields.add(new LCGCampoCapaTablaEIEL("C�digo INE Entidad","codentidad","eiel_t_abast_serv","getCodINEEntidad"));
		relacionFields.add(new LCGCampoCapaTablaEIEL("C�digo INE N�cleo","codpoblamiento","eiel_t_abast_serv","getCodINEPoblamiento"));
	}
	
	public Hashtable getIdentifyFields() {
		Hashtable fields = new Hashtable();
		fields.put("codprov", codINEProvincia);
		fields.put("codmunic", codINEMunicipio);
		fields.put("codpoblamiento", codINEPoblamiento);
		fields.put("codentidad", codINEEntidad);		
		return fields;
	}
	
	private String codINEEntidad = null;
	private String codINEPoblamiento = null;
	
	private Integer viviendasConectadas = null;
	private Integer viviendasNoConectadas = null;
	private Integer consumoInvierno = null;
	private Integer consumoVerano = null;
	private Integer viviendasExcesoPresion = null;
	private Integer viviendasDeficitPresion = null;
	private Integer perdidasAgua = null;
	private Integer longitudDeficitaria = null;
	private Integer viviendasDeficitarias = null;
	private Integer poblacionResidenteDeficitaria = null;
	private Integer poblacionEstacionalDeficitaria = null;

	
	private String calidadServicio = null;
	private String observaciones = null;
	
	private Date fechaRevision = null;
	private Integer estadoRevision = null;
	
	
	private VersionEiel version = null;
	

	public String getCodINEEntidad() {
		return codINEEntidad;
	}

	public void setCodINEEntidad(String codINEEntidad) {
		this.codINEEntidad = codINEEntidad;
	}


	public Integer getViviendasConectadas() {
		return viviendasConectadas;
	}

	public void setViviendasConectadas(Integer viviendasConectadas) {
		this.viviendasConectadas = viviendasConectadas;
	}

	public Integer getViviendasNoConectadas() {
		return viviendasNoConectadas;
	}

	public void setViviendasNoConectadas(Integer viviendasNoConectadas) {
		this.viviendasNoConectadas = viviendasNoConectadas;
	}

	public Integer getConsumoInvierno() {
		return consumoInvierno;
	}

	public void setConsumoInvierno(Integer consumoInvierno) {
		this.consumoInvierno = consumoInvierno;
	}

	public Integer getConsumoVerano() {
		return consumoVerano;
	}

	public void setConsumoVerano(Integer consumoVerano) {
		this.consumoVerano = consumoVerano;
	}

	public Integer getViviendasExcesoPresion() {
		return viviendasExcesoPresion;
	}

	public void setViviendasExcesoPresion(Integer viviendasExcesoPresion) {
		this.viviendasExcesoPresion = viviendasExcesoPresion;
	}

	public Integer getViviendasDeficitPresion() {
		return viviendasDeficitPresion;
	}

	public void setViviendasDeficitPresion(Integer viviendasDeficitPresion) {
		this.viviendasDeficitPresion = viviendasDeficitPresion;
	}

	public Integer getPerdidasAgua() {
		return perdidasAgua;
	}

	public void setPerdidasAgua(Integer perdidasAgua) {
		this.perdidasAgua = perdidasAgua;
	}

	public Integer getLogitudDeficitaria() {
		return longitudDeficitaria;
	}

	public void setLongitudDeficitaria(Integer longitudDeficitaria) {
		this.longitudDeficitaria = longitudDeficitaria;
	}

	public Integer getViviendasDeficitarias() {
		return viviendasDeficitarias;
	}

	public void setViviendasDeficitarias(Integer viviendasDeficitarias) {
		this.viviendasDeficitarias = viviendasDeficitarias;
	}

	public Integer getPoblacionResidenteDeficitaria() {
		return poblacionResidenteDeficitaria;
	}

	public void setPoblacionResidenteDeficitaria(
			Integer poblacionResidenteDeficitaria) {
		this.poblacionResidenteDeficitaria = poblacionResidenteDeficitaria;
	}

	public Integer getPoblacionEstacionalDeficitaria() {
		return poblacionEstacionalDeficitaria;
	}

	public void setPoblacionEstacionalDeficitaria(
			Integer poblacionEstacionalDeficitaria) {
		this.poblacionEstacionalDeficitaria = poblacionEstacionalDeficitaria;
	}

	public String getCalidadServicio() {
		return calidadServicio;
	}

	public void setCalidadServicio(String calidadServicio) {
		this.calidadServicio = calidadServicio;
	}

	public String getObservaciones() {
		return observaciones;
	}

	public void setObservaciones(String observaciones) {
		this.observaciones = observaciones;
	}

	public Date getFechaRevision() {
		return fechaRevision;
	}

	public void setFechaRevision(Date fechaRevision) {
		this.fechaRevision = fechaRevision;
	}

	public Integer getEstadoRevision() {
		return estadoRevision;
	}

	public void setEstadoRevision(Integer estadoRevision) {
		this.estadoRevision = estadoRevision;
	}


	public String getCodINEPoblamiento() {
		return codINEPoblamiento;
	}

	public void setCodINEPoblamiento(String codINEPoblamiento) {
		this.codINEPoblamiento = codINEPoblamiento;
	}

	/**
	 * @param version the version to set
	 */
	public void setVersion(VersionEiel version) {
		this.version = version;
	}

	/**
	 * @return the version
	 */
	public VersionEiel getVersion() {
		return version;
	}

	
}
