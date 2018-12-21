package cn.tiantianquan.springantbasicserver.service;

import cn.tiantianquan.springantbasicserver.model.ControllerMethodModel;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface AdminService {
    List<ControllerMethodModel> getControllerMethodList();
}
