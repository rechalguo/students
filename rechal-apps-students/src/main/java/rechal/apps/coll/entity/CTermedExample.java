package rechal.apps.coll.entity;

import java.util.ArrayList;
import java.util.List;

public class CTermedExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CTermedExample() {
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

        public Criteria andTStatIsNull() {
            addCriterion("T_STAT is null");
            return (Criteria) this;
        }

        public Criteria andTStatIsNotNull() {
            addCriterion("T_STAT is not null");
            return (Criteria) this;
        }

        public Criteria andTStatEqualTo(String value) {
            addCriterion("T_STAT =", value, "tStat");
            return (Criteria) this;
        }

        public Criteria andTStatNotEqualTo(String value) {
            addCriterion("T_STAT <>", value, "tStat");
            return (Criteria) this;
        }

        public Criteria andTStatGreaterThan(String value) {
            addCriterion("T_STAT >", value, "tStat");
            return (Criteria) this;
        }

        public Criteria andTStatGreaterThanOrEqualTo(String value) {
            addCriterion("T_STAT >=", value, "tStat");
            return (Criteria) this;
        }

        public Criteria andTStatLessThan(String value) {
            addCriterion("T_STAT <", value, "tStat");
            return (Criteria) this;
        }

        public Criteria andTStatLessThanOrEqualTo(String value) {
            addCriterion("T_STAT <=", value, "tStat");
            return (Criteria) this;
        }

        public Criteria andTStatLike(String value) {
            addCriterion("T_STAT like", value, "tStat");
            return (Criteria) this;
        }

        public Criteria andTStatNotLike(String value) {
            addCriterion("T_STAT not like", value, "tStat");
            return (Criteria) this;
        }

        public Criteria andTStatIn(List<String> values) {
            addCriterion("T_STAT in", values, "tStat");
            return (Criteria) this;
        }

        public Criteria andTStatNotIn(List<String> values) {
            addCriterion("T_STAT not in", values, "tStat");
            return (Criteria) this;
        }

        public Criteria andTStatBetween(String value1, String value2) {
            addCriterion("T_STAT between", value1, value2, "tStat");
            return (Criteria) this;
        }

        public Criteria andTStatNotBetween(String value1, String value2) {
            addCriterion("T_STAT not between", value1, value2, "tStat");
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