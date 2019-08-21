package rechal.apps.coll.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class CCourseExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CCourseExample() {
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

        public Criteria andKIdIsNull() {
            addCriterion("K_ID is null");
            return (Criteria) this;
        }

        public Criteria andKIdIsNotNull() {
            addCriterion("K_ID is not null");
            return (Criteria) this;
        }

        public Criteria andKIdEqualTo(Long value) {
            addCriterion("K_ID =", value, "kId");
            return (Criteria) this;
        }

        public Criteria andKIdNotEqualTo(Long value) {
            addCriterion("K_ID <>", value, "kId");
            return (Criteria) this;
        }

        public Criteria andKIdGreaterThan(Long value) {
            addCriterion("K_ID >", value, "kId");
            return (Criteria) this;
        }

        public Criteria andKIdGreaterThanOrEqualTo(Long value) {
            addCriterion("K_ID >=", value, "kId");
            return (Criteria) this;
        }

        public Criteria andKIdLessThan(Long value) {
            addCriterion("K_ID <", value, "kId");
            return (Criteria) this;
        }

        public Criteria andKIdLessThanOrEqualTo(Long value) {
            addCriterion("K_ID <=", value, "kId");
            return (Criteria) this;
        }

        public Criteria andKIdIn(List<Long> values) {
            addCriterion("K_ID in", values, "kId");
            return (Criteria) this;
        }

        public Criteria andKIdNotIn(List<Long> values) {
            addCriterion("K_ID not in", values, "kId");
            return (Criteria) this;
        }

        public Criteria andKIdBetween(Long value1, Long value2) {
            addCriterion("K_ID between", value1, value2, "kId");
            return (Criteria) this;
        }

        public Criteria andKIdNotBetween(Long value1, Long value2) {
            addCriterion("K_ID not between", value1, value2, "kId");
            return (Criteria) this;
        }

        public Criteria andKNoIsNull() {
            addCriterion("K_NO is null");
            return (Criteria) this;
        }

        public Criteria andKNoIsNotNull() {
            addCriterion("K_NO is not null");
            return (Criteria) this;
        }

        public Criteria andKNoEqualTo(String value) {
            addCriterion("K_NO =", value, "kNo");
            return (Criteria) this;
        }

        public Criteria andKNoNotEqualTo(String value) {
            addCriterion("K_NO <>", value, "kNo");
            return (Criteria) this;
        }

        public Criteria andKNoGreaterThan(String value) {
            addCriterion("K_NO >", value, "kNo");
            return (Criteria) this;
        }

        public Criteria andKNoGreaterThanOrEqualTo(String value) {
            addCriterion("K_NO >=", value, "kNo");
            return (Criteria) this;
        }

        public Criteria andKNoLessThan(String value) {
            addCriterion("K_NO <", value, "kNo");
            return (Criteria) this;
        }

        public Criteria andKNoLessThanOrEqualTo(String value) {
            addCriterion("K_NO <=", value, "kNo");
            return (Criteria) this;
        }

        public Criteria andKNoLike(String value) {
            addCriterion("K_NO like", value, "kNo");
            return (Criteria) this;
        }

        public Criteria andKNoNotLike(String value) {
            addCriterion("K_NO not like", value, "kNo");
            return (Criteria) this;
        }

        public Criteria andKNoIn(List<String> values) {
            addCriterion("K_NO in", values, "kNo");
            return (Criteria) this;
        }

        public Criteria andKNoNotIn(List<String> values) {
            addCriterion("K_NO not in", values, "kNo");
            return (Criteria) this;
        }

        public Criteria andKNoBetween(String value1, String value2) {
            addCriterion("K_NO between", value1, value2, "kNo");
            return (Criteria) this;
        }

        public Criteria andKNoNotBetween(String value1, String value2) {
            addCriterion("K_NO not between", value1, value2, "kNo");
            return (Criteria) this;
        }

        public Criteria andKNameIsNull() {
            addCriterion("K_NAME is null");
            return (Criteria) this;
        }

        public Criteria andKNameIsNotNull() {
            addCriterion("K_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andKNameEqualTo(String value) {
            addCriterion("K_NAME =", value, "kName");
            return (Criteria) this;
        }

        public Criteria andKNameNotEqualTo(String value) {
            addCriterion("K_NAME <>", value, "kName");
            return (Criteria) this;
        }

        public Criteria andKNameGreaterThan(String value) {
            addCriterion("K_NAME >", value, "kName");
            return (Criteria) this;
        }

        public Criteria andKNameGreaterThanOrEqualTo(String value) {
            addCriterion("K_NAME >=", value, "kName");
            return (Criteria) this;
        }

        public Criteria andKNameLessThan(String value) {
            addCriterion("K_NAME <", value, "kName");
            return (Criteria) this;
        }

        public Criteria andKNameLessThanOrEqualTo(String value) {
            addCriterion("K_NAME <=", value, "kName");
            return (Criteria) this;
        }

        public Criteria andKNameLike(String value) {
            addCriterion("K_NAME like", value, "kName");
            return (Criteria) this;
        }

        public Criteria andKNameNotLike(String value) {
            addCriterion("K_NAME not like", value, "kName");
            return (Criteria) this;
        }

        public Criteria andKNameIn(List<String> values) {
            addCriterion("K_NAME in", values, "kName");
            return (Criteria) this;
        }

        public Criteria andKNameNotIn(List<String> values) {
            addCriterion("K_NAME not in", values, "kName");
            return (Criteria) this;
        }

        public Criteria andKNameBetween(String value1, String value2) {
            addCriterion("K_NAME between", value1, value2, "kName");
            return (Criteria) this;
        }

        public Criteria andKNameNotBetween(String value1, String value2) {
            addCriterion("K_NAME not between", value1, value2, "kName");
            return (Criteria) this;
        }

        public Criteria andKCreateDateIsNull() {
            addCriterion("K_CREATE_DATE is null");
            return (Criteria) this;
        }

        public Criteria andKCreateDateIsNotNull() {
            addCriterion("K_CREATE_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andKCreateDateEqualTo(Date value) {
            addCriterionForJDBCDate("K_CREATE_DATE =", value, "kCreateDate");
            return (Criteria) this;
        }

        public Criteria andKCreateDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("K_CREATE_DATE <>", value, "kCreateDate");
            return (Criteria) this;
        }

        public Criteria andKCreateDateGreaterThan(Date value) {
            addCriterionForJDBCDate("K_CREATE_DATE >", value, "kCreateDate");
            return (Criteria) this;
        }

        public Criteria andKCreateDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("K_CREATE_DATE >=", value, "kCreateDate");
            return (Criteria) this;
        }

        public Criteria andKCreateDateLessThan(Date value) {
            addCriterionForJDBCDate("K_CREATE_DATE <", value, "kCreateDate");
            return (Criteria) this;
        }

        public Criteria andKCreateDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("K_CREATE_DATE <=", value, "kCreateDate");
            return (Criteria) this;
        }

        public Criteria andKCreateDateIn(List<Date> values) {
            addCriterionForJDBCDate("K_CREATE_DATE in", values, "kCreateDate");
            return (Criteria) this;
        }

        public Criteria andKCreateDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("K_CREATE_DATE not in", values, "kCreateDate");
            return (Criteria) this;
        }

        public Criteria andKCreateDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("K_CREATE_DATE between", value1, value2, "kCreateDate");
            return (Criteria) this;
        }

        public Criteria andKCreateDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("K_CREATE_DATE not between", value1, value2, "kCreateDate");
            return (Criteria) this;
        }

        public Criteria andKNoteIsNull() {
            addCriterion("K_NOTE is null");
            return (Criteria) this;
        }

        public Criteria andKNoteIsNotNull() {
            addCriterion("K_NOTE is not null");
            return (Criteria) this;
        }

        public Criteria andKNoteEqualTo(String value) {
            addCriterion("K_NOTE =", value, "kNote");
            return (Criteria) this;
        }

        public Criteria andKNoteNotEqualTo(String value) {
            addCriterion("K_NOTE <>", value, "kNote");
            return (Criteria) this;
        }

        public Criteria andKNoteGreaterThan(String value) {
            addCriterion("K_NOTE >", value, "kNote");
            return (Criteria) this;
        }

        public Criteria andKNoteGreaterThanOrEqualTo(String value) {
            addCriterion("K_NOTE >=", value, "kNote");
            return (Criteria) this;
        }

        public Criteria andKNoteLessThan(String value) {
            addCriterion("K_NOTE <", value, "kNote");
            return (Criteria) this;
        }

        public Criteria andKNoteLessThanOrEqualTo(String value) {
            addCriterion("K_NOTE <=", value, "kNote");
            return (Criteria) this;
        }

        public Criteria andKNoteLike(String value) {
            addCriterion("K_NOTE like", value, "kNote");
            return (Criteria) this;
        }

        public Criteria andKNoteNotLike(String value) {
            addCriterion("K_NOTE not like", value, "kNote");
            return (Criteria) this;
        }

        public Criteria andKNoteIn(List<String> values) {
            addCriterion("K_NOTE in", values, "kNote");
            return (Criteria) this;
        }

        public Criteria andKNoteNotIn(List<String> values) {
            addCriterion("K_NOTE not in", values, "kNote");
            return (Criteria) this;
        }

        public Criteria andKNoteBetween(String value1, String value2) {
            addCriterion("K_NOTE between", value1, value2, "kNote");
            return (Criteria) this;
        }

        public Criteria andKNoteNotBetween(String value1, String value2) {
            addCriterion("K_NOTE not between", value1, value2, "kNote");
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