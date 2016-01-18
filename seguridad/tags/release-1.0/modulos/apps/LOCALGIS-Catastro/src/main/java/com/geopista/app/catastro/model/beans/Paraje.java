package com.geopista.app.catastro.model.beans;

/**
 * Tipo de tipolog�a de local para mostrar en los desplegables
 * 
 * @author cotesa
 *
 */
public class Paraje extends EstructuraDB
{
    /**
     * c�digo del paraje
     */
    private String codigo;
    
    /**
     * nombre del paraje
     */
    private String nombre;
    
       
    /**
     * A�o de las normas origen de la tipolog�a
     */
    
    public Paraje()
    {        
    }

   
    /**
     * @return Returns the codigo.
     */
    public String getCodigo()
    {
        return codigo;
    }

    /**
     * @param codigo The codigo to set.
     */
    public void setCodigo(String codigo)
    {
        this.codigo = codigo;
    }

    /**
     * @return Returns the codigo.
     */
    public String getNombre()
    {
        return nombre;
    }

    /**
     * @param codigo The codigo to set.
     */
    public void setNombre(String nombre)
    {
        this.nombre = nombre;
    }

    
}
