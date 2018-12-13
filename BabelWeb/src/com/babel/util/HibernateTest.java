package com.babel.util;

import com.babel.models.Product;
import com.babel.implementation.ProductDaoImp;
public class HibernateTest {

	
	
	public static void main(String[] args) {
		ProductDaoImp dao = new ProductDaoImp();
		/*
		Product prod1 = new Product("testing");
		dao.newProduct(prod1);
		*/
		System.out.println(dao.getProducts().toString());
		
		System.exit(0);
	}
	
}
