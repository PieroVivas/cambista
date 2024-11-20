package com.cambista;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class CambistaApplication {

	public static void main(String[] args) {
		SpringApplication.run(CambistaApplication.class, args);


	}

}
