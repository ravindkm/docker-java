/**
 * 
 */
package com.trariti.app.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author ravinder.kumar
 *
 */
@RestController
public class WelcomeController {
	
	@GetMapping("/welcome")
	public String helloWorld() {
		return "Hello world";
	}
}
