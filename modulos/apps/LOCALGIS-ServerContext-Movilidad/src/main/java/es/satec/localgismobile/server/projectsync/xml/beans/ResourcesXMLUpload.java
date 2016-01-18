/**
 * ResourcesXMLUpload.java
 * � MINETUR, Government of Spain
 * This program is part of LocalGIS
 * This program is free software: you can redistribute it and/or modify it under the terms of the GNU General Public License as published by the Free Software Foundation, either version 2 of the License, or (at your option) any later version.
 * This program is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU General Public License for more details.
 * You should have received a copy of the GNU General Public License along with this program. If not, see <http://www.gnu.org/licenses/>.
 */
package es.satec.localgismobile.server.projectsync.xml.beans;

import java.util.Map;

public class ResourcesXMLUpload {

	private Map<String, ResourceXMLUpload> resourcesMap;
	
	public ResourcesXMLUpload(Map<String, ResourceXMLUpload> resourcesMap) {
		super();
		this.resourcesMap = resourcesMap;
	}

	public Map<String, ResourceXMLUpload> getResourcesMap() {
		return resourcesMap;
	}

	public void setResourcesMap(Map<String, ResourceXMLUpload> resourcesMap) {
		this.resourcesMap = resourcesMap;
	}
	
}
