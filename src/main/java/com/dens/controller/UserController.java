package com.dens.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.dens.core.DefaultLogger;
import com.dens.databeans.User;
import com.dens.databeans.payload.UserReq;
import com.dens.service.UserService;

@RestController
@RequestMapping(path = "/dens/user")
public class UserController {

	@Autowired
	UserService userService;

	@GetMapping("/get")
	public ResponseEntity<User> getUser(@RequestBody UserReq userReq) {
		User user = null;
		try {
			user = userService.getUserByUserPrimeKey(userReq.getUserPrimeKey());
			DefaultLogger.info("User fetched : " + user.getUserPrimeKey());
			return new ResponseEntity<User>(user, HttpStatus.OK);
		} catch (Exception e) {
			DefaultLogger.error("Error saving User :" + user.getUserPrimeKey(),e);
			return new ResponseEntity<User>(HttpStatus.NOT_FOUND);
		}
	}

	@PostMapping("/save")
	public ResponseEntity<User> saveUser(@RequestBody User user) {
		try {
			userService.saveUser(user);
			DefaultLogger.info("User saved : " + user.getUserPrimeKey());
			return new ResponseEntity<User>(user, HttpStatus.OK);
		} catch (Exception e) {
			DefaultLogger.error("Error saving User :" + user.getUserPrimeKey() , e);
			return new ResponseEntity<User>(HttpStatus.NOT_MODIFIED);
		}

	}

}
