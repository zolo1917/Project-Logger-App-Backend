package com.EventService.demo.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.EventService.demo.Model.Event;

@Repository
public interface EventRepository extends JpaRepository<Event, Integer>{
	public List<Event> findByProjectId(Integer projectId);
}
