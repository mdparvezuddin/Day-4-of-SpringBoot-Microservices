package com.example.demo.studentcontoller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class StudentsController {
	@GetMapping("/students")
	public String students(Model model) {

        model.addAttribute("title", "Students");
        model.addAttribute("message", "Students Information");

        return "dashboard";
	}
}



//