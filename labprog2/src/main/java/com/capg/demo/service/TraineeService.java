package com.capg.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.capg.demo.dao.TraineeDao;
import com.capg.demo.model.Trainee;

@Service
public class TraineeService {
	
	@Autowired
	TraineeDao dao;
	
	@Transactional
	public Trainee saveTrainee(Trainee trainee) {
		dao.saveTrainee(trainee);
		return dao.retrieveUserById(trainee.getTraineeId());
	}
	
	@Transactional
	public Trainee retrieveUserById(int traineeId) {
		return dao.retrieveUserById(traineeId);
	}
	
	@Transactional
	public List<Trainee> retrieveAllTrainee(){
		return dao.retrieveAllTrainee();
	}
	

}
