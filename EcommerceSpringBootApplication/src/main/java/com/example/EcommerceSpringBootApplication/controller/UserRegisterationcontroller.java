package com.example.EcommerceSpringBootApplication.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.EcommerceSpringBootApplication.Services.Userservice;
import com.example.EcommerceSpringBootApplication.web.dto.UserRegisterationdto;

@Controller
@RequestMapping("/REgisteration")
public class UserRegisterationcontroller {

	private Userservice userservice;

	public UserRegisterationcontroller(Userservice userservice) {
		super();
		this.userservice = userservice;
	}
    @GetMapping("/reg")
	public String showRegisteration() {
		return "registeration";
	}
    
    @PostMapping
	public String RegisterUserAccount(@ModelAttribute("user") UserRegisterationdto userregdto) {
		userservice.save(userregdto);
		return "redirect:/registeration?success";
	}
	
}
