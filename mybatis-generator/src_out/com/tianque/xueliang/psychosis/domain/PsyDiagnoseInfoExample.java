package com.tianque.xueliang.psychosis.domain;

import com.yimama.core.query.ABaseDaoFilter;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *  患者诊断信息  mapper 操作过滤器
 *   对应表： 
 *    psy_diagnose_info
 *
 * @mbggenerated
 */
public class PsyDiagnoseInfoExample extends ABaseDaoFilter<PsyDiagnoseInfoExample.Criteria> { 

    /**
     * orderByClause
     * 对应表： 
     *   psy_diagnose_info
     *
     * @mbggenerated
     */
    protected String orderByClause;

    /**
     * distinct
     * 对应表： 
     *   psy_diagnose_info
     *
     * @mbggenerated
     */
    protected boolean distinct;

    /**
     * oredCriteria
     * 对应表： 
     *   psy_diagnose_info
     *
     * @mbggenerated
     */
    protected List<Criteria> oredCriteria;

    /**
     *  对应表:  psy_diagnose_info
     *
     * @mbggenerated
     */
    public PsyDiagnoseInfoExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public Criteria getScalarExistedCriteria() {
        if(oredCriteria!=null && oredCriteria.size()>0){
            	return oredCriteria.get(0);
        }
        return or();
    }

    /**
     *  对应表:  psy_diagnose_info
     *
     * @mbggenerated
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     *  对应表:  psy_diagnose_info
     *
     * @mbggenerated
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     *  对应表:  psy_diagnose_info
     *
     * @mbggenerated
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     *  对应表:  psy_diagnose_info
     *
     * @mbggenerated
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     *  对应表:  psy_diagnose_info
     *
     * @mbggenerated
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     *  对应表:  psy_diagnose_info
     *
     * @mbggenerated
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     *  对应表:  psy_diagnose_info
     *
     * @mbggenerated
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     *  对应表:  psy_diagnose_info
     *
     * @mbggenerated
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     *  对应表:  psy_diagnose_info
     *
     * @mbggenerated
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     *  对应表:  psy_diagnose_info
     *
     * @mbggenerated
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     *  患者诊断信息
     *   对应表： 
     *    psy_diagnose_info
     *
     * @mbggenerated
     */
    protected abstract static class GeneratedCriteria { 

        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Long value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andOrgIdIsNull() {
            addCriterion("org_id is null");
            return (Criteria) this;
        }

        public Criteria andOrgIdIsNotNull() {
            addCriterion("org_id is not null");
            return (Criteria) this;
        }

        public Criteria andOrgIdEqualTo(Integer value) {
            addCriterion("org_id =", value, "orgId");
            return (Criteria) this;
        }

        public Criteria andOrgIdNotEqualTo(Integer value) {
            addCriterion("org_id <>", value, "orgId");
            return (Criteria) this;
        }

        public Criteria andOrgIdGreaterThan(Integer value) {
            addCriterion("org_id >", value, "orgId");
            return (Criteria) this;
        }

        public Criteria andOrgIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("org_id >=", value, "orgId");
            return (Criteria) this;
        }

        public Criteria andOrgIdLessThan(Integer value) {
            addCriterion("org_id <", value, "orgId");
            return (Criteria) this;
        }

        public Criteria andOrgIdLessThanOrEqualTo(Integer value) {
            addCriterion("org_id <=", value, "orgId");
            return (Criteria) this;
        }

        public Criteria andOrgIdIn(List<Integer> values) {
            addCriterion("org_id in", values, "orgId");
            return (Criteria) this;
        }

        public Criteria andOrgIdNotIn(List<Integer> values) {
            addCriterion("org_id not in", values, "orgId");
            return (Criteria) this;
        }

        public Criteria andOrgIdBetween(Integer value1, Integer value2) {
            addCriterion("org_id between", value1, value2, "orgId");
            return (Criteria) this;
        }

        public Criteria andOrgIdNotBetween(Integer value1, Integer value2) {
            addCriterion("org_id not between", value1, value2, "orgId");
            return (Criteria) this;
        }

        public Criteria andOrgCodeIsNull() {
            addCriterion("org_code is null");
            return (Criteria) this;
        }

        public Criteria andOrgCodeIsNotNull() {
            addCriterion("org_code is not null");
            return (Criteria) this;
        }

        public Criteria andOrgCodeEqualTo(String value) {
            addCriterion("org_code =", value, "orgCode");
            return (Criteria) this;
        }

        public Criteria andOrgCodeNotEqualTo(String value) {
            addCriterion("org_code <>", value, "orgCode");
            return (Criteria) this;
        }

        public Criteria andOrgCodeGreaterThan(String value) {
            addCriterion("org_code >", value, "orgCode");
            return (Criteria) this;
        }

        public Criteria andOrgCodeGreaterThanOrEqualTo(String value) {
            addCriterion("org_code >=", value, "orgCode");
            return (Criteria) this;
        }

        public Criteria andOrgCodeLessThan(String value) {
            addCriterion("org_code <", value, "orgCode");
            return (Criteria) this;
        }

        public Criteria andOrgCodeLessThanOrEqualTo(String value) {
            addCriterion("org_code <=", value, "orgCode");
            return (Criteria) this;
        }

        public Criteria andOrgCodeLike(String value) {
            addCriterion("org_code like", value, "orgCode");
            return (Criteria) this;
        }

        public Criteria andOrgCodeNotLike(String value) {
            addCriterion("org_code not like", value, "orgCode");
            return (Criteria) this;
        }

        public Criteria andOrgCodeIn(List<String> values) {
            addCriterion("org_code in", values, "orgCode");
            return (Criteria) this;
        }

        public Criteria andOrgCodeNotIn(List<String> values) {
            addCriterion("org_code not in", values, "orgCode");
            return (Criteria) this;
        }

        public Criteria andOrgCodeBetween(String value1, String value2) {
            addCriterion("org_code between", value1, value2, "orgCode");
            return (Criteria) this;
        }

