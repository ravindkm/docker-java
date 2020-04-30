package com.trariti.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.trariti.app.beans.LimitConfiguration;
import com.trariti.app.config.PropertyConfiguration;

@RestController
public class LimitsController {

	@Autowired
	PropertyConfiguration propertyConfiguration;
	
	@GetMapping("/limits")
	public LimitConfiguration retrieveLimitsFromConfigurations() {
		return new LimitConfiguration(propertyConfiguration.getMaximum(),
				propertyConfiguration.getMinimum());
	}
}
