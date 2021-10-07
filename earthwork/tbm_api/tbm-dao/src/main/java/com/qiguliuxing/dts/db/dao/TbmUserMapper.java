package com.qiguliuxing.dts.db.dao;

import com.qiguliuxing.dts.db.domain.TbmUser;
import com.qiguliuxing.dts.db.domain.TbmUserExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbmUserMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dts_user
     *
     * @mbg.generated
     */
    long countByExample(TbmUserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dts_user
     *
     * @mbg.generated
     */
    int deleteByExample(TbmUserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dts_user
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dts_user
     *
     * @mbg.generated
     */
    int insert(TbmUser record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dts_user
     *
     * @mbg.generated
     */
    int insertSelective(TbmUser record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dts_user
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    TbmUser selectOneByExample(TbmUserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dts_user
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    TbmUser selectOneByExampleSelective(@Param("example") TbmUserExample example, @Param("selective") TbmUser.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dts_user
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    List<TbmUser> selectByExampleSelective(@Param("example") TbmUserExample example, @Param("selective") TbmUser.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dts_user
     *
     * @mbg.generated
     */
    List<TbmUser> selectByExample(TbmUserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dts_user
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    TbmUser selectByPrimaryKeySelective(@Param("id") Integer id, @Param("selective") TbmUser.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dts_user
     *
     * @mbg.generated
     */
    TbmUser selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dts_user
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    TbmUser selectByPrimaryKeyWithLogicalDelete(@Param("id") Integer id, @Param("andLogicalDeleted") boolean andLogicalDeleted);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dts_user
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") TbmUser record, @Param("example") TbmUserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dts_user
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") TbmUser record, @Param("example") TbmUserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dts_user
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(TbmUser record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dts_user
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(TbmUser record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dts_user
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    int logicalDeleteByExample(@Param("example") TbmUserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dts_user
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    int logicalDeleteByPrimaryKey(Integer id);
}