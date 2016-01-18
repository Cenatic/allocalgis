package com.geopista.app.catastro.model.beans;

import java.io.Serializable;


public class NumeroFincaRegistral implements Serializable{
	/**
	 * Registro de la propiedad = Codigo de Provincia + Codigo del registro de la propiedad
	 * 5 d�gitos.
	 */
	private RegistroPropiedad registroPropiedad;
	
	/**
	 * Seccion.
	 */
	private String seccion;
	
	/**
	 * N�mero de finca. 6 d�gitos.
	 */
	private String numFinca;
	
	/**
	 * N�mero de subfinca registral.
	 */
	private String numSubFinca;
	
	/**
	 * N�mero de finca registral = registroPropiedad + seccion + numFinca + numSubFinca
	 */
	private String numFincaRegistral;
    
	/**
	 * Tama�o que debe tener el n�mero de finca registral.
	 */
    private static int TAM_NUMFINCAREGISTRAL = 19;
    private static int TAM_REGPROPIEDAD = 5;
    private static int TAM_SECCION = 2;
    private static int TAM_NUMFINCA = 6;
    private static int TAM_NUMSUBFINCA = 6;
	
    /**
     * 
     * @param registroPropiedad
     * @param seccion
     * @param numFinca
     * @param numSubFinca
     */
	public NumeroFincaRegistral(RegistroPropiedad registroPropiedad, String seccion, String numFinca, String numSubFinca)
	{
		if(registroPropiedad!=null){
//			rellena el numero de registro de propiedad con 0's delante hasta completar su tama�o
            StringBuffer str = new StringBuffer(registroPropiedad.getRegistroPropiedad());
            int strLength  = str.length();
            for ( int i = 0; i <= TAM_REGPROPIEDAD ; i ++ ) {
                if (i < TAM_REGPROPIEDAD - strLength) 
                    str.insert( 0, '0' );
            }
            registroPropiedad = new RegistroPropiedad(str.toString());
		}
		this.registroPropiedad = registroPropiedad;
		
		if(seccion!=null){
//			rellena el numero de secci�n con 0's delante hasta completar su tama�o
            StringBuffer str = new StringBuffer(seccion);
            int strLength  = str.length();
            for ( int i = 0; i <= TAM_SECCION ; i ++ ) {
                if (i < TAM_SECCION - strLength) 
                    str.insert( 0, '0' );
            }
            seccion = str.toString();
		}
		this.seccion = seccion;
		
		if(numFinca!=null){
//			rellena el numero de finca con 0's delante hasta completar su tama�o
            StringBuffer str = new StringBuffer(numFinca);
            int strLength  = str.length();
            for ( int i = 0; i <= TAM_NUMFINCA ; i ++ ) {
                if (i < TAM_NUMFINCA - strLength) 
                    str.insert( 0, '0' );
            }
            numFinca = str.toString();
		}
		this.numFinca = numFinca;
		
		if(numSubFinca!=null){
//			rellena el numero de subfinca con 0's delante hasta completar su tama�o
            StringBuffer str = new StringBuffer(numSubFinca);
            int strLength  = str.length();
            for ( int i = 0; i <= TAM_NUMSUBFINCA ; i ++ ) {
                if (i < TAM_NUMSUBFINCA - strLength) 
                    str.insert( 0, '0' );
            }
            numSubFinca = str.toString();
		}
		this.numSubFinca = numSubFinca;
		
		this.numFincaRegistral = 
            registroPropiedad.getRegistroPropiedad() + seccion + numFinca + numSubFinca;
	}

    public NumeroFincaRegistral (String numFincaRegistral)
    {
        if (numFincaRegistral!=null){
            //rellena el numero de finca registral con 0's delante hasta completar su tama�o
            StringBuffer str = new StringBuffer(numFincaRegistral);
            int strLength  = str.length();
            for ( int i = 0; i <= TAM_NUMFINCAREGISTRAL ; i ++ ) {
                if (i < TAM_NUMFINCAREGISTRAL - strLength) 
                    str.insert( 0, '0' );
            }
            numFincaRegistral = str.toString();
            //Registro de la propiedad 5 d�gitos, secci�n 2 d�gitos, n�mero finca 6 d�gitos, 
            //subfinca 6 d�gitos
            this.registroPropiedad = new RegistroPropiedad(numFincaRegistral.substring(0, 5));
            this.seccion= numFincaRegistral.substring(5, 7);
            this.numFinca = numFincaRegistral.substring(7, 13);
            this.numSubFinca= numFincaRegistral.substring(13, 19);
            this.numFincaRegistral = numFincaRegistral;
        }
    }
    
    public NumeroFincaRegistral (){
    	
    }
    
    /**
     * Devuelve el n�mero de finca.
     * @return String con el n�mero de finca.
     */
	public String getNumFinca() {
		return numFinca;
	}

	/**
	 * Guarda el n�mero de finca. 
	 * @param numFinca N�mero de finca a guardar.
	 */
	public void setNumFinca(String numFinca) {
		this.numFinca = numFinca;
	}

	/**
	 * Devuelve el n�mero de subfinca.
	 * @return String con el n�mero de Subfinca.
	 */
	public String getNumSubFinca() {
		return numSubFinca;
	}
	
	/**
	 * Guarda el n�mero de subfinca.
	 * @param numSubFinca String con el n�mero de subfinca.
	 */
	public void setNumSubFinca(String numSubFinca) {
		this.numSubFinca = numSubFinca;
	}

	/**
	 * Devuelve el n�mero del registro de la propiedad.
	 * @return String con el registro de la propiedad.
	 */
	public RegistroPropiedad getRegistroPropiedad() {
		return registroPropiedad;
	}

	/**
	 * Guarda el registro de la propiedad.
	 * @param registroPropiedad String con el registro de la propiedad.
	 */
	public void setRegistroPropiedad(RegistroPropiedad registroPropiedad) {
		this.registroPropiedad = registroPropiedad;
	}

	/**
	 * Devuelve la seccion.
	 * @return String con la seccion.
	 */
	public String getSeccion() {
		return seccion;
	}

	/**
	 * Guarda la seccion.
	 * @param seccion String con la seccion a cargar.
	 */
	public void setSeccion(String seccion) {
		this.seccion = seccion;
	}

	/**
	 * Devuelve el n�mero de la finca registral.
	 * @return String con el n�mero de finca registral.
	 */
	public String getNumFincaRegistral() {
		return numFincaRegistral;
	}

	/**
	 * Guarda el n�mero de finca registral.
	 * @param numFincaRegistral String con el n�mero de finca registral.
	 */
	public void setNumFincaRegistral(String numFincaRegistral) {
		this.numFincaRegistral = numFincaRegistral;
	}
	

}
