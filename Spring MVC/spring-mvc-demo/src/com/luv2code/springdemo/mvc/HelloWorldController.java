package com.luv2code.springdemo.mvc;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloWorldController {
	
	@RequestMapping("showForm")
	public String showForm() {
		return "show-form";
	}
	
	@RequestMapping("processForm")
	public String processForm() {
		return "process-form";
	}
	
	@RequestMapping("/processFormVersion2")
	public String letsShout(HttpServletRequest request, Model model) {
		model.addAttribute("message", request.getParameter("query").toUpperCase());
		
		return "process-form";
	}
}
