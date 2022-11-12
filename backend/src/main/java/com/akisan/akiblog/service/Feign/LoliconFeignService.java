package com.akisan.akiblog.service.Feign;

import com.akisan.akiblog.pojo.defaultLoliconPicInfo;
import com.akisan.akiblog.pojo.loliconPicInfo;
import com.akisan.akiblog.pojo.loliconPicResult;
import com.akisan.akiblog.pojo.searchLoliconInfo;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;


@Service
@FeignClient(url = "https://api.lolicon.app" ,name = "loliconService")
public interface LoliconFeignService {
    @RequestMapping(value = "/setu/v2", method = RequestMethod.POST)
    @ResponseBody
    loliconPicResult getLoliconPic(@RequestBody loliconPicInfo loliconPicInfo);

    @RequestMapping(value = "/setu/v2", method = RequestMethod.POST)
    @ResponseBody
    loliconPicResult getLoliconPicByDefault(@RequestBody defaultLoliconPicInfo defaultLoliconPicInfo);

    @RequestMapping(value = "/setu/v2", method = RequestMethod.POST)
    @ResponseBody
    loliconPicResult getLoliconPicEz(@RequestBody searchLoliconInfo searchLoliconInfo);
}
