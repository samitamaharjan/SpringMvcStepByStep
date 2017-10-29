package com.in28minutes.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.in28minutes.model.Todo;
import com.in28minutes.repository.FileManager;

@Service
public class TodoServiceImpl implements TodoService {
	
	@Autowired
	FileManager<Todo> fileManager;

	@Override
	public void create(Todo todo) {
		if (todo == null) return;
		fileManager.insert(todo);
	}

	@Override
	public List<Todo> getTodos() {
		return fileManager.findAll();
	}

	@Override
	public Todo getTodoById(String id) {
		return fileManager.findByPrimaryKey(id);
	}

	@Override
	public void deleteById(String id) {
		fileManager.delete(id);
	}
}