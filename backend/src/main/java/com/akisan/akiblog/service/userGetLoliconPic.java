package com.akisan.akiblog.service;

import com.akisan.akiblog.pojo.getFromUserLoliconInfo;
import com.akisan.akiblog.pojo.loliconPicInfo;
import com.akisan.akiblog.pojo.loliconPicResult;

public interface userGetLoliconPic {
    //默认参数搜索
    loliconPicResult getPicByDefault();
    //用户给定参数搜索
    loliconPicResult getPicBySearch(loliconPicInfo loliconPicInfo);
    //简化参数后的搜索
    loliconPicResult getPicEzSearch(getFromUserLoliconInfo getFromUserLoliconInfo);
}
