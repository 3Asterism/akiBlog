package com.akisan.akiblog.service;

import com.akisan.akiblog.entity.sys_user;
import com.akisan.akiblog.pojo.userLoginInfo;
import com.akisan.akiblog.pojo.userRegisterInfo;

/**
 * 用户注册接口
 */
public interface sysUserRegister {
    void insertUserInfo(userRegisterInfo sys);

    void userLogin(userLoginInfo sys);
}
