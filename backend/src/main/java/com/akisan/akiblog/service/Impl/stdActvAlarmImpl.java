package com.akisan.akiblog.service.Impl;

import com.akisan.akiblog.entity.std_actvalarm;
import com.akisan.akiblog.mapper.std_actvalarmMapper;
import com.akisan.akiblog.pojo.commonPageInfo;
import com.akisan.akiblog.service.stdActvAlarm;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class stdActvAlarmImpl implements stdActvAlarm {
    @Autowired
    std_actvalarmMapper stdActvalarmMapper;

    @Override
    public PageInfo<std_actvalarm> stdActvAlarm(commonPageInfo commonPageInfo) {
        PageHelper.startPage(commonPageInfo.getPageNum(),commonPageInfo.getPageSize());
        List<std_actvalarm> result = stdActvalarmMapper.alarmResult();
        PageInfo<std_actvalarm> pageInfo = new PageInfo<>(result);
        return pageInfo;
    }
}
