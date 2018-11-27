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
<<<<<<< HEAD
<<<<<<< HEAD
		List<Product> listaGenial = null;
=======
		List<Product> productList = null;
>>>>>>> origin/development/hibernate2
=======
		List<Product> productList = null;
>>>>>>> origin/gwt2.0
		
		Session s = HibernateUtil.sessionFactory.openSession();
		Transaction t = s.beginTransaction();
		String query = "FROM Product";
		
		try {
<<<<<<< HEAD
<<<<<<< HEAD
			listaGenial = s.createQuery(query).getResultList();
=======
			productList = s.createQuery(query).getResultList();
>>>>>>> origin/development/hibernate2
=======
			productList = s.createQuery(query).getResultList();
>>>>>>> origin/gwt2.0
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
<<<<<<< HEAD
<<<<<<< HEAD
		return listaGenial;
		
	}
=======
		return productList;
		
}
>>>>>>> origin/development/hibernate2
=======
		return productList;
		
}
>>>>>>> origin/gwt2.0

}
