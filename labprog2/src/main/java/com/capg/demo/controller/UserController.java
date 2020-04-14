package com.capg.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.capg.demo.model.User;
import com.capg.demo.service.UserService;

@Controller
public class UserController {

	@Autowired
	UserService service;
	
	@GetMapping("/login")
	public String getUserByEmail(@RequestParam("userName")String username,@RequestParam("password") String password,Model m){
		
		User user=new User(username,password);
		m.addAttribute("user",user);
		if(service.checkUser(user)) {
			return "trainee-index.jsp";
		}
		return "invalid.jsp";
	}
	
	@GetMapping("/")
	public String loginPage() {
		return "login-page.jsp";
	}
	
}
