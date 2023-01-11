package com.akisan.akiblog.pojo;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
public class getUserByNameInfo {
    @ApiModelProperty(value = "用户账号")
    private String username;
}
