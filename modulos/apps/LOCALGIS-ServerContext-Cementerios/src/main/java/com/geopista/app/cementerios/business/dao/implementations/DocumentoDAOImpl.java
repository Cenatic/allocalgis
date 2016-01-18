/**
 * DocumentoDAOImpl.java
 * � MINETUR, Government of Spain
 * This program is part of LocalGIS
 * This program is free software: you can redistribute it and/or modify it under the terms of the GNU General Public License as published by the Free Software Foundation, either version 2 of the License, or (at your option) any later version.
 * This program is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU General Public License for more details.
 * You should have received a copy of the GNU General Public License along with this program. If not, see <http://www.gnu.org/licenses/>.
 */
package com.geopista.app.cementerios.business.dao.implementations;

import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.geopista.app.cementerios.business.dao.DAO;
import com.geopista.app.cementerios.business.dao.interfaces.DocumentoDAO;
import com.geopista.app.cementerios.business.vo.Documento;
import com.geopista.app.cementerios.business.vo.DocumentoExample;

public class DocumentoDAOImpl extends DAO implements DocumentoDAO {

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table cementerio.documento
	 * @ibatorgenerated  Tue Jun 07 11:18:50 CEST 2011
	 */
	public DocumentoDAOImpl() {
		super();
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table cementerio.documento
	 * @throws SQLException 
	 * @ibatorgenerated  Tue Jun 07 11:18:50 CEST 2011
	 */
	public int deleteByPrimaryKey(String idDocumento) throws SQLException{
		Documento key = new Documento();
		key.setIdDocumento(idDocumento);
		int rows = getSqlMapClientTemplate().delete(
				"cementerio_documento.ibatorgenerated_deleteByPrimaryKey", key);
		return rows;
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table cementerio.documento
	 * @ibatorgenerated  Tue Jun 07 11:18:50 CEST 2011
	 */
	public String insert(Documento record) throws SQLException {
		Object newKey = getSqlMapClientTemplate().insert(
				"cementerio_documento.ibatorgenerated_insert", record);
		return (String) newKey;
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table cementerio.documento
	 * @ibatorgenerated  Tue Jun 07 11:18:50 CEST 2011
	 */
	public String insertSelective(Documento record) throws SQLException {
		Object newKey = getSqlMapClientTemplate().insert(
				"cementerio_documento.ibatorgenerated_insertSelective", record);
		return (String) newKey;
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table cementerio.documento
	 * @ibatorgenerated  Tue Jun 07 11:18:50 CEST 2011
	 */
	public List selectByExampleWithBLOBs(DocumentoExample example) throws SQLException {
		List list = getSqlMapClientTemplate()
				.queryForList(
						"cementerio_documento.ibatorgenerated_selectByExampleWithBLOBs",
						example);
		return list;
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table cementerio.documento
	 * @ibatorgenerated  Tue Jun 07 11:18:50 CEST 2011
	 */
	public List selectByExampleWithoutBLOBs(DocumentoExample example) throws SQLException {
		List list = getSqlMapClientTemplate()
				.queryForList(
						"cementerio_documento.ibatorgenerated_selectByExample",
						example);
		return list;
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table cementerio.documento
	 * @ibatorgenerated  Tue Jun 07 11:18:50 CEST 2011
	 */
	public Documento selectByPrimaryKey(String idDocumento) throws SQLException {
		Documento key = new Documento();
		key.setIdDocumento(idDocumento);
		Documento record = (Documento) getSqlMapClientTemplate()
				.queryForObject(
						"cementerio_documento.ibatorgenerated_selectByPrimaryKey",
						key);
		return record;
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table cementerio.documento
	 * @ibatorgenerated  Tue Jun 07 11:18:50 CEST 2011
	 */
	public int updateByPrimaryKeySelective(Documento record) throws SQLException {
		int rows = getSqlMapClientTemplate()
				.update("cementerio_documento.ibatorgenerated_updateByPrimaryKeySelective",
						record);
		return rows;
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table cementerio.documento
	 * @ibatorgenerated  Tue Jun 07 11:18:50 CEST 2011
	 */
	public int updateByPrimaryKeyWithBLOBs(Documento record) throws SQLException {
		int rows = getSqlMapClientTemplate()
				.update("cementerio_documento.ibatorgenerated_updateByPrimaryKeyWithBLOBs",
						record);
		return rows;
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table cementerio.documento
	 * @ibatorgenerated  Tue Jun 07 11:18:50 CEST 2011
	 */
	public int updateByPrimaryKeyWithoutBLOBs(Documento record) throws SQLException {
		int rows = getSqlMapClientTemplate().update(
				"cementerio_documento.ibatorgenerated_updateByPrimaryKey",
				record);
		return rows;
	}

	public List selectAll() throws SQLException {
		List list = getSqlMapClientTemplate()
		.queryForList(
				"cementerio_documento.selectAll",
				null);
		return list;
	}

	public List selectAttached(Map map) throws SQLException {
		List list = getSqlMapClientTemplate()
		.queryForList(
				"cementerio_documento.selectAttached",
				map);
		return list;
	}
	
	public List selectAttachedCementerio (Integer idElemCementerio, String superpatron, String patron) throws SQLException{
        
		Map params = new HashMap();
        params.put("idelemcementerio", new Integer(idElemCementerio));
        params.put("idsuperpatron", superpatron);
        params.put("idpatron",patron);
        
		List list = getSqlMapClientTemplate()
			.queryForList("cementerio_documento.selectAttachedCementerio",
					params);
		return list;
	}
	
	public String selectByLastSeqKey() throws SQLException {
		
		Integer lastKey = (Integer) getSqlMapClientTemplate().queryForObject(
									"cementerio_documento.selectByLastSeqKey",
									null);
		return String.valueOf(lastKey);
	}	

}