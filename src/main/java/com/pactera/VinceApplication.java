package com.pactera;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.pactera.dao")
@SpringBootApplication
public class VinceApplication {

    public static void main(String[] args) {
        SpringApplication.run(VinceApplication.class, args);
    }
}
