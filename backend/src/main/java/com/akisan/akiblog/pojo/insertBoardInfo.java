package com.akisan.akiblog.pojo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.Date;

@Data
@ApiModel(description = "留言板插入表")
public class insertBoardInfo {
    @ApiModelProperty(value = "留言用户id")
    private String userid;

    @ApiModelProperty(value = "留言板内容")
    private String boardcontent;

}
