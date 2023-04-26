package com.akisan.akiblog.mapper;

import com.akisan.akiblog.entity.std_allinfo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface std_allinfoMapper {
    List<std_allinfo> getOutOfSchool();
}
