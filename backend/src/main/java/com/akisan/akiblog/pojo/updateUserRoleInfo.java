package com.akisan.akiblog.pojo;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
public class updateUserRoleInfo {
    @ApiModelProperty(value = "用户id")
    private String user_id;
    @ApiModelProperty(value = "用户账号")
    private String role_id;
}
