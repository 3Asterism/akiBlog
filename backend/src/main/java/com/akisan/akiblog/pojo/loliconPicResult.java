package com.akisan.akiblog.pojo;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.List;

@Data
public class loliconPicResult {
    /**
     * 调用lolicon接口的返回值
     */
    @ApiModelProperty(value = "错误信息")
    private String error;

    @ApiModelProperty(value = "loliconPic数组")
    private List data;
}
