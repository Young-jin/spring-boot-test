package com.example.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoControllor {
	
	@RequestMapping(value = "/test")
	public String test(){
		return "";
		
	}
	@RequestMapping(value = "/test2")
	public String test2(){
		return "";
		
	}
	@RequestMapping(value = "/test3")
	public String test3(){
		return "";
		
	}
	@RequestMapping(value = "/test4")
	public String test4(){
		return "";
		
	}
	@RequestMapping(value = "/test5")
	public String test5(){
		return "";
		
	}

}
