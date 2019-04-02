package com.shcp.pojo;

import java.util.ArrayList;
import java.util.List;

public class TbTestdevicesExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TbTestdevicesExample() {
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

        public Criteria andDsttypeIsNull() {
            addCriterion("DSTTYPE is null");
            return (Criteria) this;
        }

        public Criteria andDsttypeIsNotNull() {
            addCriterion("DSTTYPE is not null");
            return (Criteria) this;
        }

        public Criteria andDsttypeEqualTo(Integer value) {
            addCriterion("DSTTYPE =", value, "dsttype");
            return (Criteria) this;
        }

        public Criteria andDsttypeNotEqualTo(Integer value) {
            addCriterion("DSTTYPE <>", value, "dsttype");
            return (Criteria) this;
        }

        public Criteria andDsttypeGreaterThan(Integer value) {
            addCriterion("DSTTYPE >", value, "dsttype");
            return (Criteria) this;
        }

        public Criteria andDsttypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("DSTTYPE >=", value, "dsttype");
            return (Criteria) this;
        }

        public Criteria andDsttypeLessThan(Integer value) {
            addCriterion("DSTTYPE <", value, "dsttype");
            return (Criteria) this;
        }

        public Criteria andDsttypeLessThanOrEqualTo(Integer value) {
            addCriterion("DSTTYPE <=", value, "dsttype");
            return (Criteria) this;
        }

        public Criteria andDsttypeIn(List<Integer> values) {
            addCriterion("DSTTYPE in", values, "dsttype");
            return (Criteria) this;
        }

        public Criteria andDsttypeNotIn(List<Integer> values) {
            addCriterion("DSTTYPE not in", values, "dsttype");
            return (Criteria) this;
        }

        public Criteria andDsttypeBetween(Integer value1, Integer value2) {
            addCriterion("DSTTYPE between", value1, value2, "dsttype");
            return (Criteria) this;
        }

        public Criteria andDsttypeNotBetween(Integer value1, Integer value2) {
            addCriterion("DSTTYPE not between", value1, value2, "dsttype");
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

        public Criteria andDsstatusIsNull() {
            addCriterion("DSSTATUS is null");
            return (Criteria) this;
        }

        public Criteria andDsstatusIsNotNull() {
            addCriterion("DSSTATUS is not null");
            return (Criteria) this;
        }

        public Criteria andDsstatusEqualTo(Short value) {
            addCriterion("DSSTATUS =", value, "dsstatus");
            return (Criteria) this;
        }

        public Criteria andDsstatusNotEqualTo(Short value) {
            addCriterion("DSSTATUS <>", value, "dsstatus");
            return (Criteria) this;
        }

        public Criteria andDsstatusGreaterThan(Short value) {
            addCriterion("DSSTATUS >", value, "dsstatus");
            return (Criteria) this;
        }

        public Criteria andDsstatusGreaterThanOrEqualTo(Short value) {
            addCriterion("DSSTATUS >=", value, "dsstatus");
            return (Criteria) this;
        }

        public Criteria andDsstatusLessThan(Short value) {
            addCriterion("DSSTATUS <", value, "dsstatus");
            return (Criteria) this;
        }

        public Criteria andDsstatusLessThanOrEqualTo(Short value) {
            addCriterion("DSSTATUS <=", value, "dsstatus");
            return (Criteria) this;
        }

        public Criteria andDsstatusIn(List<Short> values) {
            addCriterion("DSSTATUS in", values, "dsstatus");
            return (Criteria) this;
        }

        public Criteria andDsstatusNotIn(List<Short> values) {
            addCriterion("DSSTATUS not in", values, "dsstatus");
            return (Criteria) this;
        }

        public Criteria andDsstatusBetween(Short value1, Short value2) {
            addCriterion("DSSTATUS between", value1, value2, "dsstatus");
            return (Criteria) this;
        }

        public Criteria andDsstatusNotBetween(Short value1, Short value2) {
            addCriterion("DSSTATUS not between", value1, value2, "dsstatus");
            return (Criteria) this;
        }

        public Criteria andDslimitIsNull() {
            addCriterion("DSLIMIT is null");
            return (Criteria) this;
        }

        public Criteria andDslimitIsNotNull() {
            addCriterion("DSLIMIT is not null");
            return (Criteria) this;
        }

        public Criteria andDslimitEqualTo(Short value) {
            addCriterion("DSLIMIT =", value, "dslimit");
            return (Criteria) this;
        }

        public Criteria andDslimitNotEqualTo(Short value) {
            addCriterion("DSLIMIT <>", value, "dslimit");
            return (Criteria) this;
        }

        public Criteria andDslimitGreaterThan(Short value) {
            addCriterion("DSLIMIT >", value, "dslimit");
            return (Criteria) this;
        }

        public Criteria andDslimitGreaterThanOrEqualTo(Short value) {
            addCriterion("DSLIMIT >=", value, "dslimit");
            return (Criteria) this;
        }

        public Criteria andDslimitLessThan(Short value) {
            addCriterion("DSLIMIT <", value, "dslimit");
            return (Criteria) this;
        }

        public Criteria andDslimitLessThanOrEqualTo(Short value) {
            addCriterion("DSLIMIT <=", value, "dslimit");
            return (Criteria) this;
        }

        public Criteria andDslimitIn(List<Short> values) {
            addCriterion("DSLIMIT in", values, "dslimit");
            return (Criteria) this;
        }

        public Criteria andDslimitNotIn(List<Short> values) {
            addCriterion("DSLIMIT not in", values, "dslimit");
            return (Criteria) this;
        }

        public Criteria andDslimitBetween(Short value1, Short value2) {
            addCriterion("DSLIMIT between", value1, value2, "dslimit");
            return (Criteria) this;
        }

        public Criteria andDslimitNotBetween(Short value1, Short value2) {
            addCriterion("DSLIMIT not between", value1, value2, "dslimit");
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