package com.akisan.akiblog.service.Impl;

import com.akisan.akiblog.entity.sys_blog;
import com.akisan.akiblog.mapper.sys_blogMapper;
import com.akisan.akiblog.service.sysBlogHomepage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class sysBlogHomepageImpl implements sysBlogHomepage {
    @Autowired
    sys_blogMapper sysBlogMapper;

    @Override
    public List<sys_blog> showAllBlog() {
        return sysBlogMapper.searchAllBlog();
    }
}
