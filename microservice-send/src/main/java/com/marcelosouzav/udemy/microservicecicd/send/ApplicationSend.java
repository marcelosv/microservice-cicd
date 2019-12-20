package com.marcelosouzav.udemy.microservicecicd.send;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
@EnableHystrix
public class ApplicationSend {
    public static void main(String[] args) {
        SpringApplication.run(ApplicationSend.class, args);
    }
}
