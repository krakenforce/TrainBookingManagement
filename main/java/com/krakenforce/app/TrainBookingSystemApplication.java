package com.krakenforce.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.krakenforce.app"})
public class TrainBookingSystemApplication {

	public static void main(String[] args) {
		SpringApplication.run(TrainBookingSystemApplication.class, args);
	}

}
