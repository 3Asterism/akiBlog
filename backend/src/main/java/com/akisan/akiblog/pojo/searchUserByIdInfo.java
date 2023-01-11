package com.akisan.akiblog.pojo;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
public class searchUserByIdInfo {
    @ApiModelProperty(value = "用户id")
    private String userid;
}
