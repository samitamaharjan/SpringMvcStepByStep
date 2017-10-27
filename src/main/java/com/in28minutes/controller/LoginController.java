package com.in28minutes.controller;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.in28minutes.service.LoginService;

@Controller
public class LoginController {
	
	private final Logger LOGGER = Logger.getLogger(LoginController.class);
	
	@Autowired
	private LoginService loginService;
	
	@RequestMapping(value="/login", method=RequestMethod.GET)
	public String login() {
		
		// Test for log4j logging
		LOGGER.error("ERROR message");
		LOGGER.warn("WARN message");
		LOGGER.info("INFO message");
		LOGGER.debug("DEBUG message");
		LOGGER.trace("TRACE message");
		
		return "login";
	}

	@RequestMapping(value="/login", method=RequestMethod.POST)
	public String authenticate(@RequestParam String username,
			@RequestParam String password, ModelMap model) {
		model.put("name", username);
		model.put("message", "Welcome to our website");
		boolean isValid = loginService.isValidUser(username, password);
		if (isValid) {
			return "welcome";
		}
		return "login";
	}
}
