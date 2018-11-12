package com.zbl.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class DeptProvider8001_Config_App {
    public static void main(String[] args) {
        SpringApplication.run(DeptProvider8001_Config_App.class,args);
    }
}
