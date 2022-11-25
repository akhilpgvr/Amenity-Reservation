package com.amenitiesreservation.experiencems;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class ExperienceMsApplication {

	public static void main(String[] args) {
		SpringApplication.run(ExperienceMsApplication.class, args);
	}

}
