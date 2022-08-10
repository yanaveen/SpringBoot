package com.naveen.Hello_Word.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/helloworld")
public class HelloController {
	
	@RequestMapping
	public String add() {
		return "Hello world";
	}

}
