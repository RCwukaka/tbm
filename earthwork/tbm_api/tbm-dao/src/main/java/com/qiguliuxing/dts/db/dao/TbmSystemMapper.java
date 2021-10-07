package com.qiguliuxing.dts.db.dao;

import com.qiguliuxing.dts.db.domain.TbmSystem;
import com.qiguliuxing.dts.db.domain.TbmSystemExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbmSystemMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dts_system
     *
     * @mbg.generated
     */
    long countByExample(TbmSystemExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dts_system
     *
     * @mbg.generated
     */
    int deleteByExample(TbmSystemExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dts_system
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dts_system
     *
     * @mbg.generated
     */
    int insert(TbmSystem record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dts_system
     *
     * @mbg.generated
     */
    int insertSelective(TbmSystem record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dts_system
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    TbmSystem selectOneByExample(TbmSystemExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dts_system
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    TbmSystem selectOneByExampleSelective(@Param("example") TbmSystemExample example, @Param("selective") TbmSystem.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dts_system
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    List<TbmSystem> selectByExampleSelective(@Param("example") TbmSystemExample example, @Param("selective") TbmSystem.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dts_system
     *
     * @mbg.generated
     */
    List<TbmSystem> selectByExample(TbmSystemExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dts_system
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    TbmSystem selectByPrimaryKeySelective(@Param("id") Integer id, @Param("selective") TbmSystem.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dts_system
     *
     * @mbg.generated
     */
    TbmSystem selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dts_system
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    TbmSystem selectByPrimaryKeyWithLogicalDelete(@Param("id") Integer id, @Param("andLogicalDeleted") boolean andLogicalDeleted);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dts_system
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") TbmSystem record, @Param("example") TbmSystemExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dts_system
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") TbmSystem record, @Param("example") TbmSystemExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dts_system
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(TbmSystem record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dts_system
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(TbmSystem record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dts_system
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    int logicalDeleteByExample(@Param("example") TbmSystemExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dts_system
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    int logicalDeleteByPrimaryKey(Integer id);
}