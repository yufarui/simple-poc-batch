package com.example.poc.dao.mapper;

import java.util.List;

import com.example.poc.dao.model.BatchStepExecution;
import com.example.poc.dao.model.BatchStepExecutionExample;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.session.RowBounds;

public interface BatchStepExecutionMapper {
    int deleteByPrimaryKey(Long stepExecutionId);

    int insert(BatchStepExecution record);

    int insertSelective(BatchStepExecution record);

    List<BatchStepExecution> selectByExampleWithRowbounds(BatchStepExecutionExample example, RowBounds rowBounds);

    List<BatchStepExecution> selectByExample(BatchStepExecutionExample example);

    BatchStepExecution selectByPrimaryKey(Long stepExecutionId);

    int updateByPrimaryKeySelective(BatchStepExecution record);

    int updateByPrimaryKey(BatchStepExecution record);

    @Select("select * from batch_step_execution")
    List<BatchStepExecution> selectAll();
}