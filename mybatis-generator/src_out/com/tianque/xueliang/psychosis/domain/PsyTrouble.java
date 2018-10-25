package com.tianque.xueliang.psychosis.domain;

import java.util.Date;

/**
 *  肇事肇祸信息
 *   对应表： 
 *    psy_trouble
 *
 * @mbggenerated
 */
public class PsyTrouble { 

    /**
     * 主键id
     *  psy_trouble.id
     *
     * @mbggenerated
     */
    private Long id;

    /**
     * 组织id
     *  psy_trouble.org_id
     *
     * @mbggenerated
     */
    private Integer orgId;

    /**
     * 组织代码
     *  psy_trouble.org_code
     *
     * @mbggenerated
     */
    private String orgCode;

    /**
     * 创建时间
     *  psy_trouble.create_time
     *
     * @mbggenerated
     */
    private Date createTime;

    /**
     * 更新时间
     *  psy_trouble.update_time
     *
     * @mbggenerated
     */
    private Date updateTime;

    /**
     * 创建人
     *  psy_trouble.create_user
     *
     * @mbggenerated
     */
    private String createUser;

    /**
     * 更新人
     *  psy_trouble.update_user
     *
     * @mbggenerated
     */
    private String updateUser;

    /**
     * 状态0删除1存在
     *  psy_trouble.status
     *
     * @mbggenerated
     */
    private Integer status;

    /**
     * 事件发生地址
     *  psy_trouble.trouble_address
     *
     * @mbggenerated
     */
    private String troubleAddress;

    /**
     * 事件处理结果
     *  psy_trouble.trouble_result
     *
     * @mbggenerated
     */
    private String troubleResult;

    /**
     * 患者id
     *  psy_trouble.user_id
     *
     * @mbggenerated
     */
    private Long userId;

    /**
     * 患者类型
     *  psy_trouble.user_type
     *
     * @mbggenerated
     */
    private Integer userType;

    /**
     * 事件详情
     *  psy_trouble.trouble_detail
     *
     * @mbggenerated
     */
    private String troubleDetail;

    /**
     * 获取 主键id
     *  column： psy_trouble.id
     *
     * @return the value of psy_trouble.id
     *
     * @mbggenerated
     */
    public Long getId() {
        return id;
    }

    /**
     * 设置 主键id
     *  column：  psy_trouble.id
     *
     * @param id the value for psy_trouble.id
     *
     * @mbggenerated
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 获取 组织id
     *  column： psy_trouble.org_id
     *
     * @return the value of psy_trouble.org_id
     *
     * @mbggenerated
     */
    public Integer getOrgId() {
        return orgId;
    }

    /**
     * 设置 组织id
     *  column：  psy_trouble.org_id
     *
     * @param orgId the value for psy_trouble.org_id
     *
     * @mbggenerated
     */
    public void setOrgId(Integer orgId) {
        this.orgId = orgId;
    }

    /**
     * 获取 组织代码
     *  column： psy_trouble.org_code
     *
     * @return the value of psy_trouble.org_code
     *
     * @mbggenerated
     */
    public String getOrgCode() {
        return orgCode;
    }

    /**
     * 设置 组织代码
     *  column：  psy_trouble.org_code
     *
     * @param orgCode the value for psy_trouble.org_code
     *
     * @mbggenerated
     */
    public void setOrgCode(String orgCode) {
        this.orgCode = orgCode == null ? null : orgCode.trim();
    }

    /**
     * 获取 创建时间
     *  column： psy_trouble.create_time
     *
     * @return the value of psy_trouble.create_time
     *
     * @mbggenerated
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 设置 创建时间
     *  column：  psy_trouble.create_time
     *
     * @param createTime the value for psy_trouble.create_time
     *
     * @mbggenerated
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * 获取 更新时间
     *  column： psy_trouble.update_time
     *
     * @return the value of psy_trouble.update_time
     *
     * @mbggenerated
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * 设置 更新时间
     *  column：  psy_trouble.update_time
     *
     * @param updateTime the value for psy_trouble.update_time
     *
     * @mbggenerated
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * 获取 创建人
     *  column： psy_trouble.create_user
     *
     * @return the value of psy_trouble.create_user
     *
     * @mbggenerated
     */
    public String getCreateUser() {
        return createUser;
    }

