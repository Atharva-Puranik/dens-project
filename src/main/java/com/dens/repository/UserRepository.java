package com.dens.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dens.databeans.User;

public interface UserRepository extends JpaRepository<User, Long>{
	
	User findByUserPrimeKey(Long userPrimeKey);
	
}
