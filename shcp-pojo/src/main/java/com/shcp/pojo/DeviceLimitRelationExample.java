package com.shcp.pojo;

import java.util.ArrayList;
import java.util.List;

public class DeviceLimitRelationExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DeviceLimitRelationExample() {
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

        public Criteria andDeidIsNull() {
            addCriterion("DEID is null");
            return (Criteria) this;
        }

        public Criteria andDeidIsNotNull() {
            addCriterion("DEID is not null");
            return (Criteria) this;
        }

        public Criteria andDeidEqualTo(Long value) {
            addCriterion("DEID =", value, "deid");
            return (Criteria) this;
        }

        public Criteria andDeidNotEqualTo(Long value) {
            addCriterion("DEID <>", value, "deid");
            return (Criteria) this;
        }

        public Criteria andDeidGreaterThan(Long value) {
            addCriterion("DEID >", value, "deid");
            return (Criteria) this;
        }

        public Criteria andDeidGreaterThanOrEqualTo(Long value) {
            addCriterion("DEID >=", value, "deid");
            return (Criteria) this;
        }

        public Criteria andDeidLessThan(Long value) {
            addCriterion("DEID <", value, "deid");
            return (Criteria) this;
        }

        public Criteria andDeidLessThanOrEqualTo(Long value) {
            addCriterion("DEID <=", value, "deid");
            return (Criteria) this;
        }

        public Criteria andDeidIn(List<Long> values) {
            addCriterion("DEID in", values, "deid");
            return (Criteria) this;
        }

        public Criteria andDeidNotIn(List<Long> values) {
            addCriterion("DEID not in", values, "deid");
            return (Criteria) this;
        }

        public Criteria andDeidBetween(Long value1, Long value2) {
            addCriterion("DEID between", value1, value2, "deid");
            return (Criteria) this;
        }

        public Criteria andDeidNotBetween(Long value1, Long value2) {
            addCriterion("DEID not between", value1, value2, "deid");
            return (Criteria) this;
        }

        public Criteria andDelidIsNull() {
            addCriterion("DELID is null");
            return (Criteria) this;
        }

        public Criteria andDelidIsNotNull() {
            addCriterion("DELID is not null");
            return (Criteria) this;
        }

        public Criteria andDelidEqualTo(Long value) {
            addCriterion("DELID =", value, "delid");
            return (Criteria) this;
        }

        public Criteria andDelidNotEqualTo(Long value) {
            addCriterion("DELID <>", value, "delid");
            return (Criteria) this;
        }

        public Criteria andDelidGreaterThan(Long value) {
            addCriterion("DELID >", value, "delid");
            return (Criteria) this;
        }

        public Criteria andDelidGreaterThanOrEqualTo(Long value) {
            addCriterion("DELID >=", value, "delid");
            return (Criteria) this;
        }

        public Criteria andDelidLessThan(Long value) {
            addCriterion("DELID <", value, "delid");
            return (Criteria) this;
        }

        public Criteria andDelidLessThanOrEqualTo(Long value) {
            addCriterion("DELID <=", value, "delid");
            return (Criteria) this;
        }

        public Criteria andDelidIn(List<Long> values) {
            addCriterion("DELID in", values, "delid");
            return (Criteria) this;
        }

        public Criteria andDelidNotIn(List<Long> values) {
            addCriterion("DELID not in", values, "delid");
            return (Criteria) this;
        }

        public Criteria andDelidBetween(Long value1, Long value2) {
            addCriterion("DELID between", value1, value2, "delid");
            return (Criteria) this;
        }

        public Criteria andDelidNotBetween(Long value1, Long value2) {
            addCriterion("DELID not between", value1, value2, "delid");
            return (Criteria) this;
        }

        public Criteria andDelstatusIsNull() {
            addCriterion("DELSTATUS is null");
            return (Criteria) this;
        }

        public Criteria andDelstatusIsNotNull() {
            addCriterion("DELSTATUS is not null");
            return (Criteria) this;
        }

        public Criteria andDelstatusEqualTo(Boolean value) {
            addCriterion("DELSTATUS =", value, "delstatus");
            return (Criteria) this;
        }

        public Criteria andDelstatusNotEqualTo(Boolean value) {
            addCriterion("DELSTATUS <>", value, "delstatus");
            return (Criteria) this;
        }

        public Criteria andDelstatusGreaterThan(Boolean value) {
            addCriterion("DELSTATUS >", value, "delstatus");
            return (Criteria) this;
        }

        public Criteria andDelstatusGreaterThanOrEqualTo(Boolean value) {
            addCriterion("DELSTATUS >=", value, "delstatus");
            return (Criteria) this;
        }

        public Criteria andDelstatusLessThan(Boolean value) {
            addCriterion("DELSTATUS <", value, "delstatus");
            return (Criteria) this;
        }

        public Criteria andDelstatusLessThanOrEqualTo(Boolean value) {
            addCriterion("DELSTATUS <=", value, "delstatus");
            return (Criteria) this;
        }

        public Criteria andDelstatusIn(List<Boolean> values) {
            addCriterion("DELSTATUS in", values, "delstatus");
            return (Criteria) this;
        }

        public Criteria andDelstatusNotIn(List<Boolean> values) {
            addCriterion("DELSTATUS not in", values, "delstatus");
            return (Criteria) this;
        }

        public Criteria andDelstatusBetween(Boolean value1, Boolean value2) {
            addCriterion("DELSTATUS between", value1, value2, "delstatus");
            return (Criteria) this;
        }

        public Criteria andDelstatusNotBetween(Boolean value1, Boolean value2) {
            addCriterion("DELSTATUS not between", value1, value2, "delstatus");
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