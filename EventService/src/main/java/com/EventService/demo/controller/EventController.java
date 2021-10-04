package com.EventService.demo.controller;

import java.util.List;

import com.EventService.demo.Model.EventVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import com.EventService.demo.Model.Event;
import com.EventService.demo.Service.EventService;

import lombok.extern.slf4j.Slf4j;

/**
 * creating service for updating and controlling the events and its creation on the page
 * @author adwai
 *
 */
@RestController
@RequestMapping("/event")
@CrossOrigin(origins = "*")
@Slf4j
public class EventController {
	
	@Autowired
	private EventService eventServ;
	
	/**
	 * Fetch all the events for a speci fic project
	 */
	@GetMapping("/fetchEvents")
	public List<Event> getEvents(@RequestParam Integer Id){
		log.info("Gathering events for project id : {}", Id);
		return eventServ.getEventsForProject(Id);
	}
	
	/**
	 * Get a Specfic event with event id as given
	 */
	@GetMapping("/fetchEventById")
	public Event getEventById(@RequestParam Integer id) {
		return eventServ.getEventById(id);
	}
	
	/**
	 * Save event for a Specific project
	 */
	@PostMapping("/saveEvent")
	public Event saveEvent(@RequestBody EventVO event) {
		return eventServ.saveEvent(event);
	}
	
	/**
	 * Update existing event with required details
	 * @param event
	 * @return
	 */
	@PostMapping("/updateProject")
	public Event updateEvent(@RequestBody Event event) {
		return eventServ.updateEvent(event);
	}
	
	/**
	 * Delete event for project
	 */
	public String deleteEvent(@RequestBody Event event) {
		eventServ.deleteProject(event);
		return "delete event successful";
	}

	/**
	 * Get all the events for a specfic project
	 * @Params project ID
	 * @return
	 */
	@GetMapping("/getEventsForProject")
	public List<Event> getEventsForProject(@RequestParam Integer id){
		return eventServ.getEventsForProject(id);
	}
	
}
