package com.akisan.akiblog.service;

import com.akisan.akiblog.entity.std_allinfo;
import com.akisan.akiblog.pojo.commonPageInfo;
import com.github.pagehelper.PageInfo;

public interface stdAllInfoAlarm {
    PageInfo<std_allinfo> stdActvAlarm(commonPageInfo commonPageInfo);
}
