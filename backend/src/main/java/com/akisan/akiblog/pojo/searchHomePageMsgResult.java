package com.akisan.akiblog.pojo;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.Date;

@Data
public class searchHomePageMsgResult {
    @ApiModelProperty(value = "主页消息内容")
    private String msgcontent;

    @ApiModelProperty(value = "主页消息创建时间")
    private Date msgcreatetime;
}
