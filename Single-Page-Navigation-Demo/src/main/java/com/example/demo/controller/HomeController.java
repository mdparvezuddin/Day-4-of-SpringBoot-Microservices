package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller

public class HomeController {
	@GetMapping("/")
	public String home(org.springframework.ui.Model model) {
	model.addAttribute("title", "Home");
	model.addAttribute("message", "Welcome to the school Portal Home Page");
	return "dashboard";
	}
}
