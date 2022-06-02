package com.ong.webfluxdemo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController

public class hello {
    @RequestMapping("/")
	public String index() {
		return "Greetings from Math Service";
	}
}
