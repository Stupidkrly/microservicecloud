package com.zbl.springcloud.dao;

import com.zbl.springcloud.entities.Dept;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Mapper
public interface DeptDao {

    void save(Dept dept);

    Dept findOne(Integer deptNo);

    List<Dept> findAll();
}
