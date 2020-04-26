package com.example3.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
//http://localhost:8080/
@RestController
public class HelloController {
	   @RequestMapping("/")
	    @ResponseBody
	    public String home() {
	        return "Hello World students!";
	    }

}
