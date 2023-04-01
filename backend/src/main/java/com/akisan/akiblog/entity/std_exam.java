package com.akisan.akiblog.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
@ApiModel(description = "学生 - 详细信息表")
public class std_exam {
    @ApiModelProperty(value = "考试信息id")
    private Integer id;

    @ApiModelProperty(value = "学生id")
    private Integer stdid;

    @ApiModelProperty(value = "学生姓名")
    private String name;

    @ApiModelProperty(value = "考试课程")
    private String examclass;

    @ApiModelProperty(value = "考试分数")
    private Integer score;
}
