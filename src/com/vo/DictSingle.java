package com.vo;

import java.io.Serializable;

@SuppressWarnings("serial")
public class DictSingle implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column dict_single.dict_single_id
     *
     * @mbggenerated Tue Apr 10 16:03:01 CST 2018
     */
    private String dictSingleId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column dict_single.dict_single_content
     *
     * @mbggenerated Tue Apr 10 16:03:01 CST 2018
     */
    private String dictSingleContent;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column dict_single.dict_single_id
     *
     * @return the value of dict_single.dict_single_id
     *
     * @mbggenerated Tue Apr 10 16:03:01 CST 2018
     */
    public String getDictSingleId() {
        return dictSingleId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column dict_single.dict_single_id
     *
     * @param dictSingleId the value for dict_single.dict_single_id
     *
     * @mbggenerated Tue Apr 10 16:03:01 CST 2018
     */
    public void setDictSingleId(String dictSingleId) {
        this.dictSingleId = dictSingleId == null ? null : dictSingleId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column dict_single.dict_single_content
     *
     * @return the value of dict_single.dict_single_content
     *
     * @mbggenerated Tue Apr 10 16:03:01 CST 2018
     */
    public String getDictSingleContent() {
        return dictSingleContent;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column dict_single.dict_single_content
     *
     * @param dictSingleContent the value for dict_single.dict_single_content
     *
     * @mbggenerated Tue Apr 10 16:03:01 CST 2018
     */
    public void setDictSingleContent(String dictSingleContent) {
        this.dictSingleContent = dictSingleContent == null ? null : dictSingleContent.trim();
    }
}