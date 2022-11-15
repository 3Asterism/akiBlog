package com.akisan.akiblog;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;


@SpringBootApplication
@EnableFeignClients
@EnableGlobalMethodSecurity(securedEnabled = true,prePostEnabled = true)
public class AkiBlogApplication {
    public static void main(String[] args) {
        SpringApplication.run(AkiBlogApplication.class, args);
    }
}