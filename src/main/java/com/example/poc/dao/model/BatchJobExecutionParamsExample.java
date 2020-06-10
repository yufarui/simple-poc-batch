package com.example.poc.dao.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class BatchJobExecutionParamsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BatchJobExecutionParamsExample() {
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

        public Criteria andJobExecutionIdIsNull() {
            addCriterion("job_execution_id is null");
            return (Criteria) this;
        }

        public Criteria andJobExecutionIdIsNotNull() {
            addCriterion("job_execution_id is not null");
            return (Criteria) this;
        }

        public Criteria andJobExecutionIdEqualTo(Long value) {
            addCriterion("job_execution_id =", value, "jobExecutionId");
            return (Criteria) this;
        }

        public Criteria andJobExecutionIdNotEqualTo(Long value) {
            addCriterion("job_execution_id <>", value, "jobExecutionId");
            return (Criteria) this;
        }

        public Criteria andJobExecutionIdGreaterThan(Long value) {
            addCriterion("job_execution_id >", value, "jobExecutionId");
            return (Criteria) this;
        }

        public Criteria andJobExecutionIdGreaterThanOrEqualTo(Long value) {
            addCriterion("job_execution_id >=", value, "jobExecutionId");
            return (Criteria) this;
        }

        public Criteria andJobExecutionIdLessThan(Long value) {
            addCriterion("job_execution_id <", value, "jobExecutionId");
            return (Criteria) this;
        }

        public Criteria andJobExecutionIdLessThanOrEqualTo(Long value) {
            addCriterion("job_execution_id <=", value, "jobExecutionId");
            return (Criteria) this;
        }

        public Criteria andJobExecutionIdIn(List<Long> values) {
            addCriterion("job_execution_id in", values, "jobExecutionId");
            return (Criteria) this;
        }

        public Criteria andJobExecutionIdNotIn(List<Long> values) {
            addCriterion("job_execution_id not in", values, "jobExecutionId");
            return (Criteria) this;
        }

        public Criteria andJobExecutionIdBetween(Long value1, Long value2) {
            addCriterion("job_execution_id between", value1, value2, "jobExecutionId");
            return (Criteria) this;
        }

        public Criteria andJobExecutionIdNotBetween(Long value1, Long value2) {
            addCriterion("job_execution_id not between", value1, value2, "jobExecutionId");
            return (Criteria) this;
        }

        public Criteria andTypeCdIsNull() {
            addCriterion("type_cd is null");
            return (Criteria) this;
        }

        public Criteria andTypeCdIsNotNull() {
            addCriterion("type_cd is not null");
            return (Criteria) this;
        }

        public Criteria andTypeCdEqualTo(String value) {
            addCriterion("type_cd =", value, "typeCd");
            return (Criteria) this;
        }

        public Criteria andTypeCdNotEqualTo(String value) {
            addCriterion("type_cd <>", value, "typeCd");
            return (Criteria) this;
        }

        public Criteria andTypeCdGreaterThan(String value) {
            addCriterion("type_cd >", value, "typeCd");
            return (Criteria) this;
        }

        public Criteria andTypeCdGreaterThanOrEqualTo(String value) {
            addCriterion("type_cd >=", value, "typeCd");
            return (Criteria) this;
        }

        public Criteria andTypeCdLessThan(String value) {
            addCriterion("type_cd <", value, "typeCd");
            return (Criteria) this;
        }

        public Criteria andTypeCdLessThanOrEqualTo(String value) {
            addCriterion("type_cd <=", value, "typeCd");
            return (Criteria) this;
        }

        public Criteria andTypeCdLike(String value) {
            addCriterion("type_cd like", value, "typeCd");
            return (Criteria) this;
        }

        public Criteria andTypeCdNotLike(String value) {
            addCriterion("type_cd not like", value, "typeCd");
            return (Criteria) this;
        }

        public Criteria andTypeCdIn(List<String> values) {
            addCriterion("type_cd in", values, "typeCd");
            return (Criteria) this;
        }

        public Criteria andTypeCdNotIn(List<String> values) {
            addCriterion("type_cd not in", values, "typeCd");
            return (Criteria) this;
        }

        public Criteria andTypeCdBetween(String value1, String value2) {
            addCriterion("type_cd between", value1, value2, "typeCd");
            return (Criteria) this;
        }

        public Criteria andTypeCdNotBetween(String value1, String value2) {
            addCriterion("type_cd not between", value1, value2, "typeCd");
            return (Criteria) this;
        }

        public Criteria andKeyNameIsNull() {
            addCriterion("key_name is null");
            return (Criteria) this;
        }

        public Criteria andKeyNameIsNotNull() {
            addCriterion("key_name is not null");
            return (Criteria) this;
        }

        public Criteria andKeyNameEqualTo(String value) {
            addCriterion("key_name =", value, "keyName");
            return (Criteria) this;
        }

        public Criteria andKeyNameNotEqualTo(String value) {
            addCriterion("key_name <>", value, "keyName");
            return (Criteria) this;
        }

        public Criteria andKeyNameGreaterThan(String value) {
            addCriterion("key_name >", value, "keyName");
            return (Criteria) this;
        }

        public Criteria andKeyNameGreaterThanOrEqualTo(String value) {
            addCriterion("key_name >=", value, "keyName");
            return (Criteria) this;
        }

        public Criteria andKeyNameLessThan(String value) {
            addCriterion("key_name <", value, "keyName");
            return (Criteria) this;
        }

        public Criteria andKeyNameLessThanOrEqualTo(String value) {
            addCriterion("key_name <=", value, "keyName");
            return (Criteria) this;
        }

        public Criteria andKeyNameLike(String value) {
            addCriterion("key_name like", value, "keyName");
            return (Criteria) this;
        }

        public Criteria andKeyNameNotLike(String value) {
            addCriterion("key_name not like", value, "keyName");
            return (Criteria) this;
        }

        public Criteria andKeyNameIn(List<String> values) {
            addCriterion("key_name in", values, "keyName");
            return (Criteria) this;
        }

        public Criteria andKeyNameNotIn(List<String> values) {
            addCriterion("key_name not in", values, "keyName");
            return (Criteria) this;
        }

        public Criteria andKeyNameBetween(String value1, String value2) {
            addCriterion("key_name between", value1, value2, "keyName");
            return (Criteria) this;
        }

        public Criteria andKeyNameNotBetween(String value1, String value2) {
            addCriterion("key_name not between", value1, value2, "keyName");
            return (Criteria) this;
        }

        public Criteria andStringValIsNull() {
            addCriterion("string_val is null");
            return (Criteria) this;
        }

        public Criteria andStringValIsNotNull() {
            addCriterion("string_val is not null");
            return (Criteria) this;
        }

        public Criteria andStringValEqualTo(String value) {
            addCriterion("string_val =", value, "stringVal");
            return (Criteria) this;
        }

        public Criteria andStringValNotEqualTo(String value) {
            addCriterion("string_val <>", value, "stringVal");
            return (Criteria) this;
        }

        public Criteria andStringValGreaterThan(String value) {
            addCriterion("string_val >", value, "stringVal");
            return (Criteria) this;
        }

        public Criteria andStringValGreaterThanOrEqualTo(String value) {
            addCriterion("string_val >=", value, "stringVal");
            return (Criteria) this;
        }

        public Criteria andStringValLessThan(String value) {
            addCriterion("string_val <", value, "stringVal");
            return (Criteria) this;
        }

        public Criteria andStringValLessThanOrEqualTo(String value) {
            addCriterion("string_val <=", value, "stringVal");
            return (Criteria) this;
        }

        public Criteria andStringValLike(String value) {
            addCriterion("string_val like", value, "stringVal");
            return (Criteria) this;
        }

        public Criteria andStringValNotLike(String value) {
            addCriterion("string_val not like", value, "stringVal");
            return (Criteria) this;
        }

        public Criteria andStringValIn(List<String> values) {
            addCriterion("string_val in", values, "stringVal");
            return (Criteria) this;
        }

        public Criteria andStringValNotIn(List<String> values) {
            addCriterion("string_val not in", values, "stringVal");
            return (Criteria) this;
        }

        public Criteria andStringValBetween(String value1, String value2) {
            addCriterion("string_val between", value1, value2, "stringVal");
            return (Criteria) this;
        }

        public Criteria andStringValNotBetween(String value1, String value2) {
            addCriterion("string_val not between", value1, value2, "stringVal");
            return (Criteria) this;
        }

        public Criteria andDateValIsNull() {
            addCriterion("date_val is null");
            return (Criteria) this;
        }

        public Criteria andDateValIsNotNull() {
            addCriterion("date_val is not null");
            return (Criteria) this;
        }

        public Criteria andDateValEqualTo(Date value) {
            addCriterion("date_val =", value, "dateVal");
            return (Criteria) this;
        }

        public Criteria andDateValNotEqualTo(Date value) {
            addCriterion("date_val <>", value, "dateVal");
            return (Criteria) this;
        }

        public Criteria andDateValGreaterThan(Date value) {
            addCriterion("date_val >", value, "dateVal");
            return (Criteria) this;
        }

        public Criteria andDateValGreaterThanOrEqualTo(Date value) {
            addCriterion("date_val >=", value, "dateVal");
            return (Criteria) this;
        }

        public Criteria andDateValLessThan(Date value) {
            addCriterion("date_val <", value, "dateVal");
            return (Criteria) this;
        }

        public Criteria andDateValLessThanOrEqualTo(Date value) {
            addCriterion("date_val <=", value, "dateVal");
            return (Criteria) this;
        }

        public Criteria andDateValIn(List<Date> values) {
            addCriterion("date_val in", values, "dateVal");
            return (Criteria) this;
        }

        public Criteria andDateValNotIn(List<Date> values) {
            addCriterion("date_val not in", values, "dateVal");
            return (Criteria) this;
        }

        public Criteria andDateValBetween(Date value1, Date value2) {
            addCriterion("date_val between", value1, value2, "dateVal");
            return (Criteria) this;
        }

        public Criteria andDateValNotBetween(Date value1, Date value2) {
            addCriterion("date_val not between", value1, value2, "dateVal");
            return (Criteria) this;
        }

        public Criteria andLongValIsNull() {
            addCriterion("long_val is null");
            return (Criteria) this;
        }

        public Criteria andLongValIsNotNull() {
            addCriterion("long_val is not null");
            return (Criteria) this;
        }

        public Criteria andLongValEqualTo(Long value) {
            addCriterion("long_val =", value, "longVal");
            return (Criteria) this;
        }

        public Criteria andLongValNotEqualTo(Long value) {
            addCriterion("long_val <>", value, "longVal");
            return (Criteria) this;
        }

        public Criteria andLongValGreaterThan(Long value) {
            addCriterion("long_val >", value, "longVal");
            return (Criteria) this;
        }

        public Criteria andLongValGreaterThanOrEqualTo(Long value) {
            addCriterion("long_val >=", value, "longVal");
            return (Criteria) this;
        }

        public Criteria andLongValLessThan(Long value) {
            addCriterion("long_val <", value, "longVal");
            return (Criteria) this;
        }

        public Criteria andLongValLessThanOrEqualTo(Long value) {
            addCriterion("long_val <=", value, "longVal");
            return (Criteria) this;
        }

        public Criteria andLongValIn(List<Long> values) {
            addCriterion("long_val in", values, "longVal");
            return (Criteria) this;
        }

        public Criteria andLongValNotIn(List<Long> values) {
            addCriterion("long_val not in", values, "longVal");
            return (Criteria) this;
        }

        public Criteria andLongValBetween(Long value1, Long value2) {
            addCriterion("long_val between", value1, value2, "longVal");
            return (Criteria) this;
        }

        public Criteria andLongValNotBetween(Long value1, Long value2) {
            addCriterion("long_val not between", value1, value2, "longVal");
            return (Criteria) this;
        }

        public Criteria andDoubleValIsNull() {
            addCriterion("double_val is null");
            return (Criteria) this;
        }

        public Criteria andDoubleValIsNotNull() {
            addCriterion("double_val is not null");
            return (Criteria) this;
        }

        public Criteria andDoubleValEqualTo(Double value) {
            addCriterion("double_val =", value, "doubleVal");
            return (Criteria) this;
        }

        public Criteria andDoubleValNotEqualTo(Double value) {
            addCriterion("double_val <>", value, "doubleVal");
            return (Criteria) this;
        }

        public Criteria andDoubleValGreaterThan(Double value) {
            addCriterion("double_val >", value, "doubleVal");
            return (Criteria) this;
        }

        public Criteria andDoubleValGreaterThanOrEqualTo(Double value) {
            addCriterion("double_val >=", value, "doubleVal");
            return (Criteria) this;
        }

        public Criteria andDoubleValLessThan(Double value) {
            addCriterion("double_val <", value, "doubleVal");
            return (Criteria) this;
        }

        public Criteria andDoubleValLessThanOrEqualTo(Double value) {
            addCriterion("double_val <=", value, "doubleVal");
            return (Criteria) this;
        }

        public Criteria andDoubleValIn(List<Double> values) {
            addCriterion("double_val in", values, "doubleVal");
            return (Criteria) this;
        }

        public Criteria andDoubleValNotIn(List<Double> values) {
            addCriterion("double_val not in", values, "doubleVal");
            return (Criteria) this;
        }

        public Criteria andDoubleValBetween(Double value1, Double value2) {
            addCriterion("double_val between", value1, value2, "doubleVal");
            return (Criteria) this;
        }

        public Criteria andDoubleValNotBetween(Double value1, Double value2) {
            addCriterion("double_val not between", value1, value2, "doubleVal");
            return (Criteria) this;
        }

        public Criteria andIdentifyingIsNull() {
            addCriterion("identifying is null");
            return (Criteria) this;
        }

        public Criteria andIdentifyingIsNotNull() {
            addCriterion("identifying is not null");
            return (Criteria) this;
        }

        public Criteria andIdentifyingEqualTo(String value) {
            addCriterion("identifying =", value, "identifying");
            return (Criteria) this;
        }

        public Criteria andIdentifyingNotEqualTo(String value) {
            addCriterion("identifying <>", value, "identifying");
            return (Criteria) this;
        }

        public Criteria andIdentifyingGreaterThan(String value) {
            addCriterion("identifying >", value, "identifying");
            return (Criteria) this;
        }

        public Criteria andIdentifyingGreaterThanOrEqualTo(String value) {
            addCriterion("identifying >=", value, "identifying");
            return (Criteria) this;
        }

        public Criteria andIdentifyingLessThan(String value) {
            addCriterion("identifying <", value, "identifying");
            return (Criteria) this;
        }

        public Criteria andIdentifyingLessThanOrEqualTo(String value) {
            addCriterion("identifying <=", value, "identifying");
            return (Criteria) this;
        }

        public Criteria andIdentifyingLike(String value) {
            addCriterion("identifying like", value, "identifying");
            return (Criteria) this;
        }

        public Criteria andIdentifyingNotLike(String value) {
            addCriterion("identifying not like", value, "identifying");
            return (Criteria) this;
        }

        public Criteria andIdentifyingIn(List<String> values) {
            addCriterion("identifying in", values, "identifying");
            return (Criteria) this;
        }

        public Criteria andIdentifyingNotIn(List<String> values) {
            addCriterion("identifying not in", values, "identifying");
            return (Criteria) this;
        }

        public Criteria andIdentifyingBetween(String value1, String value2) {
            addCriterion("identifying between", value1, value2, "identifying");
            return (Criteria) this;
        }

        public Criteria andIdentifyingNotBetween(String value1, String value2) {
            addCriterion("identifying not between", value1, value2, "identifying");
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