package com.akisan.akiblog.pojo;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
public class delCommentInfo {
    @ApiModelProperty(value = "评论id")
    private Integer commentId;
}
