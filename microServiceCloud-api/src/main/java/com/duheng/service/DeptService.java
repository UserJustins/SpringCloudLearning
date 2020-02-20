package com.duheng.service;

import com.duheng.entity.Dept;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author DuHeng
 * @since 2020-02-20
 */
public interface DeptService {

    List<Dept> getDepts();

    Dept getDept(Integer id);
}
