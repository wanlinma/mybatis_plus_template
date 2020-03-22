package com.jxwy.springbootmybatisplusdemo.controller;

import com.jxwy.springbootmybatisplusdemo.entity.User;
import com.jxwy.springbootmybatisplusdemo.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Controller
@RestController
public class UserController {
    @Autowired
    private UserMapper userMapper;
    @GetMapping("findAll")
    public List findAll(){
        return userMapper.findAll();
    }
      @GetMapping("findOne")
    public User findOne(Integer id){
        return userMapper.findOne(id);
    }


}
