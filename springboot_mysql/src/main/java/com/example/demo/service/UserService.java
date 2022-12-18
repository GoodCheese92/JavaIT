package com.example.demo.service;

import java.util.List;

import org.springframework.data.domain.Page;

import com.example.demo.entity.User;

public interface UserService {
	// 모든 사용자 정보를 가져오는 메서드
	List<User> getAllUser();
	
	// 사용자 등록 메서드
	User saveUser(User user);
	
	// 아이디 번호를 통해 유저를 찾는 메서드
	User getUserById(Long id);
	
	// 사용자 수정 메서드
	User updateUser(User user);
	
	// 사용자 삭제 메서드
	void deleteUserById(Long id);
	
	// 게시판 페이지 분할 메서드
	Page<User> findPaginated(int pageNo, int pageSize);
}
