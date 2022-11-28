package com.akisan.akiblog.config;

import com.akisan.akiblog.entity.sys_role;
import com.akisan.akiblog.entity.sys_user;
import com.akisan.akiblog.mapper.sys_roleMapper;
import com.akisan.akiblog.mapper.sys_userMapper;
import com.akisan.akiblog.utils.JwtUtil;
import io.jsonwebtoken.Claims;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;
import org.springframework.web.filter.OncePerRequestFilter;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;
import java.util.Objects;

@Component
public class JwtAuthenticationTokenFilter extends OncePerRequestFilter {
    @Autowired
    private sys_userMapper sys_userMapper;
    @Autowired
    private sys_roleMapper sysRoleMapper;
    @Override
    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain) throws ServletException, IOException {
        //获取token
        String token = request.getHeader("token");
        if (!StringUtils.hasText(token)) {
            //放行
            filterChain.doFilter(request, response);
            return ;
        }
        //解析token
        String userid;
        try {
            Claims claims = JwtUtil.parseJWT(token);
            userid = claims.getSubject();
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException("token非法");
        }
        sys_user sys_user = sys_userMapper.getAllByUsername(userid);
        if(sys_user.getUseronline().equals("0")){
            throw new RuntimeException("用户未登录");
        }
        //加入权限模块
        List<sys_role> sysRoles = sysRoleMapper.listAllByUserId(Integer.parseInt(userid));
        sys_user.setRoles(sysRoles);
        //存入SecurityContextHolder
        UsernamePasswordAuthenticationToken authenticationToken = new UsernamePasswordAuthenticationToken(sys_user,sys_user.getPassword(),sys_user.getAuthorities());
        SecurityContextHolder.getContext().setAuthentication(authenticationToken);
        //放行
        filterChain.doFilter(request, response);
    }
}
