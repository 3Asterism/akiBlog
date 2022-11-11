package com.akisan.akiblog.service.Impl;

import com.akisan.akiblog.entity.sys_blog;
import com.akisan.akiblog.mapper.sys_blogMapper;
import com.akisan.akiblog.mapper.sys_homepagemsgMapper;
import com.akisan.akiblog.pojo.getFuzzySearchInfo;
import com.akisan.akiblog.pojo.searchHomePageMsgResult;
import com.akisan.akiblog.service.sysBlogHomepage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class sysBlogHomepageImpl implements sysBlogHomepage {
    @Autowired
    sys_blogMapper sysBlogMapper;
    @Autowired
    sys_homepagemsgMapper sys_homepagemsgMapper;

    @Override
    public List<sys_blog> showAllBlog() {
        return sysBlogMapper.searchAllBlog();
    }

    @Override
    public List<sys_blog> fuzzySearchBlogByTitle(getFuzzySearchInfo getFuzzySearchInfo) {
        return sysBlogMapper.fuzzySearchBlog(getFuzzySearchInfo);
    }

    @Override
    public searchHomePageMsgResult getHomepageMsg() {
        return sys_homepagemsgMapper.searchHomePageMsgResult();
    }
}
