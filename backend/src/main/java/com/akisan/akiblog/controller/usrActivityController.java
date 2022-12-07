package com.akisan.akiblog.controller;

import com.akisan.akiblog.pojo.getServiceTimesInfo;
import com.akisan.akiblog.service.Impl.userGetServiceTimesImpl;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.annotation.Secured;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/userActivity")
@Api(tags = "用户活动查看模块")
public class usrActivityController {
    @Autowired
    userGetServiceTimesImpl userGetServiceTimesImpl;
    @Secured({"ROLE_CODER"})
    @GetMapping("/findTimesById")
    @ApiOperation(value = "通过id查找接口使用次数")
    public int index(getServiceTimesInfo getServiceTimesInfo){
        return userGetServiceTimesImpl.usrGetLoliconTimes(getServiceTimesInfo);
    }
}
