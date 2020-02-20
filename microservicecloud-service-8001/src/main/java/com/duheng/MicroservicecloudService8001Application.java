package com.duheng;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.duheng.mapper")//扫描Mapper接口
public class MicroservicecloudService8001Application {

    public static void main(String[] args) {
        SpringApplication.run(MicroservicecloudService8001Application.class, args);
    }

}
