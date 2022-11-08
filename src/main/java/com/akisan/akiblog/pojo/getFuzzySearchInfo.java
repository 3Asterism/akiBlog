package com.akisan.akiblog.pojo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
@ApiModel(description = "根据标题模糊搜索参数")
public class getFuzzySearchInfo {
    @ApiModelProperty(value = "博客内容")
    private String searchContent;
}
