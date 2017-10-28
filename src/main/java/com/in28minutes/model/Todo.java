package com.in28minutes.model;

import java.util.UUID;

public class Todo {
	
	private String id;
	private String description;
	private boolean done;
	
	public Todo(String description) {
		this.id = UUID.randomUUID().toString();
		this.description = description;
		this.done = false;
	}

	public String getId() {
		return id;
	}

	public String getDescription() {
		return description;
	}

	public boolean isDone() {
		return done;
	}	
}
