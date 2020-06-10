package com.example.poc.dao.mapper;

import java.util.List;

import com.example.poc.dao.model.BatchJobInstance;
import com.example.poc.dao.model.BatchJobInstanceExample;
import org.apache.ibatis.session.RowBounds;

public interface BatchJobInstanceMapper {
    int deleteByPrimaryKey(Long jobInstanceId);

    int insert(BatchJobInstance record);

    int insertSelective(BatchJobInstance record);

    List<BatchJobInstance> selectByExampleWithRowbounds(BatchJobInstanceExample example, RowBounds rowBounds);

    List<BatchJobInstance> selectByExample(BatchJobInstanceExample example);

    BatchJobInstance selectByPrimaryKey(Long jobInstanceId);

    int updateByPrimaryKeySelective(BatchJobInstance record);

    int updateByPrimaryKey(BatchJobInstance record);
}