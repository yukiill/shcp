package com.shcp.pojo;

import java.util.ArrayList;
import java.util.List;

public class TbDevicelimitExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TbDevicelimitExample() {
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

        public Criteria andDslidIsNull() {
            addCriterion("DSLID is null");
            return (Criteria) this;
        }

        public Criteria andDslidIsNotNull() {
            addCriterion("DSLID is not null");
            return (Criteria) this;
        }

        public Criteria andDslidEqualTo(Long value) {
            addCriterion("DSLID =", value, "dslid");
            return (Criteria) this;
        }

        public Criteria andDslidNotEqualTo(Long value) {
            addCriterion("DSLID <>", value, "dslid");
            return (Criteria) this;
        }

        public Criteria andDslidGreaterThan(Long value) {
            addCriterion("DSLID >", value, "dslid");
            return (Criteria) this;
        }

        public Criteria andDslidGreaterThanOrEqualTo(Long value) {
            addCriterion("DSLID >=", value, "dslid");
            return (Criteria) this;
        }

        public Criteria andDslidLessThan(Long value) {
            addCriterion("DSLID <", value, "dslid");
            return (Criteria) this;
        }

        public Criteria andDslidLessThanOrEqualTo(Long value) {
            addCriterion("DSLID <=", value, "dslid");
            return (Criteria) this;
        }

        public Criteria andDslidIn(List<Long> values) {
            addCriterion("DSLID in", values, "dslid");
            return (Criteria) this;
        }

        public Criteria andDslidNotIn(List<Long> values) {
            addCriterion("DSLID not in", values, "dslid");
            return (Criteria) this;
        }

        public Criteria andDslidBetween(Long value1, Long value2) {
            addCriterion("DSLID between", value1, value2, "dslid");
            return (Criteria) this;
        }

        public Criteria andDslidNotBetween(Long value1, Long value2) {
            addCriterion("DSLID not between", value1, value2, "dslid");
            return (Criteria) this;
        }

        public Criteria andDslnameIsNull() {
            addCriterion("DSLNAME is null");
            return (Criteria) this;
        }

        public Criteria andDslnameIsNotNull() {
            addCriterion("DSLNAME is not null");
            return (Criteria) this;
        }

        public Criteria andDslnameEqualTo(String value) {
            addCriterion("DSLNAME =", value, "dslname");
            return (Criteria) this;
        }

        public Criteria andDslnameNotEqualTo(String value) {
            addCriterion("DSLNAME <>", value, "dslname");
            return (Criteria) this;
        }

        public Criteria andDslnameGreaterThan(String value) {
            addCriterion("DSLNAME >", value, "dslname");
            return (Criteria) this;
        }

        public Criteria andDslnameGreaterThanOrEqualTo(String value) {
            addCriterion("DSLNAME >=", value, "dslname");
            return (Criteria) this;
        }

        public Criteria andDslnameLessThan(String value) {
            addCriterion("DSLNAME <", value, "dslname");
            return (Criteria) this;
        }

        public Criteria andDslnameLessThanOrEqualTo(String value) {
            addCriterion("DSLNAME <=", value, "dslname");
            return (Criteria) this;
        }

        public Criteria andDslnameLike(String value) {
            addCriterion("DSLNAME like", value, "dslname");
            return (Criteria) this;
        }

        public Criteria andDslnameNotLike(String value) {
            addCriterion("DSLNAME not like", value, "dslname");
            return (Criteria) this;
        }

        public Criteria andDslnameIn(List<String> values) {
            addCriterion("DSLNAME in", values, "dslname");
            return (Criteria) this;
        }

        public Criteria andDslnameNotIn(List<String> values) {
            addCriterion("DSLNAME not in", values, "dslname");
            return (Criteria) this;
        }

        public Criteria andDslnameBetween(String value1, String value2) {
            addCriterion("DSLNAME between", value1, value2, "dslname");
            return (Criteria) this;
        }

        public Criteria andDslnameNotBetween(String value1, String value2) {
            addCriterion("DSLNAME not between", value1, value2, "dslname");
            return (Criteria) this;
        }

        public Criteria andDslkeyIsNull() {
            addCriterion("DSLKEY is null");
            return (Criteria) this;
        }

        public Criteria andDslkeyIsNotNull() {
            addCriterion("DSLKEY is not null");
            return (Criteria) this;
        }

        public Criteria andDslkeyEqualTo(String value) {
            addCriterion("DSLKEY =", value, "dslkey");
            return (Criteria) this;
        }

        public Criteria andDslkeyNotEqualTo(String value) {
            addCriterion("DSLKEY <>", value, "dslkey");
            return (Criteria) this;
        }

        public Criteria andDslkeyGreaterThan(String value) {
            addCriterion("DSLKEY >", value, "dslkey");
            return (Criteria) this;
        }

        public Criteria andDslkeyGreaterThanOrEqualTo(String value) {
            addCriterion("DSLKEY >=", value, "dslkey");
            return (Criteria) this;
        }

        public Criteria andDslkeyLessThan(String value) {
            addCriterion("DSLKEY <", value, "dslkey");
            return (Criteria) this;
        }

        public Criteria andDslkeyLessThanOrEqualTo(String value) {
            addCriterion("DSLKEY <=", value, "dslkey");
            return (Criteria) this;
        }

        public Criteria andDslkeyLike(String value) {
            addCriterion("DSLKEY like", value, "dslkey");
            return (Criteria) this;
        }

        public Criteria andDslkeyNotLike(String value) {
            addCriterion("DSLKEY not like", value, "dslkey");
            return (Criteria) this;
        }

        public Criteria andDslkeyIn(List<String> values) {
            addCriterion("DSLKEY in", values, "dslkey");
            return (Criteria) this;
        }

        public Criteria andDslkeyNotIn(List<String> values) {
            addCriterion("DSLKEY not in", values, "dslkey");
            return (Criteria) this;
        }

        public Criteria andDslkeyBetween(String value1, String value2) {
            addCriterion("DSLKEY between", value1, value2, "dslkey");
            return (Criteria) this;
        }

        public Criteria andDslkeyNotBetween(String value1, String value2) {
            addCriterion("DSLKEY not between", value1, value2, "dslkey");
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