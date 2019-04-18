package com.shcp.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class DeveloperInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DeveloperInfoExample() {
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

        public Criteria andDfidIsNull() {
            addCriterion("DFID is null");
            return (Criteria) this;
        }

        public Criteria andDfidIsNotNull() {
            addCriterion("DFID is not null");
            return (Criteria) this;
        }

        public Criteria andDfidEqualTo(Long value) {
            addCriterion("DFID =", value, "dfid");
            return (Criteria) this;
        }

        public Criteria andDfidNotEqualTo(Long value) {
            addCriterion("DFID <>", value, "dfid");
            return (Criteria) this;
        }

        public Criteria andDfidGreaterThan(Long value) {
            addCriterion("DFID >", value, "dfid");
            return (Criteria) this;
        }

        public Criteria andDfidGreaterThanOrEqualTo(Long value) {
            addCriterion("DFID >=", value, "dfid");
            return (Criteria) this;
        }

        public Criteria andDfidLessThan(Long value) {
            addCriterion("DFID <", value, "dfid");
            return (Criteria) this;
        }

        public Criteria andDfidLessThanOrEqualTo(Long value) {
            addCriterion("DFID <=", value, "dfid");
            return (Criteria) this;
        }

        public Criteria andDfidIn(List<Long> values) {
            addCriterion("DFID in", values, "dfid");
            return (Criteria) this;
        }

        public Criteria andDfidNotIn(List<Long> values) {
            addCriterion("DFID not in", values, "dfid");
            return (Criteria) this;
        }

        public Criteria andDfidBetween(Long value1, Long value2) {
            addCriterion("DFID between", value1, value2, "dfid");
            return (Criteria) this;
        }

        public Criteria andDfidNotBetween(Long value1, Long value2) {
            addCriterion("DFID not between", value1, value2, "dfid");
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

        public Criteria andAidIsNull() {
            addCriterion("AID is null");
            return (Criteria) this;
        }

        public Criteria andAidIsNotNull() {
            addCriterion("AID is not null");
            return (Criteria) this;
        }

        public Criteria andAidEqualTo(Long value) {
            addCriterion("AID =", value, "aid");
            return (Criteria) this;
        }

        public Criteria andAidNotEqualTo(Long value) {
            addCriterion("AID <>", value, "aid");
            return (Criteria) this;
        }

        public Criteria andAidGreaterThan(Long value) {
            addCriterion("AID >", value, "aid");
            return (Criteria) this;
        }

        public Criteria andAidGreaterThanOrEqualTo(Long value) {
            addCriterion("AID >=", value, "aid");
            return (Criteria) this;
        }

        public Criteria andAidLessThan(Long value) {
            addCriterion("AID <", value, "aid");
            return (Criteria) this;
        }

        public Criteria andAidLessThanOrEqualTo(Long value) {
            addCriterion("AID <=", value, "aid");
            return (Criteria) this;
        }

        public Criteria andAidIn(List<Long> values) {
            addCriterion("AID in", values, "aid");
            return (Criteria) this;
        }

        public Criteria andAidNotIn(List<Long> values) {
            addCriterion("AID not in", values, "aid");
            return (Criteria) this;
        }

        public Criteria andAidBetween(Long value1, Long value2) {
            addCriterion("AID between", value1, value2, "aid");
            return (Criteria) this;
        }

        public Criteria andAidNotBetween(Long value1, Long value2) {
            addCriterion("AID not between", value1, value2, "aid");
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

        public Criteria andCertificatetypeIsNull() {
            addCriterion("CERTIFICATETYPE is null");
            return (Criteria) this;
        }

        public Criteria andCertificatetypeIsNotNull() {
            addCriterion("CERTIFICATETYPE is not null");
            return (Criteria) this;
        }

        public Criteria andCertificatetypeEqualTo(String value) {
            addCriterion("CERTIFICATETYPE =", value, "certificatetype");
            return (Criteria) this;
        }

        public Criteria andCertificatetypeNotEqualTo(String value) {
            addCriterion("CERTIFICATETYPE <>", value, "certificatetype");
            return (Criteria) this;
        }

        public Criteria andCertificatetypeGreaterThan(String value) {
            addCriterion("CERTIFICATETYPE >", value, "certificatetype");
            return (Criteria) this;
        }

        public Criteria andCertificatetypeGreaterThanOrEqualTo(String value) {
            addCriterion("CERTIFICATETYPE >=", value, "certificatetype");
            return (Criteria) this;
        }

        public Criteria andCertificatetypeLessThan(String value) {
            addCriterion("CERTIFICATETYPE <", value, "certificatetype");
            return (Criteria) this;
        }

        public Criteria andCertificatetypeLessThanOrEqualTo(String value) {
            addCriterion("CERTIFICATETYPE <=", value, "certificatetype");
            return (Criteria) this;
        }

        public Criteria andCertificatetypeLike(String value) {
            addCriterion("CERTIFICATETYPE like", value, "certificatetype");
            return (Criteria) this;
        }

        public Criteria andCertificatetypeNotLike(String value) {
            addCriterion("CERTIFICATETYPE not like", value, "certificatetype");
            return (Criteria) this;
        }

        public Criteria andCertificatetypeIn(List<String> values) {
            addCriterion("CERTIFICATETYPE in", values, "certificatetype");
            return (Criteria) this;
        }

        public Criteria andCertificatetypeNotIn(List<String> values) {
            addCriterion("CERTIFICATETYPE not in", values, "certificatetype");
            return (Criteria) this;
        }

        public Criteria andCertificatetypeBetween(String value1, String value2) {
            addCriterion("CERTIFICATETYPE between", value1, value2, "certificatetype");
            return (Criteria) this;
        }

        public Criteria andCertificatetypeNotBetween(String value1, String value2) {
            addCriterion("CERTIFICATETYPE not between", value1, value2, "certificatetype");
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

        public Criteria andPositiveimgIsNull() {
            addCriterion("POSITIVEIMG is null");
            return (Criteria) this;
        }

        public Criteria andPositiveimgIsNotNull() {
            addCriterion("POSITIVEIMG is not null");
            return (Criteria) this;
        }

        public Criteria andPositiveimgEqualTo(String value) {
            addCriterion("POSITIVEIMG =", value, "positiveimg");
            return (Criteria) this;
        }

        public Criteria andPositiveimgNotEqualTo(String value) {
            addCriterion("POSITIVEIMG <>", value, "positiveimg");
            return (Criteria) this;
        }

        public Criteria andPositiveimgGreaterThan(String value) {
            addCriterion("POSITIVEIMG >", value, "positiveimg");
            return (Criteria) this;
        }

        public Criteria andPositiveimgGreaterThanOrEqualTo(String value) {
            addCriterion("POSITIVEIMG >=", value, "positiveimg");
            return (Criteria) this;
        }

        public Criteria andPositiveimgLessThan(String value) {
            addCriterion("POSITIVEIMG <", value, "positiveimg");
            return (Criteria) this;
        }

        public Criteria andPositiveimgLessThanOrEqualTo(String value) {
            addCriterion("POSITIVEIMG <=", value, "positiveimg");
            return (Criteria) this;
        }

        public Criteria andPositiveimgLike(String value) {
            addCriterion("POSITIVEIMG like", value, "positiveimg");
            return (Criteria) this;
        }

        public Criteria andPositiveimgNotLike(String value) {
            addCriterion("POSITIVEIMG not like", value, "positiveimg");
            return (Criteria) this;
        }

        public Criteria andPositiveimgIn(List<String> values) {
            addCriterion("POSITIVEIMG in", values, "positiveimg");
            return (Criteria) this;
        }

        public Criteria andPositiveimgNotIn(List<String> values) {
            addCriterion("POSITIVEIMG not in", values, "positiveimg");
            return (Criteria) this;
        }

        public Criteria andPositiveimgBetween(String value1, String value2) {
            addCriterion("POSITIVEIMG between", value1, value2, "positiveimg");
            return (Criteria) this;
        }

        public Criteria andPositiveimgNotBetween(String value1, String value2) {
            addCriterion("POSITIVEIMG not between", value1, value2, "positiveimg");
            return (Criteria) this;
        }

        public Criteria andNegitiveimgIsNull() {
            addCriterion("NEGITIVEIMG is null");
            return (Criteria) this;
        }

        public Criteria andNegitiveimgIsNotNull() {
            addCriterion("NEGITIVEIMG is not null");
            return (Criteria) this;
        }

        public Criteria andNegitiveimgEqualTo(String value) {
            addCriterion("NEGITIVEIMG =", value, "negitiveimg");
            return (Criteria) this;
        }

        public Criteria andNegitiveimgNotEqualTo(String value) {
            addCriterion("NEGITIVEIMG <>", value, "negitiveimg");
            return (Criteria) this;
        }

        public Criteria andNegitiveimgGreaterThan(String value) {
            addCriterion("NEGITIVEIMG >", value, "negitiveimg");
            return (Criteria) this;
        }

        public Criteria andNegitiveimgGreaterThanOrEqualTo(String value) {
            addCriterion("NEGITIVEIMG >=", value, "negitiveimg");
            return (Criteria) this;
        }

        public Criteria andNegitiveimgLessThan(String value) {
            addCriterion("NEGITIVEIMG <", value, "negitiveimg");
            return (Criteria) this;
        }

        public Criteria andNegitiveimgLessThanOrEqualTo(String value) {
            addCriterion("NEGITIVEIMG <=", value, "negitiveimg");
            return (Criteria) this;
        }

        public Criteria andNegitiveimgLike(String value) {
            addCriterion("NEGITIVEIMG like", value, "negitiveimg");
            return (Criteria) this;
        }

        public Criteria andNegitiveimgNotLike(String value) {
            addCriterion("NEGITIVEIMG not like", value, "negitiveimg");
            return (Criteria) this;
        }

        public Criteria andNegitiveimgIn(List<String> values) {
            addCriterion("NEGITIVEIMG in", values, "negitiveimg");
            return (Criteria) this;
        }

        public Criteria andNegitiveimgNotIn(List<String> values) {
            addCriterion("NEGITIVEIMG not in", values, "negitiveimg");
            return (Criteria) this;
        }

        public Criteria andNegitiveimgBetween(String value1, String value2) {
            addCriterion("NEGITIVEIMG between", value1, value2, "negitiveimg");
            return (Criteria) this;
        }

        public Criteria andNegitiveimgNotBetween(String value1, String value2) {
            addCriterion("NEGITIVEIMG not between", value1, value2, "negitiveimg");
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