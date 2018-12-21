package cn.tiantianquan.springantbasicserver.repository.modelMapper;

import cn.tiantianquan.springantbasicserver.model.PmAuthorityModel;

import java.util.List;

public interface AuthorityModelMapper {
    List<PmAuthorityModel> selectAll();
}
