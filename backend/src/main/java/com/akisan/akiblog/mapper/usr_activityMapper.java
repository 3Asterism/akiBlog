package com.akisan.akiblog.mapper;

import com.akisan.akiblog.pojo.getServiceTimesInfo;
import com.akisan.akiblog.pojo.updateServiceTimesInfo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface usr_activityMapper {
    //通过id查询对应接口调用次数
    int findTimesById(@Param("getServiceTimesInfo")getServiceTimesInfo getServiceTimesInfo);
    //更新接口调用次数
    void updateTimesById(@Param("updateServiceTimesInfo")updateServiceTimesInfo updateServiceTimesInfo);
}
