/**
 * DeterminacionesReguladorasPanelBean.java
 * � MINETUR, Government of Spain
 * This program is part of LocalGIS
 * This program is free software: you can redistribute it and/or modify it under the terms of the GNU General Public License as published by the Free Software Foundation, either version 2 of the License, or (at your option) any later version.
 * This program is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU General Public License for more details.
 * You should have received a copy of the GNU General Public License along with this program. If not, see <http://www.gnu.org/licenses/>.
 */
package com.gestorfip.app.planeamiento.beans.panels.tramite;



public class DeterminacionesReguladorasPanelBean {

	private DeterminacionPanelBean[] lstDeterminacionesAsoc;
	private DeterminacionPanelBean[] lstDeterminacionesAsocAlta;
	
	// se utiliza para tener en cliente los id(primary key) de los objetos de la tabla
	//tramite_determinacion_valoresreferencia
	private int[] lstIDAsoc;
	private int[] lstIDAsocEliminar;
	private int[] lstIDAsocAlta;
	
	public int[] getLstIDAsocEliminar() {
		return lstIDAsocEliminar;
	}

	public void setLstIDAsocEliminar(int[] lstIDAsocEliminar) {
		this.lstIDAsocEliminar = lstIDAsocEliminar;
	}

	public int[] getLstIDAsocAlta() {
		return lstIDAsocAlta;
	}

	public void setLstIDAsocAlta(int[] lstIDAsocAlta) {
		this.lstIDAsocAlta = lstIDAsocAlta;
	}

	public int[] getLstIDAsoc() {
		return lstIDAsoc;
	}

	public void setLstIDAsoc(int[] lstIDAsoc) {
		this.lstIDAsoc = lstIDAsoc;
	}

	public DeterminacionPanelBean[] getLstDeterminacionesAsoc() {
		return lstDeterminacionesAsoc;
	}

	public void setLstDeterminacionesAsoc(DeterminacionPanelBean[] lstDeterminacionesAsoc) {
		this.lstDeterminacionesAsoc = lstDeterminacionesAsoc;
	}
	
	public DeterminacionPanelBean[] getLstDeterminacionesAsocAlta() {
		return lstDeterminacionesAsocAlta;
	}

	public void setLstDeterminacionesAsocAlta(
			DeterminacionPanelBean[] lstDeterminacionesAsocAlta) {
		this.lstDeterminacionesAsocAlta = lstDeterminacionesAsocAlta;
	}


}
