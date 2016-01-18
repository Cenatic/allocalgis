/**
 * SelectedLayerVO.java
 * � MINETUR, Government of Spain
 * This program is part of LocalGIS
 * This program is free software: you can redistribute it and/or modify it under the terms of the GNU General Public License as published by the Free Software Foundation, either version 2 of the License, or (at your option) any later version.
 * This program is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU General Public License for more details.
 * You should have received a copy of the GNU General Public License along with this program. If not, see <http://www.gnu.org/licenses/>.
 */
package com.geopista.app.reports.maps.vo;

public class SelectedLayerVO {
	
	private int idCapa;
	private String nombre;
	private String traduccion;
	
	 
	public SelectedLayerVO() {
		super();
	}

	
	public SelectedLayerVO(String nombre,String traduccion) {
		super();
		this.nombre = nombre;
		this.traduccion= traduccion;
	}

	public int getIdCapa() {
		return idCapa;
	}
	
	public void setIdCapa(int idCapa) {
		this.idCapa = idCapa;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String getTraduccion() {
		return traduccion;
	}
	
	public void setTraduccion(String traduccion) {
		this.traduccion = traduccion;
	}
	
    public String toString() {
        return traduccion;
    }
}
