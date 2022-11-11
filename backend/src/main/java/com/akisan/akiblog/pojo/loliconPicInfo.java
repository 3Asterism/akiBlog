package com.akisan.akiblog.pojo;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.List;

@Data
public class loliconPicInfo {
    /**
     * 调用lolicon接口所需的参数
     */
    @ApiModelProperty("是否r18")
    private int r18;

    @ApiModelProperty("一次性返回的结果数量")
    private int num;

    @ApiModelProperty("返回指定uid作者的作品 最多20")
    private List<Integer> uid;

    @ApiModelProperty("标题作者标签模糊搜索 已弃用")
    private String keyword;

    @ApiModelProperty("返回指定标签的作品")
    private List<String> tag;

    @ApiModelProperty("返回指定规格的作品")
    private List<String> size;

    @ApiModelProperty("设置反向代理")
    private String proxy;

    @ApiModelProperty("设定返回时间后的作品")
    private int dateAfter;

    @ApiModelProperty("设定返回事件前的作品")
    private int dateBefore;

    @ApiModelProperty("设置为任意真值以禁用对某些缩写keyword和tag的自动转换")
    private boolean dsc;
}
