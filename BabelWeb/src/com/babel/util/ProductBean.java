package com.babel.util;

import com.babel.models.Product;

import java.util.List;

import com.babel.dao.ProductDAO;
import com.babel.implementation.ProductDaoImp;

public class ProductBean {

	private List<Product> prodList;
	private Product product;
	

	public ProductBean() {
		this.product = new Product();
	}
	
	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public void newProduct(Product product) {
		ProductDAO dao = new ProductDaoImp();
		dao.newProduct(product);
	}

	public void editProduct(Product product) {
		ProductDAO dao = new ProductDaoImp();
		dao.editProduct(product);
	}

	public void deleteProduct(Product product) {
		ProductDAO dao = new ProductDaoImp();
		dao.deleteProduct(product);
	}

	public List<Product> getProdList() {
		ProductDAO dao = new ProductDaoImp();
		prodList = dao.getProducts();
		return prodList;
	}
}
