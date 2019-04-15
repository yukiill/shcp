package com.shcp.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class DeveloperinfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DeveloperinfoExample() {
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

        public Criteria andDcidIsNull() {
            addCriterion("DCID is null");
            return (Criteria) this;
        }

        public Criteria andDcidIsNotNull() {
            addCriterion("DCID is not null");
            return (Criteria) this;
        }

        public Criteria andDcidEqualTo(Long value) {
            addCriterion("DCID =", value, "dcid");
            return (Criteria) this;
        }

        public Criteria andDcidNotEqualTo(Long value) {
            addCriterion("DCID <>", value, "dcid");
            return (Criteria) this;
        }

        public Criteria andDcidGreaterThan(Long value) {
            addCriterion("DCID >", value, "dcid");
            return (Criteria) this;
        }

        public Criteria andDcidGreaterThanOrEqualTo(Long value) {
            addCriterion("DCID >=", value, "dcid");
            return (Criteria) this;
        }

        public Criteria andDcidLessThan(Long value) {
            addCriterion("DCID <", value, "dcid");
            return (Criteria) this;
        }

        public Criteria andDcidLessThanOrEqualTo(Long value) {
            addCriterion("DCID <=", value, "dcid");
            return (Criteria) this;
        }

        public Criteria andDcidIn(List<Long> values) {
            addCriterion("DCID in", values, "dcid");
            return (Criteria) this;
        }

        public Criteria andDcidNotIn(List<Long> values) {
            addCriterion("DCID not in", values, "dcid");
            return (Criteria) this;
        }

        public Criteria andDcidBetween(Long value1, Long value2) {
            addCriterion("DCID between", value1, value2, "dcid");
            return (Criteria) this;
        }

        public Criteria andDcidNotBetween(Long value1, Long value2) {
            addCriterion("DCID not between", value1, value2, "dcid");
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

        public Criteria andDcnameIsNull() {
            addCriterion("DCNAME is null");
            return (Criteria) this;
        }

        public Criteria andDcnameIsNotNull() {
            addCriterion("DCNAME is not null");
            return (Criteria) this;
        }

        public Criteria andDcnameEqualTo(String value) {
            addCriterion("DCNAME =", value, "dcname");
            return (Criteria) this;
        }

        public Criteria andDcnameNotEqualTo(String value) {
            addCriterion("DCNAME <>", value, "dcname");
            return (Criteria) this;
        }

        public Criteria andDcnameGreaterThan(String value) {
            addCriterion("DCNAME >", value, "dcname");
            return (Criteria) this;
        }

        public Criteria andDcnameGreaterThanOrEqualTo(String value) {
            addCriterion("DCNAME >=", value, "dcname");
            return (Criteria) this;
        }

        public Criteria andDcnameLessThan(String value) {
            addCriterion("DCNAME <", value, "dcname");
            return (Criteria) this;
        }

        public Criteria andDcnameLessThanOrEqualTo(String value) {
            addCriterion("DCNAME <=", value, "dcname");
            return (Criteria) this;
        }

        public Criteria andDcnameLike(String value) {
            addCriterion("DCNAME like", value, "dcname");
            return (Criteria) this;
        }

        public Criteria andDcnameNotLike(String value) {
            addCriterion("DCNAME not like", value, "dcname");
            return (Criteria) this;
        }

        public Criteria andDcnameIn(List<String> values) {
            addCriterion("DCNAME in", values, "dcname");
            return (Criteria) this;
        }

        public Criteria andDcnameNotIn(List<String> values) {
            addCriterion("DCNAME not in", values, "dcname");
            return (Criteria) this;
        }

        public Criteria andDcnameBetween(String value1, String value2) {
            addCriterion("DCNAME between", value1, value2, "dcname");
            return (Criteria) this;
        }

        public Criteria andDcnameNotBetween(String value1, String value2) {
            addCriterion("DCNAME not between", value1, value2, "dcname");
            return (Criteria) this;
        }

        public Criteria andDcaddrIsNull() {
            addCriterion("DCADDR is null");
            return (Criteria) this;
        }

        public Criteria andDcaddrIsNotNull() {
            addCriterion("DCADDR is not null");
            return (Criteria) this;
        }

        public Criteria andDcaddrEqualTo(String value) {
            addCriterion("DCADDR =", value, "dcaddr");
            return (Criteria) this;
        }

        public Criteria andDcaddrNotEqualTo(String value) {
            addCriterion("DCADDR <>", value, "dcaddr");
            return (Criteria) this;
        }

        public Criteria andDcaddrGreaterThan(String value) {
            addCriterion("DCADDR >", value, "dcaddr");
            return (Criteria) this;
        }

        public Criteria andDcaddrGreaterThanOrEqualTo(String value) {
            addCriterion("DCADDR >=", value, "dcaddr");
            return (Criteria) this;
        }

        public Criteria andDcaddrLessThan(String value) {
            addCriterion("DCADDR <", value, "dcaddr");
            return (Criteria) this;
        }

        public Criteria andDcaddrLessThanOrEqualTo(String value) {
            addCriterion("DCADDR <=", value, "dcaddr");
            return (Criteria) this;
        }

        public Criteria andDcaddrLike(String value) {
            addCriterion("DCADDR like", value, "dcaddr");
            return (Criteria) this;
        }

        public Criteria andDcaddrNotLike(String value) {
            addCriterion("DCADDR not like", value, "dcaddr");
            return (Criteria) this;
        }

        public Criteria andDcaddrIn(List<String> values) {
            addCriterion("DCADDR in", values, "dcaddr");
            return (Criteria) this;
        }

        public Criteria andDcaddrNotIn(List<String> values) {
            addCriterion("DCADDR not in", values, "dcaddr");
            return (Criteria) this;
        }

        public Criteria andDcaddrBetween(String value1, String value2) {
            addCriterion("DCADDR between", value1, value2, "dcaddr");
            return (Criteria) this;
        }

        public Criteria andDcaddrNotBetween(String value1, String value2) {
            addCriterion("DCADDR not between", value1, value2, "dcaddr");
            return (Criteria) this;
        }

        public Criteria andDcnumberIsNull() {
            addCriterion("DCNUMBER is null");
            return (Criteria) this;
        }

        public Criteria andDcnumberIsNotNull() {
            addCriterion("DCNUMBER is not null");
            return (Criteria) this;
        }

        public Criteria andDcnumberEqualTo(String value) {
            addCriterion("DCNUMBER =", value, "dcnumber");
            return (Criteria) this;
        }

        public Criteria andDcnumberNotEqualTo(String value) {
            addCriterion("DCNUMBER <>", value, "dcnumber");
            return (Criteria) this;
        }

        public Criteria andDcnumberGreaterThan(String value) {
            addCriterion("DCNUMBER >", value, "dcnumber");
            return (Criteria) this;
        }

        public Criteria andDcnumberGreaterThanOrEqualTo(String value) {
            addCriterion("DCNUMBER >=", value, "dcnumber");
            return (Criteria) this;
        }

        public Criteria andDcnumberLessThan(String value) {
            addCriterion("DCNUMBER <", value, "dcnumber");
            return (Criteria) this;
        }

        public Criteria andDcnumberLessThanOrEqualTo(String value) {
            addCriterion("DCNUMBER <=", value, "dcnumber");
            return (Criteria) this;
        }

        public Criteria andDcnumberLike(String value) {
            addCriterion("DCNUMBER like", value, "dcnumber");
            return (Criteria) this;
        }

        public Criteria andDcnumberNotLike(String value) {
            addCriterion("DCNUMBER not like", value, "dcnumber");
            return (Criteria) this;
        }

        public Criteria andDcnumberIn(List<String> values) {
            addCriterion("DCNUMBER in", values, "dcnumber");
            return (Criteria) this;
        }

        public Criteria andDcnumberNotIn(List<String> values) {
            addCriterion("DCNUMBER not in", values, "dcnumber");
            return (Criteria) this;
        }

        public Criteria andDcnumberBetween(String value1, String value2) {
            addCriterion("DCNUMBER between", value1, value2, "dcnumber");
            return (Criteria) this;
        }

        public Criteria andDcnumberNotBetween(String value1, String value2) {
            addCriterion("DCNUMBER not between", value1, value2, "dcnumber");
            return (Criteria) this;
        }

        public Criteria andDcdatetimeIsNull() {
            addCriterion("DCDATETIME is null");
            return (Criteria) this;
        }

        public Criteria andDcdatetimeIsNotNull() {
            addCriterion("DCDATETIME is not null");
            return (Criteria) this;
        }

        public Criteria andDcdatetimeEqualTo(Date value) {
            addCriterion("DCDATETIME =", value, "dcdatetime");
            return (Criteria) this;
        }

        public Criteria andDcdatetimeNotEqualTo(Date value) {
            addCriterion("DCDATETIME <>", value, "dcdatetime");
            return (Criteria) this;
        }

        public Criteria andDcdatetimeGreaterThan(Date value) {
            addCriterion("DCDATETIME >", value, "dcdatetime");
            return (Criteria) this;
        }

        public Criteria andDcdatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("DCDATETIME >=", value, "dcdatetime");
            return (Criteria) this;
        }

        public Criteria andDcdatetimeLessThan(Date value) {
            addCriterion("DCDATETIME <", value, "dcdatetime");
            return (Criteria) this;
        }

        public Criteria andDcdatetimeLessThanOrEqualTo(Date value) {
            addCriterion("DCDATETIME <=", value, "dcdatetime");
            return (Criteria) this;
        }

        public Criteria andDcdatetimeIn(List<Date> values) {
            addCriterion("DCDATETIME in", values, "dcdatetime");
            return (Criteria) this;
        }

        public Criteria andDcdatetimeNotIn(List<Date> values) {
            addCriterion("DCDATETIME not in", values, "dcdatetime");
            return (Criteria) this;
        }

        public Criteria andDcdatetimeBetween(Date value1, Date value2) {
            addCriterion("DCDATETIME between", value1, value2, "dcdatetime");
            return (Criteria) this;
        }

        public Criteria andDcdatetimeNotBetween(Date value1, Date value2) {
            addCriterion("DCDATETIME not between", value1, value2, "dcdatetime");
            return (Criteria) this;
        }

        public Criteria andDcstatusIsNull() {
            addCriterion("DCSTATUS is null");
            return (Criteria) this;
        }

        public Criteria andDcstatusIsNotNull() {
            addCriterion("DCSTATUS is not null");
            return (Criteria) this;
        }

        public Criteria andDcstatusEqualTo(Byte value) {
            addCriterion("DCSTATUS =", value, "dcstatus");
            return (Criteria) this;
        }

        public Criteria andDcstatusNotEqualTo(Byte value) {
            addCriterion("DCSTATUS <>", value, "dcstatus");
            return (Criteria) this;
        }

        public Criteria andDcstatusGreaterThan(Byte value) {
            addCriterion("DCSTATUS >", value, "dcstatus");
            return (Criteria) this;
        }

        public Criteria andDcstatusGreaterThanOrEqualTo(Byte value) {
            addCriterion("DCSTATUS >=", value, "dcstatus");
            return (Criteria) this;
        }

        public Criteria andDcstatusLessThan(Byte value) {
            addCriterion("DCSTATUS <", value, "dcstatus");
            return (Criteria) this;
        }

        public Criteria andDcstatusLessThanOrEqualTo(Byte value) {
            addCriterion("DCSTATUS <=", value, "dcstatus");
            return (Criteria) this;
        }

        public Criteria andDcstatusIn(List<Byte> values) {
            addCriterion("DCSTATUS in", values, "dcstatus");
            return (Criteria) this;
        }

        public Criteria andDcstatusNotIn(List<Byte> values) {
            addCriterion("DCSTATUS not in", values, "dcstatus");
            return (Criteria) this;
        }

        public Criteria andDcstatusBetween(Byte value1, Byte value2) {
            addCriterion("DCSTATUS between", value1, value2, "dcstatus");
            return (Criteria) this;
        }

        public Criteria andDcstatusNotBetween(Byte value1, Byte value2) {
            addCriterion("DCSTATUS not between", value1, value2, "dcstatus");
            return (Criteria) this;
        }

        public Criteria andDcaidIsNull() {
            addCriterion("DCAID is null");
            return (Criteria) this;
        }

        public Criteria andDcaidIsNotNull() {
            addCriterion("DCAID is not null");
            return (Criteria) this;
        }

        public Criteria andDcaidEqualTo(Long value) {
            addCriterion("DCAID =", value, "dcaid");
            return (Criteria) this;
        }

        public Criteria andDcaidNotEqualTo(Long value) {
            addCriterion("DCAID <>", value, "dcaid");
            return (Criteria) this;
        }

        public Criteria andDcaidGreaterThan(Long value) {
            addCriterion("DCAID >", value, "dcaid");
            return (Criteria) this;
        }

        public Criteria andDcaidGreaterThanOrEqualTo(Long value) {
            addCriterion("DCAID >=", value, "dcaid");
            return (Criteria) this;
        }

        public Criteria andDcaidLessThan(Long value) {
            addCriterion("DCAID <", value, "dcaid");
            return (Criteria) this;
        }

        public Criteria andDcaidLessThanOrEqualTo(Long value) {
            addCriterion("DCAID <=", value, "dcaid");
            return (Criteria) this;
        }

        public Criteria andDcaidIn(List<Long> values) {
            addCriterion("DCAID in", values, "dcaid");
            return (Criteria) this;
        }

        public Criteria andDcaidNotIn(List<Long> values) {
            addCriterion("DCAID not in", values, "dcaid");
            return (Criteria) this;
        }

        public Criteria andDcaidBetween(Long value1, Long value2) {
            addCriterion("DCAID between", value1, value2, "dcaid");
            return (Criteria) this;
        }

        public Criteria andDcaidNotBetween(Long value1, Long value2) {
            addCriterion("DCAID not between", value1, value2, "dcaid");
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