package com.softarchi.sensormonitor;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
@EnableMongoRepositories("com.softarchi.sensormonitor.Repository")
public class SensormonitorApplication {

    public static void main(String[] args) {

        SpringApplication.run(SensormonitorApplication.class, args);
    }

}
