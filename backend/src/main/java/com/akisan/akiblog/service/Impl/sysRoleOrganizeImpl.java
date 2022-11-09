package com.akisan.akiblog.service.Impl;

import com.akisan.akiblog.entity.sys_role;
import com.akisan.akiblog.mapper.sys_roleMapper;
import com.akisan.akiblog.pojo.delRoleInfo;
import com.akisan.akiblog.pojo.insertRoleInfo;
import com.akisan.akiblog.pojo.reformRoleInfo;
import com.akisan.akiblog.service.sysRoleOrganize;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class sysRoleOrganizeImpl implements sysRoleOrganize {
    @Autowired
    sys_roleMapper sys_roleMapper;

    @Override
    public void insertRole(insertRoleInfo insertRoleInfo) {
        sys_roleMapper.insertRole(insertRoleInfo);
    }

    @Override
    public void deleteRole(delRoleInfo delRoleInfo) {
        sys_roleMapper.deleteRole(delRoleInfo);
    }

    @Override
    public void reformRole(reformRoleInfo reformRoleInfo) {
        sys_roleMapper.reformRole(reformRoleInfo);
    }

    @Override
    public List<sys_role> searchAllRole() {
        return sys_roleMapper.searchAllRole();
    }
}
