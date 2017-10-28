package com.in28minutes.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.in28minutes.service.TodoService;

@Controller
public class ToDoController {
		
	@Autowired
	private TodoService todoService;
	
	@RequestMapping(value="/todo", method=RequestMethod.GET)
	public String getAllToDos(ModelMap model) {
		List<String> todos = todoService.getTodos();
		model.put("todos", todos);
		return "todo";
	}
}
