package com.akisan.akiblog.controller;

import com.akisan.akiblog.common.resultForRequestConstant;
import com.akisan.akiblog.entity.sys_blog_comment;
import com.akisan.akiblog.pojo.addBlogCommentInfo;
import com.akisan.akiblog.pojo.delCommentInfo;
import com.akisan.akiblog.pojo.searchCommentInfo;
import com.akisan.akiblog.pojo.updateBlogCommentInfo;
import com.akisan.akiblog.service.Impl.sysBlogCommentImpl;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.annotation.Secured;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/blogComment")
@Api(tags = "博客评论编辑模块")
public class BlogCommentController {
    @Autowired
    sysBlogCommentImpl sysBlogCommentImpl;

    @Secured({"ROLE_CODER","ROLE_ADMIN","ROLE_USER"})
    @PostMapping("/addBlogComment")
    @ApiOperation(value = "新增博客评论")
    public resultForRequestConstant addComment(@RequestBody addBlogCommentInfo addBlogCommentInfo) {
        sysBlogCommentImpl.addComment(addBlogCommentInfo);
        return resultForRequestConstant.success();
    }

    @Secured({"ROLE_CODER","ROLE_ADMIN","ROLE_USER"})
    @PostMapping("/deleteBlogComment")
    @ApiOperation(value = "删除博客评论")
    public resultForRequestConstant deleteComment(@RequestBody delCommentInfo delCommentInfo) {
        sysBlogCommentImpl.deleteComment(delCommentInfo);
        return resultForRequestConstant.success();
    }

    @Secured({"ROLE_CODER","ROLE_ADMIN","ROLE_USER"})
    @PostMapping("/updateBlogComment")
    @ApiOperation(value = "修改博客评论")
    public resultForRequestConstant updateComment(@RequestBody updateBlogCommentInfo updateBlogCommentInfo) {
        sysBlogCommentImpl.updateComment(updateBlogCommentInfo);
        return resultForRequestConstant.success();
    }

    @Secured({"ROLE_CODER","ROLE_ADMIN","ROLE_USER"})
    @PostMapping("/searchBlogCommentById")
    @ApiOperation(value = "通过博客id查找博客评论")
    public List<sys_blog_comment> searchBlog(@RequestBody searchCommentInfo searchCommentInfo) {
        return sysBlogCommentImpl.searchAllComment(searchCommentInfo);
    }
}
