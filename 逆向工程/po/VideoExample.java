package com.sds.em.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class VideoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public VideoExample() {
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

        public Criteria andVideoidIsNull() {
            addCriterion("videoId is null");
            return (Criteria) this;
        }

        public Criteria andVideoidIsNotNull() {
            addCriterion("videoId is not null");
            return (Criteria) this;
        }

        public Criteria andVideoidEqualTo(Integer value) {
            addCriterion("videoId =", value, "videoid");
            return (Criteria) this;
        }

        public Criteria andVideoidNotEqualTo(Integer value) {
            addCriterion("videoId <>", value, "videoid");
            return (Criteria) this;
        }

        public Criteria andVideoidGreaterThan(Integer value) {
            addCriterion("videoId >", value, "videoid");
            return (Criteria) this;
        }

        public Criteria andVideoidGreaterThanOrEqualTo(Integer value) {
            addCriterion("videoId >=", value, "videoid");
            return (Criteria) this;
        }

        public Criteria andVideoidLessThan(Integer value) {
            addCriterion("videoId <", value, "videoid");
            return (Criteria) this;
        }

        public Criteria andVideoidLessThanOrEqualTo(Integer value) {
            addCriterion("videoId <=", value, "videoid");
            return (Criteria) this;
        }

        public Criteria andVideoidIn(List<Integer> values) {
            addCriterion("videoId in", values, "videoid");
            return (Criteria) this;
        }

        public Criteria andVideoidNotIn(List<Integer> values) {
            addCriterion("videoId not in", values, "videoid");
            return (Criteria) this;
        }

        public Criteria andVideoidBetween(Integer value1, Integer value2) {
            addCriterion("videoId between", value1, value2, "videoid");
            return (Criteria) this;
        }

        public Criteria andVideoidNotBetween(Integer value1, Integer value2) {
            addCriterion("videoId not between", value1, value2, "videoid");
            return (Criteria) this;
        }

        public Criteria andVideopicurlIsNull() {
            addCriterion("videoPicUrl is null");
            return (Criteria) this;
        }

        public Criteria andVideopicurlIsNotNull() {
            addCriterion("videoPicUrl is not null");
            return (Criteria) this;
        }

        public Criteria andVideopicurlEqualTo(String value) {
            addCriterion("videoPicUrl =", value, "videopicurl");
            return (Criteria) this;
        }

        public Criteria andVideopicurlNotEqualTo(String value) {
            addCriterion("videoPicUrl <>", value, "videopicurl");
            return (Criteria) this;
        }

        public Criteria andVideopicurlGreaterThan(String value) {
            addCriterion("videoPicUrl >", value, "videopicurl");
            return (Criteria) this;
        }

        public Criteria andVideopicurlGreaterThanOrEqualTo(String value) {
            addCriterion("videoPicUrl >=", value, "videopicurl");
            return (Criteria) this;
        }

        public Criteria andVideopicurlLessThan(String value) {
            addCriterion("videoPicUrl <", value, "videopicurl");
            return (Criteria) this;
        }

        public Criteria andVideopicurlLessThanOrEqualTo(String value) {
            addCriterion("videoPicUrl <=", value, "videopicurl");
            return (Criteria) this;
        }

        public Criteria andVideopicurlLike(String value) {
            addCriterion("videoPicUrl like", value, "videopicurl");
            return (Criteria) this;
        }

        public Criteria andVideopicurlNotLike(String value) {
            addCriterion("videoPicUrl not like", value, "videopicurl");
            return (Criteria) this;
        }

        public Criteria andVideopicurlIn(List<String> values) {
            addCriterion("videoPicUrl in", values, "videopicurl");
            return (Criteria) this;
        }

        public Criteria andVideopicurlNotIn(List<String> values) {
            addCriterion("videoPicUrl not in", values, "videopicurl");
            return (Criteria) this;
        }

        public Criteria andVideopicurlBetween(String value1, String value2) {
            addCriterion("videoPicUrl between", value1, value2, "videopicurl");
            return (Criteria) this;
        }

        public Criteria andVideopicurlNotBetween(String value1, String value2) {
            addCriterion("videoPicUrl not between", value1, value2, "videopicurl");
            return (Criteria) this;
        }

        public Criteria andVideourlIsNull() {
            addCriterion("videoUrl is null");
            return (Criteria) this;
        }

        public Criteria andVideourlIsNotNull() {
            addCriterion("videoUrl is not null");
            return (Criteria) this;
        }

        public Criteria andVideourlEqualTo(String value) {
            addCriterion("videoUrl =", value, "videourl");
            return (Criteria) this;
        }

        public Criteria andVideourlNotEqualTo(String value) {
            addCriterion("videoUrl <>", value, "videourl");
            return (Criteria) this;
        }

        public Criteria andVideourlGreaterThan(String value) {
            addCriterion("videoUrl >", value, "videourl");
            return (Criteria) this;
        }

        public Criteria andVideourlGreaterThanOrEqualTo(String value) {
            addCriterion("videoUrl >=", value, "videourl");
            return (Criteria) this;
        }

        public Criteria andVideourlLessThan(String value) {
            addCriterion("videoUrl <", value, "videourl");
            return (Criteria) this;
        }

        public Criteria andVideourlLessThanOrEqualTo(String value) {
            addCriterion("videoUrl <=", value, "videourl");
            return (Criteria) this;
        }

        public Criteria andVideourlLike(String value) {
            addCriterion("videoUrl like", value, "videourl");
            return (Criteria) this;
        }

        public Criteria andVideourlNotLike(String value) {
            addCriterion("videoUrl not like", value, "videourl");
            return (Criteria) this;
        }

        public Criteria andVideourlIn(List<String> values) {
            addCriterion("videoUrl in", values, "videourl");
            return (Criteria) this;
        }

        public Criteria andVideourlNotIn(List<String> values) {
            addCriterion("videoUrl not in", values, "videourl");
            return (Criteria) this;
        }

        public Criteria andVideourlBetween(String value1, String value2) {
            addCriterion("videoUrl between", value1, value2, "videourl");
            return (Criteria) this;
        }

        public Criteria andVideourlNotBetween(String value1, String value2) {
            addCriterion("videoUrl not between", value1, value2, "videourl");
            return (Criteria) this;
        }

        public Criteria andVideonameIsNull() {
            addCriterion("videoName is null");
            return (Criteria) this;
        }

        public Criteria andVideonameIsNotNull() {
            addCriterion("videoName is not null");
            return (Criteria) this;
        }

        public Criteria andVideonameEqualTo(String value) {
            addCriterion("videoName =", value, "videoname");
            return (Criteria) this;
        }

        public Criteria andVideonameNotEqualTo(String value) {
            addCriterion("videoName <>", value, "videoname");
            return (Criteria) this;
        }

        public Criteria andVideonameGreaterThan(String value) {
            addCriterion("videoName >", value, "videoname");
            return (Criteria) this;
        }

        public Criteria andVideonameGreaterThanOrEqualTo(String value) {
            addCriterion("videoName >=", value, "videoname");
            return (Criteria) this;
        }

        public Criteria andVideonameLessThan(String value) {
            addCriterion("videoName <", value, "videoname");
            return (Criteria) this;
        }

        public Criteria andVideonameLessThanOrEqualTo(String value) {
            addCriterion("videoName <=", value, "videoname");
            return (Criteria) this;
        }

        public Criteria andVideonameLike(String value) {
            addCriterion("videoName like", value, "videoname");
            return (Criteria) this;
        }

        public Criteria andVideonameNotLike(String value) {
            addCriterion("videoName not like", value, "videoname");
            return (Criteria) this;
        }

        public Criteria andVideonameIn(List<String> values) {
            addCriterion("videoName in", values, "videoname");
            return (Criteria) this;
        }

        public Criteria andVideonameNotIn(List<String> values) {
            addCriterion("videoName not in", values, "videoname");
            return (Criteria) this;
        }

        public Criteria andVideonameBetween(String value1, String value2) {
            addCriterion("videoName between", value1, value2, "videoname");
            return (Criteria) this;
        }

        public Criteria andVideonameNotBetween(String value1, String value2) {
            addCriterion("videoName not between", value1, value2, "videoname");
            return (Criteria) this;
        }

        public Criteria andVideointroIsNull() {
            addCriterion("videoIntro is null");
            return (Criteria) this;
        }

        public Criteria andVideointroIsNotNull() {
            addCriterion("videoIntro is not null");
            return (Criteria) this;
        }

        public Criteria andVideointroEqualTo(String value) {
            addCriterion("videoIntro =", value, "videointro");
            return (Criteria) this;
        }

        public Criteria andVideointroNotEqualTo(String value) {
            addCriterion("videoIntro <>", value, "videointro");
            return (Criteria) this;
        }

        public Criteria andVideointroGreaterThan(String value) {
            addCriterion("videoIntro >", value, "videointro");
            return (Criteria) this;
        }

        public Criteria andVideointroGreaterThanOrEqualTo(String value) {
            addCriterion("videoIntro >=", value, "videointro");
            return (Criteria) this;
        }

        public Criteria andVideointroLessThan(String value) {
            addCriterion("videoIntro <", value, "videointro");
            return (Criteria) this;
        }

        public Criteria andVideointroLessThanOrEqualTo(String value) {
            addCriterion("videoIntro <=", value, "videointro");
            return (Criteria) this;
        }

        public Criteria andVideointroLike(String value) {
            addCriterion("videoIntro like", value, "videointro");
            return (Criteria) this;
        }

        public Criteria andVideointroNotLike(String value) {
            addCriterion("videoIntro not like", value, "videointro");
            return (Criteria) this;
        }

        public Criteria andVideointroIn(List<String> values) {
            addCriterion("videoIntro in", values, "videointro");
            return (Criteria) this;
        }

        public Criteria andVideointroNotIn(List<String> values) {
            addCriterion("videoIntro not in", values, "videointro");
            return (Criteria) this;
        }

        public Criteria andVideointroBetween(String value1, String value2) {
            addCriterion("videoIntro between", value1, value2, "videointro");
            return (Criteria) this;
        }

        public Criteria andVideointroNotBetween(String value1, String value2) {
            addCriterion("videoIntro not between", value1, value2, "videointro");
            return (Criteria) this;
        }

        public Criteria andVideodetailIsNull() {
            addCriterion("videoDetail is null");
            return (Criteria) this;
        }

        public Criteria andVideodetailIsNotNull() {
            addCriterion("videoDetail is not null");
            return (Criteria) this;
        }

        public Criteria andVideodetailEqualTo(String value) {
            addCriterion("videoDetail =", value, "videodetail");
            return (Criteria) this;
        }

        public Criteria andVideodetailNotEqualTo(String value) {
            addCriterion("videoDetail <>", value, "videodetail");
            return (Criteria) this;
        }

        public Criteria andVideodetailGreaterThan(String value) {
            addCriterion("videoDetail >", value, "videodetail");
            return (Criteria) this;
        }

        public Criteria andVideodetailGreaterThanOrEqualTo(String value) {
            addCriterion("videoDetail >=", value, "videodetail");
            return (Criteria) this;
        }

        public Criteria andVideodetailLessThan(String value) {
            addCriterion("videoDetail <", value, "videodetail");
            return (Criteria) this;
        }

        public Criteria andVideodetailLessThanOrEqualTo(String value) {
            addCriterion("videoDetail <=", value, "videodetail");
            return (Criteria) this;
        }

        public Criteria andVideodetailLike(String value) {
            addCriterion("videoDetail like", value, "videodetail");
            return (Criteria) this;
        }

        public Criteria andVideodetailNotLike(String value) {
            addCriterion("videoDetail not like", value, "videodetail");
            return (Criteria) this;
        }

        public Criteria andVideodetailIn(List<String> values) {
            addCriterion("videoDetail in", values, "videodetail");
            return (Criteria) this;
        }

        public Criteria andVideodetailNotIn(List<String> values) {
            addCriterion("videoDetail not in", values, "videodetail");
            return (Criteria) this;
        }

        public Criteria andVideodetailBetween(String value1, String value2) {
            addCriterion("videoDetail between", value1, value2, "videodetail");
            return (Criteria) this;
        }

        public Criteria andVideodetailNotBetween(String value1, String value2) {
            addCriterion("videoDetail not between", value1, value2, "videodetail");
            return (Criteria) this;
        }

        public Criteria andVideotimeIsNull() {
            addCriterion("videoTime is null");
            return (Criteria) this;
        }

        public Criteria andVideotimeIsNotNull() {
            addCriterion("videoTime is not null");
            return (Criteria) this;
        }

        public Criteria andVideotimeEqualTo(Float value) {
            addCriterion("videoTime =", value, "videotime");
            return (Criteria) this;
        }

        public Criteria andVideotimeNotEqualTo(Float value) {
            addCriterion("videoTime <>", value, "videotime");
            return (Criteria) this;
        }

        public Criteria andVideotimeGreaterThan(Float value) {
            addCriterion("videoTime >", value, "videotime");
            return (Criteria) this;
        }

        public Criteria andVideotimeGreaterThanOrEqualTo(Float value) {
            addCriterion("videoTime >=", value, "videotime");
            return (Criteria) this;
        }

        public Criteria andVideotimeLessThan(Float value) {
            addCriterion("videoTime <", value, "videotime");
            return (Criteria) this;
        }

        public Criteria andVideotimeLessThanOrEqualTo(Float value) {
            addCriterion("videoTime <=", value, "videotime");
            return (Criteria) this;
        }

        public Criteria andVideotimeIn(List<Float> values) {
            addCriterion("videoTime in", values, "videotime");
            return (Criteria) this;
        }

        public Criteria andVideotimeNotIn(List<Float> values) {
            addCriterion("videoTime not in", values, "videotime");
            return (Criteria) this;
        }

        public Criteria andVideotimeBetween(Float value1, Float value2) {
            addCriterion("videoTime between", value1, value2, "videotime");
            return (Criteria) this;
        }

        public Criteria andVideotimeNotBetween(Float value1, Float value2) {
            addCriterion("videoTime not between", value1, value2, "videotime");
            return (Criteria) this;
        }

        public Criteria andVideopublishdateIsNull() {
            addCriterion("videoPublishDate is null");
            return (Criteria) this;
        }

        public Criteria andVideopublishdateIsNotNull() {
            addCriterion("videoPublishDate is not null");
            return (Criteria) this;
        }

        public Criteria andVideopublishdateEqualTo(Date value) {
            addCriterionForJDBCDate("videoPublishDate =", value, "videopublishdate");
            return (Criteria) this;
        }

        public Criteria andVideopublishdateNotEqualTo(Date value) {
            addCriterionForJDBCDate("videoPublishDate <>", value, "videopublishdate");
            return (Criteria) this;
        }

        public Criteria andVideopublishdateGreaterThan(Date value) {
            addCriterionForJDBCDate("videoPublishDate >", value, "videopublishdate");
            return (Criteria) this;
        }

        public Criteria andVideopublishdateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("videoPublishDate >=", value, "videopublishdate");
            return (Criteria) this;
        }

        public Criteria andVideopublishdateLessThan(Date value) {
            addCriterionForJDBCDate("videoPublishDate <", value, "videopublishdate");
            return (Criteria) this;
        }

        public Criteria andVideopublishdateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("videoPublishDate <=", value, "videopublishdate");
            return (Criteria) this;
        }

        public Criteria andVideopublishdateIn(List<Date> values) {
            addCriterionForJDBCDate("videoPublishDate in", values, "videopublishdate");
            return (Criteria) this;
        }

        public Criteria andVideopublishdateNotIn(List<Date> values) {
            addCriterionForJDBCDate("videoPublishDate not in", values, "videopublishdate");
            return (Criteria) this;
        }

        public Criteria andVideopublishdateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("videoPublishDate between", value1, value2, "videopublishdate");
            return (Criteria) this;
        }

        public Criteria andVideopublishdateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("videoPublishDate not between", value1, value2, "videopublishdate");
            return (Criteria) this;
        }

        public Criteria andVideoheatIsNull() {
            addCriterion("videoHeat is null");
            return (Criteria) this;
        }

        public Criteria andVideoheatIsNotNull() {
            addCriterion("videoHeat is not null");
            return (Criteria) this;
        }

        public Criteria andVideoheatEqualTo(Integer value) {
            addCriterion("videoHeat =", value, "videoheat");
            return (Criteria) this;
        }

        public Criteria andVideoheatNotEqualTo(Integer value) {
            addCriterion("videoHeat <>", value, "videoheat");
            return (Criteria) this;
        }

        public Criteria andVideoheatGreaterThan(Integer value) {
            addCriterion("videoHeat >", value, "videoheat");
            return (Criteria) this;
        }

        public Criteria andVideoheatGreaterThanOrEqualTo(Integer value) {
            addCriterion("videoHeat >=", value, "videoheat");
            return (Criteria) this;
        }

        public Criteria andVideoheatLessThan(Integer value) {
            addCriterion("videoHeat <", value, "videoheat");
            return (Criteria) this;
        }

        public Criteria andVideoheatLessThanOrEqualTo(Integer value) {
            addCriterion("videoHeat <=", value, "videoheat");
            return (Criteria) this;
        }

        public Criteria andVideoheatIn(List<Integer> values) {
            addCriterion("videoHeat in", values, "videoheat");
            return (Criteria) this;
        }

        public Criteria andVideoheatNotIn(List<Integer> values) {
            addCriterion("videoHeat not in", values, "videoheat");
            return (Criteria) this;
        }

        public Criteria andVideoheatBetween(Integer value1, Integer value2) {
            addCriterion("videoHeat between", value1, value2, "videoheat");
            return (Criteria) this;
        }

        public Criteria andVideoheatNotBetween(Integer value1, Integer value2) {
            addCriterion("videoHeat not between", value1, value2, "videoheat");
            return (Criteria) this;
        }

        public Criteria andVideostatusIsNull() {
            addCriterion("videoStatus is null");
            return (Criteria) this;
        }

        public Criteria andVideostatusIsNotNull() {
            addCriterion("videoStatus is not null");
            return (Criteria) this;
        }

        public Criteria andVideostatusEqualTo(Integer value) {
            addCriterion("videoStatus =", value, "videostatus");
            return (Criteria) this;
        }

        public Criteria andVideostatusNotEqualTo(Integer value) {
            addCriterion("videoStatus <>", value, "videostatus");
            return (Criteria) this;
        }

        public Criteria andVideostatusGreaterThan(Integer value) {
            addCriterion("videoStatus >", value, "videostatus");
            return (Criteria) this;
        }

        public Criteria andVideostatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("videoStatus >=", value, "videostatus");
            return (Criteria) this;
        }

        public Criteria andVideostatusLessThan(Integer value) {
            addCriterion("videoStatus <", value, "videostatus");
            return (Criteria) this;
        }

        public Criteria andVideostatusLessThanOrEqualTo(Integer value) {
            addCriterion("videoStatus <=", value, "videostatus");
            return (Criteria) this;
        }

        public Criteria andVideostatusIn(List<Integer> values) {
            addCriterion("videoStatus in", values, "videostatus");
            return (Criteria) this;
        }

        public Criteria andVideostatusNotIn(List<Integer> values) {
            addCriterion("videoStatus not in", values, "videostatus");
            return (Criteria) this;
        }

        public Criteria andVideostatusBetween(Integer value1, Integer value2) {
            addCriterion("videoStatus between", value1, value2, "videostatus");
            return (Criteria) this;
        }

        public Criteria andVideostatusNotBetween(Integer value1, Integer value2) {
            addCriterion("videoStatus not between", value1, value2, "videostatus");
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