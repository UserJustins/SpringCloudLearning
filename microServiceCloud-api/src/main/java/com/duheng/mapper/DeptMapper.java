package com.duheng.mapper;

import com.duheng.entity.Dept;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author DuHeng
 * @since 2020-02-20
 */

public interface DeptMapper {
    List<Dept> selAll();

    Dept selById(Integer id);
}
