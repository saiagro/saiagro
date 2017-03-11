package com.erudex.akshara.dao;

import java.util.List;

import com.erudex.akshara.model.Product;


public interface ProductDao {
	public void addProduct(Product product);
	public List<Product> listProducts();
	public Product getProduct(int product_id);
	public void deleteProduct(int product_id);	
}
