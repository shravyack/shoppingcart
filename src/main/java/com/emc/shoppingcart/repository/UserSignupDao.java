package com.emc.shoppingcart.repository;

import java.util.List;
import java.util.Map;

import com.emc.shopping.model.User;
//import com.way2learnonline.model.Account;

public interface UserSignupDao {
		public void setUser(User u);
	    public User getUser(String emailId);
	    public List<User> findAllUserAccounts();
	    //public List<Map<String, Object>> getAllUsersAsMap();
	    /*public Map<String,Object> getAccountByNumberAsMap(Long accountNumbe);
		public List<Map<String, Object>> getAllAccountsAsMap();
		public String findNameByAccountNumber(Long accountNumber);
		public Account findAccountByNumber(Long accountNUmber) ;
		public List<Account> findAllAccounts() ;
		public void save(Account account) ;
		public void update(Account account);
		public void delete(Account account) ;*/
	
	}
