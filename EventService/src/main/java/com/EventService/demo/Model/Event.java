package com.EventService.demo.Model;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity(name="project_event")
public class Event {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Getter @Setter private Integer id;
	@Getter @Setter private String eventTopic;
	@Getter @Setter private Integer projectId;
	@Getter @Setter private String eventDescription;
	@Getter @Setter private String eventStatus;
	@Getter @Setter private Date createdDate;
	@Getter @Setter private Date updatedDate;
}
