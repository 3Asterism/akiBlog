package com.akisan.akiblog.service;

import com.akisan.akiblog.pojo.ResponseResult;
import com.akisan.akiblog.pojo.userLogOutInfo;
import com.akisan.akiblog.pojo.userLoginInfo;
import com.akisan.akiblog.pojo.userRegisterInfo;

/**
 * 用户注册接口
 */
public interface sysUserRegister {
    void insertUserInfo(userRegisterInfo sys);

    ResponseResult userLogin(userLoginInfo sys);

    void userLogOut(userLogOutInfo sys);
}
