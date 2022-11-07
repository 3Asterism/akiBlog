package com.akisan.akiblog.mapper;

import com.akisan.akiblog.entity.sys_user;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;


@Mapper
public interface sys_userMapper {
    //查询所有用户
    List<sys_user> findAll();
    //用户注册时插入数据
    void insertInfo(@Param("sys_user") sys_user sys);
    //检查账号是否重复
    List<sys_user> findAllId(@Param("username") String username);
    //检查昵称是否重复
    List<sys_user> findAllName(@Param("nickname") String nickname);
}
