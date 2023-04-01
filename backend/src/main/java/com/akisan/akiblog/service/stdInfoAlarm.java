package com.akisan.akiblog.service;

import com.akisan.akiblog.entity.std_info;
import com.akisan.akiblog.pojo.commonPageInfo;
import com.github.pagehelper.PageInfo;

public interface stdInfoAlarm {
    PageInfo<std_info> stdScoreAlarm(commonPageInfo commonPageInfo);
}
