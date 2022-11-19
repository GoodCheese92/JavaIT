package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MyController {
	
	@GetMapping("/my")		// /my로 들어가면
	public String home() {
		return "index";		// 해당 html 파일을 열어줌
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