package com.babel.implementation;

import java.util.List;

import org.hibernate.Session;

import com.babel.dao.ProductDAO;
import com.babel.models.Product;
import com.babel.util.HibernateUtil;

public class ProductDaoImp implements ProductDAO{

	@Override
	public void newProduct(Product product) {
		// Persist a product
		Session s = null;
		
		try {
			s = HibernateUtil.sessionFactory.openSession();
			s.beginTransaction();
			s.save(product);
			s.getTransaction().commit();
		} catch(Exception ex){
			System.out.println(ex.getMessage());
		} finally {
			if (s!=null) {
				s.close();
			}
		}
	}

	@Override
	public void editProduct(Product product) {
		// update a product
	}

	@Override
	public void deleteProduct(Product product) {
		// delete a product
		
	}

	@Override
	public List<Product> getProducts() {
		// get a list with all the products
		return null;
	}

}
