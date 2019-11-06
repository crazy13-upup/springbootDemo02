package com.offcn.controller;

import com.offcn.dao.UserDao;
import com.offcn.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserDao userDao;

    //添加
    @RequestMapping("/saveInfo")
    public String saveInfo(){
        User user = new User();
        user.setAge(18);
        user.setUsername("小明");
        userDao.save(user);
        return "success";
    }

    //查询
    @GetMapping("/getUsersById")
    public User getUserById(){
        User user = userDao.getOne(1);
        return user;
    }
}
