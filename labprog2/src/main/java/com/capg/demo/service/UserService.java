package com.capg.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capg.demo.dao.UserDao;
import com.capg.demo.model.User;

@Service
public class UserService {
	
	@Autowired
	UserDao dao;
	
	public boolean checkUser(User user) {
		if(dao.users().containsKey(user.getUserName())) {
			if((dao.users().get(user.getUserName()).getPassword()).equals(user.getPassword())) {
				return true;
			}
		}
		return false;
	}
	

}
