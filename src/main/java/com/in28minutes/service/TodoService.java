package com.in28minutes.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.in28minutes.model.Todo;

@Service
public interface TodoService {
	public List<Todo> getTodos();
}