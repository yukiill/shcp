package com.shcp.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TbDeviceExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TbDeviceExample() {
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

        public Criteria andDstidIsNull() {
            addCriterion("DSTID is null");
            return (Criteria) this;
        }

        public Criteria andDstidIsNotNull() {
            addCriterion("DSTID is not null");
            return (Criteria) this;
        }

        public Criteria andDstidEqualTo(Long value) {
            addCriterion("DSTID =", value, "dstid");
            return (Criteria) this;
        }

        public Criteria andDstidNotEqualTo(Long value) {
            addCriterion("DSTID <>", value, "dstid");
            return (Criteria) this;
        }

        public Criteria andDstidGreaterThan(Long value) {
            addCriterion("DSTID >", value, "dstid");
            return (Criteria) this;
        }

        public Criteria andDstidGreaterThanOrEqualTo(Long value) {
            addCriterion("DSTID >=", value, "dstid");
            return (Criteria) this;
        }

        public Criteria andDstidLessThan(Long value) {
            addCriterion("DSTID <", value, "dstid");
            return (Criteria) this;
        }

        public Criteria andDstidLessThanOrEqualTo(Long value) {
            addCriterion("DSTID <=", value, "dstid");
            return (Criteria) this;
        }

        public Criteria andDstidIn(List<Long> values) {
            addCriterion("DSTID in", values, "dstid");
            return (Criteria) this;
        }

        public Criteria andDstidNotIn(List<Long> values) {
            addCriterion("DSTID not in", values, "dstid");
            return (Criteria) this;
        }

        public Criteria andDstidBetween(Long value1, Long value2) {
            addCriterion("DSTID between", value1, value2, "dstid");
            return (Criteria) this;
        }

        public Criteria andDstidNotBetween(Long value1, Long value2) {
            addCriterion("DSTID not between", value1, value2, "dstid");
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

        public Criteria andTidIsNull() {
            addCriterion("TID is null");
            return (Criteria) this;
        }

        public Criteria andTidIsNotNull() {
            addCriterion("TID is not null");
            return (Criteria) this;
        }

        public Criteria andTidEqualTo(Long value) {
            addCriterion("TID =", value, "tid");
            return (Criteria) this;
        }

        public Criteria andTidNotEqualTo(Long value) {
            addCriterion("TID <>", value, "tid");
            return (Criteria) this;
        }

        public Criteria andTidGreaterThan(Long value) {
            addCriterion("TID >", value, "tid");
            return (Criteria) this;
        }

        public Criteria andTidGreaterThanOrEqualTo(Long value) {
            addCriterion("TID >=", value, "tid");
            return (Criteria) this;
        }

        public Criteria andTidLessThan(Long value) {
            addCriterion("TID <", value, "tid");
            return (Criteria) this;
        }

        public Criteria andTidLessThanOrEqualTo(Long value) {
            addCriterion("TID <=", value, "tid");
            return (Criteria) this;
        }

        public Criteria andTidIn(List<Long> values) {
            addCriterion("TID in", values, "tid");
            return (Criteria) this;
        }

        public Criteria andTidNotIn(List<Long> values) {
            addCriterion("TID not in", values, "tid");
            return (Criteria) this;
        }

        public Criteria andTidBetween(Long value1, Long value2) {
            addCriterion("TID between", value1, value2, "tid");
            return (Criteria) this;
        }

        public Criteria andTidNotBetween(Long value1, Long value2) {
            addCriterion("TID not between", value1, value2, "tid");
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

        public Criteria andDstnameIsNull() {
            addCriterion("DSTNAME is null");
            return (Criteria) this;
        }

        public Criteria andDstnameIsNotNull() {
            addCriterion("DSTNAME is not null");
            return (Criteria) this;
        }

        public Criteria andDstnameEqualTo(String value) {
            addCriterion("DSTNAME =", value, "dstname");
            return (Criteria) this;
        }

        public Criteria andDstnameNotEqualTo(String value) {
            addCriterion("DSTNAME <>", value, "dstname");
            return (Criteria) this;
        }

        public Criteria andDstnameGreaterThan(String value) {
            addCriterion("DSTNAME >", value, "dstname");
            return (Criteria) this;
        }

        public Criteria andDstnameGreaterThanOrEqualTo(String value) {
            addCriterion("DSTNAME >=", value, "dstname");
            return (Criteria) this;
        }

        public Criteria andDstnameLessThan(String value) {
            addCriterion("DSTNAME <", value, "dstname");
            return (Criteria) this;
        }

        public Criteria andDstnameLessThanOrEqualTo(String value) {
            addCriterion("DSTNAME <=", value, "dstname");
            return (Criteria) this;
        }

        public Criteria andDstnameLike(String value) {
            addCriterion("DSTNAME like", value, "dstname");
            return (Criteria) this;
        }

        public Criteria andDstnameNotLike(String value) {
            addCriterion("DSTNAME not like", value, "dstname");
            return (Criteria) this;
        }

        public Criteria andDstnameIn(List<String> values) {
            addCriterion("DSTNAME in", values, "dstname");
            return (Criteria) this;
        }

        public Criteria andDstnameNotIn(List<String> values) {
            addCriterion("DSTNAME not in", values, "dstname");
            return (Criteria) this;
        }

        public Criteria andDstnameBetween(String value1, String value2) {
            addCriterion("DSTNAME between", value1, value2, "dstname");
            return (Criteria) this;
        }

        public Criteria andDstnameNotBetween(String value1, String value2) {
            addCriterion("DSTNAME not between", value1, value2, "dstname");
            return (Criteria) this;
        }

        public Criteria andDsdatetimeIsNull() {
            addCriterion("DSDATETIME is null");
            return (Criteria) this;
        }

        public Criteria andDsdatetimeIsNotNull() {
            addCriterion("DSDATETIME is not null");
            return (Criteria) this;
        }

        public Criteria andDsdatetimeEqualTo(Date value) {
            addCriterion("DSDATETIME =", value, "dsdatetime");
            return (Criteria) this;
        }

        public Criteria andDsdatetimeNotEqualTo(Date value) {
            addCriterion("DSDATETIME <>", value, "dsdatetime");
            return (Criteria) this;
        }

        public Criteria andDsdatetimeGreaterThan(Date value) {
            addCriterion("DSDATETIME >", value, "dsdatetime");
            return (Criteria) this;
        }

        public Criteria andDsdatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("DSDATETIME >=", value, "dsdatetime");
            return (Criteria) this;
        }

        public Criteria andDsdatetimeLessThan(Date value) {
            addCriterion("DSDATETIME <", value, "dsdatetime");
            return (Criteria) this;
        }

        public Criteria andDsdatetimeLessThanOrEqualTo(Date value) {
            addCriterion("DSDATETIME <=", value, "dsdatetime");
            return (Criteria) this;
        }

        public Criteria andDsdatetimeIn(List<Date> values) {
            addCriterion("DSDATETIME in", values, "dsdatetime");
            return (Criteria) this;
        }

        public Criteria andDsdatetimeNotIn(List<Date> values) {
            addCriterion("DSDATETIME not in", values, "dsdatetime");
            return (Criteria) this;
        }

        public Criteria andDsdatetimeBetween(Date value1, Date value2) {
            addCriterion("DSDATETIME between", value1, value2, "dsdatetime");
            return (Criteria) this;
        }

        public Criteria andDsdatetimeNotBetween(Date value1, Date value2) {
            addCriterion("DSDATETIME not between", value1, value2, "dsdatetime");
            return (Criteria) this;
        }

        public Criteria andDsipaddrIsNull() {
            addCriterion("DSIPADDR is null");
            return (Criteria) this;
        }

        public Criteria andDsipaddrIsNotNull() {
            addCriterion("DSIPADDR is not null");
            return (Criteria) this;
        }

        public Criteria andDsipaddrEqualTo(String value) {
            addCriterion("DSIPADDR =", value, "dsipaddr");
            return (Criteria) this;
        }

        public Criteria andDsipaddrNotEqualTo(String value) {
            addCriterion("DSIPADDR <>", value, "dsipaddr");
            return (Criteria) this;
        }

        public Criteria andDsipaddrGreaterThan(String value) {
            addCriterion("DSIPADDR >", value, "dsipaddr");
            return (Criteria) this;
        }

        public Criteria andDsipaddrGreaterThanOrEqualTo(String value) {
            addCriterion("DSIPADDR >=", value, "dsipaddr");
            return (Criteria) this;
        }

        public Criteria andDsipaddrLessThan(String value) {
            addCriterion("DSIPADDR <", value, "dsipaddr");
            return (Criteria) this;
        }

        public Criteria andDsipaddrLessThanOrEqualTo(String value) {
            addCriterion("DSIPADDR <=", value, "dsipaddr");
            return (Criteria) this;
        }

        public Criteria andDsipaddrLike(String value) {
            addCriterion("DSIPADDR like", value, "dsipaddr");
            return (Criteria) this;
        }

        public Criteria andDsipaddrNotLike(String value) {
            addCriterion("DSIPADDR not like", value, "dsipaddr");
            return (Criteria) this;
        }

        public Criteria andDsipaddrIn(List<String> values) {
            addCriterion("DSIPADDR in", values, "dsipaddr");
            return (Criteria) this;
        }

        public Criteria andDsipaddrNotIn(List<String> values) {
            addCriterion("DSIPADDR not in", values, "dsipaddr");
            return (Criteria) this;
        }

        public Criteria andDsipaddrBetween(String value1, String value2) {
            addCriterion("DSIPADDR between", value1, value2, "dsipaddr");
            return (Criteria) this;
        }

        public Criteria andDsipaddrNotBetween(String value1, String value2) {
            addCriterion("DSIPADDR not between", value1, value2, "dsipaddr");
            return (Criteria) this;
        }

        public Criteria andDsportIsNull() {
            addCriterion("DSPORT is null");
            return (Criteria) this;
        }

        public Criteria andDsportIsNotNull() {
            addCriterion("DSPORT is not null");
            return (Criteria) this;
        }

        public Criteria andDsportEqualTo(Integer value) {
            addCriterion("DSPORT =", value, "dsport");
            return (Criteria) this;
        }

        public Criteria andDsportNotEqualTo(Integer value) {
            addCriterion("DSPORT <>", value, "dsport");
            return (Criteria) this;
        }

        public Criteria andDsportGreaterThan(Integer value) {
            addCriterion("DSPORT >", value, "dsport");
            return (Criteria) this;
        }

        public Criteria andDsportGreaterThanOrEqualTo(Integer value) {
            addCriterion("DSPORT >=", value, "dsport");
            return (Criteria) this;
        }

        public Criteria andDsportLessThan(Integer value) {
            addCriterion("DSPORT <", value, "dsport");
            return (Criteria) this;
        }

        public Criteria andDsportLessThanOrEqualTo(Integer value) {
            addCriterion("DSPORT <=", value, "dsport");
            return (Criteria) this;
        }

        public Criteria andDsportIn(List<Integer> values) {
            addCriterion("DSPORT in", values, "dsport");
            return (Criteria) this;
        }

        public Criteria andDsportNotIn(List<Integer> values) {
            addCriterion("DSPORT not in", values, "dsport");
            return (Criteria) this;
        }

        public Criteria andDsportBetween(Integer value1, Integer value2) {
            addCriterion("DSPORT between", value1, value2, "dsport");
            return (Criteria) this;
        }

        public Criteria andDsportNotBetween(Integer value1, Integer value2) {
            addCriterion("DSPORT not between", value1, value2, "dsport");
            return (Criteria) this;
        }

        public Criteria andDsmacIsNull() {
            addCriterion("DSMAC is null");
            return (Criteria) this;
        }

        public Criteria andDsmacIsNotNull() {
            addCriterion("DSMAC is not null");
            return (Criteria) this;
        }

        public Criteria andDsmacEqualTo(String value) {
            addCriterion("DSMAC =", value, "dsmac");
            return (Criteria) this;
        }

        public Criteria andDsmacNotEqualTo(String value) {
            addCriterion("DSMAC <>", value, "dsmac");
            return (Criteria) this;
        }

        public Criteria andDsmacGreaterThan(String value) {
            addCriterion("DSMAC >", value, "dsmac");
            return (Criteria) this;
        }

        public Criteria andDsmacGreaterThanOrEqualTo(String value) {
            addCriterion("DSMAC >=", value, "dsmac");
            return (Criteria) this;
        }

        public Criteria andDsmacLessThan(String value) {
            addCriterion("DSMAC <", value, "dsmac");
            return (Criteria) this;
        }

        public Criteria andDsmacLessThanOrEqualTo(String value) {
            addCriterion("DSMAC <=", value, "dsmac");
            return (Criteria) this;
        }

        public Criteria andDsmacLike(String value) {
            addCriterion("DSMAC like", value, "dsmac");
            return (Criteria) this;
        }

        public Criteria andDsmacNotLike(String value) {
            addCriterion("DSMAC not like", value, "dsmac");
            return (Criteria) this;
        }

        public Criteria andDsmacIn(List<String> values) {
            addCriterion("DSMAC in", values, "dsmac");
            return (Criteria) this;
        }

        public Criteria andDsmacNotIn(List<String> values) {
            addCriterion("DSMAC not in", values, "dsmac");
            return (Criteria) this;
        }

        public Criteria andDsmacBetween(String value1, String value2) {
            addCriterion("DSMAC between", value1, value2, "dsmac");
            return (Criteria) this;
        }

        public Criteria andDsmacNotBetween(String value1, String value2) {
            addCriterion("DSMAC not between", value1, value2, "dsmac");
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