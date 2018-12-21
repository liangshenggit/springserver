package cn.tiantianquan.springantbasicserver.controller;

import cn.tiantianquan.springantbasicserver.core.ProjectException;
import cn.tiantianquan.springantbasicserver.core.ResWrapper;
import cn.tiantianquan.springantbasicserver.entity.PmAuthority;
import cn.tiantianquan.springantbasicserver.model.PmAuthorityModel;
import cn.tiantianquan.springantbasicserver.service.AuthorityService;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.web.PageableDefault;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RequestMapping("/authority")
@RestController
public class AuthorityController {
    @Autowired
    private AuthorityService authorityService;

    /**
     * 获取所有项
     *
     * @param pageable
     * @return
     */
    @GetMapping(path = "/getList")
    public ResWrapper getList(
            @PageableDefault(
                    size = 10,
                    page = 1,
                    sort = {"createTime"},
                    direction = Sort.Direction.DESC
            ) Pageable pageable) {
        return ResWrapper.Success(authorityService.getList(pageable));
    }

    /**
     * 获取所有项
     *
     * @return
     */
    @GetMapping(path = "/getAll")
    @ResponseBody
    public ResWrapper getAll() {
        List<PmAuthorityModel> data = authorityService.getAll();
        return ResWrapper.Success(data);
    }

    /**
     * 通过ID获取对象
     *
     * @param id
     * @return
     */
    @GetMapping(path = "/getById")
    public ResWrapper getById(@RequestParam String id) {
        return ResWrapper.Success(authorityService.getById(id));
    }

    /**
     * 创建对象
     *
     * @param entity
     * @return
     * @throws ProjectException
     */
    @PostMapping(path = "/create")
    public ResWrapper create(@RequestBody PmAuthority entity) throws ProjectException {
        return ResWrapper.Success(authorityService.create(entity));
    }

    /**
     * 更新对象
     *
     * @param entity
     * @return
     * @throws ProjectException
     */
    @PostMapping(path = "/update")
    public ResWrapper update(@RequestBody PmAuthority entity) throws ProjectException {
        return ResWrapper.Success(authorityService.update(entity));
    }

    /**
     * 通过RoleId获取权限列表
     *
     * @param roleId
     * @return
     */
    @GetMapping(path = "/getListByRoleId")
    public ResWrapper getListByRoleId(@RequestParam String roleId) {
        return ResWrapper.Success(authorityService.getListByRoleId(roleId));
    }

    /**
     * 删除对象
     *
     * @param paramMap
     * @return
     * @throws ProjectException
     */
    @PostMapping(path = "/delete")
    public ResWrapper delete(@RequestBody Map<String, String> paramMap) throws ProjectException {
        return ResWrapper.Success(authorityService.delete(paramMap.get("id")));
    }

    @PostMapping(path = "/generateServerAuthority")
    public ResWrapper generateServerAuthority() {
        authorityService.generateServerAuthority();
        return ResWrapper.Success();
    }
}
