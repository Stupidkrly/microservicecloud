package com.zbl.springcloud.service;

import com.zbl.springcloud.entities.Dept;
import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class DeptClientServiceFallbackFactory implements FallbackFactory<DeptClientService> {

    @Override
    public DeptClientService create(Throwable throwable) {
        return new DeptClientService() {
            @Override
            public Dept getDept(Integer deptNo) {
                Dept dept = new Dept();
                dept.setDeptNo(deptNo);
                dept.setDeptName("该ID:"+ deptNo + "没有对应的信息!");
                dept.setDbSource("没有对应的数据源");
                return  dept;
            }

            @Override
            public List<Dept> list() {
                return null;
            }

            @Override
            public Boolean addDept(Dept dept) {
                return null;
            }
        };
    }
}
