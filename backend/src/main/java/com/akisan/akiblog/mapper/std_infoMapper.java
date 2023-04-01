package com.akisan.akiblog.mapper;

import com.akisan.akiblog.entity.std_info;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface std_infoMapper {
    List<std_info> getStdScoreAlarm();
}
