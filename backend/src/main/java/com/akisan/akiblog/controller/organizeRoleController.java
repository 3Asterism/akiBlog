package com.akisan.akiblog.controller;

import com.akisan.akiblog.common.resultForRequestConstant;
import com.akisan.akiblog.entity.sys_role;
import com.akisan.akiblog.pojo.*;
import com.akisan.akiblog.service.Impl.SysUserRoleFunctionImpl;
import com.akisan.akiblog.service.Impl.SysUserRoleOrganizeImpl;
import com.akisan.akiblog.service.Impl.sysRoleOrganizeImpl;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/roleOrganize")
@Api(tags = "权限管理模块")
public class organizeRoleController {
    @Autowired
    private SysUserRoleOrganizeImpl sysUserRoleOrganize;
    @Autowired
    private sysRoleOrganizeImpl sysRoleOrganize;
    @Autowired
    private SysUserRoleFunctionImpl SysUserRoleFunctionImpl;

    @PostMapping("/changeUserRole")
    @ApiOperation(value = "更改用户权限")
    public resultForRequestConstant changeUserRole(@RequestBody organizeRoleInfo organizeRoleInfo) {
        sysUserRoleOrganize.organizeRole(organizeRoleInfo);
        return resultForRequestConstant.success();
    }

    @PostMapping("/searchUserRole")
    @ApiOperation(value = "查看用户权限")
    public searchRoleResult searchUserRole(@RequestBody searchRoleInfo searchRoleInfo) {
        return sysUserRoleOrganize.searchRole(searchRoleInfo);
    }

    @PostMapping("/insertRole")
    @ApiOperation(value = "增加权限")
    public resultForRequestConstant insertRole(@RequestBody insertRoleInfo insertRoleInfo) {
        sysRoleOrganize.insertRole(insertRoleInfo);
        return resultForRequestConstant.success();
    }

    @DeleteMapping("/deleteRole")
    @ApiOperation(value = "删除权限")
    public resultForRequestConstant deleteRole(@RequestBody delRoleInfo delRoleInfo) {
        sysRoleOrganize.deleteRole(delRoleInfo);
        return resultForRequestConstant.success();
    }

    @PostMapping("/reformRoleInfo")
    @ApiOperation(value = "修改权限")
    public resultForRequestConstant reformRole(@RequestBody reformRoleInfo reformRoleInfo) {
        sysRoleOrganize.reformRole(reformRoleInfo);
        return resultForRequestConstant.success();
    }

    @GetMapping("/reformRoleInfo")
    @ApiOperation(value = "查看权限列表")
    public List<sys_role> searchAllRole() {
        return sysRoleOrganize.searchAllRole();
    }

    @PostMapping("/changeUserRoleNew")
    @ApiOperation(value = "更改用户权限-新")
    public resultForRequestConstant changeUserRoleNew(@RequestBody updateUserRoleInfo updateUserRoleInfo) {
        SysUserRoleFunctionImpl.updateSys_user_role(updateUserRoleInfo);
        return resultForRequestConstant.success();
    }
}
