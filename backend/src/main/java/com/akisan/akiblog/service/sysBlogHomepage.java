package com.akisan.akiblog.service;

import com.akisan.akiblog.entity.sys_blog;
import com.akisan.akiblog.pojo.getFuzzySearchInfo;

import java.util.List;

public interface sysBlogHomepage {
    List<sys_blog> showAllBlog();

    List<sys_blog> fuzzySearchBlogByTitle(getFuzzySearchInfo getFuzzySearchInfo);
}
