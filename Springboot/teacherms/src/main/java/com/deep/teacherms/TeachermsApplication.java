package com.deep.teacherms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class TeachermsApplication {

	public static void main(String[] args) {
		SpringApplication.run(TeachermsApplication.class, args);
	}

}
