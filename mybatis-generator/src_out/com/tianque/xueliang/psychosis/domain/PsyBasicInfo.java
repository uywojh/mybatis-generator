package com.tianque.xueliang.psychosis.domain;

import java.util.Date;

/**
 *  患者基本信息
 *   对应表： 
 *    psy_basic_info
 *
 * @mbggenerated
 */
public class PsyBasicInfo { 

    /**
     * 主键id
     *  psy_basic_info.id
     *
     * @mbggenerated
     */
    private Long id;

    /**
     * 组织id
     *  psy_basic_info.org_id
     *
     * @mbggenerated
     */
    private Integer orgId;

    /**
     * 组织代码
     *  psy_basic_info.org_code
     *
     * @mbggenerated
     */
    private String orgCode;

    /**
     * 创建时间
     *  psy_basic_info.create_time
     *
     * @mbggenerated
     */
    private Date createTime;

    /**
     * 更新时间
     *  psy_basic_info.update_time
     *
     * @mbggenerated
     */
    private Date updateTime;

    /**
     * 创建人
     *  psy_basic_info.create_user
     *
     * @mbggenerated
     */
    private String createUser;

    /**
     * 更新人
     *  psy_basic_info.update_user
     *
     * @mbggenerated
     */
    private String updateUser;

    /**
     * 状态0删除1存在
     *  psy_basic_info.status
     *
     * @mbggenerated
     */
    private Integer status;

    /**
     * 患者名称
     *  psy_basic_info.psy_name
     *
     * @mbggenerated
     */
    private String psyName;

    /**
     * 患者性别1男2女
     *  psy_basic_info.psy_sex
     *
     * @mbggenerated
     */
    private Boolean psySex;

    /**
     * 患者曾用名
     *  psy_basic_info.psy_before_name
     *
     * @mbggenerated
     */
    private String psyBeforeName;

    /**
     * 患者身份证
     *  psy_basic_info.psy_id_card
     *
     * @mbggenerated
     */
    private Integer psyIdCard;

    /**
     * 患者生日
     *  psy_basic_info.psy_birth
     *
     * @mbggenerated
     */
    private String psyBirth;

    /**
     * 患者年龄
     *  psy_basic_info.psy_age
     *
     * @mbggenerated
     */
    private Integer psyAge;

    /**
     * 患者民族
     *  psy_basic_info.psy_nation
     *
     * @mbggenerated
     */
    private String psyNation;

    /**
     * 患者籍贯
     *  psy_basic_info.psy_native
     *
     * @mbggenerated
     */
    private String psyNative;

    /**
     * 患者婚姻状态1已婚0未婚
     *  psy_basic_info.psy_marital
     *
     * @mbggenerated
     */
    private Boolean psyMarital;

    /**
     * 患者政治面貌
     *  psy_basic_info.psy_politic
     *
     * @mbggenerated
     */
    private String psyPolitic;

    /**
     * 患者学历
     *  psy_basic_info.psy_background
     *
     * @mbggenerated
     */
    private String psyBackground;

    /**
     * 患者信仰
     *  psy_basic_info.psy_faith
     *
     * @mbggenerated
     */
    private String psyFaith;

    /**
     * 患者职业
     *  psy_basic_info.psy_job
     *
     * @mbggenerated
     */
    private String psyJob;

    /**
     * 患者服务场所
     *  psy_basic_info.psy_workspace
     *
     * @mbggenerated
     */
    private String psyWorkspace;

    /**
     * 患者联系方式
     *  psy_basic_info.psy_phone
     *
     * @mbggenerated
     */
    private String psyPhone;

    /**
     * 患者籍贯地址
     *  psy_basic_info.psy_nation_address
     *
     * @mbggenerated
     */
    private String psyNationAddress;

    /**
     * 患者现居地址
     *  psy_basic_info.psy_now_address
     *
     * @mbggenerated
     */
    private String psyNowAddress;

    /**
     * 患者家庭经济情况
     *  psy_basic_info.psy_family_income
     *
     * @mbggenerated
     */
    private String psyFamilyIncome;

    /**
     * 患者是否纳入低保户1是0否
     *  psy_basic_info.psy_is_minimum
     *
     * @mbggenerated
     */
    private Boolean psyIsMinimum;

