package com.UserService.demo.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.UserService.demo.Models.Users;
import com.UserService.demo.Repositories.UserRepo;

import lombok.extern.slf4j.Slf4j;

/**
 * Pending implementation for OAuth to detect intrusions
 * @author adwai
 *
 */
@Service
@Slf4j
public class UserService {
	
	@Autowired
	private UserRepo userRepo;
	
	public Users getUserDetails(Integer userId) {
		log.info("Get user for user id : {}", userId);
		return userRepo.findById(userId).get();
	}
	
	public Users createUser(Users user) {
		log.info("Create a new user with name : {}",user.getFirstName());
		return userRepo.save(user);
	}
	
	public Users updateUser(Users user) {
		log.info("Updating user with user id : {} and Username : {}", user.getId(), (user.getFirstName()+" "+user.getLastName()));
		return userRepo.save(user);
	}
	public String deleteUser(Users user) {
		log.info("Deleting the username with userId : {}", user.getId());
		userRepo.delete(user);
		return "User deleted successfully";
	}
}
