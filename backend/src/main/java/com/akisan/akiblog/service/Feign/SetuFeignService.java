package com.akisan.akiblog.service.Feign;

import com.akisan.akiblog.pojo.getSetuDefaultInfo;
import com.akisan.akiblog.pojo.getSetuInfo;
import com.akisan.akiblog.pojo.getSetuResult;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Service
@FeignClient(url = "https://setu.yuban10703.xyz" ,name = "setuService")
public interface SetuFeignService {
    @RequestMapping(value = "/setu", method = RequestMethod.POST)
    @ResponseBody
    getSetuResult getSetuPic(@RequestBody getSetuInfo getSetuInfo);

    @RequestMapping(value = "/setu", method = RequestMethod.POST)
    @ResponseBody
    getSetuResult getSetuDirect(@RequestBody getSetuDefaultInfo getSetuDefaultInfo);
}
