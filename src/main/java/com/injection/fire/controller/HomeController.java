package com.injection.fire.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HomeController {
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String main() {
		return "testPage";
	}
	
	@RequestMapping(value = "/home", method = RequestMethod.GET)
	public void home(ModelMap map) {
		map.put("msg", "hello!!");
	}
}
