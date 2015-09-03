package com.emc.shoppingcart;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.emc.shopping.model.User;
import com.emc.shoppingcart.service.RegistrationService;
import com.emc.shoppingcart.service.UserLoginService;

@Controller

public class RegisterController {
	
	@Autowired
	RegistrationService registerService;
	
	
	
	 @RequestMapping(value="/registerUser",method = RequestMethod.GET)
	    public String viewRegistration(Model model) {
	        User userForm = new User();    
	        model.addAttribute("userForm",userForm);
	         /*	        List<String> userList = new ArrayList<String>();
	        userList.add("getFirstName()");
	        userList.add("lastName");
	        userList.add("emailId");
	        userList.add("password");
	        userList.add("address");
	        model.put("professionList", professionList);
	         */
	        return "Registration";
	    }
	     
	    @RequestMapping(method = RequestMethod.POST)
	    public String processRegistration(@ModelAttribute("userForm") @Valid User user, BindingResult result2,
	            Map<String, Object> model) {
	         
	        //  registration logic here...
	    	
	    	registerService.saveUserdetails(user);
	         
	        // for testing purpose:
	        System.out.println("firstname: " + user.getFirstName());
	        System.out.println("lastname: " + user.getLastName());
	        System.out.println("password: " + user.getPassword());
	        System.out.println("email: " + user.getEmailId());
	        System.out.println("email: " + user.getAddress());
	       
	         
	        if(result2.hasErrors())
	        {
	        	return "Registration";
	        }
	        
	        return "UserLanding";
	    }

}
