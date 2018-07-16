package com.uppi.poc.domain;

public class Student {
	private String name;
	private String course;
	public Student() {
		
	}
	public Student(String n,String c) {
		this.name=n;
		this.course=c;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	
}
