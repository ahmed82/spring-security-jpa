package com.atro.securityJPA.dao;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.atro.securityJPA.models.User;

public interface UserRepository extends JpaRepository<User, Integer> {
	
	public Optional<User> findByUsername(String userName);
	//public User  findByUsername(String userName);
	
}
