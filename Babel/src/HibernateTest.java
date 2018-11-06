

import com.babel.models.Product;
import com.babel.implementation.ProductDaoImp;
public class HibernateTest {

	Product prod1 = new Product("testing");
	ProductDaoImp dao = new ProductDaoImp();
	
	public void main(String args[]) {
		dao.newProduct(prod1);
	}
	
}
