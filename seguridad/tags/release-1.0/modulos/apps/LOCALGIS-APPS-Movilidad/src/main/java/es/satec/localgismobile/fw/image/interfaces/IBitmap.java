package es.satec.localgismobile.fw.image.interfaces;

/**
 * Interfaz que representa una imagen de tipo bitmap
 * @author jpolo
 *
 */
public interface IBitmap {
	
	/**
	 * Obtiene el byte indicado por el �ndice
	 * @param index �ndice del que se desea obtener el byte del bitmap
	 * @return Byte del bitmap indicado por el �ndice
	 */
	public byte getByte(int index);

	/**
	 * Fija el valor del byte indicado por el �ndice
	 * @param index �ndice del byte cuyo valor se desea fijar
	 * @param value Valor que se desea para ese byte
	 */
	public void setByte(int index, byte value);	
	
	/**
	 * Obtiene el n�mero de bytes del bitmap
	 * @return N�mero de bytes del bitmap
	 */
	public int getNumberOfBytes();
}
