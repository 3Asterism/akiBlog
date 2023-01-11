package com.akisan.akiblog.service.Impl;

import com.akisan.akiblog.entity.sys_user;
import com.akisan.akiblog.mapper.sys_userMapper;
import com.akisan.akiblog.pojo.searchUserByNameInfo;
import com.akisan.akiblog.pojo.searchUserByNameResult;
import com.akisan.akiblog.service.sysUserActivity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class sysUserActivityImpl implements sysUserActivity {
    @Autowired
    private sys_userMapper sys_userMapper;
    @Override
    public List<sys_user> showOnlineUser() {
        return sys_userMapper.searchOnlineUser();
    }

    @Override
    public List<searchUserByNameResult> userSearchUserById(searchUserByNameInfo searchUserByNameInfo) {
        return sys_userMapper.userSearchUserById(searchUserByNameInfo);
    }

    @Override
    public sys_user showUserById(String userid) {
        return sys_userMapper.getAllByUsername(userid);
    }
}
