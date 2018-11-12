package com.zbl.springcloud.service;


import com.zbl.springcloud.entities.Dept;

import java.util.List;

public interface DeptService {

    Dept findOne(Integer deptNo);

    List<Dept> findAll();

    void save(Dept dept);
}
