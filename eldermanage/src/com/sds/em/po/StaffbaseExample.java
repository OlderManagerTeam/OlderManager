package com.sds.em.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class StaffbaseExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public StaffbaseExample() {
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

        public Criteria andStaffidIsNull() {
            addCriterion("staffId is null");
            return (Criteria) this;
        }

        public Criteria andStaffidIsNotNull() {
            addCriterion("staffId is not null");
            return (Criteria) this;
        }

        public Criteria andStaffidEqualTo(Integer value) {
            addCriterion("staffId =", value, "staffid");
            return (Criteria) this;
        }

        public Criteria andStaffidNotEqualTo(Integer value) {
            addCriterion("staffId <>", value, "staffid");
            return (Criteria) this;
        }

        public Criteria andStaffidGreaterThan(Integer value) {
            addCriterion("staffId >", value, "staffid");
            return (Criteria) this;
        }

        public Criteria andStaffidGreaterThanOrEqualTo(Integer value) {
            addCriterion("staffId >=", value, "staffid");
            return (Criteria) this;
        }

        public Criteria andStaffidLessThan(Integer value) {
            addCriterion("staffId <", value, "staffid");
            return (Criteria) this;
        }

        public Criteria andStaffidLessThanOrEqualTo(Integer value) {
            addCriterion("staffId <=", value, "staffid");
            return (Criteria) this;
        }

        public Criteria andStaffidIn(List<Integer> values) {
            addCriterion("staffId in", values, "staffid");
            return (Criteria) this;
        }

        public Criteria andStaffidNotIn(List<Integer> values) {
            addCriterion("staffId not in", values, "staffid");
            return (Criteria) this;
        }

        public Criteria andStaffidBetween(Integer value1, Integer value2) {
            addCriterion("staffId between", value1, value2, "staffid");
            return (Criteria) this;
        }

        public Criteria andStaffidNotBetween(Integer value1, Integer value2) {
            addCriterion("staffId not between", value1, value2, "staffid");
            return (Criteria) this;
        }

        public Criteria andStaffnameIsNull() {
            addCriterion("staffName is null");
            return (Criteria) this;
        }

        public Criteria andStaffnameIsNotNull() {
            addCriterion("staffName is not null");
            return (Criteria) this;
        }

        public Criteria andStaffnameEqualTo(String value) {
            addCriterion("staffName =", value, "staffname");
            return (Criteria) this;
        }

        public Criteria andStaffnameNotEqualTo(String value) {
            addCriterion("staffName <>", value, "staffname");
            return (Criteria) this;
        }

        public Criteria andStaffnameGreaterThan(String value) {
            addCriterion("staffName >", value, "staffname");
            return (Criteria) this;
        }

        public Criteria andStaffnameGreaterThanOrEqualTo(String value) {
            addCriterion("staffName >=", value, "staffname");
            return (Criteria) this;
        }

        public Criteria andStaffnameLessThan(String value) {
            addCriterion("staffName <", value, "staffname");
            return (Criteria) this;
        }

        public Criteria andStaffnameLessThanOrEqualTo(String value) {
            addCriterion("staffName <=", value, "staffname");
            return (Criteria) this;
        }

        public Criteria andStaffnameLike(String value) {
            addCriterion("staffName like", value, "staffname");
            return (Criteria) this;
        }

        public Criteria andStaffnameNotLike(String value) {
            addCriterion("staffName not like", value, "staffname");
            return (Criteria) this;
        }

        public Criteria andStaffnameIn(List<String> values) {
            addCriterion("staffName in", values, "staffname");
            return (Criteria) this;
        }

        public Criteria andStaffnameNotIn(List<String> values) {
            addCriterion("staffName not in", values, "staffname");
            return (Criteria) this;
        }

        public Criteria andStaffnameBetween(String value1, String value2) {
            addCriterion("staffName between", value1, value2, "staffname");
            return (Criteria) this;
        }

        public Criteria andStaffnameNotBetween(String value1, String value2) {
            addCriterion("staffName not between", value1, value2, "staffname");
            return (Criteria) this;
        }

        public Criteria andStaffsexIsNull() {
            addCriterion("staffSex is null");
            return (Criteria) this;
        }

        public Criteria andStaffsexIsNotNull() {
            addCriterion("staffSex is not null");
            return (Criteria) this;
        }

        public Criteria andStaffsexEqualTo(String value) {
            addCriterion("staffSex =", value, "staffsex");
            return (Criteria) this;
        }

        public Criteria andStaffsexNotEqualTo(String value) {
            addCriterion("staffSex <>", value, "staffsex");
            return (Criteria) this;
        }

        public Criteria andStaffsexGreaterThan(String value) {
            addCriterion("staffSex >", value, "staffsex");
            return (Criteria) this;
        }

        public Criteria andStaffsexGreaterThanOrEqualTo(String value) {
            addCriterion("staffSex >=", value, "staffsex");
            return (Criteria) this;
        }

        public Criteria andStaffsexLessThan(String value) {
            addCriterion("staffSex <", value, "staffsex");
            return (Criteria) this;
        }

        public Criteria andStaffsexLessThanOrEqualTo(String value) {
            addCriterion("staffSex <=", value, "staffsex");
            return (Criteria) this;
        }

        public Criteria andStaffsexLike(String value) {
            addCriterion("staffSex like", value, "staffsex");
            return (Criteria) this;
        }

        public Criteria andStaffsexNotLike(String value) {
            addCriterion("staffSex not like", value, "staffsex");
            return (Criteria) this;
        }

        public Criteria andStaffsexIn(List<String> values) {
            addCriterion("staffSex in", values, "staffsex");
            return (Criteria) this;
        }

        public Criteria andStaffsexNotIn(List<String> values) {
            addCriterion("staffSex not in", values, "staffsex");
            return (Criteria) this;
        }

        public Criteria andStaffsexBetween(String value1, String value2) {
            addCriterion("staffSex between", value1, value2, "staffsex");
            return (Criteria) this;
        }

        public Criteria andStaffsexNotBetween(String value1, String value2) {
            addCriterion("staffSex not between", value1, value2, "staffsex");
            return (Criteria) this;
        }

        public Criteria andStaffbirthdayIsNull() {
            addCriterion("staffBirthday is null");
            return (Criteria) this;
        }

        public Criteria andStaffbirthdayIsNotNull() {
            addCriterion("staffBirthday is not null");
            return (Criteria) this;
        }

        public Criteria andStaffbirthdayEqualTo(Date value) {
            addCriterionForJDBCDate("staffBirthday =", value, "staffbirthday");
            return (Criteria) this;
        }

        public Criteria andStaffbirthdayNotEqualTo(Date value) {
            addCriterionForJDBCDate("staffBirthday <>", value, "staffbirthday");
            return (Criteria) this;
        }

        public Criteria andStaffbirthdayGreaterThan(Date value) {
            addCriterionForJDBCDate("staffBirthday >", value, "staffbirthday");
            return (Criteria) this;
        }

        public Criteria andStaffbirthdayGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("staffBirthday >=", value, "staffbirthday");
            return (Criteria) this;
        }

        public Criteria andStaffbirthdayLessThan(Date value) {
            addCriterionForJDBCDate("staffBirthday <", value, "staffbirthday");
            return (Criteria) this;
        }

        public Criteria andStaffbirthdayLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("staffBirthday <=", value, "staffbirthday");
            return (Criteria) this;
        }

        public Criteria andStaffbirthdayIn(List<Date> values) {
            addCriterionForJDBCDate("staffBirthday in", values, "staffbirthday");
            return (Criteria) this;
        }

        public Criteria andStaffbirthdayNotIn(List<Date> values) {
            addCriterionForJDBCDate("staffBirthday not in", values, "staffbirthday");
            return (Criteria) this;
        }

        public Criteria andStaffbirthdayBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("staffBirthday between", value1, value2, "staffbirthday");
            return (Criteria) this;
        }

        public Criteria andStaffbirthdayNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("staffBirthday not between", value1, value2, "staffbirthday");
            return (Criteria) this;
        }

        public Criteria andStaffiideIsNull() {
            addCriterion("staffiIDE is null");
            return (Criteria) this;
        }

        public Criteria andStaffiideIsNotNull() {
            addCriterion("staffiIDE is not null");
            return (Criteria) this;
        }

        public Criteria andStaffiideEqualTo(String value) {
            addCriterion("staffiIDE =", value, "staffiide");
            return (Criteria) this;
        }

        public Criteria andStaffiideNotEqualTo(String value) {
            addCriterion("staffiIDE <>", value, "staffiide");
            return (Criteria) this;
        }

        public Criteria andStaffiideGreaterThan(String value) {
            addCriterion("staffiIDE >", value, "staffiide");
            return (Criteria) this;
        }

        public Criteria andStaffiideGreaterThanOrEqualTo(String value) {
            addCriterion("staffiIDE >=", value, "staffiide");
            return (Criteria) this;
        }

        public Criteria andStaffiideLessThan(String value) {
            addCriterion("staffiIDE <", value, "staffiide");
            return (Criteria) this;
        }

        public Criteria andStaffiideLessThanOrEqualTo(String value) {
            addCriterion("staffiIDE <=", value, "staffiide");
            return (Criteria) this;
        }

        public Criteria andStaffiideLike(String value) {
            addCriterion("staffiIDE like", value, "staffiide");
            return (Criteria) this;
        }

        public Criteria andStaffiideNotLike(String value) {
            addCriterion("staffiIDE not like", value, "staffiide");
            return (Criteria) this;
        }

        public Criteria andStaffiideIn(List<String> values) {
            addCriterion("staffiIDE in", values, "staffiide");
            return (Criteria) this;
        }

        public Criteria andStaffiideNotIn(List<String> values) {
            addCriterion("staffiIDE not in", values, "staffiide");
            return (Criteria) this;
        }

        public Criteria andStaffiideBetween(String value1, String value2) {
            addCriterion("staffiIDE between", value1, value2, "staffiide");
            return (Criteria) this;
        }

        public Criteria andStaffiideNotBetween(String value1, String value2) {
            addCriterion("staffiIDE not between", value1, value2, "staffiide");
            return (Criteria) this;
        }

        public Criteria andStafftelIsNull() {
            addCriterion("staffTel is null");
            return (Criteria) this;
        }

        public Criteria andStafftelIsNotNull() {
            addCriterion("staffTel is not null");
            return (Criteria) this;
        }

        public Criteria andStafftelEqualTo(String value) {
            addCriterion("staffTel =", value, "stafftel");
            return (Criteria) this;
        }

        public Criteria andStafftelNotEqualTo(String value) {
            addCriterion("staffTel <>", value, "stafftel");
            return (Criteria) this;
        }

        public Criteria andStafftelGreaterThan(String value) {
            addCriterion("staffTel >", value, "stafftel");
            return (Criteria) this;
        }

        public Criteria andStafftelGreaterThanOrEqualTo(String value) {
            addCriterion("staffTel >=", value, "stafftel");
            return (Criteria) this;
        }

        public Criteria andStafftelLessThan(String value) {
            addCriterion("staffTel <", value, "stafftel");
            return (Criteria) this;
        }

        public Criteria andStafftelLessThanOrEqualTo(String value) {
            addCriterion("staffTel <=", value, "stafftel");
            return (Criteria) this;
        }

        public Criteria andStafftelLike(String value) {
            addCriterion("staffTel like", value, "stafftel");
            return (Criteria) this;
        }

        public Criteria andStafftelNotLike(String value) {
            addCriterion("staffTel not like", value, "stafftel");
            return (Criteria) this;
        }

        public Criteria andStafftelIn(List<String> values) {
            addCriterion("staffTel in", values, "stafftel");
            return (Criteria) this;
        }

        public Criteria andStafftelNotIn(List<String> values) {
            addCriterion("staffTel not in", values, "stafftel");
            return (Criteria) this;
        }

        public Criteria andStafftelBetween(String value1, String value2) {
            addCriterion("staffTel between", value1, value2, "stafftel");
            return (Criteria) this;
        }

        public Criteria andStafftelNotBetween(String value1, String value2) {
            addCriterion("staffTel not between", value1, value2, "stafftel");
            return (Criteria) this;
        }

        public Criteria andStaffcodeIsNull() {
            addCriterion("staffCode is null");
            return (Criteria) this;
        }

        public Criteria andStaffcodeIsNotNull() {
            addCriterion("staffCode is not null");
            return (Criteria) this;
        }

        public Criteria andStaffcodeEqualTo(String value) {
            addCriterion("staffCode =", value, "staffcode");
            return (Criteria) this;
        }

        public Criteria andStaffcodeNotEqualTo(String value) {
            addCriterion("staffCode <>", value, "staffcode");
            return (Criteria) this;
        }

        public Criteria andStaffcodeGreaterThan(String value) {
            addCriterion("staffCode >", value, "staffcode");
            return (Criteria) this;
        }

        public Criteria andStaffcodeGreaterThanOrEqualTo(String value) {
            addCriterion("staffCode >=", value, "staffcode");
            return (Criteria) this;
        }

        public Criteria andStaffcodeLessThan(String value) {
            addCriterion("staffCode <", value, "staffcode");
            return (Criteria) this;
        }

        public Criteria andStaffcodeLessThanOrEqualTo(String value) {
            addCriterion("staffCode <=", value, "staffcode");
            return (Criteria) this;
        }

        public Criteria andStaffcodeLike(String value) {
            addCriterion("staffCode like", value, "staffcode");
            return (Criteria) this;
        }

        public Criteria andStaffcodeNotLike(String value) {
            addCriterion("staffCode not like", value, "staffcode");
            return (Criteria) this;
        }

        public Criteria andStaffcodeIn(List<String> values) {
            addCriterion("staffCode in", values, "staffcode");
            return (Criteria) this;
        }

        public Criteria andStaffcodeNotIn(List<String> values) {
            addCriterion("staffCode not in", values, "staffcode");
            return (Criteria) this;
        }

        public Criteria andStaffcodeBetween(String value1, String value2) {
            addCriterion("staffCode between", value1, value2, "staffcode");
            return (Criteria) this;
        }

        public Criteria andStaffcodeNotBetween(String value1, String value2) {
            addCriterion("staffCode not between", value1, value2, "staffcode");
            return (Criteria) this;
        }

        public Criteria andStaffimgIsNull() {
            addCriterion("staffImg is null");
            return (Criteria) this;
        }

        public Criteria andStaffimgIsNotNull() {
            addCriterion("staffImg is not null");
            return (Criteria) this;
        }

        public Criteria andStaffimgEqualTo(String value) {
            addCriterion("staffImg =", value, "staffimg");
            return (Criteria) this;
        }

        public Criteria andStaffimgNotEqualTo(String value) {
            addCriterion("staffImg <>", value, "staffimg");
            return (Criteria) this;
        }

        public Criteria andStaffimgGreaterThan(String value) {
            addCriterion("staffImg >", value, "staffimg");
            return (Criteria) this;
        }

        public Criteria andStaffimgGreaterThanOrEqualTo(String value) {
            addCriterion("staffImg >=", value, "staffimg");
            return (Criteria) this;
        }

        public Criteria andStaffimgLessThan(String value) {
            addCriterion("staffImg <", value, "staffimg");
            return (Criteria) this;
        }

        public Criteria andStaffimgLessThanOrEqualTo(String value) {
            addCriterion("staffImg <=", value, "staffimg");
            return (Criteria) this;
        }

        public Criteria andStaffimgLike(String value) {
            addCriterion("staffImg like", value, "staffimg");
            return (Criteria) this;
        }

        public Criteria andStaffimgNotLike(String value) {
            addCriterion("staffImg not like", value, "staffimg");
            return (Criteria) this;
        }

        public Criteria andStaffimgIn(List<String> values) {
            addCriterion("staffImg in", values, "staffimg");
            return (Criteria) this;
        }

        public Criteria andStaffimgNotIn(List<String> values) {
            addCriterion("staffImg not in", values, "staffimg");
            return (Criteria) this;
        }

        public Criteria andStaffimgBetween(String value1, String value2) {
            addCriterion("staffImg between", value1, value2, "staffimg");
            return (Criteria) this;
        }

        public Criteria andStaffimgNotBetween(String value1, String value2) {
            addCriterion("staffImg not between", value1, value2, "staffimg");
            return (Criteria) this;
        }

        public Criteria andStaffaddressIsNull() {
            addCriterion("staffAddress is null");
            return (Criteria) this;
        }

        public Criteria andStaffaddressIsNotNull() {
            addCriterion("staffAddress is not null");
            return (Criteria) this;
        }

        public Criteria andStaffaddressEqualTo(String value) {
            addCriterion("staffAddress =", value, "staffaddress");
            return (Criteria) this;
        }

        public Criteria andStaffaddressNotEqualTo(String value) {
            addCriterion("staffAddress <>", value, "staffaddress");
            return (Criteria) this;
        }

        public Criteria andStaffaddressGreaterThan(String value) {
            addCriterion("staffAddress >", value, "staffaddress");
            return (Criteria) this;
        }

        public Criteria andStaffaddressGreaterThanOrEqualTo(String value) {
            addCriterion("staffAddress >=", value, "staffaddress");
            return (Criteria) this;
        }

        public Criteria andStaffaddressLessThan(String value) {
            addCriterion("staffAddress <", value, "staffaddress");
            return (Criteria) this;
        }

        public Criteria andStaffaddressLessThanOrEqualTo(String value) {
            addCriterion("staffAddress <=", value, "staffaddress");
            return (Criteria) this;
        }

        public Criteria andStaffaddressLike(String value) {
            addCriterion("staffAddress like", value, "staffaddress");
            return (Criteria) this;
        }

        public Criteria andStaffaddressNotLike(String value) {
            addCriterion("staffAddress not like", value, "staffaddress");
            return (Criteria) this;
        }

        public Criteria andStaffaddressIn(List<String> values) {
            addCriterion("staffAddress in", values, "staffaddress");
            return (Criteria) this;
        }

        public Criteria andStaffaddressNotIn(List<String> values) {
            addCriterion("staffAddress not in", values, "staffaddress");
            return (Criteria) this;
        }

        public Criteria andStaffaddressBetween(String value1, String value2) {
            addCriterion("staffAddress between", value1, value2, "staffaddress");
            return (Criteria) this;
        }

        public Criteria andStaffaddressNotBetween(String value1, String value2) {
            addCriterion("staffAddress not between", value1, value2, "staffaddress");
            return (Criteria) this;
        }

        public Criteria andStaffdepartmentidIsNull() {
            addCriterion("staffDepartmentId is null");
            return (Criteria) this;
        }

        public Criteria andStaffdepartmentidIsNotNull() {
            addCriterion("staffDepartmentId is not null");
            return (Criteria) this;
        }

        public Criteria andStaffdepartmentidEqualTo(Integer value) {
            addCriterion("staffDepartmentId =", value, "staffdepartmentid");
            return (Criteria) this;
        }

        public Criteria andStaffdepartmentidNotEqualTo(Integer value) {
            addCriterion("staffDepartmentId <>", value, "staffdepartmentid");
            return (Criteria) this;
        }

        public Criteria andStaffdepartmentidGreaterThan(Integer value) {
            addCriterion("staffDepartmentId >", value, "staffdepartmentid");
            return (Criteria) this;
        }

        public Criteria andStaffdepartmentidGreaterThanOrEqualTo(Integer value) {
            addCriterion("staffDepartmentId >=", value, "staffdepartmentid");
            return (Criteria) this;
        }

        public Criteria andStaffdepartmentidLessThan(Integer value) {
            addCriterion("staffDepartmentId <", value, "staffdepartmentid");
            return (Criteria) this;
        }

        public Criteria andStaffdepartmentidLessThanOrEqualTo(Integer value) {
            addCriterion("staffDepartmentId <=", value, "staffdepartmentid");
            return (Criteria) this;
        }

        public Criteria andStaffdepartmentidIn(List<Integer> values) {
            addCriterion("staffDepartmentId in", values, "staffdepartmentid");
            return (Criteria) this;
        }

        public Criteria andStaffdepartmentidNotIn(List<Integer> values) {
            addCriterion("staffDepartmentId not in", values, "staffdepartmentid");
            return (Criteria) this;
        }

        public Criteria andStaffdepartmentidBetween(Integer value1, Integer value2) {
            addCriterion("staffDepartmentId between", value1, value2, "staffdepartmentid");
            return (Criteria) this;
        }

        public Criteria andStaffdepartmentidNotBetween(Integer value1, Integer value2) {
            addCriterion("staffDepartmentId not between", value1, value2, "staffdepartmentid");
            return (Criteria) this;
        }

        public Criteria andStaffpasswordIsNull() {
            addCriterion("staffPassword is null");
            return (Criteria) this;
        }

        public Criteria andStaffpasswordIsNotNull() {
            addCriterion("staffPassword is not null");
            return (Criteria) this;
        }

        public Criteria andStaffpasswordEqualTo(String value) {
            addCriterion("staffPassword =", value, "staffpassword");
            return (Criteria) this;
        }

        public Criteria andStaffpasswordNotEqualTo(String value) {
            addCriterion("staffPassword <>", value, "staffpassword");
            return (Criteria) this;
        }

        public Criteria andStaffpasswordGreaterThan(String value) {
            addCriterion("staffPassword >", value, "staffpassword");
            return (Criteria) this;
        }

        public Criteria andStaffpasswordGreaterThanOrEqualTo(String value) {
            addCriterion("staffPassword >=", value, "staffpassword");
            return (Criteria) this;
        }

        public Criteria andStaffpasswordLessThan(String value) {
            addCriterion("staffPassword <", value, "staffpassword");
            return (Criteria) this;
        }

        public Criteria andStaffpasswordLessThanOrEqualTo(String value) {
            addCriterion("staffPassword <=", value, "staffpassword");
            return (Criteria) this;
        }

        public Criteria andStaffpasswordLike(String value) {
            addCriterion("staffPassword like", value, "staffpassword");
            return (Criteria) this;
        }

        public Criteria andStaffpasswordNotLike(String value) {
            addCriterion("staffPassword not like", value, "staffpassword");
            return (Criteria) this;
        }

        public Criteria andStaffpasswordIn(List<String> values) {
            addCriterion("staffPassword in", values, "staffpassword");
            return (Criteria) this;
        }

        public Criteria andStaffpasswordNotIn(List<String> values) {
            addCriterion("staffPassword not in", values, "staffpassword");
            return (Criteria) this;
        }

        public Criteria andStaffpasswordBetween(String value1, String value2) {
            addCriterion("staffPassword between", value1, value2, "staffpassword");
            return (Criteria) this;
        }

        public Criteria andStaffpasswordNotBetween(String value1, String value2) {
            addCriterion("staffPassword not between", value1, value2, "staffpassword");
            return (Criteria) this;
        }

        public Criteria andStaffroleidIsNull() {
            addCriterion("staffRoleId is null");
            return (Criteria) this;
        }

        public Criteria andStaffroleidIsNotNull() {
            addCriterion("staffRoleId is not null");
            return (Criteria) this;
        }

        public Criteria andStaffroleidEqualTo(Integer value) {
            addCriterion("staffRoleId =", value, "staffroleid");
            return (Criteria) this;
        }

        public Criteria andStaffroleidNotEqualTo(Integer value) {
            addCriterion("staffRoleId <>", value, "staffroleid");
            return (Criteria) this;
        }

        public Criteria andStaffroleidGreaterThan(Integer value) {
            addCriterion("staffRoleId >", value, "staffroleid");
            return (Criteria) this;
        }

        public Criteria andStaffroleidGreaterThanOrEqualTo(Integer value) {
            addCriterion("staffRoleId >=", value, "staffroleid");
            return (Criteria) this;
        }

        public Criteria andStaffroleidLessThan(Integer value) {
            addCriterion("staffRoleId <", value, "staffroleid");
            return (Criteria) this;
        }

        public Criteria andStaffroleidLessThanOrEqualTo(Integer value) {
            addCriterion("staffRoleId <=", value, "staffroleid");
            return (Criteria) this;
        }

        public Criteria andStaffroleidIn(List<Integer> values) {
            addCriterion("staffRoleId in", values, "staffroleid");
            return (Criteria) this;
        }

        public Criteria andStaffroleidNotIn(List<Integer> values) {
            addCriterion("staffRoleId not in", values, "staffroleid");
            return (Criteria) this;
        }

        public Criteria andStaffroleidBetween(Integer value1, Integer value2) {
            addCriterion("staffRoleId between", value1, value2, "staffroleid");
            return (Criteria) this;
        }

        public Criteria andStaffroleidNotBetween(Integer value1, Integer value2) {
            addCriterion("staffRoleId not between", value1, value2, "staffroleid");
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