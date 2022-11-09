package com.akisan.akiblog.controller;

import com.akisan.akiblog.entity.sys_blog;
import com.akisan.akiblog.pojo.getFuzzySearchInfo;
import com.akisan.akiblog.service.Impl.sysBlogHomepageImpl;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/home")
@Api(tags = "主页")
public class HomepageController {
    @Autowired
    private sysBlogHomepageImpl sysBlogHomepage;

    @GetMapping("/findAllBlog")
    @ApiOperation(value = "查询所有博客")
    public List<sys_blog> searchAllBlog() {
        return sysBlogHomepage.showAllBlog();
    }

    @PostMapping("/fuzzySearchBlog")
    @ApiOperation(value = "通过标题模糊搜索博客")
    public List<sys_blog> searchBlog(@RequestBody getFuzzySearchInfo getFuzzySearchInfo) {
        return sysBlogHomepage.fuzzySearchBlogByTitle(getFuzzySearchInfo);
    }
}