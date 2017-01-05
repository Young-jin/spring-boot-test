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
		
		log.info("test 입니다.");
		
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
