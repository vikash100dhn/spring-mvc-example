package com.demo.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.demo.model.Student;

@Controller
@RequestMapping("/student")
public class StudentController {

	//method to show form
	
	@RequestMapping("/showForm")
	public String showForm(Model model) {
		
		Student student = new Student();
		model.addAttribute("student", student);
		return "student-form";
	}
	
	@RequestMapping("/processForm")
	public String processForm(@ModelAttribute("student") Student theStudent) {
		System.out.println("theStudent"+theStudent.getFirstName() + " "+theStudent.getLastName());
		return "student-confirmation";
	}
}
