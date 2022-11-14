package com.akisan.akiblog.mapper;

import com.akisan.akiblog.entity.sys_user_role;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface sys_user_roleMapper {
    void insertUserRole(@Param("sys_user_role") sys_user_role sys_user_role);
}
