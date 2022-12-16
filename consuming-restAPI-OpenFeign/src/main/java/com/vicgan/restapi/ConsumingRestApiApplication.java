package com.vicgan.restapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients(basePackageClasses = ApiConsumerClient.class)
public class ConsumingRestApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConsumingRestApiApplication.class, args);
	}

}
