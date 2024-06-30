package com.example.cpuconsumingapp.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

@Service
public class CpuIntensiveService {

    private static final Logger logger = LoggerFactory.getLogger(CpuIntensiveService.class);

    @Scheduled(fixedRate = 10000)
    public void consumeCpu() {
        logger.info("Starting CPU-intensive task");
        long startTime = System.currentTimeMillis();
        while (System.currentTimeMillis() - startTime < 500) { // Consume CPU for 2 seconds out of 10
            // Busy-wait loop to consume CPU
        }
        logger.info("Completed CPU-intensive task");
    }
}
