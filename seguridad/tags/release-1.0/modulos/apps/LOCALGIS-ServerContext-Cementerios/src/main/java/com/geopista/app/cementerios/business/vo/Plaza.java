package com.geopista.app.cementerios.business.vo;

import java.util.Date;

public class Plaza {

	/**
	 * This field was generated by Apache iBATIS ibator. This field corresponds to the database column cementerio.plaza.id
	 * @ibatorgenerated  Thu May 19 17:05:05 CEST 2011
	 */
	private Integer id;
	/**
	 * This field was generated by Apache iBATIS ibator. This field corresponds to the database column cementerio.plaza.situacion
	 * @ibatorgenerated  Thu May 19 17:05:05 CEST 2011
	 */
	private String situacion;
	/**
	 * This field was generated by Apache iBATIS ibator. This field corresponds to the database column cementerio.plaza.modicado
	 * @ibatorgenerated  Thu May 19 17:05:05 CEST 2011
	 */
	private Date modicado;
	/**
	 * This field was generated by Apache iBATIS ibator. This field corresponds to the database column cementerio.plaza.id_unidadenterramiento
	 * @ibatorgenerated  Thu May 19 17:05:05 CEST 2011
	 */
	private Integer idUnidadenterramiento;
	/**
	 * This field was generated by Apache iBATIS ibator. This field corresponds to the database column cementerio.plaza.estado
	 * @ibatorgenerated  Thu May 19 17:05:05 CEST 2011
	 */
	private Integer estado;

	/**
	 * This method was generated by Apache iBATIS ibator. This method returns the value of the database column cementerio.plaza.id
	 * @return  the value of cementerio.plaza.id
	 * @ibatorgenerated  Thu May 19 17:05:05 CEST 2011
	 */
	public Integer getId() {
		return id;
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method sets the value of the database column cementerio.plaza.id
	 * @param id  the value for cementerio.plaza.id
	 * @ibatorgenerated  Thu May 19 17:05:05 CEST 2011
	 */
	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method returns the value of the database column cementerio.plaza.situacion
	 * @return  the value of cementerio.plaza.situacion
	 * @ibatorgenerated  Thu May 19 17:05:05 CEST 2011
	 */
	public String getSituacion() {
		return situacion;
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method sets the value of the database column cementerio.plaza.situacion
	 * @param situacion  the value for cementerio.plaza.situacion
	 * @ibatorgenerated  Thu May 19 17:05:05 CEST 2011
	 */
	public void setSituacion(String situacion) {
		this.situacion = situacion;
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method returns the value of the database column cementerio.plaza.modicado
	 * @return  the value of cementerio.plaza.modicado
	 * @ibatorgenerated  Thu May 19 17:05:05 CEST 2011
	 */
	public Date getModicado() {
		return modicado;
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method sets the value of the database column cementerio.plaza.modicado
	 * @param modicado  the value for cementerio.plaza.modicado
	 * @ibatorgenerated  Thu May 19 17:05:05 CEST 2011
	 */
	public void setModicado(Date modicado) {
		this.modicado = modicado;
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method returns the value of the database column cementerio.plaza.id_unidadenterramiento
	 * @return  the value of cementerio.plaza.id_unidadenterramiento
	 * @ibatorgenerated  Thu May 19 17:05:05 CEST 2011
	 */
	public Integer getIdUnidadenterramiento() {
		return idUnidadenterramiento;
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method sets the value of the database column cementerio.plaza.id_unidadenterramiento
	 * @param idUnidadenterramiento  the value for cementerio.plaza.id_unidadenterramiento
	 * @ibatorgenerated  Thu May 19 17:05:05 CEST 2011
	 */
	public void setIdUnidadenterramiento(Integer idUnidadenterramiento) {
		this.idUnidadenterramiento = idUnidadenterramiento;
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method returns the value of the database column cementerio.plaza.estado
	 * @return  the value of cementerio.plaza.estado
	 * @ibatorgenerated  Thu May 19 17:05:05 CEST 2011
	 */
	public Integer getEstado() {
		return estado;
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method sets the value of the database column cementerio.plaza.estado
	 * @param estado  the value for cementerio.plaza.estado
	 * @ibatorgenerated  Thu May 19 17:05:05 CEST 2011
	 */
	public void setEstado(Integer estado) {
		this.estado = estado;
	}
}