package abstractFactoryPattern.productDao.mysql;
import java.util.ArrayList;

import abstractFactoryPattern.productDao.ProductDao;
import abstractFactoryPattern.Product;

public class ProductMySqlDao implements ProductDao{
	ArrayList<Product> list = new ArrayList<>();

	@Override
	public void insertProduct(Product userInfo) {
		Product newProductInfo = new Product();

		newProductInfo.setProductId(userInfo.getProductId());
		newProductInfo.setProductName(userInfo.getProductName());

		list.add(newProductInfo);
        System.out.println("==Product Mysql insertProduct==");
	}
	
	@Override
	public void updateProduct(Product product) {
		for (Product productInfo: list) {
			if (productInfo.getProductId().equals(product.getProductId())) {
		        productInfo.setProductName(product.getProductName());
			}
		}
        System.out.println("==Product Mysql updateProduct==");
	}
	
	@Override
	public void deleteProduct(Product product) {
		for (Product productInfo: list) {
			if (productInfo.getProductId().equals(product.getProductId())) {
				list.remove(productInfo);
				break;
			}
		}
        System.out.println("==Product Mysql deleteProduct==");
	}
}
