package com.example.poc.dao.mapper;

import com.example.poc.dao.model.BatchJobExecution;
import com.example.poc.dao.model.BatchJobExecutionExample;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.session.RowBounds;

import java.util.List;

public interface BatchJobExecutionMapper {
    int deleteByPrimaryKey(Long jobExecutionId);

    int insert(BatchJobExecution record);

    int insertSelective(BatchJobExecution record);

    List<BatchJobExecution> selectByExampleWithRowbounds(BatchJobExecutionExample example, RowBounds rowBounds);

    List<BatchJobExecution> selectByExample(BatchJobExecutionExample example);

    BatchJobExecution selectByPrimaryKey(Long jobExecutionId);

    int updateByPrimaryKeySelective(BatchJobExecution record);

    int updateByPrimaryKey(BatchJobExecution record);

    @Select("select * from batch_job_execution")
    List<BatchJobExecution> selectAll();
}