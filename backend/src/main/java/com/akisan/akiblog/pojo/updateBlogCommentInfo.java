package com.akisan.akiblog.pojo;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
public class updateBlogCommentInfo {
    @ApiModelProperty(value = "博客评论")
    private String comment;

    @ApiModelProperty(value = "评论人id")
    private Integer userid;

    @ApiModelProperty(value = "评论id")
    private Integer commentId;
}
