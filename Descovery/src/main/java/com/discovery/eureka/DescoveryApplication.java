package com.discovery.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.web.bind.annotation.RestController;

@EnableEurekaServer
@SpringBootApplication
@RestController
public class DescoveryApplication {

	public static void main(String[] args) {
		SpringApplication.run(DescoveryApplication.class, args);
	}
	
	

}
