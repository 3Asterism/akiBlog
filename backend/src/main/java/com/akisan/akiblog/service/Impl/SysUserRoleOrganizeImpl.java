package com.akisan.akiblog.service.Impl;

import com.akisan.akiblog.mapper.sys_userMapper;
import com.akisan.akiblog.pojo.organizeRoleInfo;
import com.akisan.akiblog.pojo.searchRoleInfo;
import com.akisan.akiblog.pojo.searchRoleResult;
import com.akisan.akiblog.service.sysUserRoleOrganize;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class SysUserRoleOrganizeImpl implements sysUserRoleOrganize {
    @Autowired
    private sys_userMapper sys_userMapper;

    @Override
    public void organizeRole(organizeRoleInfo organizeRoleInfo) {
        sys_userMapper.changeUserRole(organizeRoleInfo);
    }

    @Override
    public searchRoleResult searchRole(searchRoleInfo searchRoleInfo) {
        return sys_userMapper.searchRole(searchRoleInfo);
    }


}
