package com.shcp.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TbReplyExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TbReplyExample() {
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

        public Criteria andRidIsNull() {
            addCriterion("RID is null");
            return (Criteria) this;
        }

        public Criteria andRidIsNotNull() {
            addCriterion("RID is not null");
            return (Criteria) this;
        }

        public Criteria andRidEqualTo(Long value) {
            addCriterion("RID =", value, "rid");
            return (Criteria) this;
        }

        public Criteria andRidNotEqualTo(Long value) {
            addCriterion("RID <>", value, "rid");
            return (Criteria) this;
        }

        public Criteria andRidGreaterThan(Long value) {
            addCriterion("RID >", value, "rid");
            return (Criteria) this;
        }

        public Criteria andRidGreaterThanOrEqualTo(Long value) {
            addCriterion("RID >=", value, "rid");
            return (Criteria) this;
        }

        public Criteria andRidLessThan(Long value) {
            addCriterion("RID <", value, "rid");
            return (Criteria) this;
        }

        public Criteria andRidLessThanOrEqualTo(Long value) {
            addCriterion("RID <=", value, "rid");
            return (Criteria) this;
        }

        public Criteria andRidIn(List<Long> values) {
            addCriterion("RID in", values, "rid");
            return (Criteria) this;
        }

        public Criteria andRidNotIn(List<Long> values) {
            addCriterion("RID not in", values, "rid");
            return (Criteria) this;
        }

        public Criteria andRidBetween(Long value1, Long value2) {
            addCriterion("RID between", value1, value2, "rid");
            return (Criteria) this;
        }

        public Criteria andRidNotBetween(Long value1, Long value2) {
            addCriterion("RID not between", value1, value2, "rid");
            return (Criteria) this;
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

        public Criteria andRdatetimeIsNull() {
            addCriterion("RDATETIME is null");
            return (Criteria) this;
        }

        public Criteria andRdatetimeIsNotNull() {
            addCriterion("RDATETIME is not null");
            return (Criteria) this;
        }

        public Criteria andRdatetimeEqualTo(Date value) {
            addCriterion("RDATETIME =", value, "rdatetime");
            return (Criteria) this;
        }

        public Criteria andRdatetimeNotEqualTo(Date value) {
            addCriterion("RDATETIME <>", value, "rdatetime");
            return (Criteria) this;
        }

        public Criteria andRdatetimeGreaterThan(Date value) {
            addCriterion("RDATETIME >", value, "rdatetime");
            return (Criteria) this;
        }

        public Criteria andRdatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("RDATETIME >=", value, "rdatetime");
            return (Criteria) this;
        }

        public Criteria andRdatetimeLessThan(Date value) {
            addCriterion("RDATETIME <", value, "rdatetime");
            return (Criteria) this;
        }

        public Criteria andRdatetimeLessThanOrEqualTo(Date value) {
            addCriterion("RDATETIME <=", value, "rdatetime");
            return (Criteria) this;
        }

        public Criteria andRdatetimeIn(List<Date> values) {
            addCriterion("RDATETIME in", values, "rdatetime");
            return (Criteria) this;
        }

        public Criteria andRdatetimeNotIn(List<Date> values) {
            addCriterion("RDATETIME not in", values, "rdatetime");
            return (Criteria) this;
        }

        public Criteria andRdatetimeBetween(Date value1, Date value2) {
            addCriterion("RDATETIME between", value1, value2, "rdatetime");
            return (Criteria) this;
        }

        public Criteria andRdatetimeNotBetween(Date value1, Date value2) {
            addCriterion("RDATETIME not between", value1, value2, "rdatetime");
            return (Criteria) this;
        }

        public Criteria andRridIsNull() {
            addCriterion("RRID is null");
            return (Criteria) this;
        }

        public Criteria andRridIsNotNull() {
            addCriterion("RRID is not null");
            return (Criteria) this;
        }

        public Criteria andRridEqualTo(Long value) {
            addCriterion("RRID =", value, "rrid");
            return (Criteria) this;
        }

        public Criteria andRridNotEqualTo(Long value) {
            addCriterion("RRID <>", value, "rrid");
            return (Criteria) this;
        }

        public Criteria andRridGreaterThan(Long value) {
            addCriterion("RRID >", value, "rrid");
            return (Criteria) this;
        }

        public Criteria andRridGreaterThanOrEqualTo(Long value) {
            addCriterion("RRID >=", value, "rrid");
            return (Criteria) this;
        }

        public Criteria andRridLessThan(Long value) {
            addCriterion("RRID <", value, "rrid");
            return (Criteria) this;
        }

        public Criteria andRridLessThanOrEqualTo(Long value) {
            addCriterion("RRID <=", value, "rrid");
            return (Criteria) this;
        }

        public Criteria andRridIn(List<Long> values) {
            addCriterion("RRID in", values, "rrid");
            return (Criteria) this;
        }

        public Criteria andRridNotIn(List<Long> values) {
            addCriterion("RRID not in", values, "rrid");
            return (Criteria) this;
        }

        public Criteria andRridBetween(Long value1, Long value2) {
            addCriterion("RRID between", value1, value2, "rrid");
            return (Criteria) this;
        }

        public Criteria andRridNotBetween(Long value1, Long value2) {
            addCriterion("RRID not between", value1, value2, "rrid");
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