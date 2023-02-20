package com.akisan.akiblog.service.Impl;

import com.akisan.akiblog.entity.usr_comment_board;
import com.akisan.akiblog.pojo.deleteBoardInfo;
import com.akisan.akiblog.pojo.dividePageInfo;
import com.akisan.akiblog.pojo.insertBoardInfo;
import com.akisan.akiblog.service.usrBoardService;
import com.akisan.akiblog.mapper.usr_comment_boardMapper;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class usrBoardServiceImpl implements usrBoardService {
    @Autowired
    usr_comment_boardMapper usr_comment_boardMapper;
    @Override
    public PageInfo<usr_comment_board> findAllBoard(dividePageInfo dividePageInfo) {
        PageHelper.startPage(dividePageInfo.getPageNum(),dividePageInfo.getPageSize());
        List<usr_comment_board> boards = usr_comment_boardMapper.findAllBoard();
        PageInfo<usr_comment_board> pageInfo = new PageInfo<>(boards);
        return pageInfo;
    }

    @Override
    public void insertBoard(insertBoardInfo insertBoardInfo) {
        usr_comment_boardMapper.insertBoard(insertBoardInfo);
    }

    @Override
    public void deleteBoard(deleteBoardInfo deleteBoardInfo) {
        usr_comment_boardMapper.deleteBoard(deleteBoardInfo);
    }

}
