package com.example.seckil;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.example.seckil.pojo")
public class SeckilApplication {

    public static void main(String[] args) {
        SpringApplication.run(SeckilApplication.class, args);
    }

}
