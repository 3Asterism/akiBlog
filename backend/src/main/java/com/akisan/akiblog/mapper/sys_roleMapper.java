package com.akisan.akiblog.mapper;

import com.akisan.akiblog.entity.sys_role;
import com.akisan.akiblog.pojo.delRoleInfo;
import com.akisan.akiblog.pojo.insertRoleInfo;
import com.akisan.akiblog.pojo.reformRoleInfo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface sys_roleMapper {
    //增加权限
    void insertRole(@Param("insertRoleInfo") insertRoleInfo insertRoleInfo);

    //删除权限
    void deleteRole(@Param("delRoleInfo") delRoleInfo delRoleInfo);

    //修改权限
    void reformRole(@Param("reformRoleInfo") reformRoleInfo reformRoleInfo);

    //返回所有权限
    List<sys_role> searchAllRole();
}
