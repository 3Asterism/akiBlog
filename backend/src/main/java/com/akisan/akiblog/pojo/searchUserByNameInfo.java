package com.akisan.akiblog.pojo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
@ApiModel(description = "用户通过用户名模糊搜索用户")
public class searchUserByNameInfo {
    @ApiModelProperty(value = "用户昵称")
    private String nickName;
}
