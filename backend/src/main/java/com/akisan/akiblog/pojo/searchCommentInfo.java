package com.akisan.akiblog.pojo;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
public class searchCommentInfo {
    @ApiModelProperty(value = "博客id")
    private Integer blogId;
}
