/**
 * DifuntoExample.java
 * � MINETUR, Government of Spain
 * This program is part of LocalGIS
 * This program is free software: you can redistribute it and/or modify it under the terms of the GNU General Public License as published by the Free Software Foundation, either version 2 of the License, or (at your option) any later version.
 * This program is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU General Public License for more details.
 * You should have received a copy of the GNU General Public License along with this program. If not, see <http://www.gnu.org/licenses/>.
 */
package com.geopista.app.cementerios.business.vo;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DifuntoExample {

	/**
	 * This field was generated by Apache iBATIS ibator. This field corresponds to the database table cementerio.difunto
	 * @ibatorgenerated  Tue Jul 26 14:01:38 CEST 2011
	 */
	protected String orderByClause;
	/**
	 * This field was generated by Apache iBATIS ibator. This field corresponds to the database table cementerio.difunto
	 * @ibatorgenerated  Tue Jul 26 14:01:38 CEST 2011
	 */
	protected List oredCriteria;

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table cementerio.difunto
	 * @ibatorgenerated  Tue Jul 26 14:01:38 CEST 2011
	 */
	public DifuntoExample() {
		oredCriteria = new ArrayList();
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table cementerio.difunto
	 * @ibatorgenerated  Tue Jul 26 14:01:38 CEST 2011
	 */
	public void setOrderByClause(String orderByClause) {
		this.orderByClause = orderByClause;
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table cementerio.difunto
	 * @ibatorgenerated  Tue Jul 26 14:01:38 CEST 2011
	 */
	public String getOrderByClause() {
		return orderByClause;
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table cementerio.difunto
	 * @ibatorgenerated  Tue Jul 26 14:01:38 CEST 2011
	 */
	public List getOredCriteria() {
		return oredCriteria;
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table cementerio.difunto
	 * @ibatorgenerated  Tue Jul 26 14:01:38 CEST 2011
	 */
	public void or(Criteria criteria) {
		oredCriteria.add(criteria);
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table cementerio.difunto
	 * @ibatorgenerated  Tue Jul 26 14:01:38 CEST 2011
	 */
	public Criteria createCriteria() {
		Criteria criteria = createCriteriaInternal();
		if (oredCriteria.size() == 0) {
			oredCriteria.add(criteria);
		}
		return criteria;
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table cementerio.difunto
	 * @ibatorgenerated  Tue Jul 26 14:01:38 CEST 2011
	 */
	public Criteria createCriteriaInternal() {
		Criteria criteria = new Criteria();
		return criteria;
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table cementerio.difunto
	 * @ibatorgenerated  Tue Jul 26 14:01:38 CEST 2011
	 */
	public void clear() {
		oredCriteria.clear();
	}

	/**
	 * This class was generated by Apache iBATIS ibator. This class corresponds to the database table cementerio.difunto
	 * @ibatorgenerated  Tue Jul 26 14:01:38 CEST 2011
	 */
	public static class Criteria {
		protected List criteriaWithoutValue;
		protected List criteriaWithSingleValue;
		protected List criteriaWithListValue;
		protected List criteriaWithBetweenValue;

		protected Criteria() {
			super();
			criteriaWithoutValue = new ArrayList();
			criteriaWithSingleValue = new ArrayList();
			criteriaWithListValue = new ArrayList();
			criteriaWithBetweenValue = new ArrayList();
		}

		public boolean isValid() {
			return criteriaWithoutValue.size() > 0
					|| criteriaWithSingleValue.size() > 0
					|| criteriaWithListValue.size() > 0
					|| criteriaWithBetweenValue.size() > 0;
		}

		public List getCriteriaWithoutValue() {
			return criteriaWithoutValue;
		}

		public List getCriteriaWithSingleValue() {
			return criteriaWithSingleValue;
		}

		public List getCriteriaWithListValue() {
			return criteriaWithListValue;
		}

		public List getCriteriaWithBetweenValue() {
			return criteriaWithBetweenValue;
		}

		protected void addCriterion(String condition) {
			if (condition == null) {
				throw new RuntimeException("Value for condition cannot be null");
			}
			criteriaWithoutValue.add(condition);
		}

		protected void addCriterion(String condition, Object value,
				String property) {
			if (value == null) {
				throw new RuntimeException("Value for " + property
						+ " cannot be null");
			}
			Map map = new HashMap();
			map.put("condition", condition);
			map.put("value", value);
			criteriaWithSingleValue.add(map);
		}

		protected void addCriterion(String condition, List values,
				String property) {
			if (values == null || values.size() == 0) {
				throw new RuntimeException("Value list for " + property
						+ " cannot be null or empty");
			}
			Map map = new HashMap();
			map.put("condition", condition);
			map.put("values", values);
			criteriaWithListValue.add(map);
		}

		protected void addCriterion(String condition, Object value1,
				Object value2, String property) {
			if (value1 == null || value2 == null) {
				throw new RuntimeException("Between values for " + property
						+ " cannot be null");
			}
			List list = new ArrayList();
			list.add(value1);
			list.add(value2);
			Map map = new HashMap();
			map.put("condition", condition);
			map.put("values", list);
			criteriaWithBetweenValue.add(map);
		}

		public Criteria andIdIsNull() {
			addCriterion("id is null");
			return this;
		}

		public Criteria andIdIsNotNull() {
			addCriterion("id is not null");
			return this;
		}

		public Criteria andIdEqualTo(Integer value) {
			addCriterion("id =", value, "id");
			return this;
		}

		public Criteria andIdNotEqualTo(Integer value) {
			addCriterion("id <>", value, "id");
			return this;
		}

		public Criteria andIdGreaterThan(Integer value) {
			addCriterion("id >", value, "id");
			return this;
		}

		public Criteria andIdGreaterThanOrEqualTo(Integer value) {
			addCriterion("id >=", value, "id");
			return this;
		}

		public Criteria andIdLessThan(Integer value) {
			addCriterion("id <", value, "id");
			return this;
		}

		public Criteria andIdLessThanOrEqualTo(Integer value) {
			addCriterion("id <=", value, "id");
			return this;
		}

		public Criteria andIdIn(List values) {
			addCriterion("id in", values, "id");
			return this;
		}

		public Criteria andIdNotIn(List values) {
			addCriterion("id not in", values, "id");
			return this;
		}

		public Criteria andIdBetween(Integer value1, Integer value2) {
			addCriterion("id between", value1, value2, "id");
			return this;
		}

		public Criteria andIdNotBetween(Integer value1, Integer value2) {
			addCriterion("id not between", value1, value2, "id");
			return this;
		}

		public Criteria andFechaDefuncionIsNull() {
			addCriterion("fecha_defuncion is null");
			return this;
		}

		public Criteria andFechaDefuncionIsNotNull() {
			addCriterion("fecha_defuncion is not null");
			return this;
		}

		public Criteria andFechaDefuncionEqualTo(Date value) {
			addCriterion("fecha_defuncion =", value, "fechaDefuncion");
			return this;
		}

		public Criteria andFechaDefuncionNotEqualTo(Date value) {
			addCriterion("fecha_defuncion <>", value, "fechaDefuncion");
			return this;
		}

		public Criteria andFechaDefuncionGreaterThan(Date value) {
			addCriterion("fecha_defuncion >", value, "fechaDefuncion");
			return this;
		}

		public Criteria andFechaDefuncionGreaterThanOrEqualTo(Date value) {
			addCriterion("fecha_defuncion >=", value, "fechaDefuncion");
			return this;
		}

		public Criteria andFechaDefuncionLessThan(Date value) {
			addCriterion("fecha_defuncion <", value, "fechaDefuncion");
			return this;
		}

		public Criteria andFechaDefuncionLessThanOrEqualTo(Date value) {
			addCriterion("fecha_defuncion <=", value, "fechaDefuncion");
			return this;
		}

		public Criteria andFechaDefuncionIn(List values) {
			addCriterion("fecha_defuncion in", values, "fechaDefuncion");
			return this;
		}

		public Criteria andFechaDefuncionNotIn(List values) {
			addCriterion("fecha_defuncion not in", values, "fechaDefuncion");
			return this;
		}

		public Criteria andFechaDefuncionBetween(Date value1, Date value2) {
			addCriterion("fecha_defuncion between", value1, value2,
					"fechaDefuncion");
			return this;
		}

		public Criteria andFechaDefuncionNotBetween(Date value1, Date value2) {
			addCriterion("fecha_defuncion not between", value1, value2,
					"fechaDefuncion");
			return this;
		}

		public Criteria andEdadDifuntoIsNull() {
			addCriterion("edad_difunto is null");
			return this;
		}

		public Criteria andEdadDifuntoIsNotNull() {
			addCriterion("edad_difunto is not null");
			return this;
		}

		public Criteria andEdadDifuntoEqualTo(Integer value) {
			addCriterion("edad_difunto =", value, "edadDifunto");
			return this;
		}

		public Criteria andEdadDifuntoNotEqualTo(Integer value) {
			addCriterion("edad_difunto <>", value, "edadDifunto");
			return this;
		}

		public Criteria andEdadDifuntoGreaterThan(Integer value) {
			addCriterion("edad_difunto >", value, "edadDifunto");
			return this;
		}

		public Criteria andEdadDifuntoGreaterThanOrEqualTo(Integer value) {
			addCriterion("edad_difunto >=", value, "edadDifunto");
			return this;
		}

		public Criteria andEdadDifuntoLessThan(Integer value) {
			addCriterion("edad_difunto <", value, "edadDifunto");
			return this;
		}

		public Criteria andEdadDifuntoLessThanOrEqualTo(Integer value) {
			addCriterion("edad_difunto <=", value, "edadDifunto");
			return this;
		}

		public Criteria andEdadDifuntoIn(List values) {
			addCriterion("edad_difunto in", values, "edadDifunto");
			return this;
		}

		public Criteria andEdadDifuntoNotIn(List values) {
			addCriterion("edad_difunto not in", values, "edadDifunto");
			return this;
		}

		public Criteria andEdadDifuntoBetween(Integer value1, Integer value2) {
			addCriterion("edad_difunto between", value1, value2, "edadDifunto");
			return this;
		}

		public Criteria andEdadDifuntoNotBetween(Integer value1, Integer value2) {
			addCriterion("edad_difunto not between", value1, value2,
					"edadDifunto");
			return this;
		}

		public Criteria andIdDatosfallecimientoIsNull() {
			addCriterion("id_datosfallecimiento is null");
			return this;
		}

		public Criteria andIdDatosfallecimientoIsNotNull() {
			addCriterion("id_datosfallecimiento is not null");
			return this;
		}

		public Criteria andIdDatosfallecimientoEqualTo(Integer value) {
			addCriterion("id_datosfallecimiento =", value,
					"idDatosfallecimiento");
			return this;
		}

		public Criteria andIdDatosfallecimientoNotEqualTo(Integer value) {
			addCriterion("id_datosfallecimiento <>", value,
					"idDatosfallecimiento");
			return this;
		}

		public Criteria andIdDatosfallecimientoGreaterThan(Integer value) {
			addCriterion("id_datosfallecimiento >", value,
					"idDatosfallecimiento");
			return this;
		}

		public Criteria andIdDatosfallecimientoGreaterThanOrEqualTo(
				Integer value) {
			addCriterion("id_datosfallecimiento >=", value,
					"idDatosfallecimiento");
			return this;
		}

		public Criteria andIdDatosfallecimientoLessThan(Integer value) {
			addCriterion("id_datosfallecimiento <", value,
					"idDatosfallecimiento");
			return this;
		}

		public Criteria andIdDatosfallecimientoLessThanOrEqualTo(Integer value) {
			addCriterion("id_datosfallecimiento <=", value,
					"idDatosfallecimiento");
			return this;
		}

		public Criteria andIdDatosfallecimientoIn(List values) {
			addCriterion("id_datosfallecimiento in", values,
					"idDatosfallecimiento");
			return this;
		}

		public Criteria andIdDatosfallecimientoNotIn(List values) {
			addCriterion("id_datosfallecimiento not in", values,
					"idDatosfallecimiento");
			return this;
		}

		public Criteria andIdDatosfallecimientoBetween(Integer value1,
				Integer value2) {
			addCriterion("id_datosfallecimiento between", value1, value2,
					"idDatosfallecimiento");
			return this;
		}

		public Criteria andIdDatosfallecimientoNotBetween(Integer value1,
				Integer value2) {
			addCriterion("id_datosfallecimiento not between", value1, value2,
					"idDatosfallecimiento");
			return this;
		}

		public Criteria andIdPlazaIsNull() {
			addCriterion("id_plaza is null");
			return this;
		}

		public Criteria andIdPlazaIsNotNull() {
			addCriterion("id_plaza is not null");
			return this;
		}

		public Criteria andIdPlazaEqualTo(Integer value) {
			addCriterion("id_plaza =", value, "idPlaza");
			return this;
		}

		public Criteria andIdPlazaNotEqualTo(Integer value) {
			addCriterion("id_plaza <>", value, "idPlaza");
			return this;
		}

		public Criteria andIdPlazaGreaterThan(Integer value) {
			addCriterion("id_plaza >", value, "idPlaza");
			return this;
		}

		public Criteria andIdPlazaGreaterThanOrEqualTo(Integer value) {
			addCriterion("id_plaza >=", value, "idPlaza");
			return this;
		}

		public Criteria andIdPlazaLessThan(Integer value) {
			addCriterion("id_plaza <", value, "idPlaza");
			return this;
		}

		public Criteria andIdPlazaLessThanOrEqualTo(Integer value) {
			addCriterion("id_plaza <=", value, "idPlaza");
			return this;
		}

		public Criteria andIdPlazaIn(List values) {
			addCriterion("id_plaza in", values, "idPlaza");
			return this;
		}

		public Criteria andIdPlazaNotIn(List values) {
			addCriterion("id_plaza not in", values, "idPlaza");
			return this;
		}

		public Criteria andIdPlazaBetween(Integer value1, Integer value2) {
			addCriterion("id_plaza between", value1, value2, "idPlaza");
			return this;
		}

		public Criteria andIdPlazaNotBetween(Integer value1, Integer value2) {
			addCriterion("id_plaza not between", value1, value2, "idPlaza");
			return this;
		}

		public Criteria andDniPersonaIsNull() {
			addCriterion("dni_persona is null");
			return this;
		}

		public Criteria andDniPersonaIsNotNull() {
			addCriterion("dni_persona is not null");
			return this;
		}

		public Criteria andDniPersonaEqualTo(String value) {
			addCriterion("dni_persona =", value, "dniPersona");
			return this;
		}

		public Criteria andDniPersonaNotEqualTo(String value) {
			addCriterion("dni_persona <>", value, "dniPersona");
			return this;
		}

		public Criteria andDniPersonaGreaterThan(String value) {
			addCriterion("dni_persona >", value, "dniPersona");
			return this;
		}

		public Criteria andDniPersonaGreaterThanOrEqualTo(String value) {
			addCriterion("dni_persona >=", value, "dniPersona");
			return this;
		}

		public Criteria andDniPersonaLessThan(String value) {
			addCriterion("dni_persona <", value, "dniPersona");
			return this;
		}

		public Criteria andDniPersonaLessThanOrEqualTo(String value) {
			addCriterion("dni_persona <=", value, "dniPersona");
			return this;
		}

		public Criteria andDniPersonaLike(String value) {
			addCriterion("dni_persona like", value, "dniPersona");
			return this;
		}

		public Criteria andDniPersonaNotLike(String value) {
			addCriterion("dni_persona not like", value, "dniPersona");
			return this;
		}

		public Criteria andDniPersonaIn(List values) {
			addCriterion("dni_persona in", values, "dniPersona");
			return this;
		}

		public Criteria andDniPersonaNotIn(List values) {
			addCriterion("dni_persona not in", values, "dniPersona");
			return this;
		}

		public Criteria andDniPersonaBetween(String value1, String value2) {
			addCriterion("dni_persona between", value1, value2, "dniPersona");
			return this;
		}

		public Criteria andDniPersonaNotBetween(String value1, String value2) {
			addCriterion("dni_persona not between", value1, value2,
					"dniPersona");
			return this;
		}

		public Criteria andGrupoIsNull() {
			addCriterion("grupo is null");
			return this;
		}

		public Criteria andGrupoIsNotNull() {
			addCriterion("grupo is not null");
			return this;
		}

		public Criteria andGrupoEqualTo(Integer value) {
			addCriterion("grupo =", value, "grupo");
			return this;
		}

		public Criteria andGrupoNotEqualTo(Integer value) {
			addCriterion("grupo <>", value, "grupo");
			return this;
		}

		public Criteria andGrupoGreaterThan(Integer value) {
			addCriterion("grupo >", value, "grupo");
			return this;
		}

		public Criteria andGrupoGreaterThanOrEqualTo(Integer value) {
			addCriterion("grupo >=", value, "grupo");
			return this;
		}

		public Criteria andGrupoLessThan(Integer value) {
			addCriterion("grupo <", value, "grupo");
			return this;
		}

		public Criteria andGrupoLessThanOrEqualTo(Integer value) {
			addCriterion("grupo <=", value, "grupo");
			return this;
		}

		public Criteria andGrupoIn(List values) {
			addCriterion("grupo in", values, "grupo");
			return this;
		}

		public Criteria andGrupoNotIn(List values) {
			addCriterion("grupo not in", values, "grupo");
			return this;
		}

		public Criteria andGrupoBetween(Integer value1, Integer value2) {
			addCriterion("grupo between", value1, value2, "grupo");
			return this;
		}

		public Criteria andGrupoNotBetween(Integer value1, Integer value2) {
			addCriterion("grupo not between", value1, value2, "grupo");
			return this;
		}

		public Criteria andCodigoIsNull() {
			addCriterion("codigo is null");
			return this;
		}

		public Criteria andCodigoIsNotNull() {
			addCriterion("codigo is not null");
			return this;
		}

		public Criteria andCodigoEqualTo(String value) {
			addCriterion("codigo =", value, "codigo");
			return this;
		}

		public Criteria andCodigoNotEqualTo(String value) {
			addCriterion("codigo <>", value, "codigo");
			return this;
		}

		public Criteria andCodigoGreaterThan(String value) {
			addCriterion("codigo >", value, "codigo");
			return this;
		}

		public Criteria andCodigoGreaterThanOrEqualTo(String value) {
			addCriterion("codigo >=", value, "codigo");
			return this;
		}

		public Criteria andCodigoLessThan(String value) {
			addCriterion("codigo <", value, "codigo");
			return this;
		}

		public Criteria andCodigoLessThanOrEqualTo(String value) {
			addCriterion("codigo <=", value, "codigo");
			return this;
		}

		public Criteria andCodigoLike(String value) {
			addCriterion("codigo like", value, "codigo");
			return this;
		}

		public Criteria andCodigoNotLike(String value) {
			addCriterion("codigo not like", value, "codigo");
			return this;
		}

		public Criteria andCodigoIn(List values) {
			addCriterion("codigo in", values, "codigo");
			return this;
		}

		public Criteria andCodigoNotIn(List values) {
			addCriterion("codigo not in", values, "codigo");
			return this;
		}

		public Criteria andCodigoBetween(String value1, String value2) {
			addCriterion("codigo between", value1, value2, "codigo");
			return this;
		}

		public Criteria andCodigoNotBetween(String value1, String value2) {
			addCriterion("codigo not between", value1, value2, "codigo");
			return this;
		}
	}
}