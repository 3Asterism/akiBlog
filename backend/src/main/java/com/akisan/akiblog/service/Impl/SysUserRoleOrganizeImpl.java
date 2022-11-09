package com.akisan.akiblog.service.Impl;

import com.akisan.akiblog.entity.sys_role;
import com.akisan.akiblog.mapper.sys_roleMapper;
import com.akisan.akiblog.mapper.sys_userMapper;
import com.akisan.akiblog.pojo.*;
import com.akisan.akiblog.service.sysUserRoleOrganize;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class SysUserRoleOrganizeImpl implements sysUserRoleOrganize {
    @Autowired
    private sys_userMapper sys_userMapper;
    @Autowired
    private sys_roleMapper sys_roleMapper;

    @Override
    public void organizeRole(organizeRoleInfo organizeRoleInfo) {
        sys_userMapper.changeUserRole(organizeRoleInfo);
    }

    @Override
    public searchRoleResult searchRole(searchRoleInfo searchRoleInfo) {
        return sys_userMapper.searchRole(searchRoleInfo);
    }


}
