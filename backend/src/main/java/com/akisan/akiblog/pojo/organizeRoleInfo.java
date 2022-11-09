package com.akisan.akiblog.pojo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
@ApiModel(description = "更改权限所需参数")
public class organizeRoleInfo {
    @ApiModelProperty(value = "用户唯一id")
    private String userId;
    @ApiModelProperty(value = "权限id")
    private int id;
}
