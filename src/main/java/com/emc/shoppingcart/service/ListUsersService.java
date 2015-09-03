package com.emc.shoppingcart.service;

import java.util.List;

import org.springframework.stereotype.Component;

import com.emc.shopping.model.User;
import com.emc.shoppingcart.repository.UserSignupDaoImpl;
@Component
public class ListUsersService {
	
	UserSignupDaoImpl userSignupDaoImpl=new UserSignupDaoImpl();

		public List<User> findAllUserAccounts() {
				List<User> userList = userSignupDaoImpl.findAllUserAccounts();
				//System.out.println("Service Completed: "+productList.size()+" products retrieved");
				
				User u=userList.get(2);
				System.out.println(u.getFirstName() + u.getLastName());
				
				return userList;
				
				
			} 

	
}
