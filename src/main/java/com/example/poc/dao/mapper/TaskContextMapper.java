package com.example.poc.dao.mapper;

import java.util.List;

import com.example.poc.dao.model.TaskContext;
import com.example.poc.dao.model.TaskContextExample;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.session.RowBounds;

public interface TaskContextMapper {
    int deleteByExample(TaskContextExample example);

    int deleteByPrimaryKey(Long taskExecutionId);

    int insert(TaskContext record);

    int insertSelective(TaskContext record);

    List<TaskContext> selectByExampleWithRowbounds(TaskContextExample example, RowBounds rowBounds);

    List<TaskContext> selectByExample(TaskContextExample example);

    TaskContext selectByPrimaryKey(Long taskExecutionId);

    int updateByExampleSelective(@Param("record") TaskContext record, @Param("example") TaskContextExample example);

    int updateByExample(@Param("record") TaskContext record, @Param("example") TaskContextExample example);

    int updateByPrimaryKeySelective(TaskContext record);

    int updateByPrimaryKey(TaskContext record);

    @Select("select * from task_context")
    List<TaskContext> selectAll();
}