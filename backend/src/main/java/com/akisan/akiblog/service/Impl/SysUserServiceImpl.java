package com.akisan.akiblog.service.Impl;

import com.akisan.akiblog.entity.sys_role;
import com.akisan.akiblog.entity.sys_user;
import com.akisan.akiblog.mapper.sys_roleMapper;
import com.akisan.akiblog.mapper.sys_userMapper;
import com.akisan.akiblog.service.SysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class SysUserServiceImpl implements SysUserService {

    @Autowired
    private sys_userMapper sysUserMapper;

    @Autowired
    private sys_roleMapper sysRoleMapper;

    @Autowired
    private BCryptPasswordEncoder passwordEncoder;

    @Override
    public void save(sys_user sysUser) {
        // 将密码加密入库
        sysUser.setPassword(passwordEncoder.encode(sysUser.getPassword()));
        sysUserMapper.insertAllInfo(sysUser);
    }

    /**
     * 认证业务
     *
     * @param username
     *            - 用户在浏览器输入的用户名
     * @return UserDetails - Spring Security的用户对象，返回 null表示认证失败！
     * @throws UsernameNotFoundException
     */
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        /**
         * 用户信息和角色信息可以一步关联查询到位得到SysUser，我这里分开查询
         */
        // 1.查询用户
        sys_user sysUser = sysUserMapper.getByUsername(username);
        if (sysUser == null) {
            return null;
        }
        // 2.获取用户关联的所有角色
        List<sys_role> sysRoles = sysRoleMapper.listAllByUserId(sysUser.getUserid());
        sysUser.setRoles(sysRoles);
        return sysUser;
    }

}
