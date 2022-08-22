package com.hnt.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hnt.UserRepository;
import com.hnt.entity.User;

@Service
public class userService {

	@Autowired
	UserRepository userRepository;

	public void saveUser(User user) {
		userRepository.save(user);
	}

}
