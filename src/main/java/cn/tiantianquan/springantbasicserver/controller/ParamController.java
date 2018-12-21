package cn.tiantianquan.springantbasicserver.controller;

import cn.tiantianquan.springantbasicserver.core.ResWrapper;
import cn.tiantianquan.springantbasicserver.entity.ParamAuthorityType;
import cn.tiantianquan.springantbasicserver.service.ParamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RequestMapping("/param")
@RestController
public class ParamController {
    @Autowired
    private ParamService paramService;

    @GetMapping(path = "/getAuthorityTypeList")
    public ResWrapper getAuthorityTypeList() {
        List<ParamAuthorityType> list = paramService.getAuthorityTypeList();
        return ResWrapper.Success(list);
    }
}
