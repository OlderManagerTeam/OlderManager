package com.sds.em.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class OlderbaseExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public OlderbaseExample() {
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

        public Criteria andOlderidIsNull() {
            addCriterion("olderId is null");
            return (Criteria) this;
        }

        public Criteria andOlderidIsNotNull() {
            addCriterion("olderId is not null");
            return (Criteria) this;
        }

        public Criteria andOlderidEqualTo(Integer value) {
            addCriterion("olderId =", value, "olderid");
            return (Criteria) this;
        }

        public Criteria andOlderidNotEqualTo(Integer value) {
            addCriterion("olderId <>", value, "olderid");
            return (Criteria) this;
        }

        public Criteria andOlderidGreaterThan(Integer value) {
            addCriterion("olderId >", value, "olderid");
            return (Criteria) this;
        }

        public Criteria andOlderidGreaterThanOrEqualTo(Integer value) {
            addCriterion("olderId >=", value, "olderid");
            return (Criteria) this;
        }

        public Criteria andOlderidLessThan(Integer value) {
            addCriterion("olderId <", value, "olderid");
            return (Criteria) this;
        }

        public Criteria andOlderidLessThanOrEqualTo(Integer value) {
            addCriterion("olderId <=", value, "olderid");
            return (Criteria) this;
        }

        public Criteria andOlderidIn(List<Integer> values) {
            addCriterion("olderId in", values, "olderid");
            return (Criteria) this;
        }

        public Criteria andOlderidNotIn(List<Integer> values) {
            addCriterion("olderId not in", values, "olderid");
            return (Criteria) this;
        }

        public Criteria andOlderidBetween(Integer value1, Integer value2) {
            addCriterion("olderId between", value1, value2, "olderid");
            return (Criteria) this;
        }

        public Criteria andOlderidNotBetween(Integer value1, Integer value2) {
            addCriterion("olderId not between", value1, value2, "olderid");
            return (Criteria) this;
        }

        public Criteria andOldernameIsNull() {
            addCriterion("olderName is null");
            return (Criteria) this;
        }

        public Criteria andOldernameIsNotNull() {
            addCriterion("olderName is not null");
            return (Criteria) this;
        }

        public Criteria andOldernameEqualTo(String value) {
            addCriterion("olderName =", value, "oldername");
            return (Criteria) this;
        }

        public Criteria andOldernameNotEqualTo(String value) {
            addCriterion("olderName <>", value, "oldername");
            return (Criteria) this;
        }

        public Criteria andOldernameGreaterThan(String value) {
            addCriterion("olderName >", value, "oldername");
            return (Criteria) this;
        }

        public Criteria andOldernameGreaterThanOrEqualTo(String value) {
            addCriterion("olderName >=", value, "oldername");
            return (Criteria) this;
        }

        public Criteria andOldernameLessThan(String value) {
            addCriterion("olderName <", value, "oldername");
            return (Criteria) this;
        }

        public Criteria andOldernameLessThanOrEqualTo(String value) {
            addCriterion("olderName <=", value, "oldername");
            return (Criteria) this;
        }

        public Criteria andOldernameLike(String value) {
            addCriterion("olderName like", value, "oldername");
            return (Criteria) this;
        }

        public Criteria andOldernameNotLike(String value) {
            addCriterion("olderName not like", value, "oldername");
            return (Criteria) this;
        }

        public Criteria andOldernameIn(List<String> values) {
            addCriterion("olderName in", values, "oldername");
            return (Criteria) this;
        }

        public Criteria andOldernameNotIn(List<String> values) {
            addCriterion("olderName not in", values, "oldername");
            return (Criteria) this;
        }

        public Criteria andOldernameBetween(String value1, String value2) {
            addCriterion("olderName between", value1, value2, "oldername");
            return (Criteria) this;
        }

        public Criteria andOldernameNotBetween(String value1, String value2) {
            addCriterion("olderName not between", value1, value2, "oldername");
            return (Criteria) this;
        }

        public Criteria andOldersexIsNull() {
            addCriterion("olderSex is null");
            return (Criteria) this;
        }

        public Criteria andOldersexIsNotNull() {
            addCriterion("olderSex is not null");
            return (Criteria) this;
        }

        public Criteria andOldersexEqualTo(String value) {
            addCriterion("olderSex =", value, "oldersex");
            return (Criteria) this;
        }

        public Criteria andOldersexNotEqualTo(String value) {
            addCriterion("olderSex <>", value, "oldersex");
            return (Criteria) this;
        }

        public Criteria andOldersexGreaterThan(String value) {
            addCriterion("olderSex >", value, "oldersex");
            return (Criteria) this;
        }

        public Criteria andOldersexGreaterThanOrEqualTo(String value) {
            addCriterion("olderSex >=", value, "oldersex");
            return (Criteria) this;
        }

        public Criteria andOldersexLessThan(String value) {
            addCriterion("olderSex <", value, "oldersex");
            return (Criteria) this;
        }

        public Criteria andOldersexLessThanOrEqualTo(String value) {
            addCriterion("olderSex <=", value, "oldersex");
            return (Criteria) this;
        }

        public Criteria andOldersexLike(String value) {
            addCriterion("olderSex like", value, "oldersex");
            return (Criteria) this;
        }

        public Criteria andOldersexNotLike(String value) {
            addCriterion("olderSex not like", value, "oldersex");
            return (Criteria) this;
        }

        public Criteria andOldersexIn(List<String> values) {
            addCriterion("olderSex in", values, "oldersex");
            return (Criteria) this;
        }

        public Criteria andOldersexNotIn(List<String> values) {
            addCriterion("olderSex not in", values, "oldersex");
            return (Criteria) this;
        }

        public Criteria andOldersexBetween(String value1, String value2) {
            addCriterion("olderSex between", value1, value2, "oldersex");
            return (Criteria) this;
        }

        public Criteria andOldersexNotBetween(String value1, String value2) {
            addCriterion("olderSex not between", value1, value2, "oldersex");
            return (Criteria) this;
        }

        public Criteria andOlderbirthdayIsNull() {
            addCriterion("olderBirthday is null");
            return (Criteria) this;
        }

        public Criteria andOlderbirthdayIsNotNull() {
            addCriterion("olderBirthday is not null");
            return (Criteria) this;
        }

        public Criteria andOlderbirthdayEqualTo(Date value) {
            addCriterionForJDBCDate("olderBirthday =", value, "olderbirthday");
            return (Criteria) this;
        }

        public Criteria andOlderbirthdayNotEqualTo(Date value) {
            addCriterionForJDBCDate("olderBirthday <>", value, "olderbirthday");
            return (Criteria) this;
        }

        public Criteria andOlderbirthdayGreaterThan(Date value) {
            addCriterionForJDBCDate("olderBirthday >", value, "olderbirthday");
            return (Criteria) this;
        }

        public Criteria andOlderbirthdayGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("olderBirthday >=", value, "olderbirthday");
            return (Criteria) this;
        }

        public Criteria andOlderbirthdayLessThan(Date value) {
            addCriterionForJDBCDate("olderBirthday <", value, "olderbirthday");
            return (Criteria) this;
        }

        public Criteria andOlderbirthdayLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("olderBirthday <=", value, "olderbirthday");
            return (Criteria) this;
        }

        public Criteria andOlderbirthdayIn(List<Date> values) {
            addCriterionForJDBCDate("olderBirthday in", values, "olderbirthday");
            return (Criteria) this;
        }

        public Criteria andOlderbirthdayNotIn(List<Date> values) {
            addCriterionForJDBCDate("olderBirthday not in", values, "olderbirthday");
            return (Criteria) this;
        }

        public Criteria andOlderbirthdayBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("olderBirthday between", value1, value2, "olderbirthday");
            return (Criteria) this;
        }

        public Criteria andOlderbirthdayNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("olderBirthday not between", value1, value2, "olderbirthday");
            return (Criteria) this;
        }

        public Criteria andOlderpasswordIsNull() {
            addCriterion("olderPassword is null");
            return (Criteria) this;
        }

        public Criteria andOlderpasswordIsNotNull() {
            addCriterion("olderPassword is not null");
            return (Criteria) this;
        }

        public Criteria andOlderpasswordEqualTo(String value) {
            addCriterion("olderPassword =", value, "olderpassword");
            return (Criteria) this;
        }

        public Criteria andOlderpasswordNotEqualTo(String value) {
            addCriterion("olderPassword <>", value, "olderpassword");
            return (Criteria) this;
        }

        public Criteria andOlderpasswordGreaterThan(String value) {
            addCriterion("olderPassword >", value, "olderpassword");
            return (Criteria) this;
        }

        public Criteria andOlderpasswordGreaterThanOrEqualTo(String value) {
            addCriterion("olderPassword >=", value, "olderpassword");
            return (Criteria) this;
        }

        public Criteria andOlderpasswordLessThan(String value) {
            addCriterion("olderPassword <", value, "olderpassword");
            return (Criteria) this;
        }

        public Criteria andOlderpasswordLessThanOrEqualTo(String value) {
            addCriterion("olderPassword <=", value, "olderpassword");
            return (Criteria) this;
        }

        public Criteria andOlderpasswordLike(String value) {
            addCriterion("olderPassword like", value, "olderpassword");
            return (Criteria) this;
        }

        public Criteria andOlderpasswordNotLike(String value) {
            addCriterion("olderPassword not like", value, "olderpassword");
            return (Criteria) this;
        }

        public Criteria andOlderpasswordIn(List<String> values) {
            addCriterion("olderPassword in", values, "olderpassword");
            return (Criteria) this;
        }

        public Criteria andOlderpasswordNotIn(List<String> values) {
            addCriterion("olderPassword not in", values, "olderpassword");
            return (Criteria) this;
        }

        public Criteria andOlderpasswordBetween(String value1, String value2) {
            addCriterion("olderPassword between", value1, value2, "olderpassword");
            return (Criteria) this;
        }

        public Criteria andOlderpasswordNotBetween(String value1, String value2) {
            addCriterion("olderPassword not between", value1, value2, "olderpassword");
            return (Criteria) this;
        }

        public Criteria andOldertelIsNull() {
            addCriterion("olderTel is null");
            return (Criteria) this;
        }

        public Criteria andOldertelIsNotNull() {
            addCriterion("olderTel is not null");
            return (Criteria) this;
        }

        public Criteria andOldertelEqualTo(String value) {
            addCriterion("olderTel =", value, "oldertel");
            return (Criteria) this;
        }

        public Criteria andOldertelNotEqualTo(String value) {
            addCriterion("olderTel <>", value, "oldertel");
            return (Criteria) this;
        }

        public Criteria andOldertelGreaterThan(String value) {
            addCriterion("olderTel >", value, "oldertel");
            return (Criteria) this;
        }

        public Criteria andOldertelGreaterThanOrEqualTo(String value) {
            addCriterion("olderTel >=", value, "oldertel");
            return (Criteria) this;
        }

        public Criteria andOldertelLessThan(String value) {
            addCriterion("olderTel <", value, "oldertel");
            return (Criteria) this;
        }

        public Criteria andOldertelLessThanOrEqualTo(String value) {
            addCriterion("olderTel <=", value, "oldertel");
            return (Criteria) this;
        }

        public Criteria andOldertelLike(String value) {
            addCriterion("olderTel like", value, "oldertel");
            return (Criteria) this;
        }

        public Criteria andOldertelNotLike(String value) {
            addCriterion("olderTel not like", value, "oldertel");
            return (Criteria) this;
        }

        public Criteria andOldertelIn(List<String> values) {
            addCriterion("olderTel in", values, "oldertel");
            return (Criteria) this;
        }

        public Criteria andOldertelNotIn(List<String> values) {
            addCriterion("olderTel not in", values, "oldertel");
            return (Criteria) this;
        }

        public Criteria andOldertelBetween(String value1, String value2) {
            addCriterion("olderTel between", value1, value2, "oldertel");
            return (Criteria) this;
        }

        public Criteria andOldertelNotBetween(String value1, String value2) {
            addCriterion("olderTel not between", value1, value2, "oldertel");
            return (Criteria) this;
        }

        public Criteria andOlderaddressIsNull() {
            addCriterion("olderAddress is null");
            return (Criteria) this;
        }

        public Criteria andOlderaddressIsNotNull() {
            addCriterion("olderAddress is not null");
            return (Criteria) this;
        }

        public Criteria andOlderaddressEqualTo(String value) {
            addCriterion("olderAddress =", value, "olderaddress");
            return (Criteria) this;
        }

        public Criteria andOlderaddressNotEqualTo(String value) {
            addCriterion("olderAddress <>", value, "olderaddress");
            return (Criteria) this;
        }

        public Criteria andOlderaddressGreaterThan(String value) {
            addCriterion("olderAddress >", value, "olderaddress");
            return (Criteria) this;
        }

        public Criteria andOlderaddressGreaterThanOrEqualTo(String value) {
            addCriterion("olderAddress >=", value, "olderaddress");
            return (Criteria) this;
        }

        public Criteria andOlderaddressLessThan(String value) {
            addCriterion("olderAddress <", value, "olderaddress");
            return (Criteria) this;
        }

        public Criteria andOlderaddressLessThanOrEqualTo(String value) {
            addCriterion("olderAddress <=", value, "olderaddress");
            return (Criteria) this;
        }

        public Criteria andOlderaddressLike(String value) {
            addCriterion("olderAddress like", value, "olderaddress");
            return (Criteria) this;
        }

        public Criteria andOlderaddressNotLike(String value) {
            addCriterion("olderAddress not like", value, "olderaddress");
            return (Criteria) this;
        }

        public Criteria andOlderaddressIn(List<String> values) {
            addCriterion("olderAddress in", values, "olderaddress");
            return (Criteria) this;
        }

        public Criteria andOlderaddressNotIn(List<String> values) {
            addCriterion("olderAddress not in", values, "olderaddress");
            return (Criteria) this;
        }

        public Criteria andOlderaddressBetween(String value1, String value2) {
            addCriterion("olderAddress between", value1, value2, "olderaddress");
            return (Criteria) this;
        }

        public Criteria andOlderaddressNotBetween(String value1, String value2) {
            addCriterion("olderAddress not between", value1, value2, "olderaddress");
            return (Criteria) this;
        }

        public Criteria andOldersinglestatusIsNull() {
            addCriterion("olderSingleStatus is null");
            return (Criteria) this;
        }

        public Criteria andOldersinglestatusIsNotNull() {
            addCriterion("olderSingleStatus is not null");
            return (Criteria) this;
        }

        public Criteria andOldersinglestatusEqualTo(String value) {
            addCriterion("olderSingleStatus =", value, "oldersinglestatus");
            return (Criteria) this;
        }

        public Criteria andOldersinglestatusNotEqualTo(String value) {
            addCriterion("olderSingleStatus <>", value, "oldersinglestatus");
            return (Criteria) this;
        }

        public Criteria andOldersinglestatusGreaterThan(String value) {
            addCriterion("olderSingleStatus >", value, "oldersinglestatus");
            return (Criteria) this;
        }

        public Criteria andOldersinglestatusGreaterThanOrEqualTo(String value) {
            addCriterion("olderSingleStatus >=", value, "oldersinglestatus");
            return (Criteria) this;
        }

        public Criteria andOldersinglestatusLessThan(String value) {
            addCriterion("olderSingleStatus <", value, "oldersinglestatus");
            return (Criteria) this;
        }

        public Criteria andOldersinglestatusLessThanOrEqualTo(String value) {
            addCriterion("olderSingleStatus <=", value, "oldersinglestatus");
            return (Criteria) this;
        }

        public Criteria andOldersinglestatusLike(String value) {
            addCriterion("olderSingleStatus like", value, "oldersinglestatus");
            return (Criteria) this;
        }

        public Criteria andOldersinglestatusNotLike(String value) {
            addCriterion("olderSingleStatus not like", value, "oldersinglestatus");
            return (Criteria) this;
        }

        public Criteria andOldersinglestatusIn(List<String> values) {
            addCriterion("olderSingleStatus in", values, "oldersinglestatus");
            return (Criteria) this;
        }

        public Criteria andOldersinglestatusNotIn(List<String> values) {
            addCriterion("olderSingleStatus not in", values, "oldersinglestatus");
            return (Criteria) this;
        }

        public Criteria andOldersinglestatusBetween(String value1, String value2) {
            addCriterion("olderSingleStatus between", value1, value2, "oldersinglestatus");
            return (Criteria) this;
        }

        public Criteria andOldersinglestatusNotBetween(String value1, String value2) {
            addCriterion("olderSingleStatus not between", value1, value2, "oldersinglestatus");
            return (Criteria) this;
        }

        public Criteria andOlderideIsNull() {
            addCriterion("olderIDE is null");
            return (Criteria) this;
        }

        public Criteria andOlderideIsNotNull() {
            addCriterion("olderIDE is not null");
            return (Criteria) this;
        }

        public Criteria andOlderideEqualTo(String value) {
            addCriterion("olderIDE =", value, "olderide");
            return (Criteria) this;
        }

        public Criteria andOlderideNotEqualTo(String value) {
            addCriterion("olderIDE <>", value, "olderide");
            return (Criteria) this;
        }

        public Criteria andOlderideGreaterThan(String value) {
            addCriterion("olderIDE >", value, "olderide");
            return (Criteria) this;
        }

        public Criteria andOlderideGreaterThanOrEqualTo(String value) {
            addCriterion("olderIDE >=", value, "olderide");
            return (Criteria) this;
        }

        public Criteria andOlderideLessThan(String value) {
            addCriterion("olderIDE <", value, "olderide");
            return (Criteria) this;
        }

        public Criteria andOlderideLessThanOrEqualTo(String value) {
            addCriterion("olderIDE <=", value, "olderide");
            return (Criteria) this;
        }

        public Criteria andOlderideLike(String value) {
            addCriterion("olderIDE like", value, "olderide");
            return (Criteria) this;
        }

        public Criteria andOlderideNotLike(String value) {
            addCriterion("olderIDE not like", value, "olderide");
            return (Criteria) this;
        }

        public Criteria andOlderideIn(List<String> values) {
            addCriterion("olderIDE in", values, "olderide");
            return (Criteria) this;
        }

        public Criteria andOlderideNotIn(List<String> values) {
            addCriterion("olderIDE not in", values, "olderide");
            return (Criteria) this;
        }

        public Criteria andOlderideBetween(String value1, String value2) {
            addCriterion("olderIDE between", value1, value2, "olderide");
            return (Criteria) this;
        }

        public Criteria andOlderideNotBetween(String value1, String value2) {
            addCriterion("olderIDE not between", value1, value2, "olderide");
            return (Criteria) this;
        }

        public Criteria andOldernationIsNull() {
            addCriterion("olderNation is null");
            return (Criteria) this;
        }

        public Criteria andOldernationIsNotNull() {
            addCriterion("olderNation is not null");
            return (Criteria) this;
        }

        public Criteria andOldernationEqualTo(String value) {
            addCriterion("olderNation =", value, "oldernation");
            return (Criteria) this;
        }

        public Criteria andOldernationNotEqualTo(String value) {
            addCriterion("olderNation <>", value, "oldernation");
            return (Criteria) this;
        }

        public Criteria andOldernationGreaterThan(String value) {
            addCriterion("olderNation >", value, "oldernation");
            return (Criteria) this;
        }

        public Criteria andOldernationGreaterThanOrEqualTo(String value) {
            addCriterion("olderNation >=", value, "oldernation");
            return (Criteria) this;
        }

        public Criteria andOldernationLessThan(String value) {
            addCriterion("olderNation <", value, "oldernation");
            return (Criteria) this;
        }

        public Criteria andOldernationLessThanOrEqualTo(String value) {
            addCriterion("olderNation <=", value, "oldernation");
            return (Criteria) this;
        }

        public Criteria andOldernationLike(String value) {
            addCriterion("olderNation like", value, "oldernation");
            return (Criteria) this;
        }

        public Criteria andOldernationNotLike(String value) {
            addCriterion("olderNation not like", value, "oldernation");
            return (Criteria) this;
        }

        public Criteria andOldernationIn(List<String> values) {
            addCriterion("olderNation in", values, "oldernation");
            return (Criteria) this;
        }

        public Criteria andOldernationNotIn(List<String> values) {
            addCriterion("olderNation not in", values, "oldernation");
            return (Criteria) this;
        }

        public Criteria andOldernationBetween(String value1, String value2) {
            addCriterion("olderNation between", value1, value2, "oldernation");
            return (Criteria) this;
        }

        public Criteria andOldernationNotBetween(String value1, String value2) {
            addCriterion("olderNation not between", value1, value2, "oldernation");
            return (Criteria) this;
        }

        public Criteria andOlderheadurlIsNull() {
            addCriterion("olderHeadUrl is null");
            return (Criteria) this;
        }

        public Criteria andOlderheadurlIsNotNull() {
            addCriterion("olderHeadUrl is not null");
            return (Criteria) this;
        }

        public Criteria andOlderheadurlEqualTo(String value) {
            addCriterion("olderHeadUrl =", value, "olderheadurl");
            return (Criteria) this;
        }

        public Criteria andOlderheadurlNotEqualTo(String value) {
            addCriterion("olderHeadUrl <>", value, "olderheadurl");
            return (Criteria) this;
        }

        public Criteria andOlderheadurlGreaterThan(String value) {
            addCriterion("olderHeadUrl >", value, "olderheadurl");
            return (Criteria) this;
        }

        public Criteria andOlderheadurlGreaterThanOrEqualTo(String value) {
            addCriterion("olderHeadUrl >=", value, "olderheadurl");
            return (Criteria) this;
        }

        public Criteria andOlderheadurlLessThan(String value) {
            addCriterion("olderHeadUrl <", value, "olderheadurl");
            return (Criteria) this;
        }

        public Criteria andOlderheadurlLessThanOrEqualTo(String value) {
            addCriterion("olderHeadUrl <=", value, "olderheadurl");
            return (Criteria) this;
        }

        public Criteria andOlderheadurlLike(String value) {
            addCriterion("olderHeadUrl like", value, "olderheadurl");
            return (Criteria) this;
        }

        public Criteria andOlderheadurlNotLike(String value) {
            addCriterion("olderHeadUrl not like", value, "olderheadurl");
            return (Criteria) this;
        }

        public Criteria andOlderheadurlIn(List<String> values) {
            addCriterion("olderHeadUrl in", values, "olderheadurl");
            return (Criteria) this;
        }

        public Criteria andOlderheadurlNotIn(List<String> values) {
            addCriterion("olderHeadUrl not in", values, "olderheadurl");
            return (Criteria) this;
        }

        public Criteria andOlderheadurlBetween(String value1, String value2) {
            addCriterion("olderHeadUrl between", value1, value2, "olderheadurl");
            return (Criteria) this;
        }

        public Criteria andOlderheadurlNotBetween(String value1, String value2) {
            addCriterion("olderHeadUrl not between", value1, value2, "olderheadurl");
            return (Criteria) this;
        }

        public Criteria andOlderpointIsNull() {
            addCriterion("olderPoint is null");
            return (Criteria) this;
        }

        public Criteria andOlderpointIsNotNull() {
            addCriterion("olderPoint is not null");
            return (Criteria) this;
        }

        public Criteria andOlderpointEqualTo(Integer value) {
            addCriterion("olderPoint =", value, "olderpoint");
            return (Criteria) this;
        }

        public Criteria andOlderpointNotEqualTo(Integer value) {
            addCriterion("olderPoint <>", value, "olderpoint");
            return (Criteria) this;
        }

        public Criteria andOlderpointGreaterThan(Integer value) {
            addCriterion("olderPoint >", value, "olderpoint");
            return (Criteria) this;
        }

        public Criteria andOlderpointGreaterThanOrEqualTo(Integer value) {
            addCriterion("olderPoint >=", value, "olderpoint");
            return (Criteria) this;
        }

        public Criteria andOlderpointLessThan(Integer value) {
            addCriterion("olderPoint <", value, "olderpoint");
            return (Criteria) this;
        }

        public Criteria andOlderpointLessThanOrEqualTo(Integer value) {
            addCriterion("olderPoint <=", value, "olderpoint");
            return (Criteria) this;
        }

        public Criteria andOlderpointIn(List<Integer> values) {
            addCriterion("olderPoint in", values, "olderpoint");
            return (Criteria) this;
        }

        public Criteria andOlderpointNotIn(List<Integer> values) {
            addCriterion("olderPoint not in", values, "olderpoint");
            return (Criteria) this;
        }

        public Criteria andOlderpointBetween(Integer value1, Integer value2) {
            addCriterion("olderPoint between", value1, value2, "olderpoint");
            return (Criteria) this;
        }

        public Criteria andOlderpointNotBetween(Integer value1, Integer value2) {
            addCriterion("olderPoint not between", value1, value2, "olderpoint");
            return (Criteria) this;
        }

        public Criteria andOlderbranchidIsNull() {
            addCriterion("olderBranchId is null");
            return (Criteria) this;
        }

        public Criteria andOlderbranchidIsNotNull() {
            addCriterion("olderBranchId is not null");
            return (Criteria) this;
        }

        public Criteria andOlderbranchidEqualTo(Integer value) {
            addCriterion("olderBranchId =", value, "olderbranchid");
            return (Criteria) this;
        }

        public Criteria andOlderbranchidNotEqualTo(Integer value) {
            addCriterion("olderBranchId <>", value, "olderbranchid");
            return (Criteria) this;
        }

        public Criteria andOlderbranchidGreaterThan(Integer value) {
            addCriterion("olderBranchId >", value, "olderbranchid");
            return (Criteria) this;
        }

        public Criteria andOlderbranchidGreaterThanOrEqualTo(Integer value) {
            addCriterion("olderBranchId >=", value, "olderbranchid");
            return (Criteria) this;
        }

        public Criteria andOlderbranchidLessThan(Integer value) {
            addCriterion("olderBranchId <", value, "olderbranchid");
            return (Criteria) this;
        }

        public Criteria andOlderbranchidLessThanOrEqualTo(Integer value) {
            addCriterion("olderBranchId <=", value, "olderbranchid");
            return (Criteria) this;
        }

        public Criteria andOlderbranchidIn(List<Integer> values) {
            addCriterion("olderBranchId in", values, "olderbranchid");
            return (Criteria) this;
        }

        public Criteria andOlderbranchidNotIn(List<Integer> values) {
            addCriterion("olderBranchId not in", values, "olderbranchid");
            return (Criteria) this;
        }

        public Criteria andOlderbranchidBetween(Integer value1, Integer value2) {
            addCriterion("olderBranchId between", value1, value2, "olderbranchid");
            return (Criteria) this;
        }

        public Criteria andOlderbranchidNotBetween(Integer value1, Integer value2) {
            addCriterion("olderBranchId not between", value1, value2, "olderbranchid");
            return (Criteria) this;
        }

        public Criteria andOdermaxpointIsNull() {
            addCriterion("oderMaxPoint is null");
            return (Criteria) this;
        }

        public Criteria andOdermaxpointIsNotNull() {
            addCriterion("oderMaxPoint is not null");
            return (Criteria) this;
        }

        public Criteria andOdermaxpointEqualTo(Integer value) {
            addCriterion("oderMaxPoint =", value, "odermaxpoint");
            return (Criteria) this;
        }

        public Criteria andOdermaxpointNotEqualTo(Integer value) {
            addCriterion("oderMaxPoint <>", value, "odermaxpoint");
            return (Criteria) this;
        }

        public Criteria andOdermaxpointGreaterThan(Integer value) {
            addCriterion("oderMaxPoint >", value, "odermaxpoint");
            return (Criteria) this;
        }

        public Criteria andOdermaxpointGreaterThanOrEqualTo(Integer value) {
            addCriterion("oderMaxPoint >=", value, "odermaxpoint");
            return (Criteria) this;
        }

        public Criteria andOdermaxpointLessThan(Integer value) {
            addCriterion("oderMaxPoint <", value, "odermaxpoint");
            return (Criteria) this;
        }

        public Criteria andOdermaxpointLessThanOrEqualTo(Integer value) {
            addCriterion("oderMaxPoint <=", value, "odermaxpoint");
            return (Criteria) this;
        }

        public Criteria andOdermaxpointIn(List<Integer> values) {
            addCriterion("oderMaxPoint in", values, "odermaxpoint");
            return (Criteria) this;
        }

        public Criteria andOdermaxpointNotIn(List<Integer> values) {
            addCriterion("oderMaxPoint not in", values, "odermaxpoint");
            return (Criteria) this;
        }

        public Criteria andOdermaxpointBetween(Integer value1, Integer value2) {
            addCriterion("oderMaxPoint between", value1, value2, "odermaxpoint");
            return (Criteria) this;
        }

        public Criteria andOdermaxpointNotBetween(Integer value1, Integer value2) {
            addCriterion("oderMaxPoint not between", value1, value2, "odermaxpoint");
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