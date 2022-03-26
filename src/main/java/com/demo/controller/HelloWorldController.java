package com.demo.controller;


import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloWorldController {

	//controller to show the initial HTML form
	@RequestMapping("/showForm")
	public String showForm() {
		return "helloworld-form";
	}
	
	//controller to process the HTML form
	@RequestMapping("/processForm")
	public String processForm() {
		return "helloworld";
	}
	
	//controller to read the data and add data to model
	@RequestMapping("/processFormVersionTwo")
	public String letsShoutDude(HttpServletRequest request, Model model) {
		//read from request parameter from HTML form
		String theName = request.getParameter("studentName");
		
		theName = theName.toUpperCase();
		
		//create the message
		String result = "Yo "+ theName;
		//add message to message
		model.addAttribute("message", result);
		return "helloworld";
	}
	//retriving data from form using request prama
	@RequestMapping("/processFormVersionThree")
	public String letsShoutDude(@RequestParam("studentName") String theName, Model model) {
				
		theName = theName.toUpperCase();
		
		//create the message
		String result = "Hey "+ theName;
		//add message to message
		model.addAttribute("message", result);
		return "helloworld";
	}
}
