package rechal.apps.coll.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class CTermExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CTermExample() {
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

        public Criteria andTIdIsNull() {
            addCriterion("T_ID is null");
            return (Criteria) this;
        }

        public Criteria andTIdIsNotNull() {
            addCriterion("T_ID is not null");
            return (Criteria) this;
        }

        public Criteria andTIdEqualTo(Long value) {
            addCriterion("T_ID =", value, "tId");
            return (Criteria) this;
        }

        public Criteria andTIdNotEqualTo(Long value) {
            addCriterion("T_ID <>", value, "tId");
            return (Criteria) this;
        }

        public Criteria andTIdGreaterThan(Long value) {
            addCriterion("T_ID >", value, "tId");
            return (Criteria) this;
        }

        public Criteria andTIdGreaterThanOrEqualTo(Long value) {
            addCriterion("T_ID >=", value, "tId");
            return (Criteria) this;
        }

        public Criteria andTIdLessThan(Long value) {
            addCriterion("T_ID <", value, "tId");
            return (Criteria) this;
        }

        public Criteria andTIdLessThanOrEqualTo(Long value) {
            addCriterion("T_ID <=", value, "tId");
            return (Criteria) this;
        }

        public Criteria andTIdIn(List<Long> values) {
            addCriterion("T_ID in", values, "tId");
            return (Criteria) this;
        }

        public Criteria andTIdNotIn(List<Long> values) {
            addCriterion("T_ID not in", values, "tId");
            return (Criteria) this;
        }

        public Criteria andTIdBetween(Long value1, Long value2) {
            addCriterion("T_ID between", value1, value2, "tId");
            return (Criteria) this;
        }

        public Criteria andTIdNotBetween(Long value1, Long value2) {
            addCriterion("T_ID not between", value1, value2, "tId");
            return (Criteria) this;
        }

        public Criteria andTNameIsNull() {
            addCriterion("T_NAME is null");
            return (Criteria) this;
        }

        public Criteria andTNameIsNotNull() {
            addCriterion("T_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andTNameEqualTo(String value) {
            addCriterion("T_NAME =", value, "tName");
            return (Criteria) this;
        }

        public Criteria andTNameNotEqualTo(String value) {
            addCriterion("T_NAME <>", value, "tName");
            return (Criteria) this;
        }

        public Criteria andTNameGreaterThan(String value) {
            addCriterion("T_NAME >", value, "tName");
            return (Criteria) this;
        }

        public Criteria andTNameGreaterThanOrEqualTo(String value) {
            addCriterion("T_NAME >=", value, "tName");
            return (Criteria) this;
        }

        public Criteria andTNameLessThan(String value) {
            addCriterion("T_NAME <", value, "tName");
            return (Criteria) this;
        }

        public Criteria andTNameLessThanOrEqualTo(String value) {
            addCriterion("T_NAME <=", value, "tName");
            return (Criteria) this;
        }

        public Criteria andTNameLike(String value) {
            addCriterion("T_NAME like", value, "tName");
            return (Criteria) this;
        }

        public Criteria andTNameNotLike(String value) {
            addCriterion("T_NAME not like", value, "tName");
            return (Criteria) this;
        }

        public Criteria andTNameIn(List<String> values) {
            addCriterion("T_NAME in", values, "tName");
            return (Criteria) this;
        }

        public Criteria andTNameNotIn(List<String> values) {
            addCriterion("T_NAME not in", values, "tName");
            return (Criteria) this;
        }

        public Criteria andTNameBetween(String value1, String value2) {
            addCriterion("T_NAME between", value1, value2, "tName");
            return (Criteria) this;
        }

        public Criteria andTNameNotBetween(String value1, String value2) {
            addCriterion("T_NAME not between", value1, value2, "tName");
            return (Criteria) this;
        }

        public Criteria andTYearIsNull() {
            addCriterion("T_YEAR is null");
            return (Criteria) this;
        }

        public Criteria andTYearIsNotNull() {
            addCriterion("T_YEAR is not null");
            return (Criteria) this;
        }

        public Criteria andTYearEqualTo(String value) {
            addCriterion("T_YEAR =", value, "tYear");
            return (Criteria) this;
        }

        public Criteria andTYearNotEqualTo(String value) {
            addCriterion("T_YEAR <>", value, "tYear");
            return (Criteria) this;
        }

        public Criteria andTYearGreaterThan(String value) {
            addCriterion("T_YEAR >", value, "tYear");
            return (Criteria) this;
        }

        public Criteria andTYearGreaterThanOrEqualTo(String value) {
            addCriterion("T_YEAR >=", value, "tYear");
            return (Criteria) this;
        }

        public Criteria andTYearLessThan(String value) {
            addCriterion("T_YEAR <", value, "tYear");
            return (Criteria) this;
        }

        public Criteria andTYearLessThanOrEqualTo(String value) {
            addCriterion("T_YEAR <=", value, "tYear");
            return (Criteria) this;
        }

        public Criteria andTYearLike(String value) {
            addCriterion("T_YEAR like", value, "tYear");
            return (Criteria) this;
        }

        public Criteria andTYearNotLike(String value) {
            addCriterion("T_YEAR not like", value, "tYear");
            return (Criteria) this;
        }

        public Criteria andTYearIn(List<String> values) {
            addCriterion("T_YEAR in", values, "tYear");
            return (Criteria) this;
        }

        public Criteria andTYearNotIn(List<String> values) {
            addCriterion("T_YEAR not in", values, "tYear");
            return (Criteria) this;
        }

        public Criteria andTYearBetween(String value1, String value2) {
            addCriterion("T_YEAR between", value1, value2, "tYear");
            return (Criteria) this;
        }

        public Criteria andTYearNotBetween(String value1, String value2) {
            addCriterion("T_YEAR not between", value1, value2, "tYear");
            return (Criteria) this;
        }

        public Criteria andTStartIsNull() {
            addCriterion("T_START is null");
            return (Criteria) this;
        }

        public Criteria andTStartIsNotNull() {
            addCriterion("T_START is not null");
            return (Criteria) this;
        }

        public Criteria andTStartEqualTo(Date value) {
            addCriterionForJDBCDate("T_START =", value, "tStart");
            return (Criteria) this;
        }

        public Criteria andTStartNotEqualTo(Date value) {
            addCriterionForJDBCDate("T_START <>", value, "tStart");
            return (Criteria) this;
        }

        public Criteria andTStartGreaterThan(Date value) {
            addCriterionForJDBCDate("T_START >", value, "tStart");
            return (Criteria) this;
        }

        public Criteria andTStartGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("T_START >=", value, "tStart");
            return (Criteria) this;
        }

        public Criteria andTStartLessThan(Date value) {
            addCriterionForJDBCDate("T_START <", value, "tStart");
            return (Criteria) this;
        }

        public Criteria andTStartLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("T_START <=", value, "tStart");
            return (Criteria) this;
        }

        public Criteria andTStartIn(List<Date> values) {
            addCriterionForJDBCDate("T_START in", values, "tStart");
            return (Criteria) this;
        }

        public Criteria andTStartNotIn(List<Date> values) {
            addCriterionForJDBCDate("T_START not in", values, "tStart");
            return (Criteria) this;
        }

        public Criteria andTStartBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("T_START between", value1, value2, "tStart");
            return (Criteria) this;
        }

        public Criteria andTStartNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("T_START not between", value1, value2, "tStart");
            return (Criteria) this;
        }

        public Criteria andTEndIsNull() {
            addCriterion("T_END is null");
            return (Criteria) this;
        }

        public Criteria andTEndIsNotNull() {
            addCriterion("T_END is not null");
            return (Criteria) this;
        }

        public Criteria andTEndEqualTo(Date value) {
            addCriterionForJDBCDate("T_END =", value, "tEnd");
            return (Criteria) this;
        }

        public Criteria andTEndNotEqualTo(Date value) {
            addCriterionForJDBCDate("T_END <>", value, "tEnd");
            return (Criteria) this;
        }

        public Criteria andTEndGreaterThan(Date value) {
            addCriterionForJDBCDate("T_END >", value, "tEnd");
            return (Criteria) this;
        }

        public Criteria andTEndGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("T_END >=", value, "tEnd");
            return (Criteria) this;
        }

        public Criteria andTEndLessThan(Date value) {
            addCriterionForJDBCDate("T_END <", value, "tEnd");
            return (Criteria) this;
        }

        public Criteria andTEndLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("T_END <=", value, "tEnd");
            return (Criteria) this;
        }

        public Criteria andTEndIn(List<Date> values) {
            addCriterionForJDBCDate("T_END in", values, "tEnd");
            return (Criteria) this;
        }

        public Criteria andTEndNotIn(List<Date> values) {
            addCriterionForJDBCDate("T_END not in", values, "tEnd");
            return (Criteria) this;
        }

        public Criteria andTEndBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("T_END between", value1, value2, "tEnd");
            return (Criteria) this;
        }

        public Criteria andTEndNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("T_END not between", value1, value2, "tEnd");
            return (Criteria) this;
        }

        public Criteria andTCreateDateIsNull() {
            addCriterion("T_CREATE_DATE is null");
            return (Criteria) this;
        }

        public Criteria andTCreateDateIsNotNull() {
            addCriterion("T_CREATE_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andTCreateDateEqualTo(Date value) {
            addCriterionForJDBCDate("T_CREATE_DATE =", value, "tCreateDate");
            return (Criteria) this;
        }

        public Criteria andTCreateDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("T_CREATE_DATE <>", value, "tCreateDate");
            return (Criteria) this;
        }

        public Criteria andTCreateDateGreaterThan(Date value) {
            addCriterionForJDBCDate("T_CREATE_DATE >", value, "tCreateDate");
            return (Criteria) this;
        }

        public Criteria andTCreateDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("T_CREATE_DATE >=", value, "tCreateDate");
            return (Criteria) this;
        }

        public Criteria andTCreateDateLessThan(Date value) {
            addCriterionForJDBCDate("T_CREATE_DATE <", value, "tCreateDate");
            return (Criteria) this;
        }

        public Criteria andTCreateDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("T_CREATE_DATE <=", value, "tCreateDate");
            return (Criteria) this;
        }

        public Criteria andTCreateDateIn(List<Date> values) {
            addCriterionForJDBCDate("T_CREATE_DATE in", values, "tCreateDate");
            return (Criteria) this;
        }

        public Criteria andTCreateDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("T_CREATE_DATE not in", values, "tCreateDate");
            return (Criteria) this;
        }

        public Criteria andTCreateDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("T_CREATE_DATE between", value1, value2, "tCreateDate");
            return (Criteria) this;
        }

        public Criteria andTCreateDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("T_CREATE_DATE not between", value1, value2, "tCreateDate");
            return (Criteria) this;
        }

        public Criteria andTNoteIsNull() {
            addCriterion("T_NOTE is null");
            return (Criteria) this;
        }

        public Criteria andTNoteIsNotNull() {
            addCriterion("T_NOTE is not null");
            return (Criteria) this;
        }

        public Criteria andTNoteEqualTo(String value) {
            addCriterion("T_NOTE =", value, "tNote");
            return (Criteria) this;
        }

        public Criteria andTNoteNotEqualTo(String value) {
            addCriterion("T_NOTE <>", value, "tNote");
            return (Criteria) this;
        }

        public Criteria andTNoteGreaterThan(String value) {
            addCriterion("T_NOTE >", value, "tNote");
            return (Criteria) this;
        }

        public Criteria andTNoteGreaterThanOrEqualTo(String value) {
            addCriterion("T_NOTE >=", value, "tNote");
            return (Criteria) this;
        }

        public Criteria andTNoteLessThan(String value) {
            addCriterion("T_NOTE <", value, "tNote");
            return (Criteria) this;
        }

        public Criteria andTNoteLessThanOrEqualTo(String value) {
            addCriterion("T_NOTE <=", value, "tNote");
            return (Criteria) this;
        }

        public Criteria andTNoteLike(String value) {
            addCriterion("T_NOTE like", value, "tNote");
            return (Criteria) this;
        }

        public Criteria andTNoteNotLike(String value) {
            addCriterion("T_NOTE not like", value, "tNote");
            return (Criteria) this;
        }

        public Criteria andTNoteIn(List<String> values) {
            addCriterion("T_NOTE in", values, "tNote");
            return (Criteria) this;
        }

        public Criteria andTNoteNotIn(List<String> values) {
            addCriterion("T_NOTE not in", values, "tNote");
            return (Criteria) this;
        }

        public Criteria andTNoteBetween(String value1, String value2) {
            addCriterion("T_NOTE between", value1, value2, "tNote");
            return (Criteria) this;
        }

        public Criteria andTNoteNotBetween(String value1, String value2) {
            addCriterion("T_NOTE not between", value1, value2, "tNote");
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