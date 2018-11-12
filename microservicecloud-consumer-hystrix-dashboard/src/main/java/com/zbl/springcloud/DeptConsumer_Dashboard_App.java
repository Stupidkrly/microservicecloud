package com.zbl.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

@EnableHystrixDashboard //开启服务监控支持
@SpringBootApplication
public class DeptConsumer_Dashboard_App {

    public static void main(String[] args) {
        SpringApplication.run(DeptConsumer_Dashboard_App.class,args);
    }
}
