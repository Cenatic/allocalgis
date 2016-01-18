package es.satec.localgismobile.fw.crypto.keystore.exceptions;

/**
 * Excepcion que indica que no se ha encontrado la clave
 * en un almac�n de claves
 * @author jpolo
 *
 */
public class KeyNotFoundException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Constructor por defecto de la excepci�n. Pone el mensaje
	 * adecuado
	 *
	 */
	public KeyNotFoundException(){
		super("La clave no ha sido encontrada");
	}
}
