/**
 * CaracteresDeterminacionPanelBean.java
 * � MINETUR, Government of Spain
 * This program is part of LocalGIS
 * This program is free software: you can redistribute it and/or modify it under the terms of the GNU General Public License as published by the Free Software Foundation, either version 2 of the License, or (at your option) any later version.
 * This program is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU General Public License for more details.
 * You should have received a copy of the GNU General Public License along with this program. If not, see <http://www.gnu.org/licenses/>.
 */
package com.gestorfip.app.planeamiento.beans.diccionario;

public class CaracteresDeterminacionPanelBean {
	
	  private int id; 
	  private String codigo;
	  private String nombre;
	  private int aplicaciones_max;
	  private int aplicaciones_min;
	  private int fip;
	  
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getAplicaciones_max() {
		return aplicaciones_max;
	}
	public void setAplicaciones_max(int aplicacionesMax) {
		aplicaciones_max = aplicacionesMax;
	}
	public int getAplicaciones_min() {
		return aplicaciones_min;
	}
	public void setAplicaciones_min(int aplicacionesMin) {
		aplicaciones_min = aplicacionesMin;
	}
	public int getFip() {
		return fip;
	}
	public void setFip(int fip) {
		this.fip = fip;
	}
	

}
