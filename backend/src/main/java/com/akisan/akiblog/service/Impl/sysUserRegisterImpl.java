package com.akisan.akiblog.service.Impl;

import com.akisan.akiblog.common.businessException;
import com.akisan.akiblog.common.errorConstants;
import com.akisan.akiblog.entity.sys_user;
import com.akisan.akiblog.mapper.sys_userMapper;
import com.akisan.akiblog.pojo.*;
import com.akisan.akiblog.service.sysUserRegister;
import com.akisan.akiblog.utils.JwtUtil;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static com.akisan.akiblog.common.legalCheckGlobalConstant.checkPwdLength;
import static com.akisan.akiblog.common.legalCheckGlobalConstant.checkRegisterLength;

@Service
public class sysUserRegisterImpl implements sysUserRegister {
    @Autowired
    private sys_userMapper sys_userMapper;
    @Autowired
    private AuthenticationManager authenticationManager;

    public void checkInfoLegal(String username, String pwd, String nickname) {
        //检查info合法性
        if (pwd.length() < checkPwdLength) {
            throw new businessException(errorConstants.CODE_402,"密码长度过短!");
        }
        if (username.length() < checkRegisterLength) {
            throw new businessException(errorConstants.CODE_402,"账号长度过短!");
        }
        if (nickname.length() < checkRegisterLength) {
            throw new businessException(errorConstants.CODE_402,"昵称长度过短!");
        }
    }

    @Override
    public void insertUserInfo(userRegisterInfo sys) {
        if (!sys_userMapper.findAllId(sys.getUserName()).isEmpty()) {
            throw new businessException(errorConstants.CODE_402,"账号已被使用!");
        }
        if (!sys_userMapper.findAllName(sys.getNickName()).isEmpty()) {
            throw new businessException(errorConstants.CODE_402,"昵称已被使用!");
        }
        checkInfoLegal(sys.getUserName(), sys.getPassword(), sys.getNickName());
        sys_userMapper.insertInfo(sys);
    }

    @Override
    public ResponseResult userLogin(userLoginInfo sys) {
        //获取AuthenticationManager认证方法进行认证
        UsernamePasswordAuthenticationToken authenticationToken = new UsernamePasswordAuthenticationToken(sys.getUserName(),sys.getPassword());
        Authentication authentication = authenticationManager.authenticate(authenticationToken);
        sys_user sys_user = (sys_user) authentication.getPrincipal();
        String userid = sys_user.getUserid().toString();
        String jwt = JwtUtil.createJWT(userid);
        sys_userMapper.updateUserOnlineStatus(sys.getUserName());
        Map<String,String> map = new HashMap<>();
        map.put("token",jwt);
        return new ResponseResult(200,"登陆成功",map);
    }

    @Override
    public void userLogOut(userLogOutInfo sys) {
        sys_userMapper.updateUserOfflineStatus(sys.getUserName());
    }
}
