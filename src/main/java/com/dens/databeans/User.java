package com.dens.databeans;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "_users")
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "user_prime_key")
	private Long userPrimeKey;
	
	@Column(name = "username")
	private String userName;
	
	@Column(name = "passoword")
	private String password;
	
	@Column(name = "otp_requested_time")
	private String otp_requested_time;

	public Long getUserPrimeKey() {
		return userPrimeKey;
	}

	public void setUserPrimeKey(Long userPrimeKey) {
		this.userPrimeKey = userPrimeKey;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getOtp_requested_time() {
		return otp_requested_time;
	}

	public void setOtp_requested_time(String otp_requested_time) {
		this.otp_requested_time = otp_requested_time;
	}
	
}
