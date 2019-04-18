package com.bwf.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/home")
public class Home {
	//主页index
	@RequestMapping("/index")
	public String index() {		
		return "home/index";
	}	
}
