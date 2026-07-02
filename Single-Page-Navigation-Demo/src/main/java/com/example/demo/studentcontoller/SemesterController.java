package com.example.demo.studentcontoller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SemesterController {
	@GetMapping("/semester")
	
	public String about(Model model) {
		model.addAttribute("title", "model");
		model.addAttribute("message", "Student is in 6th Semester");
		return "StudentDetails";
	}

}
