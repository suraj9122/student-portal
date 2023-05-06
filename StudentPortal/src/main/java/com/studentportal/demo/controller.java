package com.studentportal.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class controller {
	@RequestMapping("login")
		public String showlogin(@ModelAttribute user us, Model model){
		
		return("login");
	}
	@RequestMapping("userdata")
	public String handleForm(@ModelAttribute user us, Model model) {
		
		
		System.out.print(us);
	return("login");
	}
	@RequestMapping("register")
public String registeruser(@ModelAttribute Register rg, Model model) {
						System.out.print(rg);
	return("register");
}
 
	}
 

	