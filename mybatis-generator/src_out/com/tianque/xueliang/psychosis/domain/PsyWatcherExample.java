package com.tianque.xueliang.psychosis.domain;

import com.yimama.core.query.ABaseDaoFilter;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *  患者监管人信息  mapper 操作过滤器
 *   对应表： 
 *    psy_watcher
 *
 * @mbggenerated
 */
public class PsyWatcherExample extends ABaseDaoFilter<PsyWatcherExample.Criteria> { 

    /**
     * orderByClause
     * 对应表： 
     *   psy_watcher
     *
     * @mbggenerated
     */
    protected String orderByClause;

    /**
     * distinct
     * 对应表： 
     *   psy_watcher
     *
     * @mbggenerated
     */
    protected boolean distinct;

    /**
     * oredCriteria
     * 对应表： 
     *   psy_watcher
     *
     * @mbggenerated
     */
    protected List<Criteria> oredCriteria;

    /**
     *  对应表:  psy_watcher
     *
     * @mbggenerated
     */
    public PsyWatcherExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public Criteria getScalarExistedCriteria() {
        if(oredCriteria!=null && oredCriteria.size()>0){
            	return oredCriteria.get(0);
        }
        return or();
    }

    /**
     *  对应表:  psy_watcher
     *
     * @mbggenerated
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     *  对应表:  psy_watcher
     *
     * @mbggenerated
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     *  对应表:  psy_watcher
     *
     * @mbggenerated
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     *  对应表:  psy_watcher
     *
     * @mbggenerated
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     *  对应表:  psy_watcher
     *
     * @mbggenerated
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     *  对应表:  psy_watcher
     *
     * @mbggenerated
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     *  对应表:  psy_watcher
     *
     * @mbggenerated
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     *  对应表:  psy_watcher
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
     *  对应表:  psy_watcher
     *
     * @mbggenerated
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     *  对应表:  psy_watcher
     *
     * @mbggenerated
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     *  患者监管人信息
     *   对应表： 
     *    psy_watcher
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

        public Criteria andWatcherNameIsNull() {
            addCriterion("watcher_name is null");
            return (Criteria) this;
        }

        public Criteria andWatcherNameIsNotNull() {
            addCriterion("watcher_name is not null");
            return (Criteria) this;
        }

        public Criteria andWatcherNameEqualTo(String value) {
            addCriterion("watcher_name =", value, "watcherName");
            return (Criteria) this;
        }

        public Criteria andWatcherNameNotEqualTo(String value) {
            addCriterion("watcher_name <>", value, "watcherName");
            return (Criteria) this;
        }

        public Criteria andWatcherNameGreaterThan(String value) {
            addCriterion("watcher_name >", value, "watcherName");
            return (Criteria) this;
        }

        public Criteria andWatcherNameGreaterThanOrEqualTo(String value) {
            addCriterion("watcher_name >=", value, "watcherName");
            return (Criteria) this;
        }

        public Criteria andWatcherNameLessThan(String value) {
            addCriterion("watcher_name <", value, "watcherName");
            return (Criteria) this;
        }

        public Criteria andWatcherNameLessThanOrEqualTo(String value) {
            addCriterion("watcher_name <=", value, "watcherName");
            return (Criteria) this;
        }

        public Criteria andWatcherNameLike(String value) {
            addCriterion("watcher_name like", value, "watcherName");
            return (Criteria) this;
        }

        public Criteria andWatcherNameNotLike(String value) {
            addCriterion("watcher_name not like", value, "watcherName");
            return (Criteria) this;
        }

        public Criteria andWatcherNameIn(List<String> values) {
            addCriterion("watcher_name in", values, "watcherName");
            return (Criteria) this;
        }

        public Criteria andWatcherNameNotIn(List<String> values) {
            addCriterion("watcher_name not in", values, "watcherName");
            return (Criteria) this;
        }

        public Criteria andWatcherNameBetween(String value1, String value2) {
            addCriterion("watcher_name between", value1, value2, "watcherName");
            return (Criteria) this;
        }

        public Criteria andWatcherNameNotBetween(String value1, String value2) {
            addCriterion("watcher_name not between", value1, value2, "watcherName");
            return (Criteria) this;
        }

        public Criteria andWatcherPositionIsNull() {
            addCriterion("watcher_position is null");
            return (Criteria) this;
        }

        public Criteria andWatcherPositionIsNotNull() {
            addCriterion("watcher_position is not null");
            return (Criteria) this;
        }

        public Criteria andWatcherPositionEqualTo(String value) {
            addCriterion("watcher_position =", value, "watcherPosition");
            return (Criteria) this;
        }

        public Criteria andWatcherPositionNotEqualTo(String value) {
            addCriterion("watcher_position <>", value, "watcherPosition");
            return (Criteria) this;
        }

        public Criteria andWatcherPositionGreaterThan(String value) {
            addCriterion("watcher_position >", value, "watcherPosition");
            return (Criteria) this;
        }

        public Criteria andWatcherPositionGreaterThanOrEqualTo(String value) {
            addCriterion("watcher_position >=", value, "watcherPosition");
            return (Criteria) this;
        }

        public Criteria andWatcherPositionLessThan(String value) {
            addCriterion("watcher_position <", value, "watcherPosition");
            return (Criteria) this;
        }

        public Criteria andWatcherPositionLessThanOrEqualTo(String value) {
            addCriterion("watcher_position <=", value, "watcherPosition");
            return (Criteria) this;
        }

        public Criteria andWatcherPositionLike(String value) {
            addCriterion("watcher_position like", value, "watcherPosition");
            return (Criteria) this;
        }

        public Criteria andWatcherPositionNotLike(String value) {
            addCriterion("watcher_position not like", value, "watcherPosition");
            return (Criteria) this;
        }

        public Criteria andWatcherPositionIn(List<String> values) {
            addCriterion("watcher_position in", values, "watcherPosition");
            return (Criteria) this;
        }

        public Criteria andWatcherPositionNotIn(List<String> values) {
            addCriterion("watcher_position not in", values, "watcherPosition");
            return (Criteria) this;
        }

        public Criteria andWatcherPositionBetween(String value1, String value2) {
            addCriterion("watcher_position between", value1, value2, "watcherPosition");
            return (Criteria) this;
        }

        public Criteria andWatcherPositionNotBetween(String value1, String value2) {
            addCriterion("watcher_position not between", value1, value2, "watcherPosition");
            return (Criteria) this;
        }

        public Criteria andWatcherJobIsNull() {
            addCriterion("watcher_job is null");
            return (Criteria) this;
        }

        public Criteria andWatcherJobIsNotNull() {
            addCriterion("watcher_job is not null");
            return (Criteria) this;
        }

        public Criteria andWatcherJobEqualTo(String value) {
            addCriterion("watcher_job =", value, "watcherJob");
            return (Criteria) this;
        }

        public Criteria andWatcherJobNotEqualTo(String value) {
            addCriterion("watcher_job <>", value, "watcherJob");
            return (Criteria) this;
        }

        public Criteria andWatcherJobGreaterThan(String value) {
            addCriterion("watcher_job >", value, "watcherJob");
            return (Criteria) this;
        }

        public Criteria andWatcherJobGreaterThanOrEqualTo(String value) {
            addCriterion("watcher_job >=", value, "watcherJob");
            return (Criteria) this;
        }

        public Criteria andWatcherJobLessThan(String value) {
            addCriterion("watcher_job <", value, "watcherJob");
            return (Criteria) this;
        }

        public Criteria andWatcherJobLessThanOrEqualTo(String value) {
            addCriterion("watcher_job <=", value, "watcherJob");
            return (Criteria) this;
        }

        public Criteria andWatcherJobLike(String value) {
            addCriterion("watcher_job like", value, "watcherJob");
            return (Criteria) this;
        }

        public Criteria andWatcherJobNotLike(String value) {
            addCriterion("watcher_job not like", value, "watcherJob");
            return (Criteria) this;
        }

        public Criteria andWatcherJobIn(List<String> values) {
            addCriterion("watcher_job in", values, "watcherJob");
            return (Criteria) this;
        }

        public Criteria andWatcherJobNotIn(List<String> values) {
            addCriterion("watcher_job not in", values, "watcherJob");
            return (Criteria) this;
        }

        public Criteria andWatcherJobBetween(String value1, String value2) {
            addCriterion("watcher_job between", value1, value2, "watcherJob");
            return (Criteria) this;
        }

        public Criteria andWatcherJobNotBetween(String value1, String value2) {
            addCriterion("watcher_job not between", value1, value2, "watcherJob");
            return (Criteria) this;
        }

        public Criteria andPositionOrgIsNull() {
            addCriterion("position_org is null");
            return (Criteria) this;
        }

        public Criteria andPositionOrgIsNotNull() {
            addCriterion("position_org is not null");
            return (Criteria) this;
        }

        public Criteria andPositionOrgEqualTo(String value) {
            addCriterion("position_org =", value, "positionOrg");
            return (Criteria) this;
        }

        public Criteria andPositionOrgNotEqualTo(String value) {
            addCriterion("position_org <>", value, "positionOrg");
            return (Criteria) this;
        }

        public Criteria andPositionOrgGreaterThan(String value) {
            addCriterion("position_org >", value, "positionOrg");
            return (Criteria) this;
        }

        public Criteria andPositionOrgGreaterThanOrEqualTo(String value) {
            addCriterion("position_org >=", value, "positionOrg");
            return (Criteria) this;
        }

        public Criteria andPositionOrgLessThan(String value) {
            addCriterion("position_org <", value, "positionOrg");
            return (Criteria) this;
        }

        public Criteria andPositionOrgLessThanOrEqualTo(String value) {
            addCriterion("position_org <=", value, "positionOrg");
            return (Criteria) this;
        }

        public Criteria andPositionOrgLike(String value) {
            addCriterion("position_org like", value, "positionOrg");
            return (Criteria) this;
        }

        public Criteria andPositionOrgNotLike(String value) {
            addCriterion("position_org not like", value, "positionOrg");
            return (Criteria) this;
        }

        public Criteria andPositionOrgIn(List<String> values) {
            addCriterion("position_org in", values, "positionOrg");
            return (Criteria) this;
        }

        public Criteria andPositionOrgNotIn(List<String> values) {
            addCriterion("position_org not in", values, "positionOrg");
            return (Criteria) this;
        }

        public Criteria andPositionOrgBetween(String value1, String value2) {
            addCriterion("position_org between", value1, value2, "positionOrg");
            return (Criteria) this;
        }

        public Criteria andPositionOrgNotBetween(String value1, String value2) {
            addCriterion("position_org not between", value1, value2, "positionOrg");
            return (Criteria) this;
        }

        public Criteria andPositionRegionIsNull() {
            addCriterion("position_region is null");
            return (Criteria) this;
        }

        public Criteria andPositionRegionIsNotNull() {
            addCriterion("position_region is not null");
            return (Criteria) this;
        }

        public Criteria andPositionRegionEqualTo(String value) {
            addCriterion("position_region =", value, "positionRegion");
            return (Criteria) this;
        }

        public Criteria andPositionRegionNotEqualTo(String value) {
            addCriterion("position_region <>", value, "positionRegion");
            return (Criteria) this;
        }

        public Criteria andPositionRegionGreaterThan(String value) {
            addCriterion("position_region >", value, "positionRegion");
            return (Criteria) this;
        }

        public Criteria andPositionRegionGreaterThanOrEqualTo(String value) {
            addCriterion("position_region >=", value, "positionRegion");
            return (Criteria) this;
        }

        public Criteria andPositionRegionLessThan(String value) {
            addCriterion("position_region <", value, "positionRegion");
            return (Criteria) this;
        }

        public Criteria andPositionRegionLessThanOrEqualTo(String value) {
            addCriterion("position_region <=", value, "positionRegion");
            return (Criteria) this;
        }

        public Criteria andPositionRegionLike(String value) {
            addCriterion("position_region like", value, "positionRegion");
            return (Criteria) this;
        }

        public Criteria andPositionRegionNotLike(String value) {
            addCriterion("position_region not like", value, "positionRegion");
            return (Criteria) this;
        }

        public Criteria andPositionRegionIn(List<String> values) {
            addCriterion("position_region in", values, "positionRegion");
            return (Criteria) this;
        }

        public Criteria andPositionRegionNotIn(List<String> values) {
            addCriterion("position_region not in", values, "positionRegion");
            return (Criteria) this;
        }

        public Criteria andPositionRegionBetween(String value1, String value2) {
            addCriterion("position_region between", value1, value2, "positionRegion");
            return (Criteria) this;
        }

        public Criteria andPositionRegionNotBetween(String value1, String value2) {
            addCriterion("position_region not between", value1, value2, "positionRegion");
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
     * 患者监管人信息
     *  domain 对应表：psy_watcher
     *
     * @mbggenerated do_not_delete_during_merge
     */
    public static class Criteria extends GeneratedCriteria { 


        protected Criteria() {
            super();
        }
    }

    /**
     *  患者监管人信息
     *   对应表： 
     *    psy_watcher
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