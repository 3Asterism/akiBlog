package com.akisan.akiblog;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;


@SpringBootApplication
@EnableFeignClients
public class AkiBlogApplication {
    public static void main(String[] args) {
        SpringApplication.run(AkiBlogApplication.class, args);
    }

}
