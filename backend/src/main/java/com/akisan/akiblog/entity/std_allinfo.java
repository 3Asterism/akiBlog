package com.akisan.akiblog.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
@ApiModel(description = "学生 - 详细信息表")
public class std_allinfo {
    @ApiModelProperty(value = "学生id")
    private Integer id;

    @ApiModelProperty(value = "学生姓名")
    private String name;

    @ApiModelProperty(value = "学生所在班级")
    private String classname;

    @ApiModelProperty(value = "学生是否在校 1是0否")
    private String inschool;


}
