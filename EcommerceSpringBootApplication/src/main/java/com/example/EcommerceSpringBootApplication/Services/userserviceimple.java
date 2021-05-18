package com.example.EcommerceSpringBootApplication.Services;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.EcommerceSpringBootApplication.model.Role;
import com.example.EcommerceSpringBootApplication.model.User;
import com.example.EcommerceSpringBootApplication.repository.userrepository;
import com.example.EcommerceSpringBootApplication.web.dto.UserRegisterationdto;

@Service
public class userserviceimple implements Userservice{
    
	@Autowired
	 private userrepository repo;
	 
	

	public userserviceimple(userrepository repo) {
		super();
		this.repo = repo;
	}



	@Override
	public User save(UserRegisterationdto reguser) {
		User user=new User(
				null, reguser.getFirstname(),
				reguser.getLastname(),
				reguser.getPassword(),
				reguser.getEmail(),
				Arrays.asList(new Role("Role_user")));
		// TODO Auto-generated method stub
		return  repo.save(user);
	}



	
		/*
		 * User user=new User( userregdto. userregdto.getFirstname(),
		 * userregdto.getLastname(), userregdto.getEmail(), userregdto.getPassword(),
		 * Arrays.asList(new Role("Role_user"))) ;
		 */
				
	
	
}
