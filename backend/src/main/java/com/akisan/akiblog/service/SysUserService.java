package com.akisan.akiblog.service;

import com.akisan.akiblog.entity.sys_user;
import org.springframework.security.core.userdetails.UserDetailsService;

public interface SysUserService extends UserDetailsService {

    void save(sys_user sys_user);
}
