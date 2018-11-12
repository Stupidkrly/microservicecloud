package com.zbl.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class EurekaServer7001_Config_App {

    public static void main(String[] args) {
        SpringApplication.run(EurekaServer7001_Config_App.class,args);
    }
}
