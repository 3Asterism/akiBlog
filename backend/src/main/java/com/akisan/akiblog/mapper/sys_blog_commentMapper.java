package com.akisan.akiblog.mapper;

import com.akisan.akiblog.entity.sys_blog_comment;
import com.akisan.akiblog.pojo.addBlogCommentInfo;
import com.akisan.akiblog.pojo.delCommentInfo;
import com.akisan.akiblog.pojo.searchCommentInfo;
import com.akisan.akiblog.pojo.updateBlogCommentInfo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface sys_blog_commentMapper {
    //增加博客评论
    void addComment(@Param("addBlogCommentInfo") addBlogCommentInfo addBlogCommentInfo);

    //删除博客评论
    void deleteComment(@Param("delCommentInfo") delCommentInfo delCommentInfo);

    //修改博客评论
    void updateComment(@Param("updateBlogCommentInfo") updateBlogCommentInfo updateBlogCommentInfo);

    //通过博客id搜索所有博客评论
    List<sys_blog_comment> searchAllComment(@Param("searchCommentInfo") searchCommentInfo searchCommentInfo);
}
