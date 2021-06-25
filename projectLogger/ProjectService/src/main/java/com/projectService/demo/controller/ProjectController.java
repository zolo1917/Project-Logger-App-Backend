package com.projectService.demo.controller;

import java.util.List;

import com.projectService.demo.VO.ProjectVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.projectService.demo.Models.Project;
import com.projectService.demo.Services.ProjectService;

import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("/project")
@CrossOrigin(origins = "*")
@Slf4j
public class ProjectController {
	@Autowired
	private ProjectService projServ;
	
	/**
	 * create a new project details
	 * @param project
	 * @return
	 */
	@PostMapping("/saveProject")
	public Project saveProject(@RequestBody Project project) {
		log.info("Creating project with project name : {}", project.getProjectName());
		return projServ.saveProject(project);
	}
	/**
	 * Get all projects with the current userid
	 * get all events associated with said projects
	 * ane create value objects taht will be the same format as the output
	 *
	 *  get all associated projects
	 * @return
	 */
	@GetMapping("/getProjects")
	public List<Project> getProjects (@RequestParam Integer id) {
		log.info("Gathering all projects for user with user Id : {}", id);
		return projServ.getAllProjectsForUser(id);
	}
	
	@DeleteMapping("/deleteProject")
	public void deleteProject(Project project) {
		log.info("Deleting project with name : {} and Id : {}", project.getProjectName(), project.getId());
		projServ.deleteProject(project);
	}

	/**
	 * create an end point to get projects by ID
	 * @Param project ID
	 */
	@GetMapping("/getProjectById")
	public Project getProjectById (@RequestParam Integer id) {
		log.info("Getting project with Project ID : {}", id);
		return projServ.getProjectById(id);
	}
}
