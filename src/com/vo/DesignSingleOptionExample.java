package com.vo;

import java.util.ArrayList;
import java.util.List;

public class DesignSingleOptionExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table design_single_option
     *
     * @mbggenerated Tue Apr 10 16:03:01 CST 2018
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table design_single_option
     *
     * @mbggenerated Tue Apr 10 16:03:01 CST 2018
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table design_single_option
     *
     * @mbggenerated Tue Apr 10 16:03:01 CST 2018
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table design_single_option
     *
     * @mbggenerated Tue Apr 10 16:03:01 CST 2018
     */
    public DesignSingleOptionExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table design_single_option
     *
     * @mbggenerated Tue Apr 10 16:03:01 CST 2018
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table design_single_option
     *
     * @mbggenerated Tue Apr 10 16:03:01 CST 2018
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table design_single_option
     *
     * @mbggenerated Tue Apr 10 16:03:01 CST 2018
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table design_single_option
     *
     * @mbggenerated Tue Apr 10 16:03:01 CST 2018
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table design_single_option
     *
     * @mbggenerated Tue Apr 10 16:03:01 CST 2018
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table design_single_option
     *
     * @mbggenerated Tue Apr 10 16:03:01 CST 2018
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table design_single_option
     *
     * @mbggenerated Tue Apr 10 16:03:01 CST 2018
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table design_single_option
     *
     * @mbggenerated Tue Apr 10 16:03:01 CST 2018
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
     * This method corresponds to the database table design_single_option
     *
     * @mbggenerated Tue Apr 10 16:03:01 CST 2018
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table design_single_option
     *
     * @mbggenerated Tue Apr 10 16:03:01 CST 2018
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table design_single_option
     *
     * @mbggenerated Tue Apr 10 16:03:01 CST 2018
     */
    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
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

        public Criteria andDesignSingleOptionIdIsNull() {
            addCriterion("design_single_option_id is null");
            return (Criteria) this;
        }

        public Criteria andDesignSingleOptionIdIsNotNull() {
            addCriterion("design_single_option_id is not null");
            return (Criteria) this;
        }

        public Criteria andDesignSingleOptionIdEqualTo(String value) {
            addCriterion("design_single_option_id =", value, "designSingleOptionId");
            return (Criteria) this;
        }

        public Criteria andDesignSingleOptionIdNotEqualTo(String value) {
            addCriterion("design_single_option_id <>", value, "designSingleOptionId");
            return (Criteria) this;
        }

        public Criteria andDesignSingleOptionIdGreaterThan(String value) {
            addCriterion("design_single_option_id >", value, "designSingleOptionId");
            return (Criteria) this;
        }

        public Criteria andDesignSingleOptionIdGreaterThanOrEqualTo(String value) {
            addCriterion("design_single_option_id >=", value, "designSingleOptionId");
            return (Criteria) this;
        }

        public Criteria andDesignSingleOptionIdLessThan(String value) {
            addCriterion("design_single_option_id <", value, "designSingleOptionId");
            return (Criteria) this;
        }

        public Criteria andDesignSingleOptionIdLessThanOrEqualTo(String value) {
            addCriterion("design_single_option_id <=", value, "designSingleOptionId");
            return (Criteria) this;
        }

        public Criteria andDesignSingleOptionIdLike(String value) {
            addCriterion("design_single_option_id like", value, "designSingleOptionId");
            return (Criteria) this;
        }

        public Criteria andDesignSingleOptionIdNotLike(String value) {
            addCriterion("design_single_option_id not like", value, "designSingleOptionId");
            return (Criteria) this;
        }

        public Criteria andDesignSingleOptionIdIn(List<String> values) {
            addCriterion("design_single_option_id in", values, "designSingleOptionId");
            return (Criteria) this;
        }

        public Criteria andDesignSingleOptionIdNotIn(List<String> values) {
            addCriterion("design_single_option_id not in", values, "designSingleOptionId");
            return (Criteria) this;
        }

        public Criteria andDesignSingleOptionIdBetween(String value1, String value2) {
            addCriterion("design_single_option_id between", value1, value2, "designSingleOptionId");
            return (Criteria) this;
        }

        public Criteria andDesignSingleOptionIdNotBetween(String value1, String value2) {
            addCriterion("design_single_option_id not between", value1, value2, "designSingleOptionId");
            return (Criteria) this;
        }

        public Criteria andDesignSingleIdIsNull() {
            addCriterion("design_single_id is null");
            return (Criteria) this;
        }

        public Criteria andDesignSingleIdIsNotNull() {
            addCriterion("design_single_id is not null");
            return (Criteria) this;
        }

        public Criteria andDesignSingleIdEqualTo(String value) {
            addCriterion("design_single_id =", value, "designSingleId");
            return (Criteria) this;
        }

        public Criteria andDesignSingleIdNotEqualTo(String value) {
            addCriterion("design_single_id <>", value, "designSingleId");
            return (Criteria) this;
        }

        public Criteria andDesignSingleIdGreaterThan(String value) {
            addCriterion("design_single_id >", value, "designSingleId");
            return (Criteria) this;
        }

        public Criteria andDesignSingleIdGreaterThanOrEqualTo(String value) {
            addCriterion("design_single_id >=", value, "designSingleId");
            return (Criteria) this;
        }

        public Criteria andDesignSingleIdLessThan(String value) {
            addCriterion("design_single_id <", value, "designSingleId");
            return (Criteria) this;
        }

        public Criteria andDesignSingleIdLessThanOrEqualTo(String value) {
            addCriterion("design_single_id <=", value, "designSingleId");
            return (Criteria) this;
        }

        public Criteria andDesignSingleIdLike(String value) {
            addCriterion("design_single_id like", value, "designSingleId");
            return (Criteria) this;
        }

        public Criteria andDesignSingleIdNotLike(String value) {
            addCriterion("design_single_id not like", value, "designSingleId");
            return (Criteria) this;
        }

        public Criteria andDesignSingleIdIn(List<String> values) {
            addCriterion("design_single_id in", values, "designSingleId");
            return (Criteria) this;
        }

        public Criteria andDesignSingleIdNotIn(List<String> values) {
            addCriterion("design_single_id not in", values, "designSingleId");
            return (Criteria) this;
        }

        public Criteria andDesignSingleIdBetween(String value1, String value2) {
            addCriterion("design_single_id between", value1, value2, "designSingleId");
            return (Criteria) this;
        }

        public Criteria andDesignSingleIdNotBetween(String value1, String value2) {
            addCriterion("design_single_id not between", value1, value2, "designSingleId");
            return (Criteria) this;
        }

        public Criteria andDesignSingleOrderIsNull() {
            addCriterion("design_single_order is null");
            return (Criteria) this;
        }

        public Criteria andDesignSingleOrderIsNotNull() {
            addCriterion("design_single_order is not null");
            return (Criteria) this;
        }

        public Criteria andDesignSingleOrderEqualTo(Integer value) {
            addCriterion("design_single_order =", value, "designSingleOrder");
            return (Criteria) this;
        }

        public Criteria andDesignSingleOrderNotEqualTo(Integer value) {
            addCriterion("design_single_order <>", value, "designSingleOrder");
            return (Criteria) this;
        }

        public Criteria andDesignSingleOrderGreaterThan(Integer value) {
            addCriterion("design_single_order >", value, "designSingleOrder");
            return (Criteria) this;
        }

        public Criteria andDesignSingleOrderGreaterThanOrEqualTo(Integer value) {
            addCriterion("design_single_order >=", value, "designSingleOrder");
            return (Criteria) this;
        }

        public Criteria andDesignSingleOrderLessThan(Integer value) {
            addCriterion("design_single_order <", value, "designSingleOrder");
            return (Criteria) this;
        }

        public Criteria andDesignSingleOrderLessThanOrEqualTo(Integer value) {
            addCriterion("design_single_order <=", value, "designSingleOrder");
            return (Criteria) this;
        }

        public Criteria andDesignSingleOrderIn(List<Integer> values) {
            addCriterion("design_single_order in", values, "designSingleOrder");
            return (Criteria) this;
        }

        public Criteria andDesignSingleOrderNotIn(List<Integer> values) {
            addCriterion("design_single_order not in", values, "designSingleOrder");
            return (Criteria) this;
        }

        public Criteria andDesignSingleOrderBetween(Integer value1, Integer value2) {
            addCriterion("design_single_order between", value1, value2, "designSingleOrder");
            return (Criteria) this;
        }

        public Criteria andDesignSingleOrderNotBetween(Integer value1, Integer value2) {
            addCriterion("design_single_order not between", value1, value2, "designSingleOrder");
            return (Criteria) this;
        }

        public Criteria andDesignSingleOptionContentIsNull() {
            addCriterion("design_single_option_content is null");
            return (Criteria) this;
        }

        public Criteria andDesignSingleOptionContentIsNotNull() {
            addCriterion("design_single_option_content is not null");
            return (Criteria) this;
        }

        public Criteria andDesignSingleOptionContentEqualTo(String value) {
            addCriterion("design_single_option_content =", value, "designSingleOptionContent");
            return (Criteria) this;
        }

        public Criteria andDesignSingleOptionContentNotEqualTo(String value) {
            addCriterion("design_single_option_content <>", value, "designSingleOptionContent");
            return (Criteria) this;
        }

        public Criteria andDesignSingleOptionContentGreaterThan(String value) {
            addCriterion("design_single_option_content >", value, "designSingleOptionContent");
            return (Criteria) this;
        }

        public Criteria andDesignSingleOptionContentGreaterThanOrEqualTo(String value) {
            addCriterion("design_single_option_content >=", value, "designSingleOptionContent");
            return (Criteria) this;
        }

        public Criteria andDesignSingleOptionContentLessThan(String value) {
            addCriterion("design_single_option_content <", value, "designSingleOptionContent");
            return (Criteria) this;
        }

        public Criteria andDesignSingleOptionContentLessThanOrEqualTo(String value) {
            addCriterion("design_single_option_content <=", value, "designSingleOptionContent");
            return (Criteria) this;
        }

        public Criteria andDesignSingleOptionContentLike(String value) {
            addCriterion("design_single_option_content like", value, "designSingleOptionContent");
            return (Criteria) this;
        }

        public Criteria andDesignSingleOptionContentNotLike(String value) {
            addCriterion("design_single_option_content not like", value, "designSingleOptionContent");
            return (Criteria) this;
        }

        public Criteria andDesignSingleOptionContentIn(List<String> values) {
            addCriterion("design_single_option_content in", values, "designSingleOptionContent");
            return (Criteria) this;
        }

        public Criteria andDesignSingleOptionContentNotIn(List<String> values) {
            addCriterion("design_single_option_content not in", values, "designSingleOptionContent");
            return (Criteria) this;
        }

        public Criteria andDesignSingleOptionContentBetween(String value1, String value2) {
            addCriterion("design_single_option_content between", value1, value2, "designSingleOptionContent");
            return (Criteria) this;
        }

        public Criteria andDesignSingleOptionContentNotBetween(String value1, String value2) {
            addCriterion("design_single_option_content not between", value1, value2, "designSingleOptionContent");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table design_single_option
     *
     * @mbggenerated do_not_delete_during_merge Tue Apr 10 16:03:01 CST 2018
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table design_single_option
     *
     * @mbggenerated Tue Apr 10 16:03:01 CST 2018
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