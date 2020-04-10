package com.js.controller;

import com.js.model.User;
import com.js.service.UserService;
import com.js.util.UuidUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Random;
import java.util.UUID;


@Controller
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserService usersService;

    /**
     * 页面跳转
     */
    @RequestMapping("/{page}")
    public String showPage(@PathVariable String page){
        return page;
    }

    /**
     * 添加用户
     */
    @RequestMapping("/addUser")
    public String addUser(User users){
        users.setId(UuidUtil.getUUID());
        this.usersService.addUser(users);
        return "ok";
    }
}
