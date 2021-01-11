package com.EventService.demo.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.EventService.demo.Model.Event;
import com.EventService.demo.Repository.EventRepository;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class EventService {

	@Autowired
	private EventRepository eventRepo;
	
	public Event saveEvent(Event event) {
		log.info("Create new event" );
		return eventRepo.save(event);
	}
	
	public Event updateEvent(Event event) {
		log.info("Update event with event Topic : {}", event.getEventTopic());
		return eventRepo.save(event);
	}
	
	public Event getEventById(Integer id) {
		log.info("fetch event by ID : {}", id);
		return eventRepo.findById(id).get();
	}
	
	public List<Event> getEventsForProject(Integer projectId){
		log.info("fetching list of events with project ID : {}", projectId);
		return eventRepo.findByProjectId(projectId);
	}
	
	public void deleteProject(Event event) {
		log.info("delete event with id : {}", event.getId());
		eventRepo.delete(event);
	}
}
