package com.akisan.akiblog.pojo;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import org.springframework.stereotype.Component;

import java.util.Collections;
import java.util.List;

@Data
@Component
public class searchLoliconInfo {
    /**
     * lolicon带参搜索所需参数
     */
    @ApiModelProperty("是否r18")
    private int r18;

    @ApiModelProperty("一次性返回的结果数量")
    private final int num = 1;

    @ApiModelProperty("返回指定uid作者的作品 最多20")
    private final List<Integer> uid = null;

    @ApiModelProperty("标题作者标签模糊搜索 已弃用")
    private final String keyword = "";

    @ApiModelProperty("返回指定标签的作品")
    private List<String> tag;

    @ApiModelProperty("返回指定规格的作品")
    private final List<String> size = Collections.singletonList("original");

    @ApiModelProperty("设置反向代理")
    private final String proxy = "i.pixiv.re";

    @ApiModelProperty("设定返回时间后的作品")
    private final int dateAfter = 0;

    @ApiModelProperty("设定返回事件前的作品")
    private final int dateBefore = 0;

    @ApiModelProperty("设置为任意真值以禁用对某些缩写keyword和tag的自动转换")
    private final boolean dsc = false;
}
