package com.geopista.app.eiel.beans;

import java.io.Serializable;
import java.sql.Date;
import java.util.ArrayList;
import java.util.Hashtable;

import com.geopista.app.eiel.beans.filter.LCGCampoCapaTablaEIEL;
import com.geopista.util.EIELPanel;

public class NucleosAbandonadosEIEL extends WorkflowEIEL implements Serializable, EIELPanel{
	
	public NucleosAbandonadosEIEL(){
		relacionFields = new ArrayList<LCGCampoCapaTablaEIEL>();
		relacionFields.add(new LCGCampoCapaTablaEIEL("C�digo Provincia","codprov","eiel_t_nucleo_aband","getCodINEProvincia"));
		relacionFields.add(new LCGCampoCapaTablaEIEL("C�digo Municipio","codmunic","eiel_t_nucleo_aband","getCodINEMunicipio"));
		relacionFields.add(new LCGCampoCapaTablaEIEL("C�digo INE Entidad","codentidad","eiel_t_nucleo_aband","getCodINEEntidad"));
		relacionFields.add(new LCGCampoCapaTablaEIEL("C�digo INE N�cleo","codpoblamiento","eiel_t_nucleo_aband","getCodINEPoblamiento"));
	}

	public Hashtable getIdentifyFields() {
		Hashtable fields = new Hashtable();
		fields.put("codprov", codINEProvincia);
		fields.put("codmunic", codINEMunicipio);
		fields.put("codentidad", codINEEntidad);
		fields.put("codpoblamiento", codINEPoblamiento);		
		return fields;
	}
	
	private String codINEEntidad = null;
	private String codINEPoblamiento = null;
	
	private String annoAbandono = null;
	private String causaAbandono = null;
	private String titularidad = null;
	private String rehabilitacion = null;
	private String acceso = null;
	private String servicioAgua = null;
	private String observaciones = null;
	private String servicioElectricidad = null;
	private Date fechaRevision = null;
	private Integer estadoRevision = null;
	
	
	private VersionEiel version = null;


	public String getCodINEEntidad() {
		return codINEEntidad;
	}

	public void setCodINEEntidad(String codINEEntidad) {
		this.codINEEntidad = codINEEntidad;
	}

	public String getAnnoAbandono() {
		return annoAbandono;
	}

	public void setAnnoAbandono(String annoAbandono) {
		this.annoAbandono = annoAbandono;
	}

	public String getCausaAbandono() {
		return causaAbandono;
	}

	public void setCausaAbandono(String causaAbandono) {
		this.causaAbandono = causaAbandono;
	}

	public String getTitularidad() {
		return titularidad;
	}

	public void setTitularidad(String titularidad) {
		this.titularidad = titularidad;
	}

	public String getRehabilitacion() {
		return rehabilitacion;
	}

	public void setRehabilitacion(String rehabilitacion) {
		this.rehabilitacion = rehabilitacion;
	}

	public String getAcceso() {
		return acceso;
	}

	public void setAcceso(String acceso) {
		this.acceso = acceso;
	}

	public String getServicioAgua() {
		return servicioAgua;
	}

	public void setServicioAgua(String servicioAgua) {
		this.servicioAgua = servicioAgua;
	}
	
	public String getServicioElectricidad() {
		return servicioElectricidad;
	}

	public void setServicioElectricidad(String servicioElectricidad) {
		this.servicioElectricidad = servicioElectricidad;
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
