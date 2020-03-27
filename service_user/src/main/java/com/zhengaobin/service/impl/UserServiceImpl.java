package com.zhengaobin.service.impl;

import com.zhengaobin.pojo.User;
import com.zhengaobin.service.UserService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Override
    public User getUserById(Integer id) {
        User user = new User();
        user.setId(1);
        user.setUsername("郑奥斌");
        user.setPassword("88888");
        return user;
    }
}
