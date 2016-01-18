/**
 * DatosEconomicosConstruccion.java
 * � MINETUR, Government of Spain
 * This program is part of LocalGIS
 * This program is free software: you can redistribute it and/or modify it under the terms of the GNU General Public License as published by the Free Software Foundation, either version 2 of the License, or (at your option) any later version.
 * This program is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU General Public License for more details.
 * You should have received a copy of the GNU General Public License along with this program. If not, see <http://www.gnu.org/licenses/>.
 */
package com.geopista.app.catastro.model.datos.economicos;

import java.io.Serializable;


public class DatosEconomicosConstruccion implements Serializable {
    
    
    /**
     * Seg�n el Cuadro Marco de Valores, a efectos de c�lculo de la correcci�n de
     * valor por antig�edad de la construcci�n.
     * codCategoriaPredominante puede tomar los valores: 1-9, A, B y C
     */
    private String codCategoriaPredominante;
    
    /**
     * Este c�digo estar� compuesto por:
     * Primer car�cter: T/A (a todos/a alguno).
     * Segundo car�cter: L/C (a locales / a cargos).
     * Tercer car�cter: 1/2/3/4 (proporci�n del reparto/ por partes iguales, por
     * superficie de los locales, por coeficientes de propiedad, por coeficientes
     * especificamente determinados).
     */
    private String codModalidadReparto;
    /**
     * Puede tomar los valores: 0/1/2/3/4/5/6/7/8/9/T/N/E/V.
     * S�lo viene relleno en caso de tratarse de un local com�n
     */
    private String codTipoValor;
    
    /**
     * A efectos del c�lculo de la correci�n por antig�edad de la construcci�n.
     */
    private String codUsoPredominante;
    /**
     * Valor del coeficiente corrector por apreciaci�n o depreciaci�n econ�mica, 1
     * entero y dos decimales.
     */
    private Float correctorApreciacion;
    /**
     * Puede tomar los valores: S o N.
     */
    private Boolean correctorVivienda;
    
    /**
     * Valor seg�n Normas T�cnicas de Valoraci�n
     */
    private String tipoConstruccion = "";
    
    /**
     * Constructor por defecto
     *
     */
    public DatosEconomicosConstruccion()
    {
        
    }    
    
    /**
     * @return Returns the codCategoriaPredominante.
     */
    public String getCodCategoriaPredominante()
    {
        return codCategoriaPredominante;
    }
    
    /**
     * @param codCategoriaPredominante The codCategoriaPredominante to set.
     */
    public void setCodCategoriaPredominante(String codCategoriaPredominante)
    {
        this.codCategoriaPredominante = codCategoriaPredominante;
    }
    
    /**
     * @return Returns the codModalidadReparto.
     */
    public String getCodModalidadReparto()
    {
        return codModalidadReparto;
    }
    
    /**
     * @param codModalidadReparto The codModalidadReparto to set.
     */
    public void setCodModalidadReparto(String codModalidadReparto)
    {
        this.codModalidadReparto = codModalidadReparto;
    }
    
    /**
     * @return Returns the codTipoValor.
     */
    public String getCodTipoValor()
    {
        return codTipoValor;
    }
    
    /**
     * @param codTipoValor The codTipoValor to set.
     */
    public void setCodTipoValor(String codTipoValor)
    {
        this.codTipoValor = codTipoValor;
    }
    
    /**
     * @return Returns the codUsoPredominante.
     */
    public String getCodUsoPredominante()
    {
        return codUsoPredominante;
    }
    
    /**
     * @param codUsoPredominante The codUsoPredominante to set.
     */
    public void setCodUsoPredominante(String codUsoPredominante)
    {
        this.codUsoPredominante = codUsoPredominante;
    }
    
    /**
     * @return Returns the correctorApreciaci�n.
     */
    public Float getCorrectorApreciacion()
    {
        return correctorApreciacion;
    }
    
    /**
     * @param correctorApreciaci�n The correctorApreciaci�n to set.
     */
    public void setCorrectorApreciacion(Float correctorApreciacion)
    {
        this.correctorApreciacion = correctorApreciacion;
    }

    /**
     * Metodo especial para parsear los objeto con java2xml, no usar, utilizar el is
     * */
    public String getCorrectorVivienda()
    {
        if(correctorVivienda!=null && correctorVivienda.booleanValue())
        {
            return "S";
        }
        return "N";
    }

    /**
     * @return Returns the correctorVivienda.
     */
    public Boolean isCorrectorVivienda()
    {
        return correctorVivienda;
    }
    
    /**
     * @param correctorVivienda The correctorVivienda to set.
     */
    public void setCorrectorVivienda(Boolean correctorVivienda)
    {
        this.correctorVivienda = correctorVivienda;
    }
    
    /**
     * @return Returns the tipoConstruccion.
     */
    public String getTipoConstruccion()
    {
        return tipoConstruccion;
    }
    
    /**
     * @param tipoConstruccion The tipoConstruccion to set.
     */
    public void setTipoConstruccion(String tipoConstruccion)
    {
        this.tipoConstruccion = tipoConstruccion;
    }
    
    /**
     * Serializa el objeto 
     * 
     * @return Cadena con el XML
     */
    public String toXML ()
    {
        return null;
    }
    
}
