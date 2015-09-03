package com.emc.shoppingcart.repository;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.emc.shopping.model.User;

@Component
public class UserSignupDaoImpl implements UserSignupDao {

	@Autowired
	JdbcTemplate jdbcTemplate;
	
	@Override
	public void setUser(User u) {
		String sql = "insert into users (first_name,last_name,email_id,password,role_id,address) values(?,?,?,?,?,?)";
		jdbcTemplate.update(sql,u.getFirstName(),u.getLastName(),u.getEmailId(),u.getPassword(),2,u.getAddress());
		System.out.println("User Account Created");
		
	}

	@Override
	public User getUser(String emailId) {
		User user;
		String sql="select * from users where email_id=?";
		user=jdbcTemplate.queryForObject(sql, new Object[]{emailId},new BeanPropertyRowMapper<User>(User.class));
		System.out.println(user.getEmailId());
		
	      return user;
		/*if(user!=null)
		
		{
				
		//String sql1="select * from users where first_name=?";
		//user=jdbcTemplate.queryForObject(sql1, new Object[]{username,password},new BeanPropertyRowMapper<User>(User.class));
		//System.out.println(user.getEmailId()); commented now
		return user;
		}
		else
			System.out.println("no such user");
		    return user;
		*/
	}
	
	/*public List<Map<String, Object>> getAllUsersAsMap() {
		String query="select a.first_name,a.last_name,a.email_id,"
				+ " a.password,a.role_id,a.address from account a  ";
		
		return jdbcTemplate.queryForList(query);
	}*/
	
	public List<User> findAllUserAccounts() {
		String query="select u.first_name,u.last_name,u.email_id from users u where u.role_id = 2";
			
		
		return jdbcTemplate.query(query, new BeanPropertyRowMapper<User>(User.class));	
		
	}
		

	
}




