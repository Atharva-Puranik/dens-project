package com.dens.service;

import com.dens.databeans.User;

public interface UserService {

	User getUserByUserPrimeKey(Long user_prime_key);

	User saveUser(User user);

}
