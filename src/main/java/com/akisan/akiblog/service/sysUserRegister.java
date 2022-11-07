package com.akisan.akiblog.service;

import com.akisan.akiblog.entity.sys_user;

/**
 * 用户注册接口
 */
public interface sysUserRegister {
    String insertUserInfo(sys_user sys);

    String userLogin(sys_user sys);
}
