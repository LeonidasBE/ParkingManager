package com.cloudpark.ParkingManager;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
public class ParkingManagerApplication {

	public static void main(String[] args) {
		SpringApplication.run(ParkingManagerApplication.class, args);
	}

}
