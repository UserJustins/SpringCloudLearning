package com.duheng.service.controller;

import com.duheng.entity.Dept;
import com.duheng.mapper.DeptMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/*************************
 Author: 杜衡
 Date: 2020/2/20
 Describe:
 *************************/
@RestController
public class DeptController {
    @Autowired
    private DeptMapper deptMapper;

    @GetMapping("/service/gets")
    public List<Dept> getDepts(){
        return deptMapper.selAll();
    }

}
