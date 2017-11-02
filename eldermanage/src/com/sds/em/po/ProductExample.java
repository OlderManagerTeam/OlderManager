package com.sds.em.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class ProductExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ProductExample() {
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

        public Criteria andProductidIsNull() {
            addCriterion("productId is null");
            return (Criteria) this;
        }

        public Criteria andProductidIsNotNull() {
            addCriterion("productId is not null");
            return (Criteria) this;
        }

        public Criteria andProductidEqualTo(Integer value) {
            addCriterion("productId =", value, "productid");
            return (Criteria) this;
        }

        public Criteria andProductidNotEqualTo(Integer value) {
            addCriterion("productId <>", value, "productid");
            return (Criteria) this;
        }

        public Criteria andProductidGreaterThan(Integer value) {
            addCriterion("productId >", value, "productid");
            return (Criteria) this;
        }

        public Criteria andProductidGreaterThanOrEqualTo(Integer value) {
            addCriterion("productId >=", value, "productid");
            return (Criteria) this;
        }

        public Criteria andProductidLessThan(Integer value) {
            addCriterion("productId <", value, "productid");
            return (Criteria) this;
        }

        public Criteria andProductidLessThanOrEqualTo(Integer value) {
            addCriterion("productId <=", value, "productid");
            return (Criteria) this;
        }

        public Criteria andProductidIn(List<Integer> values) {
            addCriterion("productId in", values, "productid");
            return (Criteria) this;
        }

        public Criteria andProductidNotIn(List<Integer> values) {
            addCriterion("productId not in", values, "productid");
            return (Criteria) this;
        }

        public Criteria andProductidBetween(Integer value1, Integer value2) {
            addCriterion("productId between", value1, value2, "productid");
            return (Criteria) this;
        }

        public Criteria andProductidNotBetween(Integer value1, Integer value2) {
            addCriterion("productId not between", value1, value2, "productid");
            return (Criteria) this;
        }

        public Criteria andProductnameIsNull() {
            addCriterion("productName is null");
            return (Criteria) this;
        }

        public Criteria andProductnameIsNotNull() {
            addCriterion("productName is not null");
            return (Criteria) this;
        }

        public Criteria andProductnameEqualTo(String value) {
            addCriterion("productName =", value, "productname");
            return (Criteria) this;
        }

        public Criteria andProductnameNotEqualTo(String value) {
            addCriterion("productName <>", value, "productname");
            return (Criteria) this;
        }

        public Criteria andProductnameGreaterThan(String value) {
            addCriterion("productName >", value, "productname");
            return (Criteria) this;
        }

        public Criteria andProductnameGreaterThanOrEqualTo(String value) {
            addCriterion("productName >=", value, "productname");
            return (Criteria) this;
        }

        public Criteria andProductnameLessThan(String value) {
            addCriterion("productName <", value, "productname");
            return (Criteria) this;
        }

        public Criteria andProductnameLessThanOrEqualTo(String value) {
            addCriterion("productName <=", value, "productname");
            return (Criteria) this;
        }

        public Criteria andProductnameLike(String value) {
            addCriterion("productName like", value, "productname");
            return (Criteria) this;
        }

        public Criteria andProductnameNotLike(String value) {
            addCriterion("productName not like", value, "productname");
            return (Criteria) this;
        }

        public Criteria andProductnameIn(List<String> values) {
            addCriterion("productName in", values, "productname");
            return (Criteria) this;
        }

        public Criteria andProductnameNotIn(List<String> values) {
            addCriterion("productName not in", values, "productname");
            return (Criteria) this;
        }

        public Criteria andProductnameBetween(String value1, String value2) {
            addCriterion("productName between", value1, value2, "productname");
            return (Criteria) this;
        }

        public Criteria andProductnameNotBetween(String value1, String value2) {
            addCriterion("productName not between", value1, value2, "productname");
            return (Criteria) this;
        }

        public Criteria andProductpriceIsNull() {
            addCriterion("productPrice is null");
            return (Criteria) this;
        }

        public Criteria andProductpriceIsNotNull() {
            addCriterion("productPrice is not null");
            return (Criteria) this;
        }

        public Criteria andProductpriceEqualTo(Float value) {
            addCriterion("productPrice =", value, "productprice");
            return (Criteria) this;
        }

        public Criteria andProductpriceNotEqualTo(Float value) {
            addCriterion("productPrice <>", value, "productprice");
            return (Criteria) this;
        }

        public Criteria andProductpriceGreaterThan(Float value) {
            addCriterion("productPrice >", value, "productprice");
            return (Criteria) this;
        }

        public Criteria andProductpriceGreaterThanOrEqualTo(Float value) {
            addCriterion("productPrice >=", value, "productprice");
            return (Criteria) this;
        }

        public Criteria andProductpriceLessThan(Float value) {
            addCriterion("productPrice <", value, "productprice");
            return (Criteria) this;
        }

        public Criteria andProductpriceLessThanOrEqualTo(Float value) {
            addCriterion("productPrice <=", value, "productprice");
            return (Criteria) this;
        }

        public Criteria andProductpriceIn(List<Float> values) {
            addCriterion("productPrice in", values, "productprice");
            return (Criteria) this;
        }

        public Criteria andProductpriceNotIn(List<Float> values) {
            addCriterion("productPrice not in", values, "productprice");
            return (Criteria) this;
        }

        public Criteria andProductpriceBetween(Float value1, Float value2) {
            addCriterion("productPrice between", value1, value2, "productprice");
            return (Criteria) this;
        }

        public Criteria andProductpriceNotBetween(Float value1, Float value2) {
            addCriterion("productPrice not between", value1, value2, "productprice");
            return (Criteria) this;
        }

        public Criteria andProducttypenumberIsNull() {
            addCriterion("productTypeNumber is null");
            return (Criteria) this;
        }

        public Criteria andProducttypenumberIsNotNull() {
            addCriterion("productTypeNumber is not null");
            return (Criteria) this;
        }

        public Criteria andProducttypenumberEqualTo(Integer value) {
            addCriterion("productTypeNumber =", value, "producttypenumber");
            return (Criteria) this;
        }

        public Criteria andProducttypenumberNotEqualTo(Integer value) {
            addCriterion("productTypeNumber <>", value, "producttypenumber");
            return (Criteria) this;
        }

        public Criteria andProducttypenumberGreaterThan(Integer value) {
            addCriterion("productTypeNumber >", value, "producttypenumber");
            return (Criteria) this;
        }

        public Criteria andProducttypenumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("productTypeNumber >=", value, "producttypenumber");
            return (Criteria) this;
        }

        public Criteria andProducttypenumberLessThan(Integer value) {
            addCriterion("productTypeNumber <", value, "producttypenumber");
            return (Criteria) this;
        }

        public Criteria andProducttypenumberLessThanOrEqualTo(Integer value) {
            addCriterion("productTypeNumber <=", value, "producttypenumber");
            return (Criteria) this;
        }

        public Criteria andProducttypenumberIn(List<Integer> values) {
            addCriterion("productTypeNumber in", values, "producttypenumber");
            return (Criteria) this;
        }

        public Criteria andProducttypenumberNotIn(List<Integer> values) {
            addCriterion("productTypeNumber not in", values, "producttypenumber");
            return (Criteria) this;
        }

        public Criteria andProducttypenumberBetween(Integer value1, Integer value2) {
            addCriterion("productTypeNumber between", value1, value2, "producttypenumber");
            return (Criteria) this;
        }

        public Criteria andProducttypenumberNotBetween(Integer value1, Integer value2) {
            addCriterion("productTypeNumber not between", value1, value2, "producttypenumber");
            return (Criteria) this;
        }

        public Criteria andProductinfoIsNull() {
            addCriterion("productInfo is null");
            return (Criteria) this;
        }

        public Criteria andProductinfoIsNotNull() {
            addCriterion("productInfo is not null");
            return (Criteria) this;
        }

        public Criteria andProductinfoEqualTo(String value) {
            addCriterion("productInfo =", value, "productinfo");
            return (Criteria) this;
        }

        public Criteria andProductinfoNotEqualTo(String value) {
            addCriterion("productInfo <>", value, "productinfo");
            return (Criteria) this;
        }

        public Criteria andProductinfoGreaterThan(String value) {
            addCriterion("productInfo >", value, "productinfo");
            return (Criteria) this;
        }

        public Criteria andProductinfoGreaterThanOrEqualTo(String value) {
            addCriterion("productInfo >=", value, "productinfo");
            return (Criteria) this;
        }

        public Criteria andProductinfoLessThan(String value) {
            addCriterion("productInfo <", value, "productinfo");
            return (Criteria) this;
        }

        public Criteria andProductinfoLessThanOrEqualTo(String value) {
            addCriterion("productInfo <=", value, "productinfo");
            return (Criteria) this;
        }

        public Criteria andProductinfoLike(String value) {
            addCriterion("productInfo like", value, "productinfo");
            return (Criteria) this;
        }

        public Criteria andProductinfoNotLike(String value) {
            addCriterion("productInfo not like", value, "productinfo");
            return (Criteria) this;
        }

        public Criteria andProductinfoIn(List<String> values) {
            addCriterion("productInfo in", values, "productinfo");
            return (Criteria) this;
        }

        public Criteria andProductinfoNotIn(List<String> values) {
            addCriterion("productInfo not in", values, "productinfo");
            return (Criteria) this;
        }

        public Criteria andProductinfoBetween(String value1, String value2) {
            addCriterion("productInfo between", value1, value2, "productinfo");
            return (Criteria) this;
        }

        public Criteria andProductinfoNotBetween(String value1, String value2) {
            addCriterion("productInfo not between", value1, value2, "productinfo");
            return (Criteria) this;
        }

        public Criteria andProductimgIsNull() {
            addCriterion("productImg is null");
            return (Criteria) this;
        }

        public Criteria andProductimgIsNotNull() {
            addCriterion("productImg is not null");
            return (Criteria) this;
        }

        public Criteria andProductimgEqualTo(String value) {
            addCriterion("productImg =", value, "productimg");
            return (Criteria) this;
        }

        public Criteria andProductimgNotEqualTo(String value) {
            addCriterion("productImg <>", value, "productimg");
            return (Criteria) this;
        }

        public Criteria andProductimgGreaterThan(String value) {
            addCriterion("productImg >", value, "productimg");
            return (Criteria) this;
        }

        public Criteria andProductimgGreaterThanOrEqualTo(String value) {
            addCriterion("productImg >=", value, "productimg");
            return (Criteria) this;
        }

        public Criteria andProductimgLessThan(String value) {
            addCriterion("productImg <", value, "productimg");
            return (Criteria) this;
        }

        public Criteria andProductimgLessThanOrEqualTo(String value) {
            addCriterion("productImg <=", value, "productimg");
            return (Criteria) this;
        }

        public Criteria andProductimgLike(String value) {
            addCriterion("productImg like", value, "productimg");
            return (Criteria) this;
        }

        public Criteria andProductimgNotLike(String value) {
            addCriterion("productImg not like", value, "productimg");
            return (Criteria) this;
        }

        public Criteria andProductimgIn(List<String> values) {
            addCriterion("productImg in", values, "productimg");
            return (Criteria) this;
        }

        public Criteria andProductimgNotIn(List<String> values) {
            addCriterion("productImg not in", values, "productimg");
            return (Criteria) this;
        }

        public Criteria andProductimgBetween(String value1, String value2) {
            addCriterion("productImg between", value1, value2, "productimg");
            return (Criteria) this;
        }

        public Criteria andProductimgNotBetween(String value1, String value2) {
            addCriterion("productImg not between", value1, value2, "productimg");
            return (Criteria) this;
        }

        public Criteria andProductweightIsNull() {
            addCriterion("productWeight is null");
            return (Criteria) this;
        }

        public Criteria andProductweightIsNotNull() {
            addCriterion("productWeight is not null");
            return (Criteria) this;
        }

        public Criteria andProductweightEqualTo(Float value) {
            addCriterion("productWeight =", value, "productweight");
            return (Criteria) this;
        }

        public Criteria andProductweightNotEqualTo(Float value) {
            addCriterion("productWeight <>", value, "productweight");
            return (Criteria) this;
        }

        public Criteria andProductweightGreaterThan(Float value) {
            addCriterion("productWeight >", value, "productweight");
            return (Criteria) this;
        }

        public Criteria andProductweightGreaterThanOrEqualTo(Float value) {
            addCriterion("productWeight >=", value, "productweight");
            return (Criteria) this;
        }

        public Criteria andProductweightLessThan(Float value) {
            addCriterion("productWeight <", value, "productweight");
            return (Criteria) this;
        }

        public Criteria andProductweightLessThanOrEqualTo(Float value) {
            addCriterion("productWeight <=", value, "productweight");
            return (Criteria) this;
        }

        public Criteria andProductweightIn(List<Float> values) {
            addCriterion("productWeight in", values, "productweight");
            return (Criteria) this;
        }

        public Criteria andProductweightNotIn(List<Float> values) {
            addCriterion("productWeight not in", values, "productweight");
            return (Criteria) this;
        }

        public Criteria andProductweightBetween(Float value1, Float value2) {
            addCriterion("productWeight between", value1, value2, "productweight");
            return (Criteria) this;
        }

        public Criteria andProductweightNotBetween(Float value1, Float value2) {
            addCriterion("productWeight not between", value1, value2, "productweight");
            return (Criteria) this;
        }

        public Criteria andProductupondateIsNull() {
            addCriterion("productUponDate is null");
            return (Criteria) this;
        }

        public Criteria andProductupondateIsNotNull() {
            addCriterion("productUponDate is not null");
            return (Criteria) this;
        }

        public Criteria andProductupondateEqualTo(Date value) {
            addCriterionForJDBCDate("productUponDate =", value, "productupondate");
            return (Criteria) this;
        }

        public Criteria andProductupondateNotEqualTo(Date value) {
            addCriterionForJDBCDate("productUponDate <>", value, "productupondate");
            return (Criteria) this;
        }

        public Criteria andProductupondateGreaterThan(Date value) {
            addCriterionForJDBCDate("productUponDate >", value, "productupondate");
            return (Criteria) this;
        }

        public Criteria andProductupondateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("productUponDate >=", value, "productupondate");
            return (Criteria) this;
        }

        public Criteria andProductupondateLessThan(Date value) {
            addCriterionForJDBCDate("productUponDate <", value, "productupondate");
            return (Criteria) this;
        }

        public Criteria andProductupondateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("productUponDate <=", value, "productupondate");
            return (Criteria) this;
        }

        public Criteria andProductupondateIn(List<Date> values) {
            addCriterionForJDBCDate("productUponDate in", values, "productupondate");
            return (Criteria) this;
        }

        public Criteria andProductupondateNotIn(List<Date> values) {
            addCriterionForJDBCDate("productUponDate not in", values, "productupondate");
            return (Criteria) this;
        }

        public Criteria andProductupondateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("productUponDate between", value1, value2, "productupondate");
            return (Criteria) this;
        }

        public Criteria andProductupondateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("productUponDate not between", value1, value2, "productupondate");
            return (Criteria) this;
        }

        public Criteria andProductdiscountpriceIsNull() {
            addCriterion("productDiscountPrice is null");
            return (Criteria) this;
        }

        public Criteria andProductdiscountpriceIsNotNull() {
            addCriterion("productDiscountPrice is not null");
            return (Criteria) this;
        }

        public Criteria andProductdiscountpriceEqualTo(Float value) {
            addCriterion("productDiscountPrice =", value, "productdiscountprice");
            return (Criteria) this;
        }

        public Criteria andProductdiscountpriceNotEqualTo(Float value) {
            addCriterion("productDiscountPrice <>", value, "productdiscountprice");
            return (Criteria) this;
        }

        public Criteria andProductdiscountpriceGreaterThan(Float value) {
            addCriterion("productDiscountPrice >", value, "productdiscountprice");
            return (Criteria) this;
        }

        public Criteria andProductdiscountpriceGreaterThanOrEqualTo(Float value) {
            addCriterion("productDiscountPrice >=", value, "productdiscountprice");
            return (Criteria) this;
        }

        public Criteria andProductdiscountpriceLessThan(Float value) {
            addCriterion("productDiscountPrice <", value, "productdiscountprice");
            return (Criteria) this;
        }

        public Criteria andProductdiscountpriceLessThanOrEqualTo(Float value) {
            addCriterion("productDiscountPrice <=", value, "productdiscountprice");
            return (Criteria) this;
        }

        public Criteria andProductdiscountpriceIn(List<Float> values) {
            addCriterion("productDiscountPrice in", values, "productdiscountprice");
            return (Criteria) this;
        }

        public Criteria andProductdiscountpriceNotIn(List<Float> values) {
            addCriterion("productDiscountPrice not in", values, "productdiscountprice");
            return (Criteria) this;
        }

        public Criteria andProductdiscountpriceBetween(Float value1, Float value2) {
            addCriterion("productDiscountPrice between", value1, value2, "productdiscountprice");
            return (Criteria) this;
        }

        public Criteria andProductdiscountpriceNotBetween(Float value1, Float value2) {
            addCriterion("productDiscountPrice not between", value1, value2, "productdiscountprice");
            return (Criteria) this;
        }

        public Criteria andTypetwotypeidIsNull() {
            addCriterion("typeTwoTypeId is null");
            return (Criteria) this;
        }

        public Criteria andTypetwotypeidIsNotNull() {
            addCriterion("typeTwoTypeId is not null");
            return (Criteria) this;
        }

        public Criteria andTypetwotypeidEqualTo(Integer value) {
            addCriterion("typeTwoTypeId =", value, "typetwotypeid");
            return (Criteria) this;
        }

        public Criteria andTypetwotypeidNotEqualTo(Integer value) {
            addCriterion("typeTwoTypeId <>", value, "typetwotypeid");
            return (Criteria) this;
        }

        public Criteria andTypetwotypeidGreaterThan(Integer value) {
            addCriterion("typeTwoTypeId >", value, "typetwotypeid");
            return (Criteria) this;
        }

        public Criteria andTypetwotypeidGreaterThanOrEqualTo(Integer value) {
            addCriterion("typeTwoTypeId >=", value, "typetwotypeid");
            return (Criteria) this;
        }

        public Criteria andTypetwotypeidLessThan(Integer value) {
            addCriterion("typeTwoTypeId <", value, "typetwotypeid");
            return (Criteria) this;
        }

        public Criteria andTypetwotypeidLessThanOrEqualTo(Integer value) {
            addCriterion("typeTwoTypeId <=", value, "typetwotypeid");
            return (Criteria) this;
        }

        public Criteria andTypetwotypeidIn(List<Integer> values) {
            addCriterion("typeTwoTypeId in", values, "typetwotypeid");
            return (Criteria) this;
        }

        public Criteria andTypetwotypeidNotIn(List<Integer> values) {
            addCriterion("typeTwoTypeId not in", values, "typetwotypeid");
            return (Criteria) this;
        }

        public Criteria andTypetwotypeidBetween(Integer value1, Integer value2) {
            addCriterion("typeTwoTypeId between", value1, value2, "typetwotypeid");
            return (Criteria) this;
        }

        public Criteria andTypetwotypeidNotBetween(Integer value1, Integer value2) {
            addCriterion("typeTwoTypeId not between", value1, value2, "typetwotypeid");
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