package com.duheng.service.impl;

import com.duheng.entity.Dept;
import com.duheng.mapper.DeptMapper;
import com.duheng.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author DuHeng
 * @since 2020-02-20
 */
@Service
public class DeptServiceImpl implements DeptService {

    @Autowired
    private DeptMapper deptMapper;

    @Override
    public List<Dept> getDepts() {
        return deptMapper.selAll();
    }

    @Override
    public Dept getDept(Integer id) {
        return deptMapper.selById(id);
    }
}
