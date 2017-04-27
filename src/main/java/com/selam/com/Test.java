package com.selam.com;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Test {
	
	@RequestMapping("/")
	public String sendText(){
		
		return "index";
	}

}
