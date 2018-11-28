package com.hh.ishare;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication
@MapperScan("com.hh.ishare.mapper")
public class IshareApplication {

    public static void main(String[] args) {
        SpringApplication.run(IshareApplication.class, args);
    }
}
