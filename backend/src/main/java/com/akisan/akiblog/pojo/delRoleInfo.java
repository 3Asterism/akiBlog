package com.akisan.akiblog.pojo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
@ApiModel(description = "权限删除参数")
public class delRoleInfo {
    @ApiModelProperty(value = "权限id")
    private int id;
}
