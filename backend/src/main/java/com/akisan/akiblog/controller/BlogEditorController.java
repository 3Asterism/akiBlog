package com.akisan.akiblog.controller;

import com.akisan.akiblog.common.resultForRequestConstant;
import com.akisan.akiblog.entity.sys_blog;
import com.akisan.akiblog.pojo.deleteBlogByBlogIdInfo;
import com.akisan.akiblog.pojo.searchBlogByIdInfo;
import com.akisan.akiblog.pojo.searchBlogByUserIdInfo;
import com.akisan.akiblog.service.Impl.sysBlogEditPageImpl;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.annotation.Secured;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/blog")
@Api(tags = "博客编辑模块")
public class BlogEditorController {

    @Autowired
    sysBlogEditPageImpl sysBlogEditPage;

    @Secured({"ROLE_CODER","ROLE_ADMIN","ROLE_USER"})
    @PostMapping("/editBlog")
    @ApiOperation(value = "新增博客")
    public resultForRequestConstant editBlog(@RequestBody sys_blog sys_blog) {
        sysBlogEditPage.insertBlog(sys_blog);
        return resultForRequestConstant.success();
    }

    @Secured({"ROLE_CODER","ROLE_ADMIN","ROLE_USER"})
    @DeleteMapping("/deleteBlog")
    @ApiOperation(value = "通过blogid删除博客")
    public resultForRequestConstant deleteBlog(@RequestBody deleteBlogByBlogIdInfo deleteBlogByBlogIdInfo) {
        sysBlogEditPage.deleteBlog(deleteBlogByBlogIdInfo);
        return resultForRequestConstant.success();
    }

    @Secured({"ROLE_CODER","ROLE_ADMIN","ROLE_USER"})
    @PostMapping("/reformBlog")
    @ApiOperation(value = "修改博客")
    public resultForRequestConstant reformBlog(@RequestBody sys_blog sys_blog) {
        sysBlogEditPage.reformBlog(sys_blog);
        return resultForRequestConstant.success();
    }

    @Secured({"ROLE_CODER","ROLE_ADMIN","ROLE_USER"})
    @PostMapping("/searchBlog")
    @ApiOperation(value = "通过用户id查找博客")
    public List<sys_blog> searchBlog(@RequestBody searchBlogByUserIdInfo searchBlogByUserIdInfo) {
        return sysBlogEditPage.searchBlog(searchBlogByUserIdInfo);
    }

    @PostMapping("/searchBlogById")
    @ApiOperation(value = "通过博客id查找博客")
    public List<sys_blog> searchBlogById(@RequestBody searchBlogByIdInfo searchBlogByIdInfo) {
        return sysBlogEditPage.searchBlogById(searchBlogByIdInfo);
    }
}
