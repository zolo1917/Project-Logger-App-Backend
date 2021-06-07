package com.projectService.demo.Services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.projectService.demo.Models.Project;
import com.projectService.demo.repositories.ProjectRepository;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class ProjectService {
	@Autowired
	private ProjectRepository projRepo;
	
	/**
	 * Get all the projects for a selected user
	 * @param userId
	 * @return
	 */
	public List<Project> getAllProjectsForUser(Integer userId) {
		log.info("repository call for gathering projects");
		List<Project> userProject = new ArrayList<Project>();
		userProject = projRepo.findByUserId(userId);
		return userProject;
	}

	/**
	 * Save a new project for an existing user.
	 * @param project
	 * @return
	 */
	public Project saveProject(Project project) {
		return projRepo.save(project);
	}
	
	/**
	 * Get the respective project for the selected project id
	 * @param Id
	 * @return
	 */
	public Project getProjectById (Integer Id) {
		return projRepo.findById(Id).get();
	}

	/**
	 * delete project Project for a user.
	 * @param project
	 */
	public void deleteProject(Project project) {
		projRepo.delete(project);
	}
	
	
	/**
	 * Update an existing project details / status
	 * @param project
	 */
	public void updateProject(Project project) {
		projRepo.save(project);
	}
	
	
}
