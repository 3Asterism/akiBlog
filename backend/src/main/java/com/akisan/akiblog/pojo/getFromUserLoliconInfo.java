package com.akisan.akiblog.pojo;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.List;

@Data
public class getFromUserLoliconInfo {
    /**
     * lolicon带参搜索用户参数
     */
    @ApiModelProperty("是否r18")
    private int r18;

    @ApiModelProperty("返回指定标签的作品")
    private List<String> tag;
}
