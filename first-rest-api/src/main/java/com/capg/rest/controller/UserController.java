package com.capg.rest.controller;

import java.util.List;

import javax.persistence.PersistenceContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.capg.rest.exceptions.UserNotFoundException;
import com.capg.rest.model.User;
import com.capg.rest.service.UserService;

@RestController
@RequestMapping("/api")
public class UserController {

	@Autowired
	UserService service;
	
	@PostMapping("/add")
	public ResponseEntity<User> addUser(@RequestBody User user) {
		service.addUser(user);
		return new ResponseEntity<User>(user,HttpStatus.CREATED); 
	}
	
	@GetMapping("/users/id/{id}")
	public ResponseEntity<User> getUserById(@PathVariable("id") int userId){
		
		User user=service.getUserById(userId);
		return new ResponseEntity<User>(user, HttpStatus.OK);
	}
	
	@GetMapping("/users")
	public ResponseEntity<List<User>> getAllUsers(){
		List<User> userList=service.getAllUsers();
		return new ResponseEntity<List<User>>(userList,HttpStatus.OK);
	}
	
	@DeleteMapping("/users/id/{id}")
	public ResponseEntity<User> deleteUserById(@PathVariable("id") int userId){
		service.deleteUserById(userId);
		return new ResponseEntity<User>(HttpStatus.OK);
	}
	
	@PutMapping("/users")
	public ResponseEntity<User> updateUserById(@RequestBody User user){
		service.updateUser(user);
		return new ResponseEntity<User>(user,HttpStatus.OK);
	}
}
