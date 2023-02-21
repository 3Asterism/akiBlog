package com.akisan.akiblog.controller;

import com.akisan.akiblog.common.resultForRequestConstant;
import com.akisan.akiblog.entity.usr_comment_board;
import com.akisan.akiblog.pojo.deleteBoardInfo;
import com.akisan.akiblog.pojo.dividePageInfo;
import com.akisan.akiblog.pojo.insertBoardInfo;
import com.github.pagehelper.PageInfo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.annotation.Secured;
import org.springframework.web.bind.annotation.*;
import com.akisan.akiblog.service.Impl.usrBoardServiceImpl;

@RestController
@RequestMapping("/board")
@Api(tags = "留言板")
public class usrBoardController {
    @Autowired
    usrBoardServiceImpl usrBoardServiceImpl;

    @PostMapping("/findAllBoard")
    @ApiOperation(value = "查询所有留言板")
    public PageInfo<usr_comment_board> findAllBoard(@RequestBody dividePageInfo dividePageInfo) {
        return usrBoardServiceImpl.findAllBoard(dividePageInfo);
    }

    @Secured({"ROLE_CODER","ROLE_ADMIN","ROLE_USER","ROLE_NORMAL"})
    @PostMapping("/editBoard")
    @ApiOperation(value = "新增留言")
    public resultForRequestConstant editBlog(@RequestBody insertBoardInfo insertBoardInfo) {
        usrBoardServiceImpl.insertBoard(insertBoardInfo);
        return resultForRequestConstant.success();
    }

    @Secured({"ROLE_CODER","ROLE_ADMIN","ROLE_USER","ROLE_NORMAL"})
    @DeleteMapping("/deleteBoard")
    @ApiOperation(value = "通过boardid删除留言")
    public resultForRequestConstant deleteBoard(@RequestBody deleteBoardInfo deleteBoardInfo) {
        usrBoardServiceImpl.deleteBoard(deleteBoardInfo);
        return resultForRequestConstant.success();
    }
}
