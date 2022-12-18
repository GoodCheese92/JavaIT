package com.example.demo.controller;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.demo.entity.User;
import com.example.demo.service.UserService;

@Controller
public class UserController {

	private UserService userService;
	
	public UserController(UserService userService) {
		super();
		this.userService = userService;
	}



	@GetMapping("/")		// /로 이동하면
	public String listUser(Model model) {
		model.addAttribute("users", userService.getAllUser());
		return "main";		// main.jsp 열기
		// return findPaginated(1, model);
	}
	
	@GetMapping("/new")		// /new로 이동하면
	public String createUser(Model model) {
		User user = new User();
		model.addAttribute("user", user);
		return "create_user";		// create_user.jsp로 이동
	}
	
	@PostMapping("/")
	public String saveUser(@ModelAttribute User user) {
		userService.saveUser(user);
		return "redirect:/";		// /로 이동
	}
	
	@GetMapping("/{id}")
	public String deleteUser(@PathVariable Long id) {
		userService.deleteUserById(id);
		return "redirect:/";		// /로 돌아가기
	}
	
	@GetMapping("/edit/{id}")
	public String editUserFoam(@PathVariable Long id, Model model) {
		model.addAttribute("user", userService.getUserById(id));
		return "update_user";		// update_user.jsp로 이동
	}
	
	@PostMapping("/{id}")
	public String updateUser(@PathVariable Long id, Model model, @ModelAttribute("user") User user) {
		// 데이터베이스에서 정보 가져오기
		User existingUser = userService.getUserById(id);
		// 입력 받은 애로 덮어쓰기
		existingUser.setId(id);
		existingUser.setName(user.getName());
		existingUser.setGender(user.getGender());
		existingUser.setPhone(user.getPhone());
		existingUser.setEmail(user.getEmail());
		
		// 객체 업데이트
		userService.updateUser(existingUser);
		return "redirect:/";		
	}
	
	@GetMapping("/page/{pageNo}")
	public String findPaginated(@PathVariable (value="pageNo") int pageNo, Model model) {
		// 한 페이지에 보여줄 갯수
		int pageSize = 10;
		Page<User> page = userService.findPaginated(pageNo, pageSize);
		List<User> listUsers = page.getContent();
		
		model.addAttribute("currentPage", pageNo);
		model.addAttribute("totalPages", page.getTotalPages());
		model.addAttribute("totalElements", page.getTotalElements());
		model.addAttribute("users", listUsers);
		return "main";			// main.jsp 열기
	}
}
