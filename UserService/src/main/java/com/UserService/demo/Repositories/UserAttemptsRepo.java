package com.UserService.demo.Repositories;

import com.UserService.demo.Models.UserAttempts;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserAttemptsRepo extends JpaRepository<UserAttempts, Integer> {
}
