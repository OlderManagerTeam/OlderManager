package com.sds.em.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class LectureExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public LectureExample() {
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

        public Criteria andLectureidIsNull() {
            addCriterion("lectureId is null");
            return (Criteria) this;
        }

        public Criteria andLectureidIsNotNull() {
            addCriterion("lectureId is not null");
            return (Criteria) this;
        }

        public Criteria andLectureidEqualTo(Integer value) {
            addCriterion("lectureId =", value, "lectureid");
            return (Criteria) this;
        }

        public Criteria andLectureidNotEqualTo(Integer value) {
            addCriterion("lectureId <>", value, "lectureid");
            return (Criteria) this;
        }

        public Criteria andLectureidGreaterThan(Integer value) {
            addCriterion("lectureId >", value, "lectureid");
            return (Criteria) this;
        }

        public Criteria andLectureidGreaterThanOrEqualTo(Integer value) {
            addCriterion("lectureId >=", value, "lectureid");
            return (Criteria) this;
        }

        public Criteria andLectureidLessThan(Integer value) {
            addCriterion("lectureId <", value, "lectureid");
            return (Criteria) this;
        }

        public Criteria andLectureidLessThanOrEqualTo(Integer value) {
            addCriterion("lectureId <=", value, "lectureid");
            return (Criteria) this;
        }

        public Criteria andLectureidIn(List<Integer> values) {
            addCriterion("lectureId in", values, "lectureid");
            return (Criteria) this;
        }

        public Criteria andLectureidNotIn(List<Integer> values) {
            addCriterion("lectureId not in", values, "lectureid");
            return (Criteria) this;
        }

        public Criteria andLectureidBetween(Integer value1, Integer value2) {
            addCriterion("lectureId between", value1, value2, "lectureid");
            return (Criteria) this;
        }

        public Criteria andLectureidNotBetween(Integer value1, Integer value2) {
            addCriterion("lectureId not between", value1, value2, "lectureid");
            return (Criteria) this;
        }

        public Criteria andLecturenameIsNull() {
            addCriterion("lectureName is null");
            return (Criteria) this;
        }

        public Criteria andLecturenameIsNotNull() {
            addCriterion("lectureName is not null");
            return (Criteria) this;
        }

        public Criteria andLecturenameEqualTo(String value) {
            addCriterion("lectureName =", value, "lecturename");
            return (Criteria) this;
        }

        public Criteria andLecturenameNotEqualTo(String value) {
            addCriterion("lectureName <>", value, "lecturename");
            return (Criteria) this;
        }

        public Criteria andLecturenameGreaterThan(String value) {
            addCriterion("lectureName >", value, "lecturename");
            return (Criteria) this;
        }

        public Criteria andLecturenameGreaterThanOrEqualTo(String value) {
            addCriterion("lectureName >=", value, "lecturename");
            return (Criteria) this;
        }

        public Criteria andLecturenameLessThan(String value) {
            addCriterion("lectureName <", value, "lecturename");
            return (Criteria) this;
        }

        public Criteria andLecturenameLessThanOrEqualTo(String value) {
            addCriterion("lectureName <=", value, "lecturename");
            return (Criteria) this;
        }

        public Criteria andLecturenameLike(String value) {
            addCriterion("lectureName like", value, "lecturename");
            return (Criteria) this;
        }

        public Criteria andLecturenameNotLike(String value) {
            addCriterion("lectureName not like", value, "lecturename");
            return (Criteria) this;
        }

        public Criteria andLecturenameIn(List<String> values) {
            addCriterion("lectureName in", values, "lecturename");
            return (Criteria) this;
        }

        public Criteria andLecturenameNotIn(List<String> values) {
            addCriterion("lectureName not in", values, "lecturename");
            return (Criteria) this;
        }

        public Criteria andLecturenameBetween(String value1, String value2) {
            addCriterion("lectureName between", value1, value2, "lecturename");
            return (Criteria) this;
        }

        public Criteria andLecturenameNotBetween(String value1, String value2) {
            addCriterion("lectureName not between", value1, value2, "lecturename");
            return (Criteria) this;
        }

        public Criteria andLectureintroIsNull() {
            addCriterion("lectureIntro is null");
            return (Criteria) this;
        }

        public Criteria andLectureintroIsNotNull() {
            addCriterion("lectureIntro is not null");
            return (Criteria) this;
        }

        public Criteria andLectureintroEqualTo(String value) {
            addCriterion("lectureIntro =", value, "lectureintro");
            return (Criteria) this;
        }

        public Criteria andLectureintroNotEqualTo(String value) {
            addCriterion("lectureIntro <>", value, "lectureintro");
            return (Criteria) this;
        }

        public Criteria andLectureintroGreaterThan(String value) {
            addCriterion("lectureIntro >", value, "lectureintro");
            return (Criteria) this;
        }

        public Criteria andLectureintroGreaterThanOrEqualTo(String value) {
            addCriterion("lectureIntro >=", value, "lectureintro");
            return (Criteria) this;
        }

        public Criteria andLectureintroLessThan(String value) {
            addCriterion("lectureIntro <", value, "lectureintro");
            return (Criteria) this;
        }

        public Criteria andLectureintroLessThanOrEqualTo(String value) {
            addCriterion("lectureIntro <=", value, "lectureintro");
            return (Criteria) this;
        }

        public Criteria andLectureintroLike(String value) {
            addCriterion("lectureIntro like", value, "lectureintro");
            return (Criteria) this;
        }

        public Criteria andLectureintroNotLike(String value) {
            addCriterion("lectureIntro not like", value, "lectureintro");
            return (Criteria) this;
        }

        public Criteria andLectureintroIn(List<String> values) {
            addCriterion("lectureIntro in", values, "lectureintro");
            return (Criteria) this;
        }

        public Criteria andLectureintroNotIn(List<String> values) {
            addCriterion("lectureIntro not in", values, "lectureintro");
            return (Criteria) this;
        }

        public Criteria andLectureintroBetween(String value1, String value2) {
            addCriterion("lectureIntro between", value1, value2, "lectureintro");
            return (Criteria) this;
        }

        public Criteria andLectureintroNotBetween(String value1, String value2) {
            addCriterion("lectureIntro not between", value1, value2, "lectureintro");
            return (Criteria) this;
        }

        public Criteria andLectureenrollIsNull() {
            addCriterion("lectureEnroll is null");
            return (Criteria) this;
        }

        public Criteria andLectureenrollIsNotNull() {
            addCriterion("lectureEnroll is not null");
            return (Criteria) this;
        }

        public Criteria andLectureenrollEqualTo(Integer value) {
            addCriterion("lectureEnroll =", value, "lectureenroll");
            return (Criteria) this;
        }

        public Criteria andLectureenrollNotEqualTo(Integer value) {
            addCriterion("lectureEnroll <>", value, "lectureenroll");
            return (Criteria) this;
        }

        public Criteria andLectureenrollGreaterThan(Integer value) {
            addCriterion("lectureEnroll >", value, "lectureenroll");
            return (Criteria) this;
        }

        public Criteria andLectureenrollGreaterThanOrEqualTo(Integer value) {
            addCriterion("lectureEnroll >=", value, "lectureenroll");
            return (Criteria) this;
        }

        public Criteria andLectureenrollLessThan(Integer value) {
            addCriterion("lectureEnroll <", value, "lectureenroll");
            return (Criteria) this;
        }

        public Criteria andLectureenrollLessThanOrEqualTo(Integer value) {
            addCriterion("lectureEnroll <=", value, "lectureenroll");
            return (Criteria) this;
        }

        public Criteria andLectureenrollIn(List<Integer> values) {
            addCriterion("lectureEnroll in", values, "lectureenroll");
            return (Criteria) this;
        }

        public Criteria andLectureenrollNotIn(List<Integer> values) {
            addCriterion("lectureEnroll not in", values, "lectureenroll");
            return (Criteria) this;
        }

        public Criteria andLectureenrollBetween(Integer value1, Integer value2) {
            addCriterion("lectureEnroll between", value1, value2, "lectureenroll");
            return (Criteria) this;
        }

        public Criteria andLectureenrollNotBetween(Integer value1, Integer value2) {
            addCriterion("lectureEnroll not between", value1, value2, "lectureenroll");
            return (Criteria) this;
        }

        public Criteria andLecturetotalIsNull() {
            addCriterion("lectureTotal is null");
            return (Criteria) this;
        }

        public Criteria andLecturetotalIsNotNull() {
            addCriterion("lectureTotal is not null");
            return (Criteria) this;
        }

        public Criteria andLecturetotalEqualTo(Integer value) {
            addCriterion("lectureTotal =", value, "lecturetotal");
            return (Criteria) this;
        }

        public Criteria andLecturetotalNotEqualTo(Integer value) {
            addCriterion("lectureTotal <>", value, "lecturetotal");
            return (Criteria) this;
        }

        public Criteria andLecturetotalGreaterThan(Integer value) {
            addCriterion("lectureTotal >", value, "lecturetotal");
            return (Criteria) this;
        }

        public Criteria andLecturetotalGreaterThanOrEqualTo(Integer value) {
            addCriterion("lectureTotal >=", value, "lecturetotal");
            return (Criteria) this;
        }

        public Criteria andLecturetotalLessThan(Integer value) {
            addCriterion("lectureTotal <", value, "lecturetotal");
            return (Criteria) this;
        }

        public Criteria andLecturetotalLessThanOrEqualTo(Integer value) {
            addCriterion("lectureTotal <=", value, "lecturetotal");
            return (Criteria) this;
        }

        public Criteria andLecturetotalIn(List<Integer> values) {
            addCriterion("lectureTotal in", values, "lecturetotal");
            return (Criteria) this;
        }

        public Criteria andLecturetotalNotIn(List<Integer> values) {
            addCriterion("lectureTotal not in", values, "lecturetotal");
            return (Criteria) this;
        }

        public Criteria andLecturetotalBetween(Integer value1, Integer value2) {
            addCriterion("lectureTotal between", value1, value2, "lecturetotal");
            return (Criteria) this;
        }

        public Criteria andLecturetotalNotBetween(Integer value1, Integer value2) {
            addCriterion("lectureTotal not between", value1, value2, "lecturetotal");
            return (Criteria) this;
        }

        public Criteria andLecturepublishdateIsNull() {
            addCriterion("lecturePublishDate is null");
            return (Criteria) this;
        }

        public Criteria andLecturepublishdateIsNotNull() {
            addCriterion("lecturePublishDate is not null");
            return (Criteria) this;
        }

        public Criteria andLecturepublishdateEqualTo(Date value) {
            addCriterionForJDBCDate("lecturePublishDate =", value, "lecturepublishdate");
            return (Criteria) this;
        }

        public Criteria andLecturepublishdateNotEqualTo(Date value) {
            addCriterionForJDBCDate("lecturePublishDate <>", value, "lecturepublishdate");
            return (Criteria) this;
        }

        public Criteria andLecturepublishdateGreaterThan(Date value) {
            addCriterionForJDBCDate("lecturePublishDate >", value, "lecturepublishdate");
            return (Criteria) this;
        }

        public Criteria andLecturepublishdateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("lecturePublishDate >=", value, "lecturepublishdate");
            return (Criteria) this;
        }

        public Criteria andLecturepublishdateLessThan(Date value) {
            addCriterionForJDBCDate("lecturePublishDate <", value, "lecturepublishdate");
            return (Criteria) this;
        }

        public Criteria andLecturepublishdateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("lecturePublishDate <=", value, "lecturepublishdate");
            return (Criteria) this;
        }

        public Criteria andLecturepublishdateIn(List<Date> values) {
            addCriterionForJDBCDate("lecturePublishDate in", values, "lecturepublishdate");
            return (Criteria) this;
        }

        public Criteria andLecturepublishdateNotIn(List<Date> values) {
            addCriterionForJDBCDate("lecturePublishDate not in", values, "lecturepublishdate");
            return (Criteria) this;
        }

        public Criteria andLecturepublishdateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("lecturePublishDate between", value1, value2, "lecturepublishdate");
            return (Criteria) this;
        }

        public Criteria andLecturepublishdateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("lecturePublishDate not between", value1, value2, "lecturepublishdate");
            return (Criteria) this;
        }

        public Criteria andLecturestatusIsNull() {
            addCriterion("lectureStatus is null");
            return (Criteria) this;
        }

        public Criteria andLecturestatusIsNotNull() {
            addCriterion("lectureStatus is not null");
            return (Criteria) this;
        }

        public Criteria andLecturestatusEqualTo(Integer value) {
            addCriterion("lectureStatus =", value, "lecturestatus");
            return (Criteria) this;
        }

        public Criteria andLecturestatusNotEqualTo(Integer value) {
            addCriterion("lectureStatus <>", value, "lecturestatus");
            return (Criteria) this;
        }

        public Criteria andLecturestatusGreaterThan(Integer value) {
            addCriterion("lectureStatus >", value, "lecturestatus");
            return (Criteria) this;
        }

        public Criteria andLecturestatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("lectureStatus >=", value, "lecturestatus");
            return (Criteria) this;
        }

        public Criteria andLecturestatusLessThan(Integer value) {
            addCriterion("lectureStatus <", value, "lecturestatus");
            return (Criteria) this;
        }

        public Criteria andLecturestatusLessThanOrEqualTo(Integer value) {
            addCriterion("lectureStatus <=", value, "lecturestatus");
            return (Criteria) this;
        }

        public Criteria andLecturestatusIn(List<Integer> values) {
            addCriterion("lectureStatus in", values, "lecturestatus");
            return (Criteria) this;
        }

        public Criteria andLecturestatusNotIn(List<Integer> values) {
            addCriterion("lectureStatus not in", values, "lecturestatus");
            return (Criteria) this;
        }

        public Criteria andLecturestatusBetween(Integer value1, Integer value2) {
            addCriterion("lectureStatus between", value1, value2, "lecturestatus");
            return (Criteria) this;
        }

        public Criteria andLecturestatusNotBetween(Integer value1, Integer value2) {
            addCriterion("lectureStatus not between", value1, value2, "lecturestatus");
            return (Criteria) this;
        }

        public Criteria andLectureaddressIsNull() {
            addCriterion("lectureAddress is null");
            return (Criteria) this;
        }

        public Criteria andLectureaddressIsNotNull() {
            addCriterion("lectureAddress is not null");
            return (Criteria) this;
        }

        public Criteria andLectureaddressEqualTo(String value) {
            addCriterion("lectureAddress =", value, "lectureaddress");
            return (Criteria) this;
        }

        public Criteria andLectureaddressNotEqualTo(String value) {
            addCriterion("lectureAddress <>", value, "lectureaddress");
            return (Criteria) this;
        }

        public Criteria andLectureaddressGreaterThan(String value) {
            addCriterion("lectureAddress >", value, "lectureaddress");
            return (Criteria) this;
        }

        public Criteria andLectureaddressGreaterThanOrEqualTo(String value) {
            addCriterion("lectureAddress >=", value, "lectureaddress");
            return (Criteria) this;
        }

        public Criteria andLectureaddressLessThan(String value) {
            addCriterion("lectureAddress <", value, "lectureaddress");
            return (Criteria) this;
        }

        public Criteria andLectureaddressLessThanOrEqualTo(String value) {
            addCriterion("lectureAddress <=", value, "lectureaddress");
            return (Criteria) this;
        }

        public Criteria andLectureaddressLike(String value) {
            addCriterion("lectureAddress like", value, "lectureaddress");
            return (Criteria) this;
        }

        public Criteria andLectureaddressNotLike(String value) {
            addCriterion("lectureAddress not like", value, "lectureaddress");
            return (Criteria) this;
        }

        public Criteria andLectureaddressIn(List<String> values) {
            addCriterion("lectureAddress in", values, "lectureaddress");
            return (Criteria) this;
        }

        public Criteria andLectureaddressNotIn(List<String> values) {
            addCriterion("lectureAddress not in", values, "lectureaddress");
            return (Criteria) this;
        }

        public Criteria andLectureaddressBetween(String value1, String value2) {
            addCriterion("lectureAddress between", value1, value2, "lectureaddress");
            return (Criteria) this;
        }

        public Criteria andLectureaddressNotBetween(String value1, String value2) {
            addCriterion("lectureAddress not between", value1, value2, "lectureaddress");
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