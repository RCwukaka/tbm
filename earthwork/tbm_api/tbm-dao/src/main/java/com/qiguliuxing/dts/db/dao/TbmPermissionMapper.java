package com.qiguliuxing.dts.db.dao;

import com.qiguliuxing.dts.db.domain.TbmPermission;
import com.qiguliuxing.dts.db.domain.TbmPermissionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbmPermissionMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dts_permission
     *
     * @mbg.generated
     */
    long countByExample(TbmPermissionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dts_permission
     *
     * @mbg.generated
     */
    int deleteByExample(TbmPermissionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dts_permission
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dts_permission
     *
     * @mbg.generated
     */
    int insert(TbmPermission record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dts_permission
     *
     * @mbg.generated
     */
    int insertSelective(TbmPermission record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dts_permission
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    TbmPermission selectOneByExample(TbmPermissionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dts_permission
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    TbmPermission selectOneByExampleSelective(@Param("example") TbmPermissionExample example, @Param("selective") TbmPermission.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dts_permission
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    List<TbmPermission> selectByExampleSelective(@Param("example") TbmPermissionExample example, @Param("selective") TbmPermission.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dts_permission
     *
     * @mbg.generated
     */
    List<TbmPermission> selectByExample(TbmPermissionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dts_permission
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    TbmPermission selectByPrimaryKeySelective(@Param("id") Integer id, @Param("selective") TbmPermission.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dts_permission
     *
     * @mbg.generated
     */
    TbmPermission selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dts_permission
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    TbmPermission selectByPrimaryKeyWithLogicalDelete(@Param("id") Integer id, @Param("andLogicalDeleted") boolean andLogicalDeleted);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dts_permission
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") TbmPermission record, @Param("example") TbmPermissionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dts_permission
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") TbmPermission record, @Param("example") TbmPermissionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dts_permission
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(TbmPermission record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dts_permission
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(TbmPermission record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dts_permission
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    int logicalDeleteByExample(@Param("example") TbmPermissionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dts_permission
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    int logicalDeleteByPrimaryKey(Integer id);
}