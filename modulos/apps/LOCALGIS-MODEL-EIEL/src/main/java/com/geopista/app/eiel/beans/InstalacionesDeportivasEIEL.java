/**
 * InstalacionesDeportivasEIEL.java
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

public class InstalacionesDeportivasEIEL extends WorkflowEIEL  implements Serializable, EIELPanel{

	public InstalacionesDeportivasEIEL(){
		relacionFields = new ArrayList<LCGCampoCapaTablaEIEL>();
		relacionFields.add(new LCGCampoCapaTablaEIEL("C�digo provincia","codprov","eiel_t_id","getCodINEProvincia"));
		relacionFields.add(new LCGCampoCapaTablaEIEL("C�digo Municipio","codmunic","eiel_t_id","getCodINEMunicipio"));
		relacionFields.add(new LCGCampoCapaTablaEIEL("Clave","clave","eiel_t_id","getClave"));
		relacionFields.add(new LCGCampoCapaTablaEIEL("C�digo INE Entidad","codentidad","eiel_t_id","getCodINEEntidad"));
		relacionFields.add(new LCGCampoCapaTablaEIEL("C�digo INE N�cleo","codpoblamiento","eiel_t_id","getCodINEPoblamiento"));
		relacionFields.add(new LCGCampoCapaTablaEIEL("C�digo Orden","orden_id","eiel_t_id","getOrdenIdDeportes"));
	}
	
	public Hashtable getIdentifyFields() {
		Hashtable fields = new Hashtable();
		fields.put("codprov", codINEProvincia);
		fields.put("codmunic", codINEMunicipio);
		fields.put("clave", clave);
		fields.put("codpoblamiento", codINEPoblamiento);
		fields.put("codentidad", codINEEntidad);
		fields.put("orden_id", ordenIdDeportes);		
		return fields;
	}
	
	private String clave = null;
	private String codINEEntidad = null;
	private String codINEPoblamiento = null;
	private String ordenIdDeportes = null;
	private String nombre = null;
	private String tipo = null;
	private String titular = null;
	private String Inst_P = null;
	private String gestor = null;
	private Integer supCubierta = null;
	private Integer supAire = null;
	private Integer supSolar = null;
	private String estado = null;
	
	private String acceso_s_ruedas = null;
	private String obra_ejec = null;
	
	private Date fechaInstalacion = null;	
	private String observaciones = null;	
	private Date fechaRevision = null;
	private Integer estadoRevision = null;	
	private ArrayList listaTipos = new ArrayList();

	private VersionEiel version = null;
	
	public String getClave() {
		return clave;
	}
	public void setClave(String clave) {
		this.clave = clave;
	}
	
	public String getInst_P() {
		return Inst_P;
	}
	public void setInst_P(String inst_P) {
		Inst_P = inst_P;
	}

	public String getCodINEEntidad() {
		return codINEEntidad;
	}
	public void setCodINEEntidad(String codINEEntidad) {
		this.codINEEntidad = codINEEntidad;
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
	public String getTitular() {
		return titular;
	}
	public void setTitular(String titular) {
		this.titular = titular;
	}	
	public Integer getSupCubierta() {
		return supCubierta;
	}
	public void setSupCubierta(Integer supCubierta) {
		this.supCubierta = supCubierta;
	}
	public Integer getSupAire() {
		return supAire;
	}
	public void setSupAire(Integer supAire) {
		this.supAire = supAire;
	}
	public Integer getSupSolar() {
		return supSolar;
	}
	public void setSupSolar(Integer supSolar) {
		this.supSolar = supSolar;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public Date getFechaInstalacion() {
		return fechaInstalacion;
	}
	public void setFechaInstalacion(Date fechaInstalacion) {
		this.fechaInstalacion = fechaInstalacion;
	}
	public String getGestor() {
		return gestor;
	}
	public void setGestor(String gestor) {
		this.gestor = gestor;
	}
	public ArrayList getListaTipos() {
		return listaTipos;
	}
	public void setListaTipos(ArrayList listaTipos) {
		this.listaTipos = listaTipos;
	}
	public String getOrdenIdDeportes() {
		return ordenIdDeportes;
	}
	public void setOrdenIdDeportes(String ordenIdDeportes) {
		this.ordenIdDeportes = ordenIdDeportes;
	}
	
	public String getCodINEPoblamiento() {
		return codINEPoblamiento;
	}
	public void setCodINEPoblamiento(String codINEPoblamiento) {
		this.codINEPoblamiento = codINEPoblamiento;
	}
	public String getAcceso_s_ruedas() {
		return acceso_s_ruedas;
	}
	public void setAcceso_s_ruedas(String acceso_s_ruedas) {
		this.acceso_s_ruedas = acceso_s_ruedas;
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
