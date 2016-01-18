/**
 * DocumentoTipoExample.java
 * � MINETUR, Government of Spain
 * This program is part of LocalGIS
 * This program is free software: you can redistribute it and/or modify it under the terms of the GNU General Public License as published by the Free Software Foundation, either version 2 of the License, or (at your option) any later version.
 * This program is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU General Public License for more details.
 * You should have received a copy of the GNU General Public License along with this program. If not, see <http://www.gnu.org/licenses/>.
 */
package com.geopista.app.cementerios.business.vo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DocumentoTipoExample {

	/**
	 * This field was generated by Apache iBATIS ibator. This field corresponds to the database table cementerio.documento_tipos
	 * @ibatorgenerated  Tue Jun 07 11:18:50 CEST 2011
	 */
	protected String orderByClause;
	/**
	 * This field was generated by Apache iBATIS ibator. This field corresponds to the database table cementerio.documento_tipos
	 * @ibatorgenerated  Tue Jun 07 11:18:50 CEST 2011
	 */
	protected List oredCriteria;

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table cementerio.documento_tipos
	 * @ibatorgenerated  Tue Jun 07 11:18:50 CEST 2011
	 */
	public DocumentoTipoExample() {
		oredCriteria = new ArrayList();
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table cementerio.documento_tipos
	 * @ibatorgenerated  Tue Jun 07 11:18:50 CEST 2011
	 */
	protected DocumentoTipoExample(DocumentoTipoExample example) {
		this.orderByClause = example.orderByClause;
		this.oredCriteria = example.oredCriteria;
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table cementerio.documento_tipos
	 * @ibatorgenerated  Tue Jun 07 11:18:50 CEST 2011
	 */
	public void setOrderByClause(String orderByClause) {
		this.orderByClause = orderByClause;
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table cementerio.documento_tipos
	 * @ibatorgenerated  Tue Jun 07 11:18:50 CEST 2011
	 */
	public String getOrderByClause() {
		return orderByClause;
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table cementerio.documento_tipos
	 * @ibatorgenerated  Tue Jun 07 11:18:50 CEST 2011
	 */
	public List getOredCriteria() {
		return oredCriteria;
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table cementerio.documento_tipos
	 * @ibatorgenerated  Tue Jun 07 11:18:50 CEST 2011
	 */
	public void or(Criteria criteria) {
		oredCriteria.add(criteria);
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table cementerio.documento_tipos
	 * @ibatorgenerated  Tue Jun 07 11:18:50 CEST 2011
	 */
	public Criteria createCriteria() {
		Criteria criteria = createCriteriaInternal();
		if (oredCriteria.size() == 0) {
			oredCriteria.add(criteria);
		}
		return criteria;
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table cementerio.documento_tipos
	 * @ibatorgenerated  Tue Jun 07 11:18:50 CEST 2011
	 */
	protected Criteria createCriteriaInternal() {
		Criteria criteria = new Criteria();
		return criteria;
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table cementerio.documento_tipos
	 * @ibatorgenerated  Tue Jun 07 11:18:50 CEST 2011
	 */
	public void clear() {
		oredCriteria.clear();
	}

	/**
	 * This class was generated by Apache iBATIS ibator. This class corresponds to the database table cementerio.documento_tipos
	 * @ibatorgenerated  Tue Jun 07 11:18:50 CEST 2011
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

		public Criteria andTipoIsNull() {
			addCriterion("tipo is null");
			return this;
		}

		public Criteria andTipoIsNotNull() {
			addCriterion("tipo is not null");
			return this;
		}

		public Criteria andTipoEqualTo(Short value) {
			addCriterion("tipo =", value, "tipo");
			return this;
		}

		public Criteria andTipoNotEqualTo(Short value) {
			addCriterion("tipo <>", value, "tipo");
			return this;
		}

		public Criteria andTipoGreaterThan(Short value) {
			addCriterion("tipo >", value, "tipo");
			return this;
		}

		public Criteria andTipoGreaterThanOrEqualTo(Short value) {
			addCriterion("tipo >=", value, "tipo");
			return this;
		}

		public Criteria andTipoLessThan(Short value) {
			addCriterion("tipo <", value, "tipo");
			return this;
		}

		public Criteria andTipoLessThanOrEqualTo(Short value) {
			addCriterion("tipo <=", value, "tipo");
			return this;
		}

		public Criteria andTipoIn(List values) {
			addCriterion("tipo in", values, "tipo");
			return this;
		}

		public Criteria andTipoNotIn(List values) {
			addCriterion("tipo not in", values, "tipo");
			return this;
		}

		public Criteria andTipoBetween(Short value1, Short value2) {
			addCriterion("tipo between", value1, value2, "tipo");
			return this;
		}

		public Criteria andTipoNotBetween(Short value1, Short value2) {
			addCriterion("tipo not between", value1, value2, "tipo");
			return this;
		}

		public Criteria andExtensionIsNull() {
			addCriterion("extension is null");
			return this;
		}

		public Criteria andExtensionIsNotNull() {
			addCriterion("extension is not null");
			return this;
		}

		public Criteria andExtensionEqualTo(String value) {
			addCriterion("extension =", value, "extension");
			return this;
		}

		public Criteria andExtensionNotEqualTo(String value) {
			addCriterion("extension <>", value, "extension");
			return this;
		}

		public Criteria andExtensionGreaterThan(String value) {
			addCriterion("extension >", value, "extension");
			return this;
		}

		public Criteria andExtensionGreaterThanOrEqualTo(String value) {
			addCriterion("extension >=", value, "extension");
			return this;
		}

		public Criteria andExtensionLessThan(String value) {
			addCriterion("extension <", value, "extension");
			return this;
		}

		public Criteria andExtensionLessThanOrEqualTo(String value) {
			addCriterion("extension <=", value, "extension");
			return this;
		}

		public Criteria andExtensionLike(String value) {
			addCriterion("extension like", value, "extension");
			return this;
		}

		public Criteria andExtensionNotLike(String value) {
			addCriterion("extension not like", value, "extension");
			return this;
		}

		public Criteria andExtensionIn(List values) {
			addCriterion("extension in", values, "extension");
			return this;
		}

		public Criteria andExtensionNotIn(List values) {
			addCriterion("extension not in", values, "extension");
			return this;
		}

		public Criteria andExtensionBetween(String value1, String value2) {
			addCriterion("extension between", value1, value2, "extension");
			return this;
		}

		public Criteria andExtensionNotBetween(String value1, String value2) {
			addCriterion("extension not between", value1, value2, "extension");
			return this;
		}

		public Criteria andMimeTypeIsNull() {
			addCriterion("mime_type is null");
			return this;
		}

		public Criteria andMimeTypeIsNotNull() {
			addCriterion("mime_type is not null");
			return this;
		}

		public Criteria andMimeTypeEqualTo(String value) {
			addCriterion("mime_type =", value, "mimeType");
			return this;
		}

		public Criteria andMimeTypeNotEqualTo(String value) {
			addCriterion("mime_type <>", value, "mimeType");
			return this;
		}

		public Criteria andMimeTypeGreaterThan(String value) {
			addCriterion("mime_type >", value, "mimeType");
			return this;
		}

		public Criteria andMimeTypeGreaterThanOrEqualTo(String value) {
			addCriterion("mime_type >=", value, "mimeType");
			return this;
		}

		public Criteria andMimeTypeLessThan(String value) {
			addCriterion("mime_type <", value, "mimeType");
			return this;
		}

		public Criteria andMimeTypeLessThanOrEqualTo(String value) {
			addCriterion("mime_type <=", value, "mimeType");
			return this;
		}

		public Criteria andMimeTypeLike(String value) {
			addCriterion("mime_type like", value, "mimeType");
			return this;
		}

		public Criteria andMimeTypeNotLike(String value) {
			addCriterion("mime_type not like", value, "mimeType");
			return this;
		}

		public Criteria andMimeTypeIn(List values) {
			addCriterion("mime_type in", values, "mimeType");
			return this;
		}

		public Criteria andMimeTypeNotIn(List values) {
			addCriterion("mime_type not in", values, "mimeType");
			return this;
		}

		public Criteria andMimeTypeBetween(String value1, String value2) {
			addCriterion("mime_type between", value1, value2, "mimeType");
			return this;
		}

		public Criteria andMimeTypeNotBetween(String value1, String value2) {
			addCriterion("mime_type not between", value1, value2, "mimeType");
			return this;
		}
	}
}