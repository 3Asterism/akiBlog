package com.akisan.akiblog.service.Feign;

import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(url = "https://api.lolicon.app/setu/v2" ,name = "lolicon")
public interface OrderFeignService {
}
