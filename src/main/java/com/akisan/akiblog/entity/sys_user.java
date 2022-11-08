package com.akisan.akiblog.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.fasterxml.jackson.annotation.JsonIgnore;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
@ApiModel(description = "用户 - 基础数据表")
public class sys_user  {
    /**
     * 对应数据库sys_user类 用于存放用户基本信息
     */

    @ApiModelProperty(value = "用户账号" , required = true)
    private String username;

    @ApiModelProperty(value = "用户密码" , required = true)
    private String password;

    @ApiModelProperty(value = "用户昵称" , required = true)
    private String nickname;

    @ApiModelProperty(value = "主键id 自增 后期采用雪花id")
    @TableId(value = "userid" , type = IdType.AUTO)
    private Integer userid;

    @ApiModelProperty(value = "用户邮箱")
    private String email;

    @ApiModelProperty(value = "用户电话号码")
    private String phonenum;

    @ApiModelProperty(value = "用户地址")
    private String address;

    @ApiModelProperty(value = "用户注册时间")
    private String registertime;

    @ApiModelProperty(value = "用户头像")
    private String useravatar;
}
