package com.jxwy.springbootmybatisplusdemo.service;

import com.jxwy.springbootmybatisplusdemo.mapper.UserMapper;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.sql.Date;
import java.util.List;

@SpringBootTest
@RunWith(SpringRunner.class)
class UserServiceTest {

    @Autowired
    private UserMapper userMapper;

    @Test
    void test() {
        System.out.println(userMapper.findAll());
    }
}