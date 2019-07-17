package com.itheima.controller;

import com.itheima.constant.MessageConstant;
import com.itheima.entity.Result;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {

    @GetMapping("getUsername")
    public Result getUsername(){
        // security的上下文，security的所有信息
        User user = (User)SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        System.out.println("username=" + user.getUsername());
        return new Result(true, MessageConstant.GET_USERNAME_SUCCESS, user.getUsername());
    }
}
