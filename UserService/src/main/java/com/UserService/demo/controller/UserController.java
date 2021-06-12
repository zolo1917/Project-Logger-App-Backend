package com.UserService.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import com.UserService.demo.Models.User;
import com.UserService.demo.Services.UserService;

import lombok.extern.slf4j.Slf4j;

@Controller
@RequestMapping("/user")
@CrossOrigin(origins = "*")
@Slf4j
public class UserController {
	
	@Autowired
	private UserService userServ;
	
	@PostMapping("/saveUser")
	public User createUser(@RequestBody User user) {
		return userServ.createUser(user);
	}
	@PostMapping("/updateUser")
	public User updateUser(@RequestBody User user) {
		log.info("Updating user with userID {}", user.getId());
		return userServ.updateUser(user);
	}
	@GetMapping("/getUser")
	public User getUser(@RequestParam Integer id) {
		log.info("Fetching user detials for user with id : {}", id);
		return userServ.getUserDetails(id);
	}
}
