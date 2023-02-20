package com.akisan.akiblog.service;

import com.akisan.akiblog.entity.sys_blog;
import com.akisan.akiblog.pojo.dividePageInfo;
import com.akisan.akiblog.pojo.getFuzzySearchInfo;
import com.akisan.akiblog.pojo.searchHomePageMsgResult;
import com.github.pagehelper.PageInfo;

import java.util.List;

public interface sysBlogHomepage {
    PageInfo<sys_blog> showAllBlog(dividePageInfo dividePageInfo);

    List<sys_blog> fuzzySearchBlogByTitle(getFuzzySearchInfo getFuzzySearchInfo);

    searchHomePageMsgResult getHomepageMsg();
}
