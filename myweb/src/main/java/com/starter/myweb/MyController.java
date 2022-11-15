package com.starter.myweb;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MyController {
	// @Controller : html과 연결
	
	@GetMapping("/")
	public String home() {		
		// localhost : 8080/로 이동하면
		return "index.html";		// index.html 열기
	}
}
