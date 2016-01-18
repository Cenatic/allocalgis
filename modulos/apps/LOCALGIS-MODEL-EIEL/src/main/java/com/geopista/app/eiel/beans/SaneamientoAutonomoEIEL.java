/**
 * SaneamientoAutonomoEIEL.java
 * � MINETUR, Government of Spain
 * This program is part of LocalGIS
 * This program is free software: you can redistribute it and/or modify it under the terms of the GNU General Public License as published by the Free Software Foundation, either version 2 of the License, or (at your option) any later version.
 * This program is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU General Public License for more details.
 * You should have received a copy of the GNU General Public License along with this program. If not, see <http://www.gnu.org/licenses/>.
 */
 package com.geopista.app.eiel.beans;

import java.io.Serializable;
import java.sql.Date;
import java.util.ArrayList;
import java.util.Hashtable;

import com.geopista.app.eiel.beans.filter.LCGCampoCapaTablaEIEL;
import com.geopista.util.EIELPanel;

public class SaneamientoAutonomoEIEL extends WorkflowEIEL implements Serializable, EIELPanel {
	
	public SaneamientoAutonomoEIEL(){
		relacionFields = new ArrayList<LCGCampoCapaTablaEIEL>();
		relacionFields.add(new LCGCampoCapaTablaEIEL("C�digo Provincia","codprov","eiel_t_saneam_au","getCodINEProvincia"));
		relacionFields.add(new LCGCampoCapaTablaEIEL("C�digo Municipio","codmunic","eiel_t_saneam_au","getCodINEMunicipio"));
		relacionFields.add(new LCGCampoCapaTablaEIEL("Clave","clave","eiel_t_saneam_au","getClave"));
		relacionFields.add(new LCGCampoCapaTablaEIEL("C�digo INE Entidad","codentidad","eiel_t_saneam_au","getCodINEEntidad"));
		relacionFields.add(new LCGCampoCapaTablaEIEL("C�digo INE N�cleo","codpoblamiento","eiel_t_saneam_au","getCodINENucleo"));
	}
	
	public Hashtable getIdentifyFields() {
		Hashtable fields = new Hashtable();
		fields.put("codprov", codINEProvincia);
		fields.put("codmunic", codINEMunicipio);
		fields.put("clave", clave);
		fields.put("codpoblamiento", codINEPoblamiento);
		fields.put("codentidad", codINEEntidad);		
		return fields;
	}
	
	private String clave = null;
	private String codINEEntidad = null;
	private String codINEPoblamiento = null;
	
	private String tipo_sau = null;
	private String estado_sau = null;
	
	private String observaciones = null;
	
	private Date fechaInstalacion = null;
	private Date fechaRevision = null;
	private Integer estadoRevision = null;
	
	private String adecuacion_sau = null;
	private Integer sau_viven = null;
	private Integer sau_pob_re = null;
	private Integer sau_pob_es = null;
	private Integer sau_vi_def = null;
	private Integer sau_pob_re_def = null;
	private Integer sau_pob_es_def = null;

	
	
	private VersionEiel version = null;
	
	public String getClave() {
		return clave;
	}
	public void setClave(String clave) {
		this.clave = clave;
	}
	
	public String getCodINEEntidad() {
		return codINEEntidad;
	}
	public void setCodINEEntidad(String codINEEntidad) {
		this.codINEEntidad = codINEEntidad;
	}
	public String getCodINENucleo() {
		return codINEPoblamiento;
	}
	public void setCodINENucleo(String codINENucleo) {
		this.codINEPoblamiento = codINENucleo;
	}	
	public String getTipo() {
		return tipo_sau;
	}
	public void setTipo(String tipo) {
		this.tipo_sau = tipo;
	}
	public String getEstado() {
		return estado_sau;
	}
	public void setEstado(String estado) {
		this.estado_sau = estado;
	}
	public String getObservaciones() {
		return observaciones;
	}
	public void setObservaciones(String observaciones) {
		this.observaciones = observaciones;
	}	
	public String getAdecuacion() {
		return adecuacion_sau;
	}
	public void setAdecuacion(String adecuacion) {
		this.adecuacion_sau = adecuacion;
	}	
	public Date getFechaInstalacion() {
		return fechaInstalacion;
	}
	public void setFechaInstalacion(Date fechaInstalacion) {
		this.fechaInstalacion = fechaInstalacion;
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
	
	public Integer getViviendas() {
		return sau_viven;
	}
	public void setViviendas(Integer viviendas) {
		this.sau_viven = viviendas;
	}
	public Integer getPoblResidente() {
		return sau_pob_re;
	}
	public void setPoblResidente(Integer poblResidente) {
		this.sau_pob_re = poblResidente;
	}
	public Integer getPoblEstacional() {
		return sau_pob_es;
	}
	public void setPoblEstacional(Integer poblEstacional) {
		this.sau_pob_es = poblEstacional;
	}
	public Integer getVivDeficitarias() {
		return sau_vi_def;
	}
	public void setVivDeficitarias(Integer vivDeficitarias) {
		this.sau_vi_def = vivDeficitarias;
	}
	public Integer getPoblResDeficitaria() {
		return sau_pob_re_def;
	}
	public void setPoblResDeficitaria(Integer poblResDeficitaria) {
		this.sau_pob_re_def = poblResDeficitaria;
	}
	public Integer getPoblEstDeficitaria() {
		return sau_pob_es_def;
	}
	public void setPoblEstDeficitaria(Integer poblEstDeficitaria) {
		this.sau_pob_es_def = poblEstDeficitaria;
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
	
	@Override
	public String toString() {
		return "SaneamientoAutonomoEIEL [codINEMunicipio="+codINEMunicipio+",codINEEntidad=" + codINEEntidad
				+ ", codINEPoblamiento=" + codINEPoblamiento + "]";
	}	
	
}
