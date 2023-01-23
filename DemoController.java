package com.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api")
public class DemoController {

	
	 @GetMapping("/value/{num}")
	    public Integer valueForPrimeNo(@PathVariable("num") Integer num) {
	        if(num.equals(num))
	            return num;
	        throw new RuntimeException();
	    }
}
