package com.in28minutes.service;

import org.springframework.stereotype.Service;

@Service
public class LoginServiceImpl implements LoginService {

	@Override
	public boolean isValidUser(String username, String password) {
		if ("samita".equals(username) && "pass".equals(password)) {
			return true;
		}
		return false;
	}
}
