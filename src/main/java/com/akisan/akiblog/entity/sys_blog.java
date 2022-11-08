package com.akisan.akiblog.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.Date;

@Data
@ApiModel(description = "用户 - 博客内容表")
public class sys_blog {
    /**
     * 对应数据库sys_blog类 用于存放博客内容
     */
    @ApiModelProperty(value = "主键id 对应sys_user的id")
    @TableId(value = "userid")
    private Integer userid;

    @ApiModelProperty(value = "博客内容")
    private String blogcontent;

    @ApiModelProperty(value = "博客创建时间")
    private Date createtime;
}
