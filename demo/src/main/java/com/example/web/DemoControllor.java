package com.example.web;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoControllor {
	
	private final Logger log = LoggerFactory.getLogger(this.getClass());
	
	@RequestMapping(value = "/test")
	public String test(){
		
		return "";
		
	}
	@RequestMapping(value = "/test2")
	public String test2(){
		return "";
		
	}

}
