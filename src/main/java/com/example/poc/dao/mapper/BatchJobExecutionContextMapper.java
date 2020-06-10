package com.example.poc.dao.mapper;

import java.util.List;

import com.example.poc.dao.model.BatchJobExecutionContext;
import com.example.poc.dao.model.BatchJobExecutionContextExample;
import org.apache.ibatis.session.RowBounds;

public interface BatchJobExecutionContextMapper {
    int deleteByPrimaryKey(Long jobExecutionId);

    int insert(BatchJobExecutionContext record);

    int insertSelective(BatchJobExecutionContext record);

    List<BatchJobExecutionContext> selectByExampleWithRowbounds(BatchJobExecutionContextExample example, RowBounds rowBounds);

    List<BatchJobExecutionContext> selectByExample(BatchJobExecutionContextExample example);

    BatchJobExecutionContext selectByPrimaryKey(Long jobExecutionId);

    int updateByPrimaryKeySelective(BatchJobExecutionContext record);

    int updateByPrimaryKey(BatchJobExecutionContext record);
}