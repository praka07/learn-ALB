/**
 * 
 */
package com.learn.Aws.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Dell
 *
 */
@RestController
public class EntryController {

	@GetMapping
	public ResponseEntity<String> getTime() {
		return ResponseEntity.ok().body("{ \"message\" : \"i am from ap-south-1b\"}");
	}
}
