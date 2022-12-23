package com.akisan.akiblog.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
@ApiModel(description = "用户 - 博客评论表")
public class sys_blog_comment {
    @ApiModelProperty(value = "主键id 对应评论id唯一值")
    @TableId(value = "commentid" , type = IdType.AUTO)
    private Integer commentid;

    @ApiModelProperty(value = "博客id 对应博客id唯一值")
    private Integer blogid;

    @ApiModelProperty(value = "博客评论")
    private String comment;

    @ApiModelProperty(value = "评论人id")
    private Integer userid;
}
