package com.shcp.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TestDeviceExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TestDeviceExample() {
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

        public Criteria andTdeidIsNull() {
            addCriterion("TDEID is null");
            return (Criteria) this;
        }

        public Criteria andTdeidIsNotNull() {
            addCriterion("TDEID is not null");
            return (Criteria) this;
        }

        public Criteria andTdeidEqualTo(Long value) {
            addCriterion("TDEID =", value, "tdeid");
            return (Criteria) this;
        }

        public Criteria andTdeidNotEqualTo(Long value) {
            addCriterion("TDEID <>", value, "tdeid");
            return (Criteria) this;
        }

        public Criteria andTdeidGreaterThan(Long value) {
            addCriterion("TDEID >", value, "tdeid");
            return (Criteria) this;
        }

        public Criteria andTdeidGreaterThanOrEqualTo(Long value) {
            addCriterion("TDEID >=", value, "tdeid");
            return (Criteria) this;
        }

        public Criteria andTdeidLessThan(Long value) {
            addCriterion("TDEID <", value, "tdeid");
            return (Criteria) this;
        }

        public Criteria andTdeidLessThanOrEqualTo(Long value) {
            addCriterion("TDEID <=", value, "tdeid");
            return (Criteria) this;
        }

        public Criteria andTdeidIn(List<Long> values) {
            addCriterion("TDEID in", values, "tdeid");
            return (Criteria) this;
        }

        public Criteria andTdeidNotIn(List<Long> values) {
            addCriterion("TDEID not in", values, "tdeid");
            return (Criteria) this;
        }

        public Criteria andTdeidBetween(Long value1, Long value2) {
            addCriterion("TDEID between", value1, value2, "tdeid");
            return (Criteria) this;
        }

        public Criteria andTdeidNotBetween(Long value1, Long value2) {
            addCriterion("TDEID not between", value1, value2, "tdeid");
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

        public Criteria andTdenameIsNull() {
            addCriterion("TDENAME is null");
            return (Criteria) this;
        }

        public Criteria andTdenameIsNotNull() {
            addCriterion("TDENAME is not null");
            return (Criteria) this;
        }

        public Criteria andTdenameEqualTo(String value) {
            addCriterion("TDENAME =", value, "tdename");
            return (Criteria) this;
        }

        public Criteria andTdenameNotEqualTo(String value) {
            addCriterion("TDENAME <>", value, "tdename");
            return (Criteria) this;
        }

        public Criteria andTdenameGreaterThan(String value) {
            addCriterion("TDENAME >", value, "tdename");
            return (Criteria) this;
        }

        public Criteria andTdenameGreaterThanOrEqualTo(String value) {
            addCriterion("TDENAME >=", value, "tdename");
            return (Criteria) this;
        }

        public Criteria andTdenameLessThan(String value) {
            addCriterion("TDENAME <", value, "tdename");
            return (Criteria) this;
        }

        public Criteria andTdenameLessThanOrEqualTo(String value) {
            addCriterion("TDENAME <=", value, "tdename");
            return (Criteria) this;
        }

        public Criteria andTdenameLike(String value) {
            addCriterion("TDENAME like", value, "tdename");
            return (Criteria) this;
        }

        public Criteria andTdenameNotLike(String value) {
            addCriterion("TDENAME not like", value, "tdename");
            return (Criteria) this;
        }

        public Criteria andTdenameIn(List<String> values) {
            addCriterion("TDENAME in", values, "tdename");
            return (Criteria) this;
        }

        public Criteria andTdenameNotIn(List<String> values) {
            addCriterion("TDENAME not in", values, "tdename");
            return (Criteria) this;
        }

        public Criteria andTdenameBetween(String value1, String value2) {
            addCriterion("TDENAME between", value1, value2, "tdename");
            return (Criteria) this;
        }

        public Criteria andTdenameNotBetween(String value1, String value2) {
            addCriterion("TDENAME not between", value1, value2, "tdename");
            return (Criteria) this;
        }

        public Criteria andTdeipaddrIsNull() {
            addCriterion("TDEIPADDR is null");
            return (Criteria) this;
        }

        public Criteria andTdeipaddrIsNotNull() {
            addCriterion("TDEIPADDR is not null");
            return (Criteria) this;
        }

        public Criteria andTdeipaddrEqualTo(String value) {
            addCriterion("TDEIPADDR =", value, "tdeipaddr");
            return (Criteria) this;
        }

        public Criteria andTdeipaddrNotEqualTo(String value) {
            addCriterion("TDEIPADDR <>", value, "tdeipaddr");
            return (Criteria) this;
        }

        public Criteria andTdeipaddrGreaterThan(String value) {
            addCriterion("TDEIPADDR >", value, "tdeipaddr");
            return (Criteria) this;
        }

        public Criteria andTdeipaddrGreaterThanOrEqualTo(String value) {
            addCriterion("TDEIPADDR >=", value, "tdeipaddr");
            return (Criteria) this;
        }

        public Criteria andTdeipaddrLessThan(String value) {
            addCriterion("TDEIPADDR <", value, "tdeipaddr");
            return (Criteria) this;
        }

        public Criteria andTdeipaddrLessThanOrEqualTo(String value) {
            addCriterion("TDEIPADDR <=", value, "tdeipaddr");
            return (Criteria) this;
        }

        public Criteria andTdeipaddrLike(String value) {
            addCriterion("TDEIPADDR like", value, "tdeipaddr");
            return (Criteria) this;
        }

        public Criteria andTdeipaddrNotLike(String value) {
            addCriterion("TDEIPADDR not like", value, "tdeipaddr");
            return (Criteria) this;
        }

        public Criteria andTdeipaddrIn(List<String> values) {
            addCriterion("TDEIPADDR in", values, "tdeipaddr");
            return (Criteria) this;
        }

        public Criteria andTdeipaddrNotIn(List<String> values) {
            addCriterion("TDEIPADDR not in", values, "tdeipaddr");
            return (Criteria) this;
        }

        public Criteria andTdeipaddrBetween(String value1, String value2) {
            addCriterion("TDEIPADDR between", value1, value2, "tdeipaddr");
            return (Criteria) this;
        }

        public Criteria andTdeipaddrNotBetween(String value1, String value2) {
            addCriterion("TDEIPADDR not between", value1, value2, "tdeipaddr");
            return (Criteria) this;
        }

        public Criteria andTdeportIsNull() {
            addCriterion("TDEPORT is null");
            return (Criteria) this;
        }

        public Criteria andTdeportIsNotNull() {
            addCriterion("TDEPORT is not null");
            return (Criteria) this;
        }

        public Criteria andTdeportEqualTo(Integer value) {
            addCriterion("TDEPORT =", value, "tdeport");
            return (Criteria) this;
        }

        public Criteria andTdeportNotEqualTo(Integer value) {
            addCriterion("TDEPORT <>", value, "tdeport");
            return (Criteria) this;
        }

        public Criteria andTdeportGreaterThan(Integer value) {
            addCriterion("TDEPORT >", value, "tdeport");
            return (Criteria) this;
        }

        public Criteria andTdeportGreaterThanOrEqualTo(Integer value) {
            addCriterion("TDEPORT >=", value, "tdeport");
            return (Criteria) this;
        }

        public Criteria andTdeportLessThan(Integer value) {
            addCriterion("TDEPORT <", value, "tdeport");
            return (Criteria) this;
        }

        public Criteria andTdeportLessThanOrEqualTo(Integer value) {
            addCriterion("TDEPORT <=", value, "tdeport");
            return (Criteria) this;
        }

        public Criteria andTdeportIn(List<Integer> values) {
            addCriterion("TDEPORT in", values, "tdeport");
            return (Criteria) this;
        }

        public Criteria andTdeportNotIn(List<Integer> values) {
            addCriterion("TDEPORT not in", values, "tdeport");
            return (Criteria) this;
        }

        public Criteria andTdeportBetween(Integer value1, Integer value2) {
            addCriterion("TDEPORT between", value1, value2, "tdeport");
            return (Criteria) this;
        }

        public Criteria andTdeportNotBetween(Integer value1, Integer value2) {
            addCriterion("TDEPORT not between", value1, value2, "tdeport");
            return (Criteria) this;
        }

        public Criteria andDemacIsNull() {
            addCriterion("DEMAC is null");
            return (Criteria) this;
        }

        public Criteria andDemacIsNotNull() {
            addCriterion("DEMAC is not null");
            return (Criteria) this;
        }

        public Criteria andDemacEqualTo(String value) {
            addCriterion("DEMAC =", value, "demac");
            return (Criteria) this;
        }

        public Criteria andDemacNotEqualTo(String value) {
            addCriterion("DEMAC <>", value, "demac");
            return (Criteria) this;
        }

        public Criteria andDemacGreaterThan(String value) {
            addCriterion("DEMAC >", value, "demac");
            return (Criteria) this;
        }

        public Criteria andDemacGreaterThanOrEqualTo(String value) {
            addCriterion("DEMAC >=", value, "demac");
            return (Criteria) this;
        }

        public Criteria andDemacLessThan(String value) {
            addCriterion("DEMAC <", value, "demac");
            return (Criteria) this;
        }

        public Criteria andDemacLessThanOrEqualTo(String value) {
            addCriterion("DEMAC <=", value, "demac");
            return (Criteria) this;
        }

        public Criteria andDemacLike(String value) {
            addCriterion("DEMAC like", value, "demac");
            return (Criteria) this;
        }

        public Criteria andDemacNotLike(String value) {
            addCriterion("DEMAC not like", value, "demac");
            return (Criteria) this;
        }

        public Criteria andDemacIn(List<String> values) {
            addCriterion("DEMAC in", values, "demac");
            return (Criteria) this;
        }

        public Criteria andDemacNotIn(List<String> values) {
            addCriterion("DEMAC not in", values, "demac");
            return (Criteria) this;
        }

        public Criteria andDemacBetween(String value1, String value2) {
            addCriterion("DEMAC between", value1, value2, "demac");
            return (Criteria) this;
        }

        public Criteria andDemacNotBetween(String value1, String value2) {
            addCriterion("DEMAC not between", value1, value2, "demac");
            return (Criteria) this;
        }

        public Criteria andGmtCreateIsNull() {
            addCriterion("GMT_CREATE is null");
            return (Criteria) this;
        }

        public Criteria andGmtCreateIsNotNull() {
            addCriterion("GMT_CREATE is not null");
            return (Criteria) this;
        }

        public Criteria andGmtCreateEqualTo(Date value) {
            addCriterion("GMT_CREATE =", value, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateNotEqualTo(Date value) {
            addCriterion("GMT_CREATE <>", value, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateGreaterThan(Date value) {
            addCriterion("GMT_CREATE >", value, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateGreaterThanOrEqualTo(Date value) {
            addCriterion("GMT_CREATE >=", value, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateLessThan(Date value) {
            addCriterion("GMT_CREATE <", value, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateLessThanOrEqualTo(Date value) {
            addCriterion("GMT_CREATE <=", value, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateIn(List<Date> values) {
            addCriterion("GMT_CREATE in", values, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateNotIn(List<Date> values) {
            addCriterion("GMT_CREATE not in", values, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateBetween(Date value1, Date value2) {
            addCriterion("GMT_CREATE between", value1, value2, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateNotBetween(Date value1, Date value2) {
            addCriterion("GMT_CREATE not between", value1, value2, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtModifyIsNull() {
            addCriterion("GMT_MODIFY is null");
            return (Criteria) this;
        }

        public Criteria andGmtModifyIsNotNull() {
            addCriterion("GMT_MODIFY is not null");
            return (Criteria) this;
        }

        public Criteria andGmtModifyEqualTo(Date value) {
            addCriterion("GMT_MODIFY =", value, "gmtModify");
            return (Criteria) this;
        }

        public Criteria andGmtModifyNotEqualTo(Date value) {
            addCriterion("GMT_MODIFY <>", value, "gmtModify");
            return (Criteria) this;
        }

        public Criteria andGmtModifyGreaterThan(Date value) {
            addCriterion("GMT_MODIFY >", value, "gmtModify");
            return (Criteria) this;
        }

        public Criteria andGmtModifyGreaterThanOrEqualTo(Date value) {
            addCriterion("GMT_MODIFY >=", value, "gmtModify");
            return (Criteria) this;
        }

        public Criteria andGmtModifyLessThan(Date value) {
            addCriterion("GMT_MODIFY <", value, "gmtModify");
            return (Criteria) this;
        }

        public Criteria andGmtModifyLessThanOrEqualTo(Date value) {
            addCriterion("GMT_MODIFY <=", value, "gmtModify");
            return (Criteria) this;
        }

        public Criteria andGmtModifyIn(List<Date> values) {
            addCriterion("GMT_MODIFY in", values, "gmtModify");
            return (Criteria) this;
        }

        public Criteria andGmtModifyNotIn(List<Date> values) {
            addCriterion("GMT_MODIFY not in", values, "gmtModify");
            return (Criteria) this;
        }

        public Criteria andGmtModifyBetween(Date value1, Date value2) {
            addCriterion("GMT_MODIFY between", value1, value2, "gmtModify");
            return (Criteria) this;
        }

        public Criteria andGmtModifyNotBetween(Date value1, Date value2) {
            addCriterion("GMT_MODIFY not between", value1, value2, "gmtModify");
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