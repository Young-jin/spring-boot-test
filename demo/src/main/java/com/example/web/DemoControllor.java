package com.example.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoControllor {
	
	@RequestMapping(value = "/test")
	public String test(){
		return "";
		
	}

}
