/*
 * Created on 10-jun-2004
 *
 */
package es.enxenio.util.controller;

/**
 * @author enxenio s.l.
 *
 */
public interface Request {
	
	/**Este m�todo recuperar� el valor de un par�metro almacenado en el Mapa
	 * @param paramKey La clave que identifica al par�metro
	 * @return El objeto que contiene el valor del par�metro
	 */
	public Object getAttribute(String paramKey);
	
	/**Este m�todo a�adir� una nueva entrada al HashMap
	 * @param paramKey La clave que identificar� a la nueva entrada
	 * @param paramValue El objeto que queremos almacenar en el HashMap
	 */
	public void setAttribute(String paramKey, Object paramValue);
	
}
