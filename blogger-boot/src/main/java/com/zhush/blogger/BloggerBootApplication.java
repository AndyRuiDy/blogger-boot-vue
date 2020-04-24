package com.zhush.blogger;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan({"com.zhush.blogger.system.mapper"})
@SpringBootApplication
public class BloggerBootApplication {

    public static void main(String[] args) {
        SpringApplication.run(BloggerBootApplication.class, args);
    }

}
