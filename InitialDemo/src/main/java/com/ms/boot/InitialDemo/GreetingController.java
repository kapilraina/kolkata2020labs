package com.ms.boot.InitialDemo;

import java.util.Date;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/greeting")
public class GreetingController {
	
	@RequestMapping(path = "/default",method = RequestMethod.GET)
	public String getDefaultMessage()
	{
		return "Hello Delta!";
	}
	
	@RequestMapping(path = "/detail",method = RequestMethod.GET)
	public Greeting getDetailMessage()
	{
		return new Greeting("Hello", "Miss MicroS", new Date());
	}

}
