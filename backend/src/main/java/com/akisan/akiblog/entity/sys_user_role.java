package com.akisan.akiblog.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import org.springframework.stereotype.Component;

@Data
@ApiModel(description = "用户权限过渡表")
@Component
public class sys_user_role {
    /**
     * 用户权限过渡表
     */
    @ApiModelProperty(value = "主键id 自增")
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @ApiModelProperty(value = "用户id")
    private Integer user_id;

    @ApiModelProperty(value = "权限id")
    private Integer role_id;

    @ApiModelProperty(value = "是否激活")
    private boolean enabled;
}
