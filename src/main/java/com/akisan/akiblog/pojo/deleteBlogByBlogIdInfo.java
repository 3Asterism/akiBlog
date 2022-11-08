package com.akisan.akiblog.pojo;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
public class deleteBlogByBlogIdInfo {
    @ApiModelProperty(value = "博客唯一id")
    private String blogId;
}
