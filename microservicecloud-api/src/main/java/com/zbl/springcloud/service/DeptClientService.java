package com.zbl.springcloud.service;

import com.zbl.springcloud.entities.Dept;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import java.util.List;

@FeignClient(value = "MICROSERVICECLOUD-DEPT",fallbackFactory = DeptClientServiceFallbackFactory.class)
public interface DeptClientService {

    @GetMapping("/dept/{deptNo}")
    public Dept getDept(@PathVariable("deptNo") Integer deptNo);

    @GetMapping("/depts")
    public List<Dept> list();

    @PostMapping("/dept")
    public Boolean addDept(Dept dept);
}
