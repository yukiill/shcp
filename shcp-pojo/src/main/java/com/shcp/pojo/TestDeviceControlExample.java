package com.shcp.pojo;

import java.util.ArrayList;
import java.util.List;

public class TestDeviceControlExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TestDeviceControlExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andTdecidIsNull() {
            addCriterion("TDECID is null");
            return (Criteria) this;
        }

        public Criteria andTdecidIsNotNull() {
            addCriterion("TDECID is not null");
            return (Criteria) this;
        }

        public Criteria andTdecidEqualTo(Long value) {
            addCriterion("TDECID =", value, "tdecid");
            return (Criteria) this;
        }

        public Criteria andTdecidNotEqualTo(Long value) {
            addCriterion("TDECID <>", value, "tdecid");
            return (Criteria) this;
        }

        public Criteria andTdecidGreaterThan(Long value) {
            addCriterion("TDECID >", value, "tdecid");
            return (Criteria) this;
        }

        public Criteria andTdecidGreaterThanOrEqualTo(Long value) {
            addCriterion("TDECID >=", value, "tdecid");
            return (Criteria) this;
        }

        public Criteria andTdecidLessThan(Long value) {
            addCriterion("TDECID <", value, "tdecid");
            return (Criteria) this;
        }

        public Criteria andTdecidLessThanOrEqualTo(Long value) {
            addCriterion("TDECID <=", value, "tdecid");
            return (Criteria) this;
        }

        public Criteria andTdecidIn(List<Long> values) {
            addCriterion("TDECID in", values, "tdecid");
            return (Criteria) this;
        }

        public Criteria andTdecidNotIn(List<Long> values) {
            addCriterion("TDECID not in", values, "tdecid");
            return (Criteria) this;
        }

        public Criteria andTdecidBetween(Long value1, Long value2) {
            addCriterion("TDECID between", value1, value2, "tdecid");
            return (Criteria) this;
        }

        public Criteria andTdecidNotBetween(Long value1, Long value2) {
            addCriterion("TDECID not between", value1, value2, "tdecid");
            return (Criteria) this;
        }

        public Criteria andTdsidIsNull() {
            addCriterion("TDSID is null");
            return (Criteria) this;
        }

        public Criteria andTdsidIsNotNull() {
            addCriterion("TDSID is not null");
            return (Criteria) this;
        }

        public Criteria andTdsidEqualTo(Long value) {
            addCriterion("TDSID =", value, "tdsid");
            return (Criteria) this;
        }

        public Criteria andTdsidNotEqualTo(Long value) {
            addCriterion("TDSID <>", value, "tdsid");
            return (Criteria) this;
        }

        public Criteria andTdsidGreaterThan(Long value) {
            addCriterion("TDSID >", value, "tdsid");
            return (Criteria) this;
        }

        public Criteria andTdsidGreaterThanOrEqualTo(Long value) {
            addCriterion("TDSID >=", value, "tdsid");
            return (Criteria) this;
        }

        public Criteria andTdsidLessThan(Long value) {
            addCriterion("TDSID <", value, "tdsid");
            return (Criteria) this;
        }

        public Criteria andTdsidLessThanOrEqualTo(Long value) {
            addCriterion("TDSID <=", value, "tdsid");
            return (Criteria) this;
        }

        public Criteria andTdsidIn(List<Long> values) {
            addCriterion("TDSID in", values, "tdsid");
            return (Criteria) this;
        }

        public Criteria andTdsidNotIn(List<Long> values) {
            addCriterion("TDSID not in", values, "tdsid");
            return (Criteria) this;
        }

        public Criteria andTdsidBetween(Long value1, Long value2) {
            addCriterion("TDSID between", value1, value2, "tdsid");
            return (Criteria) this;
        }

        public Criteria andTdsidNotBetween(Long value1, Long value2) {
            addCriterion("TDSID not between", value1, value2, "tdsid");
            return (Criteria) this;
        }

        public Criteria andTdecnameIsNull() {
            addCriterion("TDECNAME is null");
            return (Criteria) this;
        }

        public Criteria andTdecnameIsNotNull() {
            addCriterion("TDECNAME is not null");
            return (Criteria) this;
        }

        public Criteria andTdecnameEqualTo(String value) {
            addCriterion("TDECNAME =", value, "tdecname");
            return (Criteria) this;
        }

        public Criteria andTdecnameNotEqualTo(String value) {
            addCriterion("TDECNAME <>", value, "tdecname");
            return (Criteria) this;
        }

        public Criteria andTdecnameGreaterThan(String value) {
            addCriterion("TDECNAME >", value, "tdecname");
            return (Criteria) this;
        }

        public Criteria andTdecnameGreaterThanOrEqualTo(String value) {
            addCriterion("TDECNAME >=", value, "tdecname");
            return (Criteria) this;
        }

        public Criteria andTdecnameLessThan(String value) {
            addCriterion("TDECNAME <", value, "tdecname");
            return (Criteria) this;
        }

        public Criteria andTdecnameLessThanOrEqualTo(String value) {
            addCriterion("TDECNAME <=", value, "tdecname");
            return (Criteria) this;
        }

        public Criteria andTdecnameLike(String value) {
            addCriterion("TDECNAME like", value, "tdecname");
            return (Criteria) this;
        }

        public Criteria andTdecnameNotLike(String value) {
            addCriterion("TDECNAME not like", value, "tdecname");
            return (Criteria) this;
        }

        public Criteria andTdecnameIn(List<String> values) {
            addCriterion("TDECNAME in", values, "tdecname");
            return (Criteria) this;
        }

        public Criteria andTdecnameNotIn(List<String> values) {
            addCriterion("TDECNAME not in", values, "tdecname");
            return (Criteria) this;
        }

        public Criteria andTdecnameBetween(String value1, String value2) {
            addCriterion("TDECNAME between", value1, value2, "tdecname");
            return (Criteria) this;
        }

        public Criteria andTdecnameNotBetween(String value1, String value2) {
            addCriterion("TDECNAME not between", value1, value2, "tdecname");
            return (Criteria) this;
        }

        public Criteria andTdeckeyIsNull() {
            addCriterion("TDECKEY is null");
            return (Criteria) this;
        }

        public Criteria andTdeckeyIsNotNull() {
            addCriterion("TDECKEY is not null");
            return (Criteria) this;
        }

        public Criteria andTdeckeyEqualTo(String value) {
            addCriterion("TDECKEY =", value, "tdeckey");
            return (Criteria) this;
        }

        public Criteria andTdeckeyNotEqualTo(String value) {
            addCriterion("TDECKEY <>", value, "tdeckey");
            return (Criteria) this;
        }

        public Criteria andTdeckeyGreaterThan(String value) {
            addCriterion("TDECKEY >", value, "tdeckey");
            return (Criteria) this;
        }

        public Criteria andTdeckeyGreaterThanOrEqualTo(String value) {
            addCriterion("TDECKEY >=", value, "tdeckey");
            return (Criteria) this;
        }

        public Criteria andTdeckeyLessThan(String value) {
            addCriterion("TDECKEY <", value, "tdeckey");
            return (Criteria) this;
        }

        public Criteria andTdeckeyLessThanOrEqualTo(String value) {
            addCriterion("TDECKEY <=", value, "tdeckey");
            return (Criteria) this;
        }

        public Criteria andTdeckeyLike(String value) {
            addCriterion("TDECKEY like", value, "tdeckey");
            return (Criteria) this;
        }

        public Criteria andTdeckeyNotLike(String value) {
            addCriterion("TDECKEY not like", value, "tdeckey");
            return (Criteria) this;
        }

        public Criteria andTdeckeyIn(List<String> values) {
            addCriterion("TDECKEY in", values, "tdeckey");
            return (Criteria) this;
        }

        public Criteria andTdeckeyNotIn(List<String> values) {
            addCriterion("TDECKEY not in", values, "tdeckey");
            return (Criteria) this;
        }

        public Criteria andTdeckeyBetween(String value1, String value2) {
            addCriterion("TDECKEY between", value1, value2, "tdeckey");
            return (Criteria) this;
        }

        public Criteria andTdeckeyNotBetween(String value1, String value2) {
            addCriterion("TDECKEY not between", value1, value2, "tdeckey");
            return (Criteria) this;
        }

        public Criteria andTdecvalueIsNull() {
            addCriterion("TDECVALUE is null");
            return (Criteria) this;
        }

        public Criteria andTdecvalueIsNotNull() {
            addCriterion("TDECVALUE is not null");
            return (Criteria) this;
        }

        public Criteria andTdecvalueEqualTo(String value) {
            addCriterion("TDECVALUE =", value, "tdecvalue");
            return (Criteria) this;
        }

        public Criteria andTdecvalueNotEqualTo(String value) {
            addCriterion("TDECVALUE <>", value, "tdecvalue");
            return (Criteria) this;
        }

        public Criteria andTdecvalueGreaterThan(String value) {
            addCriterion("TDECVALUE >", value, "tdecvalue");
            return (Criteria) this;
        }

        public Criteria andTdecvalueGreaterThanOrEqualTo(String value) {
            addCriterion("TDECVALUE >=", value, "tdecvalue");
            return (Criteria) this;
        }

        public Criteria andTdecvalueLessThan(String value) {
            addCriterion("TDECVALUE <", value, "tdecvalue");
            return (Criteria) this;
        }

        public Criteria andTdecvalueLessThanOrEqualTo(String value) {
            addCriterion("TDECVALUE <=", value, "tdecvalue");
            return (Criteria) this;
        }

        public Criteria andTdecvalueLike(String value) {
            addCriterion("TDECVALUE like", value, "tdecvalue");
            return (Criteria) this;
        }

        public Criteria andTdecvalueNotLike(String value) {
            addCriterion("TDECVALUE not like", value, "tdecvalue");
            return (Criteria) this;
        }

        public Criteria andTdecvalueIn(List<String> values) {
            addCriterion("TDECVALUE in", values, "tdecvalue");
            return (Criteria) this;
        }

        public Criteria andTdecvalueNotIn(List<String> values) {
            addCriterion("TDECVALUE not in", values, "tdecvalue");
            return (Criteria) this;
        }

        public Criteria andTdecvalueBetween(String value1, String value2) {
            addCriterion("TDECVALUE between", value1, value2, "tdecvalue");
            return (Criteria) this;
        }

        public Criteria andTdecvalueNotBetween(String value1, String value2) {
            addCriterion("TDECVALUE not between", value1, value2, "tdecvalue");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}