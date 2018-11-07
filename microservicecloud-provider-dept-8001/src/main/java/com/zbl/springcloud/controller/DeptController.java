package com.zbl.springcloud.controller;
import com.zbl.springcloud.entities.Dept;
import com.zbl.springcloud.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class DeptController {

    @Autowired
    private DeptService deptService;

    @GetMapping("/depts")
    public List<Dept> list(){
        List<Dept> deptList = deptService.findAll();
        return deptList;
    }

    @GetMapping("/dept/{deptNo}")
    public Dept getDept(@PathVariable("deptNo") Integer deptNo){
        Dept dept = deptService.findOne(deptNo);
        return dept;
    }

    @PostMapping("/dept")
    public void saveDept(@RequestBody Dept dept){
        deptService.save(dept);
    }
}
