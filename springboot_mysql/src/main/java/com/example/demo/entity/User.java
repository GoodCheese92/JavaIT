package com.example.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="user1")	// MySQL 테이블명을 적어준다
public class User {

	// 구분키 지정
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name="name",nullable=false)
	private String name;
	
	@Column(name="gender",nullable=false)
	private String gender;

	@Column(name="phone",nullable=false)
	private String phone;
	
	@Column(name="email")
	private String email;
	
	// 기본 생성자
	public User() {}

	public User(String name, String gender, String phone, String email) {
		super();
		this.name = name;
		this.gender = gender;
		this.phone = phone;
		this.email = email;
	}



	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	
}
