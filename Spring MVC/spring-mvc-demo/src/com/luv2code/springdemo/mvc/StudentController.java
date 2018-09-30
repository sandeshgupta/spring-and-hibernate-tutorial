package com.luv2code.springdemo.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class StudentController {
	
	@RequestMapping("/show-student-form")
	public String showForm(Model theModel) {
		theModel.addAttribute("student", new Student());
		
		return "show-student-form";
	}
	
	@RequestMapping("/process-student-form")
	public String processForm(@ModelAttribute Student theStudent) {		
		return "confirmation-student";
	}
}
