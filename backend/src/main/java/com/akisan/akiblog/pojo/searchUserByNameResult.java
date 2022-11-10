package com.akisan.akiblog.pojo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.Date;

@Data
@ApiModel(description = "用户通过用户名模糊搜索用户返回值")
public class searchUserByNameResult {

    @ApiModelProperty(value = "用户昵称" , required = true)
    private String nickname;

    @ApiModelProperty(value = "用户注册时间")
    private Date registertime;

    @ApiModelProperty(value = "用户头像")
    private String useravatar;

    @ApiModelProperty(value = "用户权限")
    private Integer userrole;

    @ApiModelProperty(value = "用户在线状态")
    private String useronline;
}
