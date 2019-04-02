package com.shcp.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TbUserfeedbackExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TbUserfeedbackExample() {
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

        public Criteria andFidIsNull() {
            addCriterion("FID is null");
            return (Criteria) this;
        }

        public Criteria andFidIsNotNull() {
            addCriterion("FID is not null");
            return (Criteria) this;
        }

        public Criteria andFidEqualTo(Long value) {
            addCriterion("FID =", value, "fid");
            return (Criteria) this;
        }

        public Criteria andFidNotEqualTo(Long value) {
            addCriterion("FID <>", value, "fid");
            return (Criteria) this;
        }

        public Criteria andFidGreaterThan(Long value) {
            addCriterion("FID >", value, "fid");
            return (Criteria) this;
        }

        public Criteria andFidGreaterThanOrEqualTo(Long value) {
            addCriterion("FID >=", value, "fid");
            return (Criteria) this;
        }

        public Criteria andFidLessThan(Long value) {
            addCriterion("FID <", value, "fid");
            return (Criteria) this;
        }

        public Criteria andFidLessThanOrEqualTo(Long value) {
            addCriterion("FID <=", value, "fid");
            return (Criteria) this;
        }

        public Criteria andFidIn(List<Long> values) {
            addCriterion("FID in", values, "fid");
            return (Criteria) this;
        }

        public Criteria andFidNotIn(List<Long> values) {
            addCriterion("FID not in", values, "fid");
            return (Criteria) this;
        }

        public Criteria andFidBetween(Long value1, Long value2) {
            addCriterion("FID between", value1, value2, "fid");
            return (Criteria) this;
        }

        public Criteria andFidNotBetween(Long value1, Long value2) {
            addCriterion("FID not between", value1, value2, "fid");
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

        public Criteria andUidIsNull() {
            addCriterion("UID is null");
            return (Criteria) this;
        }

        public Criteria andUidIsNotNull() {
            addCriterion("UID is not null");
            return (Criteria) this;
        }

        public Criteria andUidEqualTo(Long value) {
            addCriterion("UID =", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidNotEqualTo(Long value) {
            addCriterion("UID <>", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidGreaterThan(Long value) {
            addCriterion("UID >", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidGreaterThanOrEqualTo(Long value) {
            addCriterion("UID >=", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidLessThan(Long value) {
            addCriterion("UID <", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidLessThanOrEqualTo(Long value) {
            addCriterion("UID <=", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidIn(List<Long> values) {
            addCriterion("UID in", values, "uid");
            return (Criteria) this;
        }

        public Criteria andUidNotIn(List<Long> values) {
            addCriterion("UID not in", values, "uid");
            return (Criteria) this;
        }

        public Criteria andUidBetween(Long value1, Long value2) {
            addCriterion("UID between", value1, value2, "uid");
            return (Criteria) this;
        }

        public Criteria andUidNotBetween(Long value1, Long value2) {
            addCriterion("UID not between", value1, value2, "uid");
            return (Criteria) this;
        }

        public Criteria andFdatetimeIsNull() {
            addCriterion("FDATETIME is null");
            return (Criteria) this;
        }

        public Criteria andFdatetimeIsNotNull() {
            addCriterion("FDATETIME is not null");
            return (Criteria) this;
        }

        public Criteria andFdatetimeEqualTo(Date value) {
            addCriterion("FDATETIME =", value, "fdatetime");
            return (Criteria) this;
        }

        public Criteria andFdatetimeNotEqualTo(Date value) {
            addCriterion("FDATETIME <>", value, "fdatetime");
            return (Criteria) this;
        }

        public Criteria andFdatetimeGreaterThan(Date value) {
            addCriterion("FDATETIME >", value, "fdatetime");
            return (Criteria) this;
        }

        public Criteria andFdatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("FDATETIME >=", value, "fdatetime");
            return (Criteria) this;
        }

        public Criteria andFdatetimeLessThan(Date value) {
            addCriterion("FDATETIME <", value, "fdatetime");
            return (Criteria) this;
        }

        public Criteria andFdatetimeLessThanOrEqualTo(Date value) {
            addCriterion("FDATETIME <=", value, "fdatetime");
            return (Criteria) this;
        }

        public Criteria andFdatetimeIn(List<Date> values) {
            addCriterion("FDATETIME in", values, "fdatetime");
            return (Criteria) this;
        }

        public Criteria andFdatetimeNotIn(List<Date> values) {
            addCriterion("FDATETIME not in", values, "fdatetime");
            return (Criteria) this;
        }

        public Criteria andFdatetimeBetween(Date value1, Date value2) {
            addCriterion("FDATETIME between", value1, value2, "fdatetime");
            return (Criteria) this;
        }

        public Criteria andFdatetimeNotBetween(Date value1, Date value2) {
            addCriterion("FDATETIME not between", value1, value2, "fdatetime");
            return (Criteria) this;
        }

        public Criteria andFcheckIsNull() {
            addCriterion("FCHECK is null");
            return (Criteria) this;
        }

        public Criteria andFcheckIsNotNull() {
            addCriterion("FCHECK is not null");
            return (Criteria) this;
        }

        public Criteria andFcheckEqualTo(Byte value) {
            addCriterion("FCHECK =", value, "fcheck");
            return (Criteria) this;
        }

        public Criteria andFcheckNotEqualTo(Byte value) {
            addCriterion("FCHECK <>", value, "fcheck");
            return (Criteria) this;
        }

        public Criteria andFcheckGreaterThan(Byte value) {
            addCriterion("FCHECK >", value, "fcheck");
            return (Criteria) this;
        }

        public Criteria andFcheckGreaterThanOrEqualTo(Byte value) {
            addCriterion("FCHECK >=", value, "fcheck");
            return (Criteria) this;
        }

        public Criteria andFcheckLessThan(Byte value) {
            addCriterion("FCHECK <", value, "fcheck");
            return (Criteria) this;
        }

        public Criteria andFcheckLessThanOrEqualTo(Byte value) {
            addCriterion("FCHECK <=", value, "fcheck");
            return (Criteria) this;
        }

        public Criteria andFcheckIn(List<Byte> values) {
            addCriterion("FCHECK in", values, "fcheck");
            return (Criteria) this;
        }

        public Criteria andFcheckNotIn(List<Byte> values) {
            addCriterion("FCHECK not in", values, "fcheck");
            return (Criteria) this;
        }

        public Criteria andFcheckBetween(Byte value1, Byte value2) {
            addCriterion("FCHECK between", value1, value2, "fcheck");
            return (Criteria) this;
        }

        public Criteria andFcheckNotBetween(Byte value1, Byte value2) {
            addCriterion("FCHECK not between", value1, value2, "fcheck");
            return (Criteria) this;
        }

        public Criteria andFreplyIsNull() {
            addCriterion("FREPLY is null");
            return (Criteria) this;
        }

        public Criteria andFreplyIsNotNull() {
            addCriterion("FREPLY is not null");
            return (Criteria) this;
        }

        public Criteria andFreplyEqualTo(Byte value) {
            addCriterion("FREPLY =", value, "freply");
            return (Criteria) this;
        }

        public Criteria andFreplyNotEqualTo(Byte value) {
            addCriterion("FREPLY <>", value, "freply");
            return (Criteria) this;
        }

        public Criteria andFreplyGreaterThan(Byte value) {
            addCriterion("FREPLY >", value, "freply");
            return (Criteria) this;
        }

        public Criteria andFreplyGreaterThanOrEqualTo(Byte value) {
            addCriterion("FREPLY >=", value, "freply");
            return (Criteria) this;
        }

        public Criteria andFreplyLessThan(Byte value) {
            addCriterion("FREPLY <", value, "freply");
            return (Criteria) this;
        }

        public Criteria andFreplyLessThanOrEqualTo(Byte value) {
            addCriterion("FREPLY <=", value, "freply");
            return (Criteria) this;
        }

        public Criteria andFreplyIn(List<Byte> values) {
            addCriterion("FREPLY in", values, "freply");
            return (Criteria) this;
        }

        public Criteria andFreplyNotIn(List<Byte> values) {
            addCriterion("FREPLY not in", values, "freply");
            return (Criteria) this;
        }

        public Criteria andFreplyBetween(Byte value1, Byte value2) {
            addCriterion("FREPLY between", value1, value2, "freply");
            return (Criteria) this;
        }

        public Criteria andFreplyNotBetween(Byte value1, Byte value2) {
            addCriterion("FREPLY not between", value1, value2, "freply");
            return (Criteria) this;
        }

        public Criteria andFutypeIsNull() {
            addCriterion("FUTYPE is null");
            return (Criteria) this;
        }

        public Criteria andFutypeIsNotNull() {
            addCriterion("FUTYPE is not null");
            return (Criteria) this;
        }

        public Criteria andFutypeEqualTo(Short value) {
            addCriterion("FUTYPE =", value, "futype");
            return (Criteria) this;
        }

        public Criteria andFutypeNotEqualTo(Short value) {
            addCriterion("FUTYPE <>", value, "futype");
            return (Criteria) this;
        }

        public Criteria andFutypeGreaterThan(Short value) {
            addCriterion("FUTYPE >", value, "futype");
            return (Criteria) this;
        }

        public Criteria andFutypeGreaterThanOrEqualTo(Short value) {
            addCriterion("FUTYPE >=", value, "futype");
            return (Criteria) this;
        }

        public Criteria andFutypeLessThan(Short value) {
            addCriterion("FUTYPE <", value, "futype");
            return (Criteria) this;
        }

        public Criteria andFutypeLessThanOrEqualTo(Short value) {
            addCriterion("FUTYPE <=", value, "futype");
            return (Criteria) this;
        }

        public Criteria andFutypeIn(List<Short> values) {
            addCriterion("FUTYPE in", values, "futype");
            return (Criteria) this;
        }

        public Criteria andFutypeNotIn(List<Short> values) {
            addCriterion("FUTYPE not in", values, "futype");
            return (Criteria) this;
        }

        public Criteria andFutypeBetween(Short value1, Short value2) {
            addCriterion("FUTYPE between", value1, value2, "futype");
            return (Criteria) this;
        }

        public Criteria andFutypeNotBetween(Short value1, Short value2) {
            addCriterion("FUTYPE not between", value1, value2, "futype");
            return (Criteria) this;
        }

        public Criteria andFduidIsNull() {
            addCriterion("FDUID is null");
            return (Criteria) this;
        }

        public Criteria andFduidIsNotNull() {
            addCriterion("FDUID is not null");
            return (Criteria) this;
        }

        public Criteria andFduidEqualTo(Integer value) {
            addCriterion("FDUID =", value, "fduid");
            return (Criteria) this;
        }

        public Criteria andFduidNotEqualTo(Integer value) {
            addCriterion("FDUID <>", value, "fduid");
            return (Criteria) this;
        }

        public Criteria andFduidGreaterThan(Integer value) {
            addCriterion("FDUID >", value, "fduid");
            return (Criteria) this;
        }

        public Criteria andFduidGreaterThanOrEqualTo(Integer value) {
            addCriterion("FDUID >=", value, "fduid");
            return (Criteria) this;
        }

        public Criteria andFduidLessThan(Integer value) {
            addCriterion("FDUID <", value, "fduid");
            return (Criteria) this;
        }

        public Criteria andFduidLessThanOrEqualTo(Integer value) {
            addCriterion("FDUID <=", value, "fduid");
            return (Criteria) this;
        }

        public Criteria andFduidIn(List<Integer> values) {
            addCriterion("FDUID in", values, "fduid");
            return (Criteria) this;
        }

        public Criteria andFduidNotIn(List<Integer> values) {
            addCriterion("FDUID not in", values, "fduid");
            return (Criteria) this;
        }

        public Criteria andFduidBetween(Integer value1, Integer value2) {
            addCriterion("FDUID between", value1, value2, "fduid");
            return (Criteria) this;
        }

        public Criteria andFduidNotBetween(Integer value1, Integer value2) {
            addCriterion("FDUID not between", value1, value2, "fduid");
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