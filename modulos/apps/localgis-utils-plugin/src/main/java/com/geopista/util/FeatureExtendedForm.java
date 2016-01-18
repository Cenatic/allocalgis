/**
 * FeatureExtendedForm.java
 * � MINETUR, Government of Spain
 * This program is part of LocalGIS
 * This program is free software: you can redistribute it and/or modify it under the terms of the GNU General Public License as published by the Free Software Foundation, either version 2 of the License, or (at your option) any later version.
 * This program is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU General Public License for more details.
 * You should have received a copy of the GNU General Public License along with this program. If not, see <http://www.gnu.org/licenses/>.
 */
package com.geopista.util;

import com.geopista.feature.AbstractValidator;

/**
 * Interfaz para insertar un formulario extendido en el di�logo de las Features.
 * @author juacas
 */
public interface FeatureExtendedForm {
	
	/**
	 * Se invoca cuando se carga la clase desde el di�logo autom�tico
	 *Debe agregar todos los paneles al FeatureDialogHome
	 */
	void initialize(FeatureDialogHome home);
	/**
	 * Informa del contexto de aplicaci�n com�n para todos los componentes.
	 * Este contexto provee servicios de Blackboard y otros.
	 * @param context
	 */
	void setApplicationContext(ApplicationContext context);
	/**
	 * Realiza la validaci�n de los datos que est�n en los formularios.
	 *
	 * @return True si todos est�n bien. False si hay alg�n error.
	 */
	boolean checkPanels();
	
	/**
	 * Obtiene una implementaci�n del validador donde se pueden obtener los errores que han ocurrido en 
	 * el panel. Si se identifican los campos que est�n incorrectos el FeatureDialogHome puede resaltarlos 
	 * en el interfaz gr�fico.
	 * @return Un Validador
	 */
	AbstractValidator getValidator();

    /**
     * Bloquea la pantalla cuando la capa no se puede editar
     */
    public void disableAll();
}
