package com.uppi.poc.resource;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.uppi.poc.domain.Student;

@RestController
public class StudentResource {
	
	@RequestMapping(value="/students",method=RequestMethod.GET)
	public List<Student> students(){
		return Arrays.asList(new Student("Upender","Spark"),new Student("Bala","Spring Cloud"));
	}

	
}
