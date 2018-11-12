package com.zbl.springcloud.service.impl;

import com.zbl.springcloud.dao.DeptDao;
import com.zbl.springcloud.entities.Dept;
import com.zbl.springcloud.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class DeptServiceImpl implements DeptService {

    @Autowired
    private DeptDao deptDao;

    @Override
    @Transactional(readOnly = true)
    public Dept findOne(Integer deptNo) {
        return deptDao.findOne(deptNo);
    }

    @Override
    public List<Dept> findAll() {
        return deptDao.findAll();
    }

    @Override
    @Transactional
    public void save(Dept dept) {
        deptDao.save(dept);
    }
}
