package com.akisan.akiblog.mapper;

import com.akisan.akiblog.entity.sys_blog;
import com.akisan.akiblog.pojo.deleteBlogByBlogIdInfo;
import com.akisan.akiblog.pojo.getFuzzySearchInfo;
import com.akisan.akiblog.pojo.searchBlogByIdInfo;
import com.akisan.akiblog.pojo.searchBlogByUserIdInfo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface sys_blogMapper {
    //查找所有博客
    List<sys_blog> searchAllBlog();

    //编写博客
    void insertBlog(@Param("sys_blog") sys_blog sys_blog);

    //删除博客
    void deleteBlog(@Param("sys_blog") deleteBlogByBlogIdInfo deleteBlogByBlogIdInfo);

    //修改博客
    void reformBlog(@Param("sys_blog") sys_blog sys_blog);

    //查找博客
    List<sys_blog> searchBlog(@Param("sys_blog") searchBlogByUserIdInfo sys_blog);

    //通过标题模糊搜索博客
    List<sys_blog> fuzzySearchBlog(@Param("getFuzzySearchInfo") getFuzzySearchInfo getFuzzySearchInfo);

    //通过博客id搜索博客
    List<sys_blog> searchBlogById(@Param("searchBlogByIdInfo") searchBlogByIdInfo searchBlogByIdInfo);
}
