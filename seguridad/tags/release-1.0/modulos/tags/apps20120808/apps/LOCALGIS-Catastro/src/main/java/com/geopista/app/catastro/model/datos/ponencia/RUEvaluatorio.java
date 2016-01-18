package com.geopista.app.catastro.model.datos.ponencia;

import java.util.Date;

public class RUEvaluatorio extends Ponencia
{  
    /**
     * C�digo del municipio agregado a la entidad menor
     */
    private Integer codMunicipioAgregado = null;
    
    /**
     * C�digo de calificaci�n catastral
     */
    private String codCalificacionCatastral = null;
    
    /**
     * C�digo Intensidad de producci�n
     */
    private Integer codIntensidadProduccion = null;
    
    /**
     * Importe del tipo evaluatorio
     */
    private Double importeTipoEvaluatorio = null;
    
    /**
     * A�o del tipo evaluatorio
     */
    private Integer anioTipoEvaluatorio = null;
    
    /**
     * Importe de la primera concentracion parcelaria
     */
    private Double importePrimeraConcentracion = null;
    
    /**
     * A�o de la primera concentraci�n parcelaria
     */
    private Integer anioPrimeraConcentracion = null;
    
    /**
     * Importe de la segunda concentraci�n parcelaria
     */
    private Double importeSegundaConcentracion = null;
    
    /**
     * A�o de la segunda concentraci�n parcelaria
     */
    private Integer anioSegundaConcentracion = null;
    
    /**
     * Importe de la tercera concentraci�n parcelaria
     */
    private Double importeTerceraConcentracion = null;
    
    /**
     * A�o de la tercera concentraci�n parcelaria
     */
    private Integer anioTerceraConcentracion = null;
    
    /**
     * N�mero de jornadas te�ricas
     */
    private Float numJornadasTeoricas = null;
    
    /**
     * Indicador de exenci�n
     */
    private Boolean isExento;
    
    /**
     * Indicador de condonaci�n del IBI
     */
    private Boolean isIBICondonado;
    
    /**
     * Indicador de condonaci�n de jornadas te�ricas
     */
    private Boolean isJornadasTeoricasCondonado;
    
    /**
     * Indicador de Vuelo o Pies sueltos 
     */
    private String indicadorVueloPiesSueltos;
    
    /**
     * Nombre de usuario que ha realizado la �ltima modificaci�n 
     */
    private String nombreUsuarioModificador;
    
    /**
     * Fecha de modificaci�n
     */
    private Date fechaModificacion;
    
    /**
     * Fecha de alteraci�n
     */
    private Date fechaAlteracion;
    
    /**
     * Tipo de movimiento
     */
    private String tipoMovimiento;
    
    /**
     * Motivo de movimiento
     */
    private String motivoMovimiento;
    
    /**
     * Estado de la modificaci�n
     */
    private String estadoModificacion;
    
    /**
     * Intensidad productiva
     */
    private Integer intensidadProductivaBOE;
    
    /**
     * Tipo anterior
     */
    private Double tipoAnterior;
    
    /**
     * *Clase de Cultivo
     */
    private String claseClutivo = null;
    
    
    public RUEvaluatorio()
    {
        super();           
    }
    
    
    
    /**
     * @return Returns the anioPrimeraConcentracion.
     */
    public Integer getAnioPrimeraConcentracion()
    {
        return anioPrimeraConcentracion;
    }
    
    
    
    /**
     * @param anioPrimeraConcentracion The anioPrimeraConcentracion to set.
     */
    public void setAnioPrimeraConcentracion(Integer anioPrimeraConcentracion)
    {
        this.anioPrimeraConcentracion = anioPrimeraConcentracion;
    }
    
    
    
    /**
     * @return Returns the anioSegundaConcentracion.
     */
    public Integer getAnioSegundaConcentracion()
    {
        return anioSegundaConcentracion;
    }
    
    
    
    /**
     * @param anioSegundaConcentracion The anioSegundaConcentracion to set.
     */
    public void setAnioSegundaConcentracion(Integer anioSegundaConcentracion)
    {
        this.anioSegundaConcentracion = anioSegundaConcentracion;
    }
    
    
    
    /**
     * @return Returns the anioTerceraConcentracion.
     */
    public Integer getAnioTerceraConcentracion()
    {
        return anioTerceraConcentracion;
    }
    
    
    
    /**
     * @param anioTerceraConcentracion The anioTerceraConcentracion to set.
     */
    public void setAnioTerceraConcentracion(Integer anioTerceraConcentracion)
    {
        this.anioTerceraConcentracion = anioTerceraConcentracion;
    }
    
    
    
    /**
     * @return Returns the anioTipoEvaluatorio.
     */
    public Integer getAnioTipoEvaluatorio()
    {
        return anioTipoEvaluatorio;
    }
    
    
    
