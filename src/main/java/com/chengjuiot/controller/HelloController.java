package com.chengjuiot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {
	    @RequestMapping("/test/hello")
	    @ResponseBody
	    public String hello(){
	        return "test hello spring";
	    }
}
  