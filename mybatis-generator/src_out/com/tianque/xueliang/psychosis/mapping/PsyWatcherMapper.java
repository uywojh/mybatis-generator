package com.tianque.xueliang.psychosis.mapping;

import com.tianque.xueliang.psychosis.domain.PsyWatcher;
import com.tianque.xueliang.psychosis.domain.PsyWatcherExample;
import com.yimama.core.mybatis.SqlMapper;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
 *  患者监管人信息  Mapper (DAO) 
 *   对应表： 
 *    psy_watcher
 *
 * @mbggenerated
 */
public interface PsyWatcherMapper extends SqlMapper {
    /**
     *  根据条件返回统计count
     *  对应表:  psy_watcher
     *
     * @mbggenerated
     */
    int countByExample(PsyWatcherExample example);

    /**
     *  根据条件删除
     *  对应表:  psy_watcher
     *
     * @mbggenerated
     */
    int deleteByExample(PsyWatcherExample example);

    /**
     *  根据主键删除
     *  对应表:  psy_watcher
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Long id);

    /**
     *  新增
     *  对应表:  psy_watcher
     *
     * @mbggenerated
     */
    int insert(PsyWatcher record);

    /**
     *  新增（忽略空数据）
     *  对应表:  psy_watcher
     *
     * @mbggenerated
     */
    int insertSelective(PsyWatcher record);

    /**
     *  根据条件查询用户（不包括大文本字段）
     *  对应表:  psy_watcher
     *
     * @mbggenerated
     */
    List<PsyWatcher> selectByExample(PsyWatcherExample example);

    /**
     *  根据条件返回唯一用户（不包括大文本字段）
     *  对应表:  psy_watcher
     *
     * @mbggenerated
     */
    PsyWatcher selectScalarByExample(PsyWatcherExample example);

    /**
     *  根据主键查询用户
     *  对应表:  psy_watcher
     *
     * @mbggenerated
     */
    PsyWatcher selectByPrimaryKey(Long id);

    /**
     *  根据条件更新用户（忽略空字段）
     *  对应表:  psy_watcher
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") PsyWatcher record, @Param("example") PsyWatcherExample example);

    /**
     *  根据条件更新用户（不包括大文本字段）
     *  对应表:  psy_watcher
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") PsyWatcher record, @Param("example") PsyWatcherExample example);

    /**
     *  根据主键更新用户（不包括空字段）
     *  对应表:  psy_watcher
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(PsyWatcher record);

    /**
     *  根据主键更新用户（不包括大文本字段）
     *  对应表:  psy_watcher
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(PsyWatcher record);
}