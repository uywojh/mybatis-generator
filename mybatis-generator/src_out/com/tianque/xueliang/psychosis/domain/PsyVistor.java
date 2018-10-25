package com.tianque.xueliang.psychosis.domain;

import java.util.Date;

/**
 *  日常走访信息
 *   对应表： 
 *    psy_vistor
 *
 * @mbggenerated
 */
public class PsyVistor { 

    /**
     * 主键id
     *  psy_vistor.id
     *
     * @mbggenerated
     */
    private Long id;

    /**
     * 组织id
     *  psy_vistor.org_id
     *
     * @mbggenerated
     */
    private Integer orgId;

    /**
     * 组织代码
     *  psy_vistor.org_code
     *
     * @mbggenerated
     */
    private String orgCode;

    /**
     * 创建时间
     *  psy_vistor.create_time
     *
     * @mbggenerated
     */
    private Date createTime;

    /**
     * 更新时间
     *  psy_vistor.update_time
     *
     * @mbggenerated
     */
    private Date updateTime;

    /**
     * 创建人
     *  psy_vistor.create_user
     *
     * @mbggenerated
     */
    private String createUser;

    /**
     * 更新人
     *  psy_vistor.update_user
     *
     * @mbggenerated
     */
    private String updateUser;

    /**
     * 状态0删除1存在
     *  psy_vistor.status
     *
     * @mbggenerated
     */
    private Integer status;

    /**
     * 走访来源
     *  psy_vistor.vistor_from
     *
     * @mbggenerated
     */
    private String vistorFrom;

    /**
     * 反馈时间
     *  psy_vistor.vistor_time
     *
     * @mbggenerated
     */
    private String vistorTime;

    /**
     * 患者id
     *  psy_vistor.user_id
     *
     * @mbggenerated
     */
    private Long userId;

    /**
     * 患者类型
     *  psy_vistor.user_type
     *
     * @mbggenerated
     */
    private Integer userType;

    /**
     * 走访内容
     *  psy_vistor.vistor_content
     *
     * @mbggenerated
     */
    private String vistorContent;

    /**
     * 获取 主键id
     *  column： psy_vistor.id
     *
     * @return the value of psy_vistor.id
     *
     * @mbggenerated
     */
    public Long getId() {
        return id;
    }

    /**
     * 设置 主键id
     *  column：  psy_vistor.id
     *
     * @param id the value for psy_vistor.id
     *
     * @mbggenerated
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 获取 组织id
     *  column： psy_vistor.org_id
     *
     * @return the value of psy_vistor.org_id
     *
     * @mbggenerated
     */
    public Integer getOrgId() {
        return orgId;
    }

    /**
     * 设置 组织id
     *  column：  psy_vistor.org_id
     *
     * @param orgId the value for psy_vistor.org_id
     *
     * @mbggenerated
     */
    public void setOrgId(Integer orgId) {
        this.orgId = orgId;
    }

    /**
     * 获取 组织代码
     *  column： psy_vistor.org_code
     *
     * @return the value of psy_vistor.org_code
     *
     * @mbggenerated
     */
    public String getOrgCode() {
        return orgCode;
    }

    /**
     * 设置 组织代码
     *  column：  psy_vistor.org_code
     *
     * @param orgCode the value for psy_vistor.org_code
     *
     * @mbggenerated
     */
    public void setOrgCode(String orgCode) {
        this.orgCode = orgCode == null ? null : orgCode.trim();
    }

    /**
     * 获取 创建时间
     *  column： psy_vistor.create_time
     *
     * @return the value of psy_vistor.create_time
     *
     * @mbggenerated
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 设置 创建时间
     *  column：  psy_vistor.create_time
     *
     * @param createTime the value for psy_vistor.create_time
     *
     * @mbggenerated
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * 获取 更新时间
     *  column： psy_vistor.update_time
     *
     * @return the value of psy_vistor.update_time
     *
     * @mbggenerated
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * 设置 更新时间
     *  column：  psy_vistor.update_time
     *
     * @param updateTime the value for psy_vistor.update_time
     *
     * @mbggenerated
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * 获取 创建人
     *  column： psy_vistor.create_user
     *
     * @return the value of psy_vistor.create_user
     *
     * @mbggenerated
     */
    public String getCreateUser() {
        return createUser;
    }

