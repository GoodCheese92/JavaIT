package com.example.demo.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.example.demo.entity.User;
import com.example.demo.repository.UserRepository;
import com.example.demo.service.UserService;


@Service
public class UserServiceImpl implements UserService {
// Repository : 데이터베이스 접근
// Service : 데이터베이스 정보를 기반으로 Controller에 기능제공
// Impl : 인터페이스를 구현한 부분(클래스) 
	
	@Autowired
	private UserRepository userRepository;
	
	public UserServiceImpl(UserRepository userRepository) {
		super();
		this.userRepository = userRepository;
	}

	@Override
	public List<User> getAllUser() {
		return userRepository.findAll();	// 데이터베이스 모든 row를 List 형태로
	}

	@Override
	public User saveUser(User user) {
		return userRepository.save(user);		// DB 입력
	}

	@Override
	public User getUserById(Long id) {
		return userRepository.findById(id).get();	// id에 해당하는 row를 알려줌
	}

	@Override
	public User updateUser(User user) {
		return userRepository.save(user);		// DB 입력 및 수정
	}

	@Override
	public void deleteUserById(Long id) {
		userRepository.deleteById(id);		// 아이디를 통해서 삭제하기
	}

	@Override
	public Page<User> findPaginated(int pageNo, int pageSize) {
		Pageable pageable = PageRequest.of(pageNo-1, pageSize);
		return userRepository.findAll(pageable);
	}
	
	
	
}
