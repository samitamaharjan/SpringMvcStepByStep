package com.in28minutes.service;

import java.util.List;

import org.springframework.stereotype.Service;

@Service
public interface TodoService {
	public List<String> getTodos();
}
