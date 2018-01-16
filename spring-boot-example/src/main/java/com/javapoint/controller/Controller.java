package com.javapoint.controller;

import java.util.Map;

import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.javapoint.model.User;

/**
 * 
 * @author matteodaniele
 * @update 1/07/2018
 * @version 0.4.3
 */
//@RestController//Spring MVC annotation. No specific to Spring Boot. 
//This stereotype annot. adds @Controller and @ResponseBody to the class.
//It informs to the Spring to render the result back to the caller.
@RestController
public class Controller {
	
	@RequestMapping("/hello")//Spring MVC annotation. No specific to Spring Boot
	                         //It's used to provide routing information. 
	//It tells Spring that any HTTP request '/hello' should map to the corresponding method hello().
	// A GET request by 'localhost:8080/hello' url will map to the hello() method.
	public String hello(){
		return "Hello!"; 
	}
	
	@RequestMapping({"/", "/index"})
	public ModelAndView index(){
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("index");
		return modelAndView;
	}
	
	@PostMapping("/save")
	public ModelAndView save(@ModelAttribute User user){
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("user-data");
		modelAndView.addObject("user", user);
		return modelAndView;
	}
}
