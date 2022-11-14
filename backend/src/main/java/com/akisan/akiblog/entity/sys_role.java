package com.akisan.akiblog.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.fasterxml.jackson.annotation.JsonIgnore;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import org.springframework.security.core.GrantedAuthority;


@Data
public class sys_role implements GrantedAuthority {
    /**
     * 角色表 用于管理权限
     */
    @ApiModelProperty(value = "主键id 自增")
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @ApiModelProperty(value = "名称")
    private String name;

    @ApiModelProperty(value = "描述")
    private String description;

    @JsonIgnore
    @Override
    public String getAuthority() {
        return name;
    }
}
