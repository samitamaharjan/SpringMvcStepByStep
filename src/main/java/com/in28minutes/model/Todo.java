package com.in28minutes.model;

import java.io.Serializable;
import java.util.UUID;

import com.in28minutes.repository.PrimaryKey;

public class Todo implements Serializable, PrimaryKey {
	
	private static final long serialVersionUID = 1L;
	
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

	@Override
	public String getPrimaryKey() {
		return id;
	}	
}
