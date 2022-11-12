package com.akisan.akiblog.pojo;

import io.swagger.annotations.ApiModelProperty;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class getSetuDefaultInfo {
    @ApiModelProperty(value = "健全度 0健全 1不健全 2混着来")
    private final int r18 = 1;

    @ApiModelProperty(value = "返回数量")
    private final int num = 1;

    @ApiModelProperty(value = "可以传入多个tag")
    private final List tags = null;

    @ApiModelProperty(value = "反向代理链接")
    private final String replace_url = "https://i.pixiv.re";
}
