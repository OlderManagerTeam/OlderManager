package com.sds.em.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class ProductgroupExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ProductgroupExample() {
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

        public Criteria andGroupidIsNull() {
            addCriterion("groupId is null");
            return (Criteria) this;
        }

        public Criteria andGroupidIsNotNull() {
            addCriterion("groupId is not null");
            return (Criteria) this;
        }

        public Criteria andGroupidEqualTo(Integer value) {
            addCriterion("groupId =", value, "groupid");
            return (Criteria) this;
        }

        public Criteria andGroupidNotEqualTo(Integer value) {
            addCriterion("groupId <>", value, "groupid");
            return (Criteria) this;
        }

        public Criteria andGroupidGreaterThan(Integer value) {
            addCriterion("groupId >", value, "groupid");
            return (Criteria) this;
        }

        public Criteria andGroupidGreaterThanOrEqualTo(Integer value) {
            addCriterion("groupId >=", value, "groupid");
            return (Criteria) this;
        }

        public Criteria andGroupidLessThan(Integer value) {
            addCriterion("groupId <", value, "groupid");
            return (Criteria) this;
        }

        public Criteria andGroupidLessThanOrEqualTo(Integer value) {
            addCriterion("groupId <=", value, "groupid");
            return (Criteria) this;
        }

        public Criteria andGroupidIn(List<Integer> values) {
            addCriterion("groupId in", values, "groupid");
            return (Criteria) this;
        }

        public Criteria andGroupidNotIn(List<Integer> values) {
            addCriterion("groupId not in", values, "groupid");
            return (Criteria) this;
        }

        public Criteria andGroupidBetween(Integer value1, Integer value2) {
            addCriterion("groupId between", value1, value2, "groupid");
            return (Criteria) this;
        }

        public Criteria andGroupidNotBetween(Integer value1, Integer value2) {
            addCriterion("groupId not between", value1, value2, "groupid");
            return (Criteria) this;
        }

        public Criteria andGrouppublishdateIsNull() {
            addCriterion("groupPublishDate is null");
            return (Criteria) this;
        }

        public Criteria andGrouppublishdateIsNotNull() {
            addCriterion("groupPublishDate is not null");
            return (Criteria) this;
        }

        public Criteria andGrouppublishdateEqualTo(Date value) {
            addCriterionForJDBCDate("groupPublishDate =", value, "grouppublishdate");
            return (Criteria) this;
        }

        public Criteria andGrouppublishdateNotEqualTo(Date value) {
            addCriterionForJDBCDate("groupPublishDate <>", value, "grouppublishdate");
            return (Criteria) this;
        }

        public Criteria andGrouppublishdateGreaterThan(Date value) {
            addCriterionForJDBCDate("groupPublishDate >", value, "grouppublishdate");
            return (Criteria) this;
        }

        public Criteria andGrouppublishdateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("groupPublishDate >=", value, "grouppublishdate");
            return (Criteria) this;
        }

        public Criteria andGrouppublishdateLessThan(Date value) {
            addCriterionForJDBCDate("groupPublishDate <", value, "grouppublishdate");
            return (Criteria) this;
        }

        public Criteria andGrouppublishdateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("groupPublishDate <=", value, "grouppublishdate");
            return (Criteria) this;
        }

        public Criteria andGrouppublishdateIn(List<Date> values) {
            addCriterionForJDBCDate("groupPublishDate in", values, "grouppublishdate");
            return (Criteria) this;
        }

        public Criteria andGrouppublishdateNotIn(List<Date> values) {
            addCriterionForJDBCDate("groupPublishDate not in", values, "grouppublishdate");
            return (Criteria) this;
        }

        public Criteria andGrouppublishdateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("groupPublishDate between", value1, value2, "grouppublishdate");
            return (Criteria) this;
        }

        public Criteria andGrouppublishdateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("groupPublishDate not between", value1, value2, "grouppublishdate");
            return (Criteria) this;
        }

        public Criteria andGroupstartdateIsNull() {
            addCriterion("groupStartDate is null");
            return (Criteria) this;
        }

        public Criteria andGroupstartdateIsNotNull() {
            addCriterion("groupStartDate is not null");
            return (Criteria) this;
        }

        public Criteria andGroupstartdateEqualTo(Date value) {
            addCriterionForJDBCDate("groupStartDate =", value, "groupstartdate");
            return (Criteria) this;
        }

        public Criteria andGroupstartdateNotEqualTo(Date value) {
            addCriterionForJDBCDate("groupStartDate <>", value, "groupstartdate");
            return (Criteria) this;
        }

        public Criteria andGroupstartdateGreaterThan(Date value) {
            addCriterionForJDBCDate("groupStartDate >", value, "groupstartdate");
            return (Criteria) this;
        }

        public Criteria andGroupstartdateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("groupStartDate >=", value, "groupstartdate");
            return (Criteria) this;
        }

        public Criteria andGroupstartdateLessThan(Date value) {
            addCriterionForJDBCDate("groupStartDate <", value, "groupstartdate");
            return (Criteria) this;
        }

        public Criteria andGroupstartdateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("groupStartDate <=", value, "groupstartdate");
            return (Criteria) this;
        }

        public Criteria andGroupstartdateIn(List<Date> values) {
            addCriterionForJDBCDate("groupStartDate in", values, "groupstartdate");
            return (Criteria) this;
        }

        public Criteria andGroupstartdateNotIn(List<Date> values) {
            addCriterionForJDBCDate("groupStartDate not in", values, "groupstartdate");
            return (Criteria) this;
        }

        public Criteria andGroupstartdateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("groupStartDate between", value1, value2, "groupstartdate");
            return (Criteria) this;
        }

        public Criteria andGroupstartdateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("groupStartDate not between", value1, value2, "groupstartdate");
            return (Criteria) this;
        }

        public Criteria andGroupfinishdateIsNull() {
            addCriterion("groupFinishDate is null");
            return (Criteria) this;
        }

        public Criteria andGroupfinishdateIsNotNull() {
            addCriterion("groupFinishDate is not null");
            return (Criteria) this;
        }

        public Criteria andGroupfinishdateEqualTo(Date value) {
            addCriterionForJDBCDate("groupFinishDate =", value, "groupfinishdate");
            return (Criteria) this;
        }

        public Criteria andGroupfinishdateNotEqualTo(Date value) {
            addCriterionForJDBCDate("groupFinishDate <>", value, "groupfinishdate");
            return (Criteria) this;
        }

        public Criteria andGroupfinishdateGreaterThan(Date value) {
            addCriterionForJDBCDate("groupFinishDate >", value, "groupfinishdate");
            return (Criteria) this;
        }

        public Criteria andGroupfinishdateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("groupFinishDate >=", value, "groupfinishdate");
            return (Criteria) this;
        }

        public Criteria andGroupfinishdateLessThan(Date value) {
            addCriterionForJDBCDate("groupFinishDate <", value, "groupfinishdate");
            return (Criteria) this;
        }

        public Criteria andGroupfinishdateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("groupFinishDate <=", value, "groupfinishdate");
            return (Criteria) this;
        }

        public Criteria andGroupfinishdateIn(List<Date> values) {
            addCriterionForJDBCDate("groupFinishDate in", values, "groupfinishdate");
            return (Criteria) this;
        }

        public Criteria andGroupfinishdateNotIn(List<Date> values) {
            addCriterionForJDBCDate("groupFinishDate not in", values, "groupfinishdate");
            return (Criteria) this;
        }

        public Criteria andGroupfinishdateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("groupFinishDate between", value1, value2, "groupfinishdate");
            return (Criteria) this;
        }

        public Criteria andGroupfinishdateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("groupFinishDate not between", value1, value2, "groupfinishdate");
            return (Criteria) this;
        }

        public Criteria andGroupproductidIsNull() {
            addCriterion("groupProductId is null");
            return (Criteria) this;
        }

        public Criteria andGroupproductidIsNotNull() {
            addCriterion("groupProductId is not null");
            return (Criteria) this;
        }

        public Criteria andGroupproductidEqualTo(Integer value) {
            addCriterion("groupProductId =", value, "groupproductid");
            return (Criteria) this;
        }

        public Criteria andGroupproductidNotEqualTo(Integer value) {
            addCriterion("groupProductId <>", value, "groupproductid");
            return (Criteria) this;
        }

        public Criteria andGroupproductidGreaterThan(Integer value) {
            addCriterion("groupProductId >", value, "groupproductid");
            return (Criteria) this;
        }

        public Criteria andGroupproductidGreaterThanOrEqualTo(Integer value) {
            addCriterion("groupProductId >=", value, "groupproductid");
            return (Criteria) this;
        }

        public Criteria andGroupproductidLessThan(Integer value) {
            addCriterion("groupProductId <", value, "groupproductid");
            return (Criteria) this;
        }

        public Criteria andGroupproductidLessThanOrEqualTo(Integer value) {
            addCriterion("groupProductId <=", value, "groupproductid");
            return (Criteria) this;
        }

        public Criteria andGroupproductidIn(List<Integer> values) {
            addCriterion("groupProductId in", values, "groupproductid");
            return (Criteria) this;
        }

        public Criteria andGroupproductidNotIn(List<Integer> values) {
            addCriterion("groupProductId not in", values, "groupproductid");
            return (Criteria) this;
        }

        public Criteria andGroupproductidBetween(Integer value1, Integer value2) {
            addCriterion("groupProductId between", value1, value2, "groupproductid");
            return (Criteria) this;
        }

        public Criteria andGroupproductidNotBetween(Integer value1, Integer value2) {
            addCriterion("groupProductId not between", value1, value2, "groupproductid");
            return (Criteria) this;
        }

        public Criteria andGrouppresentpeopleIsNull() {
            addCriterion("groupPresentPeople is null");
            return (Criteria) this;
        }

        public Criteria andGrouppresentpeopleIsNotNull() {
            addCriterion("groupPresentPeople is not null");
            return (Criteria) this;
        }

        public Criteria andGrouppresentpeopleEqualTo(Integer value) {
            addCriterion("groupPresentPeople =", value, "grouppresentpeople");
            return (Criteria) this;
        }

        public Criteria andGrouppresentpeopleNotEqualTo(Integer value) {
            addCriterion("groupPresentPeople <>", value, "grouppresentpeople");
            return (Criteria) this;
        }

        public Criteria andGrouppresentpeopleGreaterThan(Integer value) {
            addCriterion("groupPresentPeople >", value, "grouppresentpeople");
            return (Criteria) this;
        }

        public Criteria andGrouppresentpeopleGreaterThanOrEqualTo(Integer value) {
            addCriterion("groupPresentPeople >=", value, "grouppresentpeople");
            return (Criteria) this;
        }

        public Criteria andGrouppresentpeopleLessThan(Integer value) {
            addCriterion("groupPresentPeople <", value, "grouppresentpeople");
            return (Criteria) this;
        }

        public Criteria andGrouppresentpeopleLessThanOrEqualTo(Integer value) {
            addCriterion("groupPresentPeople <=", value, "grouppresentpeople");
            return (Criteria) this;
        }

        public Criteria andGrouppresentpeopleIn(List<Integer> values) {
            addCriterion("groupPresentPeople in", values, "grouppresentpeople");
            return (Criteria) this;
        }

        public Criteria andGrouppresentpeopleNotIn(List<Integer> values) {
            addCriterion("groupPresentPeople not in", values, "grouppresentpeople");
            return (Criteria) this;
        }

        public Criteria andGrouppresentpeopleBetween(Integer value1, Integer value2) {
            addCriterion("groupPresentPeople between", value1, value2, "grouppresentpeople");
            return (Criteria) this;
        }

        public Criteria andGrouppresentpeopleNotBetween(Integer value1, Integer value2) {
            addCriterion("groupPresentPeople not between", value1, value2, "grouppresentpeople");
            return (Criteria) this;
        }

        public Criteria andGrouptotalpeopleIsNull() {
            addCriterion("groupTotalPeople is null");
            return (Criteria) this;
        }

        public Criteria andGrouptotalpeopleIsNotNull() {
            addCriterion("groupTotalPeople is not null");
            return (Criteria) this;
        }

        public Criteria andGrouptotalpeopleEqualTo(Integer value) {
            addCriterion("groupTotalPeople =", value, "grouptotalpeople");
            return (Criteria) this;
        }

        public Criteria andGrouptotalpeopleNotEqualTo(Integer value) {
            addCriterion("groupTotalPeople <>", value, "grouptotalpeople");
            return (Criteria) this;
        }

        public Criteria andGrouptotalpeopleGreaterThan(Integer value) {
            addCriterion("groupTotalPeople >", value, "grouptotalpeople");
            return (Criteria) this;
        }

        public Criteria andGrouptotalpeopleGreaterThanOrEqualTo(Integer value) {
            addCriterion("groupTotalPeople >=", value, "grouptotalpeople");
            return (Criteria) this;
        }

        public Criteria andGrouptotalpeopleLessThan(Integer value) {
            addCriterion("groupTotalPeople <", value, "grouptotalpeople");
            return (Criteria) this;
        }

        public Criteria andGrouptotalpeopleLessThanOrEqualTo(Integer value) {
            addCriterion("groupTotalPeople <=", value, "grouptotalpeople");
            return (Criteria) this;
        }

        public Criteria andGrouptotalpeopleIn(List<Integer> values) {
            addCriterion("groupTotalPeople in", values, "grouptotalpeople");
            return (Criteria) this;
        }

        public Criteria andGrouptotalpeopleNotIn(List<Integer> values) {
            addCriterion("groupTotalPeople not in", values, "grouptotalpeople");
            return (Criteria) this;
        }

        public Criteria andGrouptotalpeopleBetween(Integer value1, Integer value2) {
            addCriterion("groupTotalPeople between", value1, value2, "grouptotalpeople");
            return (Criteria) this;
        }

        public Criteria andGrouptotalpeopleNotBetween(Integer value1, Integer value2) {
            addCriterion("groupTotalPeople not between", value1, value2, "grouptotalpeople");
            return (Criteria) this;
        }

        public Criteria andGoupdiscountpriceIsNull() {
            addCriterion("goupDiscountPrice is null");
            return (Criteria) this;
        }

        public Criteria andGoupdiscountpriceIsNotNull() {
            addCriterion("goupDiscountPrice is not null");
            return (Criteria) this;
        }

        public Criteria andGoupdiscountpriceEqualTo(Float value) {
            addCriterion("goupDiscountPrice =", value, "goupdiscountprice");
            return (Criteria) this;
        }

        public Criteria andGoupdiscountpriceNotEqualTo(Float value) {
            addCriterion("goupDiscountPrice <>", value, "goupdiscountprice");
            return (Criteria) this;
        }

        public Criteria andGoupdiscountpriceGreaterThan(Float value) {
            addCriterion("goupDiscountPrice >", value, "goupdiscountprice");
            return (Criteria) this;
        }

        public Criteria andGoupdiscountpriceGreaterThanOrEqualTo(Float value) {
            addCriterion("goupDiscountPrice >=", value, "goupdiscountprice");
            return (Criteria) this;
        }

        public Criteria andGoupdiscountpriceLessThan(Float value) {
            addCriterion("goupDiscountPrice <", value, "goupdiscountprice");
            return (Criteria) this;
        }

        public Criteria andGoupdiscountpriceLessThanOrEqualTo(Float value) {
            addCriterion("goupDiscountPrice <=", value, "goupdiscountprice");
            return (Criteria) this;
        }

        public Criteria andGoupdiscountpriceIn(List<Float> values) {
            addCriterion("goupDiscountPrice in", values, "goupdiscountprice");
            return (Criteria) this;
        }

        public Criteria andGoupdiscountpriceNotIn(List<Float> values) {
            addCriterion("goupDiscountPrice not in", values, "goupdiscountprice");
            return (Criteria) this;
        }

        public Criteria andGoupdiscountpriceBetween(Float value1, Float value2) {
            addCriterion("goupDiscountPrice between", value1, value2, "goupdiscountprice");
            return (Criteria) this;
        }

        public Criteria andGoupdiscountpriceNotBetween(Float value1, Float value2) {
            addCriterion("goupDiscountPrice not between", value1, value2, "goupdiscountprice");
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