package com.akisan.akiblog.mapper;

import com.akisan.akiblog.entity.std_actvalarm;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface std_actvalarmMapper {
    List<std_actvalarm> alarmResult();
}
