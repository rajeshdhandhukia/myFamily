package com.familytree.myfamily.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

@Service
public class MyFamilyServiceImpl implements MyFamilyService {

	public String getHome(Model model, String messages, List<String> roles) {

		model.addAttribute("message", messages);
		model.addAttribute("roles", roles);

		return "welcome";
	}
}
