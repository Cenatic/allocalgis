/**
 * TestGPSProvider.java
 * � MINETUR, Government of Spain
 * This program is part of LocalGIS
 * This program is licensed and may be used, modified and redistributed under the terms of the European Public License (EUPL), either version 1.1 or (at your option) any later version as soon as they are approved by the European Commission.
 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and more details.
 * You should have received a copy of the EUPL1.1 license along with this program; if not, you may find it at http://joinup.ec.europa.eu/software/page/eupl/licence-eupl
 */
package test;

import org.apache.log4j.Logger;

import es.satec.localgismobile.fw.Global;
import es.satec.svgviewer.localgis.GPSLocation;
import es.satec.svgviewer.localgis.GPSProvider;

public class TestGPSProvider implements GPSProvider {
	
	private static boolean started = false;
	
	private static Logger logger = Global.getLoggerFor(GPSProvider.class);

	public TestGPSProvider(){}
	
	public GPSLocation getGPSLocation() {
		if (!started) return null;
		
		// Longitud entre +1 y -6
		double longitude = Math.random()*7-6;	
		//CAMBIAR
		//double longitude = -5.664655;
		//double longitude = -5.790004-((new Date()).getSeconds()*0.0001);
		
		// Latitud entre 38 y 43
		double latitude = Math.random()*5+38;	
		//double latitude = 43.610025;
		//CAMBIAR
		//double latitude = 43.391651;
		//double latitude = 43.610025+((new Date()).getMinutes()*0.0001);
		
		// Altitud entre 0 y 1000
		double altitude = Math.random()*1000;		
		//double altitude = 5000;
		// Velocidad entre 0 y 10
		String speed = String.valueOf((int)(Math.random()*11));
		//String speed = String.valueOf(0);
		// Direccion
		String direction = "";
		if (Math.random() > 0.5) direction = "N";
		else direction = "S";
		if (Math.random() > 0.5) direction += "E";
		else direction += "W";
		// Calidad (siempre 1)
		String quality = "1";
		// Numero de satelites entre 3 y 7
		int numberOfSatellites = (int) (Math.random()*5)+3;
		
		return new GPSLocation(longitude, latitude, altitude, speed, direction, quality, numberOfSatellites);
	}

	public void startGPS() throws Exception {
		logger.debug("Arrancando gps");
		started = true;
	}

	public void stopGPS() {
		logger.debug("Parando gps");
		started = false;
	}

	public boolean isStarted() {
		return started;
	}
}
