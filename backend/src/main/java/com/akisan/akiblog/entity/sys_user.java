package com.akisan.akiblog.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.fasterxml.jackson.annotation.JsonIgnore;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.List;

@Data
@ApiModel(description = "用户 - 基础数据表")
public class sys_user implements UserDetails {
    /**
     * 对应数据库sys_user类 用于存放用户基本信息
     */

    @ApiModelProperty(value = "用户账号" , required = true)
    private String username;

    @ApiModelProperty(value = "用户密码" , required = true)
    private String password;

    @ApiModelProperty(value = "用户昵称" , required = true)
    private String nickname;

    @ApiModelProperty(value = "主键id 自增 后期采用雪花id")
    @TableId(value = "userid" , type = IdType.AUTO)
    private Integer userid;

    @ApiModelProperty(value = "用户邮箱")
    private String email;

    @ApiModelProperty(value = "用户电话号码")
    private String phonenum;

    @ApiModelProperty(value = "用户地址")
    private String address;

    @ApiModelProperty(value = "用户注册时间")
    private Date registertime;

    @ApiModelProperty(value = "用户头像")
    private String useravatar;

    @ApiModelProperty(value = "用户权限")
    private Integer userrole;

    @ApiModelProperty(value = "用户在线状态")
    private String useronline;

    @ApiModelProperty(value = "用户状态，1-开启-0禁用")
    private Boolean status;

    @ApiModelProperty(value = "密码是否失效，1-可用，0-失效")
    private Boolean passwordNonExpired;

    /**
     * 用户关联的所有角色
     */
    @ApiModelProperty(value = "职责")
    private List<sys_role> roles = new ArrayList<>();

    @JsonIgnore
    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return roles;
    }

    @JsonIgnore
    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @JsonIgnore
    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @JsonIgnore
    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @JsonIgnore
    @Override
    public boolean isEnabled() {
        return true;
    }
}
