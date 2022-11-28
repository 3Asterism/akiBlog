package com.akisan.akiblog.service;

import com.akisan.akiblog.entity.sys_user;
import com.akisan.akiblog.pojo.ResponseResult;
import com.akisan.akiblog.pojo.userChangePwdInfo;
import org.springframework.security.core.userdetails.UserDetailsService;

public interface SysUserService extends UserDetailsService {

    void save(sys_user sys_user);

    ResponseResult changeUserPWD(userChangePwdInfo userChangePwdInfo);
}
