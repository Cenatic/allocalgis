package es.satec.localgismobile.fw.image.exceptions;

/**
 * Excepci�n que indica que la imagen que se est� procesando
 * no tiene el formato esperado
 * @author jpolo
 *
 */
public class IncorrectImageFormatException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * Constructor por defecto de la excepci�n. Pone el mensaje
	 * adecuado
	 *
	 */
	public IncorrectImageFormatException(){
		super("Formato de imagen incorrecto");
	}
	
	/**
	 * Construye la excepci�n con el mensaje que se le indique
	 * @param msg Mensaje descriptivo de la excepci�n
	 */
	public IncorrectImageFormatException(String msg){
		super(msg);
	}
}
