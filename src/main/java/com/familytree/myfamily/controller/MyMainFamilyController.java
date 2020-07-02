package com.familytree.myfamily.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MyMainFamilyController {

	@Value("${welcome.message}")
	private String message;

	private List<String> roles = Arrays.asList("Grand Father", "Grand Mother", "Father", "Mother", "Brother", "Sister", "Uncle");

	@GetMapping("/")
	public String main(Model model) {
		model.addAttribute("message", message);
		model.addAttribute("roles", roles);

		return "welcome";
	}

	@GetMapping("/hello")
	public String mainWithParam(@RequestParam(name = "name", required = false, defaultValue = "") String name,
			Model model) {

		model.addAttribute("message", name);

		return "welcome";
	}

}