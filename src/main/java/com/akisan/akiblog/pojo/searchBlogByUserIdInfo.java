package com.akisan.akiblog.pojo;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
public class searchBlogByUserIdInfo {
    @ApiModelProperty(value = "用户唯一id")
    private String userId;
}
