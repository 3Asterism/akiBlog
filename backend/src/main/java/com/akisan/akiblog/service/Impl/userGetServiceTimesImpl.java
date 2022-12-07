package com.akisan.akiblog.service.Impl;

import com.akisan.akiblog.mapper.usr_activityMapper;
import com.akisan.akiblog.pojo.getServiceTimesInfo;
import com.akisan.akiblog.service.userGetServiceTimes;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class userGetServiceTimesImpl implements userGetServiceTimes {
    @Autowired
    usr_activityMapper usr_activityMapper;
    @Override
    public int usrGetLoliconTimes(getServiceTimesInfo getServiceTimesInfo) {
        return usr_activityMapper.findTimesById(getServiceTimesInfo);
    }
}
