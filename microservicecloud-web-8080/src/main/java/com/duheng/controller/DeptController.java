package com.duheng.controller;

import com.duheng.entity.Dept;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

/*************************
 Author: 杜衡
 Date: 2020/2/20
 Describe:
 *************************/
@RestController
public class DeptController {

    public static final String URI_PREFIX = "http://localhost:8001/";

    @Autowired
    private RestTemplate restTemplate;
    @GetMapping("/gets")
    public List<Dept> getAll(){
        return restTemplate.getForObject(URI_PREFIX+"service/gets", List.class);
    }
}
