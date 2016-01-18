/**
 * IPixelPath.java
 * � MINETUR, Government of Spain
 * This program is part of LocalGIS
 * This program is licensed and may be used, modified and redistributed under the terms of the European Public License (EUPL), either version 1.1 or (at your option) any later version as soon as they are approved by the European Commission.
 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and more details.
 * You should have received a copy of the EUPL1.1 license along with this program; if not, you may find it at http://joinup.ec.europa.eu/software/page/eupl/licence-eupl
 */
package es.satec.localgismobile.fw.crypto.keystore.imagekeystore.pixelpath;

/**
 * Genera un recorrido a trav�s de los p�xeles de una imagen
 * @author jpolo
 *
 */
public interface IPixelPath {
	/**
	 * Obtiene el �ndice del siguiente pixel
	 * @return El �ndice del siguiente pixel
	 */
	public int getNextPathIndex();
	
	/**
	 * Resetea el recorrido, situ�ndose al comienzo
	 * del mismo
	 *
	 */
	public void resetPath();
	
	/**
	 * Obtiene la posici�n en�sima del recorrido de p�xeles
	 * @param index �ndice de la posici�n del recorrido de la imagen
	 * de la que se quiere conocer el p�xel correspondiente
	 * @return El p�xel correspondiente a la posici�n indicada
	 * del recorrido de la imagen
	 */
	public int getPathIndex(int index);
}
