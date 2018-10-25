package com.wangchen.example.springboot;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.wangchen.example.springboot")
//@MapperScan("com.wangchen.example.springboot.dao.mapper")
// 接口扫描，如果此处不加@MapperScan注解必须在接口类上添加@Mapper注解表明这是一个接口扫描器
public class SpringbootApplication {
    public static void main(String[] args) {
        SpringApplication.run(SpringbootApplication.class, args);
    }
}
