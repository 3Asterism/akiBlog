package com.akisan.akiblog.pojo;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
public class getServiceTimesInfo {
    @ApiModelProperty(value = "调用服务的id")
    private int id;
}
