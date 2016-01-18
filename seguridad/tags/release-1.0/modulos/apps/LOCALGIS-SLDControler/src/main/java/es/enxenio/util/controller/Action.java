/*
 * Created on 09-jun-2004
 *
 */
package es.enxenio.util.controller;

/**
 * @author enxenio s.l.
 *
 */
public interface Action {
	
	/**Este m�todo realizar� una operaci�n determinada bas�ndose en los par�metros almacenados en un objeto Request
	 * @param request Instancia que contendr� los par�metros necesarios para llevar a cabo la operaci�n
	 * @return Un ActionForward que nos indica la siguiente acci�n a realizar*/
	public ActionForward doExecute(Request request);

}
