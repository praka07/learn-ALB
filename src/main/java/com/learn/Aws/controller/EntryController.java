/**
 * 
 */
package com.learn.Aws.controller;

import java.util.Date;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Dell
 *
 */
@RestController
public class EntryController {

	@GetMapping
	public String getTime() {
		return new Date().toString();
	}
}
