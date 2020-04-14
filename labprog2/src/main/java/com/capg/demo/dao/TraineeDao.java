package com.capg.demo.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;

import com.capg.demo.model.Trainee;

@Repository
public class TraineeDao {
	
	@PersistenceContext
	EntityManager em;
	
	public void saveTrainee(Trainee trainee) {
		em.persist(trainee);
	}
	
	public Trainee retrieveUserById(int traineeId) {
		TypedQuery<Trainee> q=em.createQuery("from Trainee where traineeId=:traineeId", Trainee.class);
		q.setParameter("traineeId", traineeId);
		Trainee trainee= q.getSingleResult() ;
		return trainee;
	}
	
	public List<Trainee> retrieveAllTrainee(){
		TypedQuery<Trainee> q=em.createQuery("select t from Trainee t", Trainee.class);
		List<Trainee> l=new ArrayList<>();
		l=q.getResultList();
		return l;
	}

}
