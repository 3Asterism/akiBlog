package com.akisan.akiblog.controller;

import com.akisan.akiblog.entity.sys_user;
import com.akisan.akiblog.service.Impl.sysUserActivityImpl;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/userActivity")
@Api(tags = "用户 - 操作模块")
public class UserActivityController {
    @Autowired
    sysUserActivityImpl sysUserActivity;

    @GetMapping("/findAllOnlineUser")
    @ApiOperation(value = "用户 - 返回所有在线用户")
    public List<sys_user> showOnlineUser(){
        return sysUserActivity.showOnlineUser();
    }
}
