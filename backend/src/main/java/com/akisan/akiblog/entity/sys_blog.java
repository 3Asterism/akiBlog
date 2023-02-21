package com.akisan.akiblog.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.Date;

@Data
@ApiModel(description = "用户 - 博客内容表")
public class sys_blog{
    /**
     * 对应数据库sys_blog类 用于存放博客内容
     */
    @ApiModelProperty(value = "对应sys_user的id")
    private Integer userid;

    @ApiModelProperty(value = "博客内容")
    private String blogcontent;

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @ApiModelProperty(value = "博客创建时间")
    private Date createtime;

    @ApiModelProperty(value = "主键id 对应博客id唯一值")
    @TableId(value = "blogid" , type = IdType.AUTO)
    private Integer blogid;

    @ApiModelProperty(value = "博客内容")
    private String blogtitle;
}
