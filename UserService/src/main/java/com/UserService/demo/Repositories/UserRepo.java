package com.UserService.demo.Repositories;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.UserService.demo.Models.User;

@Repository
public interface UserRepo extends JpaRepository<User, Integer> {
}
