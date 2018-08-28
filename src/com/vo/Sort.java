package com.vo;

import java.io.Serializable;

@SuppressWarnings("serial")
public class Sort implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sort.sort_id
     *
     * @mbggenerated Tue Apr 10 16:03:01 CST 2018
     */
    private String sortId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sort.sort_name
     *
     * @mbggenerated Tue Apr 10 16:03:01 CST 2018
     */
    private String sortName;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sort.sort_id
     *
     * @return the value of sort.sort_id
     *
     * @mbggenerated Tue Apr 10 16:03:01 CST 2018
     */
    public String getSortId() {
        return sortId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sort.sort_id
     *
     * @param sortId the value for sort.sort_id
     *
     * @mbggenerated Tue Apr 10 16:03:01 CST 2018
     */
    public void setSortId(String sortId) {
        this.sortId = sortId == null ? null : sortId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sort.sort_name
     *
     * @return the value of sort.sort_name
     *
     * @mbggenerated Tue Apr 10 16:03:01 CST 2018
     */
    public String getSortName() {
        return sortName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sort.sort_name
     *
     * @param sortName the value for sort.sort_name
     *
     * @mbggenerated Tue Apr 10 16:03:01 CST 2018
     */
    public void setSortName(String sortName) {
        this.sortName = sortName == null ? null : sortName.trim();
    }
}