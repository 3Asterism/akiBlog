package com.akisan.akiblog.controller;

import com.akisan.akiblog.pojo.getSetuInfo;
import com.akisan.akiblog.pojo.getSetuResult;
import com.akisan.akiblog.service.Impl.userGetSetuPicImpl;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.annotation.Secured;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/setu")
@Api(tags = "setu拿图模块")
public class setuPicController {
    @Autowired
    userGetSetuPicImpl userGetSetuPic;

    @Secured({"ROLE_CODER","ROLE_ADMIN"})
    @PostMapping("/searchPicByEzWay")
    @ApiOperation(value = "简化版参数拿图")
    public getSetuResult getPicEzSearch(@RequestBody getSetuInfo getSetuInfo) {
        return userGetSetuPic.getSetuByEzWay(getSetuInfo);
    }

    @Secured({"ROLE_CODER","ROLE_ADMIN"})
    @GetMapping ("/searchPicByDefault")
    @ApiOperation(value = "默认参数拿图")
    public getSetuResult getPicByDefault() {
        return userGetSetuPic.getSetuDirect();
    }
}
