package com.ong.webfluxdemo.controller;

import com.ong.webfluxdemo.dto.Response;
import com.ong.webfluxdemo.service.MathService;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController

@RequestMapping("math")


public class MathController {
    @Autowired
    
    private MathService mathService;

    @GetMapping("/math")
    


    public String index() {
      return "Greetings from Math Service";
    }

    @GetMapping("square/{input}")
    public Response findSquare(@PathVariable int input) {
        return this.mathService.findSquare(input);
    }

    @GetMapping("table/{input}")
    public List<Response> multiplicationTable(@PathVariable int input) {
        return this.mathService.multiplicationTable(input);
    }

    @GetMapping("table/delayed/{input}")
    public List<Response> delayedmultiplicationTable(@PathVariable int input) {
        return this.mathService.delayedmultiplicationTable(input);
    }
}
