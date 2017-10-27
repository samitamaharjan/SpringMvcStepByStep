package com.in28minutes.service;

import org.springframework.stereotype.Service;

@Service
public interface LoginService {
	public boolean isValidUser(String username, String password);
}
