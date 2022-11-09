package com.akisan.akiblog.pojo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
@ApiModel(description = "用户退出参数")
public class userLogOutInfo {

    @ApiModelProperty(value = "用户账号")
    private String userName;

}
