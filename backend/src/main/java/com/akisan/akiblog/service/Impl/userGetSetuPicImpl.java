package com.akisan.akiblog.service.Impl;

import com.akisan.akiblog.pojo.getSetuDefaultInfo;
import com.akisan.akiblog.pojo.getSetuInfo;
import com.akisan.akiblog.pojo.getSetuResult;
import com.akisan.akiblog.service.Feign.SetuFeignService;
import com.akisan.akiblog.service.userGetSetuPic;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class userGetSetuPicImpl implements userGetSetuPic {
    @Autowired
    SetuFeignService setuFeignService;
    @Autowired
    getSetuDefaultInfo getSetuDefaultInfo;
    @Override
    public getSetuResult getSetuByEzWay(getSetuInfo getSetuInfo) {
        return setuFeignService.getSetuPic(getSetuInfo);
    }

    @Override
    public getSetuResult getSetuDirect() {
        return setuFeignService.getSetuDirect(getSetuDefaultInfo);
    }
}
