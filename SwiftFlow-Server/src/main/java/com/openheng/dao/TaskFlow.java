package com.openheng.dao;

import java.util.Date;

public class TaskFlow {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column swift_task_flow.id
     *
     * @mbg.generated Thu Aug 03 19:59:06 CST 2023
     */
    private Long id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column swift_task_flow.biz_code
     *
     * @mbg.generated Thu Aug 03 19:59:06 CST 2023
     */
    private Byte biz_code;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column swift_task_flow.name
     *
     * @mbg.generated Thu Aug 03 19:59:06 CST 2023
     */
    private String name;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column swift_task_flow.gmt_create
     *
     * @mbg.generated Thu Aug 03 19:59:06 CST 2023
     */
    private Date gmt_create;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column swift_task_flow.gmt_modified
     *
     * @mbg.generated Thu Aug 03 19:59:06 CST 2023
     */
    private Date gmt_modified;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column swift_task_flow.id
     *
     * @return the value of swift_task_flow.id
     *
     * @mbg.generated Thu Aug 03 19:59:06 CST 2023
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column swift_task_flow.id
     *
     * @param id the value for swift_task_flow.id
     *
     * @mbg.generated Thu Aug 03 19:59:06 CST 2023
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column swift_task_flow.biz_code
     *
     * @return the value of swift_task_flow.biz_code
     *
     * @mbg.generated Thu Aug 03 19:59:06 CST 2023
     */
    public Byte getBiz_code() {
        return biz_code;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column swift_task_flow.biz_code
     *
     * @param biz_code the value for swift_task_flow.biz_code
     *
     * @mbg.generated Thu Aug 03 19:59:06 CST 2023
     */
    public void setBiz_code(Byte biz_code) {
        this.biz_code = biz_code;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column swift_task_flow.name
     *
     * @return the value of swift_task_flow.name
     *
     * @mbg.generated Thu Aug 03 19:59:06 CST 2023
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column swift_task_flow.name
     *
     * @param name the value for swift_task_flow.name
     *
     * @mbg.generated Thu Aug 03 19:59:06 CST 2023
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column swift_task_flow.gmt_create
     *
     * @return the value of swift_task_flow.gmt_create
     *
     * @mbg.generated Thu Aug 03 19:59:06 CST 2023
     */
    public Date getGmt_create() {
        return gmt_create;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column swift_task_flow.gmt_create
     *
     * @param gmt_create the value for swift_task_flow.gmt_create
     *
     * @mbg.generated Thu Aug 03 19:59:06 CST 2023
     */
    public void setGmt_create(Date gmt_create) {
        this.gmt_create = gmt_create;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column swift_task_flow.gmt_modified
     *
     * @return the value of swift_task_flow.gmt_modified
     *
     * @mbg.generated Thu Aug 03 19:59:06 CST 2023
     */
    public Date getGmt_modified() {
        return gmt_modified;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column swift_task_flow.gmt_modified
     *
     * @param gmt_modified the value for swift_task_flow.gmt_modified
     *
     * @mbg.generated Thu Aug 03 19:59:06 CST 2023
     */
    public void setGmt_modified(Date gmt_modified) {
        this.gmt_modified = gmt_modified;
    }
}