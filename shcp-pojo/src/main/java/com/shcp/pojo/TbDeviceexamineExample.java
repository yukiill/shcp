package com.shcp.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TbDeviceexamineExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TbDeviceexamineExample() {
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

        public Criteria andDsexidIsNull() {
            addCriterion("DSEXID is null");
            return (Criteria) this;
        }

        public Criteria andDsexidIsNotNull() {
            addCriterion("DSEXID is not null");
            return (Criteria) this;
        }

        public Criteria andDsexidEqualTo(Long value) {
            addCriterion("DSEXID =", value, "dsexid");
            return (Criteria) this;
        }

        public Criteria andDsexidNotEqualTo(Long value) {
            addCriterion("DSEXID <>", value, "dsexid");
            return (Criteria) this;
        }

        public Criteria andDsexidGreaterThan(Long value) {
            addCriterion("DSEXID >", value, "dsexid");
            return (Criteria) this;
        }

        public Criteria andDsexidGreaterThanOrEqualTo(Long value) {
            addCriterion("DSEXID >=", value, "dsexid");
            return (Criteria) this;
        }

        public Criteria andDsexidLessThan(Long value) {
            addCriterion("DSEXID <", value, "dsexid");
            return (Criteria) this;
        }

        public Criteria andDsexidLessThanOrEqualTo(Long value) {
            addCriterion("DSEXID <=", value, "dsexid");
            return (Criteria) this;
        }

        public Criteria andDsexidIn(List<Long> values) {
            addCriterion("DSEXID in", values, "dsexid");
            return (Criteria) this;
        }

        public Criteria andDsexidNotIn(List<Long> values) {
            addCriterion("DSEXID not in", values, "dsexid");
            return (Criteria) this;
        }

        public Criteria andDsexidBetween(Long value1, Long value2) {
            addCriterion("DSEXID between", value1, value2, "dsexid");
            return (Criteria) this;
        }

        public Criteria andDsexidNotBetween(Long value1, Long value2) {
            addCriterion("DSEXID not between", value1, value2, "dsexid");
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

        public Criteria andDsexname1IsNull() {
            addCriterion("DSEXNAME1 is null");
            return (Criteria) this;
        }

        public Criteria andDsexname1IsNotNull() {
            addCriterion("DSEXNAME1 is not null");
            return (Criteria) this;
        }

        public Criteria andDsexname1EqualTo(String value) {
            addCriterion("DSEXNAME1 =", value, "dsexname1");
            return (Criteria) this;
        }

        public Criteria andDsexname1NotEqualTo(String value) {
            addCriterion("DSEXNAME1 <>", value, "dsexname1");
            return (Criteria) this;
        }

        public Criteria andDsexname1GreaterThan(String value) {
            addCriterion("DSEXNAME1 >", value, "dsexname1");
            return (Criteria) this;
        }

        public Criteria andDsexname1GreaterThanOrEqualTo(String value) {
            addCriterion("DSEXNAME1 >=", value, "dsexname1");
            return (Criteria) this;
        }

        public Criteria andDsexname1LessThan(String value) {
            addCriterion("DSEXNAME1 <", value, "dsexname1");
            return (Criteria) this;
        }

        public Criteria andDsexname1LessThanOrEqualTo(String value) {
            addCriterion("DSEXNAME1 <=", value, "dsexname1");
            return (Criteria) this;
        }

        public Criteria andDsexname1Like(String value) {
            addCriterion("DSEXNAME1 like", value, "dsexname1");
            return (Criteria) this;
        }

        public Criteria andDsexname1NotLike(String value) {
            addCriterion("DSEXNAME1 not like", value, "dsexname1");
            return (Criteria) this;
        }

        public Criteria andDsexname1In(List<String> values) {
            addCriterion("DSEXNAME1 in", values, "dsexname1");
            return (Criteria) this;
        }

        public Criteria andDsexname1NotIn(List<String> values) {
            addCriterion("DSEXNAME1 not in", values, "dsexname1");
            return (Criteria) this;
        }

        public Criteria andDsexname1Between(String value1, String value2) {
            addCriterion("DSEXNAME1 between", value1, value2, "dsexname1");
            return (Criteria) this;
        }

        public Criteria andDsexname1NotBetween(String value1, String value2) {
            addCriterion("DSEXNAME1 not between", value1, value2, "dsexname1");
            return (Criteria) this;
        }

        public Criteria andDsexdatetimeIsNull() {
            addCriterion("DSEXDATETIME is null");
            return (Criteria) this;
        }

        public Criteria andDsexdatetimeIsNotNull() {
            addCriterion("DSEXDATETIME is not null");
            return (Criteria) this;
        }

        public Criteria andDsexdatetimeEqualTo(Date value) {
            addCriterion("DSEXDATETIME =", value, "dsexdatetime");
            return (Criteria) this;
        }

        public Criteria andDsexdatetimeNotEqualTo(Date value) {
            addCriterion("DSEXDATETIME <>", value, "dsexdatetime");
            return (Criteria) this;
        }

        public Criteria andDsexdatetimeGreaterThan(Date value) {
            addCriterion("DSEXDATETIME >", value, "dsexdatetime");
            return (Criteria) this;
        }

        public Criteria andDsexdatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("DSEXDATETIME >=", value, "dsexdatetime");
            return (Criteria) this;
        }

        public Criteria andDsexdatetimeLessThan(Date value) {
            addCriterion("DSEXDATETIME <", value, "dsexdatetime");
            return (Criteria) this;
        }

        public Criteria andDsexdatetimeLessThanOrEqualTo(Date value) {
            addCriterion("DSEXDATETIME <=", value, "dsexdatetime");
            return (Criteria) this;
        }

        public Criteria andDsexdatetimeIn(List<Date> values) {
            addCriterion("DSEXDATETIME in", values, "dsexdatetime");
            return (Criteria) this;
        }

        public Criteria andDsexdatetimeNotIn(List<Date> values) {
            addCriterion("DSEXDATETIME not in", values, "dsexdatetime");
            return (Criteria) this;
        }

        public Criteria andDsexdatetimeBetween(Date value1, Date value2) {
            addCriterion("DSEXDATETIME between", value1, value2, "dsexdatetime");
            return (Criteria) this;
        }

        public Criteria andDsexdatetimeNotBetween(Date value1, Date value2) {
            addCriterion("DSEXDATETIME not between", value1, value2, "dsexdatetime");
            return (Criteria) this;
        }

        public Criteria andDsexstatusIsNull() {
            addCriterion("DSEXSTATUS is null");
            return (Criteria) this;
        }

        public Criteria andDsexstatusIsNotNull() {
            addCriterion("DSEXSTATUS is not null");
            return (Criteria) this;
        }

        public Criteria andDsexstatusEqualTo(Boolean value) {
            addCriterion("DSEXSTATUS =", value, "dsexstatus");
            return (Criteria) this;
        }

        public Criteria andDsexstatusNotEqualTo(Boolean value) {
            addCriterion("DSEXSTATUS <>", value, "dsexstatus");
            return (Criteria) this;
        }

        public Criteria andDsexstatusGreaterThan(Boolean value) {
            addCriterion("DSEXSTATUS >", value, "dsexstatus");
            return (Criteria) this;
        }

        public Criteria andDsexstatusGreaterThanOrEqualTo(Boolean value) {
            addCriterion("DSEXSTATUS >=", value, "dsexstatus");
            return (Criteria) this;
        }

        public Criteria andDsexstatusLessThan(Boolean value) {
            addCriterion("DSEXSTATUS <", value, "dsexstatus");
            return (Criteria) this;
        }

        public Criteria andDsexstatusLessThanOrEqualTo(Boolean value) {
            addCriterion("DSEXSTATUS <=", value, "dsexstatus");
            return (Criteria) this;
        }

        public Criteria andDsexstatusIn(List<Boolean> values) {
            addCriterion("DSEXSTATUS in", values, "dsexstatus");
            return (Criteria) this;
        }

        public Criteria andDsexstatusNotIn(List<Boolean> values) {
            addCriterion("DSEXSTATUS not in", values, "dsexstatus");
            return (Criteria) this;
        }

        public Criteria andDsexstatusBetween(Boolean value1, Boolean value2) {
            addCriterion("DSEXSTATUS between", value1, value2, "dsexstatus");
            return (Criteria) this;
        }

        public Criteria andDsexstatusNotBetween(Boolean value1, Boolean value2) {
            addCriterion("DSEXSTATUS not between", value1, value2, "dsexstatus");
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