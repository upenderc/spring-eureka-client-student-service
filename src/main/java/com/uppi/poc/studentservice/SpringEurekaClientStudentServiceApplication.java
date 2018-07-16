package com.uppi.poc.studentservice;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.uppi.poc.resource.StudentResource;

@SpringBootApplication
@ComponentScan(basePackageClasses = StudentResource.class)
@RestController
@EnableEurekaClient
public class SpringEurekaClientStudentServiceApplication {
	@Value("${student.header}")
	private String value;
	@Value("${db.password}")
	private String pwd;
	public static void main(String[] args) {
		SpringApplication.run(SpringEurekaClientStudentServiceApplication.class, args);
	}
	@RequestMapping(value="/sampleInfo",method=RequestMethod.GET)
	public String info() {
		return "values are coming from config server -"+value+" pwd -"+pwd;
	}
}
