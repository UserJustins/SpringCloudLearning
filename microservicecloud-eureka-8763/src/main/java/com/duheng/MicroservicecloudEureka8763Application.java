package com.duheng;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class MicroservicecloudEureka8763Application {

    public static void main(String[] args) {
        SpringApplication.run(MicroservicecloudEureka8763Application.class, args);
    }

}
