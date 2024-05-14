package com.piseth.school;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.cloud.openfeign.EnableFeignClients;

@RefreshScope
@SpringBootApplication
@EnableFeignClients
public class OnlineSchoolApplication {

	public static void main(String[] args) {
		SpringApplication.run(OnlineSchoolApplication.class, args);
	}

}
