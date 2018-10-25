package com.tianque.xueliang.psychosis.domain;

import java.util.Date;

/**
 *  患者监管人信息
 *   对应表： 
 *    psy_watcher
 *
 * @mbggenerated
 */
public class PsyWatcher { 

    /**
     * 主键id
     *  psy_watcher.id
     *
     * @mbggenerated
     */
    private Long id;

    /**
     * 组织id
     *  psy_watcher.org_id
     *
     * @mbggenerated
     */
    private Integer orgId;

    /**
     * 组织代码
     *  psy_watcher.org_code
     *
     * @mbggenerated
     */
    private String orgCode;

    /**
     * 创建时间
     *  psy_watcher.create_time
     *
     * @mbggenerated
     */
    private Date createTime;

    /**
     * 更新时间
     *  psy_watcher.update_time
     *
     * @mbggenerated
     */
    private Date updateTime;

    /**
     * 创建人
     *  psy_watcher.create_user
     *
     * @mbggenerated
     */
    private String createUser;

    /**
     * 更新人
     *  psy_watcher.update_user
     *
     * @mbggenerated
     */
    private String updateUser;

    /**
     * 状态0删除1存在
     *  psy_watcher.status
     *
     * @mbggenerated
     */
    private Integer status;

    /**
     * 监管人姓名
     *  psy_watcher.watcher_name
     *
     * @mbggenerated
     */
    private String watcherName;

    /**
     * 监管人身份
     *  psy_watcher.watcher_position
     *
     * @mbggenerated
     */
    private String watcherPosition;

    /**
     * 监管人职务
     *  psy_watcher.watcher_job
     *
     * @mbggenerated
     */
    private String watcherJob;

    /**
     * 监管人所属机构
     *  psy_watcher.position_org
     *
     * @mbggenerated
     */
    private String positionOrg;

    /**
     * 监管人所属区域
     *  psy_watcher.position_region
     *
     * @mbggenerated
     */
    private String positionRegion;

    /**
     * 患者id
     *  psy_watcher.user_id
     *
     * @mbggenerated
     */
    private Long userId;

    /**
     * 患者类型
     *  psy_watcher.user_type
     *
     * @mbggenerated
     */
    private Integer userType;

    /**
     * 获取 主键id
     *  column： psy_watcher.id
     *
     * @return the value of psy_watcher.id
     *
     * @mbggenerated
     */
    public Long getId() {
        return id;
    }

    /**
     * 设置 主键id
     *  column：  psy_watcher.id
     *
     * @param id the value for psy_watcher.id
     *
     * @mbggenerated
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 获取 组织id
     *  column： psy_watcher.org_id
     *
     * @return the value of psy_watcher.org_id
     *
     * @mbggenerated
     */
    public Integer getOrgId() {
        return orgId;
    }

    /**
     * 设置 组织id
     *  column：  psy_watcher.org_id
     *
     * @param orgId the value for psy_watcher.org_id
     *
     * @mbggenerated
     */
    public void setOrgId(Integer orgId) {
        this.orgId = orgId;
    }

    /**
     * 获取 组织代码
     *  column： psy_watcher.org_code
     *
     * @return the value of psy_watcher.org_code
     *
     * @mbggenerated
     */
    public String getOrgCode() {
        return orgCode;
    }

    /**
     * 设置 组织代码
     *  column：  psy_watcher.org_code
     *
     * @param orgCode the value for psy_watcher.org_code
     *
     * @mbggenerated
     */
    public void setOrgCode(String orgCode) {
        this.orgCode = orgCode == null ? null : orgCode.trim();
    }

    /**
     * 获取 创建时间
     *  column： psy_watcher.create_time
     *
     * @return the value of psy_watcher.create_time
     *
     * @mbggenerated
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 设置 创建时间
     *  column：  psy_watcher.create_time
     *
     * @param createTime the value for psy_watcher.create_time
     *
     * @mbggenerated
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * 获取 更新时间
     *  column： psy_watcher.update_time
     *
     * @return the value of psy_watcher.update_time
     *
     * @mbggenerated
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * 设置 更新时间
     *  column：  psy_watcher.update_time
     *
     * @param updateTime the value for psy_watcher.update_time
     *
     * @mbggenerated
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * 获取 创建人
     *  column： psy_watcher.create_user
     *
     * @return the value of psy_watcher.create_user
     *
     * @mbggenerated
     */
    public String getCreateUser() {
        return createUser;
    }

    /**
     * 设置 创建人
     *  column：  psy_watcher.create_user
     *
     * @param createUser the value for psy_watcher.create_user
     *
     * @mbggenerated
     */
    public void setCreateUser(String createUser) {
        this.createUser = createUser == null ? null : createUser.trim();
    }

