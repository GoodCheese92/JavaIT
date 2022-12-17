package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserController {

	@GetMapping("/")		// /로 이동하면
	public String listUser(Model model) {
		
		return "main";		// main.jsp 열기
	}
	
}
