package com.jxwy.springbootmybatisplusdemo.entity;

import com.baomidou.mybatisplus.annotation.*;
import com.baomidou.mybatisplus.extension.handlers.JacksonTypeHandler;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import org.apache.ibatis.type.JdbcType;
import org.springframework.format.annotation.DateTimeFormat;

import java.math.BigInteger;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;

@Data
@TableName(value = "user",schema = "mybatis_plus")
public class User {
    @TableId(value = "id",type = IdType.ASSIGN_ID)
    private Long id;
    private String name;
}
