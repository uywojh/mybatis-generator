package com.tianque.xueliang.psychosis.mapping;

import com.tianque.xueliang.psychosis.domain.PsyTrouble;
import com.tianque.xueliang.psychosis.domain.PsyTroubleExample;
import com.yimama.core.mybatis.SqlMapper;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
 *  肇事肇祸信息  Mapper (DAO) 
 *   对应表： 
 *    psy_trouble
 *
 * @mbggenerated
 */
public interface PsyTroubleMapper extends SqlMapper {
    /**
     *  根据条件返回统计count
     *  对应表:  psy_trouble
     *
     * @mbggenerated
     */
    int countByExample(PsyTroubleExample example);

    /**
     *  根据条件删除
     *  对应表:  psy_trouble
     *
     * @mbggenerated
     */
    int deleteByExample(PsyTroubleExample example);

    /**
     *  根据主键删除
     *  对应表:  psy_trouble
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Long id);

    /**
     *  新增
     *  对应表:  psy_trouble
     *
     * @mbggenerated
     */
    int insert(PsyTrouble record);

    /**
     *  新增（忽略空数据）
     *  对应表:  psy_trouble
     *
     * @mbggenerated
     */
    int insertSelective(PsyTrouble record);

    /**
     *  根据条件查询用户（包括大文本字段）
     *  对应表:  psy_trouble
     *
     * @mbggenerated
     */
    List<PsyTrouble> selectByExampleWithBLOBs(PsyTroubleExample example);

    /**
     *  根据条件查询用户（不包括大文本字段）
     *  对应表:  psy_trouble
     *
     * @mbggenerated
     */
    List<PsyTrouble> selectByExample(PsyTroubleExample example);

    /**
     *  根据条件返回唯一用户（包括大文本字段）
     *  对应表:  psy_trouble
     *
     * @mbggenerated
     */
    PsyTrouble selectScalarByExampleWithBLOBs(PsyTroubleExample example);

    /**
     *  根据条件返回唯一用户（不包括大文本字段）
     *  对应表:  psy_trouble
     *
     * @mbggenerated
     */
    PsyTrouble selectScalarByExample(PsyTroubleExample example);

    /**
     *  根据主键查询用户
     *  对应表:  psy_trouble
     *
     * @mbggenerated
     */
    PsyTrouble selectByPrimaryKey(Long id);

    /**
     *  根据条件更新用户（忽略空字段）
     *  对应表:  psy_trouble
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") PsyTrouble record, @Param("example") PsyTroubleExample example);

    /**
     *  根据条件更新用户（包括大文本字段）
     *  对应表:  psy_trouble
     *
     * @mbggenerated
     */
    int updateByExampleWithBLOBs(@Param("record") PsyTrouble record, @Param("example") PsyTroubleExample example);

    /**
     *  根据条件更新用户（不包括大文本字段）
     *  对应表:  psy_trouble
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") PsyTrouble record, @Param("example") PsyTroubleExample example);

    /**
     *  根据主键更新用户（不包括空字段）
     *  对应表:  psy_trouble
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(PsyTrouble record);

    /**
     *  根据主键更新用户（包括大文本字段）
     *  对应表:  psy_trouble
     *
     * @mbggenerated
     */
    int updateByPrimaryKeyWithBLOBs(PsyTrouble record);

    /**
     *  根据主键更新用户（不包括大文本字段）
     *  对应表:  psy_trouble
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(PsyTrouble record);
}