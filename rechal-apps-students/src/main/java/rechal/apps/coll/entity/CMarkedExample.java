package rechal.apps.coll.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class CMarkedExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CMarkedExample() {
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

        public Criteria andMsIdIsNull() {
            addCriterion("MS_ID is null");
            return (Criteria) this;
        }

        public Criteria andMsIdIsNotNull() {
            addCriterion("MS_ID is not null");
            return (Criteria) this;
        }

        public Criteria andMsIdEqualTo(Long value) {
            addCriterion("MS_ID =", value, "msId");
            return (Criteria) this;
        }

        public Criteria andMsIdNotEqualTo(Long value) {
            addCriterion("MS_ID <>", value, "msId");
            return (Criteria) this;
        }

        public Criteria andMsIdGreaterThan(Long value) {
            addCriterion("MS_ID >", value, "msId");
            return (Criteria) this;
        }

        public Criteria andMsIdGreaterThanOrEqualTo(Long value) {
            addCriterion("MS_ID >=", value, "msId");
            return (Criteria) this;
        }

        public Criteria andMsIdLessThan(Long value) {
            addCriterion("MS_ID <", value, "msId");
            return (Criteria) this;
        }

        public Criteria andMsIdLessThanOrEqualTo(Long value) {
            addCriterion("MS_ID <=", value, "msId");
            return (Criteria) this;
        }

        public Criteria andMsIdIn(List<Long> values) {
            addCriterion("MS_ID in", values, "msId");
            return (Criteria) this;
        }

        public Criteria andMsIdNotIn(List<Long> values) {
            addCriterion("MS_ID not in", values, "msId");
            return (Criteria) this;
        }

        public Criteria andMsIdBetween(Long value1, Long value2) {
            addCriterion("MS_ID between", value1, value2, "msId");
            return (Criteria) this;
        }

        public Criteria andMsIdNotBetween(Long value1, Long value2) {
            addCriterion("MS_ID not between", value1, value2, "msId");
            return (Criteria) this;
        }

        public Criteria andMsCreateDateIsNull() {
            addCriterion("MS_CREATE_DATE is null");
            return (Criteria) this;
        }

        public Criteria andMsCreateDateIsNotNull() {
            addCriterion("MS_CREATE_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andMsCreateDateEqualTo(Date value) {
            addCriterionForJDBCDate("MS_CREATE_DATE =", value, "msCreateDate");
            return (Criteria) this;
        }

        public Criteria andMsCreateDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("MS_CREATE_DATE <>", value, "msCreateDate");
            return (Criteria) this;
        }

        public Criteria andMsCreateDateGreaterThan(Date value) {
            addCriterionForJDBCDate("MS_CREATE_DATE >", value, "msCreateDate");
            return (Criteria) this;
        }

        public Criteria andMsCreateDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("MS_CREATE_DATE >=", value, "msCreateDate");
            return (Criteria) this;
        }

        public Criteria andMsCreateDateLessThan(Date value) {
            addCriterionForJDBCDate("MS_CREATE_DATE <", value, "msCreateDate");
            return (Criteria) this;
        }

        public Criteria andMsCreateDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("MS_CREATE_DATE <=", value, "msCreateDate");
            return (Criteria) this;
        }

        public Criteria andMsCreateDateIn(List<Date> values) {
            addCriterionForJDBCDate("MS_CREATE_DATE in", values, "msCreateDate");
            return (Criteria) this;
        }

        public Criteria andMsCreateDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("MS_CREATE_DATE not in", values, "msCreateDate");
            return (Criteria) this;
        }

        public Criteria andMsCreateDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("MS_CREATE_DATE between", value1, value2, "msCreateDate");
            return (Criteria) this;
        }

        public Criteria andMsCreateDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("MS_CREATE_DATE not between", value1, value2, "msCreateDate");
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

        public Criteria andMsWeightIsNull() {
            addCriterion("MS_WEIGHT is null");
            return (Criteria) this;
        }

        public Criteria andMsWeightIsNotNull() {
            addCriterion("MS_WEIGHT is not null");
            return (Criteria) this;
        }

        public Criteria andMsWeightEqualTo(Double value) {
            addCriterion("MS_WEIGHT =", value, "msWeight");
            return (Criteria) this;
        }

        public Criteria andMsWeightNotEqualTo(Double value) {
            addCriterion("MS_WEIGHT <>", value, "msWeight");
            return (Criteria) this;
        }

        public Criteria andMsWeightGreaterThan(Double value) {
            addCriterion("MS_WEIGHT >", value, "msWeight");
            return (Criteria) this;
        }

        public Criteria andMsWeightGreaterThanOrEqualTo(Double value) {
            addCriterion("MS_WEIGHT >=", value, "msWeight");
            return (Criteria) this;
        }

        public Criteria andMsWeightLessThan(Double value) {
            addCriterion("MS_WEIGHT <", value, "msWeight");
            return (Criteria) this;
        }

        public Criteria andMsWeightLessThanOrEqualTo(Double value) {
            addCriterion("MS_WEIGHT <=", value, "msWeight");
            return (Criteria) this;
        }

        public Criteria andMsWeightIn(List<Double> values) {
            addCriterion("MS_WEIGHT in", values, "msWeight");
            return (Criteria) this;
        }

        public Criteria andMsWeightNotIn(List<Double> values) {
            addCriterion("MS_WEIGHT not in", values, "msWeight");
            return (Criteria) this;
        }

        public Criteria andMsWeightBetween(Double value1, Double value2) {
            addCriterion("MS_WEIGHT between", value1, value2, "msWeight");
            return (Criteria) this;
        }

        public Criteria andMsWeightNotBetween(Double value1, Double value2) {
            addCriterion("MS_WEIGHT not between", value1, value2, "msWeight");
            return (Criteria) this;
        }

        public Criteria andMsRateIsNull() {
            addCriterion("MS_RATE is null");
            return (Criteria) this;
        }

        public Criteria andMsRateIsNotNull() {
            addCriterion("MS_RATE is not null");
            return (Criteria) this;
        }

        public Criteria andMsRateEqualTo(Double value) {
            addCriterion("MS_RATE =", value, "msRate");
            return (Criteria) this;
        }

        public Criteria andMsRateNotEqualTo(Double value) {
            addCriterion("MS_RATE <>", value, "msRate");
            return (Criteria) this;
        }

        public Criteria andMsRateGreaterThan(Double value) {
            addCriterion("MS_RATE >", value, "msRate");
            return (Criteria) this;
        }

        public Criteria andMsRateGreaterThanOrEqualTo(Double value) {
            addCriterion("MS_RATE >=", value, "msRate");
            return (Criteria) this;
        }

        public Criteria andMsRateLessThan(Double value) {
            addCriterion("MS_RATE <", value, "msRate");
            return (Criteria) this;
        }

        public Criteria andMsRateLessThanOrEqualTo(Double value) {
            addCriterion("MS_RATE <=", value, "msRate");
            return (Criteria) this;
        }

        public Criteria andMsRateIn(List<Double> values) {
            addCriterion("MS_RATE in", values, "msRate");
            return (Criteria) this;
        }

        public Criteria andMsRateNotIn(List<Double> values) {
            addCriterion("MS_RATE not in", values, "msRate");
            return (Criteria) this;
        }

        public Criteria andMsRateBetween(Double value1, Double value2) {
            addCriterion("MS_RATE between", value1, value2, "msRate");
            return (Criteria) this;
        }

        public Criteria andMsRateNotBetween(Double value1, Double value2) {
            addCriterion("MS_RATE not between", value1, value2, "msRate");
            return (Criteria) this;
        }

        public Criteria andMsLineIsNull() {
            addCriterion("MS_LINE is null");
            return (Criteria) this;
        }

        public Criteria andMsLineIsNotNull() {
            addCriterion("MS_LINE is not null");
            return (Criteria) this;
        }

        public Criteria andMsLineEqualTo(Double value) {
            addCriterion("MS_LINE =", value, "msLine");
            return (Criteria) this;
        }

        public Criteria andMsLineNotEqualTo(Double value) {
            addCriterion("MS_LINE <>", value, "msLine");
            return (Criteria) this;
        }

        public Criteria andMsLineGreaterThan(Double value) {
            addCriterion("MS_LINE >", value, "msLine");
            return (Criteria) this;
        }

        public Criteria andMsLineGreaterThanOrEqualTo(Double value) {
            addCriterion("MS_LINE >=", value, "msLine");
            return (Criteria) this;
        }

        public Criteria andMsLineLessThan(Double value) {
            addCriterion("MS_LINE <", value, "msLine");
            return (Criteria) this;
        }

        public Criteria andMsLineLessThanOrEqualTo(Double value) {
            addCriterion("MS_LINE <=", value, "msLine");
            return (Criteria) this;
        }

        public Criteria andMsLineIn(List<Double> values) {
            addCriterion("MS_LINE in", values, "msLine");
            return (Criteria) this;
        }

        public Criteria andMsLineNotIn(List<Double> values) {
            addCriterion("MS_LINE not in", values, "msLine");
            return (Criteria) this;
        }

        public Criteria andMsLineBetween(Double value1, Double value2) {
            addCriterion("MS_LINE between", value1, value2, "msLine");
            return (Criteria) this;
        }

        public Criteria andMsLineNotBetween(Double value1, Double value2) {
            addCriterion("MS_LINE not between", value1, value2, "msLine");
            return (Criteria) this;
        }

        public Criteria andMsAllIsNull() {
            addCriterion("MS_ALL is null");
            return (Criteria) this;
        }

        public Criteria andMsAllIsNotNull() {
            addCriterion("MS_ALL is not null");
            return (Criteria) this;
        }

        public Criteria andMsAllEqualTo(Integer value) {
            addCriterion("MS_ALL =", value, "msAll");
            return (Criteria) this;
        }

        public Criteria andMsAllNotEqualTo(Integer value) {
            addCriterion("MS_ALL <>", value, "msAll");
            return (Criteria) this;
        }

        public Criteria andMsAllGreaterThan(Integer value) {
            addCriterion("MS_ALL >", value, "msAll");
            return (Criteria) this;
        }

        public Criteria andMsAllGreaterThanOrEqualTo(Integer value) {
            addCriterion("MS_ALL >=", value, "msAll");
            return (Criteria) this;
        }

        public Criteria andMsAllLessThan(Integer value) {
            addCriterion("MS_ALL <", value, "msAll");
            return (Criteria) this;
        }

        public Criteria andMsAllLessThanOrEqualTo(Integer value) {
            addCriterion("MS_ALL <=", value, "msAll");
            return (Criteria) this;
        }

        public Criteria andMsAllIn(List<Integer> values) {
            addCriterion("MS_ALL in", values, "msAll");
            return (Criteria) this;
        }

        public Criteria andMsAllNotIn(List<Integer> values) {
            addCriterion("MS_ALL not in", values, "msAll");
            return (Criteria) this;
        }

        public Criteria andMsAllBetween(Integer value1, Integer value2) {
            addCriterion("MS_ALL between", value1, value2, "msAll");
            return (Criteria) this;
        }

        public Criteria andMsAllNotBetween(Integer value1, Integer value2) {
            addCriterion("MS_ALL not between", value1, value2, "msAll");
            return (Criteria) this;
        }

        public Criteria andMsMarkedIsNull() {
            addCriterion("MS_MARKED is null");
            return (Criteria) this;
        }

        public Criteria andMsMarkedIsNotNull() {
            addCriterion("MS_MARKED is not null");
            return (Criteria) this;
        }

        public Criteria andMsMarkedEqualTo(Integer value) {
            addCriterion("MS_MARKED =", value, "msMarked");
            return (Criteria) this;
        }

        public Criteria andMsMarkedNotEqualTo(Integer value) {
            addCriterion("MS_MARKED <>", value, "msMarked");
            return (Criteria) this;
        }

        public Criteria andMsMarkedGreaterThan(Integer value) {
            addCriterion("MS_MARKED >", value, "msMarked");
            return (Criteria) this;
        }

        public Criteria andMsMarkedGreaterThanOrEqualTo(Integer value) {
            addCriterion("MS_MARKED >=", value, "msMarked");
            return (Criteria) this;
        }

        public Criteria andMsMarkedLessThan(Integer value) {
            addCriterion("MS_MARKED <", value, "msMarked");
            return (Criteria) this;
        }

        public Criteria andMsMarkedLessThanOrEqualTo(Integer value) {
            addCriterion("MS_MARKED <=", value, "msMarked");
            return (Criteria) this;
        }

        public Criteria andMsMarkedIn(List<Integer> values) {
            addCriterion("MS_MARKED in", values, "msMarked");
            return (Criteria) this;
        }

        public Criteria andMsMarkedNotIn(List<Integer> values) {
            addCriterion("MS_MARKED not in", values, "msMarked");
            return (Criteria) this;
        }

        public Criteria andMsMarkedBetween(Integer value1, Integer value2) {
            addCriterion("MS_MARKED between", value1, value2, "msMarked");
            return (Criteria) this;
        }

        public Criteria andMsMarkedNotBetween(Integer value1, Integer value2) {
            addCriterion("MS_MARKED not between", value1, value2, "msMarked");
            return (Criteria) this;
        }

        public Criteria andMsNoteIsNull() {
            addCriterion("MS_NOTE is null");
            return (Criteria) this;
        }

        public Criteria andMsNoteIsNotNull() {
            addCriterion("MS_NOTE is not null");
            return (Criteria) this;
        }

        public Criteria andMsNoteEqualTo(String value) {
            addCriterion("MS_NOTE =", value, "msNote");
            return (Criteria) this;
        }

        public Criteria andMsNoteNotEqualTo(String value) {
            addCriterion("MS_NOTE <>", value, "msNote");
            return (Criteria) this;
        }

        public Criteria andMsNoteGreaterThan(String value) {
            addCriterion("MS_NOTE >", value, "msNote");
            return (Criteria) this;
        }

        public Criteria andMsNoteGreaterThanOrEqualTo(String value) {
            addCriterion("MS_NOTE >=", value, "msNote");
            return (Criteria) this;
        }

        public Criteria andMsNoteLessThan(String value) {
            addCriterion("MS_NOTE <", value, "msNote");
            return (Criteria) this;
        }

        public Criteria andMsNoteLessThanOrEqualTo(String value) {
            addCriterion("MS_NOTE <=", value, "msNote");
            return (Criteria) this;
        }

        public Criteria andMsNoteLike(String value) {
            addCriterion("MS_NOTE like", value, "msNote");
            return (Criteria) this;
        }

        public Criteria andMsNoteNotLike(String value) {
            addCriterion("MS_NOTE not like", value, "msNote");
            return (Criteria) this;
        }

        public Criteria andMsNoteIn(List<String> values) {
            addCriterion("MS_NOTE in", values, "msNote");
            return (Criteria) this;
        }

        public Criteria andMsNoteNotIn(List<String> values) {
            addCriterion("MS_NOTE not in", values, "msNote");
            return (Criteria) this;
        }

        public Criteria andMsNoteBetween(String value1, String value2) {
            addCriterion("MS_NOTE between", value1, value2, "msNote");
            return (Criteria) this;
        }

        public Criteria andMsNoteNotBetween(String value1, String value2) {
            addCriterion("MS_NOTE not between", value1, value2, "msNote");
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