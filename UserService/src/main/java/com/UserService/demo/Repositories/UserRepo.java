package com.UserService.demo.Repositories;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.UserService.demo.Models.Users;

@Repository
public interface UserRepo extends JpaRepository<Users, Integer> {
}
