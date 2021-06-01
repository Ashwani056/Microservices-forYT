package com.eureka.discovery;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class DiscoveryMsApplication {

	public static void main(String[] args) {
		SpringApplication.run(DiscoveryMsApplication.class, args);
	}

}
