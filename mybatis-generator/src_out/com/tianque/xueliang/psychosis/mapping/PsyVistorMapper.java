package com.tianque.xueliang.psychosis.mapping;

import com.tianque.xueliang.psychosis.domain.PsyVistor;
import com.tianque.xueliang.psychosis.domain.PsyVistorExample;
import com.yimama.core.mybatis.SqlMapper;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
 *  日常走访信息  Mapper (DAO) 
 *   对应表： 
 *    psy_vistor
 *
 * @mbggenerated
 */
public interface PsyVistorMapper extends SqlMapper {
    /**
     *  根据条件返回统计count
     *  对应表:  psy_vistor
     *
     * @mbggenerated
     */
    int countByExample(PsyVistorExample example);

    /**
     *  根据条件删除
     *  对应表:  psy_vistor
     *
     * @mbggenerated
     */
    int deleteByExample(PsyVistorExample example);

    /**
     *  根据主键删除
     *  对应表:  psy_vistor
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Long id);

    /**
     *  新增
     *  对应表:  psy_vistor
     *
     * @mbggenerated
     */
    int insert(PsyVistor record);

    /**
     *  新增（忽略空数据）
     *  对应表:  psy_vistor
     *
     * @mbggenerated
     */
    int insertSelective(PsyVistor record);

    /**
     *  根据条件查询用户（包括大文本字段）
     *  对应表:  psy_vistor
     *
     * @mbggenerated
     */
    List<PsyVistor> selectByExampleWithBLOBs(PsyVistorExample example);

    /**
     *  根据条件查询用户（不包括大文本字段）
     *  对应表:  psy_vistor
     *
     * @mbggenerated
     */
    List<PsyVistor> selectByExample(PsyVistorExample example);

    /**
     *  根据条件返回唯一用户（包括大文本字段）
     *  对应表:  psy_vistor
     *
     * @mbggenerated
     */
    PsyVistor selectScalarByExampleWithBLOBs(PsyVistorExample example);

    /**
     *  根据条件返回唯一用户（不包括大文本字段）
     *  对应表:  psy_vistor
     *
     * @mbggenerated
     */
    PsyVistor selectScalarByExample(PsyVistorExample example);

    /**
     *  根据主键查询用户
     *  对应表:  psy_vistor
     *
     * @mbggenerated
     */
    PsyVistor selectByPrimaryKey(Long id);

    /**
     *  根据条件更新用户（忽略空字段）
     *  对应表:  psy_vistor
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") PsyVistor record, @Param("example") PsyVistorExample example);

    /**
     *  根据条件更新用户（包括大文本字段）
     *  对应表:  psy_vistor
     *
     * @mbggenerated
     */
    int updateByExampleWithBLOBs(@Param("record") PsyVistor record, @Param("example") PsyVistorExample example);

    /**
     *  根据条件更新用户（不包括大文本字段）
     *  对应表:  psy_vistor
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") PsyVistor record, @Param("example") PsyVistorExample example);

    /**
     *  根据主键更新用户（不包括空字段）
     *  对应表:  psy_vistor
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(PsyVistor record);

    /**
     *  根据主键更新用户（包括大文本字段）
     *  对应表:  psy_vistor
     *
     * @mbggenerated
     */
    int updateByPrimaryKeyWithBLOBs(PsyVistor record);

    /**
     *  根据主键更新用户（不包括大文本字段）
     *  对应表:  psy_vistor
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(PsyVistor record);
}