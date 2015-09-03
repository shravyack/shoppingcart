package com.emc.shoppingcart.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.emc.shopping.model.User;
import com.emc.shoppingcart.repository.UserSignupDaoImpl;

@Component
public class RegistrationService {
	
	@Autowired
	UserSignupDaoImpl userSignup;
	
	public void saveUserdetails(User u){
		System.out.println("storing!");
		userSignup.setUser(u);
		System.out.println("User details stored!");
		
	}
	
	
	
	

}