    /**
     * 监护人姓名
     *  psy_basic_info.psy_guardian_name
     *
     * @mbggenerated
     */
    private String psyGuardianName;

    /**
     * 监护人身份证号
     *  psy_basic_info.psy_guardian_id
     *
     * @mbggenerated
     */
    private Integer psyGuardianId;

    /**
     * 与监护人关系
     *  psy_basic_info.psy_guardian_relation
     *
     * @mbggenerated
     */
    private String psyGuardianRelation;

    /**
     * 监护人家庭地址
     *  psy_basic_info.psy_guardian_address
     *
     * @mbggenerated
     */
    private String psyGuardianAddress;

    /**
     * 监护人联系方式
     *  psy_basic_info.psy_guardian_phone
     *
     * @mbggenerated
     */
    private String psyGuardianPhone;

    /**
     * 患者id
     *  psy_basic_info.user_id
     *
     * @mbggenerated
     */
    private Long userId;

    /**
     * 患者类型
     *  psy_basic_info.user_type
     *
     * @mbggenerated
     */
    private Integer userType;

    /**
     * 其他信息
     *  psy_basic_info.psy_other_content
     *
     * @mbggenerated
     */
    private String psyOtherContent;

    /**
     * 获取 主键id
     *  column： psy_basic_info.id
     *
     * @return the value of psy_basic_info.id
     *
     * @mbggenerated
     */
    public Long getId() {
        return id;
    }

    /**
     * 设置 主键id
     *  column：  psy_basic_info.id
     *
     * @param id the value for psy_basic_info.id
     *
     * @mbggenerated
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 获取 组织id
     *  column： psy_basic_info.org_id
     *
     * @return the value of psy_basic_info.org_id
     *
     * @mbggenerated
     */
    public Integer getOrgId() {
        return orgId;
    }

    /**
     * 设置 组织id
     *  column：  psy_basic_info.org_id
     *
     * @param orgId the value for psy_basic_info.org_id
     *
     * @mbggenerated
     */
    public void setOrgId(Integer orgId) {
        this.orgId = orgId;
    }

    /**
     * 获取 组织代码
     *  column： psy_basic_info.org_code
     *
     * @return the value of psy_basic_info.org_code
     *
     * @mbggenerated
     */
    public String getOrgCode() {
        return orgCode;
    }

    /**
     * 设置 组织代码
     *  column：  psy_basic_info.org_code
     *
     * @param orgCode the value for psy_basic_info.org_code
     *
     * @mbggenerated
     */
    public void setOrgCode(String orgCode) {
        this.orgCode = orgCode == null ? null : orgCode.trim();
    }

    /**
     * 获取 创建时间
     *  column： psy_basic_info.create_time
     *
     * @return the value of psy_basic_info.create_time
     *
     * @mbggenerated
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 设置 创建时间
     *  column：  psy_basic_info.create_time
     *
     * @param createTime the value for psy_basic_info.create_time
     *
     * @mbggenerated
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * 获取 更新时间
     *  column： psy_basic_info.update_time
     *
     * @return the value of psy_basic_info.update_time
     *
     * @mbggenerated
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * 设置 更新时间
     *  column：  psy_basic_info.update_time
     *
     * @param updateTime the value for psy_basic_info.update_time
     *
     * @mbggenerated
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * 获取 创建人
     *  column： psy_basic_info.create_user
     *
     * @return the value of psy_basic_info.create_user
     *
     * @mbggenerated
     */
    public String getCreateUser() {
        return createUser;
    }

    /**
     * 设置 创建人
     *  column：  psy_basic_info.create_user
     *
     * @param createUser the value for psy_basic_info.create_user
     *
     * @mbggenerated
     */
    public void setCreateUser(String createUser) {
        this.createUser = createUser == null ? null : createUser.trim();
    }

    /**
     * 获取 更新人
     *  column： psy_basic_info.update_user
     *
     * @return the value of psy_basic_info.update_user
     *
     * @mbggenerated
     */
    public String getUpdateUser() {
        return updateUser;
    }

    /**
     * 设置 更新人
     *  column：  psy_basic_info.update_user
     *
     * @param updateUser the value for psy_basic_info.update_user
     *
     * @mbggenerated
     */
    public void setUpdateUser(String updateUser) {
        this.updateUser = updateUser == null ? null : updateUser.trim();
    }

