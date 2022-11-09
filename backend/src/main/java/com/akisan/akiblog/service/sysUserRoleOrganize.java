package com.akisan.akiblog.service;

import com.akisan.akiblog.entity.sys_role;
import com.akisan.akiblog.pojo.*;

import java.util.List;


public interface sysUserRoleOrganize {

    void organizeRole(organizeRoleInfo organizeRoleInfo);

    searchRoleResult searchRole(searchRoleInfo searchRoleInfo);

}
