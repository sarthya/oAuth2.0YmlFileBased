package com.poc.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {


    @GetMapping(value = "/api")
    public Object fetch() {
    	return "I'm authorized data";
    }
}
