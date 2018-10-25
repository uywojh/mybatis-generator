package com.tianque.xueliang.psychosis.domain;

import java.util.Date;

/**
 *  患者轨迹信息
 *   对应表： 
 *    psy_trace
 *
 * @mbggenerated
 */
public class PsyTrace { 

    /**
     * 主键id
     *  psy_trace.id
     *
     * @mbggenerated
     */
    private Long id;

    /**
     * 组织id
     *  psy_trace.org_id
     *
     * @mbggenerated
     */
    private Integer orgId;

    /**
     * 组织代码
     *  psy_trace.org_code
     *
     * @mbggenerated
     */
    private String orgCode;

    /**
     * 创建时间
     *  psy_trace.create_time
     *
     * @mbggenerated
     */
    private Date createTime;

    /**
     * 更新时间
     *  psy_trace.update_time
     *
     * @mbggenerated
     */
    private Date updateTime;

    /**
     * 创建人
     *  psy_trace.create_user
     *
     * @mbggenerated
     */
    private String createUser;

    /**
     * 更新人
     *  psy_trace.update_user
     *
     * @mbggenerated
     */
    private String updateUser;

    /**
     * 状态0删除1存在
     *  psy_trace.status
     *
     * @mbggenerated
     */
    private Integer status;

    /**
     * 经度
     *  psy_trace.lon
     *
     * @mbggenerated
     */
    private String lon;

    /**
     * 纬度
     *  psy_trace.lat
     *
     * @mbggenerated
     */
    private String lat;

    /**
     * 患者id
     *  psy_trace.user_id
     *
     * @mbggenerated
     */
    private Long userId;

    /**
     * 患者类型
     *  psy_trace.user_type
     *
     * @mbggenerated
     */
    private Integer userType;

    /**
     * 获取 主键id
     *  column： psy_trace.id
     *
     * @return the value of psy_trace.id
     *
     * @mbggenerated
     */
    public Long getId() {
        return id;
    }

    /**
     * 设置 主键id
     *  column：  psy_trace.id
     *
     * @param id the value for psy_trace.id
     *
     * @mbggenerated
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 获取 组织id
     *  column： psy_trace.org_id
     *
     * @return the value of psy_trace.org_id
     *
     * @mbggenerated
     */
    public Integer getOrgId() {
        return orgId;
    }

    /**
     * 设置 组织id
     *  column：  psy_trace.org_id
     *
     * @param orgId the value for psy_trace.org_id
     *
     * @mbggenerated
     */
    public void setOrgId(Integer orgId) {
        this.orgId = orgId;
    }

    /**
     * 获取 组织代码
     *  column： psy_trace.org_code
     *
     * @return the value of psy_trace.org_code
     *
     * @mbggenerated
     */
    public String getOrgCode() {
        return orgCode;
    }

    /**
     * 设置 组织代码
     *  column：  psy_trace.org_code
     *
     * @param orgCode the value for psy_trace.org_code
     *
     * @mbggenerated
     */
    public void setOrgCode(String orgCode) {
        this.orgCode = orgCode == null ? null : orgCode.trim();
    }

    /**
     * 获取 创建时间
     *  column： psy_trace.create_time
     *
     * @return the value of psy_trace.create_time
     *
     * @mbggenerated
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 设置 创建时间
     *  column：  psy_trace.create_time
     *
     * @param createTime the value for psy_trace.create_time
     *
     * @mbggenerated
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * 获取 更新时间
     *  column： psy_trace.update_time
     *
     * @return the value of psy_trace.update_time
     *
     * @mbggenerated
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * 设置 更新时间
     *  column：  psy_trace.update_time
     *
     * @param updateTime the value for psy_trace.update_time
     *
     * @mbggenerated
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * 获取 创建人
     *  column： psy_trace.create_user
     *
     * @return the value of psy_trace.create_user
     *
     * @mbggenerated
     */
    public String getCreateUser() {
        return createUser;
    }

    /**
     * 设置 创建人
     *  column：  psy_trace.create_user
     *
     * @param createUser the value for psy_trace.create_user
     *
     * @mbggenerated
     */
    public void setCreateUser(String createUser) {
        this.createUser = createUser == null ? null : createUser.trim();
    }

    /**
     * 获取 更新人
     *  column： psy_trace.update_user
     *
     * @return the value of psy_trace.update_user
     *
     * @mbggenerated
     */
    public String getUpdateUser() {
        return updateUser;
    }

    /**
     * 设置 更新人
     *  column：  psy_trace.update_user
     *
     * @param updateUser the value for psy_trace.update_user
     *
     * @mbggenerated
     */
    public void setUpdateUser(String updateUser) {
        this.updateUser = updateUser == null ? null : updateUser.trim();
    }

    /**
     * 获取 状态0删除1存在
     *  column： psy_trace.status
     *
     * @return the value of psy_trace.status
     *
     * @mbggenerated
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * 设置 状态0删除1存在
     *  column：  psy_trace.status
     *
     * @param status the value for psy_trace.status
     *
     * @mbggenerated
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * 获取 经度
     *  column： psy_trace.lon
     *
     * @return the value of psy_trace.lon
     *
     * @mbggenerated
     */
    public String getLon() {
        return lon;
    }

    /**
     * 设置 经度
     *  column：  psy_trace.lon
     *
     * @param lon the value for psy_trace.lon
     *
     * @mbggenerated
     */
    public void setLon(String lon) {
        this.lon = lon == null ? null : lon.trim();
    }

    /**
     * 获取 纬度
     *  column： psy_trace.lat
     *
     * @return the value of psy_trace.lat
     *
     * @mbggenerated
     */
    public String getLat() {
        return lat;
    }

    /**
     * 设置 纬度
     *  column：  psy_trace.lat
     *
     * @param lat the value for psy_trace.lat
     *
     * @mbggenerated
     */
    public void setLat(String lat) {
        this.lat = lat == null ? null : lat.trim();
    }

    /**
     * 获取 患者id
     *  column： psy_trace.user_id
     *
     * @return the value of psy_trace.user_id
     *
     * @mbggenerated
     */
    public Long getUserId() {
        return userId;
    }

    /**
     * 设置 患者id
     *  column：  psy_trace.user_id
     *
     * @param userId the value for psy_trace.user_id
     *
     * @mbggenerated
     */
    public void setUserId(Long userId) {
        this.userId = userId;
    }

    /**
     * 获取 患者类型
     *  column： psy_trace.user_type
     *
     * @return the value of psy_trace.user_type
     *
     * @mbggenerated
     */
    public Integer getUserType() {
        return userType;
    }

    /**
     * 设置 患者类型
     *  column：  psy_trace.user_type
     *
     * @param userType the value for psy_trace.user_type
     *
     * @mbggenerated
     */
    public void setUserType(Integer userType) {
        this.userType = userType;
    }
}