    /**
     * 获取 更新人
     *  column： psy_watcher.update_user
     *
     * @return the value of psy_watcher.update_user
     *
     * @mbggenerated
     */
    public String getUpdateUser() {
        return updateUser;
    }

    /**
     * 设置 更新人
     *  column：  psy_watcher.update_user
     *
     * @param updateUser the value for psy_watcher.update_user
     *
     * @mbggenerated
     */
    public void setUpdateUser(String updateUser) {
        this.updateUser = updateUser == null ? null : updateUser.trim();
    }

    /**
     * 获取 状态0删除1存在
     *  column： psy_watcher.status
     *
     * @return the value of psy_watcher.status
     *
     * @mbggenerated
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * 设置 状态0删除1存在
     *  column：  psy_watcher.status
     *
     * @param status the value for psy_watcher.status
     *
     * @mbggenerated
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * 获取 监管人姓名
     *  column： psy_watcher.watcher_name
     *
     * @return the value of psy_watcher.watcher_name
     *
     * @mbggenerated
     */
    public String getWatcherName() {
        return watcherName;
    }

    /**
     * 设置 监管人姓名
     *  column：  psy_watcher.watcher_name
     *
     * @param watcherName the value for psy_watcher.watcher_name
     *
     * @mbggenerated
     */
    public void setWatcherName(String watcherName) {
        this.watcherName = watcherName == null ? null : watcherName.trim();
    }

    /**
     * 获取 监管人身份
     *  column： psy_watcher.watcher_position
     *
     * @return the value of psy_watcher.watcher_position
     *
     * @mbggenerated
     */
    public String getWatcherPosition() {
        return watcherPosition;
    }

    /**
     * 设置 监管人身份
     *  column：  psy_watcher.watcher_position
     *
     * @param watcherPosition the value for psy_watcher.watcher_position
     *
     * @mbggenerated
     */
    public void setWatcherPosition(String watcherPosition) {
        this.watcherPosition = watcherPosition == null ? null : watcherPosition.trim();
    }

    /**
     * 获取 监管人职务
     *  column： psy_watcher.watcher_job
     *
     * @return the value of psy_watcher.watcher_job
     *
     * @mbggenerated
     */
    public String getWatcherJob() {
        return watcherJob;
    }

    /**
     * 设置 监管人职务
     *  column：  psy_watcher.watcher_job
     *
     * @param watcherJob the value for psy_watcher.watcher_job
     *
     * @mbggenerated
     */
    public void setWatcherJob(String watcherJob) {
        this.watcherJob = watcherJob == null ? null : watcherJob.trim();
    }

    /**
     * 获取 监管人所属机构
     *  column： psy_watcher.position_org
     *
     * @return the value of psy_watcher.position_org
     *
     * @mbggenerated
     */
    public String getPositionOrg() {
        return positionOrg;
    }

    /**
     * 设置 监管人所属机构
     *  column：  psy_watcher.position_org
     *
     * @param positionOrg the value for psy_watcher.position_org
     *
     * @mbggenerated
     */
    public void setPositionOrg(String positionOrg) {
        this.positionOrg = positionOrg == null ? null : positionOrg.trim();
    }

    /**
     * 获取 监管人所属区域
     *  column： psy_watcher.position_region
     *
     * @return the value of psy_watcher.position_region
     *
     * @mbggenerated
     */
    public String getPositionRegion() {
        return positionRegion;
    }

    /**
     * 设置 监管人所属区域
     *  column：  psy_watcher.position_region
     *
     * @param positionRegion the value for psy_watcher.position_region
     *
     * @mbggenerated
     */
    public void setPositionRegion(String positionRegion) {
        this.positionRegion = positionRegion == null ? null : positionRegion.trim();
    }

    /**
     * 获取 患者id
     *  column： psy_watcher.user_id
     *
     * @return the value of psy_watcher.user_id
     *
     * @mbggenerated
     */
    public Long getUserId() {
        return userId;
    }

    /**
     * 设置 患者id
     *  column：  psy_watcher.user_id
     *
     * @param userId the value for psy_watcher.user_id
     *
     * @mbggenerated
     */
    public void setUserId(Long userId) {
        this.userId = userId;
    }

    /**
     * 获取 患者类型
     *  column： psy_watcher.user_type
     *
     * @return the value of psy_watcher.user_type
     *
     * @mbggenerated
     */
    public Integer getUserType() {
        return userType;
    }

    /**
     * 设置 患者类型
     *  column：  psy_watcher.user_type
     *
     * @param userType the value for psy_watcher.user_type
     *
     * @mbggenerated
     */
    public void setUserType(Integer userType) {
        this.userType = userType;
    }
}