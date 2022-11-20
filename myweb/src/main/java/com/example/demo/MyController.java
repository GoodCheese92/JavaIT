package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class MyController {
	
	@GetMapping("/")		// /my로 적으면 주소 뒤에 /my 입력들어가면
	public String home() {
		return "index";		// 해당 html 파일을 열어줌
	}

	@GetMapping("/keyboard")
	public String keyboardPage() {
		return "keyboard";		// keybodard.html 열기
	}
	
	// [HTML <-> JAVA] 1. jsp 2. thymeleaf
	@GetMapping("/result")
	public String resultPage(Model model, @RequestParam("id") String name) {
		if (name.equalsIgnoreCase("1234")) {
			model.addAttribute("re", "로그인"); // re = "로그인"
		} else {
			model.addAttribute("re", "아이디없음");		// re = "아이디 없음"
		}
//		model.addAttribute("re", name);		// re = name;
		return "result";		// result.html 열기
	}


}

// new -> Spring Starter Project -> (maven project, java version 11) -> 
// (Spring boot Devtool, Spring web, Thymeleaf)
// 1. src/main/java -> com.example.demo -> 클래스 생성(입력 : @Controller, @GetMapping 및 home 메서드 생성)
// 2. MywebApplication 클래스에서 제대로 실행되는지 확인하기 위해 syso 입력
// 3. src/main/resources의 application.properties에 server.port = 7942를 이용하여 포트 설정
// 4. src/main/resources의 templates 폴더에 html 파일 생성
// 5. myweb폴더 우클릭후 run as로 spring boot 로 실행
// 6. http://localhost:7942/my 인터넷 페이지로 확인