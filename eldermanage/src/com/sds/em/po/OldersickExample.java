package com.sds.em.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class OldersickExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public OldersickExample() {
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

        public Criteria andSickidIsNull() {
            addCriterion("sickId is null");
            return (Criteria) this;
        }

        public Criteria andSickidIsNotNull() {
            addCriterion("sickId is not null");
            return (Criteria) this;
        }

        public Criteria andSickidEqualTo(Integer value) {
            addCriterion("sickId =", value, "sickid");
            return (Criteria) this;
        }

        public Criteria andSickidNotEqualTo(Integer value) {
            addCriterion("sickId <>", value, "sickid");
            return (Criteria) this;
        }

        public Criteria andSickidGreaterThan(Integer value) {
            addCriterion("sickId >", value, "sickid");
            return (Criteria) this;
        }

        public Criteria andSickidGreaterThanOrEqualTo(Integer value) {
            addCriterion("sickId >=", value, "sickid");
            return (Criteria) this;
        }

        public Criteria andSickidLessThan(Integer value) {
            addCriterion("sickId <", value, "sickid");
            return (Criteria) this;
        }

        public Criteria andSickidLessThanOrEqualTo(Integer value) {
            addCriterion("sickId <=", value, "sickid");
            return (Criteria) this;
        }

        public Criteria andSickidIn(List<Integer> values) {
            addCriterion("sickId in", values, "sickid");
            return (Criteria) this;
        }

        public Criteria andSickidNotIn(List<Integer> values) {
            addCriterion("sickId not in", values, "sickid");
            return (Criteria) this;
        }

        public Criteria andSickidBetween(Integer value1, Integer value2) {
            addCriterion("sickId between", value1, value2, "sickid");
            return (Criteria) this;
        }

        public Criteria andSickidNotBetween(Integer value1, Integer value2) {
            addCriterion("sickId not between", value1, value2, "sickid");
            return (Criteria) this;
        }

        public Criteria andSickolderidIsNull() {
            addCriterion("sickOlderId is null");
            return (Criteria) this;
        }

        public Criteria andSickolderidIsNotNull() {
            addCriterion("sickOlderId is not null");
            return (Criteria) this;
        }

        public Criteria andSickolderidEqualTo(Integer value) {
            addCriterion("sickOlderId =", value, "sickolderid");
            return (Criteria) this;
        }

        public Criteria andSickolderidNotEqualTo(Integer value) {
            addCriterion("sickOlderId <>", value, "sickolderid");
            return (Criteria) this;
        }

        public Criteria andSickolderidGreaterThan(Integer value) {
            addCriterion("sickOlderId >", value, "sickolderid");
            return (Criteria) this;
        }

        public Criteria andSickolderidGreaterThanOrEqualTo(Integer value) {
            addCriterion("sickOlderId >=", value, "sickolderid");
            return (Criteria) this;
        }

        public Criteria andSickolderidLessThan(Integer value) {
            addCriterion("sickOlderId <", value, "sickolderid");
            return (Criteria) this;
        }

        public Criteria andSickolderidLessThanOrEqualTo(Integer value) {
            addCriterion("sickOlderId <=", value, "sickolderid");
            return (Criteria) this;
        }

        public Criteria andSickolderidIn(List<Integer> values) {
            addCriterion("sickOlderId in", values, "sickolderid");
            return (Criteria) this;
        }

        public Criteria andSickolderidNotIn(List<Integer> values) {
            addCriterion("sickOlderId not in", values, "sickolderid");
            return (Criteria) this;
        }

        public Criteria andSickolderidBetween(Integer value1, Integer value2) {
            addCriterion("sickOlderId between", value1, value2, "sickolderid");
            return (Criteria) this;
        }

        public Criteria andSickolderidNotBetween(Integer value1, Integer value2) {
            addCriterion("sickOlderId not between", value1, value2, "sickolderid");
            return (Criteria) this;
        }

        public Criteria andSickinfoIsNull() {
            addCriterion("sickInfo is null");
            return (Criteria) this;
        }

        public Criteria andSickinfoIsNotNull() {
            addCriterion("sickInfo is not null");
            return (Criteria) this;
        }

        public Criteria andSickinfoEqualTo(String value) {
            addCriterion("sickInfo =", value, "sickinfo");
            return (Criteria) this;
        }

        public Criteria andSickinfoNotEqualTo(String value) {
            addCriterion("sickInfo <>", value, "sickinfo");
            return (Criteria) this;
        }

        public Criteria andSickinfoGreaterThan(String value) {
            addCriterion("sickInfo >", value, "sickinfo");
            return (Criteria) this;
        }

        public Criteria andSickinfoGreaterThanOrEqualTo(String value) {
            addCriterion("sickInfo >=", value, "sickinfo");
            return (Criteria) this;
        }

        public Criteria andSickinfoLessThan(String value) {
            addCriterion("sickInfo <", value, "sickinfo");
            return (Criteria) this;
        }

        public Criteria andSickinfoLessThanOrEqualTo(String value) {
            addCriterion("sickInfo <=", value, "sickinfo");
            return (Criteria) this;
        }

        public Criteria andSickinfoLike(String value) {
            addCriterion("sickInfo like", value, "sickinfo");
            return (Criteria) this;
        }

        public Criteria andSickinfoNotLike(String value) {
            addCriterion("sickInfo not like", value, "sickinfo");
            return (Criteria) this;
        }

        public Criteria andSickinfoIn(List<String> values) {
            addCriterion("sickInfo in", values, "sickinfo");
            return (Criteria) this;
        }

        public Criteria andSickinfoNotIn(List<String> values) {
            addCriterion("sickInfo not in", values, "sickinfo");
            return (Criteria) this;
        }

        public Criteria andSickinfoBetween(String value1, String value2) {
            addCriterion("sickInfo between", value1, value2, "sickinfo");
            return (Criteria) this;
        }

        public Criteria andSickinfoNotBetween(String value1, String value2) {
            addCriterion("sickInfo not between", value1, value2, "sickinfo");
            return (Criteria) this;
        }

        public Criteria andSickdoctorIsNull() {
            addCriterion("sickDoctor is null");
            return (Criteria) this;
        }

        public Criteria andSickdoctorIsNotNull() {
            addCriterion("sickDoctor is not null");
            return (Criteria) this;
        }

        public Criteria andSickdoctorEqualTo(String value) {
            addCriterion("sickDoctor =", value, "sickdoctor");
            return (Criteria) this;
        }

        public Criteria andSickdoctorNotEqualTo(String value) {
            addCriterion("sickDoctor <>", value, "sickdoctor");
            return (Criteria) this;
        }

        public Criteria andSickdoctorGreaterThan(String value) {
            addCriterion("sickDoctor >", value, "sickdoctor");
            return (Criteria) this;
        }

        public Criteria andSickdoctorGreaterThanOrEqualTo(String value) {
            addCriterion("sickDoctor >=", value, "sickdoctor");
            return (Criteria) this;
        }

        public Criteria andSickdoctorLessThan(String value) {
            addCriterion("sickDoctor <", value, "sickdoctor");
            return (Criteria) this;
        }

        public Criteria andSickdoctorLessThanOrEqualTo(String value) {
            addCriterion("sickDoctor <=", value, "sickdoctor");
            return (Criteria) this;
        }

        public Criteria andSickdoctorLike(String value) {
            addCriterion("sickDoctor like", value, "sickdoctor");
            return (Criteria) this;
        }

        public Criteria andSickdoctorNotLike(String value) {
            addCriterion("sickDoctor not like", value, "sickdoctor");
            return (Criteria) this;
        }

        public Criteria andSickdoctorIn(List<String> values) {
            addCriterion("sickDoctor in", values, "sickdoctor");
            return (Criteria) this;
        }

        public Criteria andSickdoctorNotIn(List<String> values) {
            addCriterion("sickDoctor not in", values, "sickdoctor");
            return (Criteria) this;
        }

        public Criteria andSickdoctorBetween(String value1, String value2) {
            addCriterion("sickDoctor between", value1, value2, "sickdoctor");
            return (Criteria) this;
        }

        public Criteria andSickdoctorNotBetween(String value1, String value2) {
            addCriterion("sickDoctor not between", value1, value2, "sickdoctor");
            return (Criteria) this;
        }

        public Criteria andSickdateIsNull() {
            addCriterion("sickDate is null");
            return (Criteria) this;
        }

        public Criteria andSickdateIsNotNull() {
            addCriterion("sickDate is not null");
            return (Criteria) this;
        }

        public Criteria andSickdateEqualTo(Date value) {
            addCriterionForJDBCDate("sickDate =", value, "sickdate");
            return (Criteria) this;
        }

        public Criteria andSickdateNotEqualTo(Date value) {
            addCriterionForJDBCDate("sickDate <>", value, "sickdate");
            return (Criteria) this;
        }

        public Criteria andSickdateGreaterThan(Date value) {
            addCriterionForJDBCDate("sickDate >", value, "sickdate");
            return (Criteria) this;
        }

        public Criteria andSickdateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("sickDate >=", value, "sickdate");
            return (Criteria) this;
        }

        public Criteria andSickdateLessThan(Date value) {
            addCriterionForJDBCDate("sickDate <", value, "sickdate");
            return (Criteria) this;
        }

        public Criteria andSickdateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("sickDate <=", value, "sickdate");
            return (Criteria) this;
        }

        public Criteria andSickdateIn(List<Date> values) {
            addCriterionForJDBCDate("sickDate in", values, "sickdate");
            return (Criteria) this;
        }

        public Criteria andSickdateNotIn(List<Date> values) {
            addCriterionForJDBCDate("sickDate not in", values, "sickdate");
            return (Criteria) this;
        }

        public Criteria andSickdateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("sickDate between", value1, value2, "sickdate");
            return (Criteria) this;
        }

        public Criteria andSickdateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("sickDate not between", value1, value2, "sickdate");
            return (Criteria) this;
        }

        public Criteria andSickadviceIsNull() {
            addCriterion("sickAdvice is null");
            return (Criteria) this;
        }

        public Criteria andSickadviceIsNotNull() {
            addCriterion("sickAdvice is not null");
            return (Criteria) this;
        }

        public Criteria andSickadviceEqualTo(String value) {
            addCriterion("sickAdvice =", value, "sickadvice");
            return (Criteria) this;
        }

        public Criteria andSickadviceNotEqualTo(String value) {
            addCriterion("sickAdvice <>", value, "sickadvice");
            return (Criteria) this;
        }

        public Criteria andSickadviceGreaterThan(String value) {
            addCriterion("sickAdvice >", value, "sickadvice");
            return (Criteria) this;
        }

        public Criteria andSickadviceGreaterThanOrEqualTo(String value) {
            addCriterion("sickAdvice >=", value, "sickadvice");
            return (Criteria) this;
        }

        public Criteria andSickadviceLessThan(String value) {
            addCriterion("sickAdvice <", value, "sickadvice");
            return (Criteria) this;
        }

        public Criteria andSickadviceLessThanOrEqualTo(String value) {
            addCriterion("sickAdvice <=", value, "sickadvice");
            return (Criteria) this;
        }

        public Criteria andSickadviceLike(String value) {
            addCriterion("sickAdvice like", value, "sickadvice");
            return (Criteria) this;
        }

        public Criteria andSickadviceNotLike(String value) {
            addCriterion("sickAdvice not like", value, "sickadvice");
            return (Criteria) this;
        }

        public Criteria andSickadviceIn(List<String> values) {
            addCriterion("sickAdvice in", values, "sickadvice");
            return (Criteria) this;
        }

        public Criteria andSickadviceNotIn(List<String> values) {
            addCriterion("sickAdvice not in", values, "sickadvice");
            return (Criteria) this;
        }

        public Criteria andSickadviceBetween(String value1, String value2) {
            addCriterion("sickAdvice between", value1, value2, "sickadvice");
            return (Criteria) this;
        }

        public Criteria andSickadviceNotBetween(String value1, String value2) {
            addCriterion("sickAdvice not between", value1, value2, "sickadvice");
            return (Criteria) this;
        }

        public Criteria andSickhospitalIsNull() {
            addCriterion("sickHospital is null");
            return (Criteria) this;
        }

        public Criteria andSickhospitalIsNotNull() {
            addCriterion("sickHospital is not null");
            return (Criteria) this;
        }

        public Criteria andSickhospitalEqualTo(String value) {
            addCriterion("sickHospital =", value, "sickhospital");
            return (Criteria) this;
        }

        public Criteria andSickhospitalNotEqualTo(String value) {
            addCriterion("sickHospital <>", value, "sickhospital");
            return (Criteria) this;
        }

        public Criteria andSickhospitalGreaterThan(String value) {
            addCriterion("sickHospital >", value, "sickhospital");
            return (Criteria) this;
        }

        public Criteria andSickhospitalGreaterThanOrEqualTo(String value) {
            addCriterion("sickHospital >=", value, "sickhospital");
            return (Criteria) this;
        }

        public Criteria andSickhospitalLessThan(String value) {
            addCriterion("sickHospital <", value, "sickhospital");
            return (Criteria) this;
        }

        public Criteria andSickhospitalLessThanOrEqualTo(String value) {
            addCriterion("sickHospital <=", value, "sickhospital");
            return (Criteria) this;
        }

        public Criteria andSickhospitalLike(String value) {
            addCriterion("sickHospital like", value, "sickhospital");
            return (Criteria) this;
        }

        public Criteria andSickhospitalNotLike(String value) {
            addCriterion("sickHospital not like", value, "sickhospital");
            return (Criteria) this;
        }

        public Criteria andSickhospitalIn(List<String> values) {
            addCriterion("sickHospital in", values, "sickhospital");
            return (Criteria) this;
        }

        public Criteria andSickhospitalNotIn(List<String> values) {
            addCriterion("sickHospital not in", values, "sickhospital");
            return (Criteria) this;
        }

        public Criteria andSickhospitalBetween(String value1, String value2) {
            addCriterion("sickHospital between", value1, value2, "sickhospital");
            return (Criteria) this;
        }

        public Criteria andSickhospitalNotBetween(String value1, String value2) {
            addCriterion("sickHospital not between", value1, value2, "sickhospital");
            return (Criteria) this;
        }

        public Criteria andSicktypeIsNull() {
            addCriterion("sickType is null");
            return (Criteria) this;
        }

        public Criteria andSicktypeIsNotNull() {
            addCriterion("sickType is not null");
            return (Criteria) this;
        }

        public Criteria andSicktypeEqualTo(String value) {
            addCriterion("sickType =", value, "sicktype");
            return (Criteria) this;
        }

        public Criteria andSicktypeNotEqualTo(String value) {
            addCriterion("sickType <>", value, "sicktype");
            return (Criteria) this;
        }

        public Criteria andSicktypeGreaterThan(String value) {
            addCriterion("sickType >", value, "sicktype");
            return (Criteria) this;
        }

        public Criteria andSicktypeGreaterThanOrEqualTo(String value) {
            addCriterion("sickType >=", value, "sicktype");
            return (Criteria) this;
        }

        public Criteria andSicktypeLessThan(String value) {
            addCriterion("sickType <", value, "sicktype");
            return (Criteria) this;
        }

        public Criteria andSicktypeLessThanOrEqualTo(String value) {
            addCriterion("sickType <=", value, "sicktype");
            return (Criteria) this;
        }

        public Criteria andSicktypeLike(String value) {
            addCriterion("sickType like", value, "sicktype");
            return (Criteria) this;
        }

        public Criteria andSicktypeNotLike(String value) {
            addCriterion("sickType not like", value, "sicktype");
            return (Criteria) this;
        }

        public Criteria andSicktypeIn(List<String> values) {
            addCriterion("sickType in", values, "sicktype");
            return (Criteria) this;
        }

        public Criteria andSicktypeNotIn(List<String> values) {
            addCriterion("sickType not in", values, "sicktype");
            return (Criteria) this;
        }

        public Criteria andSicktypeBetween(String value1, String value2) {
            addCriterion("sickType between", value1, value2, "sicktype");
            return (Criteria) this;
        }

        public Criteria andSicktypeNotBetween(String value1, String value2) {
            addCriterion("sickType not between", value1, value2, "sicktype");
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