package com.example.dq;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class DqApplication {

    public static void main(String[] args) {
        SpringApplication.run(DqApplication.class, args);
    }

}
