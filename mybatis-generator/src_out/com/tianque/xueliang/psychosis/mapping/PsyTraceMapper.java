package com.tianque.xueliang.psychosis.mapping;

import com.tianque.xueliang.psychosis.domain.PsyTrace;
import com.tianque.xueliang.psychosis.domain.PsyTraceExample;
import com.yimama.core.mybatis.SqlMapper;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
 *  患者轨迹信息  Mapper (DAO) 
 *   对应表： 
 *    psy_trace
 *
 * @mbggenerated
 */
public interface PsyTraceMapper extends SqlMapper {
    /**
     *  根据条件返回统计count
     *  对应表:  psy_trace
     *
     * @mbggenerated
     */
    int countByExample(PsyTraceExample example);

    /**
     *  根据条件删除
     *  对应表:  psy_trace
     *
     * @mbggenerated
     */
    int deleteByExample(PsyTraceExample example);

    /**
     *  根据主键删除
     *  对应表:  psy_trace
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Long id);

    /**
     *  新增
     *  对应表:  psy_trace
     *
     * @mbggenerated
     */
    int insert(PsyTrace record);

    /**
     *  新增（忽略空数据）
     *  对应表:  psy_trace
     *
     * @mbggenerated
     */
    int insertSelective(PsyTrace record);

    /**
     *  根据条件查询用户（不包括大文本字段）
     *  对应表:  psy_trace
     *
     * @mbggenerated
     */
    List<PsyTrace> selectByExample(PsyTraceExample example);

    /**
     *  根据条件返回唯一用户（不包括大文本字段）
     *  对应表:  psy_trace
     *
     * @mbggenerated
     */
    PsyTrace selectScalarByExample(PsyTraceExample example);

    /**
     *  根据主键查询用户
     *  对应表:  psy_trace
     *
     * @mbggenerated
     */
    PsyTrace selectByPrimaryKey(Long id);

    /**
     *  根据条件更新用户（忽略空字段）
     *  对应表:  psy_trace
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") PsyTrace record, @Param("example") PsyTraceExample example);

    /**
     *  根据条件更新用户（不包括大文本字段）
     *  对应表:  psy_trace
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") PsyTrace record, @Param("example") PsyTraceExample example);

    /**
     *  根据主键更新用户（不包括空字段）
     *  对应表:  psy_trace
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(PsyTrace record);

    /**
     *  根据主键更新用户（不包括大文本字段）
     *  对应表:  psy_trace
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(PsyTrace record);
}