package com.akisan.akiblog.service;

import com.akisan.akiblog.entity.sys_user;
import com.akisan.akiblog.pojo.updateUserRoleInfo;

public interface sysUserRoleFunction {
    void setSys_user_role(sys_user sys_user);

    void updateSys_user_role(updateUserRoleInfo updateUserRoleInfo);
}
