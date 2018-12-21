package cn.tiantianquan.springantbasicserver.model;

import cn.tiantianquan.springantbasicserver.entity.PmUser;

import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.Date;

public class PmUserModel extends PmUser {
    public String getDepartmentStr() {
        return departmentStr;
    }

    public void setDepartmentStr(String departmentStr) {
        this.departmentStr = departmentStr;
    }

    private String departmentStr;
}
