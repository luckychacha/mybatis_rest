package com.luckychacha.mybatis_rest;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.luckychacha.mybatis_rest.dao")
public class MybatisRestApplication {

    public static void main(String[] args) {
        SpringApplication.run(MybatisRestApplication.class, args);
    }
}
