package com.akisan.akiblog.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
@ApiModel(description = "接口调用次数检查表")
public class usr_activity {
    @ApiModelProperty(value = "主键id 自增")
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @ApiModelProperty(value = "接口调用次数")
    private String getpictimes;

    @ApiModelProperty(value = "描述")
    private String description;
}
