package com.dens.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dens.databeans.User;
import com.dens.repository.UserRepository;
import com.dens.service.UserService;

@Service
public class UserServiceImpl implements UserService{

	@Autowired
	UserRepository userRepository;
	
	@Override
	public User getUserByUserPrimeKey(Long user_prime_key) {
		return userRepository.findByUserPrimeKey(user_prime_key);
	}

	@Override
	public User saveUser(User user) {
		return userRepository.save(user);
	}

}
