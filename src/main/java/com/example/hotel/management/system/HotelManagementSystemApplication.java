package com.example.hotel.management.system;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.example.hotel.management.system")
public class HotelManagementSystemApplication{
	public static void main(String[] args) {
		SpringApplication.run(HotelManagementSystemApplication.class, args);
	}

}
