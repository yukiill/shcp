package com.shcp.pojo;

import java.util.ArrayList;
import java.util.List;

public class TestDeviceLimitExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TestDeviceLimitExample() {
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

        public Criteria andTdelidIsNull() {
            addCriterion("TDELID is null");
            return (Criteria) this;
        }

        public Criteria andTdelidIsNotNull() {
            addCriterion("TDELID is not null");
            return (Criteria) this;
        }

        public Criteria andTdelidEqualTo(Long value) {
            addCriterion("TDELID =", value, "tdelid");
            return (Criteria) this;
        }

        public Criteria andTdelidNotEqualTo(Long value) {
            addCriterion("TDELID <>", value, "tdelid");
            return (Criteria) this;
        }

        public Criteria andTdelidGreaterThan(Long value) {
            addCriterion("TDELID >", value, "tdelid");
            return (Criteria) this;
        }

        public Criteria andTdelidGreaterThanOrEqualTo(Long value) {
            addCriterion("TDELID >=", value, "tdelid");
            return (Criteria) this;
        }

        public Criteria andTdelidLessThan(Long value) {
            addCriterion("TDELID <", value, "tdelid");
            return (Criteria) this;
        }

        public Criteria andTdelidLessThanOrEqualTo(Long value) {
            addCriterion("TDELID <=", value, "tdelid");
            return (Criteria) this;
        }

        public Criteria andTdelidIn(List<Long> values) {
            addCriterion("TDELID in", values, "tdelid");
            return (Criteria) this;
        }

        public Criteria andTdelidNotIn(List<Long> values) {
            addCriterion("TDELID not in", values, "tdelid");
            return (Criteria) this;
        }

        public Criteria andTdelidBetween(Long value1, Long value2) {
            addCriterion("TDELID between", value1, value2, "tdelid");
            return (Criteria) this;
        }

        public Criteria andTdelidNotBetween(Long value1, Long value2) {
            addCriterion("TDELID not between", value1, value2, "tdelid");
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

        public Criteria andTdelkeyIsNull() {
            addCriterion("TDELKEY is null");
            return (Criteria) this;
        }

        public Criteria andTdelkeyIsNotNull() {
            addCriterion("TDELKEY is not null");
            return (Criteria) this;
        }

        public Criteria andTdelkeyEqualTo(String value) {
            addCriterion("TDELKEY =", value, "tdelkey");
            return (Criteria) this;
        }

        public Criteria andTdelkeyNotEqualTo(String value) {
            addCriterion("TDELKEY <>", value, "tdelkey");
            return (Criteria) this;
        }

        public Criteria andTdelkeyGreaterThan(String value) {
            addCriterion("TDELKEY >", value, "tdelkey");
            return (Criteria) this;
        }

        public Criteria andTdelkeyGreaterThanOrEqualTo(String value) {
            addCriterion("TDELKEY >=", value, "tdelkey");
            return (Criteria) this;
        }

        public Criteria andTdelkeyLessThan(String value) {
            addCriterion("TDELKEY <", value, "tdelkey");
            return (Criteria) this;
        }

        public Criteria andTdelkeyLessThanOrEqualTo(String value) {
            addCriterion("TDELKEY <=", value, "tdelkey");
            return (Criteria) this;
        }

        public Criteria andTdelkeyLike(String value) {
            addCriterion("TDELKEY like", value, "tdelkey");
            return (Criteria) this;
        }

        public Criteria andTdelkeyNotLike(String value) {
            addCriterion("TDELKEY not like", value, "tdelkey");
            return (Criteria) this;
        }

        public Criteria andTdelkeyIn(List<String> values) {
            addCriterion("TDELKEY in", values, "tdelkey");
            return (Criteria) this;
        }

        public Criteria andTdelkeyNotIn(List<String> values) {
            addCriterion("TDELKEY not in", values, "tdelkey");
            return (Criteria) this;
        }

        public Criteria andTdelkeyBetween(String value1, String value2) {
            addCriterion("TDELKEY between", value1, value2, "tdelkey");
            return (Criteria) this;
        }

        public Criteria andTdelkeyNotBetween(String value1, String value2) {
            addCriterion("TDELKEY not between", value1, value2, "tdelkey");
            return (Criteria) this;
        }

        public Criteria andTdelvalueIsNull() {
            addCriterion("TDELVALUE is null");
            return (Criteria) this;
        }

        public Criteria andTdelvalueIsNotNull() {
            addCriterion("TDELVALUE is not null");
            return (Criteria) this;
        }

        public Criteria andTdelvalueEqualTo(String value) {
            addCriterion("TDELVALUE =", value, "tdelvalue");
            return (Criteria) this;
        }

        public Criteria andTdelvalueNotEqualTo(String value) {
            addCriterion("TDELVALUE <>", value, "tdelvalue");
            return (Criteria) this;
        }

        public Criteria andTdelvalueGreaterThan(String value) {
            addCriterion("TDELVALUE >", value, "tdelvalue");
            return (Criteria) this;
        }

        public Criteria andTdelvalueGreaterThanOrEqualTo(String value) {
            addCriterion("TDELVALUE >=", value, "tdelvalue");
            return (Criteria) this;
        }

        public Criteria andTdelvalueLessThan(String value) {
            addCriterion("TDELVALUE <", value, "tdelvalue");
            return (Criteria) this;
        }

        public Criteria andTdelvalueLessThanOrEqualTo(String value) {
            addCriterion("TDELVALUE <=", value, "tdelvalue");
            return (Criteria) this;
        }

        public Criteria andTdelvalueLike(String value) {
            addCriterion("TDELVALUE like", value, "tdelvalue");
            return (Criteria) this;
        }

        public Criteria andTdelvalueNotLike(String value) {
            addCriterion("TDELVALUE not like", value, "tdelvalue");
            return (Criteria) this;
        }

        public Criteria andTdelvalueIn(List<String> values) {
            addCriterion("TDELVALUE in", values, "tdelvalue");
            return (Criteria) this;
        }

        public Criteria andTdelvalueNotIn(List<String> values) {
            addCriterion("TDELVALUE not in", values, "tdelvalue");
            return (Criteria) this;
        }

        public Criteria andTdelvalueBetween(String value1, String value2) {
            addCriterion("TDELVALUE between", value1, value2, "tdelvalue");
            return (Criteria) this;
        }

        public Criteria andTdelvalueNotBetween(String value1, String value2) {
            addCriterion("TDELVALUE not between", value1, value2, "tdelvalue");
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