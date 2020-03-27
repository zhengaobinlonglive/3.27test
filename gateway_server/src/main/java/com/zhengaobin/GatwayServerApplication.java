package com.zhengaobin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class GatwayServerApplication {
    public static void main(String[] args) {
        SpringApplication.run(GatwayServerApplication.class, args);
    }

}
