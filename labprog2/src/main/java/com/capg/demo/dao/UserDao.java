package com.capg.demo.dao;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.capg.demo.model.User;

@Repository
public class UserDao {
	
	public Map<String,User> users() {
		Map<String,User> list=new HashMap();
		User user=new User();
		user.setUserName("Keerthi");
		user.setPassword("k1234");
		list.put(user.getUserName(),user);
		return list;
	}
	
	

}
