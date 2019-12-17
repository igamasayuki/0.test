package com.example;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/exam01")
public class Exam01Controller {

	@RequestMapping("")
	public String init() {
		System.out.println("Windowsで修正");
		return "exam01";
	}
	

	@RequestMapping("/input")
	public String input(String name, Model model) {
		System.out.println("Windowsで修正");
		model.addAttribute("name", name);
		return "exam01-result";
	}
	
}
