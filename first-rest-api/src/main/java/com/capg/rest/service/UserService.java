package com.capg.rest.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.capg.rest.exceptions.UserNotFoundException;
import com.capg.rest.model.User;
import com.capg.rest.repo.UserJpaRepo;
@Service
public class UserService {
	
	@Autowired
	UserJpaRepo repo;
	
	@Transactional
	public User addUser(User user) {
		return repo.save(user);
	}
	@Transactional
	public User getUserById(int userId) {
		if(!repo.existsById(userId))
			throw new UserNotFoundException("User with id = "+userId+" not found");
		return repo.findById(userId).get();
	}
	@Transactional
	public List<User> getAllUsers(){
		return repo.findAll();
	}
	@Transactional
	public boolean deleteUserById(int userId) {
		repo.deleteById(userId);
		return !repo.existsById(userId);
	}
	@Transactional
	public User updateUser(User newUser) {
		User user=repo.getOne(newUser.getUserId());
		user.setUserName(newUser.getUserName());
		user.setUserCity(newUser.getUserCity());
		repo.save(user);
		return user;
	}
	
}
