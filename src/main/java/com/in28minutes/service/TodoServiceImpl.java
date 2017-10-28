package com.in28minutes.service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.stereotype.Service;

import com.in28minutes.model.Todo;

@Service
public class TodoServiceImpl implements TodoService {
	
	private static List<Todo> list = new ArrayList<>();

	@Override
	public void create(Todo todo) {
		if (todo == null) return;
		list.add(todo);
	}

	@Override
	public List<Todo> getTodos() {
		return list;
	}

	@Override
	public Todo getTodoById(String id) {
		for (Todo todo : list) {
			if (todo.getId().equals(id)) {
				return todo;
			}
		}
		return null;
	}

	@Override
	public void deleteById(String id) {
		Iterator<Todo> it = list.iterator();
		while (it.hasNext()) {
			Todo todo = it.next();
			if (todo.getId().equals(id)) {
				it.remove();
			}
		}
	}
}