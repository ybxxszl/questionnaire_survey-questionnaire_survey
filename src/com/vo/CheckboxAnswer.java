package com.vo;

import java.io.Serializable;

@SuppressWarnings("serial")
public class CheckboxAnswer implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column checkbox_answer.checkbox_answer_id
     *
     * @mbggenerated Sun Jan 07 16:26:51 CST 2018
     */
    private String checkboxAnswerId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column checkbox_answer.design_checkbox_id
     *
     * @mbggenerated Sun Jan 07 16:26:51 CST 2018
     */
    private String designCheckboxId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column checkbox_answer.dict_checkbox_option_id
     *
     * @mbggenerated Sun Jan 07 16:26:51 CST 2018
     */
    private String dictCheckboxOptionId;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column checkbox_answer.checkbox_answer_id
     *
     * @return the value of checkbox_answer.checkbox_answer_id
     *
     * @mbggenerated Sun Jan 07 16:26:51 CST 2018
     */
    public String getCheckboxAnswerId() {
        return checkboxAnswerId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column checkbox_answer.checkbox_answer_id
     *
     * @param checkboxAnswerId the value for checkbox_answer.checkbox_answer_id
     *
     * @mbggenerated Sun Jan 07 16:26:51 CST 2018
     */
    public void setCheckboxAnswerId(String checkboxAnswerId) {
        this.checkboxAnswerId = checkboxAnswerId == null ? null : checkboxAnswerId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column checkbox_answer.design_checkbox_id
     *
     * @return the value of checkbox_answer.design_checkbox_id
     *
     * @mbggenerated Sun Jan 07 16:26:51 CST 2018
     */
    public String getDesignCheckboxId() {
        return designCheckboxId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column checkbox_answer.design_checkbox_id
     *
     * @param designCheckboxId the value for checkbox_answer.design_checkbox_id
     *
     * @mbggenerated Sun Jan 07 16:26:51 CST 2018
     */
    public void setDesignCheckboxId(String designCheckboxId) {
        this.designCheckboxId = designCheckboxId == null ? null : designCheckboxId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column checkbox_answer.dict_checkbox_option_id
     *
     * @return the value of checkbox_answer.dict_checkbox_option_id
     *
     * @mbggenerated Sun Jan 07 16:26:51 CST 2018
     */
    public String getDictCheckboxOptionId() {
        return dictCheckboxOptionId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column checkbox_answer.dict_checkbox_option_id
     *
     * @param dictCheckboxOptionId the value for checkbox_answer.dict_checkbox_option_id
     *
     * @mbggenerated Sun Jan 07 16:26:51 CST 2018
     */
    public void setDictCheckboxOptionId(String dictCheckboxOptionId) {
        this.dictCheckboxOptionId = dictCheckboxOptionId == null ? null : dictCheckboxOptionId.trim();
    }
}