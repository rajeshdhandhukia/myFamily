package com.familytree.myfamily.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.familytree.myfamily.service.MyFamilyService;

@Controller
public class MyMainFamilyController {

	@Autowired
	MyFamilyService myFamilyService;
	
	@Value("${welcome.message}")
	private String message;

	private List<String> roles = Arrays.asList("Grand Father", "Grand Mother", "Father", "Mother", "Brother", "Sister", "Uncle");

	@GetMapping("/")
	public String main(Model model) {
		return myFamilyService.getHome(model, message, roles);
		
	}

	@GetMapping("/hello")
	public String mainWithParam(@RequestParam(name = "name", required = false, defaultValue = "") String name,
			Model model) {

		model.addAttribute("message", name);

		return "welcome";
	}

}