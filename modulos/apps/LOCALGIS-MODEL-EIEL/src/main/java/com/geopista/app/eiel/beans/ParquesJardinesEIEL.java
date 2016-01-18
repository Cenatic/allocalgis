/**
 * ParquesJardinesEIEL.java
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

public class ParquesJardinesEIEL extends WorkflowEIEL  implements Serializable, EIELPanel {
	
	public ParquesJardinesEIEL(){
		relacionFields = new ArrayList<LCGCampoCapaTablaEIEL>();
		relacionFields.add(new LCGCampoCapaTablaEIEL("C�digo provincia","codprov","eiel_t_pj","getCodINEProvincia"));
		relacionFields.add(new LCGCampoCapaTablaEIEL("C�digo Municipio","codmunic","eiel_t_pj","getCodINEMunicipio"));
		relacionFields.add(new LCGCampoCapaTablaEIEL("Clave","clave","eiel_t_pj","getClave"));
		relacionFields.add(new LCGCampoCapaTablaEIEL("C�digo INE Entidad","codentidad","eiel_t_pj","getCodINEEntidad"));
		relacionFields.add(new LCGCampoCapaTablaEIEL("C�digo INE N�cleo","codpoblamiento","eiel_t_pj","getCodINEPoblamiento"));
		relacionFields.add(new LCGCampoCapaTablaEIEL("C�digo Orden","orden_pj","eiel_t_pj","getCodOrden"));
	}
	
	public Hashtable getIdentifyFields() {
		Hashtable fields = new Hashtable();
		fields.put("codprov", codINEProvincia);
		fields.put("codmunic", codINEMunicipio);
		fields.put("clave", clave);
		fields.put("codpoblamiento", codINEPoblamiento);
		fields.put("codentidad", codINEEntidad);
		fields.put("orden_id", codOrden);		
		return fields;
	}
	private String clave = null;
	private String codINEEntidad = null;
	private String codINEPoblamiento = null;
	private String codOrden = null;
	
	private String nombre = null;
	private String tipo = null;
	private String titularidad = null;
	private String gestion = null;
	
	private Integer supCubierta = null;
	private Integer supLibre = null;
	private Integer supSolar = null;
	
	private String agua = null;
	private String saneamiento = null;	
	private String electricidad = null;
	private String comedor = null;
	private String juegosInf = null;
	private String otros = null;
	private String estado = null;
	private String observaciones = null;
	
	private String accesoSilla = null;
	private String obra_ejec = null;
	
	private Date fechaRevision = null;
	private Integer estadoRevision = null;
	
	
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
	public String getCodOrden() {
		return codOrden;
	}
	public void setCodOrden(String codOrden) {
		this.codOrden = codOrden;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public String getTitularidad() {
		return titularidad;
	}
	public void setTitularidad(String titularidad) {
		this.titularidad = titularidad;
	}
	public String getGestion() {
		return gestion;
	}
	public void setGestion(String gestion) {
		this.gestion = gestion;
	}
	public Integer getSupCubierta() {
		return supCubierta;
	}
	public void setSupCubierta(Integer supCubierta) {
		this.supCubierta = supCubierta;
	}
	public Integer getSupLibre() {
		return supLibre;
	}
	public void setSupLibre(Integer supLibre) {
		this.supLibre = supLibre;
	}
	public Integer getSupSolar() {
		return supSolar;
	}
	public void setSupSolar(Integer supSolar) {
		this.supSolar = supSolar;
	}
	public String getAgua() {
		return agua;
	}
	public void setAgua(String agua) {
		this.agua = agua;
	}
	public String getSaneamiento() {
		return saneamiento;
	}
	public void setSaneamiento(String saneamiento) {
		this.saneamiento = saneamiento;
	}
	public String getElectricidad() {
		return electricidad;
	}
	public void setElectricidad(String electricidad) {
		this.electricidad = electricidad;
	}
	public String getComedor() {
		return comedor;
	}
	public void setComedor(String comedor) {
		this.comedor = comedor;
	}
	public String getJuegosInf() {
		return juegosInf;
	}
	public void setJuegosInf(String juegosInf) {
		this.juegosInf = juegosInf;
	}
	public String getOtros() {
		return otros;
	}
	public void setOtros(String otros) {
		this.otros = otros;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
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
	public String getAccesoSilla() {
		return accesoSilla;
	}
	public void setAccesoSilla(String accesoSilla) {
		this.accesoSilla = accesoSilla;
	}
	public String getObra_ejec() {
		return obra_ejec;
	}
	public void setObra_ejec(String obra_ejec) {
		this.obra_ejec = obra_ejec;
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
