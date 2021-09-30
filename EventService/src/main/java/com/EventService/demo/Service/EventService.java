package com.EventService.demo.Service;

import java.util.List;

import com.EventService.demo.Model.EventVO;
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
	
	public Event saveEvent(EventVO eventVO) {
		log.info("Create new event" );
		// Create a converter method for turning VO to event model
		convertEventVOToEvent(eventVO);
		return eventRepo.save(event);
	}

	private Event convertEventVOToEvent(EventVO eventVO){
		Event event = new Event();
		event.setEventTopic(eventVO.getTopic());
		event.setEventStatus(eventVO.getStatus());
		event.setEventDescription()
		event.setProjectId();
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
