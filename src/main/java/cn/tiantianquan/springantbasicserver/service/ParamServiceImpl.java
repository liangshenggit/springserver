package cn.tiantianquan.springantbasicserver.service;

import cn.tiantianquan.springantbasicserver.entity.ParamAuthorityType;
import cn.tiantianquan.springantbasicserver.repository.entityMapper.ParamAuthorityTypeMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ParamServiceImpl implements ParamService {
    @Autowired
    private ParamAuthorityTypeMapper authorityTypeMapper;

    @Override
    public List<ParamAuthorityType> getAuthorityTypeList() {
        return authorityTypeMapper.selectByExample(null);
    }
}
