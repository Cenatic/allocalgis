package com.geopista.app.catastro.model.beans;

public class EstructuraDB
{
    /**
     * Patr�n alfanum�rico �nico
     */
    private String patron=new String();
    /**
     * Descripci�n del patr�n
     */
    private String descripcion = new String();
    
    public EstructuraDB()
    {
        
    }

    /**
     * @return Returns the descripcion.
     */
    public String getDescripcion()
    {
        return descripcion;
    }

    /**
     * @param descripcion The descripcion to set.
     */
    public void setDescripcion(String descripcion)
    {
        this.descripcion = descripcion;
    }

    /**
     * @return Returns the patron.
     */
    public String getPatron()
    {
        return patron;
    }

    /**
     * @param patron The patron to set.
     */
    public void setPatron(String patron)
    {
        this.patron = patron;
    }
    
    public boolean equals (Object o)
    {
        if (!(o instanceof EstructuraDB))
            return false;
        
        if (((EstructuraDB)o).getPatron().equalsIgnoreCase(this.patron))
        {
            setDescripcion(((EstructuraDB)o).getDescripcion());
            return true;
        }            
        else 
            return false;
    }    
}
