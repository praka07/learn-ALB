/**
 * 
 */
package com.learn.Aws.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Dell
 *
 */
@RestController
public class EntryController {

	@Value("{msg}")
	private String customMsg;

	@GetMapping
	public ResponseEntity<String> getTime() {
		return ResponseEntity.ok().body("{\"message\":\"" + customMsg + "\"}");
	}
}
