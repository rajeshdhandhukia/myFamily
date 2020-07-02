package com.familytree.myfamily.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyMainFamilyController {

	@GetMapping("/helloworld")
	public String hello() {
		return "Hello World!";
	}
}