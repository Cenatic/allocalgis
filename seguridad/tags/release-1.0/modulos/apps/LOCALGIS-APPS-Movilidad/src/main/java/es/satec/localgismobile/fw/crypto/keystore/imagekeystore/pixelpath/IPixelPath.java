package es.satec.localgismobile.fw.crypto.keystore.imagekeystore.pixelpath;

/**
 * Genera un recorrido a trav�s de los p�xeles de una imagen
 * @author jpolo
 *
 */
public interface IPixelPath {
	/**
	 * Obtiene el �ndice del siguiente pixel
	 * @return El �ndice del siguiente pixel
	 */
	public int getNextPathIndex();
	
	/**
	 * Resetea el recorrido, situ�ndose al comienzo
	 * del mismo
	 *
	 */
	public void resetPath();
	
	/**
	 * Obtiene la posici�n en�sima del recorrido de p�xeles
	 * @param index �ndice de la posici�n del recorrido de la imagen
	 * de la que se quiere conocer el p�xel correspondiente
	 * @return El p�xel correspondiente a la posici�n indicada
	 * del recorrido de la imagen
	 */
	public int getPathIndex(int index);
}
