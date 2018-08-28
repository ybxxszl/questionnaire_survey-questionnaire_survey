package com.vo;

import java.util.ArrayList;
import java.util.List;

public class DictTextExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table dict_text
     *
     * @mbggenerated Tue Apr 10 16:03:01 CST 2018
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table dict_text
     *
     * @mbggenerated Tue Apr 10 16:03:01 CST 2018
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table dict_text
     *
     * @mbggenerated Tue Apr 10 16:03:01 CST 2018
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dict_text
     *
     * @mbggenerated Tue Apr 10 16:03:01 CST 2018
     */
    public DictTextExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dict_text
     *
     * @mbggenerated Tue Apr 10 16:03:01 CST 2018
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dict_text
     *
     * @mbggenerated Tue Apr 10 16:03:01 CST 2018
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dict_text
     *
     * @mbggenerated Tue Apr 10 16:03:01 CST 2018
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dict_text
     *
     * @mbggenerated Tue Apr 10 16:03:01 CST 2018
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dict_text
     *
     * @mbggenerated Tue Apr 10 16:03:01 CST 2018
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dict_text
     *
     * @mbggenerated Tue Apr 10 16:03:01 CST 2018
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dict_text
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
     * This method corresponds to the database table dict_text
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
     * This method corresponds to the database table dict_text
     *
     * @mbggenerated Tue Apr 10 16:03:01 CST 2018
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dict_text
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
     * This class corresponds to the database table dict_text
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

        public Criteria andDictTextIdIsNull() {
            addCriterion("dict_text_id is null");
            return (Criteria) this;
        }

        public Criteria andDictTextIdIsNotNull() {
            addCriterion("dict_text_id is not null");
            return (Criteria) this;
        }

        public Criteria andDictTextIdEqualTo(String value) {
            addCriterion("dict_text_id =", value, "dictTextId");
            return (Criteria) this;
        }

        public Criteria andDictTextIdNotEqualTo(String value) {
            addCriterion("dict_text_id <>", value, "dictTextId");
            return (Criteria) this;
        }

        public Criteria andDictTextIdGreaterThan(String value) {
            addCriterion("dict_text_id >", value, "dictTextId");
            return (Criteria) this;
        }

        public Criteria andDictTextIdGreaterThanOrEqualTo(String value) {
            addCriterion("dict_text_id >=", value, "dictTextId");
            return (Criteria) this;
        }

        public Criteria andDictTextIdLessThan(String value) {
            addCriterion("dict_text_id <", value, "dictTextId");
            return (Criteria) this;
        }

        public Criteria andDictTextIdLessThanOrEqualTo(String value) {
            addCriterion("dict_text_id <=", value, "dictTextId");
            return (Criteria) this;
        }

        public Criteria andDictTextIdLike(String value) {
            addCriterion("dict_text_id like", value, "dictTextId");
            return (Criteria) this;
        }

        public Criteria andDictTextIdNotLike(String value) {
            addCriterion("dict_text_id not like", value, "dictTextId");
            return (Criteria) this;
        }

        public Criteria andDictTextIdIn(List<String> values) {
            addCriterion("dict_text_id in", values, "dictTextId");
            return (Criteria) this;
        }

        public Criteria andDictTextIdNotIn(List<String> values) {
            addCriterion("dict_text_id not in", values, "dictTextId");
            return (Criteria) this;
        }

        public Criteria andDictTextIdBetween(String value1, String value2) {
            addCriterion("dict_text_id between", value1, value2, "dictTextId");
            return (Criteria) this;
        }

        public Criteria andDictTextIdNotBetween(String value1, String value2) {
            addCriterion("dict_text_id not between", value1, value2, "dictTextId");
            return (Criteria) this;
        }

        public Criteria andDictTextContentIsNull() {
            addCriterion("dict_text_content is null");
            return (Criteria) this;
        }

        public Criteria andDictTextContentIsNotNull() {
            addCriterion("dict_text_content is not null");
            return (Criteria) this;
        }

        public Criteria andDictTextContentEqualTo(String value) {
            addCriterion("dict_text_content =", value, "dictTextContent");
            return (Criteria) this;
        }

        public Criteria andDictTextContentNotEqualTo(String value) {
            addCriterion("dict_text_content <>", value, "dictTextContent");
            return (Criteria) this;
        }

        public Criteria andDictTextContentGreaterThan(String value) {
            addCriterion("dict_text_content >", value, "dictTextContent");
            return (Criteria) this;
        }

        public Criteria andDictTextContentGreaterThanOrEqualTo(String value) {
            addCriterion("dict_text_content >=", value, "dictTextContent");
            return (Criteria) this;
        }

        public Criteria andDictTextContentLessThan(String value) {
            addCriterion("dict_text_content <", value, "dictTextContent");
            return (Criteria) this;
        }

        public Criteria andDictTextContentLessThanOrEqualTo(String value) {
            addCriterion("dict_text_content <=", value, "dictTextContent");
            return (Criteria) this;
        }

        public Criteria andDictTextContentLike(String value) {
            addCriterion("dict_text_content like", value, "dictTextContent");
            return (Criteria) this;
        }

        public Criteria andDictTextContentNotLike(String value) {
            addCriterion("dict_text_content not like", value, "dictTextContent");
            return (Criteria) this;
        }

        public Criteria andDictTextContentIn(List<String> values) {
            addCriterion("dict_text_content in", values, "dictTextContent");
            return (Criteria) this;
        }

        public Criteria andDictTextContentNotIn(List<String> values) {
            addCriterion("dict_text_content not in", values, "dictTextContent");
            return (Criteria) this;
        }

        public Criteria andDictTextContentBetween(String value1, String value2) {
            addCriterion("dict_text_content between", value1, value2, "dictTextContent");
            return (Criteria) this;
        }

        public Criteria andDictTextContentNotBetween(String value1, String value2) {
            addCriterion("dict_text_content not between", value1, value2, "dictTextContent");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table dict_text
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
     * This class corresponds to the database table dict_text
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