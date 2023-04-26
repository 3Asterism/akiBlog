package com.akisan.akiblog.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@ApiModel(description = "学生 - 活动报警表")
@NoArgsConstructor
@AllArgsConstructor
public class std_actvalarm {
    @ApiModelProperty(value = "主键id")
    private Integer id;

    @ApiModelProperty(value = "学生id")
    private Integer stdid;

    @ApiModelProperty(value = "学生姓名")
    private String name;

    @ApiModelProperty(value = "学生活动参与率是否足够 1是0否")
    private Integer ifattempt;

    @ApiModelProperty(value = "报警原因")
    private String result;

}
