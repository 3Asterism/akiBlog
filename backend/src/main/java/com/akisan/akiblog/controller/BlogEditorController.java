package com.akisan.akiblog.controller;

import com.akisan.akiblog.common.resultForRequest;
import com.akisan.akiblog.entity.sys_blog;
import com.akisan.akiblog.pojo.deleteBlogByBlogIdInfo;
import com.akisan.akiblog.pojo.searchBlogByUserIdInfo;
import com.akisan.akiblog.service.Impl.sysBlogEditPageImpl;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/blog")
@Api(tags = "博客编辑模块")
public class BlogEditorController {

    @Autowired
    sysBlogEditPageImpl sysBlogEditPage;

    @PostMapping("/editBlog")
    @ApiOperation(value = "新增博客")
    public resultForRequest editBlog(@RequestBody sys_blog sys_blog) {
        sysBlogEditPage.insertBlog(sys_blog);
        return resultForRequest.success();
    }

    @DeleteMapping("/deleteBlog")
    @ApiOperation(value = "通过blogid删除博客")
    public resultForRequest deleteBlog(@RequestBody deleteBlogByBlogIdInfo deleteBlogByBlogIdInfo) {
        sysBlogEditPage.deleteBlog(deleteBlogByBlogIdInfo);
        return resultForRequest.success();
    }

    @PostMapping("/reformBlog")
    @ApiOperation(value = "修改博客")
    public resultForRequest reformBlog(@RequestBody sys_blog sys_blog) {
        sysBlogEditPage.reformBlog(sys_blog);
        return resultForRequest.success();
    }

    @PostMapping("/searchBlog")
    @ApiOperation(value = "通过用户id查找博客")
    public List<sys_blog> searchBlog(@RequestBody searchBlogByUserIdInfo searchBlogByUserIdInfo) {
        return sysBlogEditPage.searchBlog(searchBlogByUserIdInfo);
    }
}
