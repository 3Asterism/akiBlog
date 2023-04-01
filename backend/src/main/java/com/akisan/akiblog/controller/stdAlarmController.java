package com.akisan.akiblog.controller;

import com.akisan.akiblog.entity.std_info;
import com.akisan.akiblog.pojo.commonPageInfo;
import com.akisan.akiblog.service.Impl.stdInfoAlarmServiceImpl;
import com.github.pagehelper.PageInfo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.annotation.Secured;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/stdAlarm")
@Api(tags = "毕设-学生信息报警模块")
public class stdAlarmController {
    @Autowired
    stdInfoAlarmServiceImpl stdInfoAlarmService;

    @Secured({"ROLE_CODER","ROLE_ADMIN"})
    @PostMapping("/ScoreAlarmStd")
    @ApiOperation(value = "用户 - 返回因成绩不合格而报警的学生名单")
    public PageInfo<std_info> showOnlineUser(@RequestBody commonPageInfo commonPageInfo){
        return stdInfoAlarmService.stdScoreAlarm(commonPageInfo);
    }
}
