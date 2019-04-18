package com.shcp.pojo;

import java.util.ArrayList;
import java.util.List;

public class DeviceLimitExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DeviceLimitExample() {
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

        public Criteria andDelkeyIsNull() {
            addCriterion("DELKEY is null");
            return (Criteria) this;
        }

        public Criteria andDelkeyIsNotNull() {
            addCriterion("DELKEY is not null");
            return (Criteria) this;
        }

        public Criteria andDelkeyEqualTo(String value) {
            addCriterion("DELKEY =", value, "delkey");
            return (Criteria) this;
        }

        public Criteria andDelkeyNotEqualTo(String value) {
            addCriterion("DELKEY <>", value, "delkey");
            return (Criteria) this;
        }

        public Criteria andDelkeyGreaterThan(String value) {
            addCriterion("DELKEY >", value, "delkey");
            return (Criteria) this;
        }

        public Criteria andDelkeyGreaterThanOrEqualTo(String value) {
            addCriterion("DELKEY >=", value, "delkey");
            return (Criteria) this;
        }

        public Criteria andDelkeyLessThan(String value) {
            addCriterion("DELKEY <", value, "delkey");
            return (Criteria) this;
        }

        public Criteria andDelkeyLessThanOrEqualTo(String value) {
            addCriterion("DELKEY <=", value, "delkey");
            return (Criteria) this;
        }

        public Criteria andDelkeyLike(String value) {
            addCriterion("DELKEY like", value, "delkey");
            return (Criteria) this;
        }

        public Criteria andDelkeyNotLike(String value) {
            addCriterion("DELKEY not like", value, "delkey");
            return (Criteria) this;
        }

        public Criteria andDelkeyIn(List<String> values) {
            addCriterion("DELKEY in", values, "delkey");
            return (Criteria) this;
        }

        public Criteria andDelkeyNotIn(List<String> values) {
            addCriterion("DELKEY not in", values, "delkey");
            return (Criteria) this;
        }

        public Criteria andDelkeyBetween(String value1, String value2) {
            addCriterion("DELKEY between", value1, value2, "delkey");
            return (Criteria) this;
        }

        public Criteria andDelkeyNotBetween(String value1, String value2) {
            addCriterion("DELKEY not between", value1, value2, "delkey");
            return (Criteria) this;
        }

        public Criteria andDelvalueIsNull() {
            addCriterion("DELVALUE is null");
            return (Criteria) this;
        }

        public Criteria andDelvalueIsNotNull() {
            addCriterion("DELVALUE is not null");
            return (Criteria) this;
        }

        public Criteria andDelvalueEqualTo(String value) {
            addCriterion("DELVALUE =", value, "delvalue");
            return (Criteria) this;
        }

        public Criteria andDelvalueNotEqualTo(String value) {
            addCriterion("DELVALUE <>", value, "delvalue");
            return (Criteria) this;
        }

        public Criteria andDelvalueGreaterThan(String value) {
            addCriterion("DELVALUE >", value, "delvalue");
            return (Criteria) this;
        }

        public Criteria andDelvalueGreaterThanOrEqualTo(String value) {
            addCriterion("DELVALUE >=", value, "delvalue");
            return (Criteria) this;
        }

        public Criteria andDelvalueLessThan(String value) {
            addCriterion("DELVALUE <", value, "delvalue");
            return (Criteria) this;
        }

        public Criteria andDelvalueLessThanOrEqualTo(String value) {
            addCriterion("DELVALUE <=", value, "delvalue");
            return (Criteria) this;
        }

        public Criteria andDelvalueLike(String value) {
            addCriterion("DELVALUE like", value, "delvalue");
            return (Criteria) this;
        }

        public Criteria andDelvalueNotLike(String value) {
            addCriterion("DELVALUE not like", value, "delvalue");
            return (Criteria) this;
        }

        public Criteria andDelvalueIn(List<String> values) {
            addCriterion("DELVALUE in", values, "delvalue");
            return (Criteria) this;
        }

        public Criteria andDelvalueNotIn(List<String> values) {
            addCriterion("DELVALUE not in", values, "delvalue");
            return (Criteria) this;
        }

        public Criteria andDelvalueBetween(String value1, String value2) {
            addCriterion("DELVALUE between", value1, value2, "delvalue");
            return (Criteria) this;
        }

        public Criteria andDelvalueNotBetween(String value1, String value2) {
            addCriterion("DELVALUE not between", value1, value2, "delvalue");
            return (Criteria) this;
        }

        public Criteria andDelnameIsNull() {
            addCriterion("DELNAME is null");
            return (Criteria) this;
        }

        public Criteria andDelnameIsNotNull() {
            addCriterion("DELNAME is not null");
            return (Criteria) this;
        }

        public Criteria andDelnameEqualTo(String value) {
            addCriterion("DELNAME =", value, "delname");
            return (Criteria) this;
        }

        public Criteria andDelnameNotEqualTo(String value) {
            addCriterion("DELNAME <>", value, "delname");
            return (Criteria) this;
        }

        public Criteria andDelnameGreaterThan(String value) {
            addCriterion("DELNAME >", value, "delname");
            return (Criteria) this;
        }

        public Criteria andDelnameGreaterThanOrEqualTo(String value) {
            addCriterion("DELNAME >=", value, "delname");
            return (Criteria) this;
        }

        public Criteria andDelnameLessThan(String value) {
            addCriterion("DELNAME <", value, "delname");
            return (Criteria) this;
        }

        public Criteria andDelnameLessThanOrEqualTo(String value) {
            addCriterion("DELNAME <=", value, "delname");
            return (Criteria) this;
        }

        public Criteria andDelnameLike(String value) {
            addCriterion("DELNAME like", value, "delname");
            return (Criteria) this;
        }

        public Criteria andDelnameNotLike(String value) {
            addCriterion("DELNAME not like", value, "delname");
            return (Criteria) this;
        }

        public Criteria andDelnameIn(List<String> values) {
            addCriterion("DELNAME in", values, "delname");
            return (Criteria) this;
        }

        public Criteria andDelnameNotIn(List<String> values) {
            addCriterion("DELNAME not in", values, "delname");
            return (Criteria) this;
        }

        public Criteria andDelnameBetween(String value1, String value2) {
            addCriterion("DELNAME between", value1, value2, "delname");
            return (Criteria) this;
        }

        public Criteria andDelnameNotBetween(String value1, String value2) {
            addCriterion("DELNAME not between", value1, value2, "delname");
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