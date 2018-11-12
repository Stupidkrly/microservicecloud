package com.zbl.springcloud.controller;

import com.zbl.springcloud.entities.Dept;
import com.zbl.springcloud.service.DeptClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.List;

/**
 * 消费端
 */
@RequestMapping("/consumer")
@RestController
public class DeptConsumerController {

//    private static final String REST_URL_PREFIX = "http://localhost:8001";
    //Ribbon和Eureka整合后，Consummer可以直接调用服务而不用关心地址和端口号
//    private static final String REST_URL_PREFIX = "http://MICROSERVICECLOUD-DEPT";

    //Feign 面向接口
    @Autowired
    private DeptClientService deptClientService;

//    @Autowired
//    private RestTemplate restTemplate;

    @GetMapping("/depts")
    public List<Dept> list(){
        //访问服务提供方
        return deptClientService.list();
    }

    @GetMapping("/dept/{deptNo}")
    public Dept getDept(@PathVariable("deptNo") Integer deptNo){
        return deptClientService.getDept(deptNo);
    }

    @PostMapping("/dept")
    public Boolean saveDept(Dept dept){
        return deptClientService.addDept(dept);
    }
}
