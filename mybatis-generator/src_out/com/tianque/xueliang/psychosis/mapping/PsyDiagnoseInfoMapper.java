package com.tianque.xueliang.psychosis.mapping;

import com.tianque.xueliang.psychosis.domain.PsyDiagnoseInfo;
import com.tianque.xueliang.psychosis.domain.PsyDiagnoseInfoExample;
import com.yimama.core.mybatis.SqlMapper;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
 *  患者诊断信息  Mapper (DAO) 
 *   对应表： 
 *    psy_diagnose_info
 *
 * @mbggenerated
 */
public interface PsyDiagnoseInfoMapper extends SqlMapper {
    /**
     *  根据条件返回统计count
     *  对应表:  psy_diagnose_info
     *
     * @mbggenerated
     */
    int countByExample(PsyDiagnoseInfoExample example);

    /**
     *  根据条件删除
     *  对应表:  psy_diagnose_info
     *
     * @mbggenerated
     */
    int deleteByExample(PsyDiagnoseInfoExample example);

    /**
     *  根据主键删除
     *  对应表:  psy_diagnose_info
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Long id);

    /**
     *  新增
     *  对应表:  psy_diagnose_info
     *
     * @mbggenerated
     */
    int insert(PsyDiagnoseInfo record);

    /**
     *  新增（忽略空数据）
     *  对应表:  psy_diagnose_info
     *
     * @mbggenerated
     */
    int insertSelective(PsyDiagnoseInfo record);

    /**
     *  根据条件查询用户（不包括大文本字段）
     *  对应表:  psy_diagnose_info
     *
     * @mbggenerated
     */
    List<PsyDiagnoseInfo> selectByExample(PsyDiagnoseInfoExample example);

    /**
     *  根据条件返回唯一用户（不包括大文本字段）
     *  对应表:  psy_diagnose_info
     *
     * @mbggenerated
     */
    PsyDiagnoseInfo selectScalarByExample(PsyDiagnoseInfoExample example);

    /**
     *  根据主键查询用户
     *  对应表:  psy_diagnose_info
     *
     * @mbggenerated
     */
    PsyDiagnoseInfo selectByPrimaryKey(Long id);

    /**
     *  根据条件更新用户（忽略空字段）
     *  对应表:  psy_diagnose_info
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") PsyDiagnoseInfo record, @Param("example") PsyDiagnoseInfoExample example);

    /**
     *  根据条件更新用户（不包括大文本字段）
     *  对应表:  psy_diagnose_info
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") PsyDiagnoseInfo record, @Param("example") PsyDiagnoseInfoExample example);

    /**
     *  根据主键更新用户（不包括空字段）
     *  对应表:  psy_diagnose_info
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(PsyDiagnoseInfo record);

    /**
     *  根据主键更新用户（不包括大文本字段）
     *  对应表:  psy_diagnose_info
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(PsyDiagnoseInfo record);
}