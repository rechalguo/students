package rechal.apps.coll.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class CStuExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CStuExample() {
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

        public Criteria andSAgeIsNull() {
            addCriterion("S_AGE is null");
            return (Criteria) this;
        }

        public Criteria andSAgeIsNotNull() {
            addCriterion("S_AGE is not null");
            return (Criteria) this;
        }

        public Criteria andSAgeEqualTo(Byte value) {
            addCriterion("S_AGE =", value, "sAge");
            return (Criteria) this;
        }

        public Criteria andSAgeNotEqualTo(Byte value) {
            addCriterion("S_AGE <>", value, "sAge");
            return (Criteria) this;
        }

        public Criteria andSAgeGreaterThan(Byte value) {
            addCriterion("S_AGE >", value, "sAge");
            return (Criteria) this;
        }

        public Criteria andSAgeGreaterThanOrEqualTo(Byte value) {
            addCriterion("S_AGE >=", value, "sAge");
            return (Criteria) this;
        }

        public Criteria andSAgeLessThan(Byte value) {
            addCriterion("S_AGE <", value, "sAge");
            return (Criteria) this;
        }

        public Criteria andSAgeLessThanOrEqualTo(Byte value) {
            addCriterion("S_AGE <=", value, "sAge");
            return (Criteria) this;
        }

        public Criteria andSAgeIn(List<Byte> values) {
            addCriterion("S_AGE in", values, "sAge");
            return (Criteria) this;
        }

        public Criteria andSAgeNotIn(List<Byte> values) {
            addCriterion("S_AGE not in", values, "sAge");
            return (Criteria) this;
        }

        public Criteria andSAgeBetween(Byte value1, Byte value2) {
            addCriterion("S_AGE between", value1, value2, "sAge");
            return (Criteria) this;
        }

        public Criteria andSAgeNotBetween(Byte value1, Byte value2) {
            addCriterion("S_AGE not between", value1, value2, "sAge");
            return (Criteria) this;
        }

        public Criteria andSSexIsNull() {
            addCriterion("S_SEX is null");
            return (Criteria) this;
        }

        public Criteria andSSexIsNotNull() {
            addCriterion("S_SEX is not null");
            return (Criteria) this;
        }

        public Criteria andSSexEqualTo(String value) {
            addCriterion("S_SEX =", value, "sSex");
            return (Criteria) this;
        }

        public Criteria andSSexNotEqualTo(String value) {
            addCriterion("S_SEX <>", value, "sSex");
            return (Criteria) this;
        }

        public Criteria andSSexGreaterThan(String value) {
            addCriterion("S_SEX >", value, "sSex");
            return (Criteria) this;
        }

        public Criteria andSSexGreaterThanOrEqualTo(String value) {
            addCriterion("S_SEX >=", value, "sSex");
            return (Criteria) this;
        }

        public Criteria andSSexLessThan(String value) {
            addCriterion("S_SEX <", value, "sSex");
            return (Criteria) this;
        }

        public Criteria andSSexLessThanOrEqualTo(String value) {
            addCriterion("S_SEX <=", value, "sSex");
            return (Criteria) this;
        }

        public Criteria andSSexLike(String value) {
            addCriterion("S_SEX like", value, "sSex");
            return (Criteria) this;
        }

        public Criteria andSSexNotLike(String value) {
            addCriterion("S_SEX not like", value, "sSex");
            return (Criteria) this;
        }

        public Criteria andSSexIn(List<String> values) {
            addCriterion("S_SEX in", values, "sSex");
            return (Criteria) this;
        }

        public Criteria andSSexNotIn(List<String> values) {
            addCriterion("S_SEX not in", values, "sSex");
            return (Criteria) this;
        }

        public Criteria andSSexBetween(String value1, String value2) {
            addCriterion("S_SEX between", value1, value2, "sSex");
            return (Criteria) this;
        }

        public Criteria andSSexNotBetween(String value1, String value2) {
            addCriterion("S_SEX not between", value1, value2, "sSex");
            return (Criteria) this;
        }

        public Criteria andSBirthDateIsNull() {
            addCriterion("S_BIRTH_DATE is null");
            return (Criteria) this;
        }

        public Criteria andSBirthDateIsNotNull() {
            addCriterion("S_BIRTH_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andSBirthDateEqualTo(Date value) {
            addCriterionForJDBCDate("S_BIRTH_DATE =", value, "sBirthDate");
            return (Criteria) this;
        }

        public Criteria andSBirthDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("S_BIRTH_DATE <>", value, "sBirthDate");
            return (Criteria) this;
        }

        public Criteria andSBirthDateGreaterThan(Date value) {
            addCriterionForJDBCDate("S_BIRTH_DATE >", value, "sBirthDate");
            return (Criteria) this;
        }

        public Criteria andSBirthDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("S_BIRTH_DATE >=", value, "sBirthDate");
            return (Criteria) this;
        }

        public Criteria andSBirthDateLessThan(Date value) {
            addCriterionForJDBCDate("S_BIRTH_DATE <", value, "sBirthDate");
            return (Criteria) this;
        }

        public Criteria andSBirthDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("S_BIRTH_DATE <=", value, "sBirthDate");
            return (Criteria) this;
        }

        public Criteria andSBirthDateIn(List<Date> values) {
            addCriterionForJDBCDate("S_BIRTH_DATE in", values, "sBirthDate");
            return (Criteria) this;
        }

        public Criteria andSBirthDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("S_BIRTH_DATE not in", values, "sBirthDate");
            return (Criteria) this;
        }

        public Criteria andSBirthDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("S_BIRTH_DATE between", value1, value2, "sBirthDate");
            return (Criteria) this;
        }

        public Criteria andSBirthDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("S_BIRTH_DATE not between", value1, value2, "sBirthDate");
            return (Criteria) this;
        }

        public Criteria andSIntakeDateIsNull() {
            addCriterion("S_INTAKE_DATE is null");
            return (Criteria) this;
        }

        public Criteria andSIntakeDateIsNotNull() {
            addCriterion("S_INTAKE_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andSIntakeDateEqualTo(Date value) {
            addCriterionForJDBCDate("S_INTAKE_DATE =", value, "sIntakeDate");
            return (Criteria) this;
        }

        public Criteria andSIntakeDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("S_INTAKE_DATE <>", value, "sIntakeDate");
            return (Criteria) this;
        }

        public Criteria andSIntakeDateGreaterThan(Date value) {
            addCriterionForJDBCDate("S_INTAKE_DATE >", value, "sIntakeDate");
            return (Criteria) this;
        }

        public Criteria andSIntakeDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("S_INTAKE_DATE >=", value, "sIntakeDate");
            return (Criteria) this;
        }

        public Criteria andSIntakeDateLessThan(Date value) {
            addCriterionForJDBCDate("S_INTAKE_DATE <", value, "sIntakeDate");
            return (Criteria) this;
        }

        public Criteria andSIntakeDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("S_INTAKE_DATE <=", value, "sIntakeDate");
            return (Criteria) this;
        }

        public Criteria andSIntakeDateIn(List<Date> values) {
            addCriterionForJDBCDate("S_INTAKE_DATE in", values, "sIntakeDate");
            return (Criteria) this;
        }

        public Criteria andSIntakeDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("S_INTAKE_DATE not in", values, "sIntakeDate");
            return (Criteria) this;
        }

        public Criteria andSIntakeDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("S_INTAKE_DATE between", value1, value2, "sIntakeDate");
            return (Criteria) this;
        }

        public Criteria andSIntakeDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("S_INTAKE_DATE not between", value1, value2, "sIntakeDate");
            return (Criteria) this;
        }

        public Criteria andSOuttakeDateIsNull() {
            addCriterion("S_OUTTAKE_DATE is null");
            return (Criteria) this;
        }

        public Criteria andSOuttakeDateIsNotNull() {
            addCriterion("S_OUTTAKE_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andSOuttakeDateEqualTo(Date value) {
            addCriterionForJDBCDate("S_OUTTAKE_DATE =", value, "sOuttakeDate");
            return (Criteria) this;
        }

        public Criteria andSOuttakeDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("S_OUTTAKE_DATE <>", value, "sOuttakeDate");
            return (Criteria) this;
        }

        public Criteria andSOuttakeDateGreaterThan(Date value) {
            addCriterionForJDBCDate("S_OUTTAKE_DATE >", value, "sOuttakeDate");
            return (Criteria) this;
        }

        public Criteria andSOuttakeDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("S_OUTTAKE_DATE >=", value, "sOuttakeDate");
            return (Criteria) this;
        }

        public Criteria andSOuttakeDateLessThan(Date value) {
            addCriterionForJDBCDate("S_OUTTAKE_DATE <", value, "sOuttakeDate");
            return (Criteria) this;
        }

        public Criteria andSOuttakeDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("S_OUTTAKE_DATE <=", value, "sOuttakeDate");
            return (Criteria) this;
        }

        public Criteria andSOuttakeDateIn(List<Date> values) {
            addCriterionForJDBCDate("S_OUTTAKE_DATE in", values, "sOuttakeDate");
            return (Criteria) this;
        }

        public Criteria andSOuttakeDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("S_OUTTAKE_DATE not in", values, "sOuttakeDate");
            return (Criteria) this;
        }

        public Criteria andSOuttakeDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("S_OUTTAKE_DATE between", value1, value2, "sOuttakeDate");
            return (Criteria) this;
        }

        public Criteria andSOuttakeDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("S_OUTTAKE_DATE not between", value1, value2, "sOuttakeDate");
            return (Criteria) this;
        }

        public Criteria andSTelIsNull() {
            addCriterion("S_TEL is null");
            return (Criteria) this;
        }

        public Criteria andSTelIsNotNull() {
            addCriterion("S_TEL is not null");
            return (Criteria) this;
        }

        public Criteria andSTelEqualTo(String value) {
            addCriterion("S_TEL =", value, "sTel");
            return (Criteria) this;
        }

        public Criteria andSTelNotEqualTo(String value) {
            addCriterion("S_TEL <>", value, "sTel");
            return (Criteria) this;
        }

        public Criteria andSTelGreaterThan(String value) {
            addCriterion("S_TEL >", value, "sTel");
            return (Criteria) this;
        }

        public Criteria andSTelGreaterThanOrEqualTo(String value) {
            addCriterion("S_TEL >=", value, "sTel");
            return (Criteria) this;
        }

        public Criteria andSTelLessThan(String value) {
            addCriterion("S_TEL <", value, "sTel");
            return (Criteria) this;
        }

        public Criteria andSTelLessThanOrEqualTo(String value) {
            addCriterion("S_TEL <=", value, "sTel");
            return (Criteria) this;
        }

        public Criteria andSTelLike(String value) {
            addCriterion("S_TEL like", value, "sTel");
            return (Criteria) this;
        }

        public Criteria andSTelNotLike(String value) {
            addCriterion("S_TEL not like", value, "sTel");
            return (Criteria) this;
        }

        public Criteria andSTelIn(List<String> values) {
            addCriterion("S_TEL in", values, "sTel");
            return (Criteria) this;
        }

        public Criteria andSTelNotIn(List<String> values) {
            addCriterion("S_TEL not in", values, "sTel");
            return (Criteria) this;
        }

        public Criteria andSTelBetween(String value1, String value2) {
            addCriterion("S_TEL between", value1, value2, "sTel");
            return (Criteria) this;
        }

        public Criteria andSTelNotBetween(String value1, String value2) {
            addCriterion("S_TEL not between", value1, value2, "sTel");
            return (Criteria) this;
        }

        public Criteria andSAddrIsNull() {
            addCriterion("S_ADDR is null");
            return (Criteria) this;
        }

        public Criteria andSAddrIsNotNull() {
            addCriterion("S_ADDR is not null");
            return (Criteria) this;
        }

        public Criteria andSAddrEqualTo(String value) {
            addCriterion("S_ADDR =", value, "sAddr");
            return (Criteria) this;
        }

        public Criteria andSAddrNotEqualTo(String value) {
            addCriterion("S_ADDR <>", value, "sAddr");
            return (Criteria) this;
        }

        public Criteria andSAddrGreaterThan(String value) {
            addCriterion("S_ADDR >", value, "sAddr");
            return (Criteria) this;
        }

        public Criteria andSAddrGreaterThanOrEqualTo(String value) {
            addCriterion("S_ADDR >=", value, "sAddr");
            return (Criteria) this;
        }

        public Criteria andSAddrLessThan(String value) {
            addCriterion("S_ADDR <", value, "sAddr");
            return (Criteria) this;
        }

        public Criteria andSAddrLessThanOrEqualTo(String value) {
            addCriterion("S_ADDR <=", value, "sAddr");
            return (Criteria) this;
        }

        public Criteria andSAddrLike(String value) {
            addCriterion("S_ADDR like", value, "sAddr");
            return (Criteria) this;
        }

        public Criteria andSAddrNotLike(String value) {
            addCriterion("S_ADDR not like", value, "sAddr");
            return (Criteria) this;
        }

        public Criteria andSAddrIn(List<String> values) {
            addCriterion("S_ADDR in", values, "sAddr");
            return (Criteria) this;
        }

        public Criteria andSAddrNotIn(List<String> values) {
            addCriterion("S_ADDR not in", values, "sAddr");
            return (Criteria) this;
        }

        public Criteria andSAddrBetween(String value1, String value2) {
            addCriterion("S_ADDR between", value1, value2, "sAddr");
            return (Criteria) this;
        }

        public Criteria andSAddrNotBetween(String value1, String value2) {
            addCriterion("S_ADDR not between", value1, value2, "sAddr");
            return (Criteria) this;
        }

        public Criteria andSCreateDateIsNull() {
            addCriterion("S_CREATE_DATE is null");
            return (Criteria) this;
        }

        public Criteria andSCreateDateIsNotNull() {
            addCriterion("S_CREATE_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andSCreateDateEqualTo(Date value) {
            addCriterionForJDBCDate("S_CREATE_DATE =", value, "sCreateDate");
            return (Criteria) this;
        }

        public Criteria andSCreateDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("S_CREATE_DATE <>", value, "sCreateDate");
            return (Criteria) this;
        }

        public Criteria andSCreateDateGreaterThan(Date value) {
            addCriterionForJDBCDate("S_CREATE_DATE >", value, "sCreateDate");
            return (Criteria) this;
        }

        public Criteria andSCreateDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("S_CREATE_DATE >=", value, "sCreateDate");
            return (Criteria) this;
        }

        public Criteria andSCreateDateLessThan(Date value) {
            addCriterionForJDBCDate("S_CREATE_DATE <", value, "sCreateDate");
            return (Criteria) this;
        }

        public Criteria andSCreateDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("S_CREATE_DATE <=", value, "sCreateDate");
            return (Criteria) this;
        }

        public Criteria andSCreateDateIn(List<Date> values) {
            addCriterionForJDBCDate("S_CREATE_DATE in", values, "sCreateDate");
            return (Criteria) this;
        }

        public Criteria andSCreateDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("S_CREATE_DATE not in", values, "sCreateDate");
            return (Criteria) this;
        }

        public Criteria andSCreateDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("S_CREATE_DATE between", value1, value2, "sCreateDate");
            return (Criteria) this;
        }

        public Criteria andSCreateDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("S_CREATE_DATE not between", value1, value2, "sCreateDate");
            return (Criteria) this;
        }

        public Criteria andSNoteIsNull() {
            addCriterion("S_NOTE is null");
            return (Criteria) this;
        }

        public Criteria andSNoteIsNotNull() {
            addCriterion("S_NOTE is not null");
            return (Criteria) this;
        }

        public Criteria andSNoteEqualTo(String value) {
            addCriterion("S_NOTE =", value, "sNote");
            return (Criteria) this;
        }

        public Criteria andSNoteNotEqualTo(String value) {
            addCriterion("S_NOTE <>", value, "sNote");
            return (Criteria) this;
        }

        public Criteria andSNoteGreaterThan(String value) {
            addCriterion("S_NOTE >", value, "sNote");
            return (Criteria) this;
        }

        public Criteria andSNoteGreaterThanOrEqualTo(String value) {
            addCriterion("S_NOTE >=", value, "sNote");
            return (Criteria) this;
        }

        public Criteria andSNoteLessThan(String value) {
            addCriterion("S_NOTE <", value, "sNote");
            return (Criteria) this;
        }

        public Criteria andSNoteLessThanOrEqualTo(String value) {
            addCriterion("S_NOTE <=", value, "sNote");
            return (Criteria) this;
        }

        public Criteria andSNoteLike(String value) {
            addCriterion("S_NOTE like", value, "sNote");
            return (Criteria) this;
        }

        public Criteria andSNoteNotLike(String value) {
            addCriterion("S_NOTE not like", value, "sNote");
            return (Criteria) this;
        }

        public Criteria andSNoteIn(List<String> values) {
            addCriterion("S_NOTE in", values, "sNote");
            return (Criteria) this;
        }

        public Criteria andSNoteNotIn(List<String> values) {
            addCriterion("S_NOTE not in", values, "sNote");
            return (Criteria) this;
        }

        public Criteria andSNoteBetween(String value1, String value2) {
            addCriterion("S_NOTE between", value1, value2, "sNote");
            return (Criteria) this;
        }

        public Criteria andSNoteNotBetween(String value1, String value2) {
            addCriterion("S_NOTE not between", value1, value2, "sNote");
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