/**
 * DatosFallecimientoDAO.java
 * � MINETUR, Government of Spain
 * This program is part of LocalGIS
 * This program is free software: you can redistribute it and/or modify it under the terms of the GNU General Public License as published by the Free Software Foundation, either version 2 of the License, or (at your option) any later version.
 * This program is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU General Public License for more details.
 * You should have received a copy of the GNU General Public License along with this program. If not, see <http://www.gnu.org/licenses/>.
 */
package com.geopista.app.cementerios.business.dao.interfaces;

import java.sql.SQLException;
import java.util.List;

import com.geopista.app.cementerios.business.vo.DatosFallecimiento;
import com.geopista.app.cementerios.business.vo.DatosFallecimientoExample;

public interface DatosFallecimientoDAO {

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table cementerio.datosfallecimiento
	 * @throws SQLException 
	 * @ibatorgenerated  Wed Jul 27 11:11:23 CEST 2011
	 */
	int deleteByExample(DatosFallecimientoExample example) throws SQLException;

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table cementerio.datosfallecimiento
	 * @ibatorgenerated  Wed Jul 27 11:11:23 CEST 2011
	 */
	int deleteByPrimaryKey(Integer id) throws SQLException;

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table cementerio.datosfallecimiento
	 * @ibatorgenerated  Wed Jul 27 11:11:23 CEST 2011
	 */
	Integer insert(DatosFallecimiento record) throws SQLException;

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table cementerio.datosfallecimiento
	 * @ibatorgenerated  Wed Jul 27 11:11:23 CEST 2011
	 */
	Integer insertSelective(DatosFallecimiento record) throws SQLException;

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table cementerio.datosfallecimiento
	 * @ibatorgenerated  Wed Jul 27 11:11:23 CEST 2011
	 */
	List selectByExample(DatosFallecimientoExample example) throws SQLException;

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table cementerio.datosfallecimiento
	 * @ibatorgenerated  Wed Jul 27 11:11:23 CEST 2011
	 */
	DatosFallecimiento selectByPrimaryKey(Integer id) throws SQLException;

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table cementerio.datosfallecimiento
	 * @ibatorgenerated  Wed Jul 27 11:11:23 CEST 2011
	 */
	int updateByExampleSelective(DatosFallecimiento record,
			DatosFallecimientoExample example) throws SQLException;

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table cementerio.datosfallecimiento
	 * @ibatorgenerated  Wed Jul 27 11:11:23 CEST 2011
	 */
	int updateByExample(DatosFallecimiento record,
			DatosFallecimientoExample example) throws SQLException;

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table cementerio.datosfallecimiento
	 * @ibatorgenerated  Wed Jul 27 11:11:23 CEST 2011
	 */
	int updateByPrimaryKeySelective(DatosFallecimiento record) throws SQLException;

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table cementerio.datosfallecimiento
	 * @ibatorgenerated  Wed Jul 27 11:11:23 CEST 2011
	 */
	int updateByPrimaryKey(DatosFallecimiento record) throws SQLException;

	/**
	 * Set the iBATIS Database Layer SqlMapClient to work with.
	 * @param sqlMapper
	 */
//	void setSqlMapClient(SqlMapClient sqlMapper) throws SQLException;
	

	int selectByLastSeqKey() throws SQLException;
}