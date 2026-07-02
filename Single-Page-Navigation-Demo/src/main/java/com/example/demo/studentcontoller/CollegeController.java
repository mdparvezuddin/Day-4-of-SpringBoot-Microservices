package com.example.demo.studentcontoller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CollegeController {
	@GetMapping("/college")
	
	public String about(Model model) {
		model.addAttribute("title", "model");
		model.addAttribute("message", "Student's College Name is LPU");
		return "StudentDetails";
	}

}
