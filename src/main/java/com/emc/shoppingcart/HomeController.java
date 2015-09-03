package com.emc.shoppingcart;

import java.awt.List;
//import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Map;

import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.emc.shopping.model.User;
import com.emc.shopping.model.UserLogin;
import com.emc.shoppingcart.service.ListUsersService;
//import com.emc.shoppingcart.repository.User_dao;
import com.emc.shoppingcart.service.UserLoginService;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	
	@Autowired
	UserLoginService userLogin;
	@Autowired
	ListUsersService listuser;
	
	
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);
		
		/**Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		
		model.addAttribute("serverTime", formattedDate );
		try{
		User user=userDao.getUser("admin","12345");
		//System.out.println(user.toString());
		if(user != null)
		model.addAttribute(user);
		else
			System.out.println("not a user");
		}catch(Exception e){
			model.addAttribute("error", "not a user");
		}**/
		
		UserLogin user=new UserLogin();
		model.addAttribute("loginForm", user);
		//listuser.findAllUserAccounts();
		return "userLogin";
		
		
	}
	
	
	@RequestMapping(value = "/userLoginSubmit", method = RequestMethod.POST)
	public String userLogin(@ModelAttribute("loginForm") @Valid UserLogin user,BindingResult Result, Model model) {
		//System.out.println(user.getEmailId());
		if(Result.hasErrors()){
			return "userLogin";
		}
			else
			{
				String str;
				
					str = userLogin.userExists(user.getEmailId(),user.getPassword());
					if(str.equals("admin"))
						return "AdminLanding";
						
						else if(str.equals("user"))
						
						return "UserLanding";
						
						else
							return "userLogin";
						
					
	}
		
	
  }
	@RequestMapping(value = "/AdminLanding", method = RequestMethod.POST)
	public String userLogin(@ModelAttribute("adminList") User user, Model mohit) {
		//System.out.println(user.getEmailId());
		Map<String,Object> data=listuser.users(user.getFirstName(), user.getLastName(),user.getEmailId()); 
		
		return "";
					
	}
}
	
	
	


