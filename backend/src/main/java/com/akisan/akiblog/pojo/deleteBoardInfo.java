package com.akisan.akiblog.pojo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
@ApiModel(description = "留言板删除参数表")
public class deleteBoardInfo {
    @ApiModelProperty(value = "留言板id")
    private String boardid;
}
