package com.akisan.akiblog.controller;

import com.akisan.akiblog.entity.sys_blog;
import com.akisan.akiblog.pojo.dividePageInfo;
import com.akisan.akiblog.pojo.getFuzzySearchInfo;
import com.akisan.akiblog.pojo.searchHomePageMsgResult;
import com.akisan.akiblog.service.Impl.sysBlogHomepageImpl;
import com.github.pagehelper.PageInfo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.annotation.Secured;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/home")
@Api(tags = "主页")
public class HomepageController {
    @Autowired
    private sysBlogHomepageImpl sysBlogHomepage;

    @PostMapping("/findAllBlog")
    @Secured({"ROLE_CODER","ROLE_ADMIN","ROLE_USER","ROLE_NORMAL"})
    @ApiOperation(value = "查询所有博客")
    public PageInfo<sys_blog> searchAllBlog(@RequestBody dividePageInfo dividePageInfo) {
        return sysBlogHomepage.showAllBlog(dividePageInfo);
    }

    @PostMapping("/fuzzySearchBlog")
    @ApiOperation(value = "通过标题模糊搜索博客")
    public List<sys_blog> searchBlog(@RequestBody getFuzzySearchInfo getFuzzySearchInfo) {
        return sysBlogHomepage.fuzzySearchBlogByTitle(getFuzzySearchInfo);
    }

    @GetMapping("/searchHomepageMsg")
    @ApiOperation(value = "查询主页消息")
    public searchHomePageMsgResult searchHomepageMsg() {
        return sysBlogHomepage.getHomepageMsg();
    }
}
