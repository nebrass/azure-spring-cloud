package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cache.annotation.EnableCaching;

@EnableCaching
@EnableDiscoveryClient
@SpringBootApplication
public class AzureEventingApplication {

    public static void main(String[] args) {
        SpringApplication.run(AzureEventingApplication.class, args);
    }
}
