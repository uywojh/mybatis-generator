package com.tianque.xueliang.psychosis.domain;

import com.yimama.core.query.ABaseDaoFilter;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *  患者基本信息  mapper 操作过滤器
 *   对应表： 
 *    psy_basic_info
 *
 * @mbggenerated
 */
public class PsyBasicInfoExample extends ABaseDaoFilter<PsyBasicInfoExample.Criteria> { 

    /**
     * orderByClause
     * 对应表： 
     *   psy_basic_info
     *
     * @mbggenerated
     */
    protected String orderByClause;

    /**
     * distinct
     * 对应表： 
     *   psy_basic_info
     *
     * @mbggenerated
     */
    protected boolean distinct;

    /**
     * oredCriteria
     * 对应表： 
     *   psy_basic_info
     *
     * @mbggenerated
     */
    protected List<Criteria> oredCriteria;

    /**
     *  对应表:  psy_basic_info
     *
     * @mbggenerated
     */
    public PsyBasicInfoExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public Criteria getScalarExistedCriteria() {
        if(oredCriteria!=null && oredCriteria.size()>0){
            	return oredCriteria.get(0);
        }
        return or();
    }

    /**
     *  对应表:  psy_basic_info
     *
     * @mbggenerated
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     *  对应表:  psy_basic_info
     *
     * @mbggenerated
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     *  对应表:  psy_basic_info
     *
     * @mbggenerated
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     *  对应表:  psy_basic_info
     *
     * @mbggenerated
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     *  对应表:  psy_basic_info
     *
     * @mbggenerated
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     *  对应表:  psy_basic_info
     *
     * @mbggenerated
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     *  对应表:  psy_basic_info
     *
     * @mbggenerated
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     *  对应表:  psy_basic_info
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
     *  对应表:  psy_basic_info
     *
     * @mbggenerated
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     *  对应表:  psy_basic_info
     *
     * @mbggenerated
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     *  患者基本信息
     *   对应表： 
     *    psy_basic_info
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

        public Criteria andPsyNameIsNull() {
            addCriterion("psy_name is null");
            return (Criteria) this;
        }

        public Criteria andPsyNameIsNotNull() {
            addCriterion("psy_name is not null");
            return (Criteria) this;
        }

        public Criteria andPsyNameEqualTo(String value) {
            addCriterion("psy_name =", value, "psyName");
            return (Criteria) this;
        }

        public Criteria andPsyNameNotEqualTo(String value) {
            addCriterion("psy_name <>", value, "psyName");
            return (Criteria) this;
        }

        public Criteria andPsyNameGreaterThan(String value) {
            addCriterion("psy_name >", value, "psyName");
            return (Criteria) this;
        }

        public Criteria andPsyNameGreaterThanOrEqualTo(String value) {
            addCriterion("psy_name >=", value, "psyName");
            return (Criteria) this;
        }

        public Criteria andPsyNameLessThan(String value) {
            addCriterion("psy_name <", value, "psyName");
            return (Criteria) this;
        }

        public Criteria andPsyNameLessThanOrEqualTo(String value) {
            addCriterion("psy_name <=", value, "psyName");
            return (Criteria) this;
        }

        public Criteria andPsyNameLike(String value) {
            addCriterion("psy_name like", value, "psyName");
            return (Criteria) this;
        }

        public Criteria andPsyNameNotLike(String value) {
            addCriterion("psy_name not like", value, "psyName");
            return (Criteria) this;
        }

        public Criteria andPsyNameIn(List<String> values) {
            addCriterion("psy_name in", values, "psyName");
            return (Criteria) this;
        }

        public Criteria andPsyNameNotIn(List<String> values) {
            addCriterion("psy_name not in", values, "psyName");
            return (Criteria) this;
        }

        public Criteria andPsyNameBetween(String value1, String value2) {
            addCriterion("psy_name between", value1, value2, "psyName");
            return (Criteria) this;
        }

        public Criteria andPsyNameNotBetween(String value1, String value2) {
            addCriterion("psy_name not between", value1, value2, "psyName");
            return (Criteria) this;
        }

        public Criteria andPsySexIsNull() {
            addCriterion("psy_sex is null");
            return (Criteria) this;
        }

        public Criteria andPsySexIsNotNull() {
            addCriterion("psy_sex is not null");
            return (Criteria) this;
        }

        public Criteria andPsySexEqualTo(Boolean value) {
            addCriterion("psy_sex =", value, "psySex");
            return (Criteria) this;
        }

        public Criteria andPsySexNotEqualTo(Boolean value) {
            addCriterion("psy_sex <>", value, "psySex");
            return (Criteria) this;
        }

        public Criteria andPsySexGreaterThan(Boolean value) {
            addCriterion("psy_sex >", value, "psySex");
            return (Criteria) this;
        }

        public Criteria andPsySexGreaterThanOrEqualTo(Boolean value) {
            addCriterion("psy_sex >=", value, "psySex");
            return (Criteria) this;
        }

        public Criteria andPsySexLessThan(Boolean value) {
            addCriterion("psy_sex <", value, "psySex");
            return (Criteria) this;
        }

        public Criteria andPsySexLessThanOrEqualTo(Boolean value) {
            addCriterion("psy_sex <=", value, "psySex");
            return (Criteria) this;
        }

        public Criteria andPsySexIn(List<Boolean> values) {
            addCriterion("psy_sex in", values, "psySex");
            return (Criteria) this;
        }

        public Criteria andPsySexNotIn(List<Boolean> values) {
            addCriterion("psy_sex not in", values, "psySex");
            return (Criteria) this;
        }

        public Criteria andPsySexBetween(Boolean value1, Boolean value2) {
            addCriterion("psy_sex between", value1, value2, "psySex");
            return (Criteria) this;
        }

        public Criteria andPsySexNotBetween(Boolean value1, Boolean value2) {
            addCriterion("psy_sex not between", value1, value2, "psySex");
            return (Criteria) this;
        }

        public Criteria andPsyBeforeNameIsNull() {
            addCriterion("psy_before_name is null");
            return (Criteria) this;
        }

        public Criteria andPsyBeforeNameIsNotNull() {
            addCriterion("psy_before_name is not null");
            return (Criteria) this;
        }

        public Criteria andPsyBeforeNameEqualTo(String value) {
            addCriterion("psy_before_name =", value, "psyBeforeName");
            return (Criteria) this;
        }

        public Criteria andPsyBeforeNameNotEqualTo(String value) {
            addCriterion("psy_before_name <>", value, "psyBeforeName");
            return (Criteria) this;
        }

        public Criteria andPsyBeforeNameGreaterThan(String value) {
            addCriterion("psy_before_name >", value, "psyBeforeName");
            return (Criteria) this;
        }

        public Criteria andPsyBeforeNameGreaterThanOrEqualTo(String value) {
            addCriterion("psy_before_name >=", value, "psyBeforeName");
            return (Criteria) this;
        }

        public Criteria andPsyBeforeNameLessThan(String value) {
            addCriterion("psy_before_name <", value, "psyBeforeName");
            return (Criteria) this;
        }

        public Criteria andPsyBeforeNameLessThanOrEqualTo(String value) {
            addCriterion("psy_before_name <=", value, "psyBeforeName");
            return (Criteria) this;
        }

        public Criteria andPsyBeforeNameLike(String value) {
            addCriterion("psy_before_name like", value, "psyBeforeName");
            return (Criteria) this;
        }

        public Criteria andPsyBeforeNameNotLike(String value) {
            addCriterion("psy_before_name not like", value, "psyBeforeName");
            return (Criteria) this;
        }

        public Criteria andPsyBeforeNameIn(List<String> values) {
            addCriterion("psy_before_name in", values, "psyBeforeName");
            return (Criteria) this;
        }

        public Criteria andPsyBeforeNameNotIn(List<String> values) {
            addCriterion("psy_before_name not in", values, "psyBeforeName");
            return (Criteria) this;
        }

        public Criteria andPsyBeforeNameBetween(String value1, String value2) {
            addCriterion("psy_before_name between", value1, value2, "psyBeforeName");
            return (Criteria) this;
        }

        public Criteria andPsyBeforeNameNotBetween(String value1, String value2) {
            addCriterion("psy_before_name not between", value1, value2, "psyBeforeName");
            return (Criteria) this;
        }

        public Criteria andPsyIdCardIsNull() {
            addCriterion("psy_id_card is null");
            return (Criteria) this;
        }

        public Criteria andPsyIdCardIsNotNull() {
            addCriterion("psy_id_card is not null");
            return (Criteria) this;
        }

        public Criteria andPsyIdCardEqualTo(Integer value) {
            addCriterion("psy_id_card =", value, "psyIdCard");
            return (Criteria) this;
        }

        public Criteria andPsyIdCardNotEqualTo(Integer value) {
            addCriterion("psy_id_card <>", value, "psyIdCard");
            return (Criteria) this;
        }

        public Criteria andPsyIdCardGreaterThan(Integer value) {
            addCriterion("psy_id_card >", value, "psyIdCard");
            return (Criteria) this;
        }

        public Criteria andPsyIdCardGreaterThanOrEqualTo(Integer value) {
            addCriterion("psy_id_card >=", value, "psyIdCard");
            return (Criteria) this;
        }

        public Criteria andPsyIdCardLessThan(Integer value) {
            addCriterion("psy_id_card <", value, "psyIdCard");
            return (Criteria) this;
        }

        public Criteria andPsyIdCardLessThanOrEqualTo(Integer value) {
            addCriterion("psy_id_card <=", value, "psyIdCard");
            return (Criteria) this;
        }

        public Criteria andPsyIdCardIn(List<Integer> values) {
            addCriterion("psy_id_card in", values, "psyIdCard");
            return (Criteria) this;
        }

        public Criteria andPsyIdCardNotIn(List<Integer> values) {
            addCriterion("psy_id_card not in", values, "psyIdCard");
            return (Criteria) this;
        }

        public Criteria andPsyIdCardBetween(Integer value1, Integer value2) {
            addCriterion("psy_id_card between", value1, value2, "psyIdCard");
            return (Criteria) this;
        }

        public Criteria andPsyIdCardNotBetween(Integer value1, Integer value2) {
            addCriterion("psy_id_card not between", value1, value2, "psyIdCard");
            return (Criteria) this;
        }

        public Criteria andPsyBirthIsNull() {
            addCriterion("psy_birth is null");
            return (Criteria) this;
        }

        public Criteria andPsyBirthIsNotNull() {
            addCriterion("psy_birth is not null");
            return (Criteria) this;
        }

        public Criteria andPsyBirthEqualTo(String value) {
            addCriterion("psy_birth =", value, "psyBirth");
            return (Criteria) this;
        }

        public Criteria andPsyBirthNotEqualTo(String value) {
            addCriterion("psy_birth <>", value, "psyBirth");
            return (Criteria) this;
        }

        public Criteria andPsyBirthGreaterThan(String value) {
            addCriterion("psy_birth >", value, "psyBirth");
            return (Criteria) this;
        }

        public Criteria andPsyBirthGreaterThanOrEqualTo(String value) {
            addCriterion("psy_birth >=", value, "psyBirth");
            return (Criteria) this;
        }

        public Criteria andPsyBirthLessThan(String value) {
            addCriterion("psy_birth <", value, "psyBirth");
            return (Criteria) this;
        }

        public Criteria andPsyBirthLessThanOrEqualTo(String value) {
            addCriterion("psy_birth <=", value, "psyBirth");
            return (Criteria) this;
        }

        public Criteria andPsyBirthLike(String value) {
            addCriterion("psy_birth like", value, "psyBirth");
            return (Criteria) this;
        }

        public Criteria andPsyBirthNotLike(String value) {
            addCriterion("psy_birth not like", value, "psyBirth");
            return (Criteria) this;
        }

        public Criteria andPsyBirthIn(List<String> values) {
            addCriterion("psy_birth in", values, "psyBirth");
            return (Criteria) this;
        }

        public Criteria andPsyBirthNotIn(List<String> values) {
            addCriterion("psy_birth not in", values, "psyBirth");
            return (Criteria) this;
        }

        public Criteria andPsyBirthBetween(String value1, String value2) {
            addCriterion("psy_birth between", value1, value2, "psyBirth");
            return (Criteria) this;
        }

        public Criteria andPsyBirthNotBetween(String value1, String value2) {
            addCriterion("psy_birth not between", value1, value2, "psyBirth");
            return (Criteria) this;
        }

        public Criteria andPsyAgeIsNull() {
            addCriterion("psy_age is null");
            return (Criteria) this;
        }

        public Criteria andPsyAgeIsNotNull() {
            addCriterion("psy_age is not null");
            return (Criteria) this;
        }

        public Criteria andPsyAgeEqualTo(Integer value) {
            addCriterion("psy_age =", value, "psyAge");
            return (Criteria) this;
        }

        public Criteria andPsyAgeNotEqualTo(Integer value) {
            addCriterion("psy_age <>", value, "psyAge");
            return (Criteria) this;
        }

        public Criteria andPsyAgeGreaterThan(Integer value) {
            addCriterion("psy_age >", value, "psyAge");
            return (Criteria) this;
        }

        public Criteria andPsyAgeGreaterThanOrEqualTo(Integer value) {
            addCriterion("psy_age >=", value, "psyAge");
            return (Criteria) this;
        }

        public Criteria andPsyAgeLessThan(Integer value) {
            addCriterion("psy_age <", value, "psyAge");
            return (Criteria) this;
        }

        public Criteria andPsyAgeLessThanOrEqualTo(Integer value) {
            addCriterion("psy_age <=", value, "psyAge");
            return (Criteria) this;
        }

        public Criteria andPsyAgeIn(List<Integer> values) {
            addCriterion("psy_age in", values, "psyAge");
            return (Criteria) this;
        }

        public Criteria andPsyAgeNotIn(List<Integer> values) {
            addCriterion("psy_age not in", values, "psyAge");
            return (Criteria) this;
        }

        public Criteria andPsyAgeBetween(Integer value1, Integer value2) {
            addCriterion("psy_age between", value1, value2, "psyAge");
            return (Criteria) this;
        }

        public Criteria andPsyAgeNotBetween(Integer value1, Integer value2) {
            addCriterion("psy_age not between", value1, value2, "psyAge");
            return (Criteria) this;
        }

        public Criteria andPsyNationIsNull() {
            addCriterion("psy_nation is null");
            return (Criteria) this;
        }

        public Criteria andPsyNationIsNotNull() {
            addCriterion("psy_nation is not null");
            return (Criteria) this;
        }

        public Criteria andPsyNationEqualTo(String value) {
            addCriterion("psy_nation =", value, "psyNation");
            return (Criteria) this;
        }

        public Criteria andPsyNationNotEqualTo(String value) {
            addCriterion("psy_nation <>", value, "psyNation");
            return (Criteria) this;
        }

        public Criteria andPsyNationGreaterThan(String value) {
            addCriterion("psy_nation >", value, "psyNation");
            return (Criteria) this;
        }

        public Criteria andPsyNationGreaterThanOrEqualTo(String value) {
            addCriterion("psy_nation >=", value, "psyNation");
            return (Criteria) this;
        }

        public Criteria andPsyNationLessThan(String value) {
            addCriterion("psy_nation <", value, "psyNation");
            return (Criteria) this;
        }

        public Criteria andPsyNationLessThanOrEqualTo(String value) {
            addCriterion("psy_nation <=", value, "psyNation");
            return (Criteria) this;
        }

        public Criteria andPsyNationLike(String value) {
            addCriterion("psy_nation like", value, "psyNation");
            return (Criteria) this;
        }

        public Criteria andPsyNationNotLike(String value) {
            addCriterion("psy_nation not like", value, "psyNation");
            return (Criteria) this;
        }

        public Criteria andPsyNationIn(List<String> values) {
            addCriterion("psy_nation in", values, "psyNation");
            return (Criteria) this;
        }

        public Criteria andPsyNationNotIn(List<String> values) {
            addCriterion("psy_nation not in", values, "psyNation");
            return (Criteria) this;
        }

        public Criteria andPsyNationBetween(String value1, String value2) {
            addCriterion("psy_nation between", value1, value2, "psyNation");
            return (Criteria) this;
        }

        public Criteria andPsyNationNotBetween(String value1, String value2) {
            addCriterion("psy_nation not between", value1, value2, "psyNation");
            return (Criteria) this;
        }

        public Criteria andPsyNativeIsNull() {
            addCriterion("psy_native is null");
            return (Criteria) this;
        }

        public Criteria andPsyNativeIsNotNull() {
            addCriterion("psy_native is not null");
            return (Criteria) this;
        }

        public Criteria andPsyNativeEqualTo(String value) {
            addCriterion("psy_native =", value, "psyNative");
            return (Criteria) this;
        }

        public Criteria andPsyNativeNotEqualTo(String value) {
            addCriterion("psy_native <>", value, "psyNative");
            return (Criteria) this;
        }

        public Criteria andPsyNativeGreaterThan(String value) {
            addCriterion("psy_native >", value, "psyNative");
            return (Criteria) this;
        }

        public Criteria andPsyNativeGreaterThanOrEqualTo(String value) {
            addCriterion("psy_native >=", value, "psyNative");
            return (Criteria) this;
        }

        public Criteria andPsyNativeLessThan(String value) {
            addCriterion("psy_native <", value, "psyNative");
            return (Criteria) this;
        }

        public Criteria andPsyNativeLessThanOrEqualTo(String value) {
            addCriterion("psy_native <=", value, "psyNative");
            return (Criteria) this;
        }

        public Criteria andPsyNativeLike(String value) {
            addCriterion("psy_native like", value, "psyNative");
            return (Criteria) this;
        }

        public Criteria andPsyNativeNotLike(String value) {
            addCriterion("psy_native not like", value, "psyNative");
            return (Criteria) this;
        }

        public Criteria andPsyNativeIn(List<String> values) {
            addCriterion("psy_native in", values, "psyNative");
            return (Criteria) this;
        }

        public Criteria andPsyNativeNotIn(List<String> values) {
            addCriterion("psy_native not in", values, "psyNative");
            return (Criteria) this;
        }

        public Criteria andPsyNativeBetween(String value1, String value2) {
            addCriterion("psy_native between", value1, value2, "psyNative");
            return (Criteria) this;
        }

        public Criteria andPsyNativeNotBetween(String value1, String value2) {
            addCriterion("psy_native not between", value1, value2, "psyNative");
            return (Criteria) this;
        }

        public Criteria andPsyMaritalIsNull() {
            addCriterion("psy_marital is null");
            return (Criteria) this;
        }

        public Criteria andPsyMaritalIsNotNull() {
            addCriterion("psy_marital is not null");
            return (Criteria) this;
        }

        public Criteria andPsyMaritalEqualTo(Boolean value) {
            addCriterion("psy_marital =", value, "psyMarital");
            return (Criteria) this;
        }

        public Criteria andPsyMaritalNotEqualTo(Boolean value) {
            addCriterion("psy_marital <>", value, "psyMarital");
            return (Criteria) this;
        }

        public Criteria andPsyMaritalGreaterThan(Boolean value) {
            addCriterion("psy_marital >", value, "psyMarital");
            return (Criteria) this;
        }

        public Criteria andPsyMaritalGreaterThanOrEqualTo(Boolean value) {
            addCriterion("psy_marital >=", value, "psyMarital");
            return (Criteria) this;
        }

        public Criteria andPsyMaritalLessThan(Boolean value) {
            addCriterion("psy_marital <", value, "psyMarital");
            return (Criteria) this;
        }

        public Criteria andPsyMaritalLessThanOrEqualTo(Boolean value) {
            addCriterion("psy_marital <=", value, "psyMarital");
            return (Criteria) this;
        }

        public Criteria andPsyMaritalIn(List<Boolean> values) {
            addCriterion("psy_marital in", values, "psyMarital");
            return (Criteria) this;
        }

        public Criteria andPsyMaritalNotIn(List<Boolean> values) {
            addCriterion("psy_marital not in", values, "psyMarital");
            return (Criteria) this;
        }

        public Criteria andPsyMaritalBetween(Boolean value1, Boolean value2) {
            addCriterion("psy_marital between", value1, value2, "psyMarital");
            return (Criteria) this;
        }

        public Criteria andPsyMaritalNotBetween(Boolean value1, Boolean value2) {
            addCriterion("psy_marital not between", value1, value2, "psyMarital");
            return (Criteria) this;
        }

        public Criteria andPsyPoliticIsNull() {
            addCriterion("psy_politic is null");
            return (Criteria) this;
        }

        public Criteria andPsyPoliticIsNotNull() {
            addCriterion("psy_politic is not null");
            return (Criteria) this;
        }

        public Criteria andPsyPoliticEqualTo(String value) {
            addCriterion("psy_politic =", value, "psyPolitic");
            return (Criteria) this;
        }

        public Criteria andPsyPoliticNotEqualTo(String value) {
            addCriterion("psy_politic <>", value, "psyPolitic");
            return (Criteria) this;
        }

        public Criteria andPsyPoliticGreaterThan(String value) {
            addCriterion("psy_politic >", value, "psyPolitic");
            return (Criteria) this;
        }

        public Criteria andPsyPoliticGreaterThanOrEqualTo(String value) {
            addCriterion("psy_politic >=", value, "psyPolitic");
            return (Criteria) this;
        }

        public Criteria andPsyPoliticLessThan(String value) {
            addCriterion("psy_politic <", value, "psyPolitic");
            return (Criteria) this;
        }

        public Criteria andPsyPoliticLessThanOrEqualTo(String value) {
            addCriterion("psy_politic <=", value, "psyPolitic");
            return (Criteria) this;
        }

        public Criteria andPsyPoliticLike(String value) {
            addCriterion("psy_politic like", value, "psyPolitic");
            return (Criteria) this;
        }

        public Criteria andPsyPoliticNotLike(String value) {
            addCriterion("psy_politic not like", value, "psyPolitic");
            return (Criteria) this;
        }

        public Criteria andPsyPoliticIn(List<String> values) {
            addCriterion("psy_politic in", values, "psyPolitic");
            return (Criteria) this;
        }

        public Criteria andPsyPoliticNotIn(List<String> values) {
            addCriterion("psy_politic not in", values, "psyPolitic");
            return (Criteria) this;
        }

        public Criteria andPsyPoliticBetween(String value1, String value2) {
            addCriterion("psy_politic between", value1, value2, "psyPolitic");
            return (Criteria) this;
        }

        public Criteria andPsyPoliticNotBetween(String value1, String value2) {
            addCriterion("psy_politic not between", value1, value2, "psyPolitic");
            return (Criteria) this;
        }

        public Criteria andPsyBackgroundIsNull() {
            addCriterion("psy_background is null");
            return (Criteria) this;
        }

        public Criteria andPsyBackgroundIsNotNull() {
            addCriterion("psy_background is not null");
            return (Criteria) this;
        }

        public Criteria andPsyBackgroundEqualTo(String value) {
            addCriterion("psy_background =", value, "psyBackground");
            return (Criteria) this;
        }

        public Criteria andPsyBackgroundNotEqualTo(String value) {
            addCriterion("psy_background <>", value, "psyBackground");
            return (Criteria) this;
        }

        public Criteria andPsyBackgroundGreaterThan(String value) {
            addCriterion("psy_background >", value, "psyBackground");
            return (Criteria) this;
        }

        public Criteria andPsyBackgroundGreaterThanOrEqualTo(String value) {
            addCriterion("psy_background >=", value, "psyBackground");
            return (Criteria) this;
        }

        public Criteria andPsyBackgroundLessThan(String value) {
            addCriterion("psy_background <", value, "psyBackground");
            return (Criteria) this;
        }

        public Criteria andPsyBackgroundLessThanOrEqualTo(String value) {
            addCriterion("psy_background <=", value, "psyBackground");
            return (Criteria) this;
        }

        public Criteria andPsyBackgroundLike(String value) {
            addCriterion("psy_background like", value, "psyBackground");
            return (Criteria) this;
        }

        public Criteria andPsyBackgroundNotLike(String value) {
            addCriterion("psy_background not like", value, "psyBackground");
            return (Criteria) this;
        }

        public Criteria andPsyBackgroundIn(List<String> values) {
            addCriterion("psy_background in", values, "psyBackground");
            return (Criteria) this;
        }

        public Criteria andPsyBackgroundNotIn(List<String> values) {
            addCriterion("psy_background not in", values, "psyBackground");
            return (Criteria) this;
        }

        public Criteria andPsyBackgroundBetween(String value1, String value2) {
            addCriterion("psy_background between", value1, value2, "psyBackground");
            return (Criteria) this;
        }

        public Criteria andPsyBackgroundNotBetween(String value1, String value2) {
            addCriterion("psy_background not between", value1, value2, "psyBackground");
            return (Criteria) this;
        }

        public Criteria andPsyFaithIsNull() {
            addCriterion("psy_faith is null");
            return (Criteria) this;
        }

        public Criteria andPsyFaithIsNotNull() {
            addCriterion("psy_faith is not null");
            return (Criteria) this;
        }

        public Criteria andPsyFaithEqualTo(String value) {
            addCriterion("psy_faith =", value, "psyFaith");
            return (Criteria) this;
        }

        public Criteria andPsyFaithNotEqualTo(String value) {
            addCriterion("psy_faith <>", value, "psyFaith");
            return (Criteria) this;
        }

        public Criteria andPsyFaithGreaterThan(String value) {
            addCriterion("psy_faith >", value, "psyFaith");
            return (Criteria) this;
        }

        public Criteria andPsyFaithGreaterThanOrEqualTo(String value) {
            addCriterion("psy_faith >=", value, "psyFaith");
            return (Criteria) this;
        }

        public Criteria andPsyFaithLessThan(String value) {
            addCriterion("psy_faith <", value, "psyFaith");
            return (Criteria) this;
        }

        public Criteria andPsyFaithLessThanOrEqualTo(String value) {
            addCriterion("psy_faith <=", value, "psyFaith");
            return (Criteria) this;
        }

        public Criteria andPsyFaithLike(String value) {
            addCriterion("psy_faith like", value, "psyFaith");
            return (Criteria) this;
        }

        public Criteria andPsyFaithNotLike(String value) {
            addCriterion("psy_faith not like", value, "psyFaith");
            return (Criteria) this;
        }

        public Criteria andPsyFaithIn(List<String> values) {
            addCriterion("psy_faith in", values, "psyFaith");
            return (Criteria) this;
        }

        public Criteria andPsyFaithNotIn(List<String> values) {
            addCriterion("psy_faith not in", values, "psyFaith");
            return (Criteria) this;
        }

        public Criteria andPsyFaithBetween(String value1, String value2) {
            addCriterion("psy_faith between", value1, value2, "psyFaith");
            return (Criteria) this;
        }

        public Criteria andPsyFaithNotBetween(String value1, String value2) {
            addCriterion("psy_faith not between", value1, value2, "psyFaith");
            return (Criteria) this;
        }

        public Criteria andPsyJobIsNull() {
            addCriterion("psy_job is null");
            return (Criteria) this;
        }

        public Criteria andPsyJobIsNotNull() {
            addCriterion("psy_job is not null");
            return (Criteria) this;
        }

        public Criteria andPsyJobEqualTo(String value) {
            addCriterion("psy_job =", value, "psyJob");
            return (Criteria) this;
        }

        public Criteria andPsyJobNotEqualTo(String value) {
            addCriterion("psy_job <>", value, "psyJob");
            return (Criteria) this;
        }

        public Criteria andPsyJobGreaterThan(String value) {
            addCriterion("psy_job >", value, "psyJob");
            return (Criteria) this;
        }

        public Criteria andPsyJobGreaterThanOrEqualTo(String value) {
            addCriterion("psy_job >=", value, "psyJob");
            return (Criteria) this;
        }

        public Criteria andPsyJobLessThan(String value) {
            addCriterion("psy_job <", value, "psyJob");
            return (Criteria) this;
        }

        public Criteria andPsyJobLessThanOrEqualTo(String value) {
            addCriterion("psy_job <=", value, "psyJob");
            return (Criteria) this;
        }

        public Criteria andPsyJobLike(String value) {
            addCriterion("psy_job like", value, "psyJob");
            return (Criteria) this;
        }

        public Criteria andPsyJobNotLike(String value) {
            addCriterion("psy_job not like", value, "psyJob");
            return (Criteria) this;
        }

        public Criteria andPsyJobIn(List<String> values) {
            addCriterion("psy_job in", values, "psyJob");
            return (Criteria) this;
        }

        public Criteria andPsyJobNotIn(List<String> values) {
            addCriterion("psy_job not in", values, "psyJob");
            return (Criteria) this;
        }

        public Criteria andPsyJobBetween(String value1, String value2) {
            addCriterion("psy_job between", value1, value2, "psyJob");
            return (Criteria) this;
        }

        public Criteria andPsyJobNotBetween(String value1, String value2) {
            addCriterion("psy_job not between", value1, value2, "psyJob");
            return (Criteria) this;
        }

        public Criteria andPsyWorkspaceIsNull() {
            addCriterion("psy_workspace is null");
            return (Criteria) this;
        }

        public Criteria andPsyWorkspaceIsNotNull() {
            addCriterion("psy_workspace is not null");
            return (Criteria) this;
        }

        public Criteria andPsyWorkspaceEqualTo(String value) {
            addCriterion("psy_workspace =", value, "psyWorkspace");
            return (Criteria) this;
        }

        public Criteria andPsyWorkspaceNotEqualTo(String value) {
            addCriterion("psy_workspace <>", value, "psyWorkspace");
            return (Criteria) this;
        }

        public Criteria andPsyWorkspaceGreaterThan(String value) {
            addCriterion("psy_workspace >", value, "psyWorkspace");
            return (Criteria) this;
        }

        public Criteria andPsyWorkspaceGreaterThanOrEqualTo(String value) {
            addCriterion("psy_workspace >=", value, "psyWorkspace");
            return (Criteria) this;
        }

        public Criteria andPsyWorkspaceLessThan(String value) {
            addCriterion("psy_workspace <", value, "psyWorkspace");
            return (Criteria) this;
        }

        public Criteria andPsyWorkspaceLessThanOrEqualTo(String value) {
            addCriterion("psy_workspace <=", value, "psyWorkspace");
            return (Criteria) this;
        }

        public Criteria andPsyWorkspaceLike(String value) {
            addCriterion("psy_workspace like", value, "psyWorkspace");
            return (Criteria) this;
        }

        public Criteria andPsyWorkspaceNotLike(String value) {
            addCriterion("psy_workspace not like", value, "psyWorkspace");
            return (Criteria) this;
        }

        public Criteria andPsyWorkspaceIn(List<String> values) {
            addCriterion("psy_workspace in", values, "psyWorkspace");
            return (Criteria) this;
        }

        public Criteria andPsyWorkspaceNotIn(List<String> values) {
            addCriterion("psy_workspace not in", values, "psyWorkspace");
            return (Criteria) this;
        }

        public Criteria andPsyWorkspaceBetween(String value1, String value2) {
            addCriterion("psy_workspace between", value1, value2, "psyWorkspace");
            return (Criteria) this;
        }

        public Criteria andPsyWorkspaceNotBetween(String value1, String value2) {
            addCriterion("psy_workspace not between", value1, value2, "psyWorkspace");
            return (Criteria) this;
        }

        public Criteria andPsyPhoneIsNull() {
            addCriterion("psy_phone is null");
            return (Criteria) this;
        }

        public Criteria andPsyPhoneIsNotNull() {
            addCriterion("psy_phone is not null");
            return (Criteria) this;
        }

        public Criteria andPsyPhoneEqualTo(String value) {
            addCriterion("psy_phone =", value, "psyPhone");
            return (Criteria) this;
        }

        public Criteria andPsyPhoneNotEqualTo(String value) {
            addCriterion("psy_phone <>", value, "psyPhone");
            return (Criteria) this;
        }

        public Criteria andPsyPhoneGreaterThan(String value) {
            addCriterion("psy_phone >", value, "psyPhone");
            return (Criteria) this;
        }

        public Criteria andPsyPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("psy_phone >=", value, "psyPhone");
            return (Criteria) this;
        }

        public Criteria andPsyPhoneLessThan(String value) {
            addCriterion("psy_phone <", value, "psyPhone");
            return (Criteria) this;
        }

        public Criteria andPsyPhoneLessThanOrEqualTo(String value) {
            addCriterion("psy_phone <=", value, "psyPhone");
            return (Criteria) this;
        }

        public Criteria andPsyPhoneLike(String value) {
            addCriterion("psy_phone like", value, "psyPhone");
            return (Criteria) this;
        }

        public Criteria andPsyPhoneNotLike(String value) {
            addCriterion("psy_phone not like", value, "psyPhone");
            return (Criteria) this;
        }

        public Criteria andPsyPhoneIn(List<String> values) {
            addCriterion("psy_phone in", values, "psyPhone");
            return (Criteria) this;
        }

        public Criteria andPsyPhoneNotIn(List<String> values) {
            addCriterion("psy_phone not in", values, "psyPhone");
            return (Criteria) this;
        }

        public Criteria andPsyPhoneBetween(String value1, String value2) {
            addCriterion("psy_phone between", value1, value2, "psyPhone");
            return (Criteria) this;
        }

        public Criteria andPsyPhoneNotBetween(String value1, String value2) {
            addCriterion("psy_phone not between", value1, value2, "psyPhone");
            return (Criteria) this;
        }

        public Criteria andPsyNationAddressIsNull() {
            addCriterion("psy_nation_address is null");
            return (Criteria) this;
        }

        public Criteria andPsyNationAddressIsNotNull() {
            addCriterion("psy_nation_address is not null");
            return (Criteria) this;
        }

        public Criteria andPsyNationAddressEqualTo(String value) {
            addCriterion("psy_nation_address =", value, "psyNationAddress");
            return (Criteria) this;
        }

        public Criteria andPsyNationAddressNotEqualTo(String value) {
            addCriterion("psy_nation_address <>", value, "psyNationAddress");
            return (Criteria) this;
        }

        public Criteria andPsyNationAddressGreaterThan(String value) {
            addCriterion("psy_nation_address >", value, "psyNationAddress");
            return (Criteria) this;
        }

        public Criteria andPsyNationAddressGreaterThanOrEqualTo(String value) {
            addCriterion("psy_nation_address >=", value, "psyNationAddress");
            return (Criteria) this;
        }

        public Criteria andPsyNationAddressLessThan(String value) {
            addCriterion("psy_nation_address <", value, "psyNationAddress");
            return (Criteria) this;
        }

        public Criteria andPsyNationAddressLessThanOrEqualTo(String value) {
            addCriterion("psy_nation_address <=", value, "psyNationAddress");
            return (Criteria) this;
        }

        public Criteria andPsyNationAddressLike(String value) {
            addCriterion("psy_nation_address like", value, "psyNationAddress");
            return (Criteria) this;
        }

        public Criteria andPsyNationAddressNotLike(String value) {
            addCriterion("psy_nation_address not like", value, "psyNationAddress");
            return (Criteria) this;
        }

        public Criteria andPsyNationAddressIn(List<String> values) {
            addCriterion("psy_nation_address in", values, "psyNationAddress");
            return (Criteria) this;
        }

        public Criteria andPsyNationAddressNotIn(List<String> values) {
            addCriterion("psy_nation_address not in", values, "psyNationAddress");
            return (Criteria) this;
        }

        public Criteria andPsyNationAddressBetween(String value1, String value2) {
            addCriterion("psy_nation_address between", value1, value2, "psyNationAddress");
            return (Criteria) this;
        }

        public Criteria andPsyNationAddressNotBetween(String value1, String value2) {
            addCriterion("psy_nation_address not between", value1, value2, "psyNationAddress");
            return (Criteria) this;
        }

        public Criteria andPsyNowAddressIsNull() {
            addCriterion("psy_now_address is null");
            return (Criteria) this;
        }

        public Criteria andPsyNowAddressIsNotNull() {
            addCriterion("psy_now_address is not null");
            return (Criteria) this;
        }

        public Criteria andPsyNowAddressEqualTo(String value) {
            addCriterion("psy_now_address =", value, "psyNowAddress");
            return (Criteria) this;
        }

        public Criteria andPsyNowAddressNotEqualTo(String value) {
            addCriterion("psy_now_address <>", value, "psyNowAddress");
            return (Criteria) this;
        }

        public Criteria andPsyNowAddressGreaterThan(String value) {
            addCriterion("psy_now_address >", value, "psyNowAddress");
            return (Criteria) this;
        }

        public Criteria andPsyNowAddressGreaterThanOrEqualTo(String value) {
            addCriterion("psy_now_address >=", value, "psyNowAddress");
            return (Criteria) this;
        }

        public Criteria andPsyNowAddressLessThan(String value) {
            addCriterion("psy_now_address <", value, "psyNowAddress");
            return (Criteria) this;
        }

        public Criteria andPsyNowAddressLessThanOrEqualTo(String value) {
            addCriterion("psy_now_address <=", value, "psyNowAddress");
            return (Criteria) this;
        }

        public Criteria andPsyNowAddressLike(String value) {
            addCriterion("psy_now_address like", value, "psyNowAddress");
            return (Criteria) this;
        }

        public Criteria andPsyNowAddressNotLike(String value) {
            addCriterion("psy_now_address not like", value, "psyNowAddress");
            return (Criteria) this;
        }

        public Criteria andPsyNowAddressIn(List<String> values) {
            addCriterion("psy_now_address in", values, "psyNowAddress");
            return (Criteria) this;
        }

        public Criteria andPsyNowAddressNotIn(List<String> values) {
            addCriterion("psy_now_address not in", values, "psyNowAddress");
            return (Criteria) this;
        }

        public Criteria andPsyNowAddressBetween(String value1, String value2) {
            addCriterion("psy_now_address between", value1, value2, "psyNowAddress");
            return (Criteria) this;
        }

        public Criteria andPsyNowAddressNotBetween(String value1, String value2) {
            addCriterion("psy_now_address not between", value1, value2, "psyNowAddress");
            return (Criteria) this;
        }

        public Criteria andPsyFamilyIncomeIsNull() {
            addCriterion("psy_family_income is null");
            return (Criteria) this;
        }

        public Criteria andPsyFamilyIncomeIsNotNull() {
            addCriterion("psy_family_income is not null");
            return (Criteria) this;
        }

        public Criteria andPsyFamilyIncomeEqualTo(String value) {
            addCriterion("psy_family_income =", value, "psyFamilyIncome");
            return (Criteria) this;
        }

        public Criteria andPsyFamilyIncomeNotEqualTo(String value) {
            addCriterion("psy_family_income <>", value, "psyFamilyIncome");
            return (Criteria) this;
        }

        public Criteria andPsyFamilyIncomeGreaterThan(String value) {
            addCriterion("psy_family_income >", value, "psyFamilyIncome");
            return (Criteria) this;
        }

        public Criteria andPsyFamilyIncomeGreaterThanOrEqualTo(String value) {
            addCriterion("psy_family_income >=", value, "psyFamilyIncome");
            return (Criteria) this;
        }

        public Criteria andPsyFamilyIncomeLessThan(String value) {
            addCriterion("psy_family_income <", value, "psyFamilyIncome");
            return (Criteria) this;
        }

        public Criteria andPsyFamilyIncomeLessThanOrEqualTo(String value) {
            addCriterion("psy_family_income <=", value, "psyFamilyIncome");
            return (Criteria) this;
        }

        public Criteria andPsyFamilyIncomeLike(String value) {
            addCriterion("psy_family_income like", value, "psyFamilyIncome");
            return (Criteria) this;
        }

        public Criteria andPsyFamilyIncomeNotLike(String value) {
            addCriterion("psy_family_income not like", value, "psyFamilyIncome");
            return (Criteria) this;
        }

        public Criteria andPsyFamilyIncomeIn(List<String> values) {
            addCriterion("psy_family_income in", values, "psyFamilyIncome");
            return (Criteria) this;
        }

        public Criteria andPsyFamilyIncomeNotIn(List<String> values) {
            addCriterion("psy_family_income not in", values, "psyFamilyIncome");
            return (Criteria) this;
        }

        public Criteria andPsyFamilyIncomeBetween(String value1, String value2) {
            addCriterion("psy_family_income between", value1, value2, "psyFamilyIncome");
            return (Criteria) this;
        }

        public Criteria andPsyFamilyIncomeNotBetween(String value1, String value2) {
            addCriterion("psy_family_income not between", value1, value2, "psyFamilyIncome");
            return (Criteria) this;
        }

        public Criteria andPsyIsMinimumIsNull() {
            addCriterion("psy_is_minimum is null");
            return (Criteria) this;
        }

        public Criteria andPsyIsMinimumIsNotNull() {
            addCriterion("psy_is_minimum is not null");
            return (Criteria) this;
        }

        public Criteria andPsyIsMinimumEqualTo(Boolean value) {
            addCriterion("psy_is_minimum =", value, "psyIsMinimum");
            return (Criteria) this;
        }

        public Criteria andPsyIsMinimumNotEqualTo(Boolean value) {
            addCriterion("psy_is_minimum <>", value, "psyIsMinimum");
            return (Criteria) this;
        }

        public Criteria andPsyIsMinimumGreaterThan(Boolean value) {
            addCriterion("psy_is_minimum >", value, "psyIsMinimum");
            return (Criteria) this;
        }

        public Criteria andPsyIsMinimumGreaterThanOrEqualTo(Boolean value) {
            addCriterion("psy_is_minimum >=", value, "psyIsMinimum");
            return (Criteria) this;
        }

        public Criteria andPsyIsMinimumLessThan(Boolean value) {
            addCriterion("psy_is_minimum <", value, "psyIsMinimum");
            return (Criteria) this;
        }

        public Criteria andPsyIsMinimumLessThanOrEqualTo(Boolean value) {
            addCriterion("psy_is_minimum <=", value, "psyIsMinimum");
            return (Criteria) this;
        }

        public Criteria andPsyIsMinimumIn(List<Boolean> values) {
            addCriterion("psy_is_minimum in", values, "psyIsMinimum");
            return (Criteria) this;
        }

        public Criteria andPsyIsMinimumNotIn(List<Boolean> values) {
            addCriterion("psy_is_minimum not in", values, "psyIsMinimum");
            return (Criteria) this;
        }

        public Criteria andPsyIsMinimumBetween(Boolean value1, Boolean value2) {
            addCriterion("psy_is_minimum between", value1, value2, "psyIsMinimum");
            return (Criteria) this;
        }

        public Criteria andPsyIsMinimumNotBetween(Boolean value1, Boolean value2) {
            addCriterion("psy_is_minimum not between", value1, value2, "psyIsMinimum");
            return (Criteria) this;
        }

        public Criteria andPsyGuardianNameIsNull() {
            addCriterion("psy_guardian_name is null");
            return (Criteria) this;
        }

        public Criteria andPsyGuardianNameIsNotNull() {
            addCriterion("psy_guardian_name is not null");
            return (Criteria) this;
        }

        public Criteria andPsyGuardianNameEqualTo(String value) {
            addCriterion("psy_guardian_name =", value, "psyGuardianName");
            return (Criteria) this;
        }

        public Criteria andPsyGuardianNameNotEqualTo(String value) {
            addCriterion("psy_guardian_name <>", value, "psyGuardianName");
            return (Criteria) this;
        }

        public Criteria andPsyGuardianNameGreaterThan(String value) {
            addCriterion("psy_guardian_name >", value, "psyGuardianName");
            return (Criteria) this;
        }

        public Criteria andPsyGuardianNameGreaterThanOrEqualTo(String value) {
            addCriterion("psy_guardian_name >=", value, "psyGuardianName");
            return (Criteria) this;
        }

        public Criteria andPsyGuardianNameLessThan(String value) {
            addCriterion("psy_guardian_name <", value, "psyGuardianName");
            return (Criteria) this;
        }

        public Criteria andPsyGuardianNameLessThanOrEqualTo(String value) {
            addCriterion("psy_guardian_name <=", value, "psyGuardianName");
            return (Criteria) this;
        }

        public Criteria andPsyGuardianNameLike(String value) {
            addCriterion("psy_guardian_name like", value, "psyGuardianName");
            return (Criteria) this;
        }

        public Criteria andPsyGuardianNameNotLike(String value) {
            addCriterion("psy_guardian_name not like", value, "psyGuardianName");
            return (Criteria) this;
        }

        public Criteria andPsyGuardianNameIn(List<String> values) {
            addCriterion("psy_guardian_name in", values, "psyGuardianName");
            return (Criteria) this;
        }

        public Criteria andPsyGuardianNameNotIn(List<String> values) {
            addCriterion("psy_guardian_name not in", values, "psyGuardianName");
            return (Criteria) this;
        }

        public Criteria andPsyGuardianNameBetween(String value1, String value2) {
            addCriterion("psy_guardian_name between", value1, value2, "psyGuardianName");
            return (Criteria) this;
        }

        public Criteria andPsyGuardianNameNotBetween(String value1, String value2) {
            addCriterion("psy_guardian_name not between", value1, value2, "psyGuardianName");
            return (Criteria) this;
        }

        public Criteria andPsyGuardianIdIsNull() {
            addCriterion("psy_guardian_id is null");
            return (Criteria) this;
        }

        public Criteria andPsyGuardianIdIsNotNull() {
            addCriterion("psy_guardian_id is not null");
            return (Criteria) this;
        }

        public Criteria andPsyGuardianIdEqualTo(Integer value) {
            addCriterion("psy_guardian_id =", value, "psyGuardianId");
            return (Criteria) this;
        }

        public Criteria andPsyGuardianIdNotEqualTo(Integer value) {
            addCriterion("psy_guardian_id <>", value, "psyGuardianId");
            return (Criteria) this;
        }

        public Criteria andPsyGuardianIdGreaterThan(Integer value) {
            addCriterion("psy_guardian_id >", value, "psyGuardianId");
            return (Criteria) this;
        }

        public Criteria andPsyGuardianIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("psy_guardian_id >=", value, "psyGuardianId");
            return (Criteria) this;
        }

        public Criteria andPsyGuardianIdLessThan(Integer value) {
            addCriterion("psy_guardian_id <", value, "psyGuardianId");
            return (Criteria) this;
        }

        public Criteria andPsyGuardianIdLessThanOrEqualTo(Integer value) {
            addCriterion("psy_guardian_id <=", value, "psyGuardianId");
            return (Criteria) this;
        }

        public Criteria andPsyGuardianIdIn(List<Integer> values) {
            addCriterion("psy_guardian_id in", values, "psyGuardianId");
            return (Criteria) this;
        }

        public Criteria andPsyGuardianIdNotIn(List<Integer> values) {
            addCriterion("psy_guardian_id not in", values, "psyGuardianId");
            return (Criteria) this;
        }

        public Criteria andPsyGuardianIdBetween(Integer value1, Integer value2) {
            addCriterion("psy_guardian_id between", value1, value2, "psyGuardianId");
            return (Criteria) this;
        }

        public Criteria andPsyGuardianIdNotBetween(Integer value1, Integer value2) {
            addCriterion("psy_guardian_id not between", value1, value2, "psyGuardianId");
            return (Criteria) this;
        }

        public Criteria andPsyGuardianRelationIsNull() {
            addCriterion("psy_guardian_relation is null");
            return (Criteria) this;
        }

        public Criteria andPsyGuardianRelationIsNotNull() {
            addCriterion("psy_guardian_relation is not null");
            return (Criteria) this;
        }

        public Criteria andPsyGuardianRelationEqualTo(String value) {
            addCriterion("psy_guardian_relation =", value, "psyGuardianRelation");
            return (Criteria) this;
        }

        public Criteria andPsyGuardianRelationNotEqualTo(String value) {
            addCriterion("psy_guardian_relation <>", value, "psyGuardianRelation");
            return (Criteria) this;
        }

        public Criteria andPsyGuardianRelationGreaterThan(String value) {
            addCriterion("psy_guardian_relation >", value, "psyGuardianRelation");
            return (Criteria) this;
        }

        public Criteria andPsyGuardianRelationGreaterThanOrEqualTo(String value) {
            addCriterion("psy_guardian_relation >=", value, "psyGuardianRelation");
            return (Criteria) this;
        }

        public Criteria andPsyGuardianRelationLessThan(String value) {
            addCriterion("psy_guardian_relation <", value, "psyGuardianRelation");
            return (Criteria) this;
        }

        public Criteria andPsyGuardianRelationLessThanOrEqualTo(String value) {
            addCriterion("psy_guardian_relation <=", value, "psyGuardianRelation");
            return (Criteria) this;
        }

        public Criteria andPsyGuardianRelationLike(String value) {
            addCriterion("psy_guardian_relation like", value, "psyGuardianRelation");
            return (Criteria) this;
        }

        public Criteria andPsyGuardianRelationNotLike(String value) {
            addCriterion("psy_guardian_relation not like", value, "psyGuardianRelation");
            return (Criteria) this;
        }

        public Criteria andPsyGuardianRelationIn(List<String> values) {
            addCriterion("psy_guardian_relation in", values, "psyGuardianRelation");
            return (Criteria) this;
        }

        public Criteria andPsyGuardianRelationNotIn(List<String> values) {
            addCriterion("psy_guardian_relation not in", values, "psyGuardianRelation");
            return (Criteria) this;
        }

        public Criteria andPsyGuardianRelationBetween(String value1, String value2) {
            addCriterion("psy_guardian_relation between", value1, value2, "psyGuardianRelation");
            return (Criteria) this;
        }

        public Criteria andPsyGuardianRelationNotBetween(String value1, String value2) {
            addCriterion("psy_guardian_relation not between", value1, value2, "psyGuardianRelation");
            return (Criteria) this;
        }

        public Criteria andPsyGuardianAddressIsNull() {
            addCriterion("psy_guardian_address is null");
            return (Criteria) this;
        }

        public Criteria andPsyGuardianAddressIsNotNull() {
            addCriterion("psy_guardian_address is not null");
            return (Criteria) this;
        }

        public Criteria andPsyGuardianAddressEqualTo(String value) {
            addCriterion("psy_guardian_address =", value, "psyGuardianAddress");
            return (Criteria) this;
        }

        public Criteria andPsyGuardianAddressNotEqualTo(String value) {
            addCriterion("psy_guardian_address <>", value, "psyGuardianAddress");
            return (Criteria) this;
        }

        public Criteria andPsyGuardianAddressGreaterThan(String value) {
            addCriterion("psy_guardian_address >", value, "psyGuardianAddress");
            return (Criteria) this;
        }

        public Criteria andPsyGuardianAddressGreaterThanOrEqualTo(String value) {
            addCriterion("psy_guardian_address >=", value, "psyGuardianAddress");
            return (Criteria) this;
        }

        public Criteria andPsyGuardianAddressLessThan(String value) {
            addCriterion("psy_guardian_address <", value, "psyGuardianAddress");
            return (Criteria) this;
        }

        public Criteria andPsyGuardianAddressLessThanOrEqualTo(String value) {
            addCriterion("psy_guardian_address <=", value, "psyGuardianAddress");
            return (Criteria) this;
        }

        public Criteria andPsyGuardianAddressLike(String value) {
            addCriterion("psy_guardian_address like", value, "psyGuardianAddress");
            return (Criteria) this;
        }

        public Criteria andPsyGuardianAddressNotLike(String value) {
            addCriterion("psy_guardian_address not like", value, "psyGuardianAddress");
            return (Criteria) this;
        }

        public Criteria andPsyGuardianAddressIn(List<String> values) {
            addCriterion("psy_guardian_address in", values, "psyGuardianAddress");
            return (Criteria) this;
        }

        public Criteria andPsyGuardianAddressNotIn(List<String> values) {
            addCriterion("psy_guardian_address not in", values, "psyGuardianAddress");
            return (Criteria) this;
        }

        public Criteria andPsyGuardianAddressBetween(String value1, String value2) {
            addCriterion("psy_guardian_address between", value1, value2, "psyGuardianAddress");
            return (Criteria) this;
        }

        public Criteria andPsyGuardianAddressNotBetween(String value1, String value2) {
            addCriterion("psy_guardian_address not between", value1, value2, "psyGuardianAddress");
            return (Criteria) this;
        }

        public Criteria andPsyGuardianPhoneIsNull() {
            addCriterion("psy_guardian_phone is null");
            return (Criteria) this;
        }

        public Criteria andPsyGuardianPhoneIsNotNull() {
            addCriterion("psy_guardian_phone is not null");
            return (Criteria) this;
        }

        public Criteria andPsyGuardianPhoneEqualTo(String value) {
            addCriterion("psy_guardian_phone =", value, "psyGuardianPhone");
            return (Criteria) this;
        }

        public Criteria andPsyGuardianPhoneNotEqualTo(String value) {
            addCriterion("psy_guardian_phone <>", value, "psyGuardianPhone");
            return (Criteria) this;
        }

        public Criteria andPsyGuardianPhoneGreaterThan(String value) {
            addCriterion("psy_guardian_phone >", value, "psyGuardianPhone");
            return (Criteria) this;
        }

        public Criteria andPsyGuardianPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("psy_guardian_phone >=", value, "psyGuardianPhone");
            return (Criteria) this;
        }

        public Criteria andPsyGuardianPhoneLessThan(String value) {
            addCriterion("psy_guardian_phone <", value, "psyGuardianPhone");
            return (Criteria) this;
        }

        public Criteria andPsyGuardianPhoneLessThanOrEqualTo(String value) {
            addCriterion("psy_guardian_phone <=", value, "psyGuardianPhone");
            return (Criteria) this;
        }

        public Criteria andPsyGuardianPhoneLike(String value) {
            addCriterion("psy_guardian_phone like", value, "psyGuardianPhone");
            return (Criteria) this;
        }

        public Criteria andPsyGuardianPhoneNotLike(String value) {
            addCriterion("psy_guardian_phone not like", value, "psyGuardianPhone");
            return (Criteria) this;
        }

        public Criteria andPsyGuardianPhoneIn(List<String> values) {
            addCriterion("psy_guardian_phone in", values, "psyGuardianPhone");
            return (Criteria) this;
        }

        public Criteria andPsyGuardianPhoneNotIn(List<String> values) {
            addCriterion("psy_guardian_phone not in", values, "psyGuardianPhone");
            return (Criteria) this;
        }

        public Criteria andPsyGuardianPhoneBetween(String value1, String value2) {
            addCriterion("psy_guardian_phone between", value1, value2, "psyGuardianPhone");
            return (Criteria) this;
        }

        public Criteria andPsyGuardianPhoneNotBetween(String value1, String value2) {
            addCriterion("psy_guardian_phone not between", value1, value2, "psyGuardianPhone");
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
     * 患者基本信息
     *  domain 对应表：psy_basic_info
     *
     * @mbggenerated do_not_delete_during_merge
     */
    public static class Criteria extends GeneratedCriteria { 


        protected Criteria() {
            super();
        }
    }

    /**
     *  患者基本信息
     *   对应表： 
     *    psy_basic_info
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