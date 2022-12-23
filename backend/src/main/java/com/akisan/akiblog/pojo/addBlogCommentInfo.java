package com.akisan.akiblog.pojo;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
public class addBlogCommentInfo {
    @ApiModelProperty(value = "博客id 对应博客id唯一值")
    private Integer blogid;

    @ApiModelProperty(value = "博客评论")
    private String comment;

    @ApiModelProperty(value = "评论人id")
    private Integer userid;
}
