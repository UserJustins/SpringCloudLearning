package com.duheng.entity;

import lombok.Data;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author DuHeng
 * @since 2020-02-20
 */
@Data

@Accessors(chain = true)

public class Dept implements Serializable {

    private static final long serialVersionUID = 1L;


    private Integer deptno;


    private String deptName;



    private String databaseName;


}
