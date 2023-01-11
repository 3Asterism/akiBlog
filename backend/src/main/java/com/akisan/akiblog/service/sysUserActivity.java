package com.akisan.akiblog.service;

import com.akisan.akiblog.entity.sys_user;
import com.akisan.akiblog.pojo.searchUserByNameInfo;
import com.akisan.akiblog.pojo.searchUserByNameResult;

import java.util.List;

public interface sysUserActivity {
    List<sys_user> showOnlineUser();

    List<searchUserByNameResult> userSearchUserById(searchUserByNameInfo searchUserByNameInfo);

    sys_user showUserById(String userid);

    sys_user showUserByName(String name);
}
