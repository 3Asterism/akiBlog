package com.akisan.akiblog.service.Impl;

import com.akisan.akiblog.entity.sys_blog_comment;
import com.akisan.akiblog.entity.usr_comment_board;
import com.akisan.akiblog.mapper.sys_blog_commentMapper;
import com.akisan.akiblog.pojo.addBlogCommentInfo;
import com.akisan.akiblog.pojo.delCommentInfo;
import com.akisan.akiblog.pojo.searchCommentInfo;
import com.akisan.akiblog.pojo.updateBlogCommentInfo;
import com.akisan.akiblog.service.sysBlogComment;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class sysBlogCommentImpl implements sysBlogComment {
    @Autowired
    private sys_blog_commentMapper sys_blog_commentMapper;

    @Override
    public void addComment(addBlogCommentInfo addBlogCommentInfo) {
        sys_blog_commentMapper.addComment(addBlogCommentInfo);
    }

    @Override
    public void deleteComment(delCommentInfo delCommentInfo) {
        sys_blog_commentMapper.deleteComment(delCommentInfo);
    }

    @Override
    public void updateComment(updateBlogCommentInfo updateBlogCommentInfo) {
        sys_blog_commentMapper.updateComment(updateBlogCommentInfo);
    }

    @Override
    public PageInfo<sys_blog_comment> searchAllComment(searchCommentInfo searchCommentInfo) {
        PageHelper.startPage(searchCommentInfo.getPageNum(),searchCommentInfo.getPageSize());
        List<sys_blog_comment> comments = sys_blog_commentMapper.searchAllComment(searchCommentInfo);
        PageInfo<sys_blog_comment> pageInfo = new PageInfo<>(comments);
        return pageInfo;
    }

}
