/**
 * IMainLocalGISEIEL.java
 * � MINETUR, Government of Spain
 * This program is part of LocalGIS
 * This program is free software: you can redistribute it and/or modify it under the terms of the GNU General Public License as published by the Free Software Foundation, either version 2 of the License, or (at your option) any later version.
 * This program is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU General Public License for more details.
 * You should have received a copy of the GNU General Public License along with this program. If not, see <http://www.gnu.org/licenses/>.
 */
package com.geopista.app.eiel;

import com.geopista.security.GeopistaAcl;
import com.geopista.security.GeopistaPrincipal;

public interface IMainLocalGISEIEL {
    public boolean applySecurityPolicy(GeopistaAcl acl, GeopistaPrincipal principal);
}
