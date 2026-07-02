package com.example.demo.studentcontoller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class NameController {
	@GetMapping("/name")
	
	public String about(Model model) {
		model.addAttribute("title", "model");
		model.addAttribute("message", "Student Name is Parvez");
		return "StudentDetails";
	}

}
