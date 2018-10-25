package com.tianque.xueliang.psychosis.mapping;

import com.tianque.xueliang.psychosis.domain.PsyBasicInfo;
import com.tianque.xueliang.psychosis.domain.PsyBasicInfoExample;
import com.yimama.core.mybatis.SqlMapper;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
 *  患者基本信息  Mapper (DAO) 
 *   对应表： 
 *    psy_basic_info
 *
 * @mbggenerated
 */
public interface PsyBasicInfoMapper extends SqlMapper {
    /**
     *  根据条件返回统计count
     *  对应表:  psy_basic_info
     *
     * @mbggenerated
     */
    int countByExample(PsyBasicInfoExample example);

    /**
     *  根据条件删除
     *  对应表:  psy_basic_info
     *
     * @mbggenerated
     */
    int deleteByExample(PsyBasicInfoExample example);

    /**
     *  根据主键删除
     *  对应表:  psy_basic_info
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Long id);

    /**
     *  新增
     *  对应表:  psy_basic_info
     *
     * @mbggenerated
     */
    int insert(PsyBasicInfo record);

    /**
     *  新增（忽略空数据）
     *  对应表:  psy_basic_info
     *
     * @mbggenerated
     */
    int insertSelective(PsyBasicInfo record);

    /**
     *  根据条件查询用户（包括大文本字段）
     *  对应表:  psy_basic_info
     *
     * @mbggenerated
     */
    List<PsyBasicInfo> selectByExampleWithBLOBs(PsyBasicInfoExample example);

    /**
     *  根据条件查询用户（不包括大文本字段）
     *  对应表:  psy_basic_info
     *
     * @mbggenerated
     */
    List<PsyBasicInfo> selectByExample(PsyBasicInfoExample example);

    /**
     *  根据条件返回唯一用户（包括大文本字段）
     *  对应表:  psy_basic_info
     *
     * @mbggenerated
     */
    PsyBasicInfo selectScalarByExampleWithBLOBs(PsyBasicInfoExample example);

    /**
     *  根据条件返回唯一用户（不包括大文本字段）
     *  对应表:  psy_basic_info
     *
     * @mbggenerated
     */
    PsyBasicInfo selectScalarByExample(PsyBasicInfoExample example);

    /**
     *  根据主键查询用户
     *  对应表:  psy_basic_info
     *
     * @mbggenerated
     */
    PsyBasicInfo selectByPrimaryKey(Long id);

    /**
     *  根据条件更新用户（忽略空字段）
     *  对应表:  psy_basic_info
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") PsyBasicInfo record, @Param("example") PsyBasicInfoExample example);

    /**
     *  根据条件更新用户（包括大文本字段）
     *  对应表:  psy_basic_info
     *
     * @mbggenerated
     */
    int updateByExampleWithBLOBs(@Param("record") PsyBasicInfo record, @Param("example") PsyBasicInfoExample example);

    /**
     *  根据条件更新用户（不包括大文本字段）
     *  对应表:  psy_basic_info
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") PsyBasicInfo record, @Param("example") PsyBasicInfoExample example);

    /**
     *  根据主键更新用户（不包括空字段）
     *  对应表:  psy_basic_info
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(PsyBasicInfo record);

    /**
     *  根据主键更新用户（包括大文本字段）
     *  对应表:  psy_basic_info
     *
     * @mbggenerated
     */
    int updateByPrimaryKeyWithBLOBs(PsyBasicInfo record);

    /**
     *  根据主键更新用户（不包括大文本字段）
     *  对应表:  psy_basic_info
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(PsyBasicInfo record);
}