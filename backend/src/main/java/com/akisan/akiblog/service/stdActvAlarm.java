package com.akisan.akiblog.service;

import com.akisan.akiblog.entity.std_actvalarm;
import com.akisan.akiblog.pojo.commonPageInfo;
import com.github.pagehelper.PageInfo;

public interface stdActvAlarm {
    PageInfo<std_actvalarm> stdActvAlarm(commonPageInfo commonPageInfo);
}
