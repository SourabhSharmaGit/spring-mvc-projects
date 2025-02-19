package com.rays.ctl;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "WelcomeCtl")
public class WelcomeCtl {

	@GetMapping
	public String display() {
		System.out.println("1st method");
		return "Welcome";
	}
	
	@GetMapping("display")
	public String display1() {
		System.out.println("2nd method");
		return "Welcome";
	}

}