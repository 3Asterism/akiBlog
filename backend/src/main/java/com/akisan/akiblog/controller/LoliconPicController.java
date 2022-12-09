package com.akisan.akiblog.controller;

import com.akisan.akiblog.pojo.getFromUserLoliconInfo;
import com.akisan.akiblog.pojo.loliconPicInfo;
import com.akisan.akiblog.pojo.loliconPicResult;
import com.akisan.akiblog.service.Impl.userGetLoliconPicImpl;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.annotation.Secured;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/lolicon")
@Api(tags = "lolicon拿图模块")
public class LoliconPicController {
    @Autowired
    userGetLoliconPicImpl userGetLoliconPic;

    @Secured({"ROLE_CODER","ROLE_ADMIN"})
    @PostMapping("/searchPic")
    @ApiOperation(value = "给定参数拿图")
    public loliconPicResult getPic(@RequestBody loliconPicInfo loliconPicInfo) {
        return userGetLoliconPic.getPicBySearch(loliconPicInfo);
    }

    @Secured({"ROLE_CODER","ROLE_ADMIN"})
    @PostMapping("/searchPicByDefault")
    @ApiOperation(value = "默认参数拿图")
    public loliconPicResult getPicByDefault() {
        return userGetLoliconPic.getPicByDefault();
    }

    @Secured({"ROLE_CODER","ROLE_ADMIN"})
    @PostMapping("/searchPicByEzWay")
    @ApiOperation(value = "简化版参数拿图")
    public loliconPicResult getPicEzSearch(@RequestBody getFromUserLoliconInfo getFromUserLoliconInfo) {
        return userGetLoliconPic.getPicEzSearch(getFromUserLoliconInfo);
    }
}
