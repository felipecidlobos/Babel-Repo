import com.babel.models.Product;
import com.babel.implementation.ProductDaoImp;

public class ProductRepository {

	ProductDaoImp dao = new ProductDaoImp();

	public void newProduct(Product product) {
		dao.newProduct(product);
	}

	public void editProduct(Product product) {
		dao.editProduct(productid, description, nprice, unidadmedida);
	}

	public void deleteProduct(Product product) {
		dao.deleteProduct(product);
	}

	public List<Product> getProducts() {
		dao.getProducts();
	}
}
