package com.capg.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.capg.demo.model.Trainee;
import com.capg.demo.service.TraineeService;

@Controller
public class TraineeController {
	
	@Autowired
	TraineeService service;

	@PostMapping("/add")
	public ModelAndView addTrainee(@ModelAttribute Trainee trainee) {
		
		Trainee savedTrainee=service.saveTrainee(trainee);
		ModelAndView mv=new ModelAndView();
		mv.setViewName("show.jsp");
		mv.addObject("trainee", savedTrainee);
		
		return mv;
	}
	
	@PostMapping("/retrieve")
	public ModelAndView getTraineeById(@RequestParam("traineeId") int traineeId) {
		Trainee trainee=service.retrieveTraineeById(traineeId);
		ModelAndView mv=new ModelAndView();
		mv.setViewName("show.jsp");
		mv.addObject("trainee", trainee);
		return mv;
	}
	
	@GetMapping("/retrieveall")
	public ModelAndView retrieveAllTrainee() {
		List<Trainee> allTrainees =service.retrieveAllTrainee();
		ModelAndView mv=new ModelAndView();
		mv.setViewName("retrieveall.jsp");
		mv.addObject("allTrainees",allTrainees);
		return mv;
	}
	
	@PostMapping("/delete")
	public String deleteById(@RequestParam("traineeId") int traineeId) {
		service.deleteTraineeById(traineeId);
		return "trainee-index.jsp";
	}
	
	@PostMapping("/modify")
	public ModelAndView modifyById(@RequestParam("traineeId") int traineeId) {
		ModelAndView mv=new ModelAndView();
		Trainee trainee=service.retrieveTraineeById(traineeId);
		mv.setViewName("modification.jsp");
		mv.addObject("trainee", trainee);
		return mv;
	}
	
	@GetMapping("/modification")
	public String modified(@ModelAttribute Trainee trainee) {
		service.modifyTrainee(trainee);
		return "trainee-index.jsp";
	}
	
	
}
