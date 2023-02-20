package com.akisan.akiblog.mapper;

import com.akisan.akiblog.entity.usr_comment_board;
import com.akisan.akiblog.pojo.deleteBlogByBlogIdInfo;
import com.akisan.akiblog.pojo.deleteBoardInfo;
import com.akisan.akiblog.pojo.insertBoardInfo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface usr_comment_boardMapper {
    List<usr_comment_board> findAllBoard();

    void insertBoard(@Param("insertBoardInfo")insertBoardInfo insertBoardInfo);

    void deleteBoard(@Param("deleteBoardInfo") deleteBoardInfo deleteBoardInfo);
}
