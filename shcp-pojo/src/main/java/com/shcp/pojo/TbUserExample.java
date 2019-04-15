package com.shcp.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class TbUserExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TbUserExample() {
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

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
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

        public Criteria andLidIsNull() {
            addCriterion("LID is null");
            return (Criteria) this;
        }

        public Criteria andLidIsNotNull() {
            addCriterion("LID is not null");
            return (Criteria) this;
        }

        public Criteria andLidEqualTo(Short value) {
            addCriterion("LID =", value, "lid");
            return (Criteria) this;
        }

        public Criteria andLidNotEqualTo(Short value) {
            addCriterion("LID <>", value, "lid");
            return (Criteria) this;
        }

        public Criteria andLidGreaterThan(Short value) {
            addCriterion("LID >", value, "lid");
            return (Criteria) this;
        }

        public Criteria andLidGreaterThanOrEqualTo(Short value) {
            addCriterion("LID >=", value, "lid");
            return (Criteria) this;
        }

        public Criteria andLidLessThan(Short value) {
            addCriterion("LID <", value, "lid");
            return (Criteria) this;
        }

        public Criteria andLidLessThanOrEqualTo(Short value) {
            addCriterion("LID <=", value, "lid");
            return (Criteria) this;
        }

        public Criteria andLidIn(List<Short> values) {
            addCriterion("LID in", values, "lid");
            return (Criteria) this;
        }

        public Criteria andLidNotIn(List<Short> values) {
            addCriterion("LID not in", values, "lid");
            return (Criteria) this;
        }

        public Criteria andLidBetween(Short value1, Short value2) {
            addCriterion("LID between", value1, value2, "lid");
            return (Criteria) this;
        }

        public Criteria andLidNotBetween(Short value1, Short value2) {
            addCriterion("LID not between", value1, value2, "lid");
            return (Criteria) this;
        }

        public Criteria andUsernameIsNull() {
            addCriterion("USERNAME is null");
            return (Criteria) this;
        }

        public Criteria andUsernameIsNotNull() {
            addCriterion("USERNAME is not null");
            return (Criteria) this;
        }

        public Criteria andUsernameEqualTo(String value) {
            addCriterion("USERNAME =", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotEqualTo(String value) {
            addCriterion("USERNAME <>", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameGreaterThan(String value) {
            addCriterion("USERNAME >", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameGreaterThanOrEqualTo(String value) {
            addCriterion("USERNAME >=", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLessThan(String value) {
            addCriterion("USERNAME <", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLessThanOrEqualTo(String value) {
            addCriterion("USERNAME <=", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLike(String value) {
            addCriterion("USERNAME like", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotLike(String value) {
            addCriterion("USERNAME not like", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameIn(List<String> values) {
            addCriterion("USERNAME in", values, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotIn(List<String> values) {
            addCriterion("USERNAME not in", values, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameBetween(String value1, String value2) {
            addCriterion("USERNAME between", value1, value2, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotBetween(String value1, String value2) {
            addCriterion("USERNAME not between", value1, value2, "username");
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

        public Criteria andUintroduceIsNull() {
            addCriterion("UINTRODUCE is null");
            return (Criteria) this;
        }

        public Criteria andUintroduceIsNotNull() {
            addCriterion("UINTRODUCE is not null");
            return (Criteria) this;
        }

        public Criteria andUintroduceEqualTo(String value) {
            addCriterion("UINTRODUCE =", value, "uintroduce");
            return (Criteria) this;
        }

        public Criteria andUintroduceNotEqualTo(String value) {
            addCriterion("UINTRODUCE <>", value, "uintroduce");
            return (Criteria) this;
        }

        public Criteria andUintroduceGreaterThan(String value) {
            addCriterion("UINTRODUCE >", value, "uintroduce");
            return (Criteria) this;
        }

        public Criteria andUintroduceGreaterThanOrEqualTo(String value) {
            addCriterion("UINTRODUCE >=", value, "uintroduce");
            return (Criteria) this;
        }

        public Criteria andUintroduceLessThan(String value) {
            addCriterion("UINTRODUCE <", value, "uintroduce");
            return (Criteria) this;
        }

        public Criteria andUintroduceLessThanOrEqualTo(String value) {
            addCriterion("UINTRODUCE <=", value, "uintroduce");
            return (Criteria) this;
        }

        public Criteria andUintroduceLike(String value) {
            addCriterion("UINTRODUCE like", value, "uintroduce");
            return (Criteria) this;
        }

        public Criteria andUintroduceNotLike(String value) {
            addCriterion("UINTRODUCE not like", value, "uintroduce");
            return (Criteria) this;
        }

        public Criteria andUintroduceIn(List<String> values) {
            addCriterion("UINTRODUCE in", values, "uintroduce");
            return (Criteria) this;
        }

        public Criteria andUintroduceNotIn(List<String> values) {
            addCriterion("UINTRODUCE not in", values, "uintroduce");
            return (Criteria) this;
        }

        public Criteria andUintroduceBetween(String value1, String value2) {
            addCriterion("UINTRODUCE between", value1, value2, "uintroduce");
            return (Criteria) this;
        }

        public Criteria andUintroduceNotBetween(String value1, String value2) {
            addCriterion("UINTRODUCE not between", value1, value2, "uintroduce");
            return (Criteria) this;
        }

        public Criteria andUemailIsNull() {
            addCriterion("UEMAIL is null");
            return (Criteria) this;
        }

        public Criteria andUemailIsNotNull() {
            addCriterion("UEMAIL is not null");
            return (Criteria) this;
        }

        public Criteria andUemailEqualTo(String value) {
            addCriterion("UEMAIL =", value, "uemail");
            return (Criteria) this;
        }

        public Criteria andUemailNotEqualTo(String value) {
            addCriterion("UEMAIL <>", value, "uemail");
            return (Criteria) this;
        }

        public Criteria andUemailGreaterThan(String value) {
            addCriterion("UEMAIL >", value, "uemail");
            return (Criteria) this;
        }

        public Criteria andUemailGreaterThanOrEqualTo(String value) {
            addCriterion("UEMAIL >=", value, "uemail");
            return (Criteria) this;
        }

        public Criteria andUemailLessThan(String value) {
            addCriterion("UEMAIL <", value, "uemail");
            return (Criteria) this;
        }

        public Criteria andUemailLessThanOrEqualTo(String value) {
            addCriterion("UEMAIL <=", value, "uemail");
            return (Criteria) this;
        }

        public Criteria andUemailLike(String value) {
            addCriterion("UEMAIL like", value, "uemail");
            return (Criteria) this;
        }

        public Criteria andUemailNotLike(String value) {
            addCriterion("UEMAIL not like", value, "uemail");
            return (Criteria) this;
        }

        public Criteria andUemailIn(List<String> values) {
            addCriterion("UEMAIL in", values, "uemail");
            return (Criteria) this;
        }

        public Criteria andUemailNotIn(List<String> values) {
            addCriterion("UEMAIL not in", values, "uemail");
            return (Criteria) this;
        }

        public Criteria andUemailBetween(String value1, String value2) {
            addCriterion("UEMAIL between", value1, value2, "uemail");
            return (Criteria) this;
        }

        public Criteria andUemailNotBetween(String value1, String value2) {
            addCriterion("UEMAIL not between", value1, value2, "uemail");
            return (Criteria) this;
        }

        public Criteria andCdateIsNull() {
            addCriterion("CDATE is null");
            return (Criteria) this;
        }

        public Criteria andCdateIsNotNull() {
            addCriterion("CDATE is not null");
            return (Criteria) this;
        }

        public Criteria andCdateEqualTo(Date value) {
            addCriterion("CDATE =", value, "cdate");
            return (Criteria) this;
        }

        public Criteria andCdateNotEqualTo(Date value) {
            addCriterion("CDATE <>", value, "cdate");
            return (Criteria) this;
        }

        public Criteria andCdateGreaterThan(Date value) {
            addCriterion("CDATE >", value, "cdate");
            return (Criteria) this;
        }

        public Criteria andCdateGreaterThanOrEqualTo(Date value) {
            addCriterion("CDATE >=", value, "cdate");
            return (Criteria) this;
        }

        public Criteria andCdateLessThan(Date value) {
            addCriterion("CDATE <", value, "cdate");
            return (Criteria) this;
        }

        public Criteria andCdateLessThanOrEqualTo(Date value) {
            addCriterion("CDATE <=", value, "cdate");
            return (Criteria) this;
        }

        public Criteria andCdateIn(List<Date> values) {
            addCriterion("CDATE in", values, "cdate");
            return (Criteria) this;
        }

        public Criteria andCdateNotIn(List<Date> values) {
            addCriterion("CDATE not in", values, "cdate");
            return (Criteria) this;
        }

        public Criteria andCdateBetween(Date value1, Date value2) {
            addCriterion("CDATE between", value1, value2, "cdate");
            return (Criteria) this;
        }

        public Criteria andCdateNotBetween(Date value1, Date value2) {
            addCriterion("CDATE not between", value1, value2, "cdate");
            return (Criteria) this;
        }

        public Criteria andUhimgIsNull() {
            addCriterion("UHIMG is null");
            return (Criteria) this;
        }

        public Criteria andUhimgIsNotNull() {
            addCriterion("UHIMG is not null");
            return (Criteria) this;
        }

        public Criteria andUhimgEqualTo(String value) {
            addCriterion("UHIMG =", value, "uhimg");
            return (Criteria) this;
        }

        public Criteria andUhimgNotEqualTo(String value) {
            addCriterion("UHIMG <>", value, "uhimg");
            return (Criteria) this;
        }

        public Criteria andUhimgGreaterThan(String value) {
            addCriterion("UHIMG >", value, "uhimg");
            return (Criteria) this;
        }

        public Criteria andUhimgGreaterThanOrEqualTo(String value) {
            addCriterion("UHIMG >=", value, "uhimg");
            return (Criteria) this;
        }

        public Criteria andUhimgLessThan(String value) {
            addCriterion("UHIMG <", value, "uhimg");
            return (Criteria) this;
        }

        public Criteria andUhimgLessThanOrEqualTo(String value) {
            addCriterion("UHIMG <=", value, "uhimg");
            return (Criteria) this;
        }

        public Criteria andUhimgLike(String value) {
            addCriterion("UHIMG like", value, "uhimg");
            return (Criteria) this;
        }

        public Criteria andUhimgNotLike(String value) {
            addCriterion("UHIMG not like", value, "uhimg");
            return (Criteria) this;
        }

        public Criteria andUhimgIn(List<String> values) {
            addCriterion("UHIMG in", values, "uhimg");
            return (Criteria) this;
        }

        public Criteria andUhimgNotIn(List<String> values) {
            addCriterion("UHIMG not in", values, "uhimg");
            return (Criteria) this;
        }

        public Criteria andUhimgBetween(String value1, String value2) {
            addCriterion("UHIMG between", value1, value2, "uhimg");
            return (Criteria) this;
        }

        public Criteria andUhimgNotBetween(String value1, String value2) {
            addCriterion("UHIMG not between", value1, value2, "uhimg");
            return (Criteria) this;
        }

        public Criteria andUbirthIsNull() {
            addCriterion("UBIRTH is null");
            return (Criteria) this;
        }

        public Criteria andUbirthIsNotNull() {
            addCriterion("UBIRTH is not null");
            return (Criteria) this;
        }

        public Criteria andUbirthEqualTo(Date value) {
            addCriterionForJDBCDate("UBIRTH =", value, "ubirth");
            return (Criteria) this;
        }

        public Criteria andUbirthNotEqualTo(Date value) {
            addCriterionForJDBCDate("UBIRTH <>", value, "ubirth");
            return (Criteria) this;
        }

        public Criteria andUbirthGreaterThan(Date value) {
            addCriterionForJDBCDate("UBIRTH >", value, "ubirth");
            return (Criteria) this;
        }

        public Criteria andUbirthGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("UBIRTH >=", value, "ubirth");
            return (Criteria) this;
        }

        public Criteria andUbirthLessThan(Date value) {
            addCriterionForJDBCDate("UBIRTH <", value, "ubirth");
            return (Criteria) this;
        }

        public Criteria andUbirthLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("UBIRTH <=", value, "ubirth");
            return (Criteria) this;
        }

        public Criteria andUbirthIn(List<Date> values) {
            addCriterionForJDBCDate("UBIRTH in", values, "ubirth");
            return (Criteria) this;
        }

        public Criteria andUbirthNotIn(List<Date> values) {
            addCriterionForJDBCDate("UBIRTH not in", values, "ubirth");
            return (Criteria) this;
        }

        public Criteria andUbirthBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("UBIRTH between", value1, value2, "ubirth");
            return (Criteria) this;
        }

        public Criteria andUbirthNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("UBIRTH not between", value1, value2, "ubirth");
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