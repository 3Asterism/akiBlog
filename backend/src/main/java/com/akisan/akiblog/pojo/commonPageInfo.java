package com.akisan.akiblog.pojo;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
public class commonPageInfo {
    @ApiModelProperty("当前页码")
    private int pageNum;

    @ApiModelProperty("每页几条数据")
    private int pageSize;
}
