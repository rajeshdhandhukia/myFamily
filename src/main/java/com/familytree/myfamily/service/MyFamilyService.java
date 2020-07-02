package com.familytree.myfamily.service;

import java.util.List;

import org.springframework.ui.Model;

public interface MyFamilyService {

	public String getHome(Model model, String messages, List<String> roles);
}
