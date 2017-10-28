package com.in28minutes.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TodoServiceImpl implements TodoService {

	@Override
	public List<String> getTodos() {
		List<String> list = new ArrayList<>();
		list.add("Eyedrop");
		list.add("Broom");
		list.add("Tissue paper");
		list.add("Bowl cleaner");
		list.add("medicine for flu");
		list.add("Markers");
		return list;
	}
	
}
