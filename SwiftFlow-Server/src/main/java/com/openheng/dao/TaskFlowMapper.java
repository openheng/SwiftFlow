package com.openheng.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface TaskFlowMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table swift_task_flow
     *
     * @mbg.generated Thu Aug 24 22:00:22 CST 2023
     */
    long countByExample(TaskFlowExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table swift_task_flow
     *
     * @mbg.generated Thu Aug 24 22:00:22 CST 2023
     */
    int deleteByExample(TaskFlowExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table swift_task_flow
     *
     * @mbg.generated Thu Aug 24 22:00:22 CST 2023
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table swift_task_flow
     *
     * @mbg.generated Thu Aug 24 22:00:22 CST 2023
     */
    int insert(TaskFlow record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table swift_task_flow
     *
     * @mbg.generated Thu Aug 24 22:00:22 CST 2023
     */
    int insertSelective(TaskFlow record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table swift_task_flow
     *
     * @mbg.generated Thu Aug 24 22:00:22 CST 2023
     */
    List<TaskFlow> selectByExample(TaskFlowExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table swift_task_flow
     *
     * @mbg.generated Thu Aug 24 22:00:22 CST 2023
     */
    TaskFlow selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table swift_task_flow
     *
     * @mbg.generated Thu Aug 24 22:00:22 CST 2023
     */
    int updateByExampleSelective(@Param("record") TaskFlow record, @Param("example") TaskFlowExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table swift_task_flow
     *
     * @mbg.generated Thu Aug 24 22:00:22 CST 2023
     */
    int updateByExample(@Param("record") TaskFlow record, @Param("example") TaskFlowExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table swift_task_flow
     *
     * @mbg.generated Thu Aug 24 22:00:22 CST 2023
     */
    int updateByPrimaryKeySelective(TaskFlow record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table swift_task_flow
     *
     * @mbg.generated Thu Aug 24 22:00:22 CST 2023
     */
    int updateByPrimaryKey(TaskFlow record);
}