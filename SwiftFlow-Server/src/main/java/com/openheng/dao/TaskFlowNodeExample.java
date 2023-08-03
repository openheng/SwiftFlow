package com.openheng.dao;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TaskFlowNodeExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table swift_task_flow_node
     *
     * @mbg.generated Thu Aug 03 19:59:07 CST 2023
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table swift_task_flow_node
     *
     * @mbg.generated Thu Aug 03 19:59:07 CST 2023
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table swift_task_flow_node
     *
     * @mbg.generated Thu Aug 03 19:59:07 CST 2023
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table swift_task_flow_node
     *
     * @mbg.generated Thu Aug 03 19:59:07 CST 2023
     */
    public TaskFlowNodeExample() {
        oredCriteria = new ArrayList<>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table swift_task_flow_node
     *
     * @mbg.generated Thu Aug 03 19:59:07 CST 2023
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table swift_task_flow_node
     *
     * @mbg.generated Thu Aug 03 19:59:07 CST 2023
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table swift_task_flow_node
     *
     * @mbg.generated Thu Aug 03 19:59:07 CST 2023
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table swift_task_flow_node
     *
     * @mbg.generated Thu Aug 03 19:59:07 CST 2023
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table swift_task_flow_node
     *
     * @mbg.generated Thu Aug 03 19:59:07 CST 2023
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table swift_task_flow_node
     *
     * @mbg.generated Thu Aug 03 19:59:07 CST 2023
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table swift_task_flow_node
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
     * This method corresponds to the database table swift_task_flow_node
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
     * This method corresponds to the database table swift_task_flow_node
     *
     * @mbg.generated Thu Aug 03 19:59:07 CST 2023
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table swift_task_flow_node
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
     * This class corresponds to the database table swift_task_flow_node
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

        public Criteria andBiz_codeIsNull() {
            addCriterion("biz_code is null");
            return (Criteria) this;
        }

        public Criteria andBiz_codeIsNotNull() {
            addCriterion("biz_code is not null");
            return (Criteria) this;
        }

        public Criteria andBiz_codeEqualTo(Byte value) {
            addCriterion("biz_code =", value, "biz_code");
            return (Criteria) this;
        }

        public Criteria andBiz_codeNotEqualTo(Byte value) {
            addCriterion("biz_code <>", value, "biz_code");
            return (Criteria) this;
        }

        public Criteria andBiz_codeGreaterThan(Byte value) {
            addCriterion("biz_code >", value, "biz_code");
            return (Criteria) this;
        }

        public Criteria andBiz_codeGreaterThanOrEqualTo(Byte value) {
            addCriterion("biz_code >=", value, "biz_code");
            return (Criteria) this;
        }

        public Criteria andBiz_codeLessThan(Byte value) {
            addCriterion("biz_code <", value, "biz_code");
            return (Criteria) this;
        }

        public Criteria andBiz_codeLessThanOrEqualTo(Byte value) {
            addCriterion("biz_code <=", value, "biz_code");
            return (Criteria) this;
        }

        public Criteria andBiz_codeIn(List<Byte> values) {
            addCriterion("biz_code in", values, "biz_code");
            return (Criteria) this;
        }

        public Criteria andBiz_codeNotIn(List<Byte> values) {
            addCriterion("biz_code not in", values, "biz_code");
            return (Criteria) this;
        }

        public Criteria andBiz_codeBetween(Byte value1, Byte value2) {
            addCriterion("biz_code between", value1, value2, "biz_code");
            return (Criteria) this;
        }

        public Criteria andBiz_codeNotBetween(Byte value1, Byte value2) {
            addCriterion("biz_code not between", value1, value2, "biz_code");
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

        public Criteria andNameIsNull() {
            addCriterion("name is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("name is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("name =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("name <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("name >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("name >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("name <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("name <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("name like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("name not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("name in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("name not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("name between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("name not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andPre_node_id_listIsNull() {
            addCriterion("pre_node_id_list is null");
            return (Criteria) this;
        }

        public Criteria andPre_node_id_listIsNotNull() {
            addCriterion("pre_node_id_list is not null");
            return (Criteria) this;
        }

        public Criteria andPre_node_id_listEqualTo(String value) {
            addCriterion("pre_node_id_list =", value, "pre_node_id_list");
            return (Criteria) this;
        }

        public Criteria andPre_node_id_listNotEqualTo(String value) {
            addCriterion("pre_node_id_list <>", value, "pre_node_id_list");
            return (Criteria) this;
        }

        public Criteria andPre_node_id_listGreaterThan(String value) {
            addCriterion("pre_node_id_list >", value, "pre_node_id_list");
            return (Criteria) this;
        }

        public Criteria andPre_node_id_listGreaterThanOrEqualTo(String value) {
            addCriterion("pre_node_id_list >=", value, "pre_node_id_list");
            return (Criteria) this;
        }

        public Criteria andPre_node_id_listLessThan(String value) {
            addCriterion("pre_node_id_list <", value, "pre_node_id_list");
            return (Criteria) this;
        }

        public Criteria andPre_node_id_listLessThanOrEqualTo(String value) {
            addCriterion("pre_node_id_list <=", value, "pre_node_id_list");
            return (Criteria) this;
        }

        public Criteria andPre_node_id_listLike(String value) {
            addCriterion("pre_node_id_list like", value, "pre_node_id_list");
            return (Criteria) this;
        }

        public Criteria andPre_node_id_listNotLike(String value) {
            addCriterion("pre_node_id_list not like", value, "pre_node_id_list");
            return (Criteria) this;
        }

        public Criteria andPre_node_id_listIn(List<String> values) {
            addCriterion("pre_node_id_list in", values, "pre_node_id_list");
            return (Criteria) this;
        }

        public Criteria andPre_node_id_listNotIn(List<String> values) {
            addCriterion("pre_node_id_list not in", values, "pre_node_id_list");
            return (Criteria) this;
        }

        public Criteria andPre_node_id_listBetween(String value1, String value2) {
            addCriterion("pre_node_id_list between", value1, value2, "pre_node_id_list");
            return (Criteria) this;
        }

        public Criteria andPre_node_id_listNotBetween(String value1, String value2) {
            addCriterion("pre_node_id_list not between", value1, value2, "pre_node_id_list");
            return (Criteria) this;
        }

        public Criteria andService_handlerIsNull() {
            addCriterion("service_handler is null");
            return (Criteria) this;
        }

        public Criteria andService_handlerIsNotNull() {
            addCriterion("service_handler is not null");
            return (Criteria) this;
        }

        public Criteria andService_handlerEqualTo(String value) {
            addCriterion("service_handler =", value, "service_handler");
            return (Criteria) this;
        }

        public Criteria andService_handlerNotEqualTo(String value) {
            addCriterion("service_handler <>", value, "service_handler");
            return (Criteria) this;
        }

        public Criteria andService_handlerGreaterThan(String value) {
            addCriterion("service_handler >", value, "service_handler");
            return (Criteria) this;
        }

        public Criteria andService_handlerGreaterThanOrEqualTo(String value) {
            addCriterion("service_handler >=", value, "service_handler");
            return (Criteria) this;
        }

        public Criteria andService_handlerLessThan(String value) {
            addCriterion("service_handler <", value, "service_handler");
            return (Criteria) this;
        }

        public Criteria andService_handlerLessThanOrEqualTo(String value) {
            addCriterion("service_handler <=", value, "service_handler");
            return (Criteria) this;
        }

        public Criteria andService_handlerLike(String value) {
            addCriterion("service_handler like", value, "service_handler");
            return (Criteria) this;
        }

        public Criteria andService_handlerNotLike(String value) {
            addCriterion("service_handler not like", value, "service_handler");
            return (Criteria) this;
        }

        public Criteria andService_handlerIn(List<String> values) {
            addCriterion("service_handler in", values, "service_handler");
            return (Criteria) this;
        }

        public Criteria andService_handlerNotIn(List<String> values) {
            addCriterion("service_handler not in", values, "service_handler");
            return (Criteria) this;
        }

        public Criteria andService_handlerBetween(String value1, String value2) {
            addCriterion("service_handler between", value1, value2, "service_handler");
            return (Criteria) this;
        }

        public Criteria andService_handlerNotBetween(String value1, String value2) {
            addCriterion("service_handler not between", value1, value2, "service_handler");
            return (Criteria) this;
        }

        public Criteria andNext_node_id_listIsNull() {
            addCriterion("next_node_id_list is null");
            return (Criteria) this;
        }

        public Criteria andNext_node_id_listIsNotNull() {
            addCriterion("next_node_id_list is not null");
            return (Criteria) this;
        }

        public Criteria andNext_node_id_listEqualTo(String value) {
            addCriterion("next_node_id_list =", value, "next_node_id_list");
            return (Criteria) this;
        }

        public Criteria andNext_node_id_listNotEqualTo(String value) {
            addCriterion("next_node_id_list <>", value, "next_node_id_list");
            return (Criteria) this;
        }

        public Criteria andNext_node_id_listGreaterThan(String value) {
            addCriterion("next_node_id_list >", value, "next_node_id_list");
            return (Criteria) this;
        }

        public Criteria andNext_node_id_listGreaterThanOrEqualTo(String value) {
            addCriterion("next_node_id_list >=", value, "next_node_id_list");
            return (Criteria) this;
        }

        public Criteria andNext_node_id_listLessThan(String value) {
            addCriterion("next_node_id_list <", value, "next_node_id_list");
            return (Criteria) this;
        }

        public Criteria andNext_node_id_listLessThanOrEqualTo(String value) {
            addCriterion("next_node_id_list <=", value, "next_node_id_list");
            return (Criteria) this;
        }

        public Criteria andNext_node_id_listLike(String value) {
            addCriterion("next_node_id_list like", value, "next_node_id_list");
            return (Criteria) this;
        }

        public Criteria andNext_node_id_listNotLike(String value) {
            addCriterion("next_node_id_list not like", value, "next_node_id_list");
            return (Criteria) this;
        }

        public Criteria andNext_node_id_listIn(List<String> values) {
            addCriterion("next_node_id_list in", values, "next_node_id_list");
            return (Criteria) this;
        }

        public Criteria andNext_node_id_listNotIn(List<String> values) {
            addCriterion("next_node_id_list not in", values, "next_node_id_list");
            return (Criteria) this;
        }

        public Criteria andNext_node_id_listBetween(String value1, String value2) {
            addCriterion("next_node_id_list between", value1, value2, "next_node_id_list");
            return (Criteria) this;
        }

        public Criteria andNext_node_id_listNotBetween(String value1, String value2) {
            addCriterion("next_node_id_list not between", value1, value2, "next_node_id_list");
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
     * This class corresponds to the database table swift_task_flow_node
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
     * This class corresponds to the database table swift_task_flow_node
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