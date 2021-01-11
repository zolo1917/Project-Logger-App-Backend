package com.UserService.demo.Models;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Getter;
import lombok.Setter;

@Entity
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Getter @Setter private Integer id;
	@Getter @Setter private String firstName;
	@Getter @Setter private String lastName;
	@Getter @Setter private Integer userStatus;
	@Getter @Setter private String email;
	@Getter @Setter private Date createdDate;
	@Getter @Setter private Date modifiedDate;
}
