package com.babel.implementation;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

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
		Session s = null;
		
		try {
			s = HibernateUtil.sessionFactory.openSession();
			s.beginTransaction();
			s.update(product);
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
	public void deleteProduct(Product product) {
		// delete a product
		Session s = null;
		
		try {
			s = HibernateUtil.sessionFactory.openSession();
			s.beginTransaction();
			s.delete(product);
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
	public List<Product> getProducts() {
		// get a list with all the products
		List<Product> listaGenial = null;
		
		Session s = HibernateUtil.sessionFactory.openSession();
		Transaction t = s.beginTransaction();
		String query = "FROM Product";
		
		try {
			listaGenial = s.createQuery(query).getResultList();
			t.commit();
			s.close();
		} catch(Exception ex){
			System.out.println(ex.getMessage());
			t.rollback();
		} finally {
			if (s!=null) {
				s.close();
			}
		}
		return listaGenial;
		
	}

}