    /**
     * @param anioTipoEvaluatorio The anioTipoEvaluatorio to set.
     */
    public void setAnioTipoEvaluatorio(Integer anioTipoEvaluatorio)
    {
        this.anioTipoEvaluatorio = anioTipoEvaluatorio;
    }
    
    
    
    /**
     * @return Returns the codCalificacionCatastral.
     */
    public String getCodCalificacionCatastral()
    {
        return codCalificacionCatastral;
    }
    
    
    
    /**
     * @param codCalificacionCatastral The codCalificacionCatastral to set.
     */
    public void setCodCalificacionCatastral(String codCalificacionCatastral)
    {
        this.codCalificacionCatastral = codCalificacionCatastral;
    }
    
    
    
    /**
     * @return Returns the codIntensidadProduccion.
     */
    public Integer getCodIntensidadProduccion()
    {
        return codIntensidadProduccion;
    }
    
    
    
    /**
     * @param codIntensidadProduccion The codIntensidadProduccion to set.
     */
    public void setCodIntensidadProduccion(Integer codIntensidadProduccion)
    {
        this.codIntensidadProduccion = codIntensidadProduccion;
    }
    
    
    /**
     * @return Returns the codMunicipioAgregado.
     */
    public Integer getCodMunicipioAgregado()
    {
        return codMunicipioAgregado;
    }
    
    
    
    /**
     * @param codMunicipioAgregado The codMunicipioAgregado to set.
     */
    public void setCodMunicipioAgregado(Integer codMunicipioAgregado)
    {
        this.codMunicipioAgregado = codMunicipioAgregado;
    }
    
    
    
    /**
     * @return Returns the estadoModificacion.
     */
    public String getEstadoModificacion()
    {
        return estadoModificacion;
    }
    
    
    
    /**
     * @param estadoModificacion The estadoModificacion to set.
     */
    public void setEstadoModificacion(String estadoModificacion)
    {
        this.estadoModificacion = estadoModificacion;
    }
    
    
    
    /**
     * @return Returns the fechaAlteracion.
     */
    public Date getFechaAlteracion()
    {
        return fechaAlteracion;
    }
    
    
    
    /**
     * @param fechaAlteracion The fechaAlteracion to set.
     */
    public void setFechaAlteracion(Date fechaAlteracion)
    {
        this.fechaAlteracion = fechaAlteracion;
    }
    
    
    
    /**
     * @return Returns the fechaModificacion.
     */
    public Date getFechaModificacion()
    {
        return fechaModificacion;
    }
    
    
    
    /**
     * @param fechaModificacion The fechaModificacion to set.
     */
    public void setFechaModificacion(Date fechaModificacion)
    {
        this.fechaModificacion = fechaModificacion;
    }
    
    
    
    /**
     * @return Returns the importePrimeraConcentracion.
     */
    public Double getImportePrimeraConcentracion()
    {
        return importePrimeraConcentracion;
    }
    
    
    
    /**
     * @param importePrimeraConcentracion The importePrimeraConcentracion to set.
     */
    public void setImportePrimeraConcentracion(Double importePrimeraConcentracion)
    {
        this.importePrimeraConcentracion = importePrimeraConcentracion;
    }
    
    
    
    /**
     * @return Returns the importeSegundaConcentracion.
     */
    public Double getImporteSegundaConcentracion()
    {
        return importeSegundaConcentracion;
    }
    
    
    
    /**
     * @param importeSegundaConcentracion The importeSegundaConcentracion to set.
     */
    public void setImporteSegundaConcentracion(Double importeSegundaConcentracion)
    {
        this.importeSegundaConcentracion = importeSegundaConcentracion;
    }
    
    
    
    /**
     * @return Returns the importeTerceraConcentracion.
     */
    public Double getImporteTerceraConcentracion()
    {
        return importeTerceraConcentracion;
    }
    
    
    
    /**
     * @param importeTerceraConcentracion The importeTerceraConcentracion to set.
     */
    public void setImporteTerceraConcentracion(Double importeTerceraConcentracion)
    {
        this.importeTerceraConcentracion = importeTerceraConcentracion;
    }
    
    
    
    /**
     * @return Returns the importeTipoEvaluatorio.
     */
    public Double getImporteTipoEvaluatorio()
    {
        return importeTipoEvaluatorio;
    }
    
    
    
    /**
     * @param importeTipoEvaluatorio The importeTipoEvaluatorio to set.
     */
    public void setImporteTipoEvaluatorio(Double importeTipoEvaluatorio)
    {
        this.importeTipoEvaluatorio = importeTipoEvaluatorio;
    }
    
    
    
    /**
     * @return Returns the intensidadProductivaBOE.
     */
    public Integer getIntensidadProductivaBOE()
    {
        return intensidadProductivaBOE;
    }
    
    
    
    /**
     * @param intensidadProductivaBOE The intensidadProductivaBOE to set.
     */
    public void setIntensidadProductivaBOE(Integer intensidadProductivaBOE)
    {
        this.intensidadProductivaBOE = intensidadProductivaBOE;
    }
    
    
    
