package com.capg.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.capg.demo.dao.TraineeDaoInterface;
import com.capg.demo.model.Trainee;

@Service
public class TraineeService {
	
	@Autowired
	TraineeDaoInterface dao;
	
	@Transactional
	public Trainee saveTrainee(Trainee trainee) {
		dao.save(trainee);
		return dao.getOne(trainee.getTraineeId());
	}
	
	@Transactional
	public Trainee retrieveTraineeById(int traineeId) {
		return dao.getOne(traineeId);
	}
	
	@Transactional
	public List<Trainee> retrieveAllTrainee(){
		return dao.findAll();
	}
	
	@Transactional
	public boolean deleteTraineeById(int traineeId) {
		dao.deleteById(traineeId);
		return !dao.existsById(traineeId);
	}
	
	@Transactional
	public Trainee modifyTrainee(Trainee trainee) {
		Trainee newTrainee=dao.getOne(trainee.getTraineeId());
		newTrainee.setTraineeId(trainee.getTraineeId());
		newTrainee.setTraineeName(trainee.getTraineeName());
		newTrainee.setTraineeDomain(trainee.getTraineeDomain());
		newTrainee.setTraineeLocation(trainee.getTraineeLocation());
		dao.save(newTrainee);
		return trainee;
	}


}
