package com.akisan.akiblog.service.Impl;

import com.akisan.akiblog.mapper.usr_activityMapper;
import com.akisan.akiblog.pojo.*;
import com.akisan.akiblog.service.Feign.LoliconFeignService;
import com.akisan.akiblog.service.userGetLoliconPic;
import com.akisan.akiblog.utils.refreshTimesUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class userGetLoliconPicImpl implements userGetLoliconPic {
    @Autowired
    LoliconFeignService loliconFeignService;
    @Autowired
    defaultLoliconPicInfo defaultLoliconPicInfo;
    @Autowired
    searchLoliconInfo searchLoliconInfo;
    @Autowired
    usr_activityMapper usr_activityMapper;
    @Autowired
    refreshTimesUtil refreshTimesUtil;

    //lolicon接口的接口id暂定为1
    private final int id = 1;

    @Override
    public loliconPicResult getPicByDefault() {
        refreshTimesUtil.refreshTimes(id);
        return loliconFeignService.getLoliconPicByDefault(defaultLoliconPicInfo);
    }

    @Override
    public loliconPicResult getPicBySearch(loliconPicInfo loliconPicInfo) {
        refreshTimesUtil.refreshTimes(id);
        return  loliconFeignService.getLoliconPic(loliconPicInfo);
    }

    @Override
    public loliconPicResult getPicEzSearch(getFromUserLoliconInfo getFromUserLoliconInfo) {
        refreshTimesUtil.refreshTimes(id);
        searchLoliconInfo.setR18(getFromUserLoliconInfo.getR18());
        searchLoliconInfo.setTag(getFromUserLoliconInfo.getTag());
        return loliconFeignService.getLoliconPicEz(searchLoliconInfo);
    }
}
