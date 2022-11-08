package com.akisan.akiblog.controller;

import com.akisan.akiblog.common.resultForRequest;
import com.akisan.akiblog.entity.sys_blog;
import com.akisan.akiblog.service.Impl.sysBlogEditPageImpl;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/blog")
@Api(tags = "博客编辑页面")
public class BlogEditorController {

    @Autowired
    sysBlogEditPageImpl sysBlogEditPage;

    @PostMapping("/editBlog")
    @ApiOperation(value = "编辑博客")
    public resultForRequest editBlog(@RequestBody sys_blog sys_blog) {
        sysBlogEditPage.insertBlog(sys_blog);
        return resultForRequest.success();
    }
}
