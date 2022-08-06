
package com.cdac.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class LoginController {

	@RequestMapping("/")
	public String index() {
		return "input";
	}
	
	@RequestMapping(value = "/checkuser" , 
			method = RequestMethod.POST)
	public ModelAndView checkUserCredentials(
			@RequestParam("username") String uname,
			@RequestParam("password") String pass) 
	{
		ModelAndView mv = null;
		
		if(uname.equals("ABC@gmail.com") && pass.equals("ABC@123")) {
			mv = new ModelAndView("home","USERNAME",uname);
			return mv;
		}
		else {
			mv = new ModelAndView("error","",null);
			return mv;
		}
	}
}