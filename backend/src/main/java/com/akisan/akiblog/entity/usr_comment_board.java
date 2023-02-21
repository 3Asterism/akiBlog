package com.akisan.akiblog.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.Date;

@Data
@ApiModel(description = "用户博客留言检查表")
public class usr_comment_board {
    @ApiModelProperty(value = "主键id 自增")
    @TableId(value = "boardid", type = IdType.AUTO)
    private Integer boardid;

    @ApiModelProperty(value = "留言用户id")
    private String userid;

    @ApiModelProperty(value = "留言板内容")
    private String boardcontent;

    @ApiModelProperty(value = "用户名称")
    private String nickname;

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @ApiModelProperty(value = "留言创建时间")
    private Date createtime;
}