    /**
     * @return Returns the isExento.
     */
    public Boolean isExento()
    {
        return isExento;
    }
    
    
    
    /**
     * @param isExento The isExento to set.
     */
    public void setExento(Boolean isExento)
    {
        this.isExento = isExento;
    }
    
    
    
    /**
     * @return Returns the isIBICondonado.
     */
    public Boolean isIBICondonado()
    {
        return isIBICondonado;
    }
    
    
    
    /**
     * @param isIBICondonado The isIBICondonado to set.
     */
    public void setIBICondonado(Boolean isIBICondonado)
    {
        this.isIBICondonado = isIBICondonado;
    }
    
    
    
    /**
     * @return Returns the isJornadasTeoricasCondonado.
     */
    public Boolean isJornadasTeoricasCondonado()
    {
        return isJornadasTeoricasCondonado;
    }
    
    
    
    /**
     * @param isJornadasTeoricasCondonado The isJornadasTeoricasCondonado to set.
     */
    public void setJornadasTeoricasCondonado(Boolean isJornadasTeoricasCondonado)
    {
        this.isJornadasTeoricasCondonado = isJornadasTeoricasCondonado;
    }
    
    
    
    /**
     * @return Returns the isVueloPiesSueltos.
     */
    public String isVueloPiesSueltos()
    {
        return indicadorVueloPiesSueltos;
    }
    
    
    
    /**
     * @param isVueloPiesSueltos The isVueloPiesSueltos to set.
     */
    public void setVueloPiesSueltos(String indicadorVueloPiesSueltos)
    {
        this.indicadorVueloPiesSueltos = indicadorVueloPiesSueltos;
    }
    
    
    
    /**
     * @return Returns the motivoMovimiento.
     */
    public String getMotivoMovimiento()
    {
        return motivoMovimiento;
    }
    
    
    
    /**
     * @param motivoMovimiento The motivoMovimiento to set.
     */
    public void setMotivoMovimiento(String motivoMovimiento)
    {
        this.motivoMovimiento = motivoMovimiento;
    }
    
    
    
    /**
     * @return Returns the nombreUsuarioModificador.
     */
    public String getNombreUsuarioModificador()
    {
        return nombreUsuarioModificador;
    }
    
    
    
    /**
     * @param nombreUsuarioModificador The nombreUsuarioModificador to set.
     */
    public void setNombreUsuarioModificador(String nombreUsuarioModificador)
    {
        this.nombreUsuarioModificador = nombreUsuarioModificador;
    }
    
    
    
    /**
     * @return Returns the numJornadasTeoricas.
     */
    public Float getNumJornadasTeoricas()
    {
        return numJornadasTeoricas;
    }
    
    
    
    /**
     * @param numJornadasTeoricas The numJornadasTeoricas to set.
     */
    public void setNumJornadasTeoricas(Float numJornadasTeoricas)
    {
        this.numJornadasTeoricas = numJornadasTeoricas;
    }
    
    
    
    /**
     * @return Returns the tipoAnterior.
     */
    public Double getTipoAnterior()
    {
        return tipoAnterior;
    }
    
    
    
    /**
     * @param tipoAnterior The tipoAnterior to set.
     */
    public void setTipoAnterior(Double tipoAnterior)
    {
        this.tipoAnterior = tipoAnterior;
    }
    
    
    
    /**
     * @return Returns the tipoMovimiento.
     */
    public String getTipoMovimiento()
    {
        return tipoMovimiento;
    }
    
    
    
    /**
     * @param tipoMovimiento The tipoMovimiento to set.
     */
    public void setTipoMovimiento(String tipoMovimiento)
    {
        this.tipoMovimiento = tipoMovimiento;
    }



	public Boolean getIsExento() {
		return isExento;
	}



	public void setIsExento(Boolean isExento) {
		this.isExento = isExento;
	}



	public Boolean getIsIBICondonado() {
		return isIBICondonado;
	}



	public void setIsIBICondonado(Boolean isIBICondonado) {
		this.isIBICondonado = isIBICondonado;
	}



	public Boolean getIsJornadasTeoricasCondonado() {
		return isJornadasTeoricasCondonado;
	}



	public void setIsJornadasTeoricasCondonado(Boolean isJornadasTeoricasCondonado) {
		this.isJornadasTeoricasCondonado = isJornadasTeoricasCondonado;
	}



	public String getIndicadorVueloPiesSueltos() {
		return indicadorVueloPiesSueltos;
	}



	public void setIndicadorVueloPiesSueltos(String indicadorVueloPiesSueltos) {
		this.indicadorVueloPiesSueltos = indicadorVueloPiesSueltos;
	}



	public String getClaseClutivo() {
		return claseClutivo;
	}



	public void setClaseClutivo(String claseClutivo) {
		this.claseClutivo = claseClutivo;
	}
    
    
    
}
