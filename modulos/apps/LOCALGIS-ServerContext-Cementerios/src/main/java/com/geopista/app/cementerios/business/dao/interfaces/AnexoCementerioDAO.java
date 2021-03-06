/**
 * AnexoCementerioDAO.java
 * � MINETUR, Government of Spain
 * This program is part of LocalGIS
 * This program is free software: you can redistribute it and/or modify it under the terms of the GNU General Public License as published by the Free Software Foundation, either version 2 of the License, or (at your option) any later version.
 * This program is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU General Public License for more details.
 * You should have received a copy of the GNU General Public License along with this program. If not, see <http://www.gnu.org/licenses/>.
 */
package com.geopista.app.cementerios.business.dao.interfaces;

import java.sql.SQLException;
import java.util.List;

import com.geopista.app.cementerios.business.vo.AnexoCementerio;
import com.geopista.app.cementerios.business.vo.AnexoCementerioExample;
import com.geopista.app.cementerios.business.vo.AnexoCementerioKey;

public interface AnexoCementerioDAO {

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table cementerio.anexo_cementerio
	 * @throws SQLException 
	 * @ibatorgenerated  Mon Jul 11 14:45:21 CEST 2011
	 */
	int deleteByExample(AnexoCementerioExample example) throws SQLException;

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table cementerio.anexo_cementerio
	 * @ibatorgenerated  Mon Jul 11 14:45:21 CEST 2011
	 */
	int deleteByPrimaryKey(AnexoCementerioKey key) throws SQLException;

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table cementerio.anexo_cementerio
	 * @ibatorgenerated  Mon Jul 11 14:45:21 CEST 2011
	 */
	void insert(AnexoCementerio record) throws SQLException;

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table cementerio.anexo_cementerio
	 * @ibatorgenerated  Mon Jul 11 14:45:21 CEST 2011
	 */
	void insertSelective(AnexoCementerio record) throws SQLException;

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table cementerio.anexo_cementerio
	 * @ibatorgenerated  Mon Jul 11 14:45:21 CEST 2011
	 */
	List selectByExample(AnexoCementerioExample example) throws SQLException;

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table cementerio.anexo_cementerio
	 * @ibatorgenerated  Mon Jul 11 14:45:21 CEST 2011
	 */
	AnexoCementerio selectByPrimaryKey(AnexoCementerioKey key) throws SQLException;

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table cementerio.anexo_cementerio
	 * @ibatorgenerated  Mon Jul 11 14:45:21 CEST 2011
	 */
	int updateByExampleSelective(AnexoCementerio record,
			AnexoCementerioExample example) throws SQLException;

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table cementerio.anexo_cementerio
	 * @ibatorgenerated  Mon Jul 11 14:45:21 CEST 2011
	 */
	int updateByExample(AnexoCementerio record, AnexoCementerioExample example) throws SQLException;

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table cementerio.anexo_cementerio
	 * @ibatorgenerated  Mon Jul 11 14:45:21 CEST 2011
	 */
	int updateByPrimaryKeySelective(AnexoCementerio record) throws SQLException;

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table cementerio.anexo_cementerio
	 * @ibatorgenerated  Mon Jul 11 14:45:21 CEST 2011
	 */
	int updateByPrimaryKey(AnexoCementerio record) throws SQLException;
}