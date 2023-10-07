package com.example.fetureflagsdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties(MessageProperties.class)
public class FetureflagsdemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(FetureflagsdemoApplication.class, args);
    }

}
