package com.akisan.akiblog.controller;

import com.akisan.akiblog.common.resultForRequestConstant;
import com.akisan.akiblog.entity.sys_user;
import com.akisan.akiblog.mapper.sys_userMapper;
import com.akisan.akiblog.pojo.userLogOutInfo;
import com.akisan.akiblog.pojo.userLoginInfo;
import com.akisan.akiblog.pojo.userRegisterInfo;
import com.akisan.akiblog.service.Impl.SysUserRoleFunctionImpl;
import com.akisan.akiblog.service.Impl.SysUserServiceImpl;
import com.akisan.akiblog.service.Impl.sysUserRegisterImpl;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/login")
@Api(tags = "用户 - 登录注册模块")
public class UserLoginController {

    @Autowired
    private sysUserRegisterImpl sysUserRegister;

    @Autowired
    private sys_userMapper sys_userMapper;

    @Autowired
    private SysUserServiceImpl sysUserService;

    @Autowired
    private SysUserRoleFunctionImpl SysUserRoleFunctionImpl;

    @GetMapping("/findAll")
    @ApiOperation(value = "用户 - 返回用户所有信息")
    public List<sys_user> index(){
        return sys_userMapper.findAll();
    }

    @PostMapping("/register")
    @ApiOperation(value = "用户 - 注册")
    public resultForRequestConstant insertInfo(@RequestBody userRegisterInfo userRegisterInfo){
        sysUserRegister.insertUserInfo(userRegisterInfo);
        return resultForRequestConstant.success();
    }

    @PostMapping("/userLogin")
    @ApiOperation(value = "用户 - 登录")
    public resultForRequestConstant userLogin(@RequestBody userLoginInfo userLoginInfo){
        sysUserRegister.userLogin(userLoginInfo);
        return resultForRequestConstant.success();
    }

    @PostMapping("/userLogOut")
    @ApiOperation(value = "用户 - 退出")
    public resultForRequestConstant userLogOut(@RequestBody userLogOutInfo userLogOutInfo){
        sysUserRegister.userLogOut(userLogOutInfo);
        return resultForRequestConstant.success();
    }

    @PostMapping("/registerSpring")
    @ApiOperation(value = "用户 - 测试注册")
    public resultForRequestConstant insertInfoTest(@RequestBody sys_user sys_user){
        sysUserService.save(sys_user);
        SysUserRoleFunctionImpl.setSys_user_role(sys_user);
        return resultForRequestConstant.success();
    }
}
