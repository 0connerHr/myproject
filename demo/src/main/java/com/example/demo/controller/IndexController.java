package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.demo.repository.UserRepository;

@Controller
public class IndexController {
	@Autowired
	UserRepository userRepository;
	
	@RequestMapping(path="/",method=RequestMethod.GET)
		public String index(Model model) {
			model.addAttribute("userInfo",userRepository.findAll());
			return "login/login";
		}
	}

