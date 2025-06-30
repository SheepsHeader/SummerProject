package com.youngheart;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.youngheart.mapper")
@SpringBootApplication
public class YoungSApplication {

    public static void main(String[] args) {
        SpringApplication.run(YoungSApplication.class, args);
    }

}
