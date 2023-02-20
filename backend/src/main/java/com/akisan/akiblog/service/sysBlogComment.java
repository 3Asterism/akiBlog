package com.akisan.akiblog.service;

import com.akisan.akiblog.entity.sys_blog_comment;
import com.akisan.akiblog.pojo.addBlogCommentInfo;
import com.akisan.akiblog.pojo.delCommentInfo;
import com.akisan.akiblog.pojo.searchCommentInfo;
import com.akisan.akiblog.pojo.updateBlogCommentInfo;
import com.github.pagehelper.PageInfo;

import java.util.List;

public interface sysBlogComment {
    void addComment(addBlogCommentInfo addBlogCommentInfo);

    void deleteComment(delCommentInfo delCommentInfo);

    void updateComment(updateBlogCommentInfo updateBlogCommentInfo);

    PageInfo<sys_blog_comment> searchAllComment(searchCommentInfo searchCommentInfo);
}
