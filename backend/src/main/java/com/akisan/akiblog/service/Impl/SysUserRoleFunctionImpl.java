package com.akisan.akiblog.service.Impl;

import com.akisan.akiblog.entity.sys_user;
import com.akisan.akiblog.entity.sys_user_role;
import com.akisan.akiblog.mapper.sys_userMapper;
import com.akisan.akiblog.mapper.sys_user_roleMapper;
import com.akisan.akiblog.service.sysUserRoleFunction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SysUserRoleFunctionImpl implements sysUserRoleFunction {
    @Autowired
    sys_user_role sys_user_role;
    @Autowired
    sys_user_roleMapper sys_user_roleMapper;
    @Autowired
    sys_userMapper sys_userMapper;
    @Override
    public void setSys_user_role(sys_user sys_user) {
        sys_user_role.setEnabled(true);
        sys_user_role.setRole_id(3);
        sys_user_role.setUser_id(sys_userMapper.getByUsername(sys_user.getUsername()).getUserid());
        sys_user_roleMapper.insertUserRole(sys_user_role);
    }
}
