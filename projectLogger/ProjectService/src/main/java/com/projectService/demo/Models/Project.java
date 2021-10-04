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
	
}
