package com.akisan.akiblog.service.Impl;

import com.akisan.akiblog.pojo.defaultLoliconPicInfo;
import com.akisan.akiblog.pojo.loliconPicInfo;
import com.akisan.akiblog.pojo.loliconPicResult;
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
    @Override
    public loliconPicResult getPicByDefault() {
        return loliconFeignService.getLoliconPicByDefault(defaultLoliconPicInfo);
    }

    @Override
    public loliconPicResult getPicBySearch(loliconPicInfo loliconPicInfo) {
        return  loliconFeignService.getLoliconPic(loliconPicInfo);
    }
}
