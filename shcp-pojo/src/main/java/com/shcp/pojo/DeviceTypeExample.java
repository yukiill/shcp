package com.shcp.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class DeviceTypeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DeviceTypeExample() {
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

        public Criteria andDsenameIsNull() {
            addCriterion("DSENAME is null");
            return (Criteria) this;
        }

        public Criteria andDsenameIsNotNull() {
            addCriterion("DSENAME is not null");
            return (Criteria) this;
        }

        public Criteria andDsenameEqualTo(String value) {
            addCriterion("DSENAME =", value, "dsename");
            return (Criteria) this;
        }

        public Criteria andDsenameNotEqualTo(String value) {
            addCriterion("DSENAME <>", value, "dsename");
            return (Criteria) this;
        }

        public Criteria andDsenameGreaterThan(String value) {
            addCriterion("DSENAME >", value, "dsename");
            return (Criteria) this;
        }

        public Criteria andDsenameGreaterThanOrEqualTo(String value) {
            addCriterion("DSENAME >=", value, "dsename");
            return (Criteria) this;
        }

        public Criteria andDsenameLessThan(String value) {
            addCriterion("DSENAME <", value, "dsename");
            return (Criteria) this;
        }

        public Criteria andDsenameLessThanOrEqualTo(String value) {
            addCriterion("DSENAME <=", value, "dsename");
            return (Criteria) this;
        }

        public Criteria andDsenameLike(String value) {
            addCriterion("DSENAME like", value, "dsename");
            return (Criteria) this;
        }

        public Criteria andDsenameNotLike(String value) {
            addCriterion("DSENAME not like", value, "dsename");
            return (Criteria) this;
        }

        public Criteria andDsenameIn(List<String> values) {
            addCriterion("DSENAME in", values, "dsename");
            return (Criteria) this;
        }

        public Criteria andDsenameNotIn(List<String> values) {
            addCriterion("DSENAME not in", values, "dsename");
            return (Criteria) this;
        }

        public Criteria andDsenameBetween(String value1, String value2) {
            addCriterion("DSENAME between", value1, value2, "dsename");
            return (Criteria) this;
        }

        public Criteria andDsenameNotBetween(String value1, String value2) {
            addCriterion("DSENAME not between", value1, value2, "dsename");
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

        public Criteria andIsOpenIsNull() {
            addCriterion("IS_OPEN is null");
            return (Criteria) this;
        }

        public Criteria andIsOpenIsNotNull() {
            addCriterion("IS_OPEN is not null");
            return (Criteria) this;
        }

        public Criteria andIsOpenEqualTo(Byte value) {
            addCriterion("IS_OPEN =", value, "isOpen");
            return (Criteria) this;
        }

        public Criteria andIsOpenNotEqualTo(Byte value) {
            addCriterion("IS_OPEN <>", value, "isOpen");
            return (Criteria) this;
        }

        public Criteria andIsOpenGreaterThan(Byte value) {
            addCriterion("IS_OPEN >", value, "isOpen");
            return (Criteria) this;
        }

        public Criteria andIsOpenGreaterThanOrEqualTo(Byte value) {
            addCriterion("IS_OPEN >=", value, "isOpen");
            return (Criteria) this;
        }

        public Criteria andIsOpenLessThan(Byte value) {
            addCriterion("IS_OPEN <", value, "isOpen");
            return (Criteria) this;
        }

        public Criteria andIsOpenLessThanOrEqualTo(Byte value) {
            addCriterion("IS_OPEN <=", value, "isOpen");
            return (Criteria) this;
        }

        public Criteria andIsOpenIn(List<Byte> values) {
            addCriterion("IS_OPEN in", values, "isOpen");
            return (Criteria) this;
        }

        public Criteria andIsOpenNotIn(List<Byte> values) {
            addCriterion("IS_OPEN not in", values, "isOpen");
            return (Criteria) this;
        }

        public Criteria andIsOpenBetween(Byte value1, Byte value2) {
            addCriterion("IS_OPEN between", value1, value2, "isOpen");
            return (Criteria) this;
        }

        public Criteria andIsOpenNotBetween(Byte value1, Byte value2) {
            addCriterion("IS_OPEN not between", value1, value2, "isOpen");
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