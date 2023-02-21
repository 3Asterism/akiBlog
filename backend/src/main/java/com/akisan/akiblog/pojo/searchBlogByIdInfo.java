package com.akisan.akiblog.pojo;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
public class searchBlogByIdInfo {
    @ApiModelProperty(value = "博客id 对应博客id唯一值")
    private Integer blogid;
}
