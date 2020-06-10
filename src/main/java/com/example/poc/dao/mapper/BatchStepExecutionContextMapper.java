package com.example.poc.dao.mapper;

import java.util.List;

import com.example.poc.dao.model.BatchStepExecutionContext;
import com.example.poc.dao.model.BatchStepExecutionContextExample;
import org.apache.ibatis.session.RowBounds;

public interface BatchStepExecutionContextMapper {
    int deleteByPrimaryKey(Long stepExecutionId);

    int insert(BatchStepExecutionContext record);

    int insertSelective(BatchStepExecutionContext record);

    List<BatchStepExecutionContext> selectByExampleWithRowbounds(BatchStepExecutionContextExample example, RowBounds rowBounds);

    List<BatchStepExecutionContext> selectByExample(BatchStepExecutionContextExample example);

    BatchStepExecutionContext selectByPrimaryKey(Long stepExecutionId);

    int updateByPrimaryKeySelective(BatchStepExecutionContext record);

    int updateByPrimaryKey(BatchStepExecutionContext record);
}