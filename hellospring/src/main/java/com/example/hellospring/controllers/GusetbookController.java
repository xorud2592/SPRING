package com.example.hellospring.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@RequestMapping("/guestbook/*")
@Controller
public class GusetbookController {
	@ResponseBody
	@RequestMapping
	public String list() {
		return "<h1>Guestbook List</h1>";
	}
	
	@ResponseBody
	@RequestMapping
	public String add() {
		return "<h1>Guestbook add</h1>";
	}
	
	@ResponseBody
	@RequestMapping
	public String delete() {
		return "<h1>Guestbook delete</h1>";
	}
}
