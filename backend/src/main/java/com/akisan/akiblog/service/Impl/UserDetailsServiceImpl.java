package com.akisan.akiblog.service.Impl;

import com.akisan.akiblog.entity.sys_role;
import com.akisan.akiblog.entity.sys_user;
import com.akisan.akiblog.mapper.sys_roleMapper;
import com.akisan.akiblog.mapper.sys_userMapper;
import com.akisan.akiblog.pojo.LoginUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserDetailsServiceImpl implements UserDetailsService {
    @Autowired
    private sys_userMapper sys_userMapper;
    @Autowired
    private sys_roleMapper sysRoleMapper;
    @Override
    public UserDetails loadUserByUsername(String userName) throws UsernameNotFoundException {
        // 1.查询用户
        sys_user sysUser = sys_userMapper.getByUsername(userName);
        if (sysUser == null) {
            return null;
        }
        // 2.获取用户关联的所有角色
        List<sys_role> sysRoles = sysRoleMapper.listAllByUserId(sysUser.getUserid());
        sysUser.setRoles(sysRoles);
        return sysUser;
    }
}
