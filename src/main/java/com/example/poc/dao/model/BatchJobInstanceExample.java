package com.example.poc.dao.model;

import java.util.ArrayList;
import java.util.List;

public class BatchJobInstanceExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BatchJobInstanceExample() {
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

        public Criteria andJobInstanceIdIsNull() {
            addCriterion("job_instance_id is null");
            return (Criteria) this;
        }

        public Criteria andJobInstanceIdIsNotNull() {
            addCriterion("job_instance_id is not null");
            return (Criteria) this;
        }

        public Criteria andJobInstanceIdEqualTo(Long value) {
            addCriterion("job_instance_id =", value, "jobInstanceId");
            return (Criteria) this;
        }

        public Criteria andJobInstanceIdNotEqualTo(Long value) {
            addCriterion("job_instance_id <>", value, "jobInstanceId");
            return (Criteria) this;
        }

        public Criteria andJobInstanceIdGreaterThan(Long value) {
            addCriterion("job_instance_id >", value, "jobInstanceId");
            return (Criteria) this;
        }

        public Criteria andJobInstanceIdGreaterThanOrEqualTo(Long value) {
            addCriterion("job_instance_id >=", value, "jobInstanceId");
            return (Criteria) this;
        }

        public Criteria andJobInstanceIdLessThan(Long value) {
            addCriterion("job_instance_id <", value, "jobInstanceId");
            return (Criteria) this;
        }

        public Criteria andJobInstanceIdLessThanOrEqualTo(Long value) {
            addCriterion("job_instance_id <=", value, "jobInstanceId");
            return (Criteria) this;
        }

        public Criteria andJobInstanceIdIn(List<Long> values) {
            addCriterion("job_instance_id in", values, "jobInstanceId");
            return (Criteria) this;
        }

        public Criteria andJobInstanceIdNotIn(List<Long> values) {
            addCriterion("job_instance_id not in", values, "jobInstanceId");
            return (Criteria) this;
        }

        public Criteria andJobInstanceIdBetween(Long value1, Long value2) {
            addCriterion("job_instance_id between", value1, value2, "jobInstanceId");
            return (Criteria) this;
        }

        public Criteria andJobInstanceIdNotBetween(Long value1, Long value2) {
            addCriterion("job_instance_id not between", value1, value2, "jobInstanceId");
            return (Criteria) this;
        }

        public Criteria andVersionIsNull() {
            addCriterion("version is null");
            return (Criteria) this;
        }

        public Criteria andVersionIsNotNull() {
            addCriterion("version is not null");
            return (Criteria) this;
        }

        public Criteria andVersionEqualTo(Long value) {
            addCriterion("version =", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionNotEqualTo(Long value) {
            addCriterion("version <>", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionGreaterThan(Long value) {
            addCriterion("version >", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionGreaterThanOrEqualTo(Long value) {
            addCriterion("version >=", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionLessThan(Long value) {
            addCriterion("version <", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionLessThanOrEqualTo(Long value) {
            addCriterion("version <=", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionIn(List<Long> values) {
            addCriterion("version in", values, "version");
            return (Criteria) this;
        }

        public Criteria andVersionNotIn(List<Long> values) {
            addCriterion("version not in", values, "version");
            return (Criteria) this;
        }

        public Criteria andVersionBetween(Long value1, Long value2) {
            addCriterion("version between", value1, value2, "version");
            return (Criteria) this;
        }

        public Criteria andVersionNotBetween(Long value1, Long value2) {
            addCriterion("version not between", value1, value2, "version");
            return (Criteria) this;
        }

        public Criteria andJobNameIsNull() {
            addCriterion("job_name is null");
            return (Criteria) this;
        }

        public Criteria andJobNameIsNotNull() {
            addCriterion("job_name is not null");
            return (Criteria) this;
        }

        public Criteria andJobNameEqualTo(String value) {
            addCriterion("job_name =", value, "jobName");
            return (Criteria) this;
        }

        public Criteria andJobNameNotEqualTo(String value) {
            addCriterion("job_name <>", value, "jobName");
            return (Criteria) this;
        }

        public Criteria andJobNameGreaterThan(String value) {
            addCriterion("job_name >", value, "jobName");
            return (Criteria) this;
        }

        public Criteria andJobNameGreaterThanOrEqualTo(String value) {
            addCriterion("job_name >=", value, "jobName");
            return (Criteria) this;
        }

        public Criteria andJobNameLessThan(String value) {
            addCriterion("job_name <", value, "jobName");
            return (Criteria) this;
        }

        public Criteria andJobNameLessThanOrEqualTo(String value) {
            addCriterion("job_name <=", value, "jobName");
            return (Criteria) this;
        }

        public Criteria andJobNameLike(String value) {
            addCriterion("job_name like", value, "jobName");
            return (Criteria) this;
        }

        public Criteria andJobNameNotLike(String value) {
            addCriterion("job_name not like", value, "jobName");
            return (Criteria) this;
        }

        public Criteria andJobNameIn(List<String> values) {
            addCriterion("job_name in", values, "jobName");
            return (Criteria) this;
        }

        public Criteria andJobNameNotIn(List<String> values) {
            addCriterion("job_name not in", values, "jobName");
            return (Criteria) this;
        }

        public Criteria andJobNameBetween(String value1, String value2) {
            addCriterion("job_name between", value1, value2, "jobName");
            return (Criteria) this;
        }

        public Criteria andJobNameNotBetween(String value1, String value2) {
            addCriterion("job_name not between", value1, value2, "jobName");
            return (Criteria) this;
        }

        public Criteria andJobKeyIsNull() {
            addCriterion("job_key is null");
            return (Criteria) this;
        }

        public Criteria andJobKeyIsNotNull() {
            addCriterion("job_key is not null");
            return (Criteria) this;
        }

        public Criteria andJobKeyEqualTo(String value) {
            addCriterion("job_key =", value, "jobKey");
            return (Criteria) this;
        }

        public Criteria andJobKeyNotEqualTo(String value) {
            addCriterion("job_key <>", value, "jobKey");
            return (Criteria) this;
        }

        public Criteria andJobKeyGreaterThan(String value) {
            addCriterion("job_key >", value, "jobKey");
            return (Criteria) this;
        }

        public Criteria andJobKeyGreaterThanOrEqualTo(String value) {
            addCriterion("job_key >=", value, "jobKey");
            return (Criteria) this;
        }

        public Criteria andJobKeyLessThan(String value) {
            addCriterion("job_key <", value, "jobKey");
            return (Criteria) this;
        }

        public Criteria andJobKeyLessThanOrEqualTo(String value) {
            addCriterion("job_key <=", value, "jobKey");
            return (Criteria) this;
        }

        public Criteria andJobKeyLike(String value) {
            addCriterion("job_key like", value, "jobKey");
            return (Criteria) this;
        }

        public Criteria andJobKeyNotLike(String value) {
            addCriterion("job_key not like", value, "jobKey");
            return (Criteria) this;
        }

        public Criteria andJobKeyIn(List<String> values) {
            addCriterion("job_key in", values, "jobKey");
            return (Criteria) this;
        }

        public Criteria andJobKeyNotIn(List<String> values) {
            addCriterion("job_key not in", values, "jobKey");
            return (Criteria) this;
        }

        public Criteria andJobKeyBetween(String value1, String value2) {
            addCriterion("job_key between", value1, value2, "jobKey");
            return (Criteria) this;
        }

        public Criteria andJobKeyNotBetween(String value1, String value2) {
            addCriterion("job_key not between", value1, value2, "jobKey");
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