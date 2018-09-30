package com.luv2code.springdemo.mvc;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.luv2code.springdemo.mvc.validaion.CourseCode;

public class Customer {
	@NotNull(message="is required")
	@Size(min=1, message="is required")
	private String firstName;
	private String lastName;
	@CourseCode(value="LUV", message = "mandatory")
	private String courseCode;
	
	@Min(value=10, message="Minimum age is 10")
	@Max(value=100, message="Maximum age is 100")
	private int age;
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getCourseCode() {
		return courseCode;
	}
	public void setCourseCode(String courseCode) {
		this.courseCode = courseCode;
	}
}
