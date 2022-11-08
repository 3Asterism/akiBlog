package com.akisan.akiblog.controller;

import com.akisan.akiblog.common.resultForRequest;
import com.akisan.akiblog.entity.sys_user;
import com.akisan.akiblog.mapper.sys_userMapper;
import com.akisan.akiblog.service.Impl.sysUserRegisterImpl;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/login")
@Api(tags = "用户 - 登录注册模块")
public class UserController {

    @Autowired
    private sysUserRegisterImpl sysUserRegister;

    @Autowired
    private sys_userMapper sys_userMapper;

    @GetMapping("/findAll")
    @ApiOperation(value = "用户 - 返回用户所有信息")
    public List<sys_user> index(){
        return sys_userMapper.findAll();
    }

    @PostMapping("/register")
    @ApiOperation(value = "用户 - 注册")
    public resultForRequest insertInfo(@RequestBody sys_user sys_user){
        sysUserRegister.insertUserInfo(sys_user);
        return resultForRequest.success();
    }

    @PostMapping("/userLogin")
    @ApiOperation(value = "用户 - 登录")
    public resultForRequest userLogin(@RequestBody sys_user sys_user){
        sysUserRegister.userLogin(sys_user);
        return resultForRequest.success();
    }
}
