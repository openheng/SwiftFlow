package com.openheng.dao;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TaskNodeExecutionInfoExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table swift_task_node_execution_info
     *
     * @mbg.generated Thu Aug 03 19:59:07 CST 2023
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table swift_task_node_execution_info
     *
     * @mbg.generated Thu Aug 03 19:59:07 CST 2023
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table swift_task_node_execution_info
     *
     * @mbg.generated Thu Aug 03 19:59:07 CST 2023
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table swift_task_node_execution_info
     *
     * @mbg.generated Thu Aug 03 19:59:07 CST 2023
     */
    public TaskNodeExecutionInfoExample() {
        oredCriteria = new ArrayList<>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table swift_task_node_execution_info
     *
     * @mbg.generated Thu Aug 03 19:59:07 CST 2023
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table swift_task_node_execution_info
     *
     * @mbg.generated Thu Aug 03 19:59:07 CST 2023
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table swift_task_node_execution_info
     *
     * @mbg.generated Thu Aug 03 19:59:07 CST 2023
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table swift_task_node_execution_info
     *
     * @mbg.generated Thu Aug 03 19:59:07 CST 2023
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table swift_task_node_execution_info
     *
     * @mbg.generated Thu Aug 03 19:59:07 CST 2023
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table swift_task_node_execution_info
     *
     * @mbg.generated Thu Aug 03 19:59:07 CST 2023
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table swift_task_node_execution_info
     *
     * @mbg.generated Thu Aug 03 19:59:07 CST 2023
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table swift_task_node_execution_info
     *
     * @mbg.generated Thu Aug 03 19:59:07 CST 2023
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table swift_task_node_execution_info
     *
     * @mbg.generated Thu Aug 03 19:59:07 CST 2023
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table swift_task_node_execution_info
     *
     * @mbg.generated Thu Aug 03 19:59:07 CST 2023
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table swift_task_node_execution_info
     *
     * @mbg.generated Thu Aug 03 19:59:07 CST 2023
     */
    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<>();
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

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Long value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andTask_idIsNull() {
            addCriterion("task_id is null");
            return (Criteria) this;
        }

        public Criteria andTask_idIsNotNull() {
            addCriterion("task_id is not null");
            return (Criteria) this;
        }

        public Criteria andTask_idEqualTo(Long value) {
            addCriterion("task_id =", value, "task_id");
            return (Criteria) this;
        }

        public Criteria andTask_idNotEqualTo(Long value) {
            addCriterion("task_id <>", value, "task_id");
            return (Criteria) this;
        }

        public Criteria andTask_idGreaterThan(Long value) {
            addCriterion("task_id >", value, "task_id");
            return (Criteria) this;
        }

        public Criteria andTask_idGreaterThanOrEqualTo(Long value) {
            addCriterion("task_id >=", value, "task_id");
            return (Criteria) this;
        }

        public Criteria andTask_idLessThan(Long value) {
            addCriterion("task_id <", value, "task_id");
            return (Criteria) this;
        }

        public Criteria andTask_idLessThanOrEqualTo(Long value) {
            addCriterion("task_id <=", value, "task_id");
            return (Criteria) this;
        }

        public Criteria andTask_idIn(List<Long> values) {
            addCriterion("task_id in", values, "task_id");
            return (Criteria) this;
        }

        public Criteria andTask_idNotIn(List<Long> values) {
            addCriterion("task_id not in", values, "task_id");
            return (Criteria) this;
        }

        public Criteria andTask_idBetween(Long value1, Long value2) {
            addCriterion("task_id between", value1, value2, "task_id");
            return (Criteria) this;
        }

        public Criteria andTask_idNotBetween(Long value1, Long value2) {
            addCriterion("task_id not between", value1, value2, "task_id");
            return (Criteria) this;
        }

        public Criteria andFlow_idIsNull() {
            addCriterion("flow_id is null");
            return (Criteria) this;
        }

        public Criteria andFlow_idIsNotNull() {
            addCriterion("flow_id is not null");
            return (Criteria) this;
        }

        public Criteria andFlow_idEqualTo(Long value) {
            addCriterion("flow_id =", value, "flow_id");
            return (Criteria) this;
        }

        public Criteria andFlow_idNotEqualTo(Long value) {
            addCriterion("flow_id <>", value, "flow_id");
            return (Criteria) this;
        }

        public Criteria andFlow_idGreaterThan(Long value) {
            addCriterion("flow_id >", value, "flow_id");
            return (Criteria) this;
        }

        public Criteria andFlow_idGreaterThanOrEqualTo(Long value) {
            addCriterion("flow_id >=", value, "flow_id");
            return (Criteria) this;
        }

        public Criteria andFlow_idLessThan(Long value) {
            addCriterion("flow_id <", value, "flow_id");
            return (Criteria) this;
        }

        public Criteria andFlow_idLessThanOrEqualTo(Long value) {
            addCriterion("flow_id <=", value, "flow_id");
            return (Criteria) this;
        }

        public Criteria andFlow_idIn(List<Long> values) {
            addCriterion("flow_id in", values, "flow_id");
            return (Criteria) this;
        }

        public Criteria andFlow_idNotIn(List<Long> values) {
            addCriterion("flow_id not in", values, "flow_id");
            return (Criteria) this;
        }

        public Criteria andFlow_idBetween(Long value1, Long value2) {
            addCriterion("flow_id between", value1, value2, "flow_id");
            return (Criteria) this;
        }

        public Criteria andFlow_idNotBetween(Long value1, Long value2) {
            addCriterion("flow_id not between", value1, value2, "flow_id");
            return (Criteria) this;
        }

        public Criteria andNode_idIsNull() {
            addCriterion("node_id is null");
            return (Criteria) this;
        }

        public Criteria andNode_idIsNotNull() {
            addCriterion("node_id is not null");
            return (Criteria) this;
        }

        public Criteria andNode_idEqualTo(Long value) {
            addCriterion("node_id =", value, "node_id");
            return (Criteria) this;
        }

        public Criteria andNode_idNotEqualTo(Long value) {
            addCriterion("node_id <>", value, "node_id");
            return (Criteria) this;
        }

        public Criteria andNode_idGreaterThan(Long value) {
            addCriterion("node_id >", value, "node_id");
            return (Criteria) this;
        }

        public Criteria andNode_idGreaterThanOrEqualTo(Long value) {
            addCriterion("node_id >=", value, "node_id");
            return (Criteria) this;
        }

        public Criteria andNode_idLessThan(Long value) {
            addCriterion("node_id <", value, "node_id");
            return (Criteria) this;
        }

        public Criteria andNode_idLessThanOrEqualTo(Long value) {
            addCriterion("node_id <=", value, "node_id");
            return (Criteria) this;
        }

        public Criteria andNode_idIn(List<Long> values) {
            addCriterion("node_id in", values, "node_id");
            return (Criteria) this;
        }

        public Criteria andNode_idNotIn(List<Long> values) {
            addCriterion("node_id not in", values, "node_id");
            return (Criteria) this;
        }

        public Criteria andNode_idBetween(Long value1, Long value2) {
            addCriterion("node_id between", value1, value2, "node_id");
            return (Criteria) this;
        }

        public Criteria andNode_idNotBetween(Long value1, Long value2) {
            addCriterion("node_id not between", value1, value2, "node_id");
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

        public Criteria andStatusEqualTo(Byte value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(Byte value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(Byte value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Byte value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(Byte value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(Byte value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<Byte> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<Byte> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(Byte value1, Byte value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(Byte value1, Byte value2) {
            addCriterion("status not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andIp_infoIsNull() {
            addCriterion("ip_info is null");
            return (Criteria) this;
        }

        public Criteria andIp_infoIsNotNull() {
            addCriterion("ip_info is not null");
            return (Criteria) this;
        }

        public Criteria andIp_infoEqualTo(String value) {
            addCriterion("ip_info =", value, "ip_info");
            return (Criteria) this;
        }

        public Criteria andIp_infoNotEqualTo(String value) {
            addCriterion("ip_info <>", value, "ip_info");
            return (Criteria) this;
        }

        public Criteria andIp_infoGreaterThan(String value) {
            addCriterion("ip_info >", value, "ip_info");
            return (Criteria) this;
        }

        public Criteria andIp_infoGreaterThanOrEqualTo(String value) {
            addCriterion("ip_info >=", value, "ip_info");
            return (Criteria) this;
        }

        public Criteria andIp_infoLessThan(String value) {
            addCriterion("ip_info <", value, "ip_info");
            return (Criteria) this;
        }

        public Criteria andIp_infoLessThanOrEqualTo(String value) {
            addCriterion("ip_info <=", value, "ip_info");
            return (Criteria) this;
        }

        public Criteria andIp_infoLike(String value) {
            addCriterion("ip_info like", value, "ip_info");
            return (Criteria) this;
        }

        public Criteria andIp_infoNotLike(String value) {
            addCriterion("ip_info not like", value, "ip_info");
            return (Criteria) this;
        }

        public Criteria andIp_infoIn(List<String> values) {
            addCriterion("ip_info in", values, "ip_info");
            return (Criteria) this;
        }

        public Criteria andIp_infoNotIn(List<String> values) {
            addCriterion("ip_info not in", values, "ip_info");
            return (Criteria) this;
        }

        public Criteria andIp_infoBetween(String value1, String value2) {
            addCriterion("ip_info between", value1, value2, "ip_info");
            return (Criteria) this;
        }

        public Criteria andIp_infoNotBetween(String value1, String value2) {
            addCriterion("ip_info not between", value1, value2, "ip_info");
            return (Criteria) this;
        }

        public Criteria andGmt_createIsNull() {
            addCriterion("gmt_create is null");
            return (Criteria) this;
        }

        public Criteria andGmt_createIsNotNull() {
            addCriterion("gmt_create is not null");
            return (Criteria) this;
        }

        public Criteria andGmt_createEqualTo(Date value) {
            addCriterion("gmt_create =", value, "gmt_create");
            return (Criteria) this;
        }

        public Criteria andGmt_createNotEqualTo(Date value) {
            addCriterion("gmt_create <>", value, "gmt_create");
            return (Criteria) this;
        }

        public Criteria andGmt_createGreaterThan(Date value) {
            addCriterion("gmt_create >", value, "gmt_create");
            return (Criteria) this;
        }

        public Criteria andGmt_createGreaterThanOrEqualTo(Date value) {
            addCriterion("gmt_create >=", value, "gmt_create");
            return (Criteria) this;
        }

        public Criteria andGmt_createLessThan(Date value) {
            addCriterion("gmt_create <", value, "gmt_create");
            return (Criteria) this;
        }

        public Criteria andGmt_createLessThanOrEqualTo(Date value) {
            addCriterion("gmt_create <=", value, "gmt_create");
            return (Criteria) this;
        }

        public Criteria andGmt_createIn(List<Date> values) {
            addCriterion("gmt_create in", values, "gmt_create");
            return (Criteria) this;
        }

        public Criteria andGmt_createNotIn(List<Date> values) {
            addCriterion("gmt_create not in", values, "gmt_create");
            return (Criteria) this;
        }

        public Criteria andGmt_createBetween(Date value1, Date value2) {
            addCriterion("gmt_create between", value1, value2, "gmt_create");
            return (Criteria) this;
        }

        public Criteria andGmt_createNotBetween(Date value1, Date value2) {
            addCriterion("gmt_create not between", value1, value2, "gmt_create");
            return (Criteria) this;
        }

        public Criteria andGmt_modifiedIsNull() {
            addCriterion("gmt_modified is null");
            return (Criteria) this;
        }

        public Criteria andGmt_modifiedIsNotNull() {
            addCriterion("gmt_modified is not null");
            return (Criteria) this;
        }

        public Criteria andGmt_modifiedEqualTo(Date value) {
            addCriterion("gmt_modified =", value, "gmt_modified");
            return (Criteria) this;
        }

        public Criteria andGmt_modifiedNotEqualTo(Date value) {
            addCriterion("gmt_modified <>", value, "gmt_modified");
            return (Criteria) this;
        }

        public Criteria andGmt_modifiedGreaterThan(Date value) {
            addCriterion("gmt_modified >", value, "gmt_modified");
            return (Criteria) this;
        }

        public Criteria andGmt_modifiedGreaterThanOrEqualTo(Date value) {
            addCriterion("gmt_modified >=", value, "gmt_modified");
            return (Criteria) this;
        }

        public Criteria andGmt_modifiedLessThan(Date value) {
            addCriterion("gmt_modified <", value, "gmt_modified");
            return (Criteria) this;
        }

        public Criteria andGmt_modifiedLessThanOrEqualTo(Date value) {
            addCriterion("gmt_modified <=", value, "gmt_modified");
            return (Criteria) this;
        }

        public Criteria andGmt_modifiedIn(List<Date> values) {
            addCriterion("gmt_modified in", values, "gmt_modified");
            return (Criteria) this;
        }

        public Criteria andGmt_modifiedNotIn(List<Date> values) {
            addCriterion("gmt_modified not in", values, "gmt_modified");
            return (Criteria) this;
        }

        public Criteria andGmt_modifiedBetween(Date value1, Date value2) {
            addCriterion("gmt_modified between", value1, value2, "gmt_modified");
            return (Criteria) this;
        }

        public Criteria andGmt_modifiedNotBetween(Date value1, Date value2) {
            addCriterion("gmt_modified not between", value1, value2, "gmt_modified");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table swift_task_node_execution_info
     *
     * @mbg.generated do_not_delete_during_merge Thu Aug 03 19:59:07 CST 2023
     */
    public static class Criteria extends GeneratedCriteria {
        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table swift_task_node_execution_info
     *
     * @mbg.generated Thu Aug 03 19:59:07 CST 2023
     */
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