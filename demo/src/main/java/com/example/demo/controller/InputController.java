package com.example.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.demo.entity.User;
import com.example.demo.repository.UserRepository;

@Controller
public class InputController {
	@Autowired
	UserRepository userRepository;

	@RequestMapping(path = "/input", method = RequestMethod.POST)
	public String Input(String userName, String passward) {
		List<User> userInfo = new ArrayList<>();
		userInfo = userRepository.findAll();
		for (User user : userInfo) {
			System.out.println(user.getUser_name());
			System.out.println(userName);
			System.out.println(user.getPassward());
			System.out.println(passward);
			if (user.getUser_name().equals(userName) && user.getPassward().equals(passward)) {
				System.out.println(1);
				return "input/input";
			}
		}
		return "redirect:/";

	}

}
