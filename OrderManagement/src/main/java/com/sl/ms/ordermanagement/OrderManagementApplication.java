package com.sl.ms.ordermanagement;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication
//@EnableCircuitBreaker
public class OrderManagementApplication {
	private final static  Logger logger = LoggerFactory.getLogger(OrderManagementApplication.class);
	public static void main(String[] args) {
		logger.info("starting OrderManagementApplication");
		SpringApplication.run(OrderManagementApplication.class, args);
	}

}
