package com.ps.infra;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@EnableEurekaClient
@EnableCircuitBreaker
@SpringBootApplication(scanBasePackages = {
        "com.ps.app",
        "com.ps.domain",
        "com.ps.infra"
})
public class SeleccionApplication {

    public static void main(String[] args) {
        SpringApplication.run(SeleccionApplication.class, args);
    }

}
