package com.akisan.akiblog.controller;

import com.akisan.akiblog.entity.sys_user;
import com.akisan.akiblog.pojo.searchUserByNameInfo;
import com.akisan.akiblog.pojo.searchUserByNameResult;
import com.akisan.akiblog.service.Impl.sysUserActivityImpl;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.annotation.Secured;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/userActivity")
@Api(tags = "用户 - 操作模块")
public class UserActivityController {
    @Autowired
    sysUserActivityImpl sysUserActivity;

    @Secured({"ROLE_CODER","ROLE_ADMIN","ROLE_USER"})
    @GetMapping("/findAllOnlineUser")
    @ApiOperation(value = "用户 - 返回所有在线用户")
    public List<sys_user> showOnlineUser(){
        return sysUserActivity.showOnlineUser();
    }

    @Secured({"ROLE_CODER","ROLE_ADMIN","ROLE_USER","ROLE_NORMAL"})
    @PostMapping("/userSearchUser")
    @ApiOperation(value = "用户通过用户名模糊搜索")
    public List<searchUserByNameResult> searchUserRole(@RequestBody searchUserByNameInfo searchUserByNameInfo) {
        return sysUserActivity.userSearchUserById(searchUserByNameInfo);
    }
}
