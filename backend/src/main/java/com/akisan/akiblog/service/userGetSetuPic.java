package com.akisan.akiblog.service;

import com.akisan.akiblog.pojo.getSetuDefaultInfo;
import com.akisan.akiblog.pojo.getSetuInfo;
import com.akisan.akiblog.pojo.getSetuResult;

public interface userGetSetuPic {
    //简单搜索
    getSetuResult getSetuByEzWay(getSetuInfo getSetuInfo);
    //直接返回
    getSetuResult getSetuDirect();
}
