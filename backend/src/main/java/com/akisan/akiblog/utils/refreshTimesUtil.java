package com.akisan.akiblog.utils;

import com.akisan.akiblog.mapper.usr_activityMapper;
import com.akisan.akiblog.pojo.getServiceTimesInfo;
import com.akisan.akiblog.pojo.updateServiceTimesInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class refreshTimesUtil {
    @Autowired
    usr_activityMapper usr_activityMapper;
    //通过id更改接口的使用次数
    public void refreshTimes(int id){
        updateServiceTimesInfo updateServiceTimesInfo = new updateServiceTimesInfo();
        updateServiceTimesInfo.setId(id);
        getServiceTimesInfo getServiceTimesInfo = new getServiceTimesInfo();
        getServiceTimesInfo.setId(id);
        //次数取出之后加一再塞回去
        updateServiceTimesInfo.setGetpictimes(usr_activityMapper.findTimesById(getServiceTimesInfo)+1);
        usr_activityMapper.updateTimesById(updateServiceTimesInfo);
    }
}
