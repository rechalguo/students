package rechal.apps.coll.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class CMarkExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CMarkExample() {
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

        public Criteria andMIdIsNull() {
            addCriterion("M_ID is null");
            return (Criteria) this;
        }

        public Criteria andMIdIsNotNull() {
            addCriterion("M_ID is not null");
            return (Criteria) this;
        }

        public Criteria andMIdEqualTo(Long value) {
            addCriterion("M_ID =", value, "mId");
            return (Criteria) this;
        }

        public Criteria andMIdNotEqualTo(Long value) {
            addCriterion("M_ID <>", value, "mId");
            return (Criteria) this;
        }

        public Criteria andMIdGreaterThan(Long value) {
            addCriterion("M_ID >", value, "mId");
            return (Criteria) this;
        }

        public Criteria andMIdGreaterThanOrEqualTo(Long value) {
            addCriterion("M_ID >=", value, "mId");
            return (Criteria) this;
        }

        public Criteria andMIdLessThan(Long value) {
            addCriterion("M_ID <", value, "mId");
            return (Criteria) this;
        }

        public Criteria andMIdLessThanOrEqualTo(Long value) {
            addCriterion("M_ID <=", value, "mId");
            return (Criteria) this;
        }

        public Criteria andMIdIn(List<Long> values) {
            addCriterion("M_ID in", values, "mId");
            return (Criteria) this;
        }

        public Criteria andMIdNotIn(List<Long> values) {
            addCriterion("M_ID not in", values, "mId");
            return (Criteria) this;
        }

        public Criteria andMIdBetween(Long value1, Long value2) {
            addCriterion("M_ID between", value1, value2, "mId");
            return (Criteria) this;
        }

        public Criteria andMIdNotBetween(Long value1, Long value2) {
            addCriterion("M_ID not between", value1, value2, "mId");
            return (Criteria) this;
        }

        public Criteria andMNoIsNull() {
            addCriterion("M_NO is null");
            return (Criteria) this;
        }

        public Criteria andMNoIsNotNull() {
            addCriterion("M_NO is not null");
            return (Criteria) this;
        }

        public Criteria andMNoEqualTo(String value) {
            addCriterion("M_NO =", value, "mNo");
            return (Criteria) this;
        }

        public Criteria andMNoNotEqualTo(String value) {
            addCriterion("M_NO <>", value, "mNo");
            return (Criteria) this;
        }

        public Criteria andMNoGreaterThan(String value) {
            addCriterion("M_NO >", value, "mNo");
            return (Criteria) this;
        }

        public Criteria andMNoGreaterThanOrEqualTo(String value) {
            addCriterion("M_NO >=", value, "mNo");
            return (Criteria) this;
        }

        public Criteria andMNoLessThan(String value) {
            addCriterion("M_NO <", value, "mNo");
            return (Criteria) this;
        }

        public Criteria andMNoLessThanOrEqualTo(String value) {
            addCriterion("M_NO <=", value, "mNo");
            return (Criteria) this;
        }

        public Criteria andMNoLike(String value) {
            addCriterion("M_NO like", value, "mNo");
            return (Criteria) this;
        }

        public Criteria andMNoNotLike(String value) {
            addCriterion("M_NO not like", value, "mNo");
            return (Criteria) this;
        }

        public Criteria andMNoIn(List<String> values) {
            addCriterion("M_NO in", values, "mNo");
            return (Criteria) this;
        }

        public Criteria andMNoNotIn(List<String> values) {
            addCriterion("M_NO not in", values, "mNo");
            return (Criteria) this;
        }

        public Criteria andMNoBetween(String value1, String value2) {
            addCriterion("M_NO between", value1, value2, "mNo");
            return (Criteria) this;
        }

        public Criteria andMNoNotBetween(String value1, String value2) {
            addCriterion("M_NO not between", value1, value2, "mNo");
            return (Criteria) this;
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

        public Criteria andMDateIsNull() {
            addCriterion("M_DATE is null");
            return (Criteria) this;
        }

        public Criteria andMDateIsNotNull() {
            addCriterion("M_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andMDateEqualTo(Date value) {
            addCriterionForJDBCDate("M_DATE =", value, "mDate");
            return (Criteria) this;
        }

        public Criteria andMDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("M_DATE <>", value, "mDate");
            return (Criteria) this;
        }

        public Criteria andMDateGreaterThan(Date value) {
            addCriterionForJDBCDate("M_DATE >", value, "mDate");
            return (Criteria) this;
        }

        public Criteria andMDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("M_DATE >=", value, "mDate");
            return (Criteria) this;
        }

        public Criteria andMDateLessThan(Date value) {
            addCriterionForJDBCDate("M_DATE <", value, "mDate");
            return (Criteria) this;
        }

        public Criteria andMDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("M_DATE <=", value, "mDate");
            return (Criteria) this;
        }

        public Criteria andMDateIn(List<Date> values) {
            addCriterionForJDBCDate("M_DATE in", values, "mDate");
            return (Criteria) this;
        }

        public Criteria andMDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("M_DATE not in", values, "mDate");
            return (Criteria) this;
        }

        public Criteria andMDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("M_DATE between", value1, value2, "mDate");
            return (Criteria) this;
        }

        public Criteria andMDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("M_DATE not between", value1, value2, "mDate");
            return (Criteria) this;
        }

        public Criteria andSNoIsNull() {
            addCriterion("S_NO is null");
            return (Criteria) this;
        }

        public Criteria andSNoIsNotNull() {
            addCriterion("S_NO is not null");
            return (Criteria) this;
        }

        public Criteria andSNoEqualTo(String value) {
            addCriterion("S_NO =", value, "sNo");
            return (Criteria) this;
        }

        public Criteria andSNoNotEqualTo(String value) {
            addCriterion("S_NO <>", value, "sNo");
            return (Criteria) this;
        }

        public Criteria andSNoGreaterThan(String value) {
            addCriterion("S_NO >", value, "sNo");
            return (Criteria) this;
        }

        public Criteria andSNoGreaterThanOrEqualTo(String value) {
            addCriterion("S_NO >=", value, "sNo");
            return (Criteria) this;
        }

        public Criteria andSNoLessThan(String value) {
            addCriterion("S_NO <", value, "sNo");
            return (Criteria) this;
        }

        public Criteria andSNoLessThanOrEqualTo(String value) {
            addCriterion("S_NO <=", value, "sNo");
            return (Criteria) this;
        }

        public Criteria andSNoLike(String value) {
            addCriterion("S_NO like", value, "sNo");
            return (Criteria) this;
        }

        public Criteria andSNoNotLike(String value) {
            addCriterion("S_NO not like", value, "sNo");
            return (Criteria) this;
        }

        public Criteria andSNoIn(List<String> values) {
            addCriterion("S_NO in", values, "sNo");
            return (Criteria) this;
        }

        public Criteria andSNoNotIn(List<String> values) {
            addCriterion("S_NO not in", values, "sNo");
            return (Criteria) this;
        }

        public Criteria andSNoBetween(String value1, String value2) {
            addCriterion("S_NO between", value1, value2, "sNo");
            return (Criteria) this;
        }

        public Criteria andSNoNotBetween(String value1, String value2) {
            addCriterion("S_NO not between", value1, value2, "sNo");
            return (Criteria) this;
        }

        public Criteria andSNameIsNull() {
            addCriterion("S_NAME is null");
            return (Criteria) this;
        }

        public Criteria andSNameIsNotNull() {
            addCriterion("S_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andSNameEqualTo(String value) {
            addCriterion("S_NAME =", value, "sName");
            return (Criteria) this;
        }

        public Criteria andSNameNotEqualTo(String value) {
            addCriterion("S_NAME <>", value, "sName");
            return (Criteria) this;
        }

        public Criteria andSNameGreaterThan(String value) {
            addCriterion("S_NAME >", value, "sName");
            return (Criteria) this;
        }

        public Criteria andSNameGreaterThanOrEqualTo(String value) {
            addCriterion("S_NAME >=", value, "sName");
            return (Criteria) this;
        }

        public Criteria andSNameLessThan(String value) {
            addCriterion("S_NAME <", value, "sName");
            return (Criteria) this;
        }

        public Criteria andSNameLessThanOrEqualTo(String value) {
            addCriterion("S_NAME <=", value, "sName");
            return (Criteria) this;
        }

        public Criteria andSNameLike(String value) {
            addCriterion("S_NAME like", value, "sName");
            return (Criteria) this;
        }

        public Criteria andSNameNotLike(String value) {
            addCriterion("S_NAME not like", value, "sName");
            return (Criteria) this;
        }

        public Criteria andSNameIn(List<String> values) {
            addCriterion("S_NAME in", values, "sName");
            return (Criteria) this;
        }

        public Criteria andSNameNotIn(List<String> values) {
            addCriterion("S_NAME not in", values, "sName");
            return (Criteria) this;
        }

        public Criteria andSNameBetween(String value1, String value2) {
            addCriterion("S_NAME between", value1, value2, "sName");
            return (Criteria) this;
        }

        public Criteria andSNameNotBetween(String value1, String value2) {
            addCriterion("S_NAME not between", value1, value2, "sName");
            return (Criteria) this;
        }

        public Criteria andMNoteIsNull() {
            addCriterion("M_NOTE is null");
            return (Criteria) this;
        }

        public Criteria andMNoteIsNotNull() {
            addCriterion("M_NOTE is not null");
            return (Criteria) this;
        }

        public Criteria andMNoteEqualTo(String value) {
            addCriterion("M_NOTE =", value, "mNote");
            return (Criteria) this;
        }

        public Criteria andMNoteNotEqualTo(String value) {
            addCriterion("M_NOTE <>", value, "mNote");
            return (Criteria) this;
        }

        public Criteria andMNoteGreaterThan(String value) {
            addCriterion("M_NOTE >", value, "mNote");
            return (Criteria) this;
        }

        public Criteria andMNoteGreaterThanOrEqualTo(String value) {
            addCriterion("M_NOTE >=", value, "mNote");
            return (Criteria) this;
        }

        public Criteria andMNoteLessThan(String value) {
            addCriterion("M_NOTE <", value, "mNote");
            return (Criteria) this;
        }

        public Criteria andMNoteLessThanOrEqualTo(String value) {
            addCriterion("M_NOTE <=", value, "mNote");
            return (Criteria) this;
        }

        public Criteria andMNoteLike(String value) {
            addCriterion("M_NOTE like", value, "mNote");
            return (Criteria) this;
        }

        public Criteria andMNoteNotLike(String value) {
            addCriterion("M_NOTE not like", value, "mNote");
            return (Criteria) this;
        }

        public Criteria andMNoteIn(List<String> values) {
            addCriterion("M_NOTE in", values, "mNote");
            return (Criteria) this;
        }

        public Criteria andMNoteNotIn(List<String> values) {
            addCriterion("M_NOTE not in", values, "mNote");
            return (Criteria) this;
        }

        public Criteria andMNoteBetween(String value1, String value2) {
            addCriterion("M_NOTE between", value1, value2, "mNote");
            return (Criteria) this;
        }

        public Criteria andMNoteNotBetween(String value1, String value2) {
            addCriterion("M_NOTE not between", value1, value2, "mNote");
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