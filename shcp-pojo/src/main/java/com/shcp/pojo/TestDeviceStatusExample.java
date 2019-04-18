package com.shcp.pojo;

import java.util.ArrayList;
import java.util.List;

public class TestDeviceStatusExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TestDeviceStatusExample() {
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

        public Criteria andTdesidIsNull() {
            addCriterion("TDESID is null");
            return (Criteria) this;
        }

        public Criteria andTdesidIsNotNull() {
            addCriterion("TDESID is not null");
            return (Criteria) this;
        }

        public Criteria andTdesidEqualTo(Long value) {
            addCriterion("TDESID =", value, "tdesid");
            return (Criteria) this;
        }

        public Criteria andTdesidNotEqualTo(Long value) {
            addCriterion("TDESID <>", value, "tdesid");
            return (Criteria) this;
        }

        public Criteria andTdesidGreaterThan(Long value) {
            addCriterion("TDESID >", value, "tdesid");
            return (Criteria) this;
        }

        public Criteria andTdesidGreaterThanOrEqualTo(Long value) {
            addCriterion("TDESID >=", value, "tdesid");
            return (Criteria) this;
        }

        public Criteria andTdesidLessThan(Long value) {
            addCriterion("TDESID <", value, "tdesid");
            return (Criteria) this;
        }

        public Criteria andTdesidLessThanOrEqualTo(Long value) {
            addCriterion("TDESID <=", value, "tdesid");
            return (Criteria) this;
        }

        public Criteria andTdesidIn(List<Long> values) {
            addCriterion("TDESID in", values, "tdesid");
            return (Criteria) this;
        }

        public Criteria andTdesidNotIn(List<Long> values) {
            addCriterion("TDESID not in", values, "tdesid");
            return (Criteria) this;
        }

        public Criteria andTdesidBetween(Long value1, Long value2) {
            addCriterion("TDESID between", value1, value2, "tdesid");
            return (Criteria) this;
        }

