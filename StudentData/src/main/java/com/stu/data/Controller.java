package com.stu.data;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller 
{
	@GetMapping("/")
	public  String name()
	{
		System.out.println("rahul");
		return "rahul.html";
	}
}
