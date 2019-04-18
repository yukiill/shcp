package com.shcp.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class DeviceExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DeviceExample() {
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

        public Criteria andDeidIsNull() {
            addCriterion("DEID is null");
            return (Criteria) this;
        }

        public Criteria andDeidIsNotNull() {
            addCriterion("DEID is not null");
            return (Criteria) this;
        }

        public Criteria andDeidEqualTo(Long value) {
            addCriterion("DEID =", value, "deid");
            return (Criteria) this;
        }

        public Criteria andDeidNotEqualTo(Long value) {
            addCriterion("DEID <>", value, "deid");
            return (Criteria) this;
        }

        public Criteria andDeidGreaterThan(Long value) {
            addCriterion("DEID >", value, "deid");
            return (Criteria) this;
        }

        public Criteria andDeidGreaterThanOrEqualTo(Long value) {
            addCriterion("DEID >=", value, "deid");
            return (Criteria) this;
        }

        public Criteria andDeidLessThan(Long value) {
            addCriterion("DEID <", value, "deid");
            return (Criteria) this;
        }

        public Criteria andDeidLessThanOrEqualTo(Long value) {
            addCriterion("DEID <=", value, "deid");
            return (Criteria) this;
        }

        public Criteria andDeidIn(List<Long> values) {
            addCriterion("DEID in", values, "deid");
            return (Criteria) this;
        }

        public Criteria andDeidNotIn(List<Long> values) {
            addCriterion("DEID not in", values, "deid");
            return (Criteria) this;
        }

        public Criteria andDeidBetween(Long value1, Long value2) {
            addCriterion("DEID between", value1, value2, "deid");
            return (Criteria) this;
        }

        public Criteria andDeidNotBetween(Long value1, Long value2) {
            addCriterion("DEID not between", value1, value2, "deid");
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

        public Criteria andDenameIsNull() {
            addCriterion("DENAME is null");
            return (Criteria) this;
        }

        public Criteria andDenameIsNotNull() {
            addCriterion("DENAME is not null");
            return (Criteria) this;
        }

        public Criteria andDenameEqualTo(String value) {
            addCriterion("DENAME =", value, "dename");
            return (Criteria) this;
        }

        public Criteria andDenameNotEqualTo(String value) {
            addCriterion("DENAME <>", value, "dename");
            return (Criteria) this;
        }

        public Criteria andDenameGreaterThan(String value) {
            addCriterion("DENAME >", value, "dename");
            return (Criteria) this;
        }

        public Criteria andDenameGreaterThanOrEqualTo(String value) {
            addCriterion("DENAME >=", value, "dename");
            return (Criteria) this;
        }

        public Criteria andDenameLessThan(String value) {
            addCriterion("DENAME <", value, "dename");
            return (Criteria) this;
        }

        public Criteria andDenameLessThanOrEqualTo(String value) {
            addCriterion("DENAME <=", value, "dename");
            return (Criteria) this;
        }

        public Criteria andDenameLike(String value) {
            addCriterion("DENAME like", value, "dename");
            return (Criteria) this;
        }

        public Criteria andDenameNotLike(String value) {
            addCriterion("DENAME not like", value, "dename");
            return (Criteria) this;
        }

        public Criteria andDenameIn(List<String> values) {
            addCriterion("DENAME in", values, "dename");
            return (Criteria) this;
        }

        public Criteria andDenameNotIn(List<String> values) {
            addCriterion("DENAME not in", values, "dename");
            return (Criteria) this;
        }

        public Criteria andDenameBetween(String value1, String value2) {
            addCriterion("DENAME between", value1, value2, "dename");
            return (Criteria) this;
        }

        public Criteria andDenameNotBetween(String value1, String value2) {
            addCriterion("DENAME not between", value1, value2, "dename");
            return (Criteria) this;
        }

        public Criteria andDeipaddrIsNull() {
            addCriterion("DEIPADDR is null");
            return (Criteria) this;
        }

        public Criteria andDeipaddrIsNotNull() {
            addCriterion("DEIPADDR is not null");
            return (Criteria) this;
        }

        public Criteria andDeipaddrEqualTo(String value) {
            addCriterion("DEIPADDR =", value, "deipaddr");
            return (Criteria) this;
        }

        public Criteria andDeipaddrNotEqualTo(String value) {
            addCriterion("DEIPADDR <>", value, "deipaddr");
            return (Criteria) this;
        }

        public Criteria andDeipaddrGreaterThan(String value) {
            addCriterion("DEIPADDR >", value, "deipaddr");
            return (Criteria) this;
        }

        public Criteria andDeipaddrGreaterThanOrEqualTo(String value) {
            addCriterion("DEIPADDR >=", value, "deipaddr");
            return (Criteria) this;
        }

        public Criteria andDeipaddrLessThan(String value) {
            addCriterion("DEIPADDR <", value, "deipaddr");
            return (Criteria) this;
        }

        public Criteria andDeipaddrLessThanOrEqualTo(String value) {
            addCriterion("DEIPADDR <=", value, "deipaddr");
            return (Criteria) this;
        }

        public Criteria andDeipaddrLike(String value) {
            addCriterion("DEIPADDR like", value, "deipaddr");
            return (Criteria) this;
        }

        public Criteria andDeipaddrNotLike(String value) {
            addCriterion("DEIPADDR not like", value, "deipaddr");
            return (Criteria) this;
        }

        public Criteria andDeipaddrIn(List<String> values) {
            addCriterion("DEIPADDR in", values, "deipaddr");
            return (Criteria) this;
        }

        public Criteria andDeipaddrNotIn(List<String> values) {
            addCriterion("DEIPADDR not in", values, "deipaddr");
            return (Criteria) this;
        }

        public Criteria andDeipaddrBetween(String value1, String value2) {
            addCriterion("DEIPADDR between", value1, value2, "deipaddr");
            return (Criteria) this;
        }

        public Criteria andDeipaddrNotBetween(String value1, String value2) {
            addCriterion("DEIPADDR not between", value1, value2, "deipaddr");
            return (Criteria) this;
        }

        public Criteria andDeportIsNull() {
            addCriterion("DEPORT is null");
            return (Criteria) this;
        }

        public Criteria andDeportIsNotNull() {
            addCriterion("DEPORT is not null");
            return (Criteria) this;
        }

        public Criteria andDeportEqualTo(Integer value) {
            addCriterion("DEPORT =", value, "deport");
            return (Criteria) this;
        }

        public Criteria andDeportNotEqualTo(Integer value) {
            addCriterion("DEPORT <>", value, "deport");
            return (Criteria) this;
        }

        public Criteria andDeportGreaterThan(Integer value) {
            addCriterion("DEPORT >", value, "deport");
            return (Criteria) this;
        }

        public Criteria andDeportGreaterThanOrEqualTo(Integer value) {
            addCriterion("DEPORT >=", value, "deport");
            return (Criteria) this;
        }

        public Criteria andDeportLessThan(Integer value) {
            addCriterion("DEPORT <", value, "deport");
            return (Criteria) this;
        }

        public Criteria andDeportLessThanOrEqualTo(Integer value) {
            addCriterion("DEPORT <=", value, "deport");
            return (Criteria) this;
        }

        public Criteria andDeportIn(List<Integer> values) {
            addCriterion("DEPORT in", values, "deport");
            return (Criteria) this;
        }

        public Criteria andDeportNotIn(List<Integer> values) {
            addCriterion("DEPORT not in", values, "deport");
            return (Criteria) this;
        }

        public Criteria andDeportBetween(Integer value1, Integer value2) {
            addCriterion("DEPORT between", value1, value2, "deport");
            return (Criteria) this;
        }

        public Criteria andDeportNotBetween(Integer value1, Integer value2) {
            addCriterion("DEPORT not between", value1, value2, "deport");
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