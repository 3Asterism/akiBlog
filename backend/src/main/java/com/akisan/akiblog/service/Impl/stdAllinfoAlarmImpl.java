package com.akisan.akiblog.service.Impl;

import com.akisan.akiblog.entity.std_allinfo;
import com.akisan.akiblog.mapper.std_allinfoMapper;
import com.akisan.akiblog.pojo.commonPageInfo;
import com.akisan.akiblog.service.stdAllInfoAlarm;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class stdAllinfoAlarmImpl implements stdAllInfoAlarm {
    @Autowired
    private std_allinfoMapper stdAllinfoMapper;
    @Override
    public PageInfo<std_allinfo> stdActvAlarm(commonPageInfo commonPageInfo) {
        PageHelper.startPage(commonPageInfo.getPageNum(),commonPageInfo.getPageSize());
        List<std_allinfo> result = stdAllinfoMapper.getOutOfSchool();
        PageInfo<std_allinfo> pageInfo = new PageInfo<>(result);
        return pageInfo;
    }

}
