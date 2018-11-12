package com.zbl.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

@EnableFeignClients
@EnableEurekaClient
@SpringBootApplication
public class DeptConsumerFeign_App {

    public static void main(String[] args) {
        SpringApplication.run(DeptConsumerFeign_App.class,args);
    }
}
