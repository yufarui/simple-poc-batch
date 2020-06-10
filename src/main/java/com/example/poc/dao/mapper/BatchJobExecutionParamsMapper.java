package com.example.poc.dao.mapper;

import java.util.List;

import com.example.poc.dao.model.BatchJobExecutionParams;
import com.example.poc.dao.model.BatchJobExecutionParamsExample;
import org.apache.ibatis.session.RowBounds;

public interface BatchJobExecutionParamsMapper {
    int insert(BatchJobExecutionParams record);

    int insertSelective(BatchJobExecutionParams record);

    List<BatchJobExecutionParams> selectByExampleWithRowbounds(BatchJobExecutionParamsExample example, RowBounds rowBounds);

    List<BatchJobExecutionParams> selectByExample(BatchJobExecutionParamsExample example);
}