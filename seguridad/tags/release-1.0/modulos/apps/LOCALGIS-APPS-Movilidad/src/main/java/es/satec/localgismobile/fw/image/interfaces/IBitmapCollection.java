package es.satec.localgismobile.fw.image.interfaces;

import java.io.IOException;

import es.satec.localgismobile.fw.image.exceptions.IncorrectImageFormatException;

/**
 * Interfaz que representa una colecci�n de bitmaps
 * @author jpolo
 *
 */
public interface IBitmapCollection {
	/**
	 * Obtiene el n�mero de bitmaps de la colecci�n
	 * @return N�mero de bitmaps de la colecci�n
	 */
	public int getNumberOfBitmaps();
	
	/**
	 * Obtiene el bitmap indicada por el �ndice
	 * @param index �ndice del bitmap que se desea obtener
	 * @return Bitmap correspondiente al �ndice indicado
	 */
	public IBitmap getBitmap(int index);
	
	/**
	 * Carga la colecci�n de bitmaps en disco
	 * @param path Ruta de donde cargar la colecci�n
	 * @throws IOException Si se produce alg�n error durante el acceso
	 * a disco
	 * @throws IncorrectImageFormatException Si la colecci�n de bitmaps
	 * no se encontraba en el formato esperado
	 */
	public void loadFromDisk(String path) throws IOException, IncorrectImageFormatException;
	
	/**
	 * Guarda la colecci�n de bitmaps en disco
	 * @param path Ruta de donde guardar la colecci�n
	 * @throws IOException Si se produce alg�n error durante el acceso
	 * a disco
	 */
	public void saveToDisk(String path) throws IOException;
}
