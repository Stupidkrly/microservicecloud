package com.zbl.springcloud.controller;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
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
    //服务熔断
    //一旦调用服务失败并抛出错误信息时，会自动调用 @HystrixCommand 标注好的 fallbackMethod 方法
    //缺点：每个方法都需设定一个 fallbackMethod 会导致方法膨胀，还有和业务的耦合
    //改进：在客户端业务接口中使用 fallbackFactory 来实现统一管理和解耦
    @HystrixCommand(fallbackMethod = "processHystrixGet")
    @GetMapping("/dept/{deptNo}")
    public Dept getDept(@PathVariable("deptNo") Integer deptNo) {
//        int i = 10 / 0;
        Dept dept = deptService.findOne(deptNo);
        if (dept == null) {
            int i = 10 / 0;
        }
        return dept;
    }

    @PostMapping("/dept")
    public void saveDept(@RequestBody Dept dept){
        deptService.save(dept);
    }

    private Dept processHystrixGet(@PathVariable("deptNo") Integer deptNo){
        Dept dept = new Dept();
        dept.setDeptNo(deptNo);
        dept.setDeptName("该ID:"+ deptNo + "没有对应的信息!");
        dept.setDbSource("没有对应的数据源");
        return  dept;
    }
}
