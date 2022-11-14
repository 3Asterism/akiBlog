package com.akisan.akiblog.config;

import com.akisan.akiblog.service.SysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@Configuration
@EnableWebSecurity
@EnableGlobalMethodSecurity(prePostEnabled = true)
public class TokenWebSecurityConfig extends WebSecurityConfigurerAdapter {
    @Autowired
    private SysUserService userService;
    // 1.指定认证对象的来源(内存或者数据库),指定加密方式
    @Bean
    public BCryptPasswordEncoder passwordEncoder(){
        return new BCryptPasswordEncoder();
    }

    @Override
    public void configure(AuthenticationManagerBuilder auth) throws Exception {
            auth.userDetailsService(userService).passwordEncoder(passwordEncoder());
    }

    //2. SpringSecurity配置相关信息
    @Override
    public void configure(HttpSecurity http) throws Exception {
        // 释放静态资源，指定拦截规则，指定自定义的认证和退出页面，csrf配置等
        http.authorizeRequests()
                // 指定拦截规则
                .antMatchers("/home/*", "/blog/*", "/userActivity/*", "/findAll/*","/lolicon/*","/login/* " ).permitAll()  //释放这些资源，不拦截
                .antMatchers("/doc.html").hasAnyRole("CODER") //所有资源都需要这些角色中的一个"USER", "ADMIN","CODER","NORMAL"
                .antMatchers("/lolicon/*").hasAnyRole("ADMIN","CODER")
                .antMatchers("/setu/*").hasAnyRole("ADMIN","CODER")
                .anyRequest().authenticated()
                .and().formLogin()  //其他请求，必须认证通过之后才能访问
                .and()
                .csrf()
                .disable();
                }

        @Bean
        public BCryptPasswordEncoder bCryptPasswordEncoder () {
            return new BCryptPasswordEncoder();
        }
}
