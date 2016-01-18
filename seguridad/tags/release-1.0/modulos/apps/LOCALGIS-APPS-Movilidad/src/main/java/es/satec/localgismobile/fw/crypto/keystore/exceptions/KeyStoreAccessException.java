package es.satec.localgismobile.fw.crypto.keystore.exceptions;

/**
 * Excepci�n que indica que se ha producido un error al acceder al
 * almacen de claves
 * @author jpolo
 *
 */
public class KeyStoreAccessException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * Constructor por defecto. Pone el mensaje adecuado a la excepci�n
	 *
	 */
	public KeyStoreAccessException(){
		super("Se ha producido un error al acceder al almacen de claves");
	}
	
	/**
	 * Construye la excepci�n con el mensaje indicado por par�metro
	 * @param msg Mensaje a pasar
	 */
	public KeyStoreAccessException(String msg){
		super(msg);
	}
}