    /**
     * 设置 创建人
     *  column：  psy_trouble.create_user
     *
     * @param createUser the value for psy_trouble.create_user
     *
     * @mbggenerated
     */
    public void setCreateUser(String createUser) {
        this.createUser = createUser == null ? null : createUser.trim();
    }

    /**
     * 获取 更新人
     *  column： psy_trouble.update_user
     *
     * @return the value of psy_trouble.update_user
     *
     * @mbggenerated
     */
    public String getUpdateUser() {
        return updateUser;
    }

    /**
     * 设置 更新人
     *  column：  psy_trouble.update_user
     *
     * @param updateUser the value for psy_trouble.update_user
     *
     * @mbggenerated
     */
    public void setUpdateUser(String updateUser) {
        this.updateUser = updateUser == null ? null : updateUser.trim();
    }

    /**
     * 获取 状态0删除1存在
     *  column： psy_trouble.status
     *
     * @return the value of psy_trouble.status
     *
     * @mbggenerated
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * 设置 状态0删除1存在
     *  column：  psy_trouble.status
     *
     * @param status the value for psy_trouble.status
     *
     * @mbggenerated
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * 获取 事件发生地址
     *  column： psy_trouble.trouble_address
     *
     * @return the value of psy_trouble.trouble_address
     *
     * @mbggenerated
     */
    public String getTroubleAddress() {
        return troubleAddress;
    }

    /**
     * 设置 事件发生地址
     *  column：  psy_trouble.trouble_address
     *
     * @param troubleAddress the value for psy_trouble.trouble_address
     *
     * @mbggenerated
     */
    public void setTroubleAddress(String troubleAddress) {
        this.troubleAddress = troubleAddress == null ? null : troubleAddress.trim();
    }

    /**
     * 获取 事件处理结果
     *  column： psy_trouble.trouble_result
     *
     * @return the value of psy_trouble.trouble_result
     *
     * @mbggenerated
     */
    public String getTroubleResult() {
        return troubleResult;
    }

    /**
     * 设置 事件处理结果
     *  column：  psy_trouble.trouble_result
     *
     * @param troubleResult the value for psy_trouble.trouble_result
     *
     * @mbggenerated
     */
    public void setTroubleResult(String troubleResult) {
        this.troubleResult = troubleResult == null ? null : troubleResult.trim();
    }

    /**
     * 获取 患者id
     *  column： psy_trouble.user_id
     *
     * @return the value of psy_trouble.user_id
     *
     * @mbggenerated
     */
    public Long getUserId() {
        return userId;
    }

    /**
     * 设置 患者id
     *  column：  psy_trouble.user_id
     *
     * @param userId the value for psy_trouble.user_id
     *
     * @mbggenerated
     */
    public void setUserId(Long userId) {
        this.userId = userId;
    }

    /**
     * 获取 患者类型
     *  column： psy_trouble.user_type
     *
     * @return the value of psy_trouble.user_type
     *
     * @mbggenerated
     */
    public Integer getUserType() {
        return userType;
    }

    /**
     * 设置 患者类型
     *  column：  psy_trouble.user_type
     *
     * @param userType the value for psy_trouble.user_type
     *
     * @mbggenerated
     */
    public void setUserType(Integer userType) {
        this.userType = userType;
    }

    /**
     * 获取 事件详情
     *  column： psy_trouble.trouble_detail
     *
     * @return the value of psy_trouble.trouble_detail
     *
     * @mbggenerated
     */
    public String getTroubleDetail() {
        return troubleDetail;
    }

    /**
     * 设置 事件详情
     *  column：  psy_trouble.trouble_detail
     *
     * @param troubleDetail the value for psy_trouble.trouble_detail
     *
     * @mbggenerated
     */
    public void setTroubleDetail(String troubleDetail) {
        this.troubleDetail = troubleDetail == null ? null : troubleDetail.trim();
    }
}