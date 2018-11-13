package com.babel.dao;

import java.util.List;

import com.babel.models.Product;

public interface ProductDAO {
	
	public void newProduct(Product product);
	public void editProduct(Product product);
	public void deleteProduct(Product product);
	public List<Product> getProducts();
	

}
