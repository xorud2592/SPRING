package com.example.hellospring.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.hellospring.vo.UserVo;

@RequestMapping("/user")
@Controller
public class UserController {
	@RequestMapping("/joinform")
	public String joinform() {
		return "/WEB-INF/views/joinform.jsp";
	}

	@RequestMapping(value = "/join", method = RequestMethod.POST)
	public String join(@ModelAttribute UserVo vo) {
		System.out.println("Model Attribute: " + vo);
		return "redirect:/user/joinsuccess";
	}
//	public String join(@RequestParam String name, @RequestParam String email, @RequestParam String password,
//			@RequestParam String gender, @RequestParam String age) {
//		System.out.println("Param name: " + name);
//		System.out.println("Param email: " + email);
//		System.out.println("Param password: " + password);
//		System.out.println("Param gender: " + gender);
//		System.out.println("Param age: " + age);
//		
//		return "redirect:/user/joinsuccess";
//	}
	
	@ResponseBody
	@RequestMapping("/joinsuccess")
	public String joinsuccess() {
		return "<h3>Join Success!</h3>";
	}
	
}
