package com.duheng;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class MicroservicecloudService8002Application {

    public static void main(String[] args) {
        SpringApplication.run(MicroservicecloudService8002Application.class, args);
    }

}
