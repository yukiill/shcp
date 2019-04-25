package com.shcp.pojo;

import java.util.ArrayList;
import java.util.List;

public class TestDeviceTypeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TestDeviceTypeExample() {
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

        public Criteria andTdsnameIsNull() {
            addCriterion("TDSNAME is null");
            return (Criteria) this;
        }

        public Criteria andTdsnameIsNotNull() {
            addCriterion("TDSNAME is not null");
            return (Criteria) this;
        }

        public Criteria andTdsnameEqualTo(String value) {
            addCriterion("TDSNAME =", value, "tdsname");
            return (Criteria) this;
        }

        public Criteria andTdsnameNotEqualTo(String value) {
            addCriterion("TDSNAME <>", value, "tdsname");
            return (Criteria) this;
        }

        public Criteria andTdsnameGreaterThan(String value) {
            addCriterion("TDSNAME >", value, "tdsname");
            return (Criteria) this;
        }

        public Criteria andTdsnameGreaterThanOrEqualTo(String value) {
            addCriterion("TDSNAME >=", value, "tdsname");
            return (Criteria) this;
        }

        public Criteria andTdsnameLessThan(String value) {
            addCriterion("TDSNAME <", value, "tdsname");
            return (Criteria) this;
        }

        public Criteria andTdsnameLessThanOrEqualTo(String value) {
            addCriterion("TDSNAME <=", value, "tdsname");
            return (Criteria) this;
        }

        public Criteria andTdsnameLike(String value) {
            addCriterion("TDSNAME like", value, "tdsname");
            return (Criteria) this;
        }

        public Criteria andTdsnameNotLike(String value) {
            addCriterion("TDSNAME not like", value, "tdsname");
            return (Criteria) this;
        }

        public Criteria andTdsnameIn(List<String> values) {
            addCriterion("TDSNAME in", values, "tdsname");
            return (Criteria) this;
        }

        public Criteria andTdsnameNotIn(List<String> values) {
            addCriterion("TDSNAME not in", values, "tdsname");
            return (Criteria) this;
        }

        public Criteria andTdsnameBetween(String value1, String value2) {
            addCriterion("TDSNAME between", value1, value2, "tdsname");
            return (Criteria) this;
        }

        public Criteria andTdsnameNotBetween(String value1, String value2) {
            addCriterion("TDSNAME not between", value1, value2, "tdsname");
            return (Criteria) this;
        }

        public Criteria andDidIsNull() {
            addCriterion("DID is null");
            return (Criteria) this;
        }

        public Criteria andDidIsNotNull() {
            addCriterion("DID is not null");
            return (Criteria) this;
        }

        public Criteria andDidEqualTo(Long value) {
            addCriterion("DID =", value, "did");
            return (Criteria) this;
        }

        public Criteria andDidNotEqualTo(Long value) {
            addCriterion("DID <>", value, "did");
            return (Criteria) this;
        }

        public Criteria andDidGreaterThan(Long value) {
            addCriterion("DID >", value, "did");
            return (Criteria) this;
        }

        public Criteria andDidGreaterThanOrEqualTo(Long value) {
            addCriterion("DID >=", value, "did");
            return (Criteria) this;
        }

        public Criteria andDidLessThan(Long value) {
            addCriterion("DID <", value, "did");
            return (Criteria) this;
        }

        public Criteria andDidLessThanOrEqualTo(Long value) {
            addCriterion("DID <=", value, "did");
            return (Criteria) this;
        }

        public Criteria andDidIn(List<Long> values) {
            addCriterion("DID in", values, "did");
            return (Criteria) this;
        }

        public Criteria andDidNotIn(List<Long> values) {
            addCriterion("DID not in", values, "did");
            return (Criteria) this;
        }

        public Criteria andDidBetween(Long value1, Long value2) {
            addCriterion("DID between", value1, value2, "did");
            return (Criteria) this;
        }

        public Criteria andDidNotBetween(Long value1, Long value2) {
            addCriterion("DID not between", value1, value2, "did");
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