package com.in28minutes.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.in28minutes.model.Todo;
import com.in28minutes.service.TodoService;

@Controller
public class ToDoController {
		
	@Autowired
	private TodoService todoService;
	
	@RequestMapping(value="/", method=RequestMethod.GET)
	public void home(HttpServletResponse response) throws IOException {
		response.sendRedirect("/todos");
	}
	
	@RequestMapping(value="/todos", method=RequestMethod.GET)
	public String getAllToDos(ModelMap model) {
		List<Todo> todos = todoService.getTodos();
		model.put("todos", todos);
		return "todos";
	}
	
	@RequestMapping(value="/todo", method=RequestMethod.POST)
	public void saveTodo(@RequestParam String description, HttpServletResponse response) throws IOException {
		Todo todo = new Todo(description);
		todoService.create(todo);
		response.sendRedirect("/todos");
	}
	
	@RequestMapping(value="/todo/{id}", method=RequestMethod.GET)
	public String displayTodo(@PathVariable("id") String id, ModelMap model) {
		Todo todo = todoService.getTodoById(id);
		model.put("todo", todo);
		return "todo";
	}
	
	@RequestMapping(value="/todo/delete/{id}", method=RequestMethod.GET)
	public void deleteTodoById(@PathVariable("id") String id, HttpServletResponse response) throws IOException {
		todoService.deleteById(id);
		response.sendRedirect("/todos");
	}
}
