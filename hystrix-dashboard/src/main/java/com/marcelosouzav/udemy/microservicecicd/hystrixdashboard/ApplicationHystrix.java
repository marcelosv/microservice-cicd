package com.marcelosouzav.udemy.microservicecicd.hystrixdashboard;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

@SpringBootApplication
@EnableHystrixDashboard
public class ApplicationHystrix {
    public static void main(String[] args) {
        SpringApplication.run(ApplicationHystrix.class, args);
    }
}
