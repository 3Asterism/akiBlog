package com.akisan.akiblog.service;

import com.akisan.akiblog.pojo.organizeRoleInfo;
import com.akisan.akiblog.pojo.searchRoleInfo;
import com.akisan.akiblog.pojo.searchRoleResult;


public interface sysRoleOrganize {

    void organizeRole(organizeRoleInfo organizeRoleInfo);

    searchRoleResult searchRole(searchRoleInfo searchRoleInfo);
}
