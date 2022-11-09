package com.akisan.akiblog.service;

import com.akisan.akiblog.entity.sys_role;
import com.akisan.akiblog.pojo.delRoleInfo;
import com.akisan.akiblog.pojo.insertRoleInfo;
import com.akisan.akiblog.pojo.reformRoleInfo;

import java.util.List;

public interface sysRoleOrganize {

    void insertRole(insertRoleInfo insertRoleInfo);

    void deleteRole(delRoleInfo delRoleInfo);

    void reformRole(reformRoleInfo reformRoleInfo);

    List<sys_role> searchAllRole();
}
