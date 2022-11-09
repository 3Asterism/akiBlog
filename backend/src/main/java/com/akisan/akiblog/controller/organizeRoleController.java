package com.akisan.akiblog.controller;

import com.akisan.akiblog.common.resultForRequest;
import com.akisan.akiblog.pojo.organizeRoleInfo;
import com.akisan.akiblog.pojo.searchRoleInfo;
import com.akisan.akiblog.pojo.searchRoleResult;
import com.akisan.akiblog.service.Impl.sysRoleOrganizeImpl;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/roleOrganize")
@Api(tags = "权限管理模块")
public class organizeRoleController {
    @Autowired
    private sysRoleOrganizeImpl sysRoleOrganize;

    @PostMapping("/changeUserRole")
    @ApiOperation(value = "更改用户权限")
    public resultForRequest changeUserRole(@RequestBody organizeRoleInfo organizeRoleInfo) {
        sysRoleOrganize.organizeRole(organizeRoleInfo);
        return resultForRequest.success();
    }

    @PostMapping("/searchUserRole")
    @ApiOperation(value = "查看用户权限")
    public searchRoleResult searchUserRole(@RequestBody searchRoleInfo searchRoleInfo) {
        return sysRoleOrganize.searchRole(searchRoleInfo);
    }
}
