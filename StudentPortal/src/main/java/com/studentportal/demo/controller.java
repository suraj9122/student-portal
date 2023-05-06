package com.studentportal.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class controller {
	@RequestMapping("login")
		public String showlogin(@ModelAttribute Register rg, Model model){
		System.out.print(rg);
		
		return("login");
	}
	@RequestMapping("userdetails")
	public String handleForm(@ModelAttribute user us, Model model) {
		 
		String a=us.getId();
		System.out.print(a);
		Integer b=12;
		if (a.equals(b.toString()))		
		return("userdetails");
		else;
			return("login");
	}
	@RequestMapping("register")
public String registeruser() {
						
	return("register");
}
 
	}
 

	