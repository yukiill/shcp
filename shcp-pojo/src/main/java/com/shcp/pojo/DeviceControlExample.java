package com.shcp.pojo;

import java.util.ArrayList;
import java.util.List;

public class DeviceControlExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DeviceControlExample() {
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

        public Criteria andDecidIsNull() {
            addCriterion("DECID is null");
            return (Criteria) this;
        }

        public Criteria andDecidIsNotNull() {
            addCriterion("DECID is not null");
            return (Criteria) this;
        }

        public Criteria andDecidEqualTo(Long value) {
            addCriterion("DECID =", value, "decid");
            return (Criteria) this;
        }

        public Criteria andDecidNotEqualTo(Long value) {
            addCriterion("DECID <>", value, "decid");
            return (Criteria) this;
        }

        public Criteria andDecidGreaterThan(Long value) {
            addCriterion("DECID >", value, "decid");
            return (Criteria) this;
        }

        public Criteria andDecidGreaterThanOrEqualTo(Long value) {
            addCriterion("DECID >=", value, "decid");
            return (Criteria) this;
        }

        public Criteria andDecidLessThan(Long value) {
            addCriterion("DECID <", value, "decid");
            return (Criteria) this;
        }

        public Criteria andDecidLessThanOrEqualTo(Long value) {
            addCriterion("DECID <=", value, "decid");
            return (Criteria) this;
        }

        public Criteria andDecidIn(List<Long> values) {
            addCriterion("DECID in", values, "decid");
            return (Criteria) this;
        }

        public Criteria andDecidNotIn(List<Long> values) {
            addCriterion("DECID not in", values, "decid");
            return (Criteria) this;
        }

        public Criteria andDecidBetween(Long value1, Long value2) {
            addCriterion("DECID between", value1, value2, "decid");
            return (Criteria) this;
        }

        public Criteria andDecidNotBetween(Long value1, Long value2) {
            addCriterion("DECID not between", value1, value2, "decid");
            return (Criteria) this;
        }

        public Criteria andDetidIsNull() {
            addCriterion("DETID is null");
            return (Criteria) this;
        }

        public Criteria andDetidIsNotNull() {
            addCriterion("DETID is not null");
            return (Criteria) this;
        }

        public Criteria andDetidEqualTo(Long value) {
            addCriterion("DETID =", value, "detid");
            return (Criteria) this;
        }

        public Criteria andDetidNotEqualTo(Long value) {
            addCriterion("DETID <>", value, "detid");
            return (Criteria) this;
        }

        public Criteria andDetidGreaterThan(Long value) {
            addCriterion("DETID >", value, "detid");
            return (Criteria) this;
        }

        public Criteria andDetidGreaterThanOrEqualTo(Long value) {
            addCriterion("DETID >=", value, "detid");
            return (Criteria) this;
        }

        public Criteria andDetidLessThan(Long value) {
            addCriterion("DETID <", value, "detid");
            return (Criteria) this;
        }

        public Criteria andDetidLessThanOrEqualTo(Long value) {
            addCriterion("DETID <=", value, "detid");
            return (Criteria) this;
        }

        public Criteria andDetidIn(List<Long> values) {
            addCriterion("DETID in", values, "detid");
            return (Criteria) this;
        }

        public Criteria andDetidNotIn(List<Long> values) {
            addCriterion("DETID not in", values, "detid");
            return (Criteria) this;
        }

        public Criteria andDetidBetween(Long value1, Long value2) {
            addCriterion("DETID between", value1, value2, "detid");
            return (Criteria) this;
        }

        public Criteria andDetidNotBetween(Long value1, Long value2) {
            addCriterion("DETID not between", value1, value2, "detid");
            return (Criteria) this;
        }

        public Criteria andDecnameIsNull() {
            addCriterion("DECNAME is null");
            return (Criteria) this;
        }

        public Criteria andDecnameIsNotNull() {
            addCriterion("DECNAME is not null");
            return (Criteria) this;
        }

        public Criteria andDecnameEqualTo(String value) {
            addCriterion("DECNAME =", value, "decname");
            return (Criteria) this;
        }

        public Criteria andDecnameNotEqualTo(String value) {
            addCriterion("DECNAME <>", value, "decname");
            return (Criteria) this;
        }

        public Criteria andDecnameGreaterThan(String value) {
            addCriterion("DECNAME >", value, "decname");
            return (Criteria) this;
        }

        public Criteria andDecnameGreaterThanOrEqualTo(String value) {
            addCriterion("DECNAME >=", value, "decname");
            return (Criteria) this;
        }

        public Criteria andDecnameLessThan(String value) {
            addCriterion("DECNAME <", value, "decname");
            return (Criteria) this;
        }

        public Criteria andDecnameLessThanOrEqualTo(String value) {
            addCriterion("DECNAME <=", value, "decname");
            return (Criteria) this;
        }

        public Criteria andDecnameLike(String value) {
            addCriterion("DECNAME like", value, "decname");
            return (Criteria) this;
        }

