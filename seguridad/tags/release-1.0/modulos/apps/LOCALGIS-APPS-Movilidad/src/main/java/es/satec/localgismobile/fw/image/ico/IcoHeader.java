package es.satec.localgismobile.fw.image.ico;

/**
 * Clase que contiene la cabecera del icono con la informaci�n
 * acerca de su contenido
 * @author jpolo
 *
 */
public class IcoHeader {
	/**
	 * Tama�o de la cabecera
	 */
	protected int headerSize; // Siempre 40
	/**
	 * Ancho del icono
	 */
	protected int width;
	/**
	 * Altura del icono
	 */
	protected int height;
	/**
	 * N�mero de componentes de color del icono
	 */
	protected int numberOfPlanes;
	/**
	 * N�mero de bits por p�xel
	 */
	protected int bitsPerPixel;
	/**
	 * Tama�o del icono en bytes
	 */
	protected int imageSize;
	/**
	 * Tipo de compresi�n del icono
	 */
	protected int compression;
	
	public int getCompression() {
		return compression;
	}
	public void setCompression(int compression) {
		this.compression = compression;
	}
	public int getBitsPerPixel() {
		return bitsPerPixel;
	}
	public void setBitsPerPixel(int bitsPerPixel) {
		this.bitsPerPixel = bitsPerPixel;
	}
	public int getHeaderSize() {
		return headerSize;
	}
	public void setHeaderSize(int headerSize) {
		this.headerSize = headerSize;
	}
	public int getHeight() {
		return height;
	}
	public int getNumberOfPlanes() {
		return numberOfPlanes;
	}
	public void setNumberOfPlanes(int numberOfPlanes) {
		this.numberOfPlanes = numberOfPlanes;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public int getImageSize() {
		return imageSize;
	}
	public void setImageSize(int imageSize) {
		this.imageSize = imageSize;
	}
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	
	
}
