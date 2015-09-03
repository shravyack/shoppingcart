package com.emc.shoppingcart.repository;

import java.util.List;
import java.util.Map;

import com.emc.shopping.model.Products;
//import com.way2learnonline.model.Account;
	
	
public interface ProductDao {
	
	
	
	//public List<Map<String, Object>> getAllAccountsAsMap();
	//public String findNameByAccountNumber(Long accountNumber);
	//public Account findProductById(Long productId);
	public List<Products> findAllProducts();
	public void saveProduct(Products product);
	//public void updateProduct(Products product);
	//public void delete(Account account) ;
}

