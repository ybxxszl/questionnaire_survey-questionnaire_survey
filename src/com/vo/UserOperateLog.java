package com.vo;

import java.util.Date;

public class UserOperateLog {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_operate_log.user_operate_log_id
     *
     * @mbggenerated Tue Apr 10 16:03:01 CST 2018
     */
    private String userOperateLogId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_operate_log.user_operate_time
     *
     * @mbggenerated Tue Apr 10 16:03:01 CST 2018
     */
    private Date userOperateTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_operate_log.user_operate_account
     *
     * @mbggenerated Tue Apr 10 16:03:01 CST 2018
     */
    private String userOperateAccount;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_operate_log.user_operate_project_id
     *
     * @mbggenerated Tue Apr 10 16:03:01 CST 2018
     */
    private String userOperateProjectId;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_operate_log.user_operate_log_id
     *
     * @return the value of user_operate_log.user_operate_log_id
     *
     * @mbggenerated Tue Apr 10 16:03:01 CST 2018
     */
    public String getUserOperateLogId() {
        return userOperateLogId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_operate_log.user_operate_log_id
     *
     * @param userOperateLogId the value for user_operate_log.user_operate_log_id
     *
     * @mbggenerated Tue Apr 10 16:03:01 CST 2018
     */
    public void setUserOperateLogId(String userOperateLogId) {
        this.userOperateLogId = userOperateLogId == null ? null : userOperateLogId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_operate_log.user_operate_time
     *
     * @return the value of user_operate_log.user_operate_time
     *
     * @mbggenerated Tue Apr 10 16:03:01 CST 2018
     */
    public Date getUserOperateTime() {
        return userOperateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_operate_log.user_operate_time
     *
     * @param userOperateTime the value for user_operate_log.user_operate_time
     *
     * @mbggenerated Tue Apr 10 16:03:01 CST 2018
     */
    public void setUserOperateTime(Date userOperateTime) {
        this.userOperateTime = userOperateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_operate_log.user_operate_account
     *
     * @return the value of user_operate_log.user_operate_account
     *
     * @mbggenerated Tue Apr 10 16:03:01 CST 2018
     */
    public String getUserOperateAccount() {
        return userOperateAccount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_operate_log.user_operate_account
     *
     * @param userOperateAccount the value for user_operate_log.user_operate_account
     *
     * @mbggenerated Tue Apr 10 16:03:01 CST 2018
     */
    public void setUserOperateAccount(String userOperateAccount) {
        this.userOperateAccount = userOperateAccount == null ? null : userOperateAccount.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_operate_log.user_operate_project_id
     *
     * @return the value of user_operate_log.user_operate_project_id
     *
     * @mbggenerated Tue Apr 10 16:03:01 CST 2018
     */
    public String getUserOperateProjectId() {
        return userOperateProjectId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_operate_log.user_operate_project_id
     *
     * @param userOperateProjectId the value for user_operate_log.user_operate_project_id
     *
     * @mbggenerated Tue Apr 10 16:03:01 CST 2018
     */
    public void setUserOperateProjectId(String userOperateProjectId) {
        this.userOperateProjectId = userOperateProjectId == null ? null : userOperateProjectId.trim();
    }
}