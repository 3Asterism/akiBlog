package com.akisan.akiblog.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.Date;

@Data
public class sys_homepagemsg {
    /**
     * 存放主页信息提醒等
     */
    @ApiModelProperty(value = "主键id 自增")
    @TableId(value = "id", type = IdType.AUTO)
    private Integer msgid;

    @ApiModelProperty(value = "博客内容")
    private String msgcontent;

    @ApiModelProperty(value = "博客内容")
    private Date msgcreatetime;

}
