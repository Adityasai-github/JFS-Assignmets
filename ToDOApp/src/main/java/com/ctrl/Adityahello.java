package com.ctrl;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Adityahello  {
	@RequestMapping("/helloWorld")
	public String hello() {
	return "helloWorld";	
	}
	
	

}
