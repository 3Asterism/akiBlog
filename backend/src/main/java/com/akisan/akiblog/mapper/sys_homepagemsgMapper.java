package com.akisan.akiblog.mapper;

import com.akisan.akiblog.pojo.searchHomePageMsgResult;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface sys_homepagemsgMapper {
    searchHomePageMsgResult searchHomePageMsgResult();
}
