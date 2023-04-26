package com.akisan.akiblog.controller;

import com.akisan.akiblog.entity.std_allinfo;
import com.akisan.akiblog.entity.std_info;
import com.akisan.akiblog.entity.std_scorebar;
import com.akisan.akiblog.pojo.commonPageInfo;
import com.akisan.akiblog.service.Impl.stdAllinfoAlarmImpl;
import com.akisan.akiblog.service.Impl.stdScoreBarImpl;
import com.github.pagehelper.PageInfo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.annotation.Secured;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/stdBigScreen")
@Api(tags = "毕设-大数据大屏模块")
public class stdBigScreenController {
    @Autowired
    stdScoreBarImpl stdScoreBar;

    @Autowired
    stdAllinfoAlarmImpl stdAllinfoAlarm;
    @Secured({"ROLE_CODER","ROLE_ADMIN"})
    @GetMapping("/ScoreBar")
    @ApiOperation(value = "用户 - 返回学院平均成绩数据")
    public List<std_scorebar> showScoreAlarm(){
        return stdScoreBar.returnScoreBar();
    }

    @Secured({"ROLE_CODER","ROLE_ADMIN"})
    @PostMapping("/Pin")
    @ApiOperation(value = "用户 - 返回不在校的人 用于标记")
    public PageInfo<std_allinfo> showPin(@RequestBody commonPageInfo commonPageInfo){
        return stdAllinfoAlarm.stdActvAlarm(commonPageInfo);
    }
}