    /**
     * 获取 状态0删除1存在
     *  column： psy_basic_info.status
     *
     * @return the value of psy_basic_info.status
     *
     * @mbggenerated
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * 设置 状态0删除1存在
     *  column：  psy_basic_info.status
     *
     * @param status the value for psy_basic_info.status
     *
     * @mbggenerated
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * 获取 患者名称
     *  column： psy_basic_info.psy_name
     *
     * @return the value of psy_basic_info.psy_name
     *
     * @mbggenerated
     */
    public String getPsyName() {
        return psyName;
    }

    /**
     * 设置 患者名称
     *  column：  psy_basic_info.psy_name
     *
     * @param psyName the value for psy_basic_info.psy_name
     *
     * @mbggenerated
     */
    public void setPsyName(String psyName) {
        this.psyName = psyName == null ? null : psyName.trim();
    }

    /**
     * 获取 患者性别1男2女
     *  column： psy_basic_info.psy_sex
     *
     * @return the value of psy_basic_info.psy_sex
     *
     * @mbggenerated
     */
    public Boolean getPsySex() {
        return psySex;
    }

    /**
     * 设置 患者性别1男2女
     *  column：  psy_basic_info.psy_sex
     *
     * @param psySex the value for psy_basic_info.psy_sex
     *
     * @mbggenerated
     */
    public void setPsySex(Boolean psySex) {
        this.psySex = psySex;
    }

    /**
     * 获取 患者曾用名
     *  column： psy_basic_info.psy_before_name
     *
     * @return the value of psy_basic_info.psy_before_name
     *
     * @mbggenerated
     */
    public String getPsyBeforeName() {
        return psyBeforeName;
    }

    /**
     * 设置 患者曾用名
     *  column：  psy_basic_info.psy_before_name
     *
     * @param psyBeforeName the value for psy_basic_info.psy_before_name
     *
     * @mbggenerated
     */
    public void setPsyBeforeName(String psyBeforeName) {
        this.psyBeforeName = psyBeforeName == null ? null : psyBeforeName.trim();
    }

    /**
     * 获取 患者身份证
     *  column： psy_basic_info.psy_id_card
     *
     * @return the value of psy_basic_info.psy_id_card
     *
     * @mbggenerated
     */
    public Integer getPsyIdCard() {
        return psyIdCard;
    }

    /**
     * 设置 患者身份证
     *  column：  psy_basic_info.psy_id_card
     *
     * @param psyIdCard the value for psy_basic_info.psy_id_card
     *
     * @mbggenerated
     */
    public void setPsyIdCard(Integer psyIdCard) {
        this.psyIdCard = psyIdCard;
    }

    /**
     * 获取 患者生日
     *  column： psy_basic_info.psy_birth
     *
     * @return the value of psy_basic_info.psy_birth
     *
     * @mbggenerated
     */
    public String getPsyBirth() {
        return psyBirth;
    }

    /**
     * 设置 患者生日
     *  column：  psy_basic_info.psy_birth
     *
     * @param psyBirth the value for psy_basic_info.psy_birth
     *
     * @mbggenerated
     */
    public void setPsyBirth(String psyBirth) {
        this.psyBirth = psyBirth == null ? null : psyBirth.trim();
    }

    /**
     * 获取 患者年龄
     *  column： psy_basic_info.psy_age
     *
     * @return the value of psy_basic_info.psy_age
     *
     * @mbggenerated
     */
    public Integer getPsyAge() {
        return psyAge;
    }

    /**
     * 设置 患者年龄
     *  column：  psy_basic_info.psy_age
     *
     * @param psyAge the value for psy_basic_info.psy_age
     *
     * @mbggenerated
     */
    public void setPsyAge(Integer psyAge) {
        this.psyAge = psyAge;
    }

    /**
     * 获取 患者民族
     *  column： psy_basic_info.psy_nation
     *
     * @return the value of psy_basic_info.psy_nation
     *
     * @mbggenerated
     */
    public String getPsyNation() {
        return psyNation;
    }

