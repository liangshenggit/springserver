package cn.tiantianquan.springantbasicserver.repository.entityMapper;

import cn.tiantianquan.springantbasicserver.entity.PmUserAndRole;
import cn.tiantianquan.springantbasicserver.entity.PmUserAndRoleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PmUserAndRoleMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pm_user_and_role
     *
     * @mbg.generated
     */
    long countByExample(PmUserAndRoleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pm_user_and_role
     *
     * @mbg.generated
     */
    int deleteByExample(PmUserAndRoleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pm_user_and_role
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(@Param("userId") String userId, @Param("roleId") String roleId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pm_user_and_role
     *
     * @mbg.generated
     */
    int insert(PmUserAndRole record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pm_user_and_role
     *
     * @mbg.generated
     */
    int insertSelective(PmUserAndRole record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pm_user_and_role
     *
     * @mbg.generated
     */
    List<PmUserAndRole> selectByExample(PmUserAndRoleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pm_user_and_role
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") PmUserAndRole record, @Param("example") PmUserAndRoleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pm_user_and_role
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") PmUserAndRole record, @Param("example") PmUserAndRoleExample example);
}