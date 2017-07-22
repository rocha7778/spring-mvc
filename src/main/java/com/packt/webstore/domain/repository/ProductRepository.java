package com.packt.webstore.domain.repository;

import java.util.List;
import java.util.Map;

import com.packt.webstore.domain.Product;

public interface ProductRepository {
	public List <Product> getAllProducts();
	public void updateStock(String productId, long noOfUnits);
	public List <Product> getProductsByCategori(String categori);
	public List <Product> getProductsByFilter(Map<String,List<String>> filterParam);
	public Product getProductsById(String id);
	public List<Product> filterProduct(String categori, Map<String,String> lowAndHidPrice, String brand);
	public void addProduct(Product product);
	

}
