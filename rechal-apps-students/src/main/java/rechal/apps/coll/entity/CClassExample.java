package rechal.apps.coll.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class CClassExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CClassExample() {
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

        public Criteria andCIdIsNull() {
            addCriterion("C_ID is null");
            return (Criteria) this;
        }

        public Criteria andCIdIsNotNull() {
            addCriterion("C_ID is not null");
            return (Criteria) this;
        }

        public Criteria andCIdEqualTo(Long value) {
            addCriterion("C_ID =", value, "cId");
            return (Criteria) this;
        }

        public Criteria andCIdNotEqualTo(Long value) {
            addCriterion("C_ID <>", value, "cId");
            return (Criteria) this;
        }

        public Criteria andCIdGreaterThan(Long value) {
            addCriterion("C_ID >", value, "cId");
            return (Criteria) this;
        }

        public Criteria andCIdGreaterThanOrEqualTo(Long value) {
            addCriterion("C_ID >=", value, "cId");
            return (Criteria) this;
        }

        public Criteria andCIdLessThan(Long value) {
            addCriterion("C_ID <", value, "cId");
            return (Criteria) this;
        }

        public Criteria andCIdLessThanOrEqualTo(Long value) {
            addCriterion("C_ID <=", value, "cId");
            return (Criteria) this;
        }

        public Criteria andCIdIn(List<Long> values) {
            addCriterion("C_ID in", values, "cId");
            return (Criteria) this;
        }

        public Criteria andCIdNotIn(List<Long> values) {
            addCriterion("C_ID not in", values, "cId");
            return (Criteria) this;
        }

        public Criteria andCIdBetween(Long value1, Long value2) {
            addCriterion("C_ID between", value1, value2, "cId");
            return (Criteria) this;
        }

        public Criteria andCIdNotBetween(Long value1, Long value2) {
            addCriterion("C_ID not between", value1, value2, "cId");
            return (Criteria) this;
        }

        public Criteria andCNameIsNull() {
            addCriterion("C_NAME is null");
            return (Criteria) this;
        }

        public Criteria andCNameIsNotNull() {
            addCriterion("C_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andCNameEqualTo(String value) {
            addCriterion("C_NAME =", value, "cName");
            return (Criteria) this;
        }

        public Criteria andCNameNotEqualTo(String value) {
            addCriterion("C_NAME <>", value, "cName");
            return (Criteria) this;
        }

        public Criteria andCNameGreaterThan(String value) {
            addCriterion("C_NAME >", value, "cName");
            return (Criteria) this;
        }

        public Criteria andCNameGreaterThanOrEqualTo(String value) {
            addCriterion("C_NAME >=", value, "cName");
            return (Criteria) this;
        }

        public Criteria andCNameLessThan(String value) {
            addCriterion("C_NAME <", value, "cName");
            return (Criteria) this;
        }

        public Criteria andCNameLessThanOrEqualTo(String value) {
            addCriterion("C_NAME <=", value, "cName");
            return (Criteria) this;
        }

        public Criteria andCNameLike(String value) {
            addCriterion("C_NAME like", value, "cName");
            return (Criteria) this;
        }

        public Criteria andCNameNotLike(String value) {
            addCriterion("C_NAME not like", value, "cName");
            return (Criteria) this;
        }

        public Criteria andCNameIn(List<String> values) {
            addCriterion("C_NAME in", values, "cName");
            return (Criteria) this;
        }

        public Criteria andCNameNotIn(List<String> values) {
            addCriterion("C_NAME not in", values, "cName");
            return (Criteria) this;
        }

        public Criteria andCNameBetween(String value1, String value2) {
            addCriterion("C_NAME between", value1, value2, "cName");
            return (Criteria) this;
        }

        public Criteria andCNameNotBetween(String value1, String value2) {
            addCriterion("C_NAME not between", value1, value2, "cName");
            return (Criteria) this;
        }

        public Criteria andCCreateDateIsNull() {
            addCriterion("C_CREATE_DATE is null");
            return (Criteria) this;
        }

        public Criteria andCCreateDateIsNotNull() {
            addCriterion("C_CREATE_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andCCreateDateEqualTo(Date value) {
            addCriterionForJDBCDate("C_CREATE_DATE =", value, "cCreateDate");
            return (Criteria) this;
        }

        public Criteria andCCreateDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("C_CREATE_DATE <>", value, "cCreateDate");
            return (Criteria) this;
        }

        public Criteria andCCreateDateGreaterThan(Date value) {
            addCriterionForJDBCDate("C_CREATE_DATE >", value, "cCreateDate");
            return (Criteria) this;
        }

        public Criteria andCCreateDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("C_CREATE_DATE >=", value, "cCreateDate");
            return (Criteria) this;
        }

        public Criteria andCCreateDateLessThan(Date value) {
            addCriterionForJDBCDate("C_CREATE_DATE <", value, "cCreateDate");
            return (Criteria) this;
        }

        public Criteria andCCreateDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("C_CREATE_DATE <=", value, "cCreateDate");
            return (Criteria) this;
        }

        public Criteria andCCreateDateIn(List<Date> values) {
            addCriterionForJDBCDate("C_CREATE_DATE in", values, "cCreateDate");
            return (Criteria) this;
        }

        public Criteria andCCreateDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("C_CREATE_DATE not in", values, "cCreateDate");
            return (Criteria) this;
        }

        public Criteria andCCreateDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("C_CREATE_DATE between", value1, value2, "cCreateDate");
            return (Criteria) this;
        }

        public Criteria andCCreateDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("C_CREATE_DATE not between", value1, value2, "cCreateDate");
            return (Criteria) this;
        }

        public Criteria andCNoteIsNull() {
            addCriterion("C_NOTE is null");
            return (Criteria) this;
        }

        public Criteria andCNoteIsNotNull() {
            addCriterion("C_NOTE is not null");
            return (Criteria) this;
        }

        public Criteria andCNoteEqualTo(String value) {
            addCriterion("C_NOTE =", value, "cNote");
            return (Criteria) this;
        }

        public Criteria andCNoteNotEqualTo(String value) {
            addCriterion("C_NOTE <>", value, "cNote");
            return (Criteria) this;
        }

        public Criteria andCNoteGreaterThan(String value) {
            addCriterion("C_NOTE >", value, "cNote");
            return (Criteria) this;
        }

        public Criteria andCNoteGreaterThanOrEqualTo(String value) {
            addCriterion("C_NOTE >=", value, "cNote");
            return (Criteria) this;
        }

        public Criteria andCNoteLessThan(String value) {
            addCriterion("C_NOTE <", value, "cNote");
            return (Criteria) this;
        }

        public Criteria andCNoteLessThanOrEqualTo(String value) {
            addCriterion("C_NOTE <=", value, "cNote");
            return (Criteria) this;
        }

        public Criteria andCNoteLike(String value) {
            addCriterion("C_NOTE like", value, "cNote");
            return (Criteria) this;
        }

        public Criteria andCNoteNotLike(String value) {
            addCriterion("C_NOTE not like", value, "cNote");
            return (Criteria) this;
        }

        public Criteria andCNoteIn(List<String> values) {
            addCriterion("C_NOTE in", values, "cNote");
            return (Criteria) this;
        }

        public Criteria andCNoteNotIn(List<String> values) {
            addCriterion("C_NOTE not in", values, "cNote");
            return (Criteria) this;
        }

        public Criteria andCNoteBetween(String value1, String value2) {
            addCriterion("C_NOTE between", value1, value2, "cNote");
            return (Criteria) this;
        }

        public Criteria andCNoteNotBetween(String value1, String value2) {
            addCriterion("C_NOTE not between", value1, value2, "cNote");
            return (Criteria) this;
        }

        public Criteria andCNoIsNull() {
            addCriterion("C_NO is null");
            return (Criteria) this;
        }

        public Criteria andCNoIsNotNull() {
            addCriterion("C_NO is not null");
            return (Criteria) this;
        }

        public Criteria andCNoEqualTo(String value) {
            addCriterion("C_NO =", value, "cNo");
            return (Criteria) this;
        }

        public Criteria andCNoNotEqualTo(String value) {
            addCriterion("C_NO <>", value, "cNo");
            return (Criteria) this;
        }

        public Criteria andCNoGreaterThan(String value) {
            addCriterion("C_NO >", value, "cNo");
            return (Criteria) this;
        }

        public Criteria andCNoGreaterThanOrEqualTo(String value) {
            addCriterion("C_NO >=", value, "cNo");
            return (Criteria) this;
        }

        public Criteria andCNoLessThan(String value) {
            addCriterion("C_NO <", value, "cNo");
            return (Criteria) this;
        }

        public Criteria andCNoLessThanOrEqualTo(String value) {
            addCriterion("C_NO <=", value, "cNo");
            return (Criteria) this;
        }

        public Criteria andCNoLike(String value) {
            addCriterion("C_NO like", value, "cNo");
            return (Criteria) this;
        }

        public Criteria andCNoNotLike(String value) {
            addCriterion("C_NO not like", value, "cNo");
            return (Criteria) this;
        }

        public Criteria andCNoIn(List<String> values) {
            addCriterion("C_NO in", values, "cNo");
            return (Criteria) this;
        }

        public Criteria andCNoNotIn(List<String> values) {
            addCriterion("C_NO not in", values, "cNo");
            return (Criteria) this;
        }

        public Criteria andCNoBetween(String value1, String value2) {
            addCriterion("C_NO between", value1, value2, "cNo");
            return (Criteria) this;
        }

        public Criteria andCNoNotBetween(String value1, String value2) {
            addCriterion("C_NO not between", value1, value2, "cNo");
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