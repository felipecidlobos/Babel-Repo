package com.babel.beans;

import java.util.List;

import com.babel.dao.ProductDAO;
import com.babel.implementation.ProductDaoImp;
import com.babel.models.Product;
import com.babel.repository.ProductRepository;

public class ProductBean {
	private Product product;
	
	private List<Product> listProduct;
	public ProductBean() {
		
	}
	
	public Product getProduct() {
		return product;
	}
	public void setProduct(Product product) {
		this.product = product;
	}
	
	public List<Product> getListProduct() {
		ProductDAO productDao = new ProductDaoImp();
		listProduct = productDao.getProducts();
		return listProduct;
	}
	
	public void setListProduct(List<Product> listProduct) {
		this.listProduct = listProduct;
	}
	
	public void addProduct() {
		/*ProductRepository productRepo = new ProductRepository();
		productRepo.newProduct(product);
		;*/
		ProductDAO productDao = new ProductDaoImp();
		productDao.newProduct(product);		
		this.product = new Product();
		
	}
	public void editProduct() {
		ProductRepository productRepo = new ProductRepository();
		productRepo.editProduct(product);
		this.product = new Product();
	}
	public void deleteProduct() {
		ProductRepository productRepo = new ProductRepository();
		productRepo.deleteProduct(product);
		this.product = new Product();
	}
	

}
