package com.cgi.location.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cgi.location.model.User;
import com.cgi.location.service.UserService;

@RestController
@RequestMapping("/api/v1/user")
public class UserController {
	
	@Autowired
	UserService userService;
	
	@GetMapping("/get/all")
	public List<User> getAllUsers() {
		return userService.findAll();
	}
	
	@GetMapping("/get/{id}")
	public User getUserById(@PathVariable String id) {
		return userService.finById(id);
	}
	
	@PostMapping("/add/")
	public User addUser(@RequestBody User user) {
		return userService.addUser(user);
	}
	
	@PutMapping("/update/{id}")
	public User updateUser(@PathVariable String id, @RequestBody User user) {
		return userService.updateUser(id,user);
	}
	
	@DeleteMapping("/delete/{id}")
	public void deleteUser(@PathVariable String id) {
		 userService.deleteUser(id);
	}
}
