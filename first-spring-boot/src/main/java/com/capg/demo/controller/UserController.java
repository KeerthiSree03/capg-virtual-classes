package com.capg.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.capg.demo.model.User;
import com.capg.demo.service.UserService;

@Controller
//@RequestMapping("/information")
public class UserController {
	
	@Autowired
	UserService service;
	
//	@PostMapping("/show")
//	public String show(@RequestParam("tName") String name, @RequestParam("tAge") int age, Model m) {
//		m.addAttribute("name",name);
//		m.addAttribute("age",age);
//		m.addAttribute("collegeName",collegeName);
//		return "first";
//	}
	//@RequestMapping(value="/show", method=RequestMethod.POST)
//	@PostMapping("/show")
//	public ModelAndView show(@RequestParam("tName") String name, @RequestParam("tAge") int age) {
//		ModelAndView mv=new ModelAndView("first");
//		mv.addObject("name",name);
//		mv.addObject("age", age);
//		mv.addObject("collegeName",collegeName);
//		return mv;
//	}
	
	@PostMapping("/add")
	public ModelAndView show(@ModelAttribute User user) {
		
		User savedUser=service.saveUser(user);
		ModelAndView mv=new ModelAndView();
		mv.setViewName("success");
		mv.addObject("user", savedUser);
		
		return mv;
	}
	
	@GetMapping("/get-user")
	public String getUserByEmail(@RequestParam("tEmail")String email,Model m){
		User user=service.getUserByEmail(email);
		m.addAttribute("user",user);
		return "show";
	}
	
	@GetMapping("/")
	public String showFirstPage() {
		return "index";
	}
}
