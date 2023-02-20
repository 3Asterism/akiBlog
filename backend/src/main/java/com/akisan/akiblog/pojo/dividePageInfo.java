package com.akisan.akiblog.pojo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
@ApiModel("分页参数类")
public class dividePageInfo {
    @ApiModelProperty("当前页码")
    private int pageNum;
    @ApiModelProperty("每页几条数据")
    private int pageSize;
}