        public Criteria andTdesidNotBetween(Long value1, Long value2) {
            addCriterion("TDESID not between", value1, value2, "tdesid");
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

        public Criteria andTdesnameIsNull() {
            addCriterion("TDESNAME is null");
            return (Criteria) this;
        }

        public Criteria andTdesnameIsNotNull() {
            addCriterion("TDESNAME is not null");
            return (Criteria) this;
        }

        public Criteria andTdesnameEqualTo(String value) {
            addCriterion("TDESNAME =", value, "tdesname");
            return (Criteria) this;
        }

        public Criteria andTdesnameNotEqualTo(String value) {
            addCriterion("TDESNAME <>", value, "tdesname");
            return (Criteria) this;
        }

        public Criteria andTdesnameGreaterThan(String value) {
            addCriterion("TDESNAME >", value, "tdesname");
            return (Criteria) this;
        }

        public Criteria andTdesnameGreaterThanOrEqualTo(String value) {
            addCriterion("TDESNAME >=", value, "tdesname");
            return (Criteria) this;
        }

        public Criteria andTdesnameLessThan(String value) {
            addCriterion("TDESNAME <", value, "tdesname");
            return (Criteria) this;
        }

        public Criteria andTdesnameLessThanOrEqualTo(String value) {
            addCriterion("TDESNAME <=", value, "tdesname");
            return (Criteria) this;
        }

        public Criteria andTdesnameLike(String value) {
            addCriterion("TDESNAME like", value, "tdesname");
            return (Criteria) this;
        }

        public Criteria andTdesnameNotLike(String value) {
            addCriterion("TDESNAME not like", value, "tdesname");
            return (Criteria) this;
        }

        public Criteria andTdesnameIn(List<String> values) {
            addCriterion("TDESNAME in", values, "tdesname");
            return (Criteria) this;
        }

        public Criteria andTdesnameNotIn(List<String> values) {
            addCriterion("TDESNAME not in", values, "tdesname");
            return (Criteria) this;
        }

        public Criteria andTdesnameBetween(String value1, String value2) {
            addCriterion("TDESNAME between", value1, value2, "tdesname");
            return (Criteria) this;
        }

        public Criteria andTdesnameNotBetween(String value1, String value2) {
            addCriterion("TDESNAME not between", value1, value2, "tdesname");
            return (Criteria) this;
        }

        public Criteria andTdestypeIsNull() {
            addCriterion("TDESTYPE is null");
            return (Criteria) this;
        }

        public Criteria andTdestypeIsNotNull() {
            addCriterion("TDESTYPE is not null");
            return (Criteria) this;
        }

        public Criteria andTdestypeEqualTo(String value) {
            addCriterion("TDESTYPE =", value, "tdestype");
            return (Criteria) this;
        }

        public Criteria andTdestypeNotEqualTo(String value) {
            addCriterion("TDESTYPE <>", value, "tdestype");
            return (Criteria) this;
        }

        public Criteria andTdestypeGreaterThan(String value) {
            addCriterion("TDESTYPE >", value, "tdestype");
            return (Criteria) this;
        }

        public Criteria andTdestypeGreaterThanOrEqualTo(String value) {
            addCriterion("TDESTYPE >=", value, "tdestype");
            return (Criteria) this;
        }

        public Criteria andTdestypeLessThan(String value) {
            addCriterion("TDESTYPE <", value, "tdestype");
            return (Criteria) this;
        }

        public Criteria andTdestypeLessThanOrEqualTo(String value) {
            addCriterion("TDESTYPE <=", value, "tdestype");
            return (Criteria) this;
        }

        public Criteria andTdestypeLike(String value) {
            addCriterion("TDESTYPE like", value, "tdestype");
            return (Criteria) this;
        }

        public Criteria andTdestypeNotLike(String value) {
            addCriterion("TDESTYPE not like", value, "tdestype");
            return (Criteria) this;
        }

        public Criteria andTdestypeIn(List<String> values) {
            addCriterion("TDESTYPE in", values, "tdestype");
            return (Criteria) this;
        }

        public Criteria andTdestypeNotIn(List<String> values) {
            addCriterion("TDESTYPE not in", values, "tdestype");
            return (Criteria) this;
        }

        public Criteria andTdestypeBetween(String value1, String value2) {
            addCriterion("TDESTYPE between", value1, value2, "tdestype");
            return (Criteria) this;
        }

        public Criteria andTdestypeNotBetween(String value1, String value2) {
            addCriterion("TDESTYPE not between", value1, value2, "tdestype");
            return (Criteria) this;
        }

        public Criteria andTdesdefaultvalueIsNull() {
            addCriterion("TDESDEFAULTVALUE is null");
            return (Criteria) this;
        }

        public Criteria andTdesdefaultvalueIsNotNull() {
            addCriterion("TDESDEFAULTVALUE is not null");
            return (Criteria) this;
        }

        public Criteria andTdesdefaultvalueEqualTo(String value) {
            addCriterion("TDESDEFAULTVALUE =", value, "tdesdefaultvalue");
            return (Criteria) this;
        }

        public Criteria andTdesdefaultvalueNotEqualTo(String value) {
            addCriterion("TDESDEFAULTVALUE <>", value, "tdesdefaultvalue");
            return (Criteria) this;
        }

        public Criteria andTdesdefaultvalueGreaterThan(String value) {
            addCriterion("TDESDEFAULTVALUE >", value, "tdesdefaultvalue");
            return (Criteria) this;
        }

        public Criteria andTdesdefaultvalueGreaterThanOrEqualTo(String value) {
            addCriterion("TDESDEFAULTVALUE >=", value, "tdesdefaultvalue");
            return (Criteria) this;
        }

        public Criteria andTdesdefaultvalueLessThan(String value) {
            addCriterion("TDESDEFAULTVALUE <", value, "tdesdefaultvalue");
            return (Criteria) this;
        }

        public Criteria andTdesdefaultvalueLessThanOrEqualTo(String value) {
            addCriterion("TDESDEFAULTVALUE <=", value, "tdesdefaultvalue");
            return (Criteria) this;
        }

        public Criteria andTdesdefaultvalueLike(String value) {
            addCriterion("TDESDEFAULTVALUE like", value, "tdesdefaultvalue");
            return (Criteria) this;
        }

        public Criteria andTdesdefaultvalueNotLike(String value) {
            addCriterion("TDESDEFAULTVALUE not like", value, "tdesdefaultvalue");
            return (Criteria) this;
        }

        public Criteria andTdesdefaultvalueIn(List<String> values) {
            addCriterion("TDESDEFAULTVALUE in", values, "tdesdefaultvalue");
            return (Criteria) this;
        }

        public Criteria andTdesdefaultvalueNotIn(List<String> values) {
            addCriterion("TDESDEFAULTVALUE not in", values, "tdesdefaultvalue");
            return (Criteria) this;
        }

        public Criteria andTdesdefaultvalueBetween(String value1, String value2) {
            addCriterion("TDESDEFAULTVALUE between", value1, value2, "tdesdefaultvalue");
            return (Criteria) this;
        }

        public Criteria andTdesdefaultvalueNotBetween(String value1, String value2) {
            addCriterion("TDESDEFAULTVALUE not between", value1, value2, "tdesdefaultvalue");
            return (Criteria) this;
        }

        public Criteria andTdesminvalueIsNull() {
            addCriterion("TDESMINVALUE is null");
            return (Criteria) this;
        }

        public Criteria andTdesminvalueIsNotNull() {
            addCriterion("TDESMINVALUE is not null");
            return (Criteria) this;
        }

        public Criteria andTdesminvalueEqualTo(String value) {
            addCriterion("TDESMINVALUE =", value, "tdesminvalue");
            return (Criteria) this;
        }

        public Criteria andTdesminvalueNotEqualTo(String value) {
            addCriterion("TDESMINVALUE <>", value, "tdesminvalue");
            return (Criteria) this;
        }

        public Criteria andTdesminvalueGreaterThan(String value) {
            addCriterion("TDESMINVALUE >", value, "tdesminvalue");
            return (Criteria) this;
        }

        public Criteria andTdesminvalueGreaterThanOrEqualTo(String value) {
            addCriterion("TDESMINVALUE >=", value, "tdesminvalue");
            return (Criteria) this;
        }

        public Criteria andTdesminvalueLessThan(String value) {
            addCriterion("TDESMINVALUE <", value, "tdesminvalue");
            return (Criteria) this;
        }

        public Criteria andTdesminvalueLessThanOrEqualTo(String value) {
            addCriterion("TDESMINVALUE <=", value, "tdesminvalue");
            return (Criteria) this;
        }

        public Criteria andTdesminvalueLike(String value) {
            addCriterion("TDESMINVALUE like", value, "tdesminvalue");
            return (Criteria) this;
        }

        public Criteria andTdesminvalueNotLike(String value) {
            addCriterion("TDESMINVALUE not like", value, "tdesminvalue");
            return (Criteria) this;
        }

        public Criteria andTdesminvalueIn(List<String> values) {
            addCriterion("TDESMINVALUE in", values, "tdesminvalue");
            return (Criteria) this;
        }

        public Criteria andTdesminvalueNotIn(List<String> values) {
            addCriterion("TDESMINVALUE not in", values, "tdesminvalue");
            return (Criteria) this;
        }

        public Criteria andTdesminvalueBetween(String value1, String value2) {
            addCriterion("TDESMINVALUE between", value1, value2, "tdesminvalue");
            return (Criteria) this;
        }

        public Criteria andTdesminvalueNotBetween(String value1, String value2) {
            addCriterion("TDESMINVALUE not between", value1, value2, "tdesminvalue");
            return (Criteria) this;
        }

        public Criteria andTdesmaxvalueIsNull() {
            addCriterion("TDESMAXVALUE is null");
            return (Criteria) this;
        }

        public Criteria andTdesmaxvalueIsNotNull() {
            addCriterion("TDESMAXVALUE is not null");
            return (Criteria) this;
        }

        public Criteria andTdesmaxvalueEqualTo(String value) {
            addCriterion("TDESMAXVALUE =", value, "tdesmaxvalue");
            return (Criteria) this;
        }

        public Criteria andTdesmaxvalueNotEqualTo(String value) {
            addCriterion("TDESMAXVALUE <>", value, "tdesmaxvalue");
            return (Criteria) this;
        }

        public Criteria andTdesmaxvalueGreaterThan(String value) {
            addCriterion("TDESMAXVALUE >", value, "tdesmaxvalue");
            return (Criteria) this;
        }

        public Criteria andTdesmaxvalueGreaterThanOrEqualTo(String value) {
            addCriterion("TDESMAXVALUE >=", value, "tdesmaxvalue");
            return (Criteria) this;
        }

        public Criteria andTdesmaxvalueLessThan(String value) {
            addCriterion("TDESMAXVALUE <", value, "tdesmaxvalue");
            return (Criteria) this;
        }

        public Criteria andTdesmaxvalueLessThanOrEqualTo(String value) {
            addCriterion("TDESMAXVALUE <=", value, "tdesmaxvalue");
            return (Criteria) this;
        }

        public Criteria andTdesmaxvalueLike(String value) {
            addCriterion("TDESMAXVALUE like", value, "tdesmaxvalue");
            return (Criteria) this;
        }

        public Criteria andTdesmaxvalueNotLike(String value) {
            addCriterion("TDESMAXVALUE not like", value, "tdesmaxvalue");
            return (Criteria) this;
        }

        public Criteria andTdesmaxvalueIn(List<String> values) {
            addCriterion("TDESMAXVALUE in", values, "tdesmaxvalue");
            return (Criteria) this;
        }

        public Criteria andTdesmaxvalueNotIn(List<String> values) {
            addCriterion("TDESMAXVALUE not in", values, "tdesmaxvalue");
            return (Criteria) this;
        }

        public Criteria andTdesmaxvalueBetween(String value1, String value2) {
            addCriterion("TDESMAXVALUE between", value1, value2, "tdesmaxvalue");
            return (Criteria) this;
        }

        public Criteria andTdesmaxvalueNotBetween(String value1, String value2) {
            addCriterion("TDESMAXVALUE not between", value1, value2, "tdesmaxvalue");
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