package com.akisan.akiblog.service.Impl;

import com.akisan.akiblog.entity.sys_user;
import com.akisan.akiblog.mapper.sys_userMapper;
import com.akisan.akiblog.pojo.LoginUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Objects;

@Service
public class UserDetailsServiceImpl implements UserDetailsService {
    @Autowired
    private sys_userMapper sys_userMapper;
    @Override
    public UserDetails loadUserByUsername(String userName) throws UsernameNotFoundException {
        //查询用户信息
        sys_user sys_user = sys_userMapper.getByUsername(userName);
        //如果没查到抛出异常
        if(Objects.isNull(sys_user)){
            throw new RuntimeException("用户名或密码错误");
        }
        return new LoginUser(sys_user);
    }
}
