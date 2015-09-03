package com.emc.shoppingcart.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import com.emc.shopping.model.Products;
//import com.way2learnonline.model.Account;
//import com.way2learnonline.model.Account;


public class ProductDaoImpl implements ProductDao {
    @Autowired
	JdbcTemplate jdbcTemplate;
    
    public List<Products> findAllProducts() {
    	String sql="select p.prod_id,p.name,p.price,p.quantity from products p";
		return jdbcTemplate.query(sql, new BeanPropertyRowMapper<Products>(Products.class));	
    	
    }
	
	public void saveProduct(Products product) {
		String sql1 = "insert into products (prod_id,prod_name,price,quantity) values(?,?,?,?)";
		jdbcTemplate.update(sql1,product.getProdId(),product.getProdName(),product.getPrice(),product.getQuantity());
		System.out.println("New product added");
		
	}
	/*public void updateProduct(Products product) {
		String sql2="update products set prod_id=?,prod_name=?,price=?,quantity=?";
				
		jdbcTemplate.update(sql2,product.getProdId(),product.getProdName(),product.getPrice(),product.getQuantity());
		
		System.out.println("Product details updated");
		
	}*/
	
	/*public Products findProductById(Long productId) {
		String sql3 = "select p.prod_id,p.prod_name,p.price,p.quantity from products p where p.prod_id = ?";
					
		
		Products product = jdbcTemplate.queryForObject(sql3,new Object[]{productId},
				new BeanPropertyRowMapper<Products>(Products.class));
		
		return product;

	}
*/	
	
	
	
	
	
}
