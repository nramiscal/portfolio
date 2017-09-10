package com.nramiscal.portfolio.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	@RequestMapping("/")
	public String index() {
		return "index.html";
	}
	
	@RequestMapping("/my_projects")
	public String projects() {
		return "projects.html";
	}
	
	@RequestMapping("/about_me")
	public String about() {
		return "me.html";
	}
	
	@RequestMapping("/my_projectOne")
	public String projectOne() {
		return "projectOne.html";
	}
	
	@RequestMapping("/my_projectTwo")
	public String projectTwo() {
		return "projectTwo.html";
	}
}
