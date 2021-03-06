/**
 * GroupXMLUpload.java
 * � MINETUR, Government of Spain
 * This program is part of LocalGIS
 * This program is free software: you can redistribute it and/or modify it under the terms of the GNU General Public License as published by the Free Software Foundation, either version 2 of the License, or (at your option) any later version.
 * This program is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU General Public License for more details.
 * You should have received a copy of the GNU General Public License along with this program. If not, see <http://www.gnu.org/licenses/>.
 */
package es.satec.localgismobile.server.projectsync.xml.beans;

import java.util.List;

import es.satec.localgismobile.server.projectsync.xml.ConstantsXMLUpload;

/**
 * <g l1="refe" l2="www" l3="area" l4="Volumen" l5="Codigo Parcela" l6="Codigo Poligono" l7="ID de via" 
 * l8="Primer numero" l9="Primera letra" l10="Segundo numero" l11="Segunda letra" l12="Kilometro" l13="Bloque" 
 * l14="Direccion no estructurada" l15="Codigo postal" l16="Codigo Delegacion MEH" l17="Longitud" l18="area" 
 * l19="Fecha alta" l20="Fecha baja" stroke-dasharray="" editable="false" stroke-width="2.0" stroke="rgb(255,0,0)" 
 * fill="none" id="Parcelas" >
 * @author irodriguez
 *
 */
public class GroupXMLUpload {

	private String systemId;
	private String pkIdDB;
	private List<AttributeXMLUpload> attributeList;
	private List<FeatureXMLUpload> featureList;
	
	public GroupXMLUpload(List<AttributeXMLUpload> atributteList,
			List<FeatureXMLUpload> featureList) {
		super();
		this.attributeList = atributteList;
		this.featureList = featureList;
		updateIdLayer();
	}	
	public List<AttributeXMLUpload> getAttributeList() {
		return attributeList;
	}
	public void setAttributeList(List<AttributeXMLUpload> atributteList) {
		this.attributeList = atributteList;
		updateIdLayer();
	}
	public List<FeatureXMLUpload> getFeatureList() {
		return featureList;
	}
	public void setFeatureList(List<FeatureXMLUpload> featureList) {
		this.featureList = featureList;
	}
	public String getSystemId() {
		return systemId;
	}
	public String getPkIdDB() {
		return pkIdDB;
	}
	
	/**
	 * Actualiza el identificador de la capa (es un atajo al atributo id)
	 * Actualiza la clave primaria de la capa  (es un atajo al atributo l1)
	 */
	private void updateIdLayer(){
		AttributeXMLUpload attribute = null;
		for (int i = 0; i < attributeList.size(); i++) {
			attribute = attributeList.get(i);
			if(attribute.getKey().equals(ConstantsXMLUpload.ATT_SYSTEM_ID_LAYER)){
				systemId = attribute.getValue();			
				break;
			}
		}
		for (int i = 0; i < attributeList.size(); i++) {
			attribute = attributeList.get(i);
			if(attribute.getKey().equals(ConstantsXMLUpload.ATT_ID_LAYER)){	
				pkIdDB = attribute.getValue();
				break;
			}
		}			
	}	
	
}
