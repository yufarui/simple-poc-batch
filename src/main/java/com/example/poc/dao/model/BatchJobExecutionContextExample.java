package com.example.poc.dao.model;

import java.util.ArrayList;
import java.util.List;

public class BatchJobExecutionContextExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BatchJobExecutionContextExample() {
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

        public Criteria andShortContextIsNull() {
            addCriterion("short_context is null");
            return (Criteria) this;
        }

        public Criteria andShortContextIsNotNull() {
            addCriterion("short_context is not null");
            return (Criteria) this;
        }

        public Criteria andShortContextEqualTo(String value) {
            addCriterion("short_context =", value, "shortContext");
            return (Criteria) this;
        }

        public Criteria andShortContextNotEqualTo(String value) {
            addCriterion("short_context <>", value, "shortContext");
            return (Criteria) this;
        }

        public Criteria andShortContextGreaterThan(String value) {
            addCriterion("short_context >", value, "shortContext");
            return (Criteria) this;
        }

        public Criteria andShortContextGreaterThanOrEqualTo(String value) {
            addCriterion("short_context >=", value, "shortContext");
            return (Criteria) this;
        }

        public Criteria andShortContextLessThan(String value) {
            addCriterion("short_context <", value, "shortContext");
            return (Criteria) this;
        }

        public Criteria andShortContextLessThanOrEqualTo(String value) {
            addCriterion("short_context <=", value, "shortContext");
            return (Criteria) this;
        }

        public Criteria andShortContextLike(String value) {
            addCriterion("short_context like", value, "shortContext");
            return (Criteria) this;
        }

        public Criteria andShortContextNotLike(String value) {
            addCriterion("short_context not like", value, "shortContext");
            return (Criteria) this;
        }

        public Criteria andShortContextIn(List<String> values) {
            addCriterion("short_context in", values, "shortContext");
            return (Criteria) this;
        }

        public Criteria andShortContextNotIn(List<String> values) {
            addCriterion("short_context not in", values, "shortContext");
            return (Criteria) this;
        }

        public Criteria andShortContextBetween(String value1, String value2) {
            addCriterion("short_context between", value1, value2, "shortContext");
            return (Criteria) this;
        }

        public Criteria andShortContextNotBetween(String value1, String value2) {
            addCriterion("short_context not between", value1, value2, "shortContext");
            return (Criteria) this;
        }

        public Criteria andSerializedContextIsNull() {
            addCriterion("serialized_context is null");
            return (Criteria) this;
        }

        public Criteria andSerializedContextIsNotNull() {
            addCriterion("serialized_context is not null");
            return (Criteria) this;
        }

        public Criteria andSerializedContextEqualTo(String value) {
            addCriterion("serialized_context =", value, "serializedContext");
            return (Criteria) this;
        }

        public Criteria andSerializedContextNotEqualTo(String value) {
            addCriterion("serialized_context <>", value, "serializedContext");
            return (Criteria) this;
        }

        public Criteria andSerializedContextGreaterThan(String value) {
            addCriterion("serialized_context >", value, "serializedContext");
            return (Criteria) this;
        }

        public Criteria andSerializedContextGreaterThanOrEqualTo(String value) {
            addCriterion("serialized_context >=", value, "serializedContext");
            return (Criteria) this;
        }

        public Criteria andSerializedContextLessThan(String value) {
            addCriterion("serialized_context <", value, "serializedContext");
            return (Criteria) this;
        }

        public Criteria andSerializedContextLessThanOrEqualTo(String value) {
            addCriterion("serialized_context <=", value, "serializedContext");
            return (Criteria) this;
        }

        public Criteria andSerializedContextLike(String value) {
            addCriterion("serialized_context like", value, "serializedContext");
            return (Criteria) this;
        }

        public Criteria andSerializedContextNotLike(String value) {
            addCriterion("serialized_context not like", value, "serializedContext");
            return (Criteria) this;
        }

        public Criteria andSerializedContextIn(List<String> values) {
            addCriterion("serialized_context in", values, "serializedContext");
            return (Criteria) this;
        }

        public Criteria andSerializedContextNotIn(List<String> values) {
            addCriterion("serialized_context not in", values, "serializedContext");
            return (Criteria) this;
        }

        public Criteria andSerializedContextBetween(String value1, String value2) {
            addCriterion("serialized_context between", value1, value2, "serializedContext");
            return (Criteria) this;
        }

        public Criteria andSerializedContextNotBetween(String value1, String value2) {
            addCriterion("serialized_context not between", value1, value2, "serializedContext");
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