        public Criteria andOrgCodeNotBetween(String value1, String value2) {
            addCriterion("org_code not between", value1, value2, "orgCode");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNull() {
            addCriterion("update_time is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("update_time is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(Date value) {
            addCriterion("update_time =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(Date value) {
            addCriterion("update_time <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(Date value) {
            addCriterion("update_time >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("update_time >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(Date value) {
            addCriterion("update_time <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("update_time <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<Date> values) {
            addCriterion("update_time in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<Date> values) {
            addCriterion("update_time not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("update_time between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("update_time not between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andCreateUserIsNull() {
            addCriterion("create_user is null");
            return (Criteria) this;
        }

        public Criteria andCreateUserIsNotNull() {
            addCriterion("create_user is not null");
            return (Criteria) this;
        }

        public Criteria andCreateUserEqualTo(String value) {
            addCriterion("create_user =", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserNotEqualTo(String value) {
            addCriterion("create_user <>", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserGreaterThan(String value) {
            addCriterion("create_user >", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserGreaterThanOrEqualTo(String value) {
            addCriterion("create_user >=", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserLessThan(String value) {
            addCriterion("create_user <", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserLessThanOrEqualTo(String value) {
            addCriterion("create_user <=", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserLike(String value) {
            addCriterion("create_user like", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserNotLike(String value) {
            addCriterion("create_user not like", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserIn(List<String> values) {
            addCriterion("create_user in", values, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserNotIn(List<String> values) {
            addCriterion("create_user not in", values, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserBetween(String value1, String value2) {
            addCriterion("create_user between", value1, value2, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserNotBetween(String value1, String value2) {
            addCriterion("create_user not between", value1, value2, "createUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserIsNull() {
            addCriterion("update_user is null");
            return (Criteria) this;
        }

        public Criteria andUpdateUserIsNotNull() {
            addCriterion("update_user is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateUserEqualTo(String value) {
            addCriterion("update_user =", value, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserNotEqualTo(String value) {
            addCriterion("update_user <>", value, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserGreaterThan(String value) {
            addCriterion("update_user >", value, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserGreaterThanOrEqualTo(String value) {
            addCriterion("update_user >=", value, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserLessThan(String value) {
            addCriterion("update_user <", value, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserLessThanOrEqualTo(String value) {
            addCriterion("update_user <=", value, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserLike(String value) {
            addCriterion("update_user like", value, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserNotLike(String value) {
            addCriterion("update_user not like", value, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserIn(List<String> values) {
            addCriterion("update_user in", values, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserNotIn(List<String> values) {
            addCriterion("update_user not in", values, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserBetween(String value1, String value2) {
            addCriterion("update_user between", value1, value2, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserNotBetween(String value1, String value2) {
            addCriterion("update_user not between", value1, value2, "updateUser");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("status is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("status is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(Integer value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(Integer value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(Integer value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(Integer value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(Integer value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<Integer> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<Integer> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(Integer value1, Integer value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("status not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andDiagnoseBodyIsNull() {
            addCriterion("diagnose_body is null");
            return (Criteria) this;
        }

        public Criteria andDiagnoseBodyIsNotNull() {
            addCriterion("diagnose_body is not null");
            return (Criteria) this;
        }

        public Criteria andDiagnoseBodyEqualTo(String value) {
            addCriterion("diagnose_body =", value, "diagnoseBody");
            return (Criteria) this;
        }

        public Criteria andDiagnoseBodyNotEqualTo(String value) {
            addCriterion("diagnose_body <>", value, "diagnoseBody");
            return (Criteria) this;
        }

        public Criteria andDiagnoseBodyGreaterThan(String value) {
            addCriterion("diagnose_body >", value, "diagnoseBody");
            return (Criteria) this;
        }

        public Criteria andDiagnoseBodyGreaterThanOrEqualTo(String value) {
            addCriterion("diagnose_body >=", value, "diagnoseBody");
            return (Criteria) this;
        }

        public Criteria andDiagnoseBodyLessThan(String value) {
            addCriterion("diagnose_body <", value, "diagnoseBody");
            return (Criteria) this;
        }

        public Criteria andDiagnoseBodyLessThanOrEqualTo(String value) {
            addCriterion("diagnose_body <=", value, "diagnoseBody");
            return (Criteria) this;
        }

        public Criteria andDiagnoseBodyLike(String value) {
            addCriterion("diagnose_body like", value, "diagnoseBody");
            return (Criteria) this;
        }

        public Criteria andDiagnoseBodyNotLike(String value) {
            addCriterion("diagnose_body not like", value, "diagnoseBody");
            return (Criteria) this;
        }

        public Criteria andDiagnoseBodyIn(List<String> values) {
            addCriterion("diagnose_body in", values, "diagnoseBody");
            return (Criteria) this;
        }

        public Criteria andDiagnoseBodyNotIn(List<String> values) {
            addCriterion("diagnose_body not in", values, "diagnoseBody");
            return (Criteria) this;
        }

        public Criteria andDiagnoseBodyBetween(String value1, String value2) {
            addCriterion("diagnose_body between", value1, value2, "diagnoseBody");
            return (Criteria) this;
        }

        public Criteria andDiagnoseBodyNotBetween(String value1, String value2) {
            addCriterion("diagnose_body not between", value1, value2, "diagnoseBody");
            return (Criteria) this;
        }

        public Criteria andDiagnoseFirstIsNull() {
            addCriterion("diagnose_first is null");
            return (Criteria) this;
        }

        public Criteria andDiagnoseFirstIsNotNull() {
            addCriterion("diagnose_first is not null");
            return (Criteria) this;
        }

        public Criteria andDiagnoseFirstEqualTo(String value) {
            addCriterion("diagnose_first =", value, "diagnoseFirst");
            return (Criteria) this;
        }

        public Criteria andDiagnoseFirstNotEqualTo(String value) {
            addCriterion("diagnose_first <>", value, "diagnoseFirst");
            return (Criteria) this;
        }

        public Criteria andDiagnoseFirstGreaterThan(String value) {
            addCriterion("diagnose_first >", value, "diagnoseFirst");
            return (Criteria) this;
        }

        public Criteria andDiagnoseFirstGreaterThanOrEqualTo(String value) {
            addCriterion("diagnose_first >=", value, "diagnoseFirst");
            return (Criteria) this;
        }

        public Criteria andDiagnoseFirstLessThan(String value) {
            addCriterion("diagnose_first <", value, "diagnoseFirst");
            return (Criteria) this;
        }

        public Criteria andDiagnoseFirstLessThanOrEqualTo(String value) {
            addCriterion("diagnose_first <=", value, "diagnoseFirst");
            return (Criteria) this;
        }

        public Criteria andDiagnoseFirstLike(String value) {
            addCriterion("diagnose_first like", value, "diagnoseFirst");
            return (Criteria) this;
        }

        public Criteria andDiagnoseFirstNotLike(String value) {
            addCriterion("diagnose_first not like", value, "diagnoseFirst");
            return (Criteria) this;
        }

        public Criteria andDiagnoseFirstIn(List<String> values) {
            addCriterion("diagnose_first in", values, "diagnoseFirst");
            return (Criteria) this;
        }

        public Criteria andDiagnoseFirstNotIn(List<String> values) {
            addCriterion("diagnose_first not in", values, "diagnoseFirst");
            return (Criteria) this;
        }

        public Criteria andDiagnoseFirstBetween(String value1, String value2) {
            addCriterion("diagnose_first between", value1, value2, "diagnoseFirst");
            return (Criteria) this;
        }

        public Criteria andDiagnoseFirstNotBetween(String value1, String value2) {
            addCriterion("diagnose_first not between", value1, value2, "diagnoseFirst");
            return (Criteria) this;
        }

        public Criteria andDiagnoseTypeIsNull() {
            addCriterion("diagnose_type is null");
            return (Criteria) this;
        }

        public Criteria andDiagnoseTypeIsNotNull() {
            addCriterion("diagnose_type is not null");
            return (Criteria) this;
        }

        public Criteria andDiagnoseTypeEqualTo(String value) {
            addCriterion("diagnose_type =", value, "diagnoseType");
            return (Criteria) this;
        }

        public Criteria andDiagnoseTypeNotEqualTo(String value) {
            addCriterion("diagnose_type <>", value, "diagnoseType");
            return (Criteria) this;
        }

        public Criteria andDiagnoseTypeGreaterThan(String value) {
            addCriterion("diagnose_type >", value, "diagnoseType");
            return (Criteria) this;
        }

        public Criteria andDiagnoseTypeGreaterThanOrEqualTo(String value) {
            addCriterion("diagnose_type >=", value, "diagnoseType");
            return (Criteria) this;
        }

        public Criteria andDiagnoseTypeLessThan(String value) {
            addCriterion("diagnose_type <", value, "diagnoseType");
            return (Criteria) this;
        }

        public Criteria andDiagnoseTypeLessThanOrEqualTo(String value) {
            addCriterion("diagnose_type <=", value, "diagnoseType");
            return (Criteria) this;
        }

        public Criteria andDiagnoseTypeLike(String value) {
            addCriterion("diagnose_type like", value, "diagnoseType");
            return (Criteria) this;
        }

        public Criteria andDiagnoseTypeNotLike(String value) {
            addCriterion("diagnose_type not like", value, "diagnoseType");
            return (Criteria) this;
        }

        public Criteria andDiagnoseTypeIn(List<String> values) {
            addCriterion("diagnose_type in", values, "diagnoseType");
            return (Criteria) this;
        }

        public Criteria andDiagnoseTypeNotIn(List<String> values) {
            addCriterion("diagnose_type not in", values, "diagnoseType");
            return (Criteria) this;
        }

        public Criteria andDiagnoseTypeBetween(String value1, String value2) {
            addCriterion("diagnose_type between", value1, value2, "diagnoseType");
            return (Criteria) this;
        }

        public Criteria andDiagnoseTypeNotBetween(String value1, String value2) {
            addCriterion("diagnose_type not between", value1, value2, "diagnoseType");
            return (Criteria) this;
        }

        public Criteria andDiagnoseIsTroubleIsNull() {
            addCriterion("diagnose_is_trouble is null");
            return (Criteria) this;
        }

        public Criteria andDiagnoseIsTroubleIsNotNull() {
            addCriterion("diagnose_is_trouble is not null");
            return (Criteria) this;
        }

        public Criteria andDiagnoseIsTroubleEqualTo(Boolean value) {
            addCriterion("diagnose_is_trouble =", value, "diagnoseIsTrouble");
            return (Criteria) this;
        }

        public Criteria andDiagnoseIsTroubleNotEqualTo(Boolean value) {
            addCriterion("diagnose_is_trouble <>", value, "diagnoseIsTrouble");
            return (Criteria) this;
        }

        public Criteria andDiagnoseIsTroubleGreaterThan(Boolean value) {
            addCriterion("diagnose_is_trouble >", value, "diagnoseIsTrouble");
            return (Criteria) this;
        }

        public Criteria andDiagnoseIsTroubleGreaterThanOrEqualTo(Boolean value) {
            addCriterion("diagnose_is_trouble >=", value, "diagnoseIsTrouble");
            return (Criteria) this;
        }

        public Criteria andDiagnoseIsTroubleLessThan(Boolean value) {
            addCriterion("diagnose_is_trouble <", value, "diagnoseIsTrouble");
            return (Criteria) this;
        }

        public Criteria andDiagnoseIsTroubleLessThanOrEqualTo(Boolean value) {
            addCriterion("diagnose_is_trouble <=", value, "diagnoseIsTrouble");
            return (Criteria) this;
        }

        public Criteria andDiagnoseIsTroubleIn(List<Boolean> values) {
            addCriterion("diagnose_is_trouble in", values, "diagnoseIsTrouble");
            return (Criteria) this;
        }

        public Criteria andDiagnoseIsTroubleNotIn(List<Boolean> values) {
            addCriterion("diagnose_is_trouble not in", values, "diagnoseIsTrouble");
            return (Criteria) this;
        }

        public Criteria andDiagnoseIsTroubleBetween(Boolean value1, Boolean value2) {
            addCriterion("diagnose_is_trouble between", value1, value2, "diagnoseIsTrouble");
            return (Criteria) this;
        }

        public Criteria andDiagnoseIsTroubleNotBetween(Boolean value1, Boolean value2) {
            addCriterion("diagnose_is_trouble not between", value1, value2, "diagnoseIsTrouble");
            return (Criteria) this;
        }

        public Criteria andDiagnoseTroubleCountIsNull() {
            addCriterion("diagnose_trouble_count is null");
            return (Criteria) this;
        }

        public Criteria andDiagnoseTroubleCountIsNotNull() {
            addCriterion("diagnose_trouble_count is not null");
            return (Criteria) this;
        }

        public Criteria andDiagnoseTroubleCountEqualTo(Integer value) {
            addCriterion("diagnose_trouble_count =", value, "diagnoseTroubleCount");
            return (Criteria) this;
        }

        public Criteria andDiagnoseTroubleCountNotEqualTo(Integer value) {
            addCriterion("diagnose_trouble_count <>", value, "diagnoseTroubleCount");
            return (Criteria) this;
        }

        public Criteria andDiagnoseTroubleCountGreaterThan(Integer value) {
            addCriterion("diagnose_trouble_count >", value, "diagnoseTroubleCount");
            return (Criteria) this;
        }

        public Criteria andDiagnoseTroubleCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("diagnose_trouble_count >=", value, "diagnoseTroubleCount");
            return (Criteria) this;
        }

        public Criteria andDiagnoseTroubleCountLessThan(Integer value) {
            addCriterion("diagnose_trouble_count <", value, "diagnoseTroubleCount");
            return (Criteria) this;
        }

        public Criteria andDiagnoseTroubleCountLessThanOrEqualTo(Integer value) {
            addCriterion("diagnose_trouble_count <=", value, "diagnoseTroubleCount");
            return (Criteria) this;
        }

        public Criteria andDiagnoseTroubleCountIn(List<Integer> values) {
            addCriterion("diagnose_trouble_count in", values, "diagnoseTroubleCount");
            return (Criteria) this;
        }

        public Criteria andDiagnoseTroubleCountNotIn(List<Integer> values) {
            addCriterion("diagnose_trouble_count not in", values, "diagnoseTroubleCount");
            return (Criteria) this;
        }

        public Criteria andDiagnoseTroubleCountBetween(Integer value1, Integer value2) {
            addCriterion("diagnose_trouble_count between", value1, value2, "diagnoseTroubleCount");
            return (Criteria) this;
        }

        public Criteria andDiagnoseTroubleCountNotBetween(Integer value1, Integer value2) {
            addCriterion("diagnose_trouble_count not between", value1, value2, "diagnoseTroubleCount");
            return (Criteria) this;
        }

        public Criteria andDiagnoseTroubleDateIsNull() {
            addCriterion("diagnose_trouble_date is null");
            return (Criteria) this;
        }

        public Criteria andDiagnoseTroubleDateIsNotNull() {
            addCriterion("diagnose_trouble_date is not null");
            return (Criteria) this;
        }

        public Criteria andDiagnoseTroubleDateEqualTo(String value) {
            addCriterion("diagnose_trouble_date =", value, "diagnoseTroubleDate");
            return (Criteria) this;
        }

        public Criteria andDiagnoseTroubleDateNotEqualTo(String value) {
            addCriterion("diagnose_trouble_date <>", value, "diagnoseTroubleDate");
            return (Criteria) this;
        }

        public Criteria andDiagnoseTroubleDateGreaterThan(String value) {
            addCriterion("diagnose_trouble_date >", value, "diagnoseTroubleDate");
            return (Criteria) this;
        }

        public Criteria andDiagnoseTroubleDateGreaterThanOrEqualTo(String value) {
            addCriterion("diagnose_trouble_date >=", value, "diagnoseTroubleDate");
            return (Criteria) this;
        }

        public Criteria andDiagnoseTroubleDateLessThan(String value) {
            addCriterion("diagnose_trouble_date <", value, "diagnoseTroubleDate");
            return (Criteria) this;
        }

        public Criteria andDiagnoseTroubleDateLessThanOrEqualTo(String value) {
            addCriterion("diagnose_trouble_date <=", value, "diagnoseTroubleDate");
            return (Criteria) this;
        }

        public Criteria andDiagnoseTroubleDateLike(String value) {
            addCriterion("diagnose_trouble_date like", value, "diagnoseTroubleDate");
            return (Criteria) this;
        }

        public Criteria andDiagnoseTroubleDateNotLike(String value) {
            addCriterion("diagnose_trouble_date not like", value, "diagnoseTroubleDate");
            return (Criteria) this;
        }

        public Criteria andDiagnoseTroubleDateIn(List<String> values) {
            addCriterion("diagnose_trouble_date in", values, "diagnoseTroubleDate");
            return (Criteria) this;
        }

        public Criteria andDiagnoseTroubleDateNotIn(List<String> values) {
            addCriterion("diagnose_trouble_date not in", values, "diagnoseTroubleDate");
            return (Criteria) this;
        }

        public Criteria andDiagnoseTroubleDateBetween(String value1, String value2) {
            addCriterion("diagnose_trouble_date between", value1, value2, "diagnoseTroubleDate");
            return (Criteria) this;
        }

        public Criteria andDiagnoseTroubleDateNotBetween(String value1, String value2) {
            addCriterion("diagnose_trouble_date not between", value1, value2, "diagnoseTroubleDate");
            return (Criteria) this;
        }

        public Criteria andDiagnoseLevelIsNull() {
            addCriterion("diagnose_level is null");
            return (Criteria) this;
        }

        public Criteria andDiagnoseLevelIsNotNull() {
            addCriterion("diagnose_level is not null");
            return (Criteria) this;
        }

        public Criteria andDiagnoseLevelEqualTo(String value) {
            addCriterion("diagnose_level =", value, "diagnoseLevel");
            return (Criteria) this;
        }

        public Criteria andDiagnoseLevelNotEqualTo(String value) {
            addCriterion("diagnose_level <>", value, "diagnoseLevel");
            return (Criteria) this;
        }

        public Criteria andDiagnoseLevelGreaterThan(String value) {
            addCriterion("diagnose_level >", value, "diagnoseLevel");
            return (Criteria) this;
        }

        public Criteria andDiagnoseLevelGreaterThanOrEqualTo(String value) {
            addCriterion("diagnose_level >=", value, "diagnoseLevel");
            return (Criteria) this;
        }

        public Criteria andDiagnoseLevelLessThan(String value) {
            addCriterion("diagnose_level <", value, "diagnoseLevel");
            return (Criteria) this;
        }

        public Criteria andDiagnoseLevelLessThanOrEqualTo(String value) {
            addCriterion("diagnose_level <=", value, "diagnoseLevel");
            return (Criteria) this;
        }

        public Criteria andDiagnoseLevelLike(String value) {
            addCriterion("diagnose_level like", value, "diagnoseLevel");
            return (Criteria) this;
        }

        public Criteria andDiagnoseLevelNotLike(String value) {
            addCriterion("diagnose_level not like", value, "diagnoseLevel");
            return (Criteria) this;
        }

        public Criteria andDiagnoseLevelIn(List<String> values) {
            addCriterion("diagnose_level in", values, "diagnoseLevel");
            return (Criteria) this;
        }

        public Criteria andDiagnoseLevelNotIn(List<String> values) {
            addCriterion("diagnose_level not in", values, "diagnoseLevel");
            return (Criteria) this;
        }

        public Criteria andDiagnoseLevelBetween(String value1, String value2) {
            addCriterion("diagnose_level between", value1, value2, "diagnoseLevel");
            return (Criteria) this;
        }

        public Criteria andDiagnoseLevelNotBetween(String value1, String value2) {
            addCriterion("diagnose_level not between", value1, value2, "diagnoseLevel");
            return (Criteria) this;
        }

        public Criteria andDiagnoseTreatStatusIsNull() {
            addCriterion("diagnose_treat_status is null");
            return (Criteria) this;
        }

        public Criteria andDiagnoseTreatStatusIsNotNull() {
            addCriterion("diagnose_treat_status is not null");
            return (Criteria) this;
        }

        public Criteria andDiagnoseTreatStatusEqualTo(String value) {
            addCriterion("diagnose_treat_status =", value, "diagnoseTreatStatus");
            return (Criteria) this;
        }

        public Criteria andDiagnoseTreatStatusNotEqualTo(String value) {
            addCriterion("diagnose_treat_status <>", value, "diagnoseTreatStatus");
            return (Criteria) this;
        }

        public Criteria andDiagnoseTreatStatusGreaterThan(String value) {
            addCriterion("diagnose_treat_status >", value, "diagnoseTreatStatus");
            return (Criteria) this;
        }

        public Criteria andDiagnoseTreatStatusGreaterThanOrEqualTo(String value) {
            addCriterion("diagnose_treat_status >=", value, "diagnoseTreatStatus");
            return (Criteria) this;
        }

        public Criteria andDiagnoseTreatStatusLessThan(String value) {
            addCriterion("diagnose_treat_status <", value, "diagnoseTreatStatus");
            return (Criteria) this;
        }

        public Criteria andDiagnoseTreatStatusLessThanOrEqualTo(String value) {
            addCriterion("diagnose_treat_status <=", value, "diagnoseTreatStatus");
            return (Criteria) this;
        }

        public Criteria andDiagnoseTreatStatusLike(String value) {
            addCriterion("diagnose_treat_status like", value, "diagnoseTreatStatus");
            return (Criteria) this;
        }

        public Criteria andDiagnoseTreatStatusNotLike(String value) {
            addCriterion("diagnose_treat_status not like", value, "diagnoseTreatStatus");
            return (Criteria) this;
        }

        public Criteria andDiagnoseTreatStatusIn(List<String> values) {
            addCriterion("diagnose_treat_status in", values, "diagnoseTreatStatus");
            return (Criteria) this;
        }

        public Criteria andDiagnoseTreatStatusNotIn(List<String> values) {
            addCriterion("diagnose_treat_status not in", values, "diagnoseTreatStatus");
            return (Criteria) this;
        }

        public Criteria andDiagnoseTreatStatusBetween(String value1, String value2) {
            addCriterion("diagnose_treat_status between", value1, value2, "diagnoseTreatStatus");
            return (Criteria) this;
        }

        public Criteria andDiagnoseTreatStatusNotBetween(String value1, String value2) {
            addCriterion("diagnose_treat_status not between", value1, value2, "diagnoseTreatStatus");
            return (Criteria) this;
        }

        public Criteria andDiagnoseHospitalNameIsNull() {
            addCriterion("diagnose_hospital_name is null");
            return (Criteria) this;
        }

        public Criteria andDiagnoseHospitalNameIsNotNull() {
            addCriterion("diagnose_hospital_name is not null");
            return (Criteria) this;
        }

        public Criteria andDiagnoseHospitalNameEqualTo(String value) {
            addCriterion("diagnose_hospital_name =", value, "diagnoseHospitalName");
            return (Criteria) this;
        }

        public Criteria andDiagnoseHospitalNameNotEqualTo(String value) {
            addCriterion("diagnose_hospital_name <>", value, "diagnoseHospitalName");
            return (Criteria) this;
        }

        public Criteria andDiagnoseHospitalNameGreaterThan(String value) {
            addCriterion("diagnose_hospital_name >", value, "diagnoseHospitalName");
            return (Criteria) this;
        }

        public Criteria andDiagnoseHospitalNameGreaterThanOrEqualTo(String value) {
            addCriterion("diagnose_hospital_name >=", value, "diagnoseHospitalName");
            return (Criteria) this;
        }

        public Criteria andDiagnoseHospitalNameLessThan(String value) {
            addCriterion("diagnose_hospital_name <", value, "diagnoseHospitalName");
            return (Criteria) this;
        }

        public Criteria andDiagnoseHospitalNameLessThanOrEqualTo(String value) {
            addCriterion("diagnose_hospital_name <=", value, "diagnoseHospitalName");
            return (Criteria) this;
        }

        public Criteria andDiagnoseHospitalNameLike(String value) {
            addCriterion("diagnose_hospital_name like", value, "diagnoseHospitalName");
            return (Criteria) this;
        }

        public Criteria andDiagnoseHospitalNameNotLike(String value) {
            addCriterion("diagnose_hospital_name not like", value, "diagnoseHospitalName");
            return (Criteria) this;
        }

        public Criteria andDiagnoseHospitalNameIn(List<String> values) {
            addCriterion("diagnose_hospital_name in", values, "diagnoseHospitalName");
            return (Criteria) this;
        }

        public Criteria andDiagnoseHospitalNameNotIn(List<String> values) {
            addCriterion("diagnose_hospital_name not in", values, "diagnoseHospitalName");
            return (Criteria) this;
        }

        public Criteria andDiagnoseHospitalNameBetween(String value1, String value2) {
            addCriterion("diagnose_hospital_name between", value1, value2, "diagnoseHospitalName");
            return (Criteria) this;
        }

        public Criteria andDiagnoseHospitalNameNotBetween(String value1, String value2) {
            addCriterion("diagnose_hospital_name not between", value1, value2, "diagnoseHospitalName");
            return (Criteria) this;
        }

        public Criteria andDiagnoseTreatReasonIsNull() {
            addCriterion("diagnose_treat_reason is null");
            return (Criteria) this;
        }

        public Criteria andDiagnoseTreatReasonIsNotNull() {
            addCriterion("diagnose_treat_reason is not null");
            return (Criteria) this;
        }

        public Criteria andDiagnoseTreatReasonEqualTo(String value) {
            addCriterion("diagnose_treat_reason =", value, "diagnoseTreatReason");
            return (Criteria) this;
        }

        public Criteria andDiagnoseTreatReasonNotEqualTo(String value) {
            addCriterion("diagnose_treat_reason <>", value, "diagnoseTreatReason");
            return (Criteria) this;
        }

        public Criteria andDiagnoseTreatReasonGreaterThan(String value) {
            addCriterion("diagnose_treat_reason >", value, "diagnoseTreatReason");
            return (Criteria) this;
        }

        public Criteria andDiagnoseTreatReasonGreaterThanOrEqualTo(String value) {
            addCriterion("diagnose_treat_reason >=", value, "diagnoseTreatReason");
            return (Criteria) this;
        }

        public Criteria andDiagnoseTreatReasonLessThan(String value) {
            addCriterion("diagnose_treat_reason <", value, "diagnoseTreatReason");
            return (Criteria) this;
        }

        public Criteria andDiagnoseTreatReasonLessThanOrEqualTo(String value) {
            addCriterion("diagnose_treat_reason <=", value, "diagnoseTreatReason");
            return (Criteria) this;
        }

        public Criteria andDiagnoseTreatReasonLike(String value) {
            addCriterion("diagnose_treat_reason like", value, "diagnoseTreatReason");
            return (Criteria) this;
        }

        public Criteria andDiagnoseTreatReasonNotLike(String value) {
            addCriterion("diagnose_treat_reason not like", value, "diagnoseTreatReason");
            return (Criteria) this;
        }

        public Criteria andDiagnoseTreatReasonIn(List<String> values) {
            addCriterion("diagnose_treat_reason in", values, "diagnoseTreatReason");
            return (Criteria) this;
        }

        public Criteria andDiagnoseTreatReasonNotIn(List<String> values) {
            addCriterion("diagnose_treat_reason not in", values, "diagnoseTreatReason");
            return (Criteria) this;
        }

        public Criteria andDiagnoseTreatReasonBetween(String value1, String value2) {
            addCriterion("diagnose_treat_reason between", value1, value2, "diagnoseTreatReason");
            return (Criteria) this;
        }

        public Criteria andDiagnoseTreatReasonNotBetween(String value1, String value2) {
            addCriterion("diagnose_treat_reason not between", value1, value2, "diagnoseTreatReason");
            return (Criteria) this;
        }

        public Criteria andDiagnoseTreatOrgIsNull() {
            addCriterion("diagnose_treat_org is null");
            return (Criteria) this;
        }

        public Criteria andDiagnoseTreatOrgIsNotNull() {
            addCriterion("diagnose_treat_org is not null");
            return (Criteria) this;
        }

        public Criteria andDiagnoseTreatOrgEqualTo(String value) {
            addCriterion("diagnose_treat_org =", value, "diagnoseTreatOrg");
            return (Criteria) this;
        }

        public Criteria andDiagnoseTreatOrgNotEqualTo(String value) {
            addCriterion("diagnose_treat_org <>", value, "diagnoseTreatOrg");
            return (Criteria) this;
        }

        public Criteria andDiagnoseTreatOrgGreaterThan(String value) {
            addCriterion("diagnose_treat_org >", value, "diagnoseTreatOrg");
            return (Criteria) this;
        }

        public Criteria andDiagnoseTreatOrgGreaterThanOrEqualTo(String value) {
            addCriterion("diagnose_treat_org >=", value, "diagnoseTreatOrg");
            return (Criteria) this;
        }

        public Criteria andDiagnoseTreatOrgLessThan(String value) {
            addCriterion("diagnose_treat_org <", value, "diagnoseTreatOrg");
            return (Criteria) this;
        }

        public Criteria andDiagnoseTreatOrgLessThanOrEqualTo(String value) {
            addCriterion("diagnose_treat_org <=", value, "diagnoseTreatOrg");
            return (Criteria) this;
        }

        public Criteria andDiagnoseTreatOrgLike(String value) {
            addCriterion("diagnose_treat_org like", value, "diagnoseTreatOrg");
            return (Criteria) this;
        }

        public Criteria andDiagnoseTreatOrgNotLike(String value) {
            addCriterion("diagnose_treat_org not like", value, "diagnoseTreatOrg");
            return (Criteria) this;
        }

        public Criteria andDiagnoseTreatOrgIn(List<String> values) {
            addCriterion("diagnose_treat_org in", values, "diagnoseTreatOrg");
            return (Criteria) this;
        }

        public Criteria andDiagnoseTreatOrgNotIn(List<String> values) {
            addCriterion("diagnose_treat_org not in", values, "diagnoseTreatOrg");
            return (Criteria) this;
        }

        public Criteria andDiagnoseTreatOrgBetween(String value1, String value2) {
            addCriterion("diagnose_treat_org between", value1, value2, "diagnoseTreatOrg");
            return (Criteria) this;
        }

        public Criteria andDiagnoseTreatOrgNotBetween(String value1, String value2) {
            addCriterion("diagnose_treat_org not between", value1, value2, "diagnoseTreatOrg");
            return (Criteria) this;
        }

        public Criteria andDiagnoseManagerIsNull() {
            addCriterion("diagnose_manager is null");
            return (Criteria) this;
        }

        public Criteria andDiagnoseManagerIsNotNull() {
            addCriterion("diagnose_manager is not null");
            return (Criteria) this;
        }

        public Criteria andDiagnoseManagerEqualTo(String value) {
            addCriterion("diagnose_manager =", value, "diagnoseManager");
            return (Criteria) this;
        }

        public Criteria andDiagnoseManagerNotEqualTo(String value) {
            addCriterion("diagnose_manager <>", value, "diagnoseManager");
            return (Criteria) this;
        }

        public Criteria andDiagnoseManagerGreaterThan(String value) {
            addCriterion("diagnose_manager >", value, "diagnoseManager");
            return (Criteria) this;
        }

        public Criteria andDiagnoseManagerGreaterThanOrEqualTo(String value) {
            addCriterion("diagnose_manager >=", value, "diagnoseManager");
            return (Criteria) this;
        }

        public Criteria andDiagnoseManagerLessThan(String value) {
            addCriterion("diagnose_manager <", value, "diagnoseManager");
            return (Criteria) this;
        }

        public Criteria andDiagnoseManagerLessThanOrEqualTo(String value) {
            addCriterion("diagnose_manager <=", value, "diagnoseManager");
            return (Criteria) this;
        }

        public Criteria andDiagnoseManagerLike(String value) {
            addCriterion("diagnose_manager like", value, "diagnoseManager");
            return (Criteria) this;
        }

        public Criteria andDiagnoseManagerNotLike(String value) {
            addCriterion("diagnose_manager not like", value, "diagnoseManager");
            return (Criteria) this;
        }

        public Criteria andDiagnoseManagerIn(List<String> values) {
            addCriterion("diagnose_manager in", values, "diagnoseManager");
            return (Criteria) this;
        }

        public Criteria andDiagnoseManagerNotIn(List<String> values) {
            addCriterion("diagnose_manager not in", values, "diagnoseManager");
            return (Criteria) this;
        }

        public Criteria andDiagnoseManagerBetween(String value1, String value2) {
            addCriterion("diagnose_manager between", value1, value2, "diagnoseManager");
            return (Criteria) this;
        }

        public Criteria andDiagnoseManagerNotBetween(String value1, String value2) {
            addCriterion("diagnose_manager not between", value1, value2, "diagnoseManager");
            return (Criteria) this;
        }

        public Criteria andDiagnoseHelpIsNull() {
            addCriterion("diagnose_help is null");
            return (Criteria) this;
        }

        public Criteria andDiagnoseHelpIsNotNull() {
            addCriterion("diagnose_help is not null");
            return (Criteria) this;
        }

        public Criteria andDiagnoseHelpEqualTo(String value) {
            addCriterion("diagnose_help =", value, "diagnoseHelp");
            return (Criteria) this;
        }

        public Criteria andDiagnoseHelpNotEqualTo(String value) {
            addCriterion("diagnose_help <>", value, "diagnoseHelp");
            return (Criteria) this;
        }

        public Criteria andDiagnoseHelpGreaterThan(String value) {
            addCriterion("diagnose_help >", value, "diagnoseHelp");
            return (Criteria) this;
        }

        public Criteria andDiagnoseHelpGreaterThanOrEqualTo(String value) {
            addCriterion("diagnose_help >=", value, "diagnoseHelp");
            return (Criteria) this;
        }

        public Criteria andDiagnoseHelpLessThan(String value) {
            addCriterion("diagnose_help <", value, "diagnoseHelp");
            return (Criteria) this;
        }

        public Criteria andDiagnoseHelpLessThanOrEqualTo(String value) {
            addCriterion("diagnose_help <=", value, "diagnoseHelp");
            return (Criteria) this;
        }

        public Criteria andDiagnoseHelpLike(String value) {
            addCriterion("diagnose_help like", value, "diagnoseHelp");
            return (Criteria) this;
        }

        public Criteria andDiagnoseHelpNotLike(String value) {
            addCriterion("diagnose_help not like", value, "diagnoseHelp");
            return (Criteria) this;
        }

        public Criteria andDiagnoseHelpIn(List<String> values) {
            addCriterion("diagnose_help in", values, "diagnoseHelp");
            return (Criteria) this;
        }

        public Criteria andDiagnoseHelpNotIn(List<String> values) {
            addCriterion("diagnose_help not in", values, "diagnoseHelp");
            return (Criteria) this;
        }

        public Criteria andDiagnoseHelpBetween(String value1, String value2) {
            addCriterion("diagnose_help between", value1, value2, "diagnoseHelp");
            return (Criteria) this;
        }

        public Criteria andDiagnoseHelpNotBetween(String value1, String value2) {
            addCriterion("diagnose_help not between", value1, value2, "diagnoseHelp");
            return (Criteria) this;
        }

        public Criteria andDiagnoseMeasureIsNull() {
            addCriterion("diagnose_measure is null");
            return (Criteria) this;
        }

        public Criteria andDiagnoseMeasureIsNotNull() {
            addCriterion("diagnose_measure is not null");
            return (Criteria) this;
        }

        public Criteria andDiagnoseMeasureEqualTo(String value) {
            addCriterion("diagnose_measure =", value, "diagnoseMeasure");
            return (Criteria) this;
        }

        public Criteria andDiagnoseMeasureNotEqualTo(String value) {
            addCriterion("diagnose_measure <>", value, "diagnoseMeasure");
            return (Criteria) this;
        }

        public Criteria andDiagnoseMeasureGreaterThan(String value) {
            addCriterion("diagnose_measure >", value, "diagnoseMeasure");
            return (Criteria) this;
        }

        public Criteria andDiagnoseMeasureGreaterThanOrEqualTo(String value) {
            addCriterion("diagnose_measure >=", value, "diagnoseMeasure");
            return (Criteria) this;
        }

        public Criteria andDiagnoseMeasureLessThan(String value) {
            addCriterion("diagnose_measure <", value, "diagnoseMeasure");
            return (Criteria) this;
        }

        public Criteria andDiagnoseMeasureLessThanOrEqualTo(String value) {
            addCriterion("diagnose_measure <=", value, "diagnoseMeasure");
            return (Criteria) this;
        }

        public Criteria andDiagnoseMeasureLike(String value) {
            addCriterion("diagnose_measure like", value, "diagnoseMeasure");
            return (Criteria) this;
        }

        public Criteria andDiagnoseMeasureNotLike(String value) {
            addCriterion("diagnose_measure not like", value, "diagnoseMeasure");
            return (Criteria) this;
        }

        public Criteria andDiagnoseMeasureIn(List<String> values) {
            addCriterion("diagnose_measure in", values, "diagnoseMeasure");
            return (Criteria) this;
        }

        public Criteria andDiagnoseMeasureNotIn(List<String> values) {
            addCriterion("diagnose_measure not in", values, "diagnoseMeasure");
            return (Criteria) this;
        }

        public Criteria andDiagnoseMeasureBetween(String value1, String value2) {
            addCriterion("diagnose_measure between", value1, value2, "diagnoseMeasure");
            return (Criteria) this;
        }

        public Criteria andDiagnoseMeasureNotBetween(String value1, String value2) {
            addCriterion("diagnose_measure not between", value1, value2, "diagnoseMeasure");
            return (Criteria) this;
        }

        public Criteria andDiagnoseSymptomsIsNull() {
            addCriterion("diagnose_symptoms is null");
            return (Criteria) this;
        }

        public Criteria andDiagnoseSymptomsIsNotNull() {
            addCriterion("diagnose_symptoms is not null");
            return (Criteria) this;
        }

        public Criteria andDiagnoseSymptomsEqualTo(String value) {
            addCriterion("diagnose_symptoms =", value, "diagnoseSymptoms");
            return (Criteria) this;
        }

        public Criteria andDiagnoseSymptomsNotEqualTo(String value) {
            addCriterion("diagnose_symptoms <>", value, "diagnoseSymptoms");
            return (Criteria) this;
        }

        public Criteria andDiagnoseSymptomsGreaterThan(String value) {
            addCriterion("diagnose_symptoms >", value, "diagnoseSymptoms");
            return (Criteria) this;
        }

        public Criteria andDiagnoseSymptomsGreaterThanOrEqualTo(String value) {
            addCriterion("diagnose_symptoms >=", value, "diagnoseSymptoms");
            return (Criteria) this;
        }

        public Criteria andDiagnoseSymptomsLessThan(String value) {
            addCriterion("diagnose_symptoms <", value, "diagnoseSymptoms");
            return (Criteria) this;
        }

        public Criteria andDiagnoseSymptomsLessThanOrEqualTo(String value) {
            addCriterion("diagnose_symptoms <=", value, "diagnoseSymptoms");
            return (Criteria) this;
        }

        public Criteria andDiagnoseSymptomsLike(String value) {
            addCriterion("diagnose_symptoms like", value, "diagnoseSymptoms");
            return (Criteria) this;
        }

        public Criteria andDiagnoseSymptomsNotLike(String value) {
            addCriterion("diagnose_symptoms not like", value, "diagnoseSymptoms");
            return (Criteria) this;
        }

        public Criteria andDiagnoseSymptomsIn(List<String> values) {
            addCriterion("diagnose_symptoms in", values, "diagnoseSymptoms");
            return (Criteria) this;
        }

        public Criteria andDiagnoseSymptomsNotIn(List<String> values) {
            addCriterion("diagnose_symptoms not in", values, "diagnoseSymptoms");
            return (Criteria) this;
        }

        public Criteria andDiagnoseSymptomsBetween(String value1, String value2) {
            addCriterion("diagnose_symptoms between", value1, value2, "diagnoseSymptoms");
            return (Criteria) this;
        }

        public Criteria andDiagnoseSymptomsNotBetween(String value1, String value2) {
            addCriterion("diagnose_symptoms not between", value1, value2, "diagnoseSymptoms");
            return (Criteria) this;
        }

        public Criteria andDiagnoseReactIsNull() {
            addCriterion("diagnose_react is null");
            return (Criteria) this;
        }

        public Criteria andDiagnoseReactIsNotNull() {
            addCriterion("diagnose_react is not null");
            return (Criteria) this;
        }

        public Criteria andDiagnoseReactEqualTo(String value) {
            addCriterion("diagnose_react =", value, "diagnoseReact");
            return (Criteria) this;
        }

        public Criteria andDiagnoseReactNotEqualTo(String value) {
            addCriterion("diagnose_react <>", value, "diagnoseReact");
            return (Criteria) this;
        }

        public Criteria andDiagnoseReactGreaterThan(String value) {
            addCriterion("diagnose_react >", value, "diagnoseReact");
            return (Criteria) this;
        }

        public Criteria andDiagnoseReactGreaterThanOrEqualTo(String value) {
            addCriterion("diagnose_react >=", value, "diagnoseReact");
            return (Criteria) this;
        }

        public Criteria andDiagnoseReactLessThan(String value) {
            addCriterion("diagnose_react <", value, "diagnoseReact");
            return (Criteria) this;
        }

        public Criteria andDiagnoseReactLessThanOrEqualTo(String value) {
            addCriterion("diagnose_react <=", value, "diagnoseReact");
            return (Criteria) this;
        }

        public Criteria andDiagnoseReactLike(String value) {
            addCriterion("diagnose_react like", value, "diagnoseReact");
            return (Criteria) this;
        }

        public Criteria andDiagnoseReactNotLike(String value) {
            addCriterion("diagnose_react not like", value, "diagnoseReact");
            return (Criteria) this;
        }

        public Criteria andDiagnoseReactIn(List<String> values) {
            addCriterion("diagnose_react in", values, "diagnoseReact");
            return (Criteria) this;
        }

        public Criteria andDiagnoseReactNotIn(List<String> values) {
            addCriterion("diagnose_react not in", values, "diagnoseReact");
            return (Criteria) this;
        }

        public Criteria andDiagnoseReactBetween(String value1, String value2) {
            addCriterion("diagnose_react between", value1, value2, "diagnoseReact");
            return (Criteria) this;
        }

        public Criteria andDiagnoseReactNotBetween(String value1, String value2) {
            addCriterion("diagnose_react not between", value1, value2, "diagnoseReact");
            return (Criteria) this;
        }

        public Criteria andDiagnoseStatusIsNull() {
            addCriterion("diagnose_status is null");
            return (Criteria) this;
        }

        public Criteria andDiagnoseStatusIsNotNull() {
            addCriterion("diagnose_status is not null");
            return (Criteria) this;
        }

        public Criteria andDiagnoseStatusEqualTo(String value) {
            addCriterion("diagnose_status =", value, "diagnoseStatus");
            return (Criteria) this;
        }

        public Criteria andDiagnoseStatusNotEqualTo(String value) {
            addCriterion("diagnose_status <>", value, "diagnoseStatus");
            return (Criteria) this;
        }

        public Criteria andDiagnoseStatusGreaterThan(String value) {
            addCriterion("diagnose_status >", value, "diagnoseStatus");
            return (Criteria) this;
        }

        public Criteria andDiagnoseStatusGreaterThanOrEqualTo(String value) {
            addCriterion("diagnose_status >=", value, "diagnoseStatus");
            return (Criteria) this;
        }

        public Criteria andDiagnoseStatusLessThan(String value) {
            addCriterion("diagnose_status <", value, "diagnoseStatus");
            return (Criteria) this;
        }

        public Criteria andDiagnoseStatusLessThanOrEqualTo(String value) {
            addCriterion("diagnose_status <=", value, "diagnoseStatus");
            return (Criteria) this;
        }

        public Criteria andDiagnoseStatusLike(String value) {
            addCriterion("diagnose_status like", value, "diagnoseStatus");
            return (Criteria) this;
        }

        public Criteria andDiagnoseStatusNotLike(String value) {
            addCriterion("diagnose_status not like", value, "diagnoseStatus");
            return (Criteria) this;
        }

        public Criteria andDiagnoseStatusIn(List<String> values) {
            addCriterion("diagnose_status in", values, "diagnoseStatus");
            return (Criteria) this;
        }

        public Criteria andDiagnoseStatusNotIn(List<String> values) {
            addCriterion("diagnose_status not in", values, "diagnoseStatus");
            return (Criteria) this;
        }

        public Criteria andDiagnoseStatusBetween(String value1, String value2) {
            addCriterion("diagnose_status between", value1, value2, "diagnoseStatus");
            return (Criteria) this;
        }

        public Criteria andDiagnoseStatusNotBetween(String value1, String value2) {
            addCriterion("diagnose_status not between", value1, value2, "diagnoseStatus");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNull() {
            addCriterion("user_id is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("user_id is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(Long value) {
            addCriterion("user_id =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(Long value) {
            addCriterion("user_id <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(Long value) {
            addCriterion("user_id >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(Long value) {
            addCriterion("user_id >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(Long value) {
            addCriterion("user_id <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(Long value) {
            addCriterion("user_id <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<Long> values) {
            addCriterion("user_id in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<Long> values) {
            addCriterion("user_id not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(Long value1, Long value2) {
            addCriterion("user_id between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(Long value1, Long value2) {
            addCriterion("user_id not between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserTypeIsNull() {
            addCriterion("user_type is null");
            return (Criteria) this;
        }

        public Criteria andUserTypeIsNotNull() {
            addCriterion("user_type is not null");
            return (Criteria) this;
        }

        public Criteria andUserTypeEqualTo(Integer value) {
            addCriterion("user_type =", value, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeNotEqualTo(Integer value) {
            addCriterion("user_type <>", value, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeGreaterThan(Integer value) {
            addCriterion("user_type >", value, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("user_type >=", value, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeLessThan(Integer value) {
            addCriterion("user_type <", value, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeLessThanOrEqualTo(Integer value) {
            addCriterion("user_type <=", value, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeIn(List<Integer> values) {
            addCriterion("user_type in", values, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeNotIn(List<Integer> values) {
            addCriterion("user_type not in", values, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeBetween(Integer value1, Integer value2) {
            addCriterion("user_type between", value1, value2, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("user_type not between", value1, value2, "userType");
            return (Criteria) this;
        }
    }

    /**
     * 患者诊断信息
     *  domain 对应表：psy_diagnose_info
     *
     * @mbggenerated do_not_delete_during_merge
     */
    public static class Criteria extends GeneratedCriteria { 


        protected Criteria() {
            super();
        }
    }

    /**
     *  患者诊断信息
     *   对应表： 
     *    psy_diagnose_info
     *
     * @mbggenerated
     */
    public static class Criterion { 

        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}