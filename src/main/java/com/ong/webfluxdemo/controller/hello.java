package com.ong.webfluxdemo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController

public class hello {
    @RequestMapping("/hello")
	public String index() {
		return "Greetings from Math Service /n /reactive-math/table/number/stream";

	}
}