    /**
     * 设置 创建人
     *  column：  psy_vistor.create_user
     *
     * @param createUser the value for psy_vistor.create_user
     *
     * @mbggenerated
     */
    public void setCreateUser(String createUser) {
        this.createUser = createUser == null ? null : createUser.trim();
    }

    /**
     * 获取 更新人
     *  column： psy_vistor.update_user
     *
     * @return the value of psy_vistor.update_user
     *
     * @mbggenerated
     */
    public String getUpdateUser() {
        return updateUser;
    }

    /**
     * 设置 更新人
     *  column：  psy_vistor.update_user
     *
     * @param updateUser the value for psy_vistor.update_user
     *
     * @mbggenerated
     */
    public void setUpdateUser(String updateUser) {
        this.updateUser = updateUser == null ? null : updateUser.trim();
    }

    /**
     * 获取 状态0删除1存在
     *  column： psy_vistor.status
     *
     * @return the value of psy_vistor.status
     *
     * @mbggenerated
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * 设置 状态0删除1存在
     *  column：  psy_vistor.status
     *
     * @param status the value for psy_vistor.status
     *
     * @mbggenerated
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * 获取 走访来源
     *  column： psy_vistor.vistor_from
     *
     * @return the value of psy_vistor.vistor_from
     *
     * @mbggenerated
     */
    public String getVistorFrom() {
        return vistorFrom;
    }

    /**
     * 设置 走访来源
     *  column：  psy_vistor.vistor_from
     *
     * @param vistorFrom the value for psy_vistor.vistor_from
     *
     * @mbggenerated
     */
    public void setVistorFrom(String vistorFrom) {
        this.vistorFrom = vistorFrom == null ? null : vistorFrom.trim();
    }

    /**
     * 获取 反馈时间
     *  column： psy_vistor.vistor_time
     *
     * @return the value of psy_vistor.vistor_time
     *
     * @mbggenerated
     */
    public String getVistorTime() {
        return vistorTime;
    }

    /**
     * 设置 反馈时间
     *  column：  psy_vistor.vistor_time
     *
     * @param vistorTime the value for psy_vistor.vistor_time
     *
     * @mbggenerated
     */
    public void setVistorTime(String vistorTime) {
        this.vistorTime = vistorTime == null ? null : vistorTime.trim();
    }

    /**
     * 获取 患者id
     *  column： psy_vistor.user_id
     *
     * @return the value of psy_vistor.user_id
     *
     * @mbggenerated
     */
    public Long getUserId() {
        return userId;
    }

    /**
     * 设置 患者id
     *  column：  psy_vistor.user_id
     *
     * @param userId the value for psy_vistor.user_id
     *
     * @mbggenerated
     */
    public void setUserId(Long userId) {
        this.userId = userId;
    }

    /**
     * 获取 患者类型
     *  column： psy_vistor.user_type
     *
     * @return the value of psy_vistor.user_type
     *
     * @mbggenerated
     */
    public Integer getUserType() {
        return userType;
    }

    /**
     * 设置 患者类型
     *  column：  psy_vistor.user_type
     *
     * @param userType the value for psy_vistor.user_type
     *
     * @mbggenerated
     */
    public void setUserType(Integer userType) {
        this.userType = userType;
    }

    /**
     * 获取 走访内容
     *  column： psy_vistor.vistor_content
     *
     * @return the value of psy_vistor.vistor_content
     *
     * @mbggenerated
     */
    public String getVistorContent() {
        return vistorContent;
    }

    /**
     * 设置 走访内容
     *  column：  psy_vistor.vistor_content
     *
     * @param vistorContent the value for psy_vistor.vistor_content
     *
     * @mbggenerated
     */
    public void setVistorContent(String vistorContent) {
        this.vistorContent = vistorContent == null ? null : vistorContent.trim();
    }
}