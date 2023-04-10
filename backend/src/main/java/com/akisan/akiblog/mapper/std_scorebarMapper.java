package com.akisan.akiblog.mapper;

import com.akisan.akiblog.entity.std_scorebar;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface std_scorebarMapper {
    List<std_scorebar> getStdScoreAlarm();
}
