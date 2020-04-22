package com.capg.rest.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.capg.rest.model.User;

public interface UserJpaRepo extends JpaRepository<User, Integer>{

}
