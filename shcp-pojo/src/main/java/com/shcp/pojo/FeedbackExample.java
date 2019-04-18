package com.shcp.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class FeedbackExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public FeedbackExample() {
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

        public Criteria andFtitleIsNull() {
            addCriterion("FTITLE is null");
            return (Criteria) this;
        }

        public Criteria andFtitleIsNotNull() {
            addCriterion("FTITLE is not null");
            return (Criteria) this;
        }

        public Criteria andFtitleEqualTo(String value) {
            addCriterion("FTITLE =", value, "ftitle");
            return (Criteria) this;
        }

        public Criteria andFtitleNotEqualTo(String value) {
            addCriterion("FTITLE <>", value, "ftitle");
            return (Criteria) this;
        }

        public Criteria andFtitleGreaterThan(String value) {
            addCriterion("FTITLE >", value, "ftitle");
            return (Criteria) this;
        }

        public Criteria andFtitleGreaterThanOrEqualTo(String value) {
            addCriterion("FTITLE >=", value, "ftitle");
            return (Criteria) this;
        }

        public Criteria andFtitleLessThan(String value) {
            addCriterion("FTITLE <", value, "ftitle");
            return (Criteria) this;
        }

        public Criteria andFtitleLessThanOrEqualTo(String value) {
            addCriterion("FTITLE <=", value, "ftitle");
            return (Criteria) this;
        }

        public Criteria andFtitleLike(String value) {
            addCriterion("FTITLE like", value, "ftitle");
            return (Criteria) this;
        }

        public Criteria andFtitleNotLike(String value) {
            addCriterion("FTITLE not like", value, "ftitle");
            return (Criteria) this;
        }

        public Criteria andFtitleIn(List<String> values) {
            addCriterion("FTITLE in", values, "ftitle");
            return (Criteria) this;
        }

        public Criteria andFtitleNotIn(List<String> values) {
            addCriterion("FTITLE not in", values, "ftitle");
            return (Criteria) this;
        }

        public Criteria andFtitleBetween(String value1, String value2) {
            addCriterion("FTITLE between", value1, value2, "ftitle");
            return (Criteria) this;
        }

        public Criteria andFtitleNotBetween(String value1, String value2) {
            addCriterion("FTITLE not between", value1, value2, "ftitle");
            return (Criteria) this;
        }

        public Criteria andFcontentIsNull() {
            addCriterion("FCONTENT is null");
            return (Criteria) this;
        }

        public Criteria andFcontentIsNotNull() {
            addCriterion("FCONTENT is not null");
            return (Criteria) this;
        }

        public Criteria andFcontentEqualTo(String value) {
            addCriterion("FCONTENT =", value, "fcontent");
            return (Criteria) this;
        }

        public Criteria andFcontentNotEqualTo(String value) {
            addCriterion("FCONTENT <>", value, "fcontent");
            return (Criteria) this;
        }

        public Criteria andFcontentGreaterThan(String value) {
            addCriterion("FCONTENT >", value, "fcontent");
            return (Criteria) this;
        }

        public Criteria andFcontentGreaterThanOrEqualTo(String value) {
            addCriterion("FCONTENT >=", value, "fcontent");
            return (Criteria) this;
        }

        public Criteria andFcontentLessThan(String value) {
            addCriterion("FCONTENT <", value, "fcontent");
            return (Criteria) this;
        }

        public Criteria andFcontentLessThanOrEqualTo(String value) {
            addCriterion("FCONTENT <=", value, "fcontent");
            return (Criteria) this;
        }

        public Criteria andFcontentLike(String value) {
            addCriterion("FCONTENT like", value, "fcontent");
            return (Criteria) this;
        }

        public Criteria andFcontentNotLike(String value) {
            addCriterion("FCONTENT not like", value, "fcontent");
            return (Criteria) this;
        }

        public Criteria andFcontentIn(List<String> values) {
            addCriterion("FCONTENT in", values, "fcontent");
            return (Criteria) this;
        }

        public Criteria andFcontentNotIn(List<String> values) {
            addCriterion("FCONTENT not in", values, "fcontent");
            return (Criteria) this;
        }

        public Criteria andFcontentBetween(String value1, String value2) {
            addCriterion("FCONTENT between", value1, value2, "fcontent");
            return (Criteria) this;
        }

        public Criteria andFcontentNotBetween(String value1, String value2) {
            addCriterion("FCONTENT not between", value1, value2, "fcontent");
            return (Criteria) this;
        }

        public Criteria andIsCheckIsNull() {
            addCriterion("IS_CHECK is null");
            return (Criteria) this;
        }

        public Criteria andIsCheckIsNotNull() {
            addCriterion("IS_CHECK is not null");
            return (Criteria) this;
        }

        public Criteria andIsCheckEqualTo(Byte value) {
            addCriterion("IS_CHECK =", value, "isCheck");
            return (Criteria) this;
        }

        public Criteria andIsCheckNotEqualTo(Byte value) {
            addCriterion("IS_CHECK <>", value, "isCheck");
            return (Criteria) this;
        }

        public Criteria andIsCheckGreaterThan(Byte value) {
            addCriterion("IS_CHECK >", value, "isCheck");
            return (Criteria) this;
        }

        public Criteria andIsCheckGreaterThanOrEqualTo(Byte value) {
            addCriterion("IS_CHECK >=", value, "isCheck");
            return (Criteria) this;
        }

        public Criteria andIsCheckLessThan(Byte value) {
            addCriterion("IS_CHECK <", value, "isCheck");
            return (Criteria) this;
        }

        public Criteria andIsCheckLessThanOrEqualTo(Byte value) {
            addCriterion("IS_CHECK <=", value, "isCheck");
            return (Criteria) this;
        }

        public Criteria andIsCheckIn(List<Byte> values) {
            addCriterion("IS_CHECK in", values, "isCheck");
            return (Criteria) this;
        }

        public Criteria andIsCheckNotIn(List<Byte> values) {
            addCriterion("IS_CHECK not in", values, "isCheck");
            return (Criteria) this;
        }

        public Criteria andIsCheckBetween(Byte value1, Byte value2) {
            addCriterion("IS_CHECK between", value1, value2, "isCheck");
            return (Criteria) this;
        }

        public Criteria andIsCheckNotBetween(Byte value1, Byte value2) {
            addCriterion("IS_CHECK not between", value1, value2, "isCheck");
            return (Criteria) this;
        }

        public Criteria andIsReplyIsNull() {
            addCriterion("IS_REPLY is null");
            return (Criteria) this;
        }

        public Criteria andIsReplyIsNotNull() {
            addCriterion("IS_REPLY is not null");
            return (Criteria) this;
        }

        public Criteria andIsReplyEqualTo(Byte value) {
            addCriterion("IS_REPLY =", value, "isReply");
            return (Criteria) this;
        }

        public Criteria andIsReplyNotEqualTo(Byte value) {
            addCriterion("IS_REPLY <>", value, "isReply");
            return (Criteria) this;
        }

        public Criteria andIsReplyGreaterThan(Byte value) {
            addCriterion("IS_REPLY >", value, "isReply");
            return (Criteria) this;
        }

        public Criteria andIsReplyGreaterThanOrEqualTo(Byte value) {
            addCriterion("IS_REPLY >=", value, "isReply");
            return (Criteria) this;
        }

        public Criteria andIsReplyLessThan(Byte value) {
            addCriterion("IS_REPLY <", value, "isReply");
            return (Criteria) this;
        }

        public Criteria andIsReplyLessThanOrEqualTo(Byte value) {
            addCriterion("IS_REPLY <=", value, "isReply");
            return (Criteria) this;
        }

        public Criteria andIsReplyIn(List<Byte> values) {
            addCriterion("IS_REPLY in", values, "isReply");
            return (Criteria) this;
        }

        public Criteria andIsReplyNotIn(List<Byte> values) {
            addCriterion("IS_REPLY not in", values, "isReply");
            return (Criteria) this;
        }

        public Criteria andIsReplyBetween(Byte value1, Byte value2) {
            addCriterion("IS_REPLY between", value1, value2, "isReply");
            return (Criteria) this;
        }

        public Criteria andIsReplyNotBetween(Byte value1, Byte value2) {
            addCriterion("IS_REPLY not between", value1, value2, "isReply");
            return (Criteria) this;
        }

        public Criteria andFromUserIdIsNull() {
            addCriterion("FROM_USER_ID is null");
            return (Criteria) this;
        }

        public Criteria andFromUserIdIsNotNull() {
            addCriterion("FROM_USER_ID is not null");
            return (Criteria) this;
        }

        public Criteria andFromUserIdEqualTo(Long value) {
            addCriterion("FROM_USER_ID =", value, "fromUserId");
            return (Criteria) this;
        }

        public Criteria andFromUserIdNotEqualTo(Long value) {
            addCriterion("FROM_USER_ID <>", value, "fromUserId");
            return (Criteria) this;
        }

        public Criteria andFromUserIdGreaterThan(Long value) {
            addCriterion("FROM_USER_ID >", value, "fromUserId");
            return (Criteria) this;
        }

        public Criteria andFromUserIdGreaterThanOrEqualTo(Long value) {
            addCriterion("FROM_USER_ID >=", value, "fromUserId");
            return (Criteria) this;
        }

        public Criteria andFromUserIdLessThan(Long value) {
            addCriterion("FROM_USER_ID <", value, "fromUserId");
            return (Criteria) this;
        }

        public Criteria andFromUserIdLessThanOrEqualTo(Long value) {
            addCriterion("FROM_USER_ID <=", value, "fromUserId");
            return (Criteria) this;
        }

        public Criteria andFromUserIdIn(List<Long> values) {
            addCriterion("FROM_USER_ID in", values, "fromUserId");
            return (Criteria) this;
        }

        public Criteria andFromUserIdNotIn(List<Long> values) {
            addCriterion("FROM_USER_ID not in", values, "fromUserId");
            return (Criteria) this;
        }

        public Criteria andFromUserIdBetween(Long value1, Long value2) {
            addCriterion("FROM_USER_ID between", value1, value2, "fromUserId");
            return (Criteria) this;
        }

        public Criteria andFromUserIdNotBetween(Long value1, Long value2) {
            addCriterion("FROM_USER_ID not between", value1, value2, "fromUserId");
            return (Criteria) this;
        }

        public Criteria andFromUserTypeIsNull() {
            addCriterion("FROM_USER_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andFromUserTypeIsNotNull() {
            addCriterion("FROM_USER_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andFromUserTypeEqualTo(Byte value) {
            addCriterion("FROM_USER_TYPE =", value, "fromUserType");
            return (Criteria) this;
        }

        public Criteria andFromUserTypeNotEqualTo(Byte value) {
            addCriterion("FROM_USER_TYPE <>", value, "fromUserType");
            return (Criteria) this;
        }

        public Criteria andFromUserTypeGreaterThan(Byte value) {
            addCriterion("FROM_USER_TYPE >", value, "fromUserType");
            return (Criteria) this;
        }

        public Criteria andFromUserTypeGreaterThanOrEqualTo(Byte value) {
            addCriterion("FROM_USER_TYPE >=", value, "fromUserType");
            return (Criteria) this;
        }

        public Criteria andFromUserTypeLessThan(Byte value) {
            addCriterion("FROM_USER_TYPE <", value, "fromUserType");
            return (Criteria) this;
        }

        public Criteria andFromUserTypeLessThanOrEqualTo(Byte value) {
            addCriterion("FROM_USER_TYPE <=", value, "fromUserType");
            return (Criteria) this;
        }

        public Criteria andFromUserTypeIn(List<Byte> values) {
            addCriterion("FROM_USER_TYPE in", values, "fromUserType");
            return (Criteria) this;
        }

        public Criteria andFromUserTypeNotIn(List<Byte> values) {
            addCriterion("FROM_USER_TYPE not in", values, "fromUserType");
            return (Criteria) this;
        }

        public Criteria andFromUserTypeBetween(Byte value1, Byte value2) {
            addCriterion("FROM_USER_TYPE between", value1, value2, "fromUserType");
            return (Criteria) this;
        }

        public Criteria andFromUserTypeNotBetween(Byte value1, Byte value2) {
            addCriterion("FROM_USER_TYPE not between", value1, value2, "fromUserType");
            return (Criteria) this;
        }

        public Criteria andToUserIdIsNull() {
            addCriterion("TO_USER_ID is null");
            return (Criteria) this;
        }

        public Criteria andToUserIdIsNotNull() {
            addCriterion("TO_USER_ID is not null");
            return (Criteria) this;
        }

        public Criteria andToUserIdEqualTo(Long value) {
            addCriterion("TO_USER_ID =", value, "toUserId");
            return (Criteria) this;
        }

        public Criteria andToUserIdNotEqualTo(Long value) {
            addCriterion("TO_USER_ID <>", value, "toUserId");
            return (Criteria) this;
        }

        public Criteria andToUserIdGreaterThan(Long value) {
            addCriterion("TO_USER_ID >", value, "toUserId");
            return (Criteria) this;
        }

        public Criteria andToUserIdGreaterThanOrEqualTo(Long value) {
            addCriterion("TO_USER_ID >=", value, "toUserId");
            return (Criteria) this;
        }

        public Criteria andToUserIdLessThan(Long value) {
            addCriterion("TO_USER_ID <", value, "toUserId");
            return (Criteria) this;
        }

        public Criteria andToUserIdLessThanOrEqualTo(Long value) {
            addCriterion("TO_USER_ID <=", value, "toUserId");
            return (Criteria) this;
        }

        public Criteria andToUserIdIn(List<Long> values) {
            addCriterion("TO_USER_ID in", values, "toUserId");
            return (Criteria) this;
        }

        public Criteria andToUserIdNotIn(List<Long> values) {
            addCriterion("TO_USER_ID not in", values, "toUserId");
            return (Criteria) this;
        }

        public Criteria andToUserIdBetween(Long value1, Long value2) {
            addCriterion("TO_USER_ID between", value1, value2, "toUserId");
            return (Criteria) this;
        }

        public Criteria andToUserIdNotBetween(Long value1, Long value2) {
            addCriterion("TO_USER_ID not between", value1, value2, "toUserId");
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