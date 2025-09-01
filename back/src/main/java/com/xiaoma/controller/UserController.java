package com.xiaoma.controller;

import com.xiaoma.pojo.Result;
import com.xiaoma.pojo.User;
import com.xiaoma.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Slf4j
@RestController
@RequestMapping("/api")
public class UserController {
    @Autowired
    private UserService userService;

    public Result<> addUser(){

    }

    // 查询所有用户
    @GetMapping("/user")
    public Result<List<User>> getUser(){
        List<User> users = userService.getUser();
        log.info("查询到用户:{}",users);
        return Result.success(users);
    }
}
