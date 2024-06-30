package com.example.cpuconsumingapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class CpuConsumingAppApplication {

    public static void main(String[] args) {
        SpringApplication.run(CpuConsumingAppApplication.class, args);
    }
}
