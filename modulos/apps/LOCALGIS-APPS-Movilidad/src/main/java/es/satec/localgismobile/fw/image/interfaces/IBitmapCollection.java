/**
 * IBitmapCollection.java
 * � MINETUR, Government of Spain
 * This program is part of LocalGIS
 * This program is licensed and may be used, modified and redistributed under the terms of the European Public License (EUPL), either version 1.1 or (at your option) any later version as soon as they are approved by the European Commission.
 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and more details.
 * You should have received a copy of the EUPL1.1 license along with this program; if not, you may find it at http://joinup.ec.europa.eu/software/page/eupl/licence-eupl
 */
package es.satec.localgismobile.fw.image.interfaces;

import java.io.IOException;

import es.satec.localgismobile.fw.image.exceptions.IncorrectImageFormatException;

/**
 * Interfaz que representa una colecci�n de bitmaps
 * @author jpolo
 *
 */
public interface IBitmapCollection {
	/**
	 * Obtiene el n�mero de bitmaps de la colecci�n
	 * @return N�mero de bitmaps de la colecci�n
	 */
	public int getNumberOfBitmaps();
	
	/**
	 * Obtiene el bitmap indicada por el �ndice
	 * @param index �ndice del bitmap que se desea obtener
	 * @return Bitmap correspondiente al �ndice indicado
	 */
	public IBitmap getBitmap(int index);
	
	/**
	 * Carga la colecci�n de bitmaps en disco
	 * @param path Ruta de donde cargar la colecci�n
	 * @throws IOException Si se produce alg�n error durante el acceso
	 * a disco
	 * @throws IncorrectImageFormatException Si la colecci�n de bitmaps
	 * no se encontraba en el formato esperado
	 */
	public void loadFromDisk(String path) throws IOException, IncorrectImageFormatException;
	
	/**
	 * Guarda la colecci�n de bitmaps en disco
	 * @param path Ruta de donde guardar la colecci�n
	 * @throws IOException Si se produce alg�n error durante el acceso
	 * a disco
	 */
	public void saveToDisk(String path) throws IOException;
}
