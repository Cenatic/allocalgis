package es.satec.svgviewer.localgis;

/**
 * Representa una regi�n de la tierra mediante dos esquinas opuestas de un rect�ngulo
 * expresadas en coordenadas geod�sicas.
 * @author jpresa
 */
public class BoundingBox {

	/**
	 * Longitud m�nima de la regi�n.
	 */
	private double minLongitude;
	/**
	 * Latitud m�nima de la regi�n.
	 */
	private double minLatitude;
	/**
	 * Longitud m�xima de la regi�n.
	 */
	private double maxLongitude;
	/**
	 * Latitud m�xima de la regi�n.
	 */
	private double maxLatitude;
	
	/**
	 * @param minLongitude Longitud m�nima de la regi�n.
	 * @param minLatitude Latitud m�nima de la regi�n.
	 * @param maxLongitude Longitud m�xima de la regi�n.
	 * @param maxLatitude Latitud m�xima de la regi�n.
	 */
	public BoundingBox(double minLongitude, double minLatitude, double maxLongitude, double maxLatitude) {
		this.minLongitude = minLongitude;
		this.minLatitude = minLatitude;
		this.maxLongitude = maxLongitude;
		this.maxLatitude = maxLatitude;
	}

	public double getMaxLatitude() {
		return maxLatitude;
	}

	public void setMaxLatitude(double maxLatitude) {
		this.maxLatitude = maxLatitude;
	}

	public double getMaxLongitude() {
		return maxLongitude;
	}

	public void setMaxLongitude(double maxLongitude) {
		this.maxLongitude = maxLongitude;
	}

	public double getMinLatitude() {
		return minLatitude;
	}

	public void setMinLatitude(double minLatitude) {
		this.minLatitude = minLatitude;
	}

	public double getMinLongitude() {
		return minLongitude;
	}

	public void setMinLongitude(double minLongitude) {
		this.minLongitude = minLongitude;
	}
	
	/**
	 * Indica si un punto geod�sico est� contenido en esta regi�n.
	 * @param longitude Longitud del punto.
	 * @param latitude Latitud del punto.
	 * @return true si el punto est� contenido; false en caso contrario.
	 */
	public boolean contains(double longitude, double latitude) {
		if (minLongitude>longitude) return false;
		if (minLatitude>latitude) return false;
		if (maxLongitude<longitude) return false;
		if (maxLatitude<latitude) return false;
		return true;
	}

	/**
	 * Indica si otra regi�n est� totalmente contenida en esta regi�n.
	 * @param other La otra regi�n.
	 * @return true si la regi�n est� contenida; false en caso contrario.
	 */
	public boolean contains(BoundingBox other) {
		if (minLongitude>other.minLongitude) return false;
		if (minLatitude>other.minLatitude) return false;
		if (maxLongitude<other.maxLongitude) return false;
		if (maxLatitude<other.maxLatitude) return false;
		return true;
	}

	/** Indica si otra regi�n coincide parcial o totalmente con esta regi�n.
	 * @param other La otra regi�n.
	 * @return true si hay intersecci�n; false si son disjuntas.
	 */
	public boolean intersects(BoundingBox other) {
		if (minLongitude > other.maxLongitude) return false; // sale por la izquierda
		if (maxLongitude < other.minLongitude) return false; // sale por la derecha
		if (minLatitude > other.maxLatitude) return false; // sale por abajo
		if (maxLatitude < other.minLatitude) return false; // sale por arriba
		return true;
	}
	/**
	 * Indica si el objeto proporcionado es equivalente al actual.
	 * @param obj El objeto proporcionado.
	 * @return true si el objeto es una instancia de BoundingBox y sus coordenadas l�mite son las mismas.
	 */
	public boolean equals(Object obj) {
		if (obj instanceof BoundingBox) {
			BoundingBox another = (BoundingBox) obj;
			return another.minLongitude==this.minLongitude && another.minLatitude==this.minLatitude
				&& another.maxLongitude==this.maxLongitude && another.maxLatitude==this.maxLatitude;
		}
		else return false;
	}

	/**
	 * Devuelve una representaci�n del objeto como una cadena de texto, con el formato
	 * "longitud m�nima, latitud m�nima, longitud m�xima, latitud m�xima".
	 * @return Representaci�n del objeto como una cadena de texto.
	 */
	public String toString() {
		return minLongitude + "," + minLatitude + "," + maxLongitude + "," + maxLatitude;
	}

}
