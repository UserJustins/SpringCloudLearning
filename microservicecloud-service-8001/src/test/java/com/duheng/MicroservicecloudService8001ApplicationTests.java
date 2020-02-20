package com.duheng;

import com.duheng.service.DeptService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class MicroservicecloudService8001ApplicationTests {
    @Autowired
    private DeptService deptService;
    @Test
    void contextLoads() {
        System.out.println(deptService.getDept(1));
    }

}
