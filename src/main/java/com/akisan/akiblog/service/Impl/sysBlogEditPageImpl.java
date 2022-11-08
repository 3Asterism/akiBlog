package com.akisan.akiblog.service.Impl;

import com.akisan.akiblog.entity.sys_blog;
import com.akisan.akiblog.mapper.sys_blogMapper;
import com.akisan.akiblog.service.sysBlogEditPage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class sysBlogEditPageImpl implements sysBlogEditPage {
    @Autowired
    private sys_blogMapper sysBlogMapper;

    @Override
    public void insertBlog(sys_blog sys_blog) {
        sysBlogMapper.insertBlog(sys_blog);
    }

    @Override
    public void deleteBlog(sys_blog sys_blog) {
        sysBlogMapper.deleteBlog(sys_blog);
    }

    @Override
    public void reformBlog(sys_blog sys_blog) {
        sysBlogMapper.reformBlog(sys_blog);
    }

    @Override
    public List<sys_blog> searchBlog(sys_blog sys_blog) {
        return sysBlogMapper.searchBlog(sys_blog);
    }
}