        public Criteria andDecnameNotLike(String value) {
            addCriterion("DECNAME not like", value, "decname");
            return (Criteria) this;
        }

        public Criteria andDecnameIn(List<String> values) {
            addCriterion("DECNAME in", values, "decname");
            return (Criteria) this;
        }

        public Criteria andDecnameNotIn(List<String> values) {
            addCriterion("DECNAME not in", values, "decname");
            return (Criteria) this;
        }

        public Criteria andDecnameBetween(String value1, String value2) {
            addCriterion("DECNAME between", value1, value2, "decname");
            return (Criteria) this;
        }

        public Criteria andDecnameNotBetween(String value1, String value2) {
            addCriterion("DECNAME not between", value1, value2, "decname");
            return (Criteria) this;
        }

        public Criteria andDeckeyIsNull() {
            addCriterion("DECKEY is null");
            return (Criteria) this;
        }

        public Criteria andDeckeyIsNotNull() {
            addCriterion("DECKEY is not null");
            return (Criteria) this;
        }

        public Criteria andDeckeyEqualTo(String value) {
            addCriterion("DECKEY =", value, "deckey");
            return (Criteria) this;
        }

        public Criteria andDeckeyNotEqualTo(String value) {
            addCriterion("DECKEY <>", value, "deckey");
            return (Criteria) this;
        }

        public Criteria andDeckeyGreaterThan(String value) {
            addCriterion("DECKEY >", value, "deckey");
            return (Criteria) this;
        }

        public Criteria andDeckeyGreaterThanOrEqualTo(String value) {
            addCriterion("DECKEY >=", value, "deckey");
            return (Criteria) this;
        }

        public Criteria andDeckeyLessThan(String value) {
            addCriterion("DECKEY <", value, "deckey");
            return (Criteria) this;
        }

        public Criteria andDeckeyLessThanOrEqualTo(String value) {
            addCriterion("DECKEY <=", value, "deckey");
            return (Criteria) this;
        }

        public Criteria andDeckeyLike(String value) {
            addCriterion("DECKEY like", value, "deckey");
            return (Criteria) this;
        }

        public Criteria andDeckeyNotLike(String value) {
            addCriterion("DECKEY not like", value, "deckey");
            return (Criteria) this;
        }

        public Criteria andDeckeyIn(List<String> values) {
            addCriterion("DECKEY in", values, "deckey");
            return (Criteria) this;
        }

        public Criteria andDeckeyNotIn(List<String> values) {
            addCriterion("DECKEY not in", values, "deckey");
            return (Criteria) this;
        }

        public Criteria andDeckeyBetween(String value1, String value2) {
            addCriterion("DECKEY between", value1, value2, "deckey");
            return (Criteria) this;
        }

        public Criteria andDeckeyNotBetween(String value1, String value2) {
            addCriterion("DECKEY not between", value1, value2, "deckey");
            return (Criteria) this;
        }

        public Criteria andDecvalueIsNull() {
            addCriterion("DECVALUE is null");
            return (Criteria) this;
        }

        public Criteria andDecvalueIsNotNull() {
            addCriterion("DECVALUE is not null");
            return (Criteria) this;
        }

        public Criteria andDecvalueEqualTo(String value) {
            addCriterion("DECVALUE =", value, "decvalue");
            return (Criteria) this;
        }

        public Criteria andDecvalueNotEqualTo(String value) {
            addCriterion("DECVALUE <>", value, "decvalue");
            return (Criteria) this;
        }

        public Criteria andDecvalueGreaterThan(String value) {
            addCriterion("DECVALUE >", value, "decvalue");
            return (Criteria) this;
        }

        public Criteria andDecvalueGreaterThanOrEqualTo(String value) {
            addCriterion("DECVALUE >=", value, "decvalue");
            return (Criteria) this;
        }

        public Criteria andDecvalueLessThan(String value) {
            addCriterion("DECVALUE <", value, "decvalue");
            return (Criteria) this;
        }

        public Criteria andDecvalueLessThanOrEqualTo(String value) {
            addCriterion("DECVALUE <=", value, "decvalue");
            return (Criteria) this;
        }

        public Criteria andDecvalueLike(String value) {
            addCriterion("DECVALUE like", value, "decvalue");
            return (Criteria) this;
        }

        public Criteria andDecvalueNotLike(String value) {
            addCriterion("DECVALUE not like", value, "decvalue");
            return (Criteria) this;
        }

        public Criteria andDecvalueIn(List<String> values) {
            addCriterion("DECVALUE in", values, "decvalue");
            return (Criteria) this;
        }

        public Criteria andDecvalueNotIn(List<String> values) {
            addCriterion("DECVALUE not in", values, "decvalue");
            return (Criteria) this;
        }

        public Criteria andDecvalueBetween(String value1, String value2) {
            addCriterion("DECVALUE between", value1, value2, "decvalue");
            return (Criteria) this;
        }

        public Criteria andDecvalueNotBetween(String value1, String value2) {
            addCriterion("DECVALUE not between", value1, value2, "decvalue");
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