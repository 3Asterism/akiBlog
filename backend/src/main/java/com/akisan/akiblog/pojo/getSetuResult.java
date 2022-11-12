package com.akisan.akiblog.pojo;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.List;

@Data
public class getSetuResult {
    @ApiModelProperty(value = "报错")
    private String detail;
    @ApiModelProperty(value = "标签")
    private List<String> tags;
    @ApiModelProperty(value = "返回的数据量")
    private int count;
    @ApiModelProperty(value = "setu类列表")
    private List data;
}
