package com.cgi.location.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cgi.location.model.User;
import com.cgi.location.repo.UserRepository;

@Service
public class UserService {
	
	@Autowired
	UserRepository userRepository;

	public List<User> findAll() {
		return userRepository.findAll();
	}

	public User finById(String id) {
		return userRepository.findById(id).get();
	}

	public User addUser(User user) {
		user.setCreatedDate(new Date());
		return userRepository.save(user);
	}

	public User updateUser(String id, User user) {
		User toUpdateUser = userRepository.findById(id).get();
		toUpdateUser.setFirstName(user.getFirstName());
		toUpdateUser.setLastName(user.getLastName());
		toUpdateUser.setUsername(user.getUsername());
		toUpdateUser.setPassword(user.getPassword());
		toUpdateUser.setSecurityQuestions(user.getSecurityQuestions());
		toUpdateUser.setSecurityAnswers(user.getSecurityAnswers());
		toUpdateUser.setModifiedDate(new Date());
		return userRepository.save(toUpdateUser);
	}

	public void deleteUser(String id) {
		userRepository.deleteById(id);
	}
	

}