package com.duheng.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/*************************
 Author: 杜衡
 Date: 2020/2/20
 Describe:
       RestTemplate是Spring提供的用于访问Rest服务的客户端，
 RestTemplate提供了多种便捷访问远程Http服务的方法,能够大大提高客户端的编写效率
 *************************/
@Configuration
public class RestTemplateConfig {
    @Bean
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }
}
