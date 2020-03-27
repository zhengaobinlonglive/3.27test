package com.zhengaobin.controller;

import com.zhengaobin.pojo.User;
import com.zhengaobin.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user/")
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping("getUserNameById")
    public String getUserNameById(@RequestParam("id") Integer id){
//       User user = userService.getUserById(1);
        return "马雨";
    }
}
