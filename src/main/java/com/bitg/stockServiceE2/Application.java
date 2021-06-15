package com.bitg.stockServiceE2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@EnableConfigurationProperties
@EnableAutoConfiguration
@SpringBootApplication
public class Application {

    public static void main (String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
