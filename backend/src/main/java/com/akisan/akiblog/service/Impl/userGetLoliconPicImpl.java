package com.akisan.akiblog.service.Impl;

import com.akisan.akiblog.pojo.*;
import com.akisan.akiblog.service.Feign.LoliconFeignService;
import com.akisan.akiblog.service.userGetLoliconPic;
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
    @Override
    public loliconPicResult getPicByDefault() {
        return loliconFeignService.getLoliconPicByDefault(defaultLoliconPicInfo);
    }

    @Override
    public loliconPicResult getPicBySearch(loliconPicInfo loliconPicInfo) {
        return  loliconFeignService.getLoliconPic(loliconPicInfo);
    }

    @Override
    public loliconPicResult getPicEzSearch(getFromUserLoliconInfo getFromUserLoliconInfo) {
        searchLoliconInfo.setR18(getFromUserLoliconInfo.getR18());
        searchLoliconInfo.setTag(getFromUserLoliconInfo.getTag());
        return loliconFeignService.getLoliconPicEz(searchLoliconInfo);
    }
}
