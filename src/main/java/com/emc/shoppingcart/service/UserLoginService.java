package com.emc.shoppingcart.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.stereotype.Component;

import com.emc.shopping.model.User;
import com.emc.shopping.model.UserLogin;
import com.emc.shoppingcart.repository.UserSignupDaoImpl;
@Component
public class UserLoginService{
	
	@Autowired
	public UserSignupDaoImpl userSignup;
	
	
	public String userExists(String emailId, String password) {
		        
		        
				User user;
				user=userSignup.getUser(emailId); 
				System.out.println(user.getFirstName());
				if(user.getPassword().equals(password))
				{
					
					int uid=user.getRoleId();
					if(uid==1){
						
						return "admin";
					}
					else 
					{
						return "user";
					
					}
				}
				else
                      return null;
				
			
			
				
				
			} 


	}
	
	
	
	
	
	
	
	
		
	
	

