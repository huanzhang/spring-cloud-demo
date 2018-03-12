package org.hzhang.schoolservice;

import org.hzhang.schoolservice.contorller.SchoolServiceController;
import org.hzhang.studentserviceapi.service.StudentServiceFeignClient;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableEurekaClient
@EnableDiscoveryClient
@EnableFeignClients(basePackages = "org.hzhang.studentserviceapi")
@ComponentScan(basePackageClasses = {StudentServiceFeignClient.class, SchoolServiceController.class})
public class SchoolServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(SchoolServiceApplication.class, args);
	}
}
