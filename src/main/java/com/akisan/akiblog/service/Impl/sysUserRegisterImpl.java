package com.akisan.akiblog.service.Impl;

import com.akisan.akiblog.common.businessException;
import com.akisan.akiblog.entity.sys_user;
import com.akisan.akiblog.mapper.sys_userMapper;
import com.akisan.akiblog.pojo.userLoginInfo;
import com.akisan.akiblog.pojo.userRegisterInfo;
import com.akisan.akiblog.service.sysUserRegister;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

import static com.akisan.akiblog.common.globalConstant.checkPwdLength;

@Service
public class sysUserRegisterImpl implements sysUserRegister {
    @Autowired
    sys_userMapper sys_userMapper;

    public void checkInfoLegal(String username ,String pwd,String nickname){
        //检查info合法性
            if(pwd.length() < checkPwdLength){
                throw new businessException("密码长度过短!");
            }
            if(username.length() < checkPwdLength){
                throw new businessException("账号长度过短!");
            }
            if(nickname.length() < checkPwdLength){
                throw new businessException("昵称长度过短!");
            }
    }

    @Override
    public void insertUserInfo(userRegisterInfo sys) {
        if(!sys_userMapper.findAllId(sys.getUserName()).isEmpty()) {
            throw new businessException("账号已被使用!");
        }
        if(!sys_userMapper.findAllName(sys.getNickName()).isEmpty()) {
            throw new businessException("昵称已被使用!");
        }
        checkInfoLegal(sys.getUserName(),sys.getPassword(),sys.getNickName());
        sys_userMapper.insertInfo(sys);
    }

    @Override
    public void userLogin(userLoginInfo sys) {
        List<sys_user> userPwd = sys_userMapper.findUserPwd(sys.getUserName());
        if(userPwd.isEmpty()) {
            throw new businessException("没有此账号!");
        }
        if(!sys.getPassword().equals(userPwd.get(0).getPassword())){
            throw new businessException("密码错误!");
        }
    }
}
