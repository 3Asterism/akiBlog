package com.akisan.akiblog.service;

import com.akisan.akiblog.entity.sys_blog;
import com.akisan.akiblog.pojo.deleteBlogByBlogIdInfo;
import com.akisan.akiblog.pojo.searchBlogByUserIdInfo;

import java.util.List;

public interface sysBlogEditPage {
    void insertBlog(sys_blog sys_blog);

    void deleteBlog(deleteBlogByBlogIdInfo deleteBlogByBlogIdInfo);

    void reformBlog(sys_blog sys_blog);

    List<sys_blog> searchBlog(searchBlogByUserIdInfo searchBlogByUserIdInfo);
}
