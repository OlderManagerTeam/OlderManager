package com.sds.em.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class NewsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public NewsExample() {
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

        public Criteria andNewsidIsNull() {
            addCriterion("newsId is null");
            return (Criteria) this;
        }

        public Criteria andNewsidIsNotNull() {
            addCriterion("newsId is not null");
            return (Criteria) this;
        }

        public Criteria andNewsidEqualTo(Integer value) {
            addCriterion("newsId =", value, "newsid");
            return (Criteria) this;
        }

        public Criteria andNewsidNotEqualTo(Integer value) {
            addCriterion("newsId <>", value, "newsid");
            return (Criteria) this;
        }

        public Criteria andNewsidGreaterThan(Integer value) {
            addCriterion("newsId >", value, "newsid");
            return (Criteria) this;
        }

        public Criteria andNewsidGreaterThanOrEqualTo(Integer value) {
            addCriterion("newsId >=", value, "newsid");
            return (Criteria) this;
        }

        public Criteria andNewsidLessThan(Integer value) {
            addCriterion("newsId <", value, "newsid");
            return (Criteria) this;
        }

        public Criteria andNewsidLessThanOrEqualTo(Integer value) {
            addCriterion("newsId <=", value, "newsid");
            return (Criteria) this;
        }

        public Criteria andNewsidIn(List<Integer> values) {
            addCriterion("newsId in", values, "newsid");
            return (Criteria) this;
        }

        public Criteria andNewsidNotIn(List<Integer> values) {
            addCriterion("newsId not in", values, "newsid");
            return (Criteria) this;
        }

        public Criteria andNewsidBetween(Integer value1, Integer value2) {
            addCriterion("newsId between", value1, value2, "newsid");
            return (Criteria) this;
        }

        public Criteria andNewsidNotBetween(Integer value1, Integer value2) {
            addCriterion("newsId not between", value1, value2, "newsid");
            return (Criteria) this;
        }

        public Criteria andNewstitleIsNull() {
            addCriterion("newsTitle is null");
            return (Criteria) this;
        }

        public Criteria andNewstitleIsNotNull() {
            addCriterion("newsTitle is not null");
            return (Criteria) this;
        }

        public Criteria andNewstitleEqualTo(String value) {
            addCriterion("newsTitle =", value, "newstitle");
            return (Criteria) this;
        }

        public Criteria andNewstitleNotEqualTo(String value) {
            addCriterion("newsTitle <>", value, "newstitle");
            return (Criteria) this;
        }

        public Criteria andNewstitleGreaterThan(String value) {
            addCriterion("newsTitle >", value, "newstitle");
            return (Criteria) this;
        }

        public Criteria andNewstitleGreaterThanOrEqualTo(String value) {
            addCriterion("newsTitle >=", value, "newstitle");
            return (Criteria) this;
        }

        public Criteria andNewstitleLessThan(String value) {
            addCriterion("newsTitle <", value, "newstitle");
            return (Criteria) this;
        }

        public Criteria andNewstitleLessThanOrEqualTo(String value) {
            addCriterion("newsTitle <=", value, "newstitle");
            return (Criteria) this;
        }

        public Criteria andNewstitleLike(String value) {
            addCriterion("newsTitle like", value, "newstitle");
            return (Criteria) this;
        }

        public Criteria andNewstitleNotLike(String value) {
            addCriterion("newsTitle not like", value, "newstitle");
            return (Criteria) this;
        }

        public Criteria andNewstitleIn(List<String> values) {
            addCriterion("newsTitle in", values, "newstitle");
            return (Criteria) this;
        }

        public Criteria andNewstitleNotIn(List<String> values) {
            addCriterion("newsTitle not in", values, "newstitle");
            return (Criteria) this;
        }

        public Criteria andNewstitleBetween(String value1, String value2) {
            addCriterion("newsTitle between", value1, value2, "newstitle");
            return (Criteria) this;
        }

        public Criteria andNewstitleNotBetween(String value1, String value2) {
            addCriterion("newsTitle not between", value1, value2, "newstitle");
            return (Criteria) this;
        }

        public Criteria andNewstypeIsNull() {
            addCriterion("newsType is null");
            return (Criteria) this;
        }

        public Criteria andNewstypeIsNotNull() {
            addCriterion("newsType is not null");
            return (Criteria) this;
        }

        public Criteria andNewstypeEqualTo(String value) {
            addCriterion("newsType =", value, "newstype");
            return (Criteria) this;
        }

        public Criteria andNewstypeNotEqualTo(String value) {
            addCriterion("newsType <>", value, "newstype");
            return (Criteria) this;
        }

        public Criteria andNewstypeGreaterThan(String value) {
            addCriterion("newsType >", value, "newstype");
            return (Criteria) this;
        }

        public Criteria andNewstypeGreaterThanOrEqualTo(String value) {
            addCriterion("newsType >=", value, "newstype");
            return (Criteria) this;
        }

        public Criteria andNewstypeLessThan(String value) {
            addCriterion("newsType <", value, "newstype");
            return (Criteria) this;
        }

        public Criteria andNewstypeLessThanOrEqualTo(String value) {
            addCriterion("newsType <=", value, "newstype");
            return (Criteria) this;
        }

        public Criteria andNewstypeLike(String value) {
            addCriterion("newsType like", value, "newstype");
            return (Criteria) this;
        }

        public Criteria andNewstypeNotLike(String value) {
            addCriterion("newsType not like", value, "newstype");
            return (Criteria) this;
        }

        public Criteria andNewstypeIn(List<String> values) {
            addCriterion("newsType in", values, "newstype");
            return (Criteria) this;
        }

        public Criteria andNewstypeNotIn(List<String> values) {
            addCriterion("newsType not in", values, "newstype");
            return (Criteria) this;
        }

        public Criteria andNewstypeBetween(String value1, String value2) {
            addCriterion("newsType between", value1, value2, "newstype");
            return (Criteria) this;
        }

        public Criteria andNewstypeNotBetween(String value1, String value2) {
            addCriterion("newsType not between", value1, value2, "newstype");
            return (Criteria) this;
        }

        public Criteria andNewsimgIsNull() {
            addCriterion("newsImg is null");
            return (Criteria) this;
        }

        public Criteria andNewsimgIsNotNull() {
            addCriterion("newsImg is not null");
            return (Criteria) this;
        }

        public Criteria andNewsimgEqualTo(String value) {
            addCriterion("newsImg =", value, "newsimg");
            return (Criteria) this;
        }

        public Criteria andNewsimgNotEqualTo(String value) {
            addCriterion("newsImg <>", value, "newsimg");
            return (Criteria) this;
        }

        public Criteria andNewsimgGreaterThan(String value) {
            addCriterion("newsImg >", value, "newsimg");
            return (Criteria) this;
        }

        public Criteria andNewsimgGreaterThanOrEqualTo(String value) {
            addCriterion("newsImg >=", value, "newsimg");
            return (Criteria) this;
        }

        public Criteria andNewsimgLessThan(String value) {
            addCriterion("newsImg <", value, "newsimg");
            return (Criteria) this;
        }

        public Criteria andNewsimgLessThanOrEqualTo(String value) {
            addCriterion("newsImg <=", value, "newsimg");
            return (Criteria) this;
        }

        public Criteria andNewsimgLike(String value) {
            addCriterion("newsImg like", value, "newsimg");
            return (Criteria) this;
        }

        public Criteria andNewsimgNotLike(String value) {
            addCriterion("newsImg not like", value, "newsimg");
            return (Criteria) this;
        }

        public Criteria andNewsimgIn(List<String> values) {
            addCriterion("newsImg in", values, "newsimg");
            return (Criteria) this;
        }

        public Criteria andNewsimgNotIn(List<String> values) {
            addCriterion("newsImg not in", values, "newsimg");
            return (Criteria) this;
        }

        public Criteria andNewsimgBetween(String value1, String value2) {
            addCriterion("newsImg between", value1, value2, "newsimg");
            return (Criteria) this;
        }

        public Criteria andNewsimgNotBetween(String value1, String value2) {
            addCriterion("newsImg not between", value1, value2, "newsimg");
            return (Criteria) this;
        }

        public Criteria andNewseditoridIsNull() {
            addCriterion("newsEditorId is null");
            return (Criteria) this;
        }

        public Criteria andNewseditoridIsNotNull() {
            addCriterion("newsEditorId is not null");
            return (Criteria) this;
        }

        public Criteria andNewseditoridEqualTo(Integer value) {
            addCriterion("newsEditorId =", value, "newseditorid");
            return (Criteria) this;
        }

        public Criteria andNewseditoridNotEqualTo(Integer value) {
            addCriterion("newsEditorId <>", value, "newseditorid");
            return (Criteria) this;
        }

        public Criteria andNewseditoridGreaterThan(Integer value) {
            addCriterion("newsEditorId >", value, "newseditorid");
            return (Criteria) this;
        }

        public Criteria andNewseditoridGreaterThanOrEqualTo(Integer value) {
            addCriterion("newsEditorId >=", value, "newseditorid");
            return (Criteria) this;
        }

        public Criteria andNewseditoridLessThan(Integer value) {
            addCriterion("newsEditorId <", value, "newseditorid");
            return (Criteria) this;
        }

        public Criteria andNewseditoridLessThanOrEqualTo(Integer value) {
            addCriterion("newsEditorId <=", value, "newseditorid");
            return (Criteria) this;
        }

        public Criteria andNewseditoridIn(List<Integer> values) {
            addCriterion("newsEditorId in", values, "newseditorid");
            return (Criteria) this;
        }

        public Criteria andNewseditoridNotIn(List<Integer> values) {
            addCriterion("newsEditorId not in", values, "newseditorid");
            return (Criteria) this;
        }

        public Criteria andNewseditoridBetween(Integer value1, Integer value2) {
            addCriterion("newsEditorId between", value1, value2, "newseditorid");
            return (Criteria) this;
        }

        public Criteria andNewseditoridNotBetween(Integer value1, Integer value2) {
            addCriterion("newsEditorId not between", value1, value2, "newseditorid");
            return (Criteria) this;
        }

        public Criteria andNewsissueddateIsNull() {
            addCriterion("newsIssuedDate is null");
            return (Criteria) this;
        }

        public Criteria andNewsissueddateIsNotNull() {
            addCriterion("newsIssuedDate is not null");
            return (Criteria) this;
        }

        public Criteria andNewsissueddateEqualTo(Date value) {
            addCriterionForJDBCDate("newsIssuedDate =", value, "newsissueddate");
            return (Criteria) this;
        }

        public Criteria andNewsissueddateNotEqualTo(Date value) {
            addCriterionForJDBCDate("newsIssuedDate <>", value, "newsissueddate");
            return (Criteria) this;
        }

        public Criteria andNewsissueddateGreaterThan(Date value) {
            addCriterionForJDBCDate("newsIssuedDate >", value, "newsissueddate");
            return (Criteria) this;
        }

        public Criteria andNewsissueddateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("newsIssuedDate >=", value, "newsissueddate");
            return (Criteria) this;
        }

        public Criteria andNewsissueddateLessThan(Date value) {
            addCriterionForJDBCDate("newsIssuedDate <", value, "newsissueddate");
            return (Criteria) this;
        }

        public Criteria andNewsissueddateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("newsIssuedDate <=", value, "newsissueddate");
            return (Criteria) this;
        }

        public Criteria andNewsissueddateIn(List<Date> values) {
            addCriterionForJDBCDate("newsIssuedDate in", values, "newsissueddate");
            return (Criteria) this;
        }

        public Criteria andNewsissueddateNotIn(List<Date> values) {
            addCriterionForJDBCDate("newsIssuedDate not in", values, "newsissueddate");
            return (Criteria) this;
        }

        public Criteria andNewsissueddateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("newsIssuedDate between", value1, value2, "newsissueddate");
            return (Criteria) this;
        }

        public Criteria andNewsissueddateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("newsIssuedDate not between", value1, value2, "newsissueddate");
            return (Criteria) this;
        }

        public Criteria andNewsintroIsNull() {
            addCriterion("newsIntro is null");
            return (Criteria) this;
        }

        public Criteria andNewsintroIsNotNull() {
            addCriterion("newsIntro is not null");
            return (Criteria) this;
        }

        public Criteria andNewsintroEqualTo(String value) {
            addCriterion("newsIntro =", value, "newsintro");
            return (Criteria) this;
        }

        public Criteria andNewsintroNotEqualTo(String value) {
            addCriterion("newsIntro <>", value, "newsintro");
            return (Criteria) this;
        }

        public Criteria andNewsintroGreaterThan(String value) {
            addCriterion("newsIntro >", value, "newsintro");
            return (Criteria) this;
        }

        public Criteria andNewsintroGreaterThanOrEqualTo(String value) {
            addCriterion("newsIntro >=", value, "newsintro");
            return (Criteria) this;
        }

        public Criteria andNewsintroLessThan(String value) {
            addCriterion("newsIntro <", value, "newsintro");
            return (Criteria) this;
        }

        public Criteria andNewsintroLessThanOrEqualTo(String value) {
            addCriterion("newsIntro <=", value, "newsintro");
            return (Criteria) this;
        }

        public Criteria andNewsintroLike(String value) {
            addCriterion("newsIntro like", value, "newsintro");
            return (Criteria) this;
        }

        public Criteria andNewsintroNotLike(String value) {
            addCriterion("newsIntro not like", value, "newsintro");
            return (Criteria) this;
        }

        public Criteria andNewsintroIn(List<String> values) {
            addCriterion("newsIntro in", values, "newsintro");
            return (Criteria) this;
        }

        public Criteria andNewsintroNotIn(List<String> values) {
            addCriterion("newsIntro not in", values, "newsintro");
            return (Criteria) this;
        }

        public Criteria andNewsintroBetween(String value1, String value2) {
            addCriterion("newsIntro between", value1, value2, "newsintro");
            return (Criteria) this;
        }

        public Criteria andNewsintroNotBetween(String value1, String value2) {
            addCriterion("newsIntro not between", value1, value2, "newsintro");
            return (Criteria) this;
        }

        public Criteria andNewsheatIsNull() {
            addCriterion("newsHeat is null");
            return (Criteria) this;
        }

        public Criteria andNewsheatIsNotNull() {
            addCriterion("newsHeat is not null");
            return (Criteria) this;
        }

        public Criteria andNewsheatEqualTo(Integer value) {
            addCriterion("newsHeat =", value, "newsheat");
            return (Criteria) this;
        }

        public Criteria andNewsheatNotEqualTo(Integer value) {
            addCriterion("newsHeat <>", value, "newsheat");
            return (Criteria) this;
        }

        public Criteria andNewsheatGreaterThan(Integer value) {
            addCriterion("newsHeat >", value, "newsheat");
            return (Criteria) this;
        }

        public Criteria andNewsheatGreaterThanOrEqualTo(Integer value) {
            addCriterion("newsHeat >=", value, "newsheat");
            return (Criteria) this;
        }

        public Criteria andNewsheatLessThan(Integer value) {
            addCriterion("newsHeat <", value, "newsheat");
            return (Criteria) this;
        }

        public Criteria andNewsheatLessThanOrEqualTo(Integer value) {
            addCriterion("newsHeat <=", value, "newsheat");
            return (Criteria) this;
        }

        public Criteria andNewsheatIn(List<Integer> values) {
            addCriterion("newsHeat in", values, "newsheat");
            return (Criteria) this;
        }

        public Criteria andNewsheatNotIn(List<Integer> values) {
            addCriterion("newsHeat not in", values, "newsheat");
            return (Criteria) this;
        }

        public Criteria andNewsheatBetween(Integer value1, Integer value2) {
            addCriterion("newsHeat between", value1, value2, "newsheat");
            return (Criteria) this;
        }

        public Criteria andNewsheatNotBetween(Integer value1, Integer value2) {
            addCriterion("newsHeat not between", value1, value2, "newsheat");
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