    /**
     * 设置 患者民族
     *  column：  psy_basic_info.psy_nation
     *
     * @param psyNation the value for psy_basic_info.psy_nation
     *
     * @mbggenerated
     */
    public void setPsyNation(String psyNation) {
        this.psyNation = psyNation == null ? null : psyNation.trim();
    }

    /**
     * 获取 患者籍贯
     *  column： psy_basic_info.psy_native
     *
     * @return the value of psy_basic_info.psy_native
     *
     * @mbggenerated
     */
    public String getPsyNative() {
        return psyNative;
    }

    /**
     * 设置 患者籍贯
     *  column：  psy_basic_info.psy_native
     *
     * @param psyNative the value for psy_basic_info.psy_native
     *
     * @mbggenerated
     */
    public void setPsyNative(String psyNative) {
        this.psyNative = psyNative == null ? null : psyNative.trim();
    }

    /**
     * 获取 患者婚姻状态1已婚0未婚
     *  column： psy_basic_info.psy_marital
     *
     * @return the value of psy_basic_info.psy_marital
     *
     * @mbggenerated
     */
    public Boolean getPsyMarital() {
        return psyMarital;
    }

    /**
     * 设置 患者婚姻状态1已婚0未婚
     *  column：  psy_basic_info.psy_marital
     *
     * @param psyMarital the value for psy_basic_info.psy_marital
     *
     * @mbggenerated
     */
    public void setPsyMarital(Boolean psyMarital) {
        this.psyMarital = psyMarital;
    }

    /**
     * 获取 患者政治面貌
     *  column： psy_basic_info.psy_politic
     *
     * @return the value of psy_basic_info.psy_politic
     *
     * @mbggenerated
     */
    public String getPsyPolitic() {
        return psyPolitic;
    }

    /**
     * 设置 患者政治面貌
     *  column：  psy_basic_info.psy_politic
     *
     * @param psyPolitic the value for psy_basic_info.psy_politic
     *
     * @mbggenerated
     */
    public void setPsyPolitic(String psyPolitic) {
        this.psyPolitic = psyPolitic == null ? null : psyPolitic.trim();
    }

    /**
     * 获取 患者学历
     *  column： psy_basic_info.psy_background
     *
     * @return the value of psy_basic_info.psy_background
     *
     * @mbggenerated
     */
    public String getPsyBackground() {
        return psyBackground;
    }

    /**
     * 设置 患者学历
     *  column：  psy_basic_info.psy_background
     *
     * @param psyBackground the value for psy_basic_info.psy_background
     *
     * @mbggenerated
     */
    public void setPsyBackground(String psyBackground) {
        this.psyBackground = psyBackground == null ? null : psyBackground.trim();
    }

    /**
     * 获取 患者信仰
     *  column： psy_basic_info.psy_faith
     *
     * @return the value of psy_basic_info.psy_faith
     *
     * @mbggenerated
     */
    public String getPsyFaith() {
        return psyFaith;
    }

    /**
     * 设置 患者信仰
     *  column：  psy_basic_info.psy_faith
     *
     * @param psyFaith the value for psy_basic_info.psy_faith
     *
     * @mbggenerated
     */
    public void setPsyFaith(String psyFaith) {
        this.psyFaith = psyFaith == null ? null : psyFaith.trim();
    }

    /**
     * 获取 患者职业
     *  column： psy_basic_info.psy_job
     *
     * @return the value of psy_basic_info.psy_job
     *
     * @mbggenerated
     */
    public String getPsyJob() {
        return psyJob;
    }

    /**
     * 设置 患者职业
     *  column：  psy_basic_info.psy_job
     *
     * @param psyJob the value for psy_basic_info.psy_job
     *
     * @mbggenerated
     */
    public void setPsyJob(String psyJob) {
        this.psyJob = psyJob == null ? null : psyJob.trim();
    }

    /**
     * 获取 患者服务场所
     *  column： psy_basic_info.psy_workspace
     *
     * @return the value of psy_basic_info.psy_workspace
     *
     * @mbggenerated
     */
    public String getPsyWorkspace() {
        return psyWorkspace;
    }

    /**
     * 设置 患者服务场所
     *  column：  psy_basic_info.psy_workspace
     *
     * @param psyWorkspace the value for psy_basic_info.psy_workspace
     *
     * @mbggenerated
     */
    public void setPsyWorkspace(String psyWorkspace) {
        this.psyWorkspace = psyWorkspace == null ? null : psyWorkspace.trim();
    }

    /**
     * 获取 患者联系方式
     *  column： psy_basic_info.psy_phone
     *
     * @return the value of psy_basic_info.psy_phone
     *
     * @mbggenerated
     */
    public String getPsyPhone() {
        return psyPhone;
    }

    /**
     * 设置 患者联系方式
     *  column：  psy_basic_info.psy_phone
     *
     * @param psyPhone the value for psy_basic_info.psy_phone
     *
     * @mbggenerated
     */
    public void setPsyPhone(String psyPhone) {
        this.psyPhone = psyPhone == null ? null : psyPhone.trim();
    }

    /**
     * 获取 患者籍贯地址
     *  column： psy_basic_info.psy_nation_address
     *
     * @return the value of psy_basic_info.psy_nation_address
     *
     * @mbggenerated
     */
    public String getPsyNationAddress() {
        return psyNationAddress;
    }

    /**
     * 设置 患者籍贯地址
     *  column：  psy_basic_info.psy_nation_address
     *
     * @param psyNationAddress the value for psy_basic_info.psy_nation_address
     *
     * @mbggenerated
     */
    public void setPsyNationAddress(String psyNationAddress) {
        this.psyNationAddress = psyNationAddress == null ? null : psyNationAddress.trim();
    }

    /**
     * 获取 患者现居地址
     *  column： psy_basic_info.psy_now_address
     *
     * @return the value of psy_basic_info.psy_now_address
     *
     * @mbggenerated
     */
    public String getPsyNowAddress() {
        return psyNowAddress;
    }

    /**
     * 设置 患者现居地址
     *  column：  psy_basic_info.psy_now_address
     *
     * @param psyNowAddress the value for psy_basic_info.psy_now_address
     *
     * @mbggenerated
     */
    public void setPsyNowAddress(String psyNowAddress) {
        this.psyNowAddress = psyNowAddress == null ? null : psyNowAddress.trim();
    }

    /**
     * 获取 患者家庭经济情况
     *  column： psy_basic_info.psy_family_income
     *
     * @return the value of psy_basic_info.psy_family_income
     *
     * @mbggenerated
     */
    public String getPsyFamilyIncome() {
        return psyFamilyIncome;
    }

    /**
     * 设置 患者家庭经济情况
     *  column：  psy_basic_info.psy_family_income
     *
     * @param psyFamilyIncome the value for psy_basic_info.psy_family_income
     *
     * @mbggenerated
     */
    public void setPsyFamilyIncome(String psyFamilyIncome) {
        this.psyFamilyIncome = psyFamilyIncome == null ? null : psyFamilyIncome.trim();
    }

    /**
     * 获取 患者是否纳入低保户1是0否
     *  column： psy_basic_info.psy_is_minimum
     *
     * @return the value of psy_basic_info.psy_is_minimum
     *
     * @mbggenerated
     */
    public Boolean getPsyIsMinimum() {
        return psyIsMinimum;
    }

    /**
     * 设置 患者是否纳入低保户1是0否
     *  column：  psy_basic_info.psy_is_minimum
     *
     * @param psyIsMinimum the value for psy_basic_info.psy_is_minimum
     *
     * @mbggenerated
     */
    public void setPsyIsMinimum(Boolean psyIsMinimum) {
        this.psyIsMinimum = psyIsMinimum;
    }

    /**
     * 获取 监护人姓名
     *  column： psy_basic_info.psy_guardian_name
     *
     * @return the value of psy_basic_info.psy_guardian_name
     *
     * @mbggenerated
     */
    public String getPsyGuardianName() {
        return psyGuardianName;
    }

    /**
     * 设置 监护人姓名
     *  column：  psy_basic_info.psy_guardian_name
     *
     * @param psyGuardianName the value for psy_basic_info.psy_guardian_name
     *
     * @mbggenerated
     */
    public void setPsyGuardianName(String psyGuardianName) {
        this.psyGuardianName = psyGuardianName == null ? null : psyGuardianName.trim();
    }

    /**
     * 获取 监护人身份证号
     *  column： psy_basic_info.psy_guardian_id
     *
     * @return the value of psy_basic_info.psy_guardian_id
     *
     * @mbggenerated
     */
    public Integer getPsyGuardianId() {
        return psyGuardianId;
    }

    /**
     * 设置 监护人身份证号
     *  column：  psy_basic_info.psy_guardian_id
     *
     * @param psyGuardianId the value for psy_basic_info.psy_guardian_id
     *
     * @mbggenerated
     */
    public void setPsyGuardianId(Integer psyGuardianId) {
        this.psyGuardianId = psyGuardianId;
    }

    /**
     * 获取 与监护人关系
     *  column： psy_basic_info.psy_guardian_relation
     *
     * @return the value of psy_basic_info.psy_guardian_relation
     *
     * @mbggenerated
     */
    public String getPsyGuardianRelation() {
        return psyGuardianRelation;
    }

    /**
     * 设置 与监护人关系
     *  column：  psy_basic_info.psy_guardian_relation
     *
     * @param psyGuardianRelation the value for psy_basic_info.psy_guardian_relation
     *
     * @mbggenerated
     */
    public void setPsyGuardianRelation(String psyGuardianRelation) {
        this.psyGuardianRelation = psyGuardianRelation == null ? null : psyGuardianRelation.trim();
    }

    /**
     * 获取 监护人家庭地址
     *  column： psy_basic_info.psy_guardian_address
     *
     * @return the value of psy_basic_info.psy_guardian_address
     *
     * @mbggenerated
     */
    public String getPsyGuardianAddress() {
        return psyGuardianAddress;
    }

    /**
     * 设置 监护人家庭地址
     *  column：  psy_basic_info.psy_guardian_address
     *
     * @param psyGuardianAddress the value for psy_basic_info.psy_guardian_address
     *
     * @mbggenerated
     */
    public void setPsyGuardianAddress(String psyGuardianAddress) {
        this.psyGuardianAddress = psyGuardianAddress == null ? null : psyGuardianAddress.trim();
    }

    /**
     * 获取 监护人联系方式
     *  column： psy_basic_info.psy_guardian_phone
     *
     * @return the value of psy_basic_info.psy_guardian_phone
     *
     * @mbggenerated
     */
    public String getPsyGuardianPhone() {
        return psyGuardianPhone;
    }

    /**
     * 设置 监护人联系方式
     *  column：  psy_basic_info.psy_guardian_phone
     *
     * @param psyGuardianPhone the value for psy_basic_info.psy_guardian_phone
     *
     * @mbggenerated
     */
    public void setPsyGuardianPhone(String psyGuardianPhone) {
        this.psyGuardianPhone = psyGuardianPhone == null ? null : psyGuardianPhone.trim();
    }

    /**
     * 获取 患者id
     *  column： psy_basic_info.user_id
     *
     * @return the value of psy_basic_info.user_id
     *
     * @mbggenerated
     */
    public Long getUserId() {
        return userId;
    }

    /**
     * 设置 患者id
     *  column：  psy_basic_info.user_id
     *
     * @param userId the value for psy_basic_info.user_id
     *
     * @mbggenerated
     */
    public void setUserId(Long userId) {
        this.userId = userId;
    }

    /**
     * 获取 患者类型
     *  column： psy_basic_info.user_type
     *
     * @return the value of psy_basic_info.user_type
     *
     * @mbggenerated
     */
    public Integer getUserType() {
        return userType;
    }

    /**
     * 设置 患者类型
     *  column：  psy_basic_info.user_type
     *
     * @param userType the value for psy_basic_info.user_type
     *
     * @mbggenerated
     */
    public void setUserType(Integer userType) {
        this.userType = userType;
    }

    /**
     * 获取 其他信息
     *  column： psy_basic_info.psy_other_content
     *
     * @return the value of psy_basic_info.psy_other_content
     *
     * @mbggenerated
     */
    public String getPsyOtherContent() {
        return psyOtherContent;
    }

    /**
     * 设置 其他信息
     *  column：  psy_basic_info.psy_other_content
     *
     * @param psyOtherContent the value for psy_basic_info.psy_other_content
     *
     * @mbggenerated
     */
    public void setPsyOtherContent(String psyOtherContent) {
        this.psyOtherContent = psyOtherContent == null ? null : psyOtherContent.trim();
    }
}