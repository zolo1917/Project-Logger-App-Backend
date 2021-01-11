package com.projectService.demo.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.projectService.demo.Models.Project;

@Repository
public interface ProjectRepository extends JpaRepository<Project, Integer>{
	public List<Project> findByUserId(Integer userId);
}
