package cn.tiantianquan.springantbasicserver.repository.modelMapper;

import cn.tiantianquan.springantbasicserver.entity.PmAuthority;
import cn.tiantianquan.springantbasicserver.entity.PmRole;
import cn.tiantianquan.springantbasicserver.model.PmUserModel;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserModelMapper {
    List<PmUserModel> selectAll(@Param("loginName") String loginName,
                                @Param("nickName") String nickName,
                                @Param("departmentId") String departmentId);

    PmUserModel selectById(String id);


    List<PmAuthority> selectAuthorityByUserId(@Param("userId") String userId);

    List<PmRole> selectRoleByUserId(@Param("userId") String userId);
}