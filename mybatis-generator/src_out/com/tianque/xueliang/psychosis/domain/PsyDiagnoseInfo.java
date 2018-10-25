package com.tianque.xueliang.psychosis.domain;

import java.util.Date;

/**
 *  患者诊断信息
 *   对应表： 
 *    psy_diagnose_info
 *
 * @mbggenerated
 */
public class PsyDiagnoseInfo { 

    /**
     * 主键id
     *  psy_diagnose_info.id
     *
     * @mbggenerated
     */
    private Long id;

    /**
     * 组织id
     *  psy_diagnose_info.org_id
     *
     * @mbggenerated
     */
    private Integer orgId;

    /**
     * 组织代码
     *  psy_diagnose_info.org_code
     *
     * @mbggenerated
     */
    private String orgCode;

    /**
     * 创建时间
     *  psy_diagnose_info.create_time
     *
     * @mbggenerated
     */
    private Date createTime;

    /**
     * 更新时间
     *  psy_diagnose_info.update_time
     *
     * @mbggenerated
     */
    private Date updateTime;

    /**
     * 创建人
     *  psy_diagnose_info.create_user
     *
     * @mbggenerated
     */
    private String createUser;

    /**
     * 更新人
     *  psy_diagnose_info.update_user
     *
     * @mbggenerated
     */
    private String updateUser;

    /**
     * 状态0删除1存在
     *  psy_diagnose_info.status
     *
     * @mbggenerated
     */
    private Integer status;

    /**
     * 躯体情况
     *  psy_diagnose_info.diagnose_body
     *
     * @mbggenerated
     */
    private String diagnoseBody;

    /**
     * 初次发病日期
     *  psy_diagnose_info.diagnose_first
     *
     * @mbggenerated
     */
    private String diagnoseFirst;

    /**
     * 目前诊断类型
     *  psy_diagnose_info.diagnose_type
     *
     * @mbggenerated
     */
    private String diagnoseType;

    /**
     * 有无肇事肇祸史0无1有
     *  psy_diagnose_info.diagnose_is_trouble
     *
     * @mbggenerated
     */
    private Boolean diagnoseIsTrouble;

    /**
     * 肇事肇祸次数
     *  psy_diagnose_info.diagnose_trouble_count
     *
     * @mbggenerated
     */
    private Integer diagnoseTroubleCount;

    /**
     * 上次肇事肇祸日期
     *  psy_diagnose_info.diagnose_trouble_date
     *
     * @mbggenerated
     */
    private String diagnoseTroubleDate;

    /**
     * 危险评估等级
     *  psy_diagnose_info.diagnose_level
     *
     * @mbggenerated
     */
    private String diagnoseLevel;

    /**
     * 治疗情况
     *  psy_diagnose_info.diagnose_treat_status
     *
     * @mbggenerated
     */
    private String diagnoseTreatStatus;

    /**
     * 治疗医院名称
     *  psy_diagnose_info.diagnose_hospital_name
     *
     * @mbggenerated
     */
    private String diagnoseHospitalName;

    /**
     * 住院治疗原因
     *  psy_diagnose_info.diagnose_treat_reason
     *
     * @mbggenerated
     */
    private String diagnoseTreatReason;

    /**
     * 康复训练机构
     *  psy_diagnose_info.diagnose_treat_org
     *
     * @mbggenerated
     */
    private String diagnoseTreatOrg;

    /**
     * 参与管理人员
     *  psy_diagnose_info.diagnose_manager
     *
     * @mbggenerated
     */
    private String diagnoseManager;

    /**
     * 帮扶计划
     *  psy_diagnose_info.diagnose_help
     *
     * @mbggenerated
     */
    private String diagnoseHelp;

    /**
     * 康复措施
     *  psy_diagnose_info.diagnose_measure
     *
     * @mbggenerated
     */
    private String diagnoseMeasure;

    /**
     * 精神症状
     *  psy_diagnose_info.diagnose_symptoms
     *
     * @mbggenerated
     */
    private String diagnoseSymptoms;

    /**
     * 药物不良反应
     *  psy_diagnose_info.diagnose_react
     *
     * @mbggenerated
     */
    private String diagnoseReact;

    /**
     * 服药情况
     *  psy_diagnose_info.diagnose_status
     *
     * @mbggenerated
     */
    private String diagnoseStatus;

    /**
     * 患者id
     *  psy_diagnose_info.user_id
     *
     * @mbggenerated
     */
    private Long userId;

    /**
     * 患者类型
     *  psy_diagnose_info.user_type
     *
     * @mbggenerated
     */
    private Integer userType;

    /**
     * 获取 主键id
     *  column： psy_diagnose_info.id
     *
     * @return the value of psy_diagnose_info.id
     *
     * @mbggenerated
     */
    public Long getId() {
        return id;
    }

    /**
     * 设置 主键id
     *  column：  psy_diagnose_info.id
     *
     * @param id the value for psy_diagnose_info.id
     *
     * @mbggenerated
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 获取 组织id
     *  column： psy_diagnose_info.org_id
     *
     * @return the value of psy_diagnose_info.org_id
     *
     * @mbggenerated
     */
    public Integer getOrgId() {
        return orgId;
    }

    /**
     * 设置 组织id
     *  column：  psy_diagnose_info.org_id
     *
     * @param orgId the value for psy_diagnose_info.org_id
     *
     * @mbggenerated
     */
    public void setOrgId(Integer orgId) {
        this.orgId = orgId;
    }

    /**
     * 获取 组织代码
     *  column： psy_diagnose_info.org_code
     *
     * @return the value of psy_diagnose_info.org_code
     *
     * @mbggenerated
     */
    public String getOrgCode() {
        return orgCode;
    }

    /**
     * 设置 组织代码
     *  column：  psy_diagnose_info.org_code
     *
     * @param orgCode the value for psy_diagnose_info.org_code
     *
     * @mbggenerated
     */
    public void setOrgCode(String orgCode) {
        this.orgCode = orgCode == null ? null : orgCode.trim();
    }

    /**
     * 获取 创建时间
     *  column： psy_diagnose_info.create_time
     *
     * @return the value of psy_diagnose_info.create_time
     *
     * @mbggenerated
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 设置 创建时间
     *  column：  psy_diagnose_info.create_time
     *
     * @param createTime the value for psy_diagnose_info.create_time
     *
     * @mbggenerated
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * 获取 更新时间
     *  column： psy_diagnose_info.update_time
     *
     * @return the value of psy_diagnose_info.update_time
     *
     * @mbggenerated
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * 设置 更新时间
     *  column：  psy_diagnose_info.update_time
     *
     * @param updateTime the value for psy_diagnose_info.update_time
     *
     * @mbggenerated
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * 获取 创建人
     *  column： psy_diagnose_info.create_user
     *
     * @return the value of psy_diagnose_info.create_user
     *
     * @mbggenerated
     */
    public String getCreateUser() {
        return createUser;
    }

    /**
     * 设置 创建人
     *  column：  psy_diagnose_info.create_user
     *
     * @param createUser the value for psy_diagnose_info.create_user
     *
     * @mbggenerated
     */
    public void setCreateUser(String createUser) {
        this.createUser = createUser == null ? null : createUser.trim();
    }

    /**
     * 获取 更新人
     *  column： psy_diagnose_info.update_user
     *
     * @return the value of psy_diagnose_info.update_user
     *
     * @mbggenerated
     */
    public String getUpdateUser() {
        return updateUser;
    }

    /**
     * 设置 更新人
     *  column：  psy_diagnose_info.update_user
     *
     * @param updateUser the value for psy_diagnose_info.update_user
     *
     * @mbggenerated
     */
    public void setUpdateUser(String updateUser) {
        this.updateUser = updateUser == null ? null : updateUser.trim();
    }

    /**
     * 获取 状态0删除1存在
     *  column： psy_diagnose_info.status
     *
     * @return the value of psy_diagnose_info.status
     *
     * @mbggenerated
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * 设置 状态0删除1存在
     *  column：  psy_diagnose_info.status
     *
     * @param status the value for psy_diagnose_info.status
     *
     * @mbggenerated
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * 获取 躯体情况
     *  column： psy_diagnose_info.diagnose_body
     *
     * @return the value of psy_diagnose_info.diagnose_body
     *
     * @mbggenerated
     */
    public String getDiagnoseBody() {
        return diagnoseBody;
    }

    /**
     * 设置 躯体情况
     *  column：  psy_diagnose_info.diagnose_body
     *
     * @param diagnoseBody the value for psy_diagnose_info.diagnose_body
     *
     * @mbggenerated
     */
    public void setDiagnoseBody(String diagnoseBody) {
        this.diagnoseBody = diagnoseBody == null ? null : diagnoseBody.trim();
    }

    /**
     * 获取 初次发病日期
     *  column： psy_diagnose_info.diagnose_first
     *
     * @return the value of psy_diagnose_info.diagnose_first
     *
     * @mbggenerated
     */
    public String getDiagnoseFirst() {
        return diagnoseFirst;
    }

    /**
     * 设置 初次发病日期
     *  column：  psy_diagnose_info.diagnose_first
     *
     * @param diagnoseFirst the value for psy_diagnose_info.diagnose_first
     *
     * @mbggenerated
     */
    public void setDiagnoseFirst(String diagnoseFirst) {
        this.diagnoseFirst = diagnoseFirst == null ? null : diagnoseFirst.trim();
    }

    /**
     * 获取 目前诊断类型
     *  column： psy_diagnose_info.diagnose_type
     *
     * @return the value of psy_diagnose_info.diagnose_type
     *
     * @mbggenerated
     */
    public String getDiagnoseType() {
        return diagnoseType;
    }

    /**
     * 设置 目前诊断类型
     *  column：  psy_diagnose_info.diagnose_type
     *
     * @param diagnoseType the value for psy_diagnose_info.diagnose_type
     *
     * @mbggenerated
     */
    public void setDiagnoseType(String diagnoseType) {
        this.diagnoseType = diagnoseType == null ? null : diagnoseType.trim();
    }

    /**
     * 获取 有无肇事肇祸史0无1有
     *  column： psy_diagnose_info.diagnose_is_trouble
     *
     * @return the value of psy_diagnose_info.diagnose_is_trouble
     *
     * @mbggenerated
     */
    public Boolean getDiagnoseIsTrouble() {
        return diagnoseIsTrouble;
    }

    /**
     * 设置 有无肇事肇祸史0无1有
     *  column：  psy_diagnose_info.diagnose_is_trouble
     *
     * @param diagnoseIsTrouble the value for psy_diagnose_info.diagnose_is_trouble
     *
     * @mbggenerated
     */
    public void setDiagnoseIsTrouble(Boolean diagnoseIsTrouble) {
        this.diagnoseIsTrouble = diagnoseIsTrouble;
    }

    /**
     * 获取 肇事肇祸次数
     *  column： psy_diagnose_info.diagnose_trouble_count
     *
     * @return the value of psy_diagnose_info.diagnose_trouble_count
     *
     * @mbggenerated
     */
    public Integer getDiagnoseTroubleCount() {
        return diagnoseTroubleCount;
    }

    /**
     * 设置 肇事肇祸次数
     *  column：  psy_diagnose_info.diagnose_trouble_count
     *
     * @param diagnoseTroubleCount the value for psy_diagnose_info.diagnose_trouble_count
     *
     * @mbggenerated
     */
    public void setDiagnoseTroubleCount(Integer diagnoseTroubleCount) {
        this.diagnoseTroubleCount = diagnoseTroubleCount;
    }

    /**
     * 获取 上次肇事肇祸日期
     *  column： psy_diagnose_info.diagnose_trouble_date
     *
     * @return the value of psy_diagnose_info.diagnose_trouble_date
     *
     * @mbggenerated
     */
    public String getDiagnoseTroubleDate() {
        return diagnoseTroubleDate;
    }

    /**
     * 设置 上次肇事肇祸日期
     *  column：  psy_diagnose_info.diagnose_trouble_date
     *
     * @param diagnoseTroubleDate the value for psy_diagnose_info.diagnose_trouble_date
     *
     * @mbggenerated
     */
    public void setDiagnoseTroubleDate(String diagnoseTroubleDate) {
        this.diagnoseTroubleDate = diagnoseTroubleDate == null ? null : diagnoseTroubleDate.trim();
    }

    /**
     * 获取 危险评估等级
     *  column： psy_diagnose_info.diagnose_level
     *
     * @return the value of psy_diagnose_info.diagnose_level
     *
     * @mbggenerated
     */
    public String getDiagnoseLevel() {
        return diagnoseLevel;
    }

    /**
     * 设置 危险评估等级
     *  column：  psy_diagnose_info.diagnose_level
     *
     * @param diagnoseLevel the value for psy_diagnose_info.diagnose_level
     *
     * @mbggenerated
     */
    public void setDiagnoseLevel(String diagnoseLevel) {
        this.diagnoseLevel = diagnoseLevel == null ? null : diagnoseLevel.trim();
    }

    /**
     * 获取 治疗情况
     *  column： psy_diagnose_info.diagnose_treat_status
     *
     * @return the value of psy_diagnose_info.diagnose_treat_status
     *
     * @mbggenerated
     */
    public String getDiagnoseTreatStatus() {
        return diagnoseTreatStatus;
    }

    /**
     * 设置 治疗情况
     *  column：  psy_diagnose_info.diagnose_treat_status
     *
     * @param diagnoseTreatStatus the value for psy_diagnose_info.diagnose_treat_status
     *
     * @mbggenerated
     */
    public void setDiagnoseTreatStatus(String diagnoseTreatStatus) {
        this.diagnoseTreatStatus = diagnoseTreatStatus == null ? null : diagnoseTreatStatus.trim();
    }

    /**
     * 获取 治疗医院名称
     *  column： psy_diagnose_info.diagnose_hospital_name
     *
     * @return the value of psy_diagnose_info.diagnose_hospital_name
     *
     * @mbggenerated
     */
    public String getDiagnoseHospitalName() {
        return diagnoseHospitalName;
    }

    /**
     * 设置 治疗医院名称
     *  column：  psy_diagnose_info.diagnose_hospital_name
     *
     * @param diagnoseHospitalName the value for psy_diagnose_info.diagnose_hospital_name
     *
     * @mbggenerated
     */
    public void setDiagnoseHospitalName(String diagnoseHospitalName) {
        this.diagnoseHospitalName = diagnoseHospitalName == null ? null : diagnoseHospitalName.trim();
    }

    /**
     * 获取 住院治疗原因
     *  column： psy_diagnose_info.diagnose_treat_reason
     *
     * @return the value of psy_diagnose_info.diagnose_treat_reason
     *
     * @mbggenerated
     */
    public String getDiagnoseTreatReason() {
        return diagnoseTreatReason;
    }

    /**
     * 设置 住院治疗原因
     *  column：  psy_diagnose_info.diagnose_treat_reason
     *
     * @param diagnoseTreatReason the value for psy_diagnose_info.diagnose_treat_reason
     *
     * @mbggenerated
     */
    public void setDiagnoseTreatReason(String diagnoseTreatReason) {
        this.diagnoseTreatReason = diagnoseTreatReason == null ? null : diagnoseTreatReason.trim();
    }

    /**
     * 获取 康复训练机构
     *  column： psy_diagnose_info.diagnose_treat_org
     *
     * @return the value of psy_diagnose_info.diagnose_treat_org
     *
     * @mbggenerated
     */
    public String getDiagnoseTreatOrg() {
        return diagnoseTreatOrg;
    }

    /**
     * 设置 康复训练机构
     *  column：  psy_diagnose_info.diagnose_treat_org
     *
     * @param diagnoseTreatOrg the value for psy_diagnose_info.diagnose_treat_org
     *
     * @mbggenerated
     */
    public void setDiagnoseTreatOrg(String diagnoseTreatOrg) {
        this.diagnoseTreatOrg = diagnoseTreatOrg == null ? null : diagnoseTreatOrg.trim();
    }

    /**
     * 获取 参与管理人员
     *  column： psy_diagnose_info.diagnose_manager
     *
     * @return the value of psy_diagnose_info.diagnose_manager
     *
     * @mbggenerated
     */
    public String getDiagnoseManager() {
        return diagnoseManager;
    }

    /**
     * 设置 参与管理人员
     *  column：  psy_diagnose_info.diagnose_manager
     *
     * @param diagnoseManager the value for psy_diagnose_info.diagnose_manager
     *
     * @mbggenerated
     */
    public void setDiagnoseManager(String diagnoseManager) {
        this.diagnoseManager = diagnoseManager == null ? null : diagnoseManager.trim();
    }

    /**
     * 获取 帮扶计划
     *  column： psy_diagnose_info.diagnose_help
     *
     * @return the value of psy_diagnose_info.diagnose_help
     *
     * @mbggenerated
     */
    public String getDiagnoseHelp() {
        return diagnoseHelp;
    }

    /**
     * 设置 帮扶计划
     *  column：  psy_diagnose_info.diagnose_help
     *
     * @param diagnoseHelp the value for psy_diagnose_info.diagnose_help
     *
     * @mbggenerated
     */
    public void setDiagnoseHelp(String diagnoseHelp) {
        this.diagnoseHelp = diagnoseHelp == null ? null : diagnoseHelp.trim();
    }

    /**
     * 获取 康复措施
     *  column： psy_diagnose_info.diagnose_measure
     *
     * @return the value of psy_diagnose_info.diagnose_measure
     *
     * @mbggenerated
     */
    public String getDiagnoseMeasure() {
        return diagnoseMeasure;
    }

    /**
     * 设置 康复措施
     *  column：  psy_diagnose_info.diagnose_measure
     *
     * @param diagnoseMeasure the value for psy_diagnose_info.diagnose_measure
     *
     * @mbggenerated
     */
    public void setDiagnoseMeasure(String diagnoseMeasure) {
        this.diagnoseMeasure = diagnoseMeasure == null ? null : diagnoseMeasure.trim();
    }

    /**
     * 获取 精神症状
     *  column： psy_diagnose_info.diagnose_symptoms
     *
     * @return the value of psy_diagnose_info.diagnose_symptoms
     *
     * @mbggenerated
     */
    public String getDiagnoseSymptoms() {
        return diagnoseSymptoms;
    }

    /**
     * 设置 精神症状
     *  column：  psy_diagnose_info.diagnose_symptoms
     *
     * @param diagnoseSymptoms the value for psy_diagnose_info.diagnose_symptoms
     *
     * @mbggenerated
     */
    public void setDiagnoseSymptoms(String diagnoseSymptoms) {
        this.diagnoseSymptoms = diagnoseSymptoms == null ? null : diagnoseSymptoms.trim();
    }

    /**
     * 获取 药物不良反应
     *  column： psy_diagnose_info.diagnose_react
     *
     * @return the value of psy_diagnose_info.diagnose_react
     *
     * @mbggenerated
     */
    public String getDiagnoseReact() {
        return diagnoseReact;
    }

    /**
     * 设置 药物不良反应
     *  column：  psy_diagnose_info.diagnose_react
     *
     * @param diagnoseReact the value for psy_diagnose_info.diagnose_react
     *
     * @mbggenerated
     */
    public void setDiagnoseReact(String diagnoseReact) {
        this.diagnoseReact = diagnoseReact == null ? null : diagnoseReact.trim();
    }

    /**
     * 获取 服药情况
     *  column： psy_diagnose_info.diagnose_status
     *
     * @return the value of psy_diagnose_info.diagnose_status
     *
     * @mbggenerated
     */
    public String getDiagnoseStatus() {
        return diagnoseStatus;
    }

    /**
     * 设置 服药情况
     *  column：  psy_diagnose_info.diagnose_status
     *
     * @param diagnoseStatus the value for psy_diagnose_info.diagnose_status
     *
     * @mbggenerated
     */
    public void setDiagnoseStatus(String diagnoseStatus) {
        this.diagnoseStatus = diagnoseStatus == null ? null : diagnoseStatus.trim();
    }

    /**
     * 获取 患者id
     *  column： psy_diagnose_info.user_id
     *
     * @return the value of psy_diagnose_info.user_id
     *
     * @mbggenerated
     */
    public Long getUserId() {
        return userId;
    }

    /**
     * 设置 患者id
     *  column：  psy_diagnose_info.user_id
     *
     * @param userId the value for psy_diagnose_info.user_id
     *
     * @mbggenerated
     */
    public void setUserId(Long userId) {
        this.userId = userId;
    }

    /**
     * 获取 患者类型
     *  column： psy_diagnose_info.user_type
     *
     * @return the value of psy_diagnose_info.user_type
     *
     * @mbggenerated
     */
    public Integer getUserType() {
        return userType;
    }

    /**
     * 设置 患者类型
     *  column：  psy_diagnose_info.user_type
     *
     * @param userType the value for psy_diagnose_info.user_type
     *
     * @mbggenerated
     */
    public void setUserType(Integer userType) {
        this.userType = userType;
    }
}