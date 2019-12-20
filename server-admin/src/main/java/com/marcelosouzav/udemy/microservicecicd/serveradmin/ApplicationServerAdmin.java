package com.marcelosouzav.udemy.microservicecicd.serveradmin;

import de.codecentric.boot.admin.server.config.EnableAdminServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableAdminServer
public class ApplicationServerAdmin {
    public static void main(String[] args) {
        SpringApplication.run(ApplicationServerAdmin.class, args);
    }
}
