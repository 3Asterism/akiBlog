package com.akisan.akiblog.service;

import com.akisan.akiblog.entity.usr_comment_board;
import com.akisan.akiblog.pojo.deleteBoardInfo;
import com.akisan.akiblog.pojo.dividePageInfo;
import com.akisan.akiblog.pojo.insertBoardInfo;
import com.github.pagehelper.PageInfo;

public interface usrBoardService {
    PageInfo<usr_comment_board> findAllBoard(dividePageInfo dividePageInfo);

    void insertBoard(insertBoardInfo insertBoardInfo);

    void deleteBoard(deleteBoardInfo deleteBoardInfo);
}
