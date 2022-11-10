package com.akisan.akiblog.mapper;

import com.akisan.akiblog.entity.sys_user;
import com.akisan.akiblog.pojo.organizeRoleInfo;
import com.akisan.akiblog.pojo.searchRoleInfo;
import com.akisan.akiblog.pojo.searchRoleResult;
import com.akisan.akiblog.pojo.userRegisterInfo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;


@Mapper
public interface sys_userMapper {
    //查询所有用户
    List<sys_user> findAll();

    //用户注册时插入数据
    void insertInfo(@Param("sys_user") userRegisterInfo userRegisterInfo);

    //检查账号是否重复
    List<sys_user> findAllId(@Param("username") String username);

    //检查昵称是否重复
    List<sys_user> findAllName(@Param("nickname") String nickname);

    //登录通过账号检查密码
    List<sys_user> findUserPwd(@Param("userName") String userName);

    //给用户更改权限
    void changeUserRole(@Param("organizeRoleInfo") organizeRoleInfo organizeRoleInfo);

    //查看用户权限
    searchRoleResult searchRole(@Param("searchRoleInfo") searchRoleInfo searchRoleInfo);

    //用户登录更改在线状态
    void updateUserOnlineStatus(@Param("userName") String userName);

    //用户退出更新在线状态
    void updateUserOfflineStatus(@Param("userName") String userName);

    //查看当前在线的用户
    List<sys_user> searchOnlineUser();
}
