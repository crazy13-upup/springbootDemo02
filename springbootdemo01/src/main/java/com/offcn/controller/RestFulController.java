package com.offcn.controller;

import com.offcn.dao.UserDao;
import com.offcn.entity.User;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/rest")
@RestController
public class RestFulController {

    @Autowired
    private UserDao userDao;

    @GetMapping("/getUserById")
    @ApiOperation(value="查找指定id用户信息", notes="根据id查找用户信息")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "id", value = "用户ID", required = true, dataType = "Integer"),
    })
    public User getUserById(Integer id){
        User user = userDao.getOne(id);
        return user;
    }

    @DeleteMapping("/del")
    @ApiOperation(value="删除指定id用户信息", notes="根据id删除用户信息")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "id", value = "用户ID", required = true, dataType = "Integer"),
    })
    public String delUserById(Integer id){
        userDao.deleteById(id);
        return "success";
    }
}
