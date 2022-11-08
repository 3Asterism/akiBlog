package com.akisan.akiblog.service;

import com.akisan.akiblog.entity.sys_blog;

import java.util.List;

public interface sysBlogEditPage {
    void insertBlog(sys_blog sys_blog);

    void deleteBlog(sys_blog sys_blog);

    void reformBlog(sys_blog sys_blog);

    List<sys_blog> searchBlog(sys_blog sys_blog);
}
