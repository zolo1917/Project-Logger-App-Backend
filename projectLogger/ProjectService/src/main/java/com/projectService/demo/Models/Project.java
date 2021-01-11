package com.projectService.demo.Models;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
public class Project {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Getter @Setter private Integer id;
	@Getter @Setter private String projectName;
	@Getter @Setter private String summary;
	@Getter @Setter private Integer userId;
	@Getter @Setter private Integer projectStatus;
	@Getter @Setter private String projectDescription;
	@Getter @Setter private Date createdDate; 
	@Getter @Setter private Date modifiedDate;
//	public Integer getId() {
//		return id;
//	}
//	public void setId(Integer id) {
//		this.id = id;
//	}
//	public String getProjectName() {
//		return projectName;
//	}
//	public void setProjectName(String projectName) {
//		this.projectName = projectName;
//	}
//	public String getSummary() {
//		return summary;
//	}
//	public void setSummary(String summary) {
//		this.summary = summary;
//	}
//	public Integer getUserID(){
//		return this.userId;
//	}
//	public void setUserId(Integer userId) {
//		this.userId = userId;
//	}
//	public Integer getProjectStatus() {
//		return projectStatus;
//	}
//	public void setProjectStatus(Integer projectStatus) {
//		this.projectStatus = projectStatus;
//	}
//	public String getProjectDescription() {
//		return projectDescription;
//	}
//	public void setProjectDescription(String projectDescription) {
//		this.projectDescription = projectDescription;
//	}
//	public Date getCreatedDate() {
//		return createdDate;
//	}
//	public void setCreatedDate(Date createdDate) {
//		this.createdDate = createdDate;
//	}
//	public Date getModifiedDate() {
//		return modifiedDate;
//	}
//	public void setModifiedDate(Date modifiedDate) {
//		this.modifiedDate = modifiedDate;
//	}
	
}
