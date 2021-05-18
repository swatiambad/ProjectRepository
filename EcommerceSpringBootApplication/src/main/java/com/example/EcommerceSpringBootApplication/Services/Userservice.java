package com.example.EcommerceSpringBootApplication.Services;

import com.example.EcommerceSpringBootApplication.model.User;
import com.example.EcommerceSpringBootApplication.web.dto.UserRegisterationdto;

public interface Userservice{
	
  User save(UserRegisterationdto userregdto);
}
