package com.in28minutes.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.in28minutes.model.Todo;

@Service
public interface TodoService {
	public void create(Todo todo);
	public List<Todo> getTodos();
	public Todo getTodoById(String id);
	public void deleteById(String id);
}