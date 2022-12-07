package com.akisan.akiblog.pojo;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
public class updateServiceTimesInfo {
    @ApiModelProperty(value = "调用服务的id")
    private int id;
    @ApiModelProperty(value = "服务调用次数")
    private int getpictimes;
}
