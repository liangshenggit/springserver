package cn.tiantianquan.springantbasicserver.repository.entityMapper;

import cn.tiantianquan.springantbasicserver.entity.PmAuthority;
import cn.tiantianquan.springantbasicserver.entity.PmAuthorityExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PmAuthorityMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pm_authority
     *
     * @mbg.generated
     */
    long countByExample(PmAuthorityExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pm_authority
     *
     * @mbg.generated
     */
    int deleteByExample(PmAuthorityExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pm_authority
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pm_authority
     *
     * @mbg.generated
     */
    int insert(PmAuthority record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pm_authority
     *
     * @mbg.generated
     */
    int insertSelective(PmAuthority record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pm_authority
     *
     * @mbg.generated
     */
    List<PmAuthority> selectByExample(PmAuthorityExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pm_authority
     *
     * @mbg.generated
     */
    PmAuthority selectByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pm_authority
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") PmAuthority record, @Param("example") PmAuthorityExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pm_authority
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") PmAuthority record, @Param("example") PmAuthorityExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pm_authority
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(PmAuthority record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pm_authority
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(PmAuthority record);
}