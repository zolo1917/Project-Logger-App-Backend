package com.projectService.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.projectService.demo.Models.Project;
import com.projectService.demo.Services.ProjectService;

import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("/project")
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
	public List<Project> defaultEndpoint (@RequestParam Integer id) {
		log.info("Gathering all projects for user with user Id : {}", id);
		return projServ.getAllProjectsForUser(id);
	}
	
	@DeleteMapping("/deleteProject")
	public void deleteProject(Project project) {
		log.info("Deleting project with name : {} and Id : {}", project.getProjectName(), project.getId());
		projServ.deleteProject(project);
	}
}
