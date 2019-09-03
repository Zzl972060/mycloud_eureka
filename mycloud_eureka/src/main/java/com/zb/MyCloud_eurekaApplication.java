package com.zb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
//朱振龙
public class MyCloud_eurekaApplication {
    public static void main(String[] args) {
        SpringApplication.run(MyCloud_eurekaApplication.class,args);
    }
}
