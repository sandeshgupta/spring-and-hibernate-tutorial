package com.luv2code.springdemo.mvc.validaion;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class CourseCodeConstraintValidator implements ConstraintValidator<CourseCode, String>{

	private String coursePrefixallowed;
	
	@Override
	public void initialize(CourseCode courseCode) {
		coursePrefixallowed = courseCode.value();
	}
	
	@Override
	public boolean isValid(String theCode, ConstraintValidatorContext theConstraintValidatorContext) {
		
		return theCode.startsWith(coursePrefixallowed);
	}

}
