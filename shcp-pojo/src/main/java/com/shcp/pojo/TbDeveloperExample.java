package com.shcp.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TbDeveloperExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TbDeveloperExample() {
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

        public Criteria andDevnameIsNull() {
            addCriterion("DEVNAME is null");
            return (Criteria) this;
        }

        public Criteria andDevnameIsNotNull() {
            addCriterion("DEVNAME is not null");
            return (Criteria) this;
        }

        public Criteria andDevnameEqualTo(String value) {
            addCriterion("DEVNAME =", value, "devname");
            return (Criteria) this;
        }

        public Criteria andDevnameNotEqualTo(String value) {
            addCriterion("DEVNAME <>", value, "devname");
            return (Criteria) this;
        }

        public Criteria andDevnameGreaterThan(String value) {
            addCriterion("DEVNAME >", value, "devname");
            return (Criteria) this;
        }

        public Criteria andDevnameGreaterThanOrEqualTo(String value) {
            addCriterion("DEVNAME >=", value, "devname");
            return (Criteria) this;
        }

        public Criteria andDevnameLessThan(String value) {
            addCriterion("DEVNAME <", value, "devname");
            return (Criteria) this;
        }

        public Criteria andDevnameLessThanOrEqualTo(String value) {
            addCriterion("DEVNAME <=", value, "devname");
            return (Criteria) this;
        }

        public Criteria andDevnameLike(String value) {
            addCriterion("DEVNAME like", value, "devname");
            return (Criteria) this;
        }

        public Criteria andDevnameNotLike(String value) {
            addCriterion("DEVNAME not like", value, "devname");
            return (Criteria) this;
        }

        public Criteria andDevnameIn(List<String> values) {
            addCriterion("DEVNAME in", values, "devname");
            return (Criteria) this;
        }

        public Criteria andDevnameNotIn(List<String> values) {
            addCriterion("DEVNAME not in", values, "devname");
            return (Criteria) this;
        }

        public Criteria andDevnameBetween(String value1, String value2) {
            addCriterion("DEVNAME between", value1, value2, "devname");
            return (Criteria) this;
        }

        public Criteria andDevnameNotBetween(String value1, String value2) {
            addCriterion("DEVNAME not between", value1, value2, "devname");
            return (Criteria) this;
        }

        public Criteria andPasswordIsNull() {
            addCriterion("PASSWORD is null");
            return (Criteria) this;
        }

        public Criteria andPasswordIsNotNull() {
            addCriterion("PASSWORD is not null");
            return (Criteria) this;
        }

        public Criteria andPasswordEqualTo(String value) {
            addCriterion("PASSWORD =", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotEqualTo(String value) {
            addCriterion("PASSWORD <>", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordGreaterThan(String value) {
            addCriterion("PASSWORD >", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("PASSWORD >=", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLessThan(String value) {
            addCriterion("PASSWORD <", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLessThanOrEqualTo(String value) {
            addCriterion("PASSWORD <=", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLike(String value) {
            addCriterion("PASSWORD like", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotLike(String value) {
            addCriterion("PASSWORD not like", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordIn(List<String> values) {
            addCriterion("PASSWORD in", values, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotIn(List<String> values) {
            addCriterion("PASSWORD not in", values, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordBetween(String value1, String value2) {
            addCriterion("PASSWORD between", value1, value2, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotBetween(String value1, String value2) {
            addCriterion("PASSWORD not between", value1, value2, "password");
            return (Criteria) this;
        }

        public Criteria andDemailIsNull() {
            addCriterion("DEMAIL is null");
            return (Criteria) this;
        }

        public Criteria andDemailIsNotNull() {
            addCriterion("DEMAIL is not null");
            return (Criteria) this;
        }

        public Criteria andDemailEqualTo(String value) {
            addCriterion("DEMAIL =", value, "demail");
            return (Criteria) this;
        }

        public Criteria andDemailNotEqualTo(String value) {
            addCriterion("DEMAIL <>", value, "demail");
            return (Criteria) this;
        }

        public Criteria andDemailGreaterThan(String value) {
            addCriterion("DEMAIL >", value, "demail");
            return (Criteria) this;
        }

        public Criteria andDemailGreaterThanOrEqualTo(String value) {
            addCriterion("DEMAIL >=", value, "demail");
            return (Criteria) this;
        }

        public Criteria andDemailLessThan(String value) {
            addCriterion("DEMAIL <", value, "demail");
            return (Criteria) this;
        }

        public Criteria andDemailLessThanOrEqualTo(String value) {
            addCriterion("DEMAIL <=", value, "demail");
            return (Criteria) this;
        }

        public Criteria andDemailLike(String value) {
            addCriterion("DEMAIL like", value, "demail");
            return (Criteria) this;
        }

        public Criteria andDemailNotLike(String value) {
            addCriterion("DEMAIL not like", value, "demail");
            return (Criteria) this;
        }

        public Criteria andDemailIn(List<String> values) {
            addCriterion("DEMAIL in", values, "demail");
            return (Criteria) this;
        }

        public Criteria andDemailNotIn(List<String> values) {
            addCriterion("DEMAIL not in", values, "demail");
            return (Criteria) this;
        }

        public Criteria andDemailBetween(String value1, String value2) {
            addCriterion("DEMAIL between", value1, value2, "demail");
            return (Criteria) this;
        }

        public Criteria andDemailNotBetween(String value1, String value2) {
            addCriterion("DEMAIL not between", value1, value2, "demail");
            return (Criteria) this;
        }

        public Criteria andDsubIsNull() {
            addCriterion("DSUB is null");
            return (Criteria) this;
        }

        public Criteria andDsubIsNotNull() {
            addCriterion("DSUB is not null");
            return (Criteria) this;
        }

        public Criteria andDsubEqualTo(Integer value) {
            addCriterion("DSUB =", value, "dsub");
            return (Criteria) this;
        }

        public Criteria andDsubNotEqualTo(Integer value) {
            addCriterion("DSUB <>", value, "dsub");
            return (Criteria) this;
        }

        public Criteria andDsubGreaterThan(Integer value) {
            addCriterion("DSUB >", value, "dsub");
            return (Criteria) this;
        }

        public Criteria andDsubGreaterThanOrEqualTo(Integer value) {
            addCriterion("DSUB >=", value, "dsub");
            return (Criteria) this;
        }

        public Criteria andDsubLessThan(Integer value) {
            addCriterion("DSUB <", value, "dsub");
            return (Criteria) this;
        }

        public Criteria andDsubLessThanOrEqualTo(Integer value) {
            addCriterion("DSUB <=", value, "dsub");
            return (Criteria) this;
        }

        public Criteria andDsubIn(List<Integer> values) {
            addCriterion("DSUB in", values, "dsub");
            return (Criteria) this;
        }

        public Criteria andDsubNotIn(List<Integer> values) {
            addCriterion("DSUB not in", values, "dsub");
            return (Criteria) this;
        }

        public Criteria andDsubBetween(Integer value1, Integer value2) {
            addCriterion("DSUB between", value1, value2, "dsub");
            return (Criteria) this;
        }

        public Criteria andDsubNotBetween(Integer value1, Integer value2) {
            addCriterion("DSUB not between", value1, value2, "dsub");
            return (Criteria) this;
        }

        public Criteria andDstatusIsNull() {
            addCriterion("DSTATUS is null");
            return (Criteria) this;
        }

        public Criteria andDstatusIsNotNull() {
            addCriterion("DSTATUS is not null");
            return (Criteria) this;
        }

        public Criteria andDstatusEqualTo(Byte value) {
            addCriterion("DSTATUS =", value, "dstatus");
            return (Criteria) this;
        }

        public Criteria andDstatusNotEqualTo(Byte value) {
            addCriterion("DSTATUS <>", value, "dstatus");
            return (Criteria) this;
        }

        public Criteria andDstatusGreaterThan(Byte value) {
            addCriterion("DSTATUS >", value, "dstatus");
            return (Criteria) this;
        }

        public Criteria andDstatusGreaterThanOrEqualTo(Byte value) {
            addCriterion("DSTATUS >=", value, "dstatus");
            return (Criteria) this;
        }

        public Criteria andDstatusLessThan(Byte value) {
            addCriterion("DSTATUS <", value, "dstatus");
            return (Criteria) this;
        }

        public Criteria andDstatusLessThanOrEqualTo(Byte value) {
            addCriterion("DSTATUS <=", value, "dstatus");
            return (Criteria) this;
        }

        public Criteria andDstatusIn(List<Byte> values) {
            addCriterion("DSTATUS in", values, "dstatus");
            return (Criteria) this;
        }

        public Criteria andDstatusNotIn(List<Byte> values) {
            addCriterion("DSTATUS not in", values, "dstatus");
            return (Criteria) this;
        }

        public Criteria andDstatusBetween(Byte value1, Byte value2) {
            addCriterion("DSTATUS between", value1, value2, "dstatus");
            return (Criteria) this;
        }

        public Criteria andDstatusNotBetween(Byte value1, Byte value2) {
            addCriterion("DSTATUS not between", value1, value2, "dstatus");
            return (Criteria) this;
        }

        public Criteria andDhimgIsNull() {
            addCriterion("DHIMG is null");
            return (Criteria) this;
        }

        public Criteria andDhimgIsNotNull() {
            addCriterion("DHIMG is not null");
            return (Criteria) this;
        }

        public Criteria andDhimgEqualTo(String value) {
            addCriterion("DHIMG =", value, "dhimg");
            return (Criteria) this;
        }

        public Criteria andDhimgNotEqualTo(String value) {
            addCriterion("DHIMG <>", value, "dhimg");
            return (Criteria) this;
        }

        public Criteria andDhimgGreaterThan(String value) {
            addCriterion("DHIMG >", value, "dhimg");
            return (Criteria) this;
        }

        public Criteria andDhimgGreaterThanOrEqualTo(String value) {
            addCriterion("DHIMG >=", value, "dhimg");
            return (Criteria) this;
        }

        public Criteria andDhimgLessThan(String value) {
            addCriterion("DHIMG <", value, "dhimg");
            return (Criteria) this;
        }

        public Criteria andDhimgLessThanOrEqualTo(String value) {
            addCriterion("DHIMG <=", value, "dhimg");
            return (Criteria) this;
        }

        public Criteria andDhimgLike(String value) {
            addCriterion("DHIMG like", value, "dhimg");
            return (Criteria) this;
        }

        public Criteria andDhimgNotLike(String value) {
            addCriterion("DHIMG not like", value, "dhimg");
            return (Criteria) this;
        }

        public Criteria andDhimgIn(List<String> values) {
            addCriterion("DHIMG in", values, "dhimg");
            return (Criteria) this;
        }

        public Criteria andDhimgNotIn(List<String> values) {
            addCriterion("DHIMG not in", values, "dhimg");
            return (Criteria) this;
        }

        public Criteria andDhimgBetween(String value1, String value2) {
            addCriterion("DHIMG between", value1, value2, "dhimg");
            return (Criteria) this;
        }

        public Criteria andDhimgNotBetween(String value1, String value2) {
            addCriterion("DHIMG not between", value1, value2, "dhimg");
            return (Criteria) this;
        }

        public Criteria andDlimitIsNull() {
            addCriterion("DLIMIT is null");
            return (Criteria) this;
        }

        public Criteria andDlimitIsNotNull() {
            addCriterion("DLIMIT is not null");
            return (Criteria) this;
        }

        public Criteria andDlimitEqualTo(Integer value) {
            addCriterion("DLIMIT =", value, "dlimit");
            return (Criteria) this;
        }

        public Criteria andDlimitNotEqualTo(Integer value) {
            addCriterion("DLIMIT <>", value, "dlimit");
            return (Criteria) this;
        }

        public Criteria andDlimitGreaterThan(Integer value) {
            addCriterion("DLIMIT >", value, "dlimit");
            return (Criteria) this;
        }

        public Criteria andDlimitGreaterThanOrEqualTo(Integer value) {
            addCriterion("DLIMIT >=", value, "dlimit");
            return (Criteria) this;
        }

        public Criteria andDlimitLessThan(Integer value) {
            addCriterion("DLIMIT <", value, "dlimit");
            return (Criteria) this;
        }

        public Criteria andDlimitLessThanOrEqualTo(Integer value) {
            addCriterion("DLIMIT <=", value, "dlimit");
            return (Criteria) this;
        }

        public Criteria andDlimitIn(List<Integer> values) {
            addCriterion("DLIMIT in", values, "dlimit");
            return (Criteria) this;
        }

        public Criteria andDlimitNotIn(List<Integer> values) {
            addCriterion("DLIMIT not in", values, "dlimit");
            return (Criteria) this;
        }

        public Criteria andDlimitBetween(Integer value1, Integer value2) {
            addCriterion("DLIMIT between", value1, value2, "dlimit");
            return (Criteria) this;
        }

        public Criteria andDlimitNotBetween(Integer value1, Integer value2) {
            addCriterion("DLIMIT not between", value1, value2, "dlimit");
            return (Criteria) this;
        }

        public Criteria andSubmitdatetimeIsNull() {
            addCriterion("SUBMITDATETIME is null");
            return (Criteria) this;
        }

        public Criteria andSubmitdatetimeIsNotNull() {
            addCriterion("SUBMITDATETIME is not null");
            return (Criteria) this;
        }

        public Criteria andSubmitdatetimeEqualTo(Date value) {
            addCriterion("SUBMITDATETIME =", value, "submitdatetime");
            return (Criteria) this;
        }

        public Criteria andSubmitdatetimeNotEqualTo(Date value) {
            addCriterion("SUBMITDATETIME <>", value, "submitdatetime");
            return (Criteria) this;
        }

        public Criteria andSubmitdatetimeGreaterThan(Date value) {
            addCriterion("SUBMITDATETIME >", value, "submitdatetime");
            return (Criteria) this;
        }

        public Criteria andSubmitdatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("SUBMITDATETIME >=", value, "submitdatetime");
            return (Criteria) this;
        }

        public Criteria andSubmitdatetimeLessThan(Date value) {
            addCriterion("SUBMITDATETIME <", value, "submitdatetime");
            return (Criteria) this;
        }

        public Criteria andSubmitdatetimeLessThanOrEqualTo(Date value) {
            addCriterion("SUBMITDATETIME <=", value, "submitdatetime");
            return (Criteria) this;
        }

        public Criteria andSubmitdatetimeIn(List<Date> values) {
            addCriterion("SUBMITDATETIME in", values, "submitdatetime");
            return (Criteria) this;
        }

        public Criteria andSubmitdatetimeNotIn(List<Date> values) {
            addCriterion("SUBMITDATETIME not in", values, "submitdatetime");
            return (Criteria) this;
        }

        public Criteria andSubmitdatetimeBetween(Date value1, Date value2) {
            addCriterion("SUBMITDATETIME between", value1, value2, "submitdatetime");
            return (Criteria) this;
        }

        public Criteria andSubmitdatetimeNotBetween(Date value1, Date value2) {
            addCriterion("SUBMITDATETIME not between", value1, value2, "submitdatetime");
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