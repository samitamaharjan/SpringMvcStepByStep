package com.in28minutes.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.in28minutes.model.Todo;

@Service
public class TodoServiceImpl implements TodoService {

	@Override
	public List<Todo> getTodos() {
		List<Todo> list = new ArrayList<>();
		Todo todo1 = new Todo("Eyedrop");
		Todo todo2 = new Todo("Broom");
		Todo todo3 = new Todo("Tissue paper");
		Todo todo4 = new Todo("Medicine for flu");
		Todo todo5 = new Todo("Markers");
		
		list.add(todo1);
		list.add(todo2);
		list.add(todo3);
		list.add(todo4); 
		list.add(todo5);
		return list;
	}
}