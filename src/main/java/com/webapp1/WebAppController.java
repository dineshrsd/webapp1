package com.webapp1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/webapp")
public class WebAppController {

	@GetMapping(value="/hello")
	public String hello() {
		return "hello world";
	}
	
}
