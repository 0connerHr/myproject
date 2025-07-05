package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class InputController {
	@RequestMapping(path="/input",method=RequestMethod.POST)
	public String Input(@Param String userName) {
		return "input/input";
	}
}
