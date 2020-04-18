package com.capg.demo.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.capg.demo.model.Trainee;

@Repository
public interface TraineeDaoInterface extends JpaRepository<Trainee, Integer>{
	
}
