/**
 * TarifaDAOImpl.java
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
import com.geopista.app.cementerios.business.dao.interfaces.TarifaDAO;
import com.geopista.app.cementerios.business.vo.Tarifa;
import com.geopista.app.cementerios.business.vo.TarifaExample;


public class TarifaDAOImpl extends DAO implements TarifaDAO {

    /**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table cementerio.tarifa
	 * @ibatorgenerated  Tue Jul 05 08:57:18 CEST 2011
	 */
	public TarifaDAOImpl() {
		super();
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table cementerio.tarifa
	 * @throws SQLException 
	 * @ibatorgenerated  Tue Jul 05 08:57:18 CEST 2011
	 */
	public int deleteByExample(TarifaExample example) throws SQLException {
		int rows = getSqlMapClientTemplate().delete(
				"cementerio_tarifa.ibatorgenerated_deleteByExample", example);
		return rows;
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table cementerio.tarifa
	 * @ibatorgenerated  Tue Jul 05 08:57:18 CEST 2011
	 */
	public int deleteByPrimaryKey(Integer id) throws SQLException {
		Tarifa key = new Tarifa();
		key.setId(id);
		int rows = getSqlMapClientTemplate().delete(
				"cementerio_tarifa.ibatorgenerated_deleteByPrimaryKey", key);
		return rows;
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table cementerio.tarifa
	 * @ibatorgenerated  Tue Jul 05 08:57:18 CEST 2011
	 */
	public Integer insert(Tarifa record) throws SQLException {
		Object newKey = getSqlMapClientTemplate().insert(
				"cementerio_tarifa.ibatorgenerated_insert", record);
		return (Integer) newKey;
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table cementerio.tarifa
	 * @ibatorgenerated  Tue Jul 05 08:57:18 CEST 2011
	 */
	public Integer insertSelective(Tarifa record) throws SQLException {
		Object newKey = getSqlMapClientTemplate().insert(
				"cementerio_tarifa.ibatorgenerated_insertSelective", record);
		return (Integer) newKey;
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table cementerio.tarifa
	 * @ibatorgenerated  Tue Jul 05 08:57:18 CEST 2011
	 */
	public List selectByExample(TarifaExample example) throws SQLException {
		List list = getSqlMapClientTemplate().queryForList(
				"cementerio_tarifa.ibatorgenerated_selectByExample", example);
		return list;
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table cementerio.tarifa
	 * @ibatorgenerated  Tue Jul 05 08:57:18 CEST 2011
	 */
	public Tarifa selectByPrimaryKey(Integer id) throws SQLException {
		Tarifa key = new Tarifa();
		key.setId(id);
		Tarifa record = (Tarifa) getSqlMapClientTemplate().queryForObject(
				"cementerio_tarifa.ibatorgenerated_selectByPrimaryKey", key);
		return record;
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table cementerio.tarifa
	 * @ibatorgenerated  Tue Jul 05 08:57:18 CEST 2011
	 */
	public int updateByExampleSelective(Tarifa record, TarifaExample example) throws SQLException {
		UpdateByExampleParms parms = new UpdateByExampleParms(record, example);
		int rows = getSqlMapClientTemplate().update(
				"cementerio_tarifa.ibatorgenerated_updateByExampleSelective",
				parms);
		return rows;
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table cementerio.tarifa
	 * @ibatorgenerated  Tue Jul 05 08:57:18 CEST 2011
	 */
	public int updateByExample(Tarifa record, TarifaExample example) throws SQLException {
		UpdateByExampleParms parms = new UpdateByExampleParms(record, example);
		int rows = getSqlMapClientTemplate().update(
				"cementerio_tarifa.ibatorgenerated_updateByExample", parms);
		return rows;
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table cementerio.tarifa
	 * @ibatorgenerated  Tue Jul 05 08:57:18 CEST 2011
	 */
	public int updateByPrimaryKeySelective(Tarifa record) throws SQLException {
		int rows = getSqlMapClientTemplate()
				.update("cementerio_tarifa.ibatorgenerated_updateByPrimaryKeySelective",
						record);
		return rows;
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table cementerio.tarifa
	 * @ibatorgenerated  Tue Jul 05 08:57:18 CEST 2011
	 */
	public int updateByPrimaryKey(Tarifa record)  throws SQLException {
		int rows = getSqlMapClientTemplate().update(
				"cementerio_tarifa.ibatorgenerated_updateByPrimaryKey", record);
		return rows;
	}

	/**
	 * This class was generated by Apache iBATIS ibator. This class corresponds to the database table cementerio.tarifa
	 * @ibatorgenerated  Tue Jul 05 08:57:18 CEST 2011
	 */
	private static class UpdateByExampleParms extends TarifaExample {
		private Object record;

		public UpdateByExampleParms(Object record, TarifaExample example)  throws SQLException {
			super(example);
			this.record = record;
		}

		public Object getRecord() {
			return record;
		}
	}

	public int selectByLastSeqKey() throws SQLException {
		Integer lastKey = (Integer) getSqlMapClientTemplate()
		.queryForObject(
				"cementerio_tarifa.selectByLastSeqKey",
				null);
		return lastKey.intValue();
    	
    }
    
  public  List selectAll () throws SQLException {
		List list = getSqlMapClientTemplate()
		.queryForList(
				"cementerio_tarifa.selectAll",
				null);
		return list;
    }
    
    public List selectAllByCementery(Integer idCementerio) throws SQLException {
		List list = getSqlMapClientTemplate()
		.queryForList(
				"cementerio_tarifa.selectByCementerio",
				idCementerio);
		return list;
    }

    public List selectByCementerioAndType(Integer idCementerio, Integer tipoTarifa) throws SQLException {
    	
    	Map map = new HashMap();
    	map.put("idCementerio", idCementerio);
    	map.put("tipoTarifa", tipoTarifa);
    	
		List list = getSqlMapClientTemplate()
		.queryForList(
				"cementerio_tarifa.selectByCementerioAndType",
				map);
		return list;
    }
    
    
    
}