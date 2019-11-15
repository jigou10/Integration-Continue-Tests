package com.mahdad.dnt3test;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	@RequestMapping("/")
	public String index() {
		return "Gretings from spring boot!!";
	}
	
	@RequestMapping("/")
	public String hello() {
		return "Hello word!";
	}	
}