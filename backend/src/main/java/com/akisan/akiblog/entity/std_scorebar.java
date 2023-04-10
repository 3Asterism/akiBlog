package com.akisan.akiblog.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@ApiModel(description = "学生 - 大屏条型展示表")
@NoArgsConstructor
@AllArgsConstructor
public class std_scorebar {

    @ApiModelProperty(value = "id")
    private Integer id;

    @ApiModelProperty(value = "平均分")
    private Integer avgscore;

    @ApiModelProperty(value = "学院名称")
    private String academy;
}
