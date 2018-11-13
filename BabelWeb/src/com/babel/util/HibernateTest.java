package com.babel.util;

import com.babel.models.Product;
import com.babel.implementation.ProductDaoImp;
public class HibernateTest {

	
	
	public static void main(String[] args) {
		Product prod1 = new Product("testing");
		ProductDaoImp dao = new ProductDaoImp();
		dao.newProduct(prod1);
	}
	
}
