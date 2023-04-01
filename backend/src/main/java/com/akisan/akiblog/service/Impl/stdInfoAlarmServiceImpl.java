package com.akisan.akiblog.service.Impl;

import com.akisan.akiblog.entity.std_info;
import com.akisan.akiblog.mapper.std_infoMapper;
import com.akisan.akiblog.pojo.commonPageInfo;
import com.akisan.akiblog.pojo.searchCommentInfo;
import com.akisan.akiblog.service.stdInfoAlarm;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class stdInfoAlarmServiceImpl implements stdInfoAlarm {
    @Autowired
    std_infoMapper stdInfoMapper;
    @Override
    public PageInfo<std_info> stdScoreAlarm(commonPageInfo commonPageInfo) {
        PageHelper.startPage(commonPageInfo.getPageNum(),commonPageInfo.getPageSize());
        List<std_info> result = stdInfoMapper.getStdScoreAlarm();
        PageInfo<std_info> pageInfo = new PageInfo<>(result);
        return pageInfo;
    }
}
