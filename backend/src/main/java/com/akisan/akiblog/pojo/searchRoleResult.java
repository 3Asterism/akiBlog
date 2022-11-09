package com.akisan.akiblog.pojo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
@ApiModel(description = "搜索用户拥有权限返回值")
public class searchRoleResult {
    @ApiModelProperty(value = "用户唯一id")
    private String userId;
    @ApiModelProperty(value = "用户唯一id")
    private String userRole;
}
