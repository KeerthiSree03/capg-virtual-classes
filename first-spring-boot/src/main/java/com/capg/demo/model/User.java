package com.capg.demo.model;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.Size;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name = "user_info")
public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int userId;
	
	private String userName;
	
	private int age;
	
	private String email;
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private LocalDate dob;
	public User(String userName, int age, String email, LocalDate dob) {
		super();
		this.userName = userName;
		this.age = age;
		this.email = email;
		this.dob = dob;
	}
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public LocalDate getDob() {
		return dob;
	}
	public void setDob(LocalDate dob) {
		this.dob = dob;
	}
	@Override
	public String toString() {
		return "User [userName=" + userName + ", age=" + age + ", email=" + email + ", dob=" + dob + "]";
	}
	
	
}
