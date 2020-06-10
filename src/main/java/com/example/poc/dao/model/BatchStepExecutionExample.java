package com.example.poc.dao.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class BatchStepExecutionExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BatchStepExecutionExample() {
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

        public Criteria andStepExecutionIdIsNull() {
            addCriterion("step_execution_id is null");
            return (Criteria) this;
        }

        public Criteria andStepExecutionIdIsNotNull() {
            addCriterion("step_execution_id is not null");
            return (Criteria) this;
        }

        public Criteria andStepExecutionIdEqualTo(Long value) {
            addCriterion("step_execution_id =", value, "stepExecutionId");
            return (Criteria) this;
        }

        public Criteria andStepExecutionIdNotEqualTo(Long value) {
            addCriterion("step_execution_id <>", value, "stepExecutionId");
            return (Criteria) this;
        }

        public Criteria andStepExecutionIdGreaterThan(Long value) {
            addCriterion("step_execution_id >", value, "stepExecutionId");
            return (Criteria) this;
        }

        public Criteria andStepExecutionIdGreaterThanOrEqualTo(Long value) {
            addCriterion("step_execution_id >=", value, "stepExecutionId");
            return (Criteria) this;
        }

        public Criteria andStepExecutionIdLessThan(Long value) {
            addCriterion("step_execution_id <", value, "stepExecutionId");
            return (Criteria) this;
        }

        public Criteria andStepExecutionIdLessThanOrEqualTo(Long value) {
            addCriterion("step_execution_id <=", value, "stepExecutionId");
            return (Criteria) this;
        }

        public Criteria andStepExecutionIdIn(List<Long> values) {
            addCriterion("step_execution_id in", values, "stepExecutionId");
            return (Criteria) this;
        }

        public Criteria andStepExecutionIdNotIn(List<Long> values) {
            addCriterion("step_execution_id not in", values, "stepExecutionId");
            return (Criteria) this;
        }

        public Criteria andStepExecutionIdBetween(Long value1, Long value2) {
            addCriterion("step_execution_id between", value1, value2, "stepExecutionId");
            return (Criteria) this;
        }

        public Criteria andStepExecutionIdNotBetween(Long value1, Long value2) {
            addCriterion("step_execution_id not between", value1, value2, "stepExecutionId");
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

        public Criteria andStepNameIsNull() {
            addCriterion("step_name is null");
            return (Criteria) this;
        }

        public Criteria andStepNameIsNotNull() {
            addCriterion("step_name is not null");
            return (Criteria) this;
        }

        public Criteria andStepNameEqualTo(String value) {
            addCriterion("step_name =", value, "stepName");
            return (Criteria) this;
        }

        public Criteria andStepNameNotEqualTo(String value) {
            addCriterion("step_name <>", value, "stepName");
            return (Criteria) this;
        }

        public Criteria andStepNameGreaterThan(String value) {
            addCriterion("step_name >", value, "stepName");
            return (Criteria) this;
        }

        public Criteria andStepNameGreaterThanOrEqualTo(String value) {
            addCriterion("step_name >=", value, "stepName");
            return (Criteria) this;
        }

        public Criteria andStepNameLessThan(String value) {
            addCriterion("step_name <", value, "stepName");
            return (Criteria) this;
        }

        public Criteria andStepNameLessThanOrEqualTo(String value) {
            addCriterion("step_name <=", value, "stepName");
            return (Criteria) this;
        }

        public Criteria andStepNameLike(String value) {
            addCriterion("step_name like", value, "stepName");
            return (Criteria) this;
        }

        public Criteria andStepNameNotLike(String value) {
            addCriterion("step_name not like", value, "stepName");
            return (Criteria) this;
        }

        public Criteria andStepNameIn(List<String> values) {
            addCriterion("step_name in", values, "stepName");
            return (Criteria) this;
        }

        public Criteria andStepNameNotIn(List<String> values) {
            addCriterion("step_name not in", values, "stepName");
            return (Criteria) this;
        }

        public Criteria andStepNameBetween(String value1, String value2) {
            addCriterion("step_name between", value1, value2, "stepName");
            return (Criteria) this;
        }

        public Criteria andStepNameNotBetween(String value1, String value2) {
            addCriterion("step_name not between", value1, value2, "stepName");
            return (Criteria) this;
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

        public Criteria andStartTimeIsNull() {
            addCriterion("start_time is null");
            return (Criteria) this;
        }

        public Criteria andStartTimeIsNotNull() {
            addCriterion("start_time is not null");
            return (Criteria) this;
        }

        public Criteria andStartTimeEqualTo(Date value) {
            addCriterion("start_time =", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeNotEqualTo(Date value) {
            addCriterion("start_time <>", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeGreaterThan(Date value) {
            addCriterion("start_time >", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("start_time >=", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeLessThan(Date value) {
            addCriterion("start_time <", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeLessThanOrEqualTo(Date value) {
            addCriterion("start_time <=", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeIn(List<Date> values) {
            addCriterion("start_time in", values, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeNotIn(List<Date> values) {
            addCriterion("start_time not in", values, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeBetween(Date value1, Date value2) {
            addCriterion("start_time between", value1, value2, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeNotBetween(Date value1, Date value2) {
            addCriterion("start_time not between", value1, value2, "startTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeIsNull() {
            addCriterion("end_time is null");
            return (Criteria) this;
        }

        public Criteria andEndTimeIsNotNull() {
            addCriterion("end_time is not null");
            return (Criteria) this;
        }

        public Criteria andEndTimeEqualTo(Date value) {
            addCriterion("end_time =", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeNotEqualTo(Date value) {
            addCriterion("end_time <>", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeGreaterThan(Date value) {
            addCriterion("end_time >", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("end_time >=", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeLessThan(Date value) {
            addCriterion("end_time <", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeLessThanOrEqualTo(Date value) {
            addCriterion("end_time <=", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeIn(List<Date> values) {
            addCriterion("end_time in", values, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeNotIn(List<Date> values) {
            addCriterion("end_time not in", values, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeBetween(Date value1, Date value2) {
            addCriterion("end_time between", value1, value2, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeNotBetween(Date value1, Date value2) {
            addCriterion("end_time not between", value1, value2, "endTime");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("status is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("status is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(String value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(String value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(String value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(String value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(String value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(String value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLike(String value) {
            addCriterion("status like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotLike(String value) {
            addCriterion("status not like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<String> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<String> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(String value1, String value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(String value1, String value2) {
            addCriterion("status not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andCommitCountIsNull() {
            addCriterion("commit_count is null");
            return (Criteria) this;
        }

        public Criteria andCommitCountIsNotNull() {
            addCriterion("commit_count is not null");
            return (Criteria) this;
        }

        public Criteria andCommitCountEqualTo(Long value) {
            addCriterion("commit_count =", value, "commitCount");
            return (Criteria) this;
        }

        public Criteria andCommitCountNotEqualTo(Long value) {
            addCriterion("commit_count <>", value, "commitCount");
            return (Criteria) this;
        }

        public Criteria andCommitCountGreaterThan(Long value) {
            addCriterion("commit_count >", value, "commitCount");
            return (Criteria) this;
        }

        public Criteria andCommitCountGreaterThanOrEqualTo(Long value) {
            addCriterion("commit_count >=", value, "commitCount");
            return (Criteria) this;
        }

        public Criteria andCommitCountLessThan(Long value) {
            addCriterion("commit_count <", value, "commitCount");
            return (Criteria) this;
        }

        public Criteria andCommitCountLessThanOrEqualTo(Long value) {
            addCriterion("commit_count <=", value, "commitCount");
            return (Criteria) this;
        }

        public Criteria andCommitCountIn(List<Long> values) {
            addCriterion("commit_count in", values, "commitCount");
            return (Criteria) this;
        }

        public Criteria andCommitCountNotIn(List<Long> values) {
            addCriterion("commit_count not in", values, "commitCount");
            return (Criteria) this;
        }

        public Criteria andCommitCountBetween(Long value1, Long value2) {
            addCriterion("commit_count between", value1, value2, "commitCount");
            return (Criteria) this;
        }

        public Criteria andCommitCountNotBetween(Long value1, Long value2) {
            addCriterion("commit_count not between", value1, value2, "commitCount");
            return (Criteria) this;
        }

        public Criteria andReadCountIsNull() {
            addCriterion("read_count is null");
            return (Criteria) this;
        }

        public Criteria andReadCountIsNotNull() {
            addCriterion("read_count is not null");
            return (Criteria) this;
        }

        public Criteria andReadCountEqualTo(Long value) {
            addCriterion("read_count =", value, "readCount");
            return (Criteria) this;
        }

        public Criteria andReadCountNotEqualTo(Long value) {
            addCriterion("read_count <>", value, "readCount");
            return (Criteria) this;
        }

        public Criteria andReadCountGreaterThan(Long value) {
            addCriterion("read_count >", value, "readCount");
            return (Criteria) this;
        }

        public Criteria andReadCountGreaterThanOrEqualTo(Long value) {
            addCriterion("read_count >=", value, "readCount");
            return (Criteria) this;
        }

        public Criteria andReadCountLessThan(Long value) {
            addCriterion("read_count <", value, "readCount");
            return (Criteria) this;
        }

        public Criteria andReadCountLessThanOrEqualTo(Long value) {
            addCriterion("read_count <=", value, "readCount");
            return (Criteria) this;
        }

        public Criteria andReadCountIn(List<Long> values) {
            addCriterion("read_count in", values, "readCount");
            return (Criteria) this;
        }

        public Criteria andReadCountNotIn(List<Long> values) {
            addCriterion("read_count not in", values, "readCount");
            return (Criteria) this;
        }

        public Criteria andReadCountBetween(Long value1, Long value2) {
            addCriterion("read_count between", value1, value2, "readCount");
            return (Criteria) this;
        }

        public Criteria andReadCountNotBetween(Long value1, Long value2) {
            addCriterion("read_count not between", value1, value2, "readCount");
            return (Criteria) this;
        }

        public Criteria andFilterCountIsNull() {
            addCriterion("filter_count is null");
            return (Criteria) this;
        }

        public Criteria andFilterCountIsNotNull() {
            addCriterion("filter_count is not null");
            return (Criteria) this;
        }

        public Criteria andFilterCountEqualTo(Long value) {
            addCriterion("filter_count =", value, "filterCount");
            return (Criteria) this;
        }

        public Criteria andFilterCountNotEqualTo(Long value) {
            addCriterion("filter_count <>", value, "filterCount");
            return (Criteria) this;
        }

        public Criteria andFilterCountGreaterThan(Long value) {
            addCriterion("filter_count >", value, "filterCount");
            return (Criteria) this;
        }

        public Criteria andFilterCountGreaterThanOrEqualTo(Long value) {
            addCriterion("filter_count >=", value, "filterCount");
            return (Criteria) this;
        }

        public Criteria andFilterCountLessThan(Long value) {
            addCriterion("filter_count <", value, "filterCount");
            return (Criteria) this;
        }

        public Criteria andFilterCountLessThanOrEqualTo(Long value) {
            addCriterion("filter_count <=", value, "filterCount");
            return (Criteria) this;
        }

        public Criteria andFilterCountIn(List<Long> values) {
            addCriterion("filter_count in", values, "filterCount");
            return (Criteria) this;
        }

        public Criteria andFilterCountNotIn(List<Long> values) {
            addCriterion("filter_count not in", values, "filterCount");
            return (Criteria) this;
        }

        public Criteria andFilterCountBetween(Long value1, Long value2) {
            addCriterion("filter_count between", value1, value2, "filterCount");
            return (Criteria) this;
        }

        public Criteria andFilterCountNotBetween(Long value1, Long value2) {
            addCriterion("filter_count not between", value1, value2, "filterCount");
            return (Criteria) this;
        }

        public Criteria andWriteCountIsNull() {
            addCriterion("write_count is null");
            return (Criteria) this;
        }

        public Criteria andWriteCountIsNotNull() {
            addCriterion("write_count is not null");
            return (Criteria) this;
        }

        public Criteria andWriteCountEqualTo(Long value) {
            addCriterion("write_count =", value, "writeCount");
            return (Criteria) this;
        }

        public Criteria andWriteCountNotEqualTo(Long value) {
            addCriterion("write_count <>", value, "writeCount");
            return (Criteria) this;
        }

        public Criteria andWriteCountGreaterThan(Long value) {
            addCriterion("write_count >", value, "writeCount");
            return (Criteria) this;
        }

        public Criteria andWriteCountGreaterThanOrEqualTo(Long value) {
            addCriterion("write_count >=", value, "writeCount");
            return (Criteria) this;
        }

        public Criteria andWriteCountLessThan(Long value) {
            addCriterion("write_count <", value, "writeCount");
            return (Criteria) this;
        }

        public Criteria andWriteCountLessThanOrEqualTo(Long value) {
            addCriterion("write_count <=", value, "writeCount");
            return (Criteria) this;
        }

        public Criteria andWriteCountIn(List<Long> values) {
            addCriterion("write_count in", values, "writeCount");
            return (Criteria) this;
        }

        public Criteria andWriteCountNotIn(List<Long> values) {
            addCriterion("write_count not in", values, "writeCount");
            return (Criteria) this;
        }

        public Criteria andWriteCountBetween(Long value1, Long value2) {
            addCriterion("write_count between", value1, value2, "writeCount");
            return (Criteria) this;
        }

        public Criteria andWriteCountNotBetween(Long value1, Long value2) {
            addCriterion("write_count not between", value1, value2, "writeCount");
            return (Criteria) this;
        }

        public Criteria andReadSkipCountIsNull() {
            addCriterion("read_skip_count is null");
            return (Criteria) this;
        }

        public Criteria andReadSkipCountIsNotNull() {
            addCriterion("read_skip_count is not null");
            return (Criteria) this;
        }

        public Criteria andReadSkipCountEqualTo(Long value) {
            addCriterion("read_skip_count =", value, "readSkipCount");
            return (Criteria) this;
        }

        public Criteria andReadSkipCountNotEqualTo(Long value) {
            addCriterion("read_skip_count <>", value, "readSkipCount");
            return (Criteria) this;
        }

        public Criteria andReadSkipCountGreaterThan(Long value) {
            addCriterion("read_skip_count >", value, "readSkipCount");
            return (Criteria) this;
        }

        public Criteria andReadSkipCountGreaterThanOrEqualTo(Long value) {
            addCriterion("read_skip_count >=", value, "readSkipCount");
            return (Criteria) this;
        }

        public Criteria andReadSkipCountLessThan(Long value) {
            addCriterion("read_skip_count <", value, "readSkipCount");
            return (Criteria) this;
        }

        public Criteria andReadSkipCountLessThanOrEqualTo(Long value) {
            addCriterion("read_skip_count <=", value, "readSkipCount");
            return (Criteria) this;
        }

        public Criteria andReadSkipCountIn(List<Long> values) {
            addCriterion("read_skip_count in", values, "readSkipCount");
            return (Criteria) this;
        }

        public Criteria andReadSkipCountNotIn(List<Long> values) {
            addCriterion("read_skip_count not in", values, "readSkipCount");
            return (Criteria) this;
        }

        public Criteria andReadSkipCountBetween(Long value1, Long value2) {
            addCriterion("read_skip_count between", value1, value2, "readSkipCount");
            return (Criteria) this;
        }

        public Criteria andReadSkipCountNotBetween(Long value1, Long value2) {
            addCriterion("read_skip_count not between", value1, value2, "readSkipCount");
            return (Criteria) this;
        }

        public Criteria andWriteSkipCountIsNull() {
            addCriterion("write_skip_count is null");
            return (Criteria) this;
        }

        public Criteria andWriteSkipCountIsNotNull() {
            addCriterion("write_skip_count is not null");
            return (Criteria) this;
        }

        public Criteria andWriteSkipCountEqualTo(Long value) {
            addCriterion("write_skip_count =", value, "writeSkipCount");
            return (Criteria) this;
        }

        public Criteria andWriteSkipCountNotEqualTo(Long value) {
            addCriterion("write_skip_count <>", value, "writeSkipCount");
            return (Criteria) this;
        }

        public Criteria andWriteSkipCountGreaterThan(Long value) {
            addCriterion("write_skip_count >", value, "writeSkipCount");
            return (Criteria) this;
        }

        public Criteria andWriteSkipCountGreaterThanOrEqualTo(Long value) {
            addCriterion("write_skip_count >=", value, "writeSkipCount");
            return (Criteria) this;
        }

        public Criteria andWriteSkipCountLessThan(Long value) {
            addCriterion("write_skip_count <", value, "writeSkipCount");
            return (Criteria) this;
        }

        public Criteria andWriteSkipCountLessThanOrEqualTo(Long value) {
            addCriterion("write_skip_count <=", value, "writeSkipCount");
            return (Criteria) this;
        }

        public Criteria andWriteSkipCountIn(List<Long> values) {
            addCriterion("write_skip_count in", values, "writeSkipCount");
            return (Criteria) this;
        }

        public Criteria andWriteSkipCountNotIn(List<Long> values) {
            addCriterion("write_skip_count not in", values, "writeSkipCount");
            return (Criteria) this;
        }

        public Criteria andWriteSkipCountBetween(Long value1, Long value2) {
            addCriterion("write_skip_count between", value1, value2, "writeSkipCount");
            return (Criteria) this;
        }

        public Criteria andWriteSkipCountNotBetween(Long value1, Long value2) {
            addCriterion("write_skip_count not between", value1, value2, "writeSkipCount");
            return (Criteria) this;
        }

        public Criteria andProcessSkipCountIsNull() {
            addCriterion("process_skip_count is null");
            return (Criteria) this;
        }

        public Criteria andProcessSkipCountIsNotNull() {
            addCriterion("process_skip_count is not null");
            return (Criteria) this;
        }

        public Criteria andProcessSkipCountEqualTo(Long value) {
            addCriterion("process_skip_count =", value, "processSkipCount");
            return (Criteria) this;
        }

        public Criteria andProcessSkipCountNotEqualTo(Long value) {
            addCriterion("process_skip_count <>", value, "processSkipCount");
            return (Criteria) this;
        }

        public Criteria andProcessSkipCountGreaterThan(Long value) {
            addCriterion("process_skip_count >", value, "processSkipCount");
            return (Criteria) this;
        }

        public Criteria andProcessSkipCountGreaterThanOrEqualTo(Long value) {
            addCriterion("process_skip_count >=", value, "processSkipCount");
            return (Criteria) this;
        }

        public Criteria andProcessSkipCountLessThan(Long value) {
            addCriterion("process_skip_count <", value, "processSkipCount");
            return (Criteria) this;
        }

        public Criteria andProcessSkipCountLessThanOrEqualTo(Long value) {
            addCriterion("process_skip_count <=", value, "processSkipCount");
            return (Criteria) this;
        }

        public Criteria andProcessSkipCountIn(List<Long> values) {
            addCriterion("process_skip_count in", values, "processSkipCount");
            return (Criteria) this;
        }

        public Criteria andProcessSkipCountNotIn(List<Long> values) {
            addCriterion("process_skip_count not in", values, "processSkipCount");
            return (Criteria) this;
        }

        public Criteria andProcessSkipCountBetween(Long value1, Long value2) {
            addCriterion("process_skip_count between", value1, value2, "processSkipCount");
            return (Criteria) this;
        }

        public Criteria andProcessSkipCountNotBetween(Long value1, Long value2) {
            addCriterion("process_skip_count not between", value1, value2, "processSkipCount");
            return (Criteria) this;
        }

        public Criteria andRollbackCountIsNull() {
            addCriterion("rollback_count is null");
            return (Criteria) this;
        }

        public Criteria andRollbackCountIsNotNull() {
            addCriterion("rollback_count is not null");
            return (Criteria) this;
        }

        public Criteria andRollbackCountEqualTo(Long value) {
            addCriterion("rollback_count =", value, "rollbackCount");
            return (Criteria) this;
        }

        public Criteria andRollbackCountNotEqualTo(Long value) {
            addCriterion("rollback_count <>", value, "rollbackCount");
            return (Criteria) this;
        }

        public Criteria andRollbackCountGreaterThan(Long value) {
            addCriterion("rollback_count >", value, "rollbackCount");
            return (Criteria) this;
        }

        public Criteria andRollbackCountGreaterThanOrEqualTo(Long value) {
            addCriterion("rollback_count >=", value, "rollbackCount");
            return (Criteria) this;
        }

        public Criteria andRollbackCountLessThan(Long value) {
            addCriterion("rollback_count <", value, "rollbackCount");
            return (Criteria) this;
        }

        public Criteria andRollbackCountLessThanOrEqualTo(Long value) {
            addCriterion("rollback_count <=", value, "rollbackCount");
            return (Criteria) this;
        }

        public Criteria andRollbackCountIn(List<Long> values) {
            addCriterion("rollback_count in", values, "rollbackCount");
            return (Criteria) this;
        }

        public Criteria andRollbackCountNotIn(List<Long> values) {
            addCriterion("rollback_count not in", values, "rollbackCount");
            return (Criteria) this;
        }

        public Criteria andRollbackCountBetween(Long value1, Long value2) {
            addCriterion("rollback_count between", value1, value2, "rollbackCount");
            return (Criteria) this;
        }

        public Criteria andRollbackCountNotBetween(Long value1, Long value2) {
            addCriterion("rollback_count not between", value1, value2, "rollbackCount");
            return (Criteria) this;
        }

        public Criteria andExitCodeIsNull() {
            addCriterion("exit_code is null");
            return (Criteria) this;
        }

        public Criteria andExitCodeIsNotNull() {
            addCriterion("exit_code is not null");
            return (Criteria) this;
        }

        public Criteria andExitCodeEqualTo(String value) {
            addCriterion("exit_code =", value, "exitCode");
            return (Criteria) this;
        }

        public Criteria andExitCodeNotEqualTo(String value) {
            addCriterion("exit_code <>", value, "exitCode");
            return (Criteria) this;
        }

        public Criteria andExitCodeGreaterThan(String value) {
            addCriterion("exit_code >", value, "exitCode");
            return (Criteria) this;
        }

        public Criteria andExitCodeGreaterThanOrEqualTo(String value) {
            addCriterion("exit_code >=", value, "exitCode");
            return (Criteria) this;
        }

        public Criteria andExitCodeLessThan(String value) {
            addCriterion("exit_code <", value, "exitCode");
            return (Criteria) this;
        }

        public Criteria andExitCodeLessThanOrEqualTo(String value) {
            addCriterion("exit_code <=", value, "exitCode");
            return (Criteria) this;
        }

        public Criteria andExitCodeLike(String value) {
            addCriterion("exit_code like", value, "exitCode");
            return (Criteria) this;
        }

        public Criteria andExitCodeNotLike(String value) {
            addCriterion("exit_code not like", value, "exitCode");
            return (Criteria) this;
        }

        public Criteria andExitCodeIn(List<String> values) {
            addCriterion("exit_code in", values, "exitCode");
            return (Criteria) this;
        }

        public Criteria andExitCodeNotIn(List<String> values) {
            addCriterion("exit_code not in", values, "exitCode");
            return (Criteria) this;
        }

        public Criteria andExitCodeBetween(String value1, String value2) {
            addCriterion("exit_code between", value1, value2, "exitCode");
            return (Criteria) this;
        }

        public Criteria andExitCodeNotBetween(String value1, String value2) {
            addCriterion("exit_code not between", value1, value2, "exitCode");
            return (Criteria) this;
        }

        public Criteria andExitMessageIsNull() {
            addCriterion("exit_message is null");
            return (Criteria) this;
        }

        public Criteria andExitMessageIsNotNull() {
            addCriterion("exit_message is not null");
            return (Criteria) this;
        }

        public Criteria andExitMessageEqualTo(String value) {
            addCriterion("exit_message =", value, "exitMessage");
            return (Criteria) this;
        }

        public Criteria andExitMessageNotEqualTo(String value) {
            addCriterion("exit_message <>", value, "exitMessage");
            return (Criteria) this;
        }

        public Criteria andExitMessageGreaterThan(String value) {
            addCriterion("exit_message >", value, "exitMessage");
            return (Criteria) this;
        }

        public Criteria andExitMessageGreaterThanOrEqualTo(String value) {
            addCriterion("exit_message >=", value, "exitMessage");
            return (Criteria) this;
        }

        public Criteria andExitMessageLessThan(String value) {
            addCriterion("exit_message <", value, "exitMessage");
            return (Criteria) this;
        }

        public Criteria andExitMessageLessThanOrEqualTo(String value) {
            addCriterion("exit_message <=", value, "exitMessage");
            return (Criteria) this;
        }

        public Criteria andExitMessageLike(String value) {
            addCriterion("exit_message like", value, "exitMessage");
            return (Criteria) this;
        }

        public Criteria andExitMessageNotLike(String value) {
            addCriterion("exit_message not like", value, "exitMessage");
            return (Criteria) this;
        }

        public Criteria andExitMessageIn(List<String> values) {
            addCriterion("exit_message in", values, "exitMessage");
            return (Criteria) this;
        }

        public Criteria andExitMessageNotIn(List<String> values) {
            addCriterion("exit_message not in", values, "exitMessage");
            return (Criteria) this;
        }

        public Criteria andExitMessageBetween(String value1, String value2) {
            addCriterion("exit_message between", value1, value2, "exitMessage");
            return (Criteria) this;
        }

        public Criteria andExitMessageNotBetween(String value1, String value2) {
            addCriterion("exit_message not between", value1, value2, "exitMessage");
            return (Criteria) this;
        }

        public Criteria andLastUpdatedIsNull() {
            addCriterion("last_updated is null");
            return (Criteria) this;
        }

        public Criteria andLastUpdatedIsNotNull() {
            addCriterion("last_updated is not null");
            return (Criteria) this;
        }

        public Criteria andLastUpdatedEqualTo(Date value) {
            addCriterion("last_updated =", value, "lastUpdated");
            return (Criteria) this;
        }

        public Criteria andLastUpdatedNotEqualTo(Date value) {
            addCriterion("last_updated <>", value, "lastUpdated");
            return (Criteria) this;
        }

        public Criteria andLastUpdatedGreaterThan(Date value) {
            addCriterion("last_updated >", value, "lastUpdated");
            return (Criteria) this;
        }

        public Criteria andLastUpdatedGreaterThanOrEqualTo(Date value) {
            addCriterion("last_updated >=", value, "lastUpdated");
            return (Criteria) this;
        }

        public Criteria andLastUpdatedLessThan(Date value) {
            addCriterion("last_updated <", value, "lastUpdated");
            return (Criteria) this;
        }

        public Criteria andLastUpdatedLessThanOrEqualTo(Date value) {
            addCriterion("last_updated <=", value, "lastUpdated");
            return (Criteria) this;
        }

        public Criteria andLastUpdatedIn(List<Date> values) {
            addCriterion("last_updated in", values, "lastUpdated");
            return (Criteria) this;
        }

        public Criteria andLastUpdatedNotIn(List<Date> values) {
            addCriterion("last_updated not in", values, "lastUpdated");
            return (Criteria) this;
        }

        public Criteria andLastUpdatedBetween(Date value1, Date value2) {
            addCriterion("last_updated between", value1, value2, "lastUpdated");
            return (Criteria) this;
        }

        public Criteria andLastUpdatedNotBetween(Date value1, Date value2) {
            addCriterion("last_updated not between", value1, value2, "lastUpdated");
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