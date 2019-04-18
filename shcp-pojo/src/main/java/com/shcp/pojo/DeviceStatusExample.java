package com.shcp.pojo;

import java.util.ArrayList;
import java.util.List;

public class DeviceStatusExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DeviceStatusExample() {
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

        public Criteria andDesidIsNull() {
            addCriterion("DESID is null");
            return (Criteria) this;
        }

        public Criteria andDesidIsNotNull() {
            addCriterion("DESID is not null");
            return (Criteria) this;
        }

        public Criteria andDesidEqualTo(Long value) {
            addCriterion("DESID =", value, "desid");
            return (Criteria) this;
        }

        public Criteria andDesidNotEqualTo(Long value) {
            addCriterion("DESID <>", value, "desid");
            return (Criteria) this;
        }

        public Criteria andDesidGreaterThan(Long value) {
            addCriterion("DESID >", value, "desid");
            return (Criteria) this;
        }

        public Criteria andDesidGreaterThanOrEqualTo(Long value) {
            addCriterion("DESID >=", value, "desid");
            return (Criteria) this;
        }

        public Criteria andDesidLessThan(Long value) {
            addCriterion("DESID <", value, "desid");
            return (Criteria) this;
        }

        public Criteria andDesidLessThanOrEqualTo(Long value) {
            addCriterion("DESID <=", value, "desid");
            return (Criteria) this;
        }

        public Criteria andDesidIn(List<Long> values) {
            addCriterion("DESID in", values, "desid");
            return (Criteria) this;
        }

        public Criteria andDesidNotIn(List<Long> values) {
            addCriterion("DESID not in", values, "desid");
            return (Criteria) this;
        }

        public Criteria andDesidBetween(Long value1, Long value2) {
            addCriterion("DESID between", value1, value2, "desid");
            return (Criteria) this;
        }

        public Criteria andDesidNotBetween(Long value1, Long value2) {
            addCriterion("DESID not between", value1, value2, "desid");
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

        public Criteria andDesnameIsNull() {
            addCriterion("DESNAME is null");
            return (Criteria) this;
        }

        public Criteria andDesnameIsNotNull() {
            addCriterion("DESNAME is not null");
            return (Criteria) this;
        }

        public Criteria andDesnameEqualTo(String value) {
            addCriterion("DESNAME =", value, "desname");
            return (Criteria) this;
        }

        public Criteria andDesnameNotEqualTo(String value) {
            addCriterion("DESNAME <>", value, "desname");
            return (Criteria) this;
        }

        public Criteria andDesnameGreaterThan(String value) {
            addCriterion("DESNAME >", value, "desname");
            return (Criteria) this;
        }

        public Criteria andDesnameGreaterThanOrEqualTo(String value) {
            addCriterion("DESNAME >=", value, "desname");
            return (Criteria) this;
        }

        public Criteria andDesnameLessThan(String value) {
            addCriterion("DESNAME <", value, "desname");
            return (Criteria) this;
        }

        public Criteria andDesnameLessThanOrEqualTo(String value) {
            addCriterion("DESNAME <=", value, "desname");
            return (Criteria) this;
        }

        public Criteria andDesnameLike(String value) {
            addCriterion("DESNAME like", value, "desname");
            return (Criteria) this;
        }

        public Criteria andDesnameNotLike(String value) {
            addCriterion("DESNAME not like", value, "desname");
            return (Criteria) this;
        }

        public Criteria andDesnameIn(List<String> values) {
            addCriterion("DESNAME in", values, "desname");
            return (Criteria) this;
        }

        public Criteria andDesnameNotIn(List<String> values) {
            addCriterion("DESNAME not in", values, "desname");
            return (Criteria) this;
        }

        public Criteria andDesnameBetween(String value1, String value2) {
            addCriterion("DESNAME between", value1, value2, "desname");
            return (Criteria) this;
        }

        public Criteria andDesnameNotBetween(String value1, String value2) {
            addCriterion("DESNAME not between", value1, value2, "desname");
            return (Criteria) this;
        }

        public Criteria andDestypeIsNull() {
            addCriterion("DESTYPE is null");
            return (Criteria) this;
        }

        public Criteria andDestypeIsNotNull() {
            addCriterion("DESTYPE is not null");
            return (Criteria) this;
        }

        public Criteria andDestypeEqualTo(String value) {
            addCriterion("DESTYPE =", value, "destype");
            return (Criteria) this;
        }

        public Criteria andDestypeNotEqualTo(String value) {
            addCriterion("DESTYPE <>", value, "destype");
            return (Criteria) this;
        }

        public Criteria andDestypeGreaterThan(String value) {
            addCriterion("DESTYPE >", value, "destype");
            return (Criteria) this;
        }

        public Criteria andDestypeGreaterThanOrEqualTo(String value) {
            addCriterion("DESTYPE >=", value, "destype");
            return (Criteria) this;
        }

        public Criteria andDestypeLessThan(String value) {
            addCriterion("DESTYPE <", value, "destype");
            return (Criteria) this;
        }

        public Criteria andDestypeLessThanOrEqualTo(String value) {
            addCriterion("DESTYPE <=", value, "destype");
            return (Criteria) this;
        }

        public Criteria andDestypeLike(String value) {
            addCriterion("DESTYPE like", value, "destype");
            return (Criteria) this;
        }

        public Criteria andDestypeNotLike(String value) {
            addCriterion("DESTYPE not like", value, "destype");
            return (Criteria) this;
        }

        public Criteria andDestypeIn(List<String> values) {
            addCriterion("DESTYPE in", values, "destype");
            return (Criteria) this;
        }

        public Criteria andDestypeNotIn(List<String> values) {
            addCriterion("DESTYPE not in", values, "destype");
            return (Criteria) this;
        }

        public Criteria andDestypeBetween(String value1, String value2) {
            addCriterion("DESTYPE between", value1, value2, "destype");
            return (Criteria) this;
        }

        public Criteria andDestypeNotBetween(String value1, String value2) {
            addCriterion("DESTYPE not between", value1, value2, "destype");
            return (Criteria) this;
        }

        public Criteria andDesdefaultvalueIsNull() {
            addCriterion("DESDEFAULTVALUE is null");
            return (Criteria) this;
        }

        public Criteria andDesdefaultvalueIsNotNull() {
            addCriterion("DESDEFAULTVALUE is not null");
            return (Criteria) this;
        }

        public Criteria andDesdefaultvalueEqualTo(String value) {
            addCriterion("DESDEFAULTVALUE =", value, "desdefaultvalue");
            return (Criteria) this;
        }

        public Criteria andDesdefaultvalueNotEqualTo(String value) {
            addCriterion("DESDEFAULTVALUE <>", value, "desdefaultvalue");
            return (Criteria) this;
        }

        public Criteria andDesdefaultvalueGreaterThan(String value) {
            addCriterion("DESDEFAULTVALUE >", value, "desdefaultvalue");
            return (Criteria) this;
        }

        public Criteria andDesdefaultvalueGreaterThanOrEqualTo(String value) {
            addCriterion("DESDEFAULTVALUE >=", value, "desdefaultvalue");
            return (Criteria) this;
        }

        public Criteria andDesdefaultvalueLessThan(String value) {
            addCriterion("DESDEFAULTVALUE <", value, "desdefaultvalue");
            return (Criteria) this;
        }

        public Criteria andDesdefaultvalueLessThanOrEqualTo(String value) {
            addCriterion("DESDEFAULTVALUE <=", value, "desdefaultvalue");
            return (Criteria) this;
        }

        public Criteria andDesdefaultvalueLike(String value) {
            addCriterion("DESDEFAULTVALUE like", value, "desdefaultvalue");
            return (Criteria) this;
        }

        public Criteria andDesdefaultvalueNotLike(String value) {
            addCriterion("DESDEFAULTVALUE not like", value, "desdefaultvalue");
            return (Criteria) this;
        }

        public Criteria andDesdefaultvalueIn(List<String> values) {
            addCriterion("DESDEFAULTVALUE in", values, "desdefaultvalue");
            return (Criteria) this;
        }

        public Criteria andDesdefaultvalueNotIn(List<String> values) {
            addCriterion("DESDEFAULTVALUE not in", values, "desdefaultvalue");
            return (Criteria) this;
        }

        public Criteria andDesdefaultvalueBetween(String value1, String value2) {
            addCriterion("DESDEFAULTVALUE between", value1, value2, "desdefaultvalue");
            return (Criteria) this;
        }

        public Criteria andDesdefaultvalueNotBetween(String value1, String value2) {
            addCriterion("DESDEFAULTVALUE not between", value1, value2, "desdefaultvalue");
            return (Criteria) this;
        }

        public Criteria andDesminvalueIsNull() {
            addCriterion("DESMINVALUE is null");
            return (Criteria) this;
        }

        public Criteria andDesminvalueIsNotNull() {
            addCriterion("DESMINVALUE is not null");
            return (Criteria) this;
        }

        public Criteria andDesminvalueEqualTo(String value) {
            addCriterion("DESMINVALUE =", value, "desminvalue");
            return (Criteria) this;
        }

        public Criteria andDesminvalueNotEqualTo(String value) {
            addCriterion("DESMINVALUE <>", value, "desminvalue");
            return (Criteria) this;
        }

        public Criteria andDesminvalueGreaterThan(String value) {
            addCriterion("DESMINVALUE >", value, "desminvalue");
            return (Criteria) this;
        }

        public Criteria andDesminvalueGreaterThanOrEqualTo(String value) {
            addCriterion("DESMINVALUE >=", value, "desminvalue");
            return (Criteria) this;
        }

        public Criteria andDesminvalueLessThan(String value) {
            addCriterion("DESMINVALUE <", value, "desminvalue");
            return (Criteria) this;
        }

        public Criteria andDesminvalueLessThanOrEqualTo(String value) {
            addCriterion("DESMINVALUE <=", value, "desminvalue");
            return (Criteria) this;
        }

        public Criteria andDesminvalueLike(String value) {
            addCriterion("DESMINVALUE like", value, "desminvalue");
            return (Criteria) this;
        }

        public Criteria andDesminvalueNotLike(String value) {
            addCriterion("DESMINVALUE not like", value, "desminvalue");
            return (Criteria) this;
        }

        public Criteria andDesminvalueIn(List<String> values) {
            addCriterion("DESMINVALUE in", values, "desminvalue");
            return (Criteria) this;
        }

        public Criteria andDesminvalueNotIn(List<String> values) {
            addCriterion("DESMINVALUE not in", values, "desminvalue");
            return (Criteria) this;
        }

        public Criteria andDesminvalueBetween(String value1, String value2) {
            addCriterion("DESMINVALUE between", value1, value2, "desminvalue");
            return (Criteria) this;
        }

        public Criteria andDesminvalueNotBetween(String value1, String value2) {
            addCriterion("DESMINVALUE not between", value1, value2, "desminvalue");
            return (Criteria) this;
        }

        public Criteria andDesmaxvalueIsNull() {
            addCriterion("DESMAXVALUE is null");
            return (Criteria) this;
        }

        public Criteria andDesmaxvalueIsNotNull() {
            addCriterion("DESMAXVALUE is not null");
            return (Criteria) this;
        }

        public Criteria andDesmaxvalueEqualTo(String value) {
            addCriterion("DESMAXVALUE =", value, "desmaxvalue");
            return (Criteria) this;
        }

        public Criteria andDesmaxvalueNotEqualTo(String value) {
            addCriterion("DESMAXVALUE <>", value, "desmaxvalue");
            return (Criteria) this;
        }

        public Criteria andDesmaxvalueGreaterThan(String value) {
            addCriterion("DESMAXVALUE >", value, "desmaxvalue");
            return (Criteria) this;
        }

        public Criteria andDesmaxvalueGreaterThanOrEqualTo(String value) {
            addCriterion("DESMAXVALUE >=", value, "desmaxvalue");
            return (Criteria) this;
        }

        public Criteria andDesmaxvalueLessThan(String value) {
            addCriterion("DESMAXVALUE <", value, "desmaxvalue");
            return (Criteria) this;
        }

        public Criteria andDesmaxvalueLessThanOrEqualTo(String value) {
            addCriterion("DESMAXVALUE <=", value, "desmaxvalue");
            return (Criteria) this;
        }

        public Criteria andDesmaxvalueLike(String value) {
            addCriterion("DESMAXVALUE like", value, "desmaxvalue");
            return (Criteria) this;
        }

        public Criteria andDesmaxvalueNotLike(String value) {
            addCriterion("DESMAXVALUE not like", value, "desmaxvalue");
            return (Criteria) this;
        }

        public Criteria andDesmaxvalueIn(List<String> values) {
            addCriterion("DESMAXVALUE in", values, "desmaxvalue");
            return (Criteria) this;
        }

        public Criteria andDesmaxvalueNotIn(List<String> values) {
            addCriterion("DESMAXVALUE not in", values, "desmaxvalue");
            return (Criteria) this;
        }

        public Criteria andDesmaxvalueBetween(String value1, String value2) {
            addCriterion("DESMAXVALUE between", value1, value2, "desmaxvalue");
            return (Criteria) this;
        }

        public Criteria andDesmaxvalueNotBetween(String value1, String value2) {
            addCriterion("DESMAXVALUE not between", value1, value2, "desmaxvalue